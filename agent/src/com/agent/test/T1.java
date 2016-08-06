package com.agent.test;

public class T1 {
	public static void main(String[] args) {
		String responce = 
				"<xml>"+
					"<ToUserName><![CDATA[%s]]></ToUserName>"+
					"<FromUserName><![CDATA[%s]]></FromUserName>"+
					"<CreateTime>%s</CreateTime>"+
					"<MsgType><![CDATA[%s]]></MsgType>"+
					"<Content><![CDATA[%s]]></Content>"+
					"<FuncFlag>0</FuncFlag>"+
				"</xml>"; 
		String x =String.format(responce, "agent", "micky", "100021", "text", "test...");
		System.out.println(x);
	}
}
