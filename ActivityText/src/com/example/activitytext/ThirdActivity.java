package com.example.activitytext;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class ThirdActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//���ر�����
		setContentView(R.layout.third_layout);
	}

}
