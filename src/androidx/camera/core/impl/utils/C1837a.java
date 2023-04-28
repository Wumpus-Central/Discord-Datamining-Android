package androidx.camera.core.impl.utils;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* renamed from: androidx.camera.core.impl.utils.a */
/* loaded from: classes.dex */
class C1837a extends FilterOutputStream {

    /* renamed from: k */
    final OutputStream f1788k;

    /* renamed from: l */
    private ByteOrder f1789l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1837a(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f1788k = outputStream;
        this.f1789l = byteOrder;
    }

    /* renamed from: b */
    public void m39698b(ByteOrder byteOrder) {
        this.f1789l = byteOrder;
    }

    /* renamed from: g */
    public void m39697g(int i) {
        this.f1788k.write(i);
    }

    /* renamed from: h */
    public void m39696h(int i) {
        ByteOrder byteOrder = this.f1789l;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f1788k.write((i >>> 0) & 255);
            this.f1788k.write((i >>> 8) & 255);
            this.f1788k.write((i >>> 16) & 255);
            this.f1788k.write((i >>> 24) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f1788k.write((i >>> 24) & 255);
            this.f1788k.write((i >>> 16) & 255);
            this.f1788k.write((i >>> 8) & 255);
            this.f1788k.write((i >>> 0) & 255);
        }
    }

    /* renamed from: i */
    public void m39695i(short s) {
        ByteOrder byteOrder = this.f1789l;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f1788k.write((s >>> 0) & 255);
            this.f1788k.write((s >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f1788k.write((s >>> 8) & 255);
            this.f1788k.write((s >>> 0) & 255);
        }
    }

    /* renamed from: l */
    public void m39694l(long j) {
        m39696h((int) j);
    }

    /* renamed from: n */
    public void m39693n(int i) {
        m39695i((short) i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        this.f1788k.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.f1788k.write(bArr, i, i2);
    }
}
