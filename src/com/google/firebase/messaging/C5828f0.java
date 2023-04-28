package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.discord.nearby.NearbyManager;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.f0 */
/* loaded from: classes3.dex */
public class C5828f0 {

    /* renamed from: a */
    private final Bundle f11573a;

    public C5828f0(Bundle bundle) {
        if (bundle != null) {
            this.f11573a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    /* renamed from: d */
    private static int m27163d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: s */
    private static boolean m27148s(String str) {
        if (str.startsWith("google.c.a.") || str.equals("from")) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static boolean m27147t(Bundle bundle) {
        if (NearbyManager.PERMISSION_DENIED.equals(bundle.getString("gcm.n.e")) || NearbyManager.PERMISSION_DENIED.equals(bundle.getString(m27145v("gcm.n.e")))) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private static boolean m27146u(String str) {
        if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private static String m27145v(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: w */
    private String m27144w(String str) {
        if (!this.f11573a.containsKey(str) && str.startsWith("gcm.n.")) {
            String v = m27145v(str);
            if (this.f11573a.containsKey(v)) {
                return v;
            }
        }
        return str;
    }

    /* renamed from: z */
    private static String m27141z(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    /* renamed from: a */
    public boolean m27166a(String str) {
        String p = m27151p(str);
        if (NearbyManager.PERMISSION_DENIED.equals(p) || Boolean.parseBoolean(p)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public Integer m27165b(String str) {
        String p = m27151p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m27141z(str) + "(" + p + ") into an int");
            return null;
        }
    }

    /* renamed from: c */
    public JSONArray m27164c(String str) {
        String p = m27151p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return new JSONArray(p);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + m27141z(str) + ": " + p + ", falling back to default");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] m27162e() {
        JSONArray c = m27164c("gcm.n.light_settings");
        if (c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c.length() == 3) {
                iArr[0] = m27163d(c.optString(0));
                iArr[1] = c.optInt(1);
                iArr[2] = c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c + ". Skipping setting LightSettings");
            return null;
        }
    }

    /* renamed from: f */
    public Uri m27161f() {
        String p = m27151p("gcm.n.link_android");
        if (TextUtils.isEmpty(p)) {
            p = m27151p("gcm.n.link");
        }
        if (!TextUtils.isEmpty(p)) {
            return Uri.parse(p);
        }
        return null;
    }

    /* renamed from: g */
    public Object[] m27160g(String str) {
        JSONArray c = m27164c(str + "_loc_args");
        if (c == null) {
            return null;
        }
        int length = c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = c.optString(i);
        }
        return strArr;
    }

    /* renamed from: h */
    public String m27159h(String str) {
        return m27151p(str + "_loc_key");
    }

    /* renamed from: i */
    public String m27158i(Resources resources, String str, String str2) {
        String h = m27159h(str2);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        int identifier = resources.getIdentifier(h, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m27141z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] g = m27160g(str2);
        if (g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + m27141z(str2) + ": " + Arrays.toString(g) + " Default value will be used.", e);
            return null;
        }
    }

    /* renamed from: j */
    public Long m27157j(String str) {
        String p = m27151p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m27141z(str) + "(" + p + ") into a long");
            return null;
        }
    }

    /* renamed from: k */
    public String m27156k() {
        return m27151p("gcm.n.android_channel_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public Integer m27155l() {
        Integer b = m27165b("gcm.n.notification_count");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= 0) {
            return b;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + b + ". Skipping setting notificationCount.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public Integer m27154m() {
        Integer b = m27165b("gcm.n.notification_priority");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -2 && b.intValue() <= 2) {
            return b;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + b + ". Skipping setting notificationPriority.");
        return null;
    }

    /* renamed from: n */
    public String m27153n(Resources resources, String str, String str2) {
        String p = m27151p(str2);
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return m27158i(resources, str, str2);
    }

    /* renamed from: o */
    public String m27152o() {
        String p = m27151p("gcm.n.sound2");
        if (TextUtils.isEmpty(p)) {
            return m27151p("gcm.n.sound");
        }
        return p;
    }

    /* renamed from: p */
    public String m27151p(String str) {
        return this.f11573a.getString(m27144w(str));
    }

    /* renamed from: q */
    public long[] m27150q() {
        JSONArray c = m27164c("gcm.n.vibrate_timings");
        if (c == null) {
            return null;
        }
        try {
            if (c.length() > 1) {
                int length = c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer m27149r() {
        Integer b = m27165b("gcm.n.visibility");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -1 && b.intValue() <= 1) {
            return b;
        }
        Log.w("NotificationParams", "visibility is invalid: " + b + ". Skipping setting visibility.");
        return null;
    }

    /* renamed from: x */
    public Bundle m27143x() {
        Bundle bundle = new Bundle(this.f11573a);
        for (String str : this.f11573a.keySet()) {
            if (!m27148s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: y */
    public Bundle m27142y() {
        Bundle bundle = new Bundle(this.f11573a);
        for (String str : this.f11573a.keySet()) {
            if (m27146u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
