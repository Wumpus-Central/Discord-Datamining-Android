package com.facebook.react.packagerconnection;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import p059d6.C6399a;
import p414x3.C13925a;

/* loaded from: classes7.dex */
public class PackagerConnectionSettings {
    private static final String PREFS_DEBUG_SERVER_HOST_KEY = "debug_http_host";
    private static final String TAG = "PackagerConnectionSettings";
    private final Context mAppContext;
    private final String mPackageName;
    private final SharedPreferences mPreferences;

    public PackagerConnectionSettings(Context context) {
        this.mPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.mPackageName = context.getPackageName();
        this.mAppContext = context;
    }

    public String getDebugServerHost() {
        String string = this.mPreferences.getString(PREFS_DEBUG_SERVER_HOST_KEY, null);
        if (!TextUtils.isEmpty(string)) {
            return (String) C6399a.m25622c(string);
        }
        String serverHost = AndroidInfoHelpers.getServerHost(this.mAppContext);
        if (serverHost.equals(AndroidInfoHelpers.DEVICE_LOCALHOST)) {
            String str = TAG;
            C13925a.m2304H(str, "You seem to be running on device. Run '" + AndroidInfoHelpers.getAdbReverseTcpCommand(this.mAppContext) + "' to forward the debug server's port to the device.");
        }
        return serverHost;
    }

    public String getInspectorServerHost() {
        return AndroidInfoHelpers.getInspectorProxyHost(this.mAppContext);
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public void setDebugServerHost(String str) {
        this.mPreferences.edit().putString(PREFS_DEBUG_SERVER_HOST_KEY, str).apply();
    }
}
