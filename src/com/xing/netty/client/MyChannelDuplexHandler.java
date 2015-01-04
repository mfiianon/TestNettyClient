package com.xing.netty.client;

import io.netty.channel.ChannelDuplexHandler;
import io.netty.util.AttributeKey;

public class MyChannelDuplexHandler extends ChannelDuplexHandler{

	AttributeKey<Integer> key = new AttributeKey<>("");
}
