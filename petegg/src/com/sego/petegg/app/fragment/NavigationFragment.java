/**
 * NavigationFragment.java 
 * classes : com.sego.petegg.app.fragment.NavigationFragment
 * ldp Create at 2016-3-17 上午11:29:10  
 */

package com.sego.petegg.app.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sego.petegg.R;
import com.sego.petegglib.app.BaseFragment;

/**
 * com.sego.petegg.app.fragment.NavigationFragment
 * @author ldp
 *
 * create at 2016-3-17 上午11:29:10
 */

public class NavigationFragment extends BaseFragment {

	/* 
	 * @see com.sego.petegglib.app.BaseFragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		return inflater.inflate(R.layout.activity_navigation_base, null);
	}
}
