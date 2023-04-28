package p378v3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p394w3.C13740j;

/* renamed from: v3.c */
/* loaded from: classes7.dex */
public class C13424c {

    /* renamed from: v3.c$a */
    /* loaded from: classes7.dex */
    public static class C13425a extends IOException {
        public C13425a(String str) {
            super(str);
        }

        public C13425a(String str, Throwable th2) {
            super(str);
            initCause(th2);
        }
    }

    /* renamed from: v3.c$b */
    /* loaded from: classes7.dex */
    public static class C13426b extends IOException {
        public C13426b(String str) {
            super(str);
        }
    }

    /* renamed from: v3.c$c */
    /* loaded from: classes7.dex */
    public static class C0435c extends FileNotFoundException {
        public C0435c(String str) {
            super(str);
        }
    }

    /* renamed from: v3.c$d */
    /* loaded from: classes7.dex */
    public static class C13427d extends IOException {
        public C13427d(String str, Throwable th2) {
            super(str);
            initCause(th2);
        }
    }

    /* renamed from: a */
    public static void m3749a(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!file.delete()) {
                    throw new C13425a(file.getAbsolutePath(), new C13426b(file.getAbsolutePath()));
                }
            } else {
                return;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new C13425a(file.getAbsolutePath());
        }
    }

    /* renamed from: b */
    public static void m3748b(File file, File file2) {
        Throwable th2;
        C13740j.m2834g(file);
        C13740j.m2834g(file2);
        file2.delete();
        if (!file.renameTo(file2)) {
            if (file2.exists()) {
                th2 = new C13426b(file2.getAbsolutePath());
            } else if (!file.getParentFile().exists()) {
                th2 = new C0435c(file.getAbsolutePath());
            } else if (!file.exists()) {
                th2 = new FileNotFoundException(file.getAbsolutePath());
            } else {
                th2 = null;
            }
            throw new C13427d("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath(), th2);
        }
    }
}
