package p191k5;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import java.util.List;
import p039c6.AbstractC3768a;

/* renamed from: k5.f */
/* loaded from: classes7.dex */
public class C9754f {

    /* renamed from: a */
    private final AbstractC9751c f21714a;

    /* renamed from: b */
    private CloseableReference<Bitmap> f21715b;

    /* renamed from: c */
    private List<CloseableReference<Bitmap>> f21716c;

    /* renamed from: d */
    private int f21717d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9754f(AbstractC9751c cVar) {
        this.f21714a = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.facebook.common.references.CloseableReference<android.graphics.Bitmap>>, com.facebook.common.references.CloseableReference<android.graphics.Bitmap>] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p191k5.C9753e m15429a() {
        /*
            r3 = this;
            r0 = 0
            k5.e r1 = new k5.e     // Catch: all -> 0x0015
            r1.<init>(r3)     // Catch: all -> 0x0015
            com.facebook.common.references.CloseableReference<android.graphics.Bitmap> r2 = r3.f21715b
            com.facebook.common.references.CloseableReference.m32025t(r2)
            r3.f21715b = r0
            java.util.List<com.facebook.common.references.CloseableReference<android.graphics.Bitmap>> r2 = r3.f21716c
            com.facebook.common.references.CloseableReference.m32023z(r2)
            r3.f21716c = r0
            return r1
        L_0x0015:
            r1 = move-exception
            com.facebook.common.references.CloseableReference<android.graphics.Bitmap> r2 = r3.f21715b
            com.facebook.common.references.CloseableReference.m32025t(r2)
            r3.f21715b = r0
            java.util.List<com.facebook.common.references.CloseableReference<android.graphics.Bitmap>> r2 = r3.f21716c
            com.facebook.common.references.CloseableReference.m32023z(r2)
            r3.f21716c = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p191k5.C9754f.m15429a():k5.e");
    }

    /* renamed from: b */
    public AbstractC3768a m15428b() {
        return null;
    }

    /* renamed from: c */
    public List<CloseableReference<Bitmap>> m15427c() {
        return CloseableReference.m32026s(this.f21716c);
    }

    /* renamed from: d */
    public int m15426d() {
        return this.f21717d;
    }

    /* renamed from: e */
    public AbstractC9751c m15425e() {
        return this.f21714a;
    }

    /* renamed from: f */
    public CloseableReference<Bitmap> m15424f() {
        return CloseableReference.m32027r(this.f21715b);
    }

    /* renamed from: g */
    public C9754f m15423g(AbstractC3768a aVar) {
        return this;
    }

    /* renamed from: h */
    public C9754f m15422h(List<CloseableReference<Bitmap>> list) {
        this.f21716c = CloseableReference.m32026s(list);
        return this;
    }

    /* renamed from: i */
    public C9754f m15421i(int i) {
        this.f21717d = i;
        return this;
    }

    /* renamed from: j */
    public C9754f m15420j(CloseableReference<Bitmap> closeableReference) {
        this.f21715b = CloseableReference.m32027r(closeableReference);
        return this;
    }
}
