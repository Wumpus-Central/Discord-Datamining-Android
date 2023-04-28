package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C2337a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.messaging.t0 */
/* loaded from: classes3.dex */
class C5859t0 {

    /* renamed from: a */
    final SharedPreferences f11623a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.messaging.t0$a */
    /* loaded from: classes3.dex */
    public static class C5860a {

        /* renamed from: d */
        private static final long f11624d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f11625a;

        /* renamed from: b */
        final String f11626b;

        /* renamed from: c */
        final long f11627c;

        private C5860a(String str, String str2, long j) {
            this.f11625a = str;
            this.f11626b = str2;
            this.f11627c = j;
        }

        /* renamed from: a */
        static String m27067a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e);
                return null;
            }
        }

        /* renamed from: c */
        static C5860a m27065c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C5860a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C5860a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean m27066b(String str) {
            if (System.currentTimeMillis() > this.f11627c + f11624d || !str.equals(this.f11626b)) {
                return true;
            }
            return false;
        }
    }

    public C5859t0(Context context) {
        this.f11623a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m27073a(context, "com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    private void m27073a(Context context, String str) {
        File file = new File(C2337a.m38129i(context), str);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m27069e()) {
                    Log.i("FirebaseMessaging", "App restored, clearing state");
                    m27071c();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    private String m27072b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    /* renamed from: c */
    public synchronized void m27071c() {
        this.f11623a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized C5860a m27070d(String str, String str2) {
        return C5860a.m27065c(this.f11623a.getString(m27072b(str, str2), null));
    }

    /* renamed from: e */
    public synchronized boolean m27069e() {
        return this.f11623a.getAll().isEmpty();
    }

    /* renamed from: f */
    public synchronized void m27068f(String str, String str2, String str3, String str4) {
        String a = C5860a.m27067a(str3, str4, System.currentTimeMillis());
        if (a != null) {
            SharedPreferences.Editor edit = this.f11623a.edit();
            edit.putString(m27072b(str, str2), a);
            edit.commit();
        }
    }
}
