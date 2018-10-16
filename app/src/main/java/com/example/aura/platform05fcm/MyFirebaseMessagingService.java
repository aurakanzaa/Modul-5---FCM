package com.example.aura.platform05fcm;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;



public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "FCM_GUE";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.d(TAG, "Pengirim: " + remoteMessage.getFrom());

        if(remoteMessage.getData().size() > 0){
            Log.d(TAG,"Pesennya bang: " + remoteMessage.getData().get("body"));
        }

        //then here we can use the title and body to build a notification
        MyNotificationManager.getInstance(this).displayNotification(
                remoteMessage.getData().get("body"),
                remoteMessage.getData().get("title")
        );
    }
}
