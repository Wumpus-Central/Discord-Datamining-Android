package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p394w3.C13740j;
import p437y5.AbstractC14248s;

/* renamed from: com.facebook.imagepipeline.memory.e */
/* loaded from: classes7.dex */
public class C4919e implements AbstractC14248s, Closeable {

    /* renamed from: k */
    private ByteBuffer f8329k;

    /* renamed from: l */
    private final int f8330l;

    /* renamed from: m */
    private final long f8331m = System.identityHashCode(this);

    public C4919e(int i) {
        this.f8329k = ByteBuffer.allocateDirect(i);
        this.f8330l = i;
    }

    /* renamed from: b */
    private void m31292b(int i, AbstractC14248s sVar, int i2, int i3) {
        if (sVar instanceof C4919e) {
            C13740j.m2832i(!isClosed());
            C13740j.m2832i(!sVar.isClosed());
            C4925i.m31272b(i, sVar.getSize(), i2, i3, this.f8330l);
            this.f8329k.position(i);
            sVar.mo1284a().position(i2);
            byte[] bArr = new byte[i3];
            this.f8329k.get(bArr, 0, i3);
            sVar.mo1284a().put(bArr, 0, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @Override // p437y5.AbstractC14248s
    /* renamed from: a */
    public synchronized ByteBuffer mo1284a() {
        return this.f8329k;
    }

    @Override // p437y5.AbstractC14248s, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f8329k = null;
    }

    @Override // p437y5.AbstractC14248s
    /* renamed from: f */
    public synchronized int mo1283f(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int a;
        C13740j.m2834g(bArr);
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2832i(z);
        a = C4925i.m31273a(i, i3, this.f8330l);
        C4925i.m31272b(i, bArr.length, i2, a, this.f8330l);
        this.f8329k.position(i);
        this.f8329k.get(bArr, i2, a);
        return a;
    }

    @Override // p437y5.AbstractC14248s
    public int getSize() {
        return this.f8330l;
    }

    @Override // p437y5.AbstractC14248s
    public synchronized boolean isClosed() {
        boolean z;
        if (this.f8329k == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // p437y5.AbstractC14248s
    /* renamed from: j */
    public synchronized byte mo1282j(int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2832i(z);
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z2));
        if (i >= this.f8330l) {
            z3 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z3));
        return this.f8329k.get(i);
    }

    @Override // p437y5.AbstractC14248s
    /* renamed from: k */
    public long mo1281k() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // p437y5.AbstractC14248s
    /* renamed from: l */
    public long mo1280l() {
        return this.f8331m;
    }

    @Override // p437y5.AbstractC14248s
    /* renamed from: n */
    public synchronized int mo1279n(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int a;
        C13740j.m2834g(bArr);
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2832i(z);
        a = C4925i.m31273a(i, i3, this.f8330l);
        C4925i.m31272b(i, bArr.length, i2, a, this.f8330l);
        this.f8329k.position(i);
        this.f8329k.put(bArr, i2, a);
        return a;
    }

    @Override // p437y5.AbstractC14248s
    /* renamed from: p */
    public void mo1278p(int i, AbstractC14248s sVar, int i2, int i3) {
        C13740j.m2834g(sVar);
        if (sVar.mo1280l() == mo1280l()) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(mo1280l()) + " to BufferMemoryChunk " + Long.toHexString(sVar.mo1280l()) + " which are the same ");
            C13740j.m2839b(Boolean.FALSE);
        }
        if (sVar.mo1280l() < mo1280l()) {
            synchronized (sVar) {
                synchronized (this) {
                    m31292b(i, sVar, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (sVar) {
                m31292b(i, sVar, i2, i3);
            }
        }
    }
}
