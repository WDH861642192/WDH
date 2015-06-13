package com.zxy.listView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mydata {
	public static List<Map<String, String>> getMaps() {
		
		 List<Map<String, String>> listMaps=new ArrayList<Map<String,String>>();
		 Map<String, String> map1=new HashMap<String, String>();
		 map1.put("name", "赖总");
		 map1.put("score", "90");
		 map1.put("adress", "江西");
		 Map<String, String> map2=new HashMap<String, String>();
		 map2.put("name", "斐总");
		 map2.put("score", "91");
		 map2.put("adress", "江苏");
		 Map<String, String> map3=new HashMap<String, String>();
		 map3.put("name", "阳总");
		 map3.put("score", "92");
		 map3.put("adress", "江苏");
		listMaps.add(map1);
		listMaps.add(map2);
		listMaps.add(map3);
		return listMaps;

	}

}
