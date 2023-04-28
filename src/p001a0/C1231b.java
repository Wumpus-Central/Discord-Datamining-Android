package p001a0;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

/* renamed from: a0.b */
/* loaded from: classes.dex */
final class C1231b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m41554a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Image m41553b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static ImageWriter m41552c(Surface surface, int i) {
        return ImageWriter.newInstance(surface, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m41551d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}
