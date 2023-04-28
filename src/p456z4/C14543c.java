package p456z4;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import p436y4.AbstractC14224b;

/* renamed from: z4.c */
/* loaded from: classes7.dex */
public class C14543c implements AbstractC14224b {

    /* renamed from: a */
    private int f32973a = -1;

    /* renamed from: b */
    private CloseableReference<Bitmap> f32974b;

    /* renamed from: f */
    private synchronized void m250f() {
        CloseableReference.m32025t(this.f32974b);
        this.f32974b = null;
        this.f32973a = -1;
    }

    @Override // p436y4.AbstractC14224b
    /* renamed from: a */
    public void mo249a(int i, CloseableReference<Bitmap> closeableReference, int i2) {
    }

    @Override // p436y4.AbstractC14224b
    /* renamed from: b */
    public synchronized void mo248b(int i, CloseableReference<Bitmap> closeableReference, int i2) {
        if (closeableReference != null) {
            if (this.f32974b != null && closeableReference.m32039C().equals(this.f32974b.m32039C())) {
                return;
            }
        }
        CloseableReference.m32025t(this.f32974b);
        this.f32974b = CloseableReference.m32027r(closeableReference);
        this.f32973a = i;
    }

    @Override // p436y4.AbstractC14224b
    /* renamed from: c */
    public synchronized CloseableReference<Bitmap> mo247c(int i) {
        return CloseableReference.m32027r(this.f32974b);
    }

    @Override // p436y4.AbstractC14224b
    public synchronized void clear() {
        m250f();
    }

    @Override // p436y4.AbstractC14224b
    public synchronized boolean contains(int i) {
        boolean z;
        if (i == this.f32973a) {
            if (CloseableReference.m32036R(this.f32974b)) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override // p436y4.AbstractC14224b
    /* renamed from: d */
    public synchronized CloseableReference<Bitmap> mo246d(int i, int i2, int i3) {
        CloseableReference<Bitmap> r;
        r = CloseableReference.m32027r(this.f32974b);
        m250f();
        return r;
    }

    @Override // p436y4.AbstractC14224b
    /* renamed from: e */
    public synchronized CloseableReference<Bitmap> mo245e(int i) {
        if (this.f32973a != i) {
            return null;
        }
        return CloseableReference.m32027r(this.f32974b);
    }
}
