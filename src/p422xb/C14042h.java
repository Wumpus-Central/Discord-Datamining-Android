package p422xb;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C5665o;

/* renamed from: xb.h */
/* loaded from: classes3.dex */
public class C14042h {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C14035d m1943a(int i) {
        if (i == 0) {
            return new C14044j();
        }
        if (i != 1) {
            return m1942b();
        }
        return new C14036e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C14035d m1942b() {
        return new C14044j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C14037f m1941c() {
        return new C14037f();
    }

    /* renamed from: d */
    public static void m1940d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C14038g) {
            ((C14038g) background).m1982X(f);
        }
    }

    /* renamed from: e */
    public static void m1939e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C14038g) {
            m1938f(view, (C14038g) background);
        }
    }

    /* renamed from: f */
    public static void m1938f(View view, C14038g gVar) {
        if (gVar.m1989Q()) {
            gVar.m1977b0(C5665o.m27827d(view));
        }
    }
}
