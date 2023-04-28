package p263ob;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.C2382a;
import lb.C10395a;
import p083eb.C6803b;
import p366ub.C13241b;

/* renamed from: ob.a */
/* loaded from: classes3.dex */
public class C11247a {

    /* renamed from: f */
    private static final int f25143f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    private final boolean f25144a;

    /* renamed from: b */
    private final int f25145b;

    /* renamed from: c */
    private final int f25146c;

    /* renamed from: d */
    private final int f25147d;

    /* renamed from: e */
    private final float f25148e;

    public C11247a(Context context) {
        this(C13241b.m4245b(context, C6803b.f14543q, false), C10395a.m13519b(context, C6803b.f14542p, 0), C10395a.m13519b(context, C6803b.f14541o, 0), C10395a.m13519b(context, C6803b.f14539m, 0), context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: e */
    private boolean m10363e(int i) {
        return C2382a.m37920k(i, 255) == this.f25147d;
    }

    /* renamed from: a */
    public float m10367a(float f) {
        float f2 = this.f25148e;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int m10366b(int i, float f) {
        int i2;
        float a = m10367a(f);
        int alpha = Color.alpha(i);
        int h = C10395a.m13513h(C2382a.m37920k(i, 255), this.f25145b, a);
        if (a > 0.0f && (i2 = this.f25146c) != 0) {
            h = C10395a.m13514g(h, C2382a.m37920k(i2, f25143f));
        }
        return C2382a.m37920k(h, alpha);
    }

    /* renamed from: c */
    public int m10365c(int i, float f) {
        if (!this.f25144a || !m10363e(i)) {
            return i;
        }
        return m10366b(i, f);
    }

    /* renamed from: d */
    public boolean m10364d() {
        return this.f25144a;
    }

    public C11247a(boolean z, int i, int i2, int i3, float f) {
        this.f25144a = z;
        this.f25145b = i;
        this.f25146c = i2;
        this.f25147d = i3;
        this.f25148e = f;
    }
}
