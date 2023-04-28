package p403wc;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import p136hc.C7984d;

/* renamed from: wc.b */
/* loaded from: classes3.dex */
public class C13861b {

    /* renamed from: c */
    private static final String[] f31208c = {"*", "FCM", "GCM", ""};

    /* renamed from: a */
    private final SharedPreferences f31209a;

    /* renamed from: b */
    private final String f31210b;

    public C13861b(C7984d dVar) {
        this.f31209a = dVar.m20967j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f31210b = m2524b(dVar);
    }

    /* renamed from: a */
    private String m2525a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: b */
    private static String m2524b(C7984d dVar) {
        String d = dVar.m20964m().m20940d();
        if (d != null) {
            return d;
        }
        String c = dVar.m20964m().m20941c();
        if (!c.startsWith("1:") && !c.startsWith("2:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    private static String m2523c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: d */
    private String m2522d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private PublicKey m2521e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    /* renamed from: g */
    private String m2519g() {
        String string;
        synchronized (this.f31209a) {
            string = this.f31209a.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: h */
    private String m2518h() {
        synchronized (this.f31209a) {
            String string = this.f31209a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey e = m2521e(string);
            if (e == null) {
                return null;
            }
            return m2523c(e);
        }
    }

    /* renamed from: f */
    public String m2520f() {
        synchronized (this.f31209a) {
            String g = m2519g();
            if (g != null) {
                return g;
            }
            return m2518h();
        }
    }

    /* renamed from: i */
    public String m2517i() {
        synchronized (this.f31209a) {
            for (String str : f31208c) {
                String string = this.f31209a.getString(m2525a(this.f31210b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = m2522d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
