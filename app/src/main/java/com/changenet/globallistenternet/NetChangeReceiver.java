package com.changenet.globallistenternet;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * 作者：Administrator
 * 时间：on 2018/9/14 07:51
 * 功能：网路变化监听者
 */
public class NetChangeReceiver extends BroadcastReceiver {
    private String TAG = this.getClass().getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        String name = NetUtils.getConnectType(context);
        if (name != null) {
            Log.d("zwk", "接收到" + name);
            Toast.makeText(context, "" + name, Toast.LENGTH_SHORT).show();
        }

    }
}
