package com.sego.petegglib.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

public class Utils {

   private static final String APP_NAME = "petegg";

   private static boolean DEBUG = true;

   public static void enableLogging(boolean logging) {
      DEBUG = logging;
   }

   public static void log(String tag, String info) {
      if (DEBUG) {
         Log.i(APP_NAME, tag + "---->----" + info);
      }
   }

   public static PackageInfo getPackageInfo(Context context) {
      try {
         PackageManager pm = context.getPackageManager();
         return pm.getPackageInfo(context.getPackageName(), 0);
      } catch (NameNotFoundException e) {
         e.printStackTrace();
      }
      return null;
   }

   public static int getVersionCode(Context context) {
      return getPackageInfo(context).versionCode;
   }

   public static String getVersionName(Context context) {
      return getPackageInfo(context).versionName;
   }

}
