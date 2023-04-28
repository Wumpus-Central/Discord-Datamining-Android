package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.core.util.C2515e;

/* renamed from: androidx.core.graphics.c */
/* loaded from: classes.dex */
public final class C2386c {

    /* renamed from: a */
    private static final ThreadLocal<C2515e<Rect, Rect>> f3331a = new ThreadLocal<>();

    /* renamed from: androidx.core.graphics.c$a */
    /* loaded from: classes.dex */
    static class C2387a {
        /* renamed from: a */
        static boolean m37914a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* renamed from: a */
    public static boolean m37915a(Paint paint, String str) {
        return C2387a.m37914a(paint, str);
    }
}
