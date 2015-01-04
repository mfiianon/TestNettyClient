package com.xing.netty.client;

/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.DefaultEventExecutorGroup;
import io.netty.util.concurrent.EventExecutorGroup;

/**
 * Keeps sending random data to the specified address.
 */
public final class DiscardClient {

	static final boolean SSL = System.getProperty("ssl") != null;
	static final String HOST = System.getProperty("host", "127.0.0.1");
	static final int PORT = Integer
			.parseInt(System.getProperty("port", "8009"));
	static final int SIZE = Integer.parseInt(System.getProperty("size", "256"));

	public static void main(String[] args) throws Exception {
		// Configure SSL.
		final SslContext sslCtx;
		if (SSL) {
			sslCtx = SslContext
					.newClientContext(InsecureTrustManagerFactory.INSTANCE);
		} else {
			sslCtx = null;
		}

		EventLoopGroup group = new NioEventLoopGroup();
		try {
			Bootstrap b = new Bootstrap();
			b.group(group).channel(NioSocketChannel.class)
					.handler(new ChannelInitializer<Channel>() {

						@Override
						protected void initChannel(Channel ch) throws Exception {
							ChannelPipeline p = ch.pipeline();
							if (sslCtx != null) {
								p.addLast(sslCtx.newHandler(ch.alloc(), HOST,
										PORT));
							}
							p.addLast(new DiscardClientHandler());
						}
					});
			// Make the connection attempt.
			ChannelFuture f = b.connect(HOST, PORT).sync();
			f.addListener(new ChannelFutureListener() {
				
				@Override
				public void operationComplete(ChannelFuture f) throws Exception {
					System.out.println(f.isDone() +" "+ f.isSuccess());
				}
			});
			
			EventExecutorGroup eventExecutorGroup = new DefaultEventExecutorGroup(16);
			
			AttributeKey<Integer> key = new AttributeKey<Integer>("test Attribute");
			String name = key.name();
			
			// Wait until the connection is closed.
			f.channel().closeFuture().sync();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			group.shutdownGracefully();
		}
	}
}