package p074e2;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import p163j$.util.Spliterator;

/* renamed from: e2.l0 */
/* loaded from: classes.dex */
public class C6640l0 {
    /* renamed from: a */
    public static String m24846a(Context context) {
        String b = m24845b(context);
        if (b == null) {
            return null;
        }
        return m24843d(b.toUpperCase(Locale.US));
    }

    /* renamed from: b */
    private static String m24845b(Context context) {
        String c = m24844c("wlan0");
        if (c != null) {
            return c;
        }
        String c2 = m24844c("eth0");
        if (c2 != null) {
            return c2;
        }
        try {
            String macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            if (macAddress != null) {
                return macAddress;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static String m24844c(String str) {
        try {
            StringBuilder sb2 = new StringBuilder((int) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/sys/class/net/" + str + "/address"), Spliterator.IMMUTABLE);
            char[] cArr = new char[Spliterator.IMMUTABLE];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read != -1) {
                    sb2.append(String.valueOf(cArr, 0, read));
                } else {
                    bufferedReader.close();
                    return sb2.toString();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static String m24843d(String str) {
        if (str == null) {
            return null;
        }
        String replaceAll = str.replaceAll("\\s", "");
        if (TextUtils.isEmpty(replaceAll)) {
            return null;
        }
        return replaceAll;
    }
}
