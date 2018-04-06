package com.example.fondn.broadcastlearn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String actoin = intent.getAction();
        switch (actoin){
            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                Toast.makeText(context, "Airplane Mode Changed", Toast.LENGTH_SHORT).show();
                Intent i = new Intent("SagorsAction");
                i.putExtra("key","data");
                context.sendBroadcast(i);
                //Context
                break;
        }
    }
}
