package com.zxy.listView;

import java.util.List;
import java.util.Map;

import com.zxy.listView.R;

import android.R.bool;
import android.app.Activity;
import android.os.Bundle;
import android.renderscript.Int2;
import android.view.Menu;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Mainactivity extends Activity {
	private SimpleAdapter adapter;
	private ListView listview;
	private List<Map<String, String>> data ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listview);
		listview = (ListView) this.findViewById(R.id.listview);
		data=Mydata.getMaps();
		adapter = new SimpleAdapter(Mainactivity.this, data, R.layout.listview,
				new String[] { "name", "score", "adress" }, new int[] {
						R.id.name, R.id.score, R.id.adress });
		listview.setAdapter(adapter);
	}
	
	
	
}
