package p319ra;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: ra.i1 */
/* loaded from: classes3.dex */
public final class C12517i1 {

    /* renamed from: f */
    static HashMap f28173f;

    /* renamed from: k */
    private static Object f28178k;

    /* renamed from: l */
    private static boolean f28179l;

    /* renamed from: a */
    public static final Uri f28168a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f28169b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f28170c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f28171d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    private static final AtomicBoolean f28172e = new AtomicBoolean();

    /* renamed from: g */
    static final HashMap f28174g = new HashMap();

    /* renamed from: h */
    static final HashMap f28175h = new HashMap();

    /* renamed from: i */
    static final HashMap f28176i = new HashMap();

    /* renamed from: j */
    static final HashMap f28177j = new HashMap();

    /* renamed from: m */
    static final String[] f28180m = new String[0];

    /* JADX WARN: Removed duplicated region for block: B:84:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m6595b(android.content.ContentResolver r16, java.lang.String r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p319ra.C12517i1.m6595b(android.content.ContentResolver, java.lang.String, boolean):boolean");
    }

    /* renamed from: c */
    private static void m6594c(ContentResolver contentResolver) {
        if (f28173f == null) {
            f28172e.set(false);
            f28173f = new HashMap();
            f28178k = new Object();
            f28179l = false;
            contentResolver.registerContentObserver(f28168a, true, new C12514h1(null));
        } else if (f28172e.getAndSet(false)) {
            f28173f.clear();
            f28174g.clear();
            f28175h.clear();
            f28176i.clear();
            f28177j.clear();
            f28178k = new Object();
            f28179l = false;
        }
    }

    /* renamed from: d */
    private static void m6593d(Object obj, String str, String str2) {
        synchronized (C12517i1.class) {
            if (obj == f28178k) {
                f28173f.put("gms:nearby:requires_gms_check", str2);
            }
        }
    }
}
