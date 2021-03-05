package com.example.text_to_speech;

import android.content.Context;
import android.content.SharedPreferences;

public class sharedprefmanager {
    private static final String FILENAME = "ARABICLANG";
    private static final String USERNAME = "username";
    private static final String EMAIL = "email";
    private static final String ID = "id";

    private static sharedprefmanager mSharedPrefreneManger;
    private static Context mContext;

    private sharedprefmanager(Context context) {
        this.mContext = context;
    }

    public static synchronized sharedprefmanager getInstance(Context context){

        if(mSharedPrefreneManger == null){
            mSharedPrefreneManger = new sharedprefmanager(context);
        }
        return mSharedPrefreneManger;
    }

    public void storeUserData(user user){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(FILENAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(USERNAME,user.getUsername());
        editor.putString(EMAIL,user.getEmail());
        editor.putInt(ID,user.getUserid());
        editor.apply();

    }

    public boolean isUserLogggedIn(){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(FILENAME, Context.MODE_PRIVATE);

        if(sharedPreferences.getString(USERNAME,null) != null){
            return true;
        }

        return false;
    }

    public void logUserOut(){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(FILENAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();

    }

    public user getUserData(){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(FILENAME, Context.MODE_PRIVATE);
        user user = new user(sharedPreferences.getInt(ID,-1),sharedPreferences.getString(EMAIL,null)
                ,sharedPreferences.getString(USERNAME,null));
        return user;
    }
}