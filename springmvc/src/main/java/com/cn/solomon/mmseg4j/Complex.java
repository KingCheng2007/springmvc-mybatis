package com.cn.solomon.mmseg4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

import com.chenlb.mmseg4j.ComplexSeg;
import com.chenlb.mmseg4j.Dictionary;
import com.chenlb.mmseg4j.MMSeg;
import com.chenlb.mmseg4j.Seg;
import com.chenlb.mmseg4j.Word;

/**
 * 分词复杂例子
 * @author solomon
 * @Date 2016-04-06 20:44:16
 *
 */
public class Complex {

	protected Dictionary dic;
	
	public Complex() {
		dic = Dictionary.getInstance();
	}

	protected Seg getSeg() {
		return new ComplexSeg(dic);
	}
	
	public String segWords(Reader input, String wordSpilt) throws IOException {
		StringBuilder sb = new StringBuilder();
		Seg seg = getSeg();	//取得不同的分词具体算法
		MMSeg mmSeg = new MMSeg(input, seg);
		Word word = null;
		boolean first = true;
		while((word=mmSeg.next())!=null) {
			if(!first) {
				sb.append(wordSpilt);
			}
			String w = word.getString();
			sb.append(w);
			first = false;
			
		}
		return sb.toString();
	}
	
	public String segWords(String txt, String wordSpilt) throws IOException {
		return segWords(new StringReader(txt), wordSpilt);
	}
	
	private void printlnHelp() {
		System.out.println("\n\t-- 说明: 结束");
        System.out.print("\nmmseg4j-"+this.getClass().getSimpleName().toLowerCase()+">");
	}
	
	protected void splitWord(String txt,boolean useSystemIn) throws IOException {
		System.out.println(segWords(txt, " | "));
		printlnHelp();
		String inputStr = null;
		if(useSystemIn){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while((inputStr = br.readLine()) != null) {
				if(inputStr.equals("QUIT") || inputStr.equals("EXIT")) {
					System.exit(0);
				} else if("".equals(inputStr)) {
					printlnHelp();
				} else {
					System.out.println(segWords(inputStr, " | "));    //分词
					System.out.print("\nmmseg4j-"+this.getClass().getSimpleName().toLowerCase()+">");
				}
			}
		}
	}
	
	protected void splitSimpleWord(String txt) throws IOException{
		splitWord(txt,false);
	}
	
	private String[] splitStrs(String words){
		String split = "#KKK#";
		String[] strings={};
		try {
			String s = segWords(words, split);
			strings = s.split(split);
		} catch (IOException e) {
			strings[0] = words;
			return strings;
		}
		return strings;
	}
	
	public static void main(String[] args) throws IOException {
		String words = "我的名字叫做毛泽东";
		String[] aStrings =  new Complex().splitStrs(words);
		for(String tmp:aStrings){
			System.out.println(tmp);
		}
	}

}