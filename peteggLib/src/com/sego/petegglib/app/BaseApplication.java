package com.sego.petegglib.app;

import android.app.Activity;
import android.app.Application;
import android.util.DisplayMetrics;

import com.sego.petegglib.library.ActivityStack;
import com.sego.petegglib.utils.Utils;

public class BaseApplication extends Application {

   private boolean mInitialized = false;
   private ActivityStack mActivityStack;

   @Override
   public void onCreate() {
      super.onCreate();

      createActivityStack();
      Utils.enableLogging(true);
   }

   public ActivityStack getActivityStack() {
      createActivityStack();
      return mActivityStack;
   }

   void createActivityStack() {
      if (mActivityStack == null) {
         mActivityStack = ActivityStack.getInstance();
      }
   }

   void destroyActivityStack() {
      if (mActivityStack != null) {
         mActivityStack.cleanup();
         mActivityStack = null;
      }
   }

   public boolean hasIntialized() {
      return mInitialized;
   }

   /**
    * Prepare environment while application is launched
    */
   public void prepareEnvironment() {
      Utils.log("Application", "cleanupEnvironment");
      createActivityStack();
      mInitialized = true;
   }

   /**
    * Cleanup environment while application exits
    */
   public void cleanupEnvironment() {
      Utils.log("Application", "cleanupEnvironment");
      destroyActivityStack();
      mInitialized = false;
   }

   public void exit() {
      getActivityStack().finishAll();
      cleanupEnvironment();
//      System.exit(0);
   }

   public static int getScreenWidth(Activity context) {
      return context.getWindowManager().getDefaultDisplay().getWidth();
   }

   public static int getScreenHeight(Activity context) {
      return context.getWindowManager().getDefaultDisplay().getHeight();
   }

   public static float getScreenDensity(Activity context) {
      DisplayMetrics dm = new DisplayMetrics();
      context.getWindowManager().getDefaultDisplay().getMetrics(dm);
      return dm.density;
   }

   public static DisplayMetrics getDisplayMetrics(Activity context) {
      DisplayMetrics dm = new DisplayMetrics();
      context.getWindowManager().getDefaultDisplay().getMetrics(dm);
      return dm;
   }

}
