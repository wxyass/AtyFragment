package com.atyfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NewsFragment extends Fragment {
	private String title;

//	public NewsFragment(String title) {
//		this.title = title;
//	}
//
//	public NewsFragment() {
//	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		TextView textView = new TextView(getActivity());
		// textView.setText("helloWorld");
		//先获取对象存取的参数
		Bundle bundle = this.getArguments();
		String url = bundle.getString("url");
		//设置到控件上
		textView.setText(url);
		return textView;
	}
	
	public static Fragment getInstance(String url) {
		// 先创建对象
		NewsFragment newsFragment = new NewsFragment();
		// 创建bundle
		Bundle budle = new Bundle();
		budle.putString("url", url);
		newsFragment.setArguments(budle);
		return newsFragment;
	}
}
