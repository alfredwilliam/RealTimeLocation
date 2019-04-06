package com.example.alfred.realtimelocation.Utils;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.alfred.realtimelocation.R;

public class NotificationHelper extends ContextWrapper {
    private static final String ALFRED_CHANNEL_ID = "com.example.alfred.realtimelocation";
    private static final String ALFRED_CHANNEL_NAME = "RealTimeLocation";

    private NotificationManager manager;


    public NotificationHelper(Context base) {
        super(base);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
            createChannel();
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    private void createChannel() {
        NotificationChannel alfredChannel = new NotificationChannel(ALFRED_CHANNEL_ID,
                ALFRED_CHANNEL_NAME,
                NotificationManager.IMPORTANCE_DEFAULT);
        alfredChannel.enableLights(false);
        alfredChannel.enableVibration(true);
        alfredChannel.setLockscreenVisibility(Notification.VISIBILITY_PRIVATE);

        getManager().createNotificationChannel(alfredChannel);
    }

    public NotificationManager getManager() {
        if (manager == null)
            manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        return manager;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Notification.Builder getRealTimeTrackingNotification(String title, String content, Uri defaultSound) {
        return new Notification.Builder(getApplicationContext(),ALFRED_CHANNEL_ID)
                .setSmallIcon(R.mipmap.ic_launcher_round)
                .setContentTitle(title)
                .setContentText(content)
                .setSound(defaultSound)
                .setAutoCancel(false);
    }

}
