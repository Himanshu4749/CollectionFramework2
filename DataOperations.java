/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collectionframework2;
import java.util.ArrayList;
import java.io.FileNotFoundException;
/**
 *
 * @author Lenovo
 */
public class DataOperations {
    public static String removeSymbols(String inputString) throws FileNotFoundException{
        ArrayList<Character>symbolList=FileOperations.getSymbolsList("C:\\Collection\\symbol.txt");
        ArrayList<Character>inputList=new ArrayList<>();
        char inputChar[]= inputString.toCharArray();
        for(char string:inputChar){
            inputList.add(string);
        }
        inputList.removeAll(symbolList);
        inputString="";
        for (char string : inputChar) {
            inputList.add(string);
        }
        inputList.removeAll(symbolList);

        inputString = "";

        for (Character character : inputList) {
            inputString = inputString + String.valueOf(character);
        }
        return inputString;
    }

public static ArrayList<String> removeStopwords(String inputString) throws FileNotFoundException{
ArrayList<String>inputList = FileOperations.getWordList(inputString);
ArrayList<String> stopwords=FileOperations.getStopwordFile("C:\\Collection\\stopwords.txt");
stopwords.add("");
inputList.removeAll(stopwords);
return inputList;
}
}



