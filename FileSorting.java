package com.local.puzzles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class FileSorting {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
			BufferedReader br=new BufferedReader(new FileReader("d:\\input.txt"));
			

			String line=br.readLine();
			
			
			
			
			ArrayList<String> aList=new ArrayList();
			
			System.out.println("Reading Files...");
			while(line!=null){
				
				String amendLine="";
				
				String[] strArray=line.split(" ");
				
				System.out.println("Line Length"+strArray.length);
				
				for(int i=0;i<strArray.length;i++){
					amendLine=amendLine.concat(strArray[i]);
					if(i==0){
						String s1=amendLine.substring(0, 1).toUpperCase();
						amendLine=s1+amendLine.substring(1);
						
					}
					
					if(i!=strArray.length-1)
						amendLine=amendLine.concat(",");
				}	
				
				aList.add(amendLine);
				line=br.readLine();
			}
			
			
			br.close();
			
			System.out.println("File Sorting...");
			Collections.sort(aList);
			
			BufferedWriter bw=new BufferedWriter(new FileWriter("d:\\input.txt"));
			
			System.out.println("File Cleared...");
			bw.write("");
			
			System.out.println("File Writing..");
			for(String lines:aList){
				bw.write(lines);
				bw.newLine();
			}
			
			bw.close();
		

	}

}
