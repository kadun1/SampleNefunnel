package com.tutorials.samplenefunnel;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SaveSharedPreference {

    static final String USER_ID = "id";

    static SharedPreferences getSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void setUserID(Context context, String id) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString(USER_ID, id);
        editor.commit();
    }

    public static String getUserID(Context context) {
        return getSharedPreferences(context).getString(USER_ID, "");
    }

    public static void clearUserID(Context context) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.clear();
        editor.commit();
    }

}
