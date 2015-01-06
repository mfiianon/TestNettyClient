package com.xing.netty.client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TimeClientHandler extends SimpleChannelInboundHandler<Object> {

	private int counter;

	private int successCount;

	private byte[] req;

	public TimeClientHandler() {
		ByteBuf byteBuf = Unpooled.buffer(1024);
		Unpooled.compositeBuffer();
		req = ("QUERY TIME ORDER" + System.getProperty("line.separator")).getBytes();
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		String body = (String) msg;
		System.out.println("Now is " + body + ";the counter is:" + ++counter);
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		ByteBuf message = null;
		for (int i = 0; i < 10; i++) {
			System.out.println("channelActive " + i);
			req = ("QUERY TIME ORDER" + "$_").getBytes();
			message = Unpooled.buffer(req.length);
			message.writeBytes(req);
			ChannelFuture future = ctx.writeAndFlush(message);
			future.addListener(new ChannelFutureListener() {

				@Override
				public void operationComplete(ChannelFuture future) throws Exception {
					if (future.isSuccess()) {
						System.out.println("future succeed:" + ++successCount);
					} else {
						System.out.println("failed");
						// future.cause().printStackTrace();
						// future.channel().close();
					}
				}

			});
		}
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		ctx.flush();
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		System.out.println("client exceptionCaught..." + cause);
		ctx.close();
	}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object message) throws Exception {

	}

}
