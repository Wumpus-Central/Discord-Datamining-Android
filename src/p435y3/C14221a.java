package p435y3;

import java.util.Locale;
import java.util.Map;
import p394w3.C13733f;

/* renamed from: y3.a */
/* loaded from: classes7.dex */
public class C14221a {

    /* renamed from: a */
    public static final Map<String, String> f32134a = C13733f.m2851of("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    /* renamed from: a */
    private static String m1348a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    /* renamed from: b */
    public static String m1347b(String str) {
        String a = m1348a(str);
        if (a == null) {
            return null;
        }
        String lowerCase = a.toLowerCase(Locale.US);
        String a2 = C14222b.m1345a(lowerCase);
        if (a2 == null) {
            return f32134a.get(lowerCase);
        }
        return a2;
    }

    /* renamed from: c */
    public static boolean m1346c(String str) {
        if (str == null || !str.startsWith("video/")) {
            return false;
        }
        return true;
    }
}
