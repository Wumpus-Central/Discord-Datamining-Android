package p456z4;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.common.references.CloseableReference;
import p226m5.C10484c;
import p380v5.AbstractC13432c;
import p380v5.C13433d;
import p380v5.C13437h;
import p394w3.C13740j;
import p414x3.C13925a;
import p436y4.AbstractC14224b;

/* renamed from: z4.b */
/* loaded from: classes7.dex */
public class C14542b implements AbstractC14224b {

    /* renamed from: e */
    private static final Class<?> f32968e = C14542b.class;

    /* renamed from: a */
    private final C10484c f32969a;

    /* renamed from: b */
    private final boolean f32970b;

    /* renamed from: c */
    private final SparseArray<CloseableReference<AbstractC13432c>> f32971c = new SparseArray<>();

    /* renamed from: d */
    private CloseableReference<AbstractC13432c> f32972d;

    public C14542b(C10484c cVar, boolean z) {
        this.f32969a = cVar;
        this.f32970b = z;
    }

    /* renamed from: f */
    static CloseableReference<Bitmap> m253f(CloseableReference<AbstractC13432c> closeableReference) {
        C13433d dVar;
        try {
            if (CloseableReference.m32036R(closeableReference) && (closeableReference.m32039C() instanceof C13433d) && (dVar = (C13433d) closeableReference.m32039C()) != null) {
                return dVar.m3731p();
            }
            CloseableReference.m32025t(closeableReference);
            return null;
        } finally {
            CloseableReference.m32025t(closeableReference);
        }
    }

    /* renamed from: g */
    private static CloseableReference<AbstractC13432c> m252g(CloseableReference<Bitmap> closeableReference) {
        return CloseableReference.m32035S(new C13433d(closeableReference, C13437h.f30004d, 0));
    }

    /* renamed from: h */
    private synchronized void m251h(int i) {
        CloseableReference<AbstractC13432c> closeableReference = this.f32971c.get(i);
        if (closeableReference != null) {
            this.f32971c.delete(i);
            CloseableReference.m32025t(closeableReference);
            C13925a.m2273y(f32968e, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i), this.f32971c);
        }
    }

    @Override // p436y4.AbstractC14224b
    /* renamed from: a */
    public synchronized void mo249a(int i, CloseableReference<Bitmap> closeableReference, int i2) {
        CloseableReference<AbstractC13432c> closeableReference2;
        Throwable th2;
        C13740j.m2834g(closeableReference);
        try {
            closeableReference2 = m252g(closeableReference);
            if (closeableReference2 == null) {
                CloseableReference.m32025t(closeableReference2);
                return;
            }
            try {
                CloseableReference<AbstractC13432c> a = this.f32969a.m13063a(i, closeableReference2);
                if (CloseableReference.m32036R(a)) {
                    CloseableReference.m32025t(this.f32971c.get(i));
                    this.f32971c.put(i, a);
                    C13925a.m2273y(f32968e, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i), this.f32971c);
                }
                CloseableReference.m32025t(closeableReference2);
            } catch (Throwable th3) {
                th2 = th3;
                CloseableReference.m32025t(closeableReference2);
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            closeableReference2 = null;
        }
    }

    @Override // p436y4.AbstractC14224b
    /* renamed from: b */
    public synchronized void mo248b(int i, CloseableReference<Bitmap> closeableReference, int i2) {
        CloseableReference<AbstractC13432c> closeableReference2;
        Throwable th2;
        C13740j.m2834g(closeableReference);
        m251h(i);
        try {
            closeableReference2 = m252g(closeableReference);
            if (closeableReference2 != null) {
                try {
                    CloseableReference.m32025t(this.f32972d);
                    this.f32972d = this.f32969a.m13063a(i, closeableReference2);
                } catch (Throwable th3) {
                    th2 = th3;
                    CloseableReference.m32025t(closeableReference2);
                    throw th2;
                }
            }
            CloseableReference.m32025t(closeableReference2);
        } catch (Throwable th4) {
            th2 = th4;
            closeableReference2 = null;
        }
    }

    @Override // p436y4.AbstractC14224b
    /* renamed from: c */
    public synchronized CloseableReference<Bitmap> mo247c(int i) {
        return m253f(CloseableReference.m32027r(this.f32972d));
    }

    @Override // p436y4.AbstractC14224b
    public synchronized void clear() {
        CloseableReference.m32025t(this.f32972d);
        this.f32972d = null;
        for (int i = 0; i < this.f32971c.size(); i++) {
            CloseableReference.m32025t(this.f32971c.valueAt(i));
        }
        this.f32971c.clear();
    }

    @Override // p436y4.AbstractC14224b
    public synchronized boolean contains(int i) {
        return this.f32969a.m13062b(i);
    }

    @Override // p436y4.AbstractC14224b
    /* renamed from: d */
    public synchronized CloseableReference<Bitmap> mo246d(int i, int i2, int i3) {
        if (!this.f32970b) {
            return null;
        }
        return m253f(this.f32969a.m13060d());
    }

    @Override // p436y4.AbstractC14224b
    /* renamed from: e */
    public synchronized CloseableReference<Bitmap> mo245e(int i) {
        return m253f(this.f32969a.m13061c(i));
    }
}
