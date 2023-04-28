package p435y3;

import android.webkit.MimeTypeMap;
import java.util.Map;
import p394w3.C13733f;

/* renamed from: y3.b */
/* loaded from: classes7.dex */
public class C14222b {

    /* renamed from: a */
    private static final MimeTypeMap f32135a = MimeTypeMap.getSingleton();

    /* renamed from: b */
    private static final Map<String, String> f32136b = C13733f.m2851of("image/heif", "heif", "image/heic", "heic");

    /* renamed from: c */
    private static final Map<String, String> f32137c = C13733f.m2851of("heif", "image/heif", "heic", "image/heic");

    /* renamed from: a */
    public static String m1345a(String str) {
        String str2 = f32137c.get(str);
        if (str2 != null) {
            return str2;
        }
        return f32135a.getMimeTypeFromExtension(str);
    }
}
