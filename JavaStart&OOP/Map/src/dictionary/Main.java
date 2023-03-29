package dictionary;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		Dictionary myDictionary = new Dictionary();
		
		
		myDictionary.setDictionaryData("cherry", "вишневий");
		myDictionary.setDictionaryData("orchard", "садок");
		myDictionary.setDictionaryData("by", "біля");
		myDictionary.setDictionaryData("house", "хати");
		myDictionary.dictionaryDataFromScanner();

		
		
		File fileEng = new File("English.in.txt");
		
		
		 try(PrintWriter pw = new PrintWriter(fileEng)){
	            pw.print("orchard cherry by house ");
	        }catch (IOException e){
	            e.printStackTrace();
	        }

		 System.out.println(myDictionary.getTranslate(fileEng));  
		 myDictionary.textToFile(myDictionary.getTranslate(fileEng));
	     System.out.println(myDictionary.getTranslate(fileEng));

	}

}
