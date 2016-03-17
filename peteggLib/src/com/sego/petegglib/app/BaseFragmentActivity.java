package com.sego.petegglib.app;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.sego.petegglib.library.ActivityStack;

public abstract class BaseFragmentActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivityStack().add(this);
    }
    
    abstract protected void setupView();

    @Override
    protected void onDestroy() {
        super.onDestroy();

        getActivityStack().remove(this);
    }

    protected ActivityStack getActivityStack() {
        return ActivityStack.getInstance();
    }

    protected BaseApplication getBaseApplication() {
        return (BaseApplication) getApplication();
    }

}
