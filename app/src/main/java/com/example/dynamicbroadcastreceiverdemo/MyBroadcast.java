package com.example.dynamicbroadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.TextView;
import android.widget.Toast;

public class MyBroadcast extends BroadcastReceiver {

    private TextView tvShowConnectivity;

    public MyBroadcast(TextView tvShowConnectivity) {
        this.tvShowConnectivity = tvShowConnectivity;

    }

    @Override
    public void onReceive(Context context, Intent intent) {

        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){

            boolean connectivity = intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY, false);

            if (connectivity)
            {

                // TODO: 6/3/2022 Disconnected 
                tvShowConnectivity.setText("Disconnected");

                Toast.makeText(context, "Disconnected", Toast.LENGTH_SHORT).show();

            }
            else {

                // TODO: 6/3/2022 Connected 
                tvShowConnectivity.setText("Connected");

                Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show();

            }
        }
    }
}
