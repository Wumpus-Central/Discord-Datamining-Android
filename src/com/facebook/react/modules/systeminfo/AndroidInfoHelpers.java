package com.facebook.react.modules.systeminfo;

import android.content.Context;
import android.os.Build;
import com.facebook.react.C5072R;
import java.util.Locale;

/* loaded from: classes7.dex */
public class AndroidInfoHelpers {
    public static final String DEVICE_LOCALHOST = "localhost";
    public static final String EMULATOR_LOCALHOST = "10.0.2.2";
    public static final String GENYMOTION_LOCALHOST = "10.0.3.2";
    public static final String METRO_HOST_PROP_NAME = "metro.host";
    private static final String TAG = "AndroidInfoHelpers";
    private static String metroHostPropValue;

    public static String getAdbReverseTcpCommand(Integer num) {
        return "adb reverse tcp:" + num + " tcp:" + num;
    }

    private static Integer getDevServerPort(Context context) {
        return Integer.valueOf(context.getResources().getInteger(C5072R.integer.react_native_dev_server_port));
    }

    public static String getFriendlyDeviceName() {
        if (isRunningOnGenymotion()) {
            return Build.MODEL;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    public static String getInspectorProxyHost(Context context) {
        return getServerIpAddress(getInspectorProxyPort(context).intValue());
    }

    private static Integer getInspectorProxyPort(Context context) {
        return Integer.valueOf(context.getResources().getInteger(C5072R.integer.react_native_dev_server_port));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
        if (r2 == null) goto L_0x0069;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized java.lang.String getMetroHostPropValue() {
        /*
            java.lang.Class<com.facebook.react.modules.systeminfo.AndroidInfoHelpers> r0 = com.facebook.react.modules.systeminfo.AndroidInfoHelpers.class
            monitor-enter(r0)
            java.lang.String r1 = com.facebook.react.modules.systeminfo.AndroidInfoHelpers.metroHostPropValue     // Catch: all -> 0x0079
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return r1
        L_0x0009:
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: all -> 0x004d, Exception -> 0x0052
            java.lang.String r3 = "/system/bin/getprop"
            java.lang.String r4 = "metro.host"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: all -> 0x004d, Exception -> 0x0052
            java.lang.Process r2 = r2.exec(r3)     // Catch: all -> 0x004d, Exception -> 0x0052
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: all -> 0x0043, Exception -> 0x0048
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: all -> 0x0043, Exception -> 0x0048
            java.io.InputStream r5 = r2.getInputStream()     // Catch: all -> 0x0043, Exception -> 0x0048
            java.lang.String r6 = "UTF-8"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch: all -> 0x0043, Exception -> 0x0048
            r4.<init>(r5, r6)     // Catch: all -> 0x0043, Exception -> 0x0048
            r3.<init>(r4)     // Catch: all -> 0x0043, Exception -> 0x0048
            java.lang.String r1 = ""
        L_0x0030:
            java.lang.String r4 = r3.readLine()     // Catch: Exception -> 0x0041, all -> 0x006d
            if (r4 == 0) goto L_0x0038
            r1 = r4
            goto L_0x0030
        L_0x0038:
            com.facebook.react.modules.systeminfo.AndroidInfoHelpers.metroHostPropValue = r1     // Catch: Exception -> 0x0041, all -> 0x006d
            r3.close()     // Catch: Exception -> 0x003d, all -> 0x0079
        L_0x003d:
            r2.destroy()     // Catch: all -> 0x0079
            goto L_0x0069
        L_0x0041:
            r1 = move-exception
            goto L_0x0056
        L_0x0043:
            r3 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L_0x006e
        L_0x0048:
            r3 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L_0x0056
        L_0x004d:
            r2 = move-exception
            r3 = r1
            r1 = r2
            r2 = r3
            goto L_0x006e
        L_0x0052:
            r2 = move-exception
            r3 = r1
            r1 = r2
            r2 = r3
        L_0x0056:
            java.lang.String r4 = com.facebook.react.modules.systeminfo.AndroidInfoHelpers.TAG     // Catch: all -> 0x006d
            java.lang.String r5 = "Failed to query for metro.host prop:"
            p414x3.C13925a.m2303I(r4, r5, r1)     // Catch: all -> 0x006d
            java.lang.String r1 = ""
            com.facebook.react.modules.systeminfo.AndroidInfoHelpers.metroHostPropValue = r1     // Catch: all -> 0x006d
            if (r3 == 0) goto L_0x0066
            r3.close()     // Catch: Exception -> 0x0066, all -> 0x0079
        L_0x0066:
            if (r2 == 0) goto L_0x0069
            goto L_0x003d
        L_0x0069:
            java.lang.String r1 = com.facebook.react.modules.systeminfo.AndroidInfoHelpers.metroHostPropValue     // Catch: all -> 0x0079
            monitor-exit(r0)
            return r1
        L_0x006d:
            r1 = move-exception
        L_0x006e:
            if (r3 == 0) goto L_0x0073
            r3.close()     // Catch: Exception -> 0x0073, all -> 0x0079
        L_0x0073:
            if (r2 == 0) goto L_0x0078
            r2.destroy()     // Catch: all -> 0x0079
        L_0x0078:
            throw r1     // Catch: all -> 0x0079
        L_0x0079:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.systeminfo.AndroidInfoHelpers.getMetroHostPropValue():java.lang.String");
    }

    public static String getServerHost(Integer num) {
        return getServerIpAddress(num.intValue());
    }

    private static String getServerIpAddress(int i) {
        String metroHostPropValue2 = getMetroHostPropValue();
        if (metroHostPropValue2.equals("")) {
            if (isRunningOnGenymotion()) {
                metroHostPropValue2 = GENYMOTION_LOCALHOST;
            } else if (isRunningOnStockEmulator()) {
                metroHostPropValue2 = EMULATOR_LOCALHOST;
            } else {
                metroHostPropValue2 = DEVICE_LOCALHOST;
            }
        }
        return String.format(Locale.US, "%s:%d", metroHostPropValue2, Integer.valueOf(i));
    }

    private static boolean isRunningOnGenymotion() {
        return Build.FINGERPRINT.contains("vbox");
    }

    private static boolean isRunningOnStockEmulator() {
        return Build.FINGERPRINT.contains("generic");
    }

    public static String getAdbReverseTcpCommand(Context context) {
        return getAdbReverseTcpCommand(getDevServerPort(context));
    }

    public static String getServerHost(Context context) {
        return getServerIpAddress(getDevServerPort(context).intValue());
    }
}
