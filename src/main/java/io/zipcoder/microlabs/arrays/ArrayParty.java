package io.zipcoder.microlabs.arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayParty {

    public String printArray(String[] inputArray){
        String output = "*** Output ***";
        for (String word :
                inputArray) {
            output += "\n" + word;
        }
        return output;
    }

    public String lastElement(String[] inputArray){
        String output = "*** Output ***";
        output+="\n"+inputArray[inputArray.length-1];
        return output;
    }

    //TODO Define the method lastButOne
    public String lastButOne(String[] inputArray){
        String output = "*** Output ***";
        output+="\n"+inputArray[inputArray.length-2];
        return output;
    }

    //TODO Define the method reverse
    public String reverse(String[] inputArray){
        Collections.reverse(Arrays.asList(inputArray));
        String output = "*** Output ***";
        for (String word :
                inputArray) {
            output += "\n" + word;
        }
        return output;
    }

    //TODO Define the method isPalindrome
    public boolean isPalindrome(String[] inputArray) {
        return printArray(inputArray).equals(reverse(inputArray));
    }

    //TODO Define the method compress
    public String compress(int[] inputArray){
        String outputString = "*** Output ***\n"+inputArray[0];
        for (int i = 1; i < inputArray.length; i++){
            if (inputArray[i] != inputArray[i-1]){
                outputString += "\n"+inputArray[i];
            }
        }
        return outputString;
    }

    //TODO Define the method pack
    public String pack(char[] letters){
        String outputString = "*** Output ***\n"+letters[0];
        for (int i = 1; i < letters.length; i++){
            if(letters[i] == letters[i-1]){
                outputString += letters[i];
            } else {
                outputString += ", "+letters[i];
            }
        }
        return outputString;
    }
}
