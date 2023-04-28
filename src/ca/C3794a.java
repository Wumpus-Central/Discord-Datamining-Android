package ca;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p082ea.C6801d;

/* renamed from: ca.a */
/* loaded from: classes5.dex */
public class C3794a {
    @Deprecated
    /* renamed from: a */
    public static byte[] m33586a(Context context, String str) {
        MessageDigest b;
        PackageInfo e = C6801d.m24304a(context).m24306e(str, 64);
        Signature[] signatureArr = e.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b = m33585b("SHA1")) == null) {
            return null;
        }
        return b.digest(e.signatures[0].toByteArray());
    }

    /* renamed from: b */
    public static MessageDigest m33585b(String str) {
        MessageDigest instance;
        for (int i = 0; i < 2; i++) {
            try {
                instance = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (instance != null) {
                return instance;
            }
        }
        return null;
    }
}
