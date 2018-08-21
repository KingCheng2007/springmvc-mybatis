package com.cn.solomon.dp.filter;

public class Main {

	public static void main(String[] args) {
		String msg = "大家好 =,= <script> 敏感，被就业，网络环境很好。";
		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		String result = mp.process();
		System.out.println(result);

	}

}
