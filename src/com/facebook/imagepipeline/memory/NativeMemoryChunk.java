package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p116g6.C7420a;
import p394w3.AbstractC13731d;
import p394w3.C13740j;
import p437y5.AbstractC14248s;

@AbstractC13731d
/* loaded from: classes7.dex */
public class NativeMemoryChunk implements AbstractC14248s, Closeable {

    /* renamed from: k */
    private final long f8306k;

    /* renamed from: l */
    private final int f8307l;

    /* renamed from: m */
    private boolean f8308m;

    static {
        C7420a.m22709d("imagepipeline");
    }

    public NativeMemoryChunk(int i) {
        C13740j.m2839b(Boolean.valueOf(i > 0));
        this.f8307l = i;
        this.f8306k = nativeAllocate(i);
        this.f8308m = false;
    }

    /* renamed from: b */
    private void m31321b(int i, AbstractC14248s sVar, int i2, int i3) {
        if (sVar instanceof NativeMemoryChunk) {
            C13740j.m2832i(!isClosed());
            C13740j.m2832i(!sVar.isClosed());
            C4925i.m31272b(i, sVar.getSize(), i2, i3, this.f8307l);
            nativeMemcpy(sVar.mo1281k() + i2, this.f8306k + i, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @AbstractC13731d
    private static native long nativeAllocate(int i);

    @AbstractC13731d
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @AbstractC13731d
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @AbstractC13731d
    private static native void nativeFree(long j);

    @AbstractC13731d
    private static native void nativeMemcpy(long j, long j2, int i);

    @AbstractC13731d
    private static native byte nativeReadByte(long j);

    @Override // p437y5.AbstractC14248s
    /* renamed from: a */
    public ByteBuffer mo1284a() {
        return null;
    }

    @Override // p437y5.AbstractC14248s, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f8308m) {
            this.f8308m = true;
            nativeFree(this.f8306k);
        }
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
        a = C4925i.m31273a(i, i3, this.f8307l);
        C4925i.m31272b(i, bArr.length, i2, a, this.f8307l);
        nativeCopyToByteArray(this.f8306k + i, bArr, i2, a);
        return a;
    }

    protected void finalize() {
        if (!isClosed()) {
            Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    @Override // p437y5.AbstractC14248s
    public int getSize() {
        return this.f8307l;
    }

    @Override // p437y5.AbstractC14248s
    public synchronized boolean isClosed() {
        return this.f8308m;
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
        if (i >= this.f8307l) {
            z3 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z3));
        return nativeReadByte(this.f8306k + i);
    }

    @Override // p437y5.AbstractC14248s
    /* renamed from: k */
    public long mo1281k() {
        return this.f8306k;
    }

    @Override // p437y5.AbstractC14248s
    /* renamed from: l */
    public long mo1280l() {
        return this.f8306k;
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
        a = C4925i.m31273a(i, i3, this.f8307l);
        C4925i.m31272b(i, bArr.length, i2, a, this.f8307l);
        nativeCopyFromByteArray(this.f8306k + i, bArr, i2, a);
        return a;
    }

    @Override // p437y5.AbstractC14248s
    /* renamed from: p */
    public void mo1278p(int i, AbstractC14248s sVar, int i2, int i3) {
        C13740j.m2834g(sVar);
        if (sVar.mo1280l() == mo1280l()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(sVar)) + " which share the same address " + Long.toHexString(this.f8306k));
            C13740j.m2839b(Boolean.FALSE);
        }
        if (sVar.mo1280l() < mo1280l()) {
            synchronized (sVar) {
                synchronized (this) {
                    m31321b(i, sVar, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (sVar) {
                m31321b(i, sVar, i2, i3);
            }
        }
    }

    public NativeMemoryChunk() {
        this.f8307l = 0;
        this.f8306k = 0L;
        this.f8308m = true;
    }
}
