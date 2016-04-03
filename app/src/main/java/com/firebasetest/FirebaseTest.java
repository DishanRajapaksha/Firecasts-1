package com.firebasetest;

import com.firebase.client.Firebase;

/**
 * Created by dsraj on 4/3/2016.
 */
public class FirebaseTest extends android.app.Application {

    @Override
    public  void onCreate()
    {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }

}
