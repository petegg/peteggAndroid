/**
 * HttpConfig.java 
 * classes : com.sego.petegg.app.config.HttpConfig
 * ldp Create at 2016-3-17 上午10:44:32  
 */

package com.sego.petegg.app.config;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;

import com.litesuits.http.HttpConfig;
import com.litesuits.http.LiteHttp;
import com.litesuits.http.data.NameValuePair;

/**
 * com.sego.petegg.app.config.HttpConfig
 * @author ldp
 *
 * create at 2016-3-17 上午10:44:32
 */

public class LiteHttpConfig {
    private static LiteHttp liteHttp;

    /**
     * 配置LiteHttp
     * @param context 上下文
     */
    public static void configure(Context context) {
        List<NameValuePair> commonHeaders = new ArrayList();
        NameValuePair pair1 = new NameValuePair("Content-type","text/html");
        NameValuePair pair2 = new NameValuePair("charset","utf-8");
        commonHeaders.add(pair1);
        commonHeaders.add(pair2);
        HttpConfig config = new HttpConfig(context) // configuration quickly
                .setDebugged(true)                   // log output when debugged
                .setDetectNetwork(true)              // detect network before connect
                .setDoStatistics(true)               // statistics of time and traffic
                .setUserAgent("Mozilla/5.0 (...)")   // set custom User-Agent
                .setCommonHeaders(commonHeaders)
                .setTimeOut(10000, 10000);             // connect and socket timeout: 10s
        liteHttp = LiteHttp.newApacheHttpClient(config);
    }

    /**
     * 获取网络访问器
     * @return
     */
    public  static LiteHttp getLiteHttp() {
        return liteHttp;
    }
}
