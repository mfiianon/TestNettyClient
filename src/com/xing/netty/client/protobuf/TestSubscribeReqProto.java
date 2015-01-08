package com.xing.netty.client.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.xing.netty.interfaces.SubscribeReqProto;
import com.xing.netty.interfaces.SubscribeReqProto.SubscribeReq;

public class TestSubscribeReqProto {

	/**
	 * @param args
	 * @throws InvalidProtocolBufferException
	 */
	public static void main(String[] args) throws InvalidProtocolBufferException {
		SubscribeReq req = createSubscribeReq();
		System.out.println("Before encode:" + req.toString());
		SubscribeReqProto.SubscribeReq req2 = decode(encode(req));
		System.out.println("after decode:" + req.toString());
		System.out.println("Assert equal:" + req2.equals(req));
	}

	private static SubscribeReqProto.SubscribeReq createSubscribeReq() {
		SubscribeReqProto.SubscribeReq.Builder builder = SubscribeReqProto.SubscribeReq.newBuilder();
		builder.setSubReqID(1);
		builder.setUserName("Lilinfeng");
		builder.setProduceName("netty book");
		builder.setAddress("南京市雨花区");
		return builder.build();
	}

	private static byte[] encode(SubscribeReqProto.SubscribeReq req) {
		return req.toByteArray();
	}

	private static SubscribeReqProto.SubscribeReq decode(byte[] data) throws InvalidProtocolBufferException {
		return SubscribeReqProto.SubscribeReq.parseFrom(data);
	}

}
