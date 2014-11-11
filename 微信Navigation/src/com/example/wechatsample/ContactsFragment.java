package com.example.wechatsample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.FrameLayout.LayoutParams;

/**
 * 通讯录Fragment的界面
 * 
 * http://blog.csdn.net/guolin_blog/article/details/26365683
 * 
 * @author guolin
 */
public class ContactsFragment extends Fragment {
	/**
	 * 已经加载过本Fragment
	 */
	private boolean mHasLoadOnce = false;

	@Override
	public void setUserVisibleHint(boolean isVisibleToUser) {
		super.setUserVisibleHint(isVisibleToUser);
		Log.i("ContactsFragment", "setUserVisibleHint");
		if (isVisibleToUser && !mHasLoadOnce) {
			loadView();

			mHasLoadOnce = true;// 设置为已经加载
		}

	}

	/**
	 * 加载视图
	 */
	private void loadView() {
		Log.i("ContactsFragment", "loadView");

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.i("ContactsFragment", "onCreateView");
		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT);
		FrameLayout fl = new FrameLayout(getActivity());
		fl.setLayoutParams(params);
		DisplayMetrics dm = getResources().getDisplayMetrics();
		final int margin = (int) TypedValue.applyDimension(
				TypedValue.COMPLEX_UNIT_DIP, 8, dm);
		TextView v = new TextView(getActivity());
		params.setMargins(margin, margin, margin, margin);
		v.setLayoutParams(params);
		v.setLayoutParams(params);
		v.setGravity(Gravity.CENTER);
		v.setText("聊天界面");
		v.setTextSize((int) TypedValue.applyDimension(
				TypedValue.COMPLEX_UNIT_SP, 12, dm));
		fl.addView(v);
		return fl;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.i("ContactsFragment", "onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.i("ContactsFragment", "onResume");
	}

}
