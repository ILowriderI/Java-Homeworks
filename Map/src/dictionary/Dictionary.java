package dictionary;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
 private Map<String, String> dictionaryData = new HashMap <> ();
 private String translate;
public Dictionary(Map<String, String> dictionaryData, String translate) {
	super();
	this.dictionaryData = dictionaryData;
	this.translate = translate;
}
public Dictionary() {
	super();
	
}


public Map<String, String> getDictionaryData() {
	return dictionaryData;
}


public Map<String, String> setDictionaryData(String key, String value) {
	this.dictionaryData.put(key, value);
	//System.out.println(dictionaryData);
	return dictionaryData;
}

public String getTextFromFile(File file) {
	String textEnglish = " ";
	try (Scanner sc = new Scanner(file)) {
		for (; sc.hasNextLine();) {
			textEnglish += sc.nextLine();
		}
		sc.hasNextLine();
	} catch (IOException e) {
		e.printStackTrace();
	}
	return textEnglish;
}

public void textToFile(String text) {
	File file = new File("Ukrainian.out.txt");
	try (PrintWriter pw = new PrintWriter(file)) {
		pw.print(text);
	} catch (IOException e) {
		e.printStackTrace();
	}
}


public String getTranslate(File file) {
	getDictionaryData();
	String[] textEng = getTextFromFile(file).split(" ");
	translate = "";
	for (String word : textEng) {
		if (dictionaryData.containsKey(word)) {
			translate += dictionaryData.get(word) + " ";
		} else {
			translate += "(unknown word)";
		}
		
	}
	return translate;
}




public void dictionaryDataFromScanner() {
	String key;
	String value;
	Scanner sc = new Scanner(System.in);
	File file = new File("DictionaryData.txt");
	for(;;) {
		
		System.out.println("input word in english");
		key = sc.nextLine(); 
		System.out.println("input word in ukrainian");
		value=sc.nextLine(); 
		setDictionaryData(key,value);
			
		System.out.println("do you want to add one more word(y/n)");
		if(sc.nextLine().equals("n")) {
		break;	
		}
		
	}
	System.out.println("do you want to save this dictionary to file (y/n)");
	if(sc.nextLine().equals("y")) {
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.print(dictionaryData);
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		
	
}


 
}
