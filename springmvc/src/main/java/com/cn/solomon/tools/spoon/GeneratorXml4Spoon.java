package com.cn.solomon.tools.spoon;

import java.util.LinkedList;

import com.thoughtworks.xstream.XStream;

/**
 * @author Davy 生成XML文件
 *
 */
public class GeneratorXml4Spoon {

	public static void main(String[] args) {
		Order o = new Order();
		Hop h = new Hop();
		h.setFrom("TO_PP_ORDER订单表");
		h.setTo("插入 &#47; 更新 TO_PP_ORDER");
		h.setEnabled("Y");
		LinkedList<Hop> linkHop = new LinkedList<Hop>() ;
		linkHop.push(h);
		Hop h2 = new Hop();
		h2.setFrom("TO_PP_ORDER订单表");
		h2.setTo("插入 &#47; 更新 TO_PP_ORDER");
		h2.setEnabled("Y");
		linkHop.push(h2);
		o.setHops(linkHop);
		XStream xStream = new XStream();
		xStream.autodetectAnnotations(true);
		String xml = xStream.toXML(o);
		System.out.println(xml);
	}
}
