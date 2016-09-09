package com.cn.solomon.tools.spoon;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 转换器连接线
 * @author davy 
 *
 */
@XStreamAlias("hop") 
public class Hop {

	private String from;
	private String to;
	private String enabled;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String buildXml() {
		return "<hop><from>" + getFrom() + "</from><to>" + getTo() + "</to><enabled>" + getEnabled()
				+ "</enabled> </hop>";
	}
}
