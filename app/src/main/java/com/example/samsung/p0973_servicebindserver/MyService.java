package com.example.samsung.p0973_servicebindserver;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MyService extends Service {

    private final String LOG_TAG = "myLogs";
    private String message = "";

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        message = "MyService onCreate()";
        Toast.makeText(this, message, LENGTH_SHORT).show();
        Log.d(LOG_TAG, message);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        message = "MyService onStartCommand()";
        Toast.makeText(this, message, LENGTH_SHORT).show();
        Log.d(LOG_TAG, message);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        message = "MyService onBind()";
        Toast.makeText(this, message, LENGTH_SHORT).show();
        Log.d(LOG_TAG, message);
        return new Binder();
    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        message = "MyService onRebind()";
        Toast.makeText(this, message, LENGTH_SHORT).show();
        Log.d(LOG_TAG, message);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        message = "MyService onUnbind()";
        Toast.makeText(this, message, LENGTH_SHORT).show();
        Log.d(LOG_TAG, message);
        return !super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        message = "MyService onDestroy()";
        Toast.makeText(this, message, LENGTH_SHORT).show();
        Log.d(LOG_TAG, message);
    }
}
