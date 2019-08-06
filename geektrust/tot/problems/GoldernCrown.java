package geektrust.tot.problems;

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
	}

}
