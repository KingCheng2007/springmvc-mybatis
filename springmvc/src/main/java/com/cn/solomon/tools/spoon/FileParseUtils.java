package com.cn.solomon.tools.spoon;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.http.client.utils.DateUtils;

public class FileParseUtils {

	public static void main(String[] args) {
		File f = new File("F:\\SQL语句\\ewininfoSql总结.txt");
		boolean isD = f.isDirectory();
		Date d = new Date(f.lastModified());
		String c = DateUtils.PATTERN_RFC1123;
		String dStr = DateUtils.formatDate(d,"yyyyMMdd hh:mm:ss");
		System.out.println(dStr);
		System.out.println(DateUtils.formatDate(d,c));
				
		
	}
}
