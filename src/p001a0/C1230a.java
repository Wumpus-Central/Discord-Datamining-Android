package p001a0;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;

/* renamed from: a0.a */
/* loaded from: classes.dex */
public final class C1230a {
    /* renamed from: a */
    public static void m41559a(ImageWriter imageWriter) {
        C1231b.m41554a(imageWriter);
    }

    /* renamed from: b */
    public static Image m41558b(ImageWriter imageWriter) {
        return C1231b.m41553b(imageWriter);
    }

    /* renamed from: c */
    public static ImageWriter m41557c(Surface surface, int i) {
        return C1231b.m41552c(surface, i);
    }

    /* renamed from: d */
    public static ImageWriter m41556d(Surface surface, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            return C1234e.m41548a(surface, i, i2);
        }
        if (i3 >= 26) {
            return C1232c.m41550a(surface, i, i2);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int, int) on API " + i3 + ". Version 26 or higher required.");
    }

    /* renamed from: e */
    public static void m41555e(ImageWriter imageWriter, Image image) {
        C1231b.m41551d(imageWriter, image);
    }
}
