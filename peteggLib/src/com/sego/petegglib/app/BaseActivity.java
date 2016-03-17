package com.sego.petegglib.app;

import android.app.Activity;
import android.os.Bundle;

import com.sego.petegglib.library.ActivityStack;

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivityStack().add(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        getActivityStack().remove(this);
    }

    protected ActivityStack getActivityStack() {
//        return getBaseApplication().getActivityStack();
        return ActivityStack.getInstance();
    }

    protected BaseApplication getBaseApplication() {
        return (BaseApplication) getApplication();
    }

}
