package org.dogadaev.liquormarket.util;

import android.content.Context;
import android.net.ConnectivityManager;

public final class NetworkUtils {

    private NetworkUtils() {
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (cm == null) return false;
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnectedOrConnecting();
    }
}
