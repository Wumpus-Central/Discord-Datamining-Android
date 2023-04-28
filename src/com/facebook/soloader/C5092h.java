package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.facebook.soloader.h */
/* loaded from: classes7.dex */
public class C5092h implements AbstractC5090f {

    /* renamed from: k */
    private InputStream f8757k;

    /* renamed from: l */
    private final ZipEntry f8758l;

    /* renamed from: m */
    private final ZipFile f8759m;

    /* renamed from: n */
    private final long f8760n;

    /* renamed from: o */
    private boolean f8761o = true;

    /* renamed from: p */
    private long f8762p = 0;

    public C5092h(ZipFile zipFile, ZipEntry zipEntry) {
        this.f8759m = zipFile;
        this.f8758l = zipEntry;
        this.f8760n = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f8757k = inputStream;
        if (inputStream == null) {
            throw new IOException(zipEntry.getName() + "'s InputStream is null");
        }
    }

    @Override // com.facebook.soloader.AbstractC5090f
    /* renamed from: F */
    public int mo30743F(ByteBuffer byteBuffer, long j) {
        if (this.f8757k != null) {
            int remaining = byteBuffer.remaining();
            long j2 = this.f8760n - j;
            if (j2 <= 0) {
                return -1;
            }
            int i = (int) j2;
            if (remaining > i) {
                remaining = i;
            }
            m30742b(j);
            if (byteBuffer.hasArray()) {
                this.f8757k.read(byteBuffer.array(), 0, remaining);
                byteBuffer.position(byteBuffer.position() + remaining);
            } else {
                byte[] bArr = new byte[remaining];
                this.f8757k.read(bArr, 0, remaining);
                byteBuffer.put(bArr, 0, remaining);
            }
            this.f8762p += remaining;
            return remaining;
        }
        throw new IOException("InputStream is null");
    }

    /* renamed from: b */
    public AbstractC5090f m30742b(long j) {
        InputStream inputStream = this.f8757k;
        if (inputStream != null) {
            long j2 = this.f8762p;
            if (j == j2) {
                return this;
            }
            long j3 = this.f8760n;
            if (j > j3) {
                j = j3;
            }
            if (j >= j2) {
                inputStream.skip(j - j2);
            } else {
                inputStream.close();
                InputStream inputStream2 = this.f8759m.getInputStream(this.f8758l);
                this.f8757k = inputStream2;
                if (inputStream2 != null) {
                    inputStream2.skip(j);
                } else {
                    throw new IOException(this.f8758l.getName() + "'s InputStream is null");
                }
            }
            this.f8762p = j;
            return this;
        }
        throw new IOException(this.f8758l.getName() + "'s InputStream is null");
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.f8757k;
        if (inputStream != null) {
            inputStream.close();
            this.f8761o = false;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f8761o;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return mo30743F(byteBuffer, this.f8762p);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
