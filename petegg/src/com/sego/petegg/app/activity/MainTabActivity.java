/**
 * MainTabActivity.java 
 * classes : com.sego.petegg.app.activity.MainTabActivity
 * ldp Create at 2016-3-16 下午5:49:53  
 */

package com.sego.petegg.app.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import android.widget.TextView;

import com.litesuits.http.LiteHttp;
import com.sego.petegg.R;
import com.sego.petegg.app.config.TabConfig;
import com.sego.petegglib.app.BaseFragmentActivity;

/**
 * com.sego.petegg.app.activity.MainTabActivity
 * 
 * @author ldp
 * 
 *         create at 2016-3-16 下午5:49:53
 */

public class MainTabActivity extends BaseFragmentActivity implements
		OnTabChangeListener {

	private FragmentTabHost tabHost;

	/*
	 * @see
	 * com.sego.petegglib.app.BaseFragmentActivity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main_tab);
		
		setupView();
	}

	/*
	 * @see com.sego.petegglib.app.BaseFragmentActivity#setupView()
	 */
	@Override
	protected void setupView() {
		
		tabHost = (FragmentTabHost) super.findViewById(android.R.id.tabhost);
	
		tabHost.setup(this,super.getSupportFragmentManager()
				,R.id.contentLayout);
		tabHost.getTabWidget().setDividerDrawable(null);
		tabHost.setOnTabChangedListener(this);
		
		initTab();
	}

	private void initTab() {
		int tabs[] = TabConfig.getTabsTxt();
		for (int i = 0; i < tabs.length; i++) {
			TabSpec tabSpec = tabHost.newTabSpec(getString(tabs[i])).setIndicator(
					getTabView(i));
			tabHost.addTab(tabSpec, TabConfig.getFragments()[i], null);
			tabHost.setTag(i);
		}
	}

	private View getTabView(int idx) {
		View view = LayoutInflater.from(this).inflate(R.layout.tab_item,
				null);
		((TextView) view.findViewById(R.id.tv_tab_name)).setText(TabConfig
				.getTabsTxt()[idx]);
		if (idx == 0) {

			((TextView) view.findViewById(R.id.tv_tab_name))
					.setTextColor(Color.RED);
			((ImageView) view.findViewById(R.id.iv_tab_icon))
					.setImageResource(TabConfig.getTabsImgLight()[idx]);
		} else {
			((ImageView) view.findViewById(R.id.iv_tab_icon))
					.setImageResource(TabConfig.getTabsImg()[idx]);
		}
		return view;
	}

	@Override
	public void onTabChanged(String tabId) {
		updateTab();
	}

	private void updateTab() {
		TabWidget tabw = tabHost.getTabWidget();
		for (int i = 0; i < tabw.getChildCount(); i++) {
			View view = tabw.getChildAt(i);
			ImageView iv = (ImageView) view.findViewById(R.id.iv_tab_icon);
			if (i == tabHost.getCurrentTab()) {
				((TextView) view.findViewById(R.id.tv_tab_name))
						.setTextColor(getResources().getColor(
								R.color.green_color));
				iv.setImageResource(TabConfig.getTabsImgLight()[i]);
			} else {
				((TextView) view.findViewById(R.id.tv_tab_name))
						.setTextColor(getResources().getColor(
								R.color.foot_txt_gray));
				iv.setImageResource(TabConfig.getTabsImg()[i]);
			}
		}
	}

}
