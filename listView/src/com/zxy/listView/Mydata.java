package com.zxy.listView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mydata {
	public static List<Map<String, String>> getMaps() {
		
		 List<Map<String, String>> listMaps=new ArrayList<Map<String,String>>();
		 Map<String, String> map1=new HashMap<String, String>();
		 map1.put("name", "����");
		 map1.put("score", "90");
		 map1.put("adress", "����");
		 Map<String, String> map2=new HashMap<String, String>();
		 map2.put("name", "���");
		 map2.put("score", "91");
		 map2.put("adress", "����");
		 Map<String, String> map3=new HashMap<String, String>();
		 map3.put("name", "����");
		 map3.put("score", "92");
		 map3.put("adress", "����");
		listMaps.add(map1);
		listMaps.add(map2);
		listMaps.add(map3);
		return listMaps;

	}

}
