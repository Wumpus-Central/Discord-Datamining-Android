package io.sentry.android.core;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: io.sentry.android.core.o0 */
/* loaded from: classes8.dex */
final class C8774o0 {

    /* renamed from: a */
    static String f19387a;

    /* renamed from: b */
    private static final Charset f19388b = Charset.forName("UTF-8");

    /* renamed from: a */
    public static synchronized String m18117a(Context context) {
        synchronized (C8774o0.class) {
            if (f19387a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                if (!file.exists()) {
                    String c = m18115c(file);
                    f19387a = c;
                    return c;
                }
                f19387a = m18116b(file);
            }
            return f19387a;
        }
    }

    /* renamed from: b */
    static String m18116b(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, f19388b);
            randomAccessFile.close();
            return str;
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: c */
    static String m18115c(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String uuid = UUID.randomUUID().toString();
            fileOutputStream.write(uuid.getBytes(f19388b));
            fileOutputStream.flush();
            fileOutputStream.close();
            return uuid;
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
