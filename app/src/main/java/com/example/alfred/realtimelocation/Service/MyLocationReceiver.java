package com.example.alfred.realtimelocation.Service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;

import com.example.alfred.realtimelocation.Utils.Common;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import io.paperdb.Paper;

public class MyLocationReceiver extends BroadcastReceiver {
    public static final String Action = "com.example.alfred.realtimelocation.UPDATE_LOCATION";

    DatabaseReference publicLocation;
    String uid;

    public MyLocationReceiver() {
        publicLocation = FirebaseDatabase.getInstance().getReference(Common.PUBLIC_LOCATION);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Paper.init(context);

        uid = Paper.book().read(Common.USER_ID_SAVE_KEY);
        if (intent != null)
        {
            final String action = intent.getAction();
            if (action.equals(Action))
            {
                LocationResult result = LocationResult.extractResult(intent);
                if (result!= null)
                {
                    Location location = result.getLastLocation();
                    if (Common.loggedUser != null) // app in Foreground
                    {
                        publicLocation.child(Common.loggedUser.getUid()).setValue(location);
                    }
                    else //app be killed
                    {
                        publicLocation.child(uid).setValue(location);
                    }
                }
            }
        }
    }
}