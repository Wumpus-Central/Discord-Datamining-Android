package p119g9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: g9.b */
/* loaded from: classes5.dex */
public final class C7513b {

    /* renamed from: a */
    private final File f16289a;

    /* renamed from: b */
    private final File f16290b;

    /* renamed from: g9.b$a */
    /* loaded from: classes5.dex */
    private static final class C7514a extends OutputStream {

        /* renamed from: k */
        private final FileOutputStream f16291k;

        /* renamed from: l */
        private boolean f16292l = false;

        public C7514a(File file) {
            this.f16291k = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f16292l) {
                this.f16292l = true;
                flush();
                try {
                    this.f16291k.getFD().sync();
                } catch (IOException e) {
                    C7558r.m22103i("AtomicFile", "Failed to sync file descriptor:", e);
                }
                this.f16291k.close();
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.f16291k.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.f16291k.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.f16291k.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this.f16291k.write(bArr, i, i2);
        }
    }

    public C7513b(File file) {
        this.f16289a = file;
        this.f16290b = new File(file.getPath() + ".bak");
    }

    /* renamed from: e */
    private void m22355e() {
        if (this.f16290b.exists()) {
            this.f16289a.delete();
            this.f16290b.renameTo(this.f16289a);
        }
    }

    /* renamed from: a */
    public void m22359a() {
        this.f16289a.delete();
        this.f16290b.delete();
    }

    /* renamed from: b */
    public void m22358b(OutputStream outputStream) {
        outputStream.close();
        this.f16290b.delete();
    }

    /* renamed from: c */
    public boolean m22357c() {
        return this.f16289a.exists() || this.f16290b.exists();
    }

    /* renamed from: d */
    public InputStream m22356d() {
        m22355e();
        return new FileInputStream(this.f16289a);
    }

    /* renamed from: f */
    public OutputStream m22354f() {
        if (this.f16289a.exists()) {
            if (this.f16290b.exists()) {
                this.f16289a.delete();
            } else if (!this.f16289a.renameTo(this.f16290b)) {
                C7558r.m22104h("AtomicFile", "Couldn't rename file " + this.f16289a + " to backup file " + this.f16290b);
            }
        }
        try {
            return new C7514a(this.f16289a);
        } catch (FileNotFoundException e) {
            File parentFile = this.f16289a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f16289a, e);
            }
            try {
                return new C7514a(this.f16289a);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + this.f16289a, e2);
            }
        }
    }
}
