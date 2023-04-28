package p001a0;

import android.media.ImageWriter;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import androidx.core.util.C2517g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a0.c */
/* loaded from: classes.dex */
final class C1232c {

    /* renamed from: a */
    private static Method f4a;

    static {
        try {
            Class cls = Integer.TYPE;
            f4a = ImageWriter.class.getMethod("newInstance", Surface.class, cls, cls);
        } catch (NoSuchMethodException e) {
            Log.i("ImageWriterCompatApi26", "Unable to initialize via reflection.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ImageWriter m41550a(Surface surface, int i, int i2) {
        Throwable th2 = null;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return (ImageWriter) C2517g.m37588g(f4a.invoke(null, surface, Integer.valueOf(i), Integer.valueOf(i2)));
            } catch (IllegalAccessException | InvocationTargetException e) {
                th2 = e;
            }
        }
        throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", th2);
    }
}
