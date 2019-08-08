package geektrust.tot.problems;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GoldernCrown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map emblem = new HashMap();
		emblem.put("LAND", "panda");
		emblem.put("WATER", "octopus");
		emblem.put("ICE", "mammoth");
		emblem.put("AIR", "owl");
		emblem.put("FIRE", "dragon");
		emblem.put("SPACE", "gorilla");
		
		System.out.println(emblem);
		
		String inputStr1 = "AIR, \"oaaawaala\"";
		String inputStr2 = "LAND, \"a1d22n333a4444p\"";
		String inputStr3 = "ICE, \"zmzmzmzaztzozh\"";
		
		System.out.println("String 1 : "+inputStr1);
		System.out.println("String 2 : "+inputStr2);
		System.out.println("String 3 : "+inputStr3);
		
		String[] kingdomAir = inputStr1.split(",");
		String[] kingdomLand = inputStr2.split(",");
		String[] kingdomIce = inputStr3.split(",");
		
		Map secretMsg = new HashMap();
		secretMsg.put(kingdomAir[0], kingdomAir[1].replaceAll("\"", "").trim());
		secretMsg.put(kingdomLand[0], kingdomLand[1].replaceAll("\"", "").trim());
		secretMsg.put(kingdomIce[0], kingdomIce[1].replaceAll("\"", "").trim());
		
		System.out.println(secretMsg);
		
		if(isKing(emblem, secretMsg)) {
			System.out.println("Who is the ruler of southeros?");
			System.out.println("King Shan");
			System.out.println("Allies of Ruler?");
			System.out.println(secretMsg.keySet());
		}
	}
	
	public static Boolean isKing(Map emblem, Map secretMsg) {
		Boolean isKing=true;
		Map<String, Map> emblemKeyMap = new HashMap();
		Map<String, Map> msgKeyMap = new HashMap();
		
		secretMsg.forEach((K,V) -> {
			if(emblem.containsKey(K)) {
				System.out.println("emblem Value : "+emblem.get(K).toString());
				emblemKeyMap.put((String) K, getCharMap(emblem.get(K).toString()));
			}
			
			msgKeyMap.put((String) K, getCharMap((String)V));
			
		}
				);
		
		System.out.println("EMBLEM KEY MAP : "+emblemKeyMap);
		System.out.println("MESSAGE KEY MAP : "+msgKeyMap);
		ArrayList l1=new ArrayList();
		
		emblemKeyMap.forEach((K, V) -> {
			V.forEach((K1, V1) -> {
				if(msgKeyMap.get(K).get(K1)==V1) {
					l1.add("true");
				}else {
					l1.add("false");
					return;
				}
			}
					);
			//System.out.println("************\n" +emblemKeyMap.get(K));
		}
				);
		if(l1.contains("false")) {
			isKing=false;
		}
		return isKing;
	}
	
	public static Map getCharMap(String value) {
		char[] charArray= value.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(char c : charArray) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}else {
				charMap.put(c, 1);
			}
		}
		return charMap;
	}

}
