/**
 * MyApplication.java 
 * classes : com.sego.petegg.application.MyApplication
 * ldp Create at 2016-3-16 下午4:16:16  
 */

package com.sego.petegg.app.application;

import com.sego.petegg.app.config.LiteHttpConfig;
import com.sego.petegglib.app.BaseApplication;

/**
 * com.sego.petegg.application.MyApplication
 * @author ldp
 *
 * create at 2016-3-16 下午4:16:16
 */

public class MyApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
    }
    
    public void initLiteHttp() {
    	
    	LiteHttpConfig.configure(getApplicationContext());
    	
    }
}
