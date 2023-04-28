package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* renamed from: com.facebook.soloader.k */
/* loaded from: classes7.dex */
public final class C5103k implements Closeable {

    /* renamed from: k */
    private FileOutputStream f8778k;

    /* renamed from: l */
    private FileLock f8779l;

    private C5103k(File file, boolean z) {
        m30735b(file, z);
    }

    /* renamed from: b */
    private void m30735b(File file, boolean z) {
        FileLock fileLock;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f8778k = fileOutputStream;
        try {
            if (z) {
                try {
                    fileLock = fileOutputStream.getChannel().tryLock();
                } catch (IOException unused) {
                    fileLock = null;
                }
            } else {
                fileLock = fileOutputStream.getChannel().lock();
            }
            if (fileLock == null) {
            }
            this.f8779l = fileLock;
        } finally {
            this.f8778k.close();
        }
    }

    /* renamed from: g */
    public static C5103k m30734g(File file) {
        return new C5103k(file, false);
    }

    /* renamed from: h */
    public static C5103k m30733h(File file) {
        C5103k kVar = new C5103k(file, true);
        if (kVar.f8779l != null) {
            return kVar;
        }
        kVar.close();
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            FileLock fileLock = this.f8779l;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f8778k.close();
        }
    }
}
