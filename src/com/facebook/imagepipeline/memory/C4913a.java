package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p394w3.C13740j;
import p437y5.AbstractC14248s;

@TargetApi(27)
/* renamed from: com.facebook.imagepipeline.memory.a */
/* loaded from: classes7.dex */
public class C4913a implements AbstractC14248s, Closeable {

    /* renamed from: k */
    private SharedMemory f8309k;

    /* renamed from: l */
    private ByteBuffer f8310l;

    /* renamed from: m */
    private final long f8311m;

    public C4913a(int i) {
        boolean z;
        SharedMemory create;
        ByteBuffer mapReadWrite;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        try {
            create = SharedMemory.create("AshmemMemoryChunk", i);
            this.f8309k = create;
            mapReadWrite = create.mapReadWrite();
            this.f8310l = mapReadWrite;
            this.f8311m = System.identityHashCode(this);
        } catch (ErrnoException e) {
            throw new RuntimeException("Fail to create AshmemMemory", e);
        }
    }

    /* renamed from: b */
    private void m31319b(int i, AbstractC14248s sVar, int i2, int i3) {
        if (sVar instanceof C4913a) {
            C13740j.m2832i(!isClosed());
            C13740j.m2832i(!sVar.isClosed());
            C4925i.m31272b(i, sVar.getSize(), i2, i3, getSize());
            this.f8310l.position(i);
            sVar.mo1284a().position(i2);
            byte[] bArr = new byte[i3];
            this.f8310l.get(bArr, 0, i3);
            sVar.mo1284a().put(bArr, 0, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @Override // p437y5.AbstractC14248s
    /* renamed from: a */
    public ByteBuffer mo1284a() {
        return this.f8310l;
    }

    @Override // p437y5.AbstractC14248s, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!isClosed()) {
            SharedMemory.unmap(this.f8310l);
            this.f8309k.close();
            this.f8310l = null;
            this.f8309k = null;
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
        a = C4925i.m31273a(i, i3, getSize());
        C4925i.m31272b(i, bArr.length, i2, a, getSize());
        this.f8310l.position(i);
        this.f8310l.get(bArr, i2, a);
        return a;
    }

    @Override // p437y5.AbstractC14248s
    public int getSize() {
        int size;
        C13740j.m2832i(!isClosed());
        size = this.f8309k.getSize();
        return size;
    }

    @Override // p437y5.AbstractC14248s
    public synchronized boolean isClosed() {
        boolean z;
        if (this.f8310l != null) {
            if (this.f8309k != null) {
                z = false;
            }
        }
        z = true;
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
        if (i >= getSize()) {
            z3 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z3));
        return this.f8310l.get(i);
    }

    @Override // p437y5.AbstractC14248s
    /* renamed from: k */
    public long mo1281k() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // p437y5.AbstractC14248s
    /* renamed from: l */
    public long mo1280l() {
        return this.f8311m;
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
        a = C4925i.m31273a(i, i3, getSize());
        C4925i.m31272b(i, bArr.length, i2, a, getSize());
        this.f8310l.position(i);
        this.f8310l.put(bArr, i2, a);
        return a;
    }

    @Override // p437y5.AbstractC14248s
    /* renamed from: p */
    public void mo1278p(int i, AbstractC14248s sVar, int i2, int i3) {
        C13740j.m2834g(sVar);
        if (sVar.mo1280l() == mo1280l()) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(mo1280l()) + " to AshmemMemoryChunk " + Long.toHexString(sVar.mo1280l()) + " which are the same ");
            C13740j.m2839b(Boolean.FALSE);
        }
        if (sVar.mo1280l() < mo1280l()) {
            synchronized (sVar) {
                synchronized (this) {
                    m31319b(i, sVar, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (sVar) {
                m31319b(i, sVar, i2, i3);
            }
        }
    }
}
