package com.org.iii.shine21;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class OnBootReceiver extends BroadcastReceiver {
    public OnBootReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.v("brad", "Boot OK: 2");
        Intent it = new Intent(context, MyService.class);
        context.startService(it);
    }
}
