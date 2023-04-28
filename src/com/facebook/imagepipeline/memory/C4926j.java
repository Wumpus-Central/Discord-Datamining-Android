package com.facebook.imagepipeline.memory;

import com.facebook.common.references.CloseableReference;
import p394w3.C13740j;
import p437y5.AbstractC14248s;
import p437y5.C14249t;
import p455z3.AbstractC14539j;

/* renamed from: com.facebook.imagepipeline.memory.j */
/* loaded from: classes7.dex */
public class C4926j extends AbstractC14539j {

    /* renamed from: k */
    private final AbstractC4924h f8337k;

    /* renamed from: l */
    private CloseableReference<AbstractC14248s> f8338l;

    /* renamed from: m */
    private int f8339m;

    /* renamed from: com.facebook.imagepipeline.memory.j$a */
    /* loaded from: classes7.dex */
    public static class C4927a extends RuntimeException {
        public C4927a() {
            super("OutputStream no longer valid");
        }
    }

    public C4926j(AbstractC4924h hVar) {
        this(hVar, hVar.m31281D());
    }

    /* renamed from: g */
    private void m31271g() {
        if (!CloseableReference.m32036R(this.f8338l)) {
            throw new C4927a();
        }
    }

    @Override // p455z3.AbstractC14539j, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        CloseableReference.m32025t(this.f8338l);
        this.f8338l = null;
        this.f8339m = -1;
        super.close();
    }

    /* renamed from: h */
    void m31270h(int i) {
        m31271g();
        C13740j.m2834g(this.f8338l);
        if (i > this.f8338l.m32039C().getSize()) {
            AbstractC14248s sVar = this.f8337k.get(i);
            C13740j.m2834g(this.f8338l);
            this.f8338l.m32039C().mo1278p(0, sVar, 0, this.f8339m);
            this.f8338l.close();
            this.f8338l = CloseableReference.m32033Y(sVar, this.f8337k);
        }
    }

    /* renamed from: i */
    public C14249t mo258b() {
        m31271g();
        return new C14249t((CloseableReference) C13740j.m2834g(this.f8338l), this.f8339m);
    }

    @Override // p455z3.AbstractC14539j
    public int size() {
        return this.f8339m;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    public C4926j(AbstractC4924h hVar, int i) {
        C13740j.m2839b(Boolean.valueOf(i > 0));
        AbstractC4924h hVar2 = (AbstractC4924h) C13740j.m2834g(hVar);
        this.f8337k = hVar2;
        this.f8339m = 0;
        this.f8338l = CloseableReference.m32033Y(hVar2.get(i), hVar2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        m31271g();
        m31270h(this.f8339m + i2);
        ((AbstractC14248s) ((CloseableReference) C13740j.m2834g(this.f8338l)).m32039C()).mo1279n(this.f8339m, bArr, i, i2);
        this.f8339m += i2;
    }
}
