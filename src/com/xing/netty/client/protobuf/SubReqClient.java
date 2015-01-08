package com.xing.netty.client.protobuf;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;

import com.xing.netty.interfaces.SubscribeRespProto;

public class SubReqClient {

	public void connect(String host, int port) throws Exception {
		EventLoopGroup group = new NioEventLoopGroup();
		try {
			Bootstrap b = new Bootstrap();
			b.group(group).channel(NioSocketChannel.class).option(ChannelOption.TCP_NODELAY, true)
					.handler(new ChannelInitializer<Channel>() {

						@Override
						protected void initChannel(Channel ch) throws Exception {
							ChannelPipeline p = ch.pipeline();
							p.addLast(new ProtobufVarint32FrameDecoder());
							p.addLast(new ProtobufDecoder(SubscribeRespProto.SubscribeResp.getDefaultInstance()));
							p.addLast(new ProtobufVarint32LengthFieldPrepender());
							p.addLast(new ProtobufEncoder());
							p.addLast(new SubReqClientHandler());
						}
					});
			// Make the connection attempt.
			ChannelFuture f = b.connect(host, port).sync();

			// Wait until the connection is closed.
			f.channel().closeFuture().sync();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			group.shutdownGracefully();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		new SubReqClient().connect("127.0.0.1", 8009);
	}

}
