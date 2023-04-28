package androidx.core.util;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: androidx.core.util.a */
/* loaded from: classes.dex */
public class C2510a {

    /* renamed from: a */
    private final File f3482a;

    /* renamed from: b */
    private final File f3483b;

    /* renamed from: c */
    private final File f3484c;

    public C2510a(File file) {
        this.f3482a = file;
        this.f3483b = new File(file.getPath() + ".new");
        this.f3484c = new File(file.getPath() + ".bak");
    }

    /* renamed from: d */
    private static void m37605d(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    /* renamed from: f */
    private static boolean m37603f(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void m37608a(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            if (!m37603f(fileOutputStream)) {
                Log.e("AtomicFile", "Failed to sync file output stream");
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                Log.e("AtomicFile", "Failed to close file output stream", e);
            }
            if (!this.f3483b.delete()) {
                Log.e("AtomicFile", "Failed to delete new file " + this.f3483b);
            }
        }
    }

    /* renamed from: b */
    public void m37607b(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            if (!m37603f(fileOutputStream)) {
                Log.e("AtomicFile", "Failed to sync file output stream");
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                Log.e("AtomicFile", "Failed to close file output stream", e);
            }
            m37605d(this.f3483b, this.f3482a);
        }
    }

    /* renamed from: c */
    public File m37606c() {
        return this.f3482a;
    }

    /* renamed from: e */
    public FileOutputStream m37604e() {
        if (this.f3484c.exists()) {
            m37605d(this.f3484c, this.f3482a);
        }
        try {
            return new FileOutputStream(this.f3483b);
        } catch (FileNotFoundException unused) {
            if (this.f3483b.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.f3483b);
                } catch (FileNotFoundException e) {
                    throw new IOException("Failed to create new file " + this.f3483b, e);
                }
            } else {
                throw new IOException("Failed to create directory for " + this.f3483b);
            }
        }
    }
}
