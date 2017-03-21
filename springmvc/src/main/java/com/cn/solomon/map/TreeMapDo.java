package com.cn.solomon.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeMapDo {

	public static void main(String[] args) {
		List<String> lis = new ArrayList<String>();
		
		for(int i=0 ;i<10;i++){
			lis.add(""+i) ;
		}
		Map<String,List<String>> m = new HashMap<String,List<String>>() ;
		
		
		for(int i=0 ;i<10;i++){
			m.put(""+i, lis);
		}
		for(String key:m.keySet()){
			System.out.println("key:"+key+"<>"+m.get(key).get(0));
		}
	}
}
