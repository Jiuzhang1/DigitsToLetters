package com.numberstoletters.ut.service;

import java.util.List;

public interface  NumbersToLettersService {
	public List<String> containLetters(String digits);
	public String group(String[] arr, int startStr, String str, List<String> strings);
}
