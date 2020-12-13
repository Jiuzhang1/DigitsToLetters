package com.numberstoletters.ut.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.numberstoletters.ut.service.NumbersToLettersService;

public class NumbersToLettersImpl implements NumbersToLettersService {
	/**
     * The digits contain letters
     * 
     * @param digits 
     * @return strings(The array of character string!)
     */
	public List<String> containLetters(String digits) {
		// TODO Auto-generated method stub
		List<String> strings = new ArrayList<>();
        if (digits.length() == 0) {
            return strings;
        }
        String[] dict = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		/* Selected letter combination */
        String[] arr = new String[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            arr[i] = dict[digits.charAt(i) - '0' - 2];
        }
		int startStr = 0;/* loop index */
        group(arr, startStr, "",strings);
        return strings;
	}
	/**
     * 修改项目阶段运行数据
     * 
     * @param arr(String array), startStr(loop index), str, strings(input string)
     * @return strings(The array of character string!)
     */
	public String group(String[] arr, int startStr, String str, List<String> strings) {
		// TODO Auto-generated method stub
		char[] chars1 = arr[startStr].toCharArray();
        for (int j = 0; j < chars1.length; j++) {
            if (startStr == arr.length - 1) {
                strings.add(str + chars1[j]);
            } else {
				/*
				 * startStr+1:Traverses the next character combination;
				 * str +chars1[j]:Concatenates the characters currently traversed;
				 */
                group(arr, startStr+1, str + chars1[j],strings);
            }
        }
        return str;
	}

}
