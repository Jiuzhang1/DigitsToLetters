package com.numberstoletters.ut.test;

import java.util.Scanner;

import org.junit.Test;

import com.numberstoletters.ut.service.impl.NumbersToLettersImpl;
/**
 * The test case:The digits to numbers;
 * 
 * @author chenguizhi
 * @date 2020-12-13
 */
public class NumbersToLettersTest {
	/* Test method */
	@Test
	public void NumbersToLettersTest() {
		System.out.println("Please enter a digit of 0-9:");
		/* Input key numbers 1-9 */
        String digits=new String();
        Scanner in = new Scanner(System.in);
		/* The monitor enters the correct number on the keyboard */
        while(true){
            digits=in.next();
            if(!digits.matches("[0-9]{1,2}")){
                System.out.println("Illegal input! You can only enter numbers from 0 to 99. Please re-enter:");
            }else{
                break;
            }
        }
		/* Call service object */
        NumbersToLettersImpl test = new NumbersToLettersImpl();
		/* Output test results */
	    System.out.println(test.containLetters(digits));
	}
}
