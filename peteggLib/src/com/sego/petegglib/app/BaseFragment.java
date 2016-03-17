/**
 * BaseFragment.java 
 * classes : com.sego.petegglib.app.BaseFragment
 * ldp Create at 2016-3-16 下午8:56:37  
 */

package com.sego.petegglib.app;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sego.petegglib.library.FragmentListener;
import com.sego.petegglib.utils.Utils;

/**
 * com.sego.petegglib.app.BaseFragment
 * @author ldp
 *
 * create at 2016-3-16 下午8:56:37
 */

public class BaseFragment extends Fragment implements View.OnKeyListener,
		FragmentManager.OnBackStackChangedListener,
		FragmentListener.FragmentResultListener{
	
	public static final String TAG = BaseFragment.class.getSimpleName();
	
	public FragmentActivity mActivity;  

	@Override
	public void onAttach(Activity activity) {
        Utils.log(TAG, ">>>>>>>>>>onAttach");
		super.onAttach(activity);
	}

	@Override
    public void onCreate(Bundle savedInstanceState) {
        Utils.log(TAG, ">>>>>>>>>>onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
        Utils.log(TAG, ">>>>>>>>>>onSaveInstanceState");
		super.onSaveInstanceState(outState);
	}

	@Override
	public void onViewStateRestored(Bundle savedInstanceState) {
        Utils.log(TAG, ">>>>>>>>>>onViewStateStored");
		super.onViewStateRestored(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Utils.log(TAG, ">>>>>>>>>>onCreateView");
		return super.onCreateView(inflater, container, savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
        Utils.log(TAG, ">>>>>>>>>>onActivityCreated");
		super.onActivityCreated(savedInstanceState);

//		View view = getView();
//		view.setOnKeyListener(this);
//		view.setFocusableInTouchMode(true);
//		view.requestFocus();
	}

	@Override
	public void onStart() {
        Utils.log(TAG, ">>>>>>>>>>onStart");
		super.onStart();
	}

	@Override
	public void onResume() {
        Utils.log(TAG, ">>>>>>>>>>onResume");
		super.onResume();
	}

	@Override
	public void onPause() {
		super.onPause();
        Utils.log(TAG, ">>>>>>>>>>onPause");
	}
	
	@Override
	public void onStop() {
        Utils.log(TAG, ">>>>>>>>>>onStop");
		super.onStop();
	}

	@Override
	public void onDestroyView() {
        Utils.log(TAG, ">>>>>>>>>>onDestroyView");
		super.onDestroyView();
	}

	@Override
	public void onDestroy() {
        Utils.log(TAG, ">>>>>>>>>>onDestroy");
		super.onDestroy();
	}

	@Override
	public void onDetach() {
        Utils.log(TAG, ">>>>>>>>>>onDetach");
		super.onDetach();
	}

	@Override
	public void onHiddenChanged(boolean hidden) {
        Utils.log(TAG, ">>>>>>>>>>onHiddenChanged:" + hidden);
		super.onHiddenChanged(hidden);
	}

	@Override
	public void onBackStackChanged() {
        Utils.log(TAG, ">>>>>>>>>>onBackStackChanged "
					+ " isVisible: " + getUserVisibleHint());
	}

	@Override
	public void setUserVisibleHint(boolean isVisibleToUser) {
        Utils.log(TAG, ">>>>>>>>>>setUserVisibleHint: " + isVisibleToUser);
		super.setUserVisibleHint(isVisibleToUser);
	}

	/* 
	 * @see android.view.View.OnKeyListener#onKey(android.view.View, int, android.view.KeyEvent)
	 */
	@Override
	public boolean onKey(View v, int keyCode, KeyEvent event) {
		if (event.getAction() == KeyEvent.ACTION_UP
				&& keyCode == KeyEvent.KEYCODE_BACK) {
			return onBackPressed();
		}
		return false;
	}

	public boolean onBackPressed() {
		Utils.log(TAG, ">>>>>>>>>>onBackPressed");
		return false;
	}
	
	/* 
	 * @see com.sego.petegglib.library.FragmentListener.FragmentResultListener#onFragmentResult(android.os.Bundle)
	 */
	@Override
	public void onFragmentResult(Bundle result) {
        Utils.log(TAG, ">>>>>>>>>>onFragmentResult");
	}

}
