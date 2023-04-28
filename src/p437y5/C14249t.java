package p437y5;

import com.facebook.common.references.CloseableReference;
import java.nio.ByteBuffer;
import p394w3.C13740j;
import p455z3.AbstractC14535g;

/* renamed from: y5.t */
/* loaded from: classes7.dex */
public class C14249t implements AbstractC14535g {

    /* renamed from: k */
    private final int f32176k;

    /* renamed from: l */
    CloseableReference<AbstractC14248s> f32177l;

    public C14249t(CloseableReference<AbstractC14248s> closeableReference, int i) {
        boolean z;
        C13740j.m2834g(closeableReference);
        if (i < 0 || i > closeableReference.m32039C().getSize()) {
            z = false;
        } else {
            z = true;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        this.f32177l = closeableReference.clone();
        this.f32176k = i;
    }

    @Override // p455z3.AbstractC14535g
    /* renamed from: a */
    public synchronized ByteBuffer mo267a() {
        return this.f32177l.m32039C().mo1284a();
    }

    /* renamed from: b */
    synchronized void m1277b() {
        if (isClosed()) {
            throw new AbstractC14535g.C14536a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        CloseableReference.m32025t(this.f32177l);
        this.f32177l = null;
    }

    @Override // p455z3.AbstractC14535g
    /* renamed from: f */
    public synchronized int mo266f(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        m1277b();
        if (i + i3 <= this.f32176k) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        return this.f32177l.m32039C().mo1283f(i, bArr, i2, i3);
    }

    @Override // p455z3.AbstractC14535g
    public synchronized boolean isClosed() {
        return !CloseableReference.m32036R(this.f32177l);
    }

    @Override // p455z3.AbstractC14535g
    /* renamed from: j */
    public synchronized byte mo265j(int i) {
        boolean z;
        m1277b();
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        if (i >= this.f32176k) {
            z2 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z2));
        return this.f32177l.m32039C().mo1282j(i);
    }

    @Override // p455z3.AbstractC14535g
    /* renamed from: k */
    public synchronized long mo264k() {
        m1277b();
        return this.f32177l.m32039C().mo1281k();
    }

    @Override // p455z3.AbstractC14535g
    public synchronized int size() {
        m1277b();
        return this.f32176k;
    }
}
