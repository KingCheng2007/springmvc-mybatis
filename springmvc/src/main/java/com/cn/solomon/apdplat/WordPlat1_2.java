package com.cn.solomon.apdplat;

import java.util.List;

import org.apdplat.word.WordSegmenter;
import org.apdplat.word.segmentation.Word;


public class WordPlat1_2 {

	public static void main(String[] args) {
		List<Word> words = WordSegmenter.segWithStopWords("杨尚川是APDPlat应用级产品开发平台的作者");
		System.out.println(words);
	}
}
