package com.chamika.fidenz.chargestate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by fidenz on 2/16/18.
 */


public class PowerConnectionReceiver extends BroadcastReceiver {

    //TextView tvchager;
    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction() == Intent.ACTION_POWER_CONNECTED) {
            //Handle power connected
            Log.e("Charger State","power connected");



           // tvchager.setText("Charger PluggedIn");
            Toast.makeText(context, "Charger PluggedIn", Toast.LENGTH_SHORT).show();
        } else if(intent.getAction() == Intent.ACTION_POWER_DISCONNECTED){
            //Handle power disconnected
            Log.e("Charger State","power disconnected");
            //tvchager.setText("Charger PluggedOut");
            Toast.makeText(context, "Charger PluggedOut", Toast.LENGTH_SHORT).show();
        }

    }

}