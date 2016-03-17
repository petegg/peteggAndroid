/**
 * PersonalFragment.java 
 * classes : com.sego.petegg.app.fragment.PersonalFragment
 * ldp Create at 2016-3-16 下午9:08:04  
 */

package com.sego.petegg.app.fragment.personal;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

import com.sego.petegglib.app.BaseFragment;

/**
 * com.sego.petegg.app.fragment.PersonalFragment
 * @author ldp
 *
 * create at 2016-3-16 下午9:08:04
 */

public class PersonalFragment extends BaseFragment {

	/* 
	 * @see android.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		TextView tvTitle=new TextView(super.getActivity());
		tvTitle.setText("" + TAG);
		tvTitle.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
		tvTitle.setGravity(Gravity.CENTER);
		tvTitle.setTextSize(30);
		return tvTitle;
	}
}
