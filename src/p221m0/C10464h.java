package p221m0;

import android.media.MediaFormat;
import android.os.Build;
import p390w.AbstractC13595f2;

/* renamed from: m0.h */
/* loaded from: classes.dex */
public class C10464h implements AbstractC13595f2 {
    /* renamed from: a */
    private static boolean m13123a() {
        if (!"Huawei".equalsIgnoreCase(Build.BRAND) || !"mha-l29".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m13122b() {
        if (!"motorola".equalsIgnoreCase(Build.BRAND) || !"moto c".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m13121c() {
        if (!"Nokia".equalsIgnoreCase(Build.BRAND) || !"Nokia 1".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m13120d() {
        if (!"positivo".equalsIgnoreCase(Build.BRAND) || !"twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private boolean m13118f(MediaFormat mediaFormat) {
        return mediaFormat.getString("mime").contains("video/");
    }

    /* renamed from: g */
    private static boolean m13117g() {
        if (!"LGE".equalsIgnoreCase(Build.BRAND) || !"LG-X230".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m13116h() {
        if (!"infinix".equalsIgnoreCase(Build.BRAND) || !"infinix x650".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static boolean m13115i() {
        if (m13121c() || m13122b() || m13116h() || m13117g() || m13123a() || m13120d()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean m13119e(MediaFormat mediaFormat) {
        if (m13121c() || m13122b() || m13116h() || m13117g() || m13120d()) {
            return "video/mp4v-es".equals(mediaFormat.getString("mime"));
        }
        if (!m13123a() || !m13118f(mediaFormat)) {
            return false;
        }
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        if (integer == 3840 && integer2 == 2160) {
            return true;
        }
        return false;
    }
}
