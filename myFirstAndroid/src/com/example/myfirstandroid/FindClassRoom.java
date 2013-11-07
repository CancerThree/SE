package com.example.myfirstandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.webkit.WebView;


public class FindClassRoom extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.find_class_screen);
		
		//spinner控件
		Spinner shcool_spinner = (Spinner) findViewById(R.id.spinner1) ;
		String[] school_place_Items = getResources().getStringArray(R.array.school_place) ;
		ArrayAdapter<String> _Adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, school_place_Items);
		//绑定 Adapter到控件
		shcool_spinner.setAdapter(_Adapter);
		
		
		//webView控件
		WebView webView = (WebView) findViewById(R.id.webView1) ;
		webView.loadUrl("http://www.baidu.com/index.php?tn=monline_5_dg");
	}

}
