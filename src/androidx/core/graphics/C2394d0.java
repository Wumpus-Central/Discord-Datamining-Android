package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.core.provider.C2476g;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p163j$.util.Spliterator;

/* renamed from: androidx.core.graphics.d0 */
/* loaded from: classes.dex */
public class C2394d0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.d0$a */
    /* loaded from: classes.dex */
    public static class C2395a {
        /* renamed from: a */
        static ParcelFileDescriptor m37883a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    /* renamed from: a */
    public static void m37891a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static ByteBuffer m37890b(Context context, Resources resources, int i) {
        File e = m37887e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!m37889c(e, resources, i)) {
                return null;
            }
            return m37885g(e);
        } finally {
            e.delete();
        }
    }

    /* renamed from: c */
    public static boolean m37889c(File file, Resources resources, int i) {
        InputStream inputStream;
        Throwable th2;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean d = m37888d(file, inputStream);
                m37891a(inputStream);
                return d;
            } catch (Throwable th3) {
                th2 = th3;
                m37891a(inputStream);
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            inputStream = null;
        }
    }

    /* renamed from: d */
    public static boolean m37888d(File file, InputStream inputStream) {
        Throwable th2;
        IOException e;
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            byte[] bArr = new byte[Spliterator.IMMUTABLE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    m37891a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            m37891a(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th4) {
            th2 = th4;
            fileOutputStream2 = fileOutputStream;
            m37891a(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th2;
        }
    }

    /* renamed from: e */
    public static File m37887e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static ByteBuffer m37886f(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor a = C2395a.m37883a(context.getContentResolver(), uri, "r", cancellationSignal);
            if (a == null) {
                if (a != null) {
                    a.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(a.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                a.close();
                return map;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static ByteBuffer m37885g(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            fileInputStream.close();
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static Map<Uri, ByteBuffer> m37884h(Context context, C2476g.C2478b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C2476g.C2478b bVar : bVarArr) {
            if (bVar.m37673b() == 0) {
                Uri d = bVar.m37671d();
                if (!hashMap.containsKey(d)) {
                    hashMap.put(d, m37886f(context, cancellationSignal, d));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
