package com.amsavarthan.hify.utils;

import androidx.annotation.NonNull;

import java.util.Random;

/**
 * Created by amsavarthan on 10/3/18.
 */

public class Config {

    public static final String TOPIC_GLOBAL           = "global";

    public static final String REGISTRATION_COMPLETE  = "registrationComplete";
    public static final String PUSH_NOTIFICATION      = "pushNotification";


    public static final String SHARED_PREF            = "ah_firebase";

    public static final String ADMIN_CHANNEL_ID       = "com.amsavarthan.hify";
    public static final String ADMIN_CHANNEL_NAME     = "Push Notifications";

    public static final int PICK_IMAGES = 102;
    public static final String NEWS_API_KEY = "0c565c0ee59741d8923b28167a05b97f";

    @NonNull
    public static String random() {
        Random generator = new Random();
        StringBuilder randomStringBuilder = new StringBuilder();
        int randomLength = generator.nextInt(10);
        char tempChar;
        for (int i = 0; i < randomLength; i++) {
            tempChar = (char) (generator.nextInt(96) + 32);
            randomStringBuilder.append(tempChar);
        }
        return randomStringBuilder.toString();
    }

}
