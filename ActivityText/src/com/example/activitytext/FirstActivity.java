package com.example.activitytext;

import android.R.bool;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
//		requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题栏
		setContentView(R.layout.first_layout);
		Button button1 = (Button) findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener() {		
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				String data = "Hello SecondActivity";
				Toast.makeText(FirstActivity.this, "You clicked Button 1", Toast.LENGTH_SHORT).show();
				Intent intent = new Intent("com.example.activitytext.ACTION_START");
				intent.putExtra("extra_data", data);
				intent.addCategory("com.example.activitytext.MY_CATEGORY");//添加一个category 测试用 已注册
				startActivity(intent);
				
			}
		});
		
		Button button2 = (Button) findViewById(R.id.button_2);
		button2.setOnClickListener(new OnClickListener() {		
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				finish();
			}
		});
		
	}
	
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO 自动生成的方法存根
		switch (item.getItemId()) {
		case R.id.remove_item:
			Toast.makeText(this, "You cliceed Remove", Toast.LENGTH_SHORT).show();
			break;
		case R.id.add_item:
			Toast.makeText(this, "You cliceed Add", Toast.LENGTH_SHORT).show();
			break;
		default:
		}
		return true;
	}


}
