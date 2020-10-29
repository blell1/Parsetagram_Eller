package com.example.parsetagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LINjdLHgiCefw8hA7tZOCdR3dVBIscbPuqqbymm4")
                .clientKey("dxeXIhFpuZ5KFcAqG5EjGV6ZTk094aANGYXsOyGD")
                .server("https://parseapi.back4app.com")
                .build());
    }
}
