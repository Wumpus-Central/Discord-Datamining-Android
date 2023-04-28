package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: com.facebook.soloader.g */
/* loaded from: classes7.dex */
public class C5091g implements AbstractC5090f {

    /* renamed from: k */
    private File f8754k;

    /* renamed from: l */
    private FileInputStream f8755l;

    /* renamed from: m */
    private FileChannel f8756m;

    public C5091g(File file) {
        this.f8754k = file;
        m30744b();
    }

    @Override // com.facebook.soloader.AbstractC5090f
    /* renamed from: F */
    public int mo30743F(ByteBuffer byteBuffer, long j) {
        return this.f8756m.read(byteBuffer, j);
    }

    /* renamed from: b */
    public void m30744b() {
        FileInputStream fileInputStream = new FileInputStream(this.f8754k);
        this.f8755l = fileInputStream;
        this.f8756m = fileInputStream.getChannel();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8755l.close();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f8756m.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return this.f8756m.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        return this.f8756m.write(byteBuffer);
    }
}
