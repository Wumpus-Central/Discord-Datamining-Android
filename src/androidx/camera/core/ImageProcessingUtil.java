package androidx.camera.core;

import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.AbstractC1833i0;
import java.nio.ByteBuffer;
import java.util.Locale;
import p001a0.C1230a;
import p390w.AbstractC13635m1;

/* loaded from: classes.dex */
final class ImageProcessingUtil {

    /* renamed from: a */
    private static int f1585a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.ImageProcessingUtil$a */
    /* loaded from: classes.dex */
    public enum EnumC1763a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    /* renamed from: c */
    public static boolean m39911c(ImageProxy imageProxy) {
        if (!m39906h(imageProxy)) {
            C1915r1.m39525c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return false;
        } else if (m39910d(imageProxy) != EnumC1763a.ERROR_CONVERSION) {
            return true;
        } else {
            C1915r1.m39525c("ImageProcessingUtil", "One pixel shift for YUV failure");
            return false;
        }
    }

    /* renamed from: d */
    private static EnumC1763a m39910d(ImageProxy imageProxy) {
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int d = imageProxy.mo39701d0()[0].mo39900d();
        int d2 = imageProxy.mo39701d0()[1].mo39900d();
        int d3 = imageProxy.mo39701d0()[2].mo39900d();
        int e = imageProxy.mo39701d0()[0].mo39899e();
        int e2 = imageProxy.mo39701d0()[1].mo39899e();
        if (nativeShiftPixel(imageProxy.mo39701d0()[0].mo39901c(), d, imageProxy.mo39701d0()[1].mo39901c(), d2, imageProxy.mo39701d0()[2].mo39901c(), d3, e, e2, width, height, e, e2, e2) != 0) {
            return EnumC1763a.ERROR_CONVERSION;
        }
        return EnumC1763a.SUCCESS;
    }

    /* renamed from: e */
    public static ImageProxy m39909e(final ImageProxy imageProxy, AbstractC13635m1 m1Var, ByteBuffer byteBuffer, int i, boolean z) {
        if (!m39906h(imageProxy)) {
            C1915r1.m39525c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!m39907g(i)) {
            C1915r1.m39525c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        } else if (m39908f(imageProxy, m1Var.getSurface(), byteBuffer, i, z) == EnumC1763a.ERROR_CONVERSION) {
            C1915r1.m39525c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        } else {
            if (Log.isLoggable("MH", 3)) {
                C1915r1.m39527a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(f1585a)));
                f1585a++;
            }
            final ImageProxy d = m1Var.mo3156d();
            if (d == null) {
                C1915r1.m39525c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
                return null;
            }
            C1892m2 m2Var = new C1892m2(d);
            m2Var.m39702b(new AbstractC1833i0.AbstractC1834a() { // from class: androidx.camera.core.l1
                @Override // androidx.camera.core.AbstractC1833i0.AbstractC1834a
                /* renamed from: c */
                public final void mo39498c(ImageProxy imageProxy2) {
                    ImageProcessingUtil.m39905i(ImageProxy.this, imageProxy, imageProxy2);
                }
            });
            return m2Var;
        }
    }

    /* renamed from: f */
    private static EnumC1763a m39908f(ImageProxy imageProxy, Surface surface, ByteBuffer byteBuffer, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int d = imageProxy.mo39701d0()[0].mo39900d();
        int d2 = imageProxy.mo39701d0()[1].mo39900d();
        int d3 = imageProxy.mo39701d0()[2].mo39900d();
        int e = imageProxy.mo39701d0()[0].mo39899e();
        int e2 = imageProxy.mo39701d0()[1].mo39899e();
        if (z) {
            i2 = e;
        } else {
            i2 = 0;
        }
        if (z) {
            i3 = e2;
        } else {
            i3 = 0;
        }
        if (z) {
            i4 = e2;
        } else {
            i4 = 0;
        }
        if (nativeConvertAndroid420ToABGR(imageProxy.mo39701d0()[0].mo39901c(), d, imageProxy.mo39701d0()[1].mo39901c(), d2, imageProxy.mo39701d0()[2].mo39901c(), d3, e, e2, surface, byteBuffer, width, height, i2, i3, i4, i) != 0) {
            return EnumC1763a.ERROR_CONVERSION;
        }
        return EnumC1763a.SUCCESS;
    }

    /* renamed from: g */
    private static boolean m39907g(int i) {
        return i == 0 || i == 90 || i == 180 || i == 270;
    }

    /* renamed from: h */
    private static boolean m39906h(ImageProxy imageProxy) {
        if (imageProxy.getFormat() == 35 && imageProxy.mo39701d0().length == 3) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m39905i(ImageProxy imageProxy, ImageProxy imageProxy2, ImageProxy imageProxy3) {
        if (imageProxy != null && imageProxy2 != null) {
            imageProxy2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m39904j(ImageProxy imageProxy, ImageProxy imageProxy2, ImageProxy imageProxy3) {
        if (imageProxy != null && imageProxy2 != null) {
            imageProxy2.close();
        }
    }

    /* renamed from: k */
    public static ImageProxy m39903k(final ImageProxy imageProxy, AbstractC13635m1 m1Var, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        EnumC1763a aVar;
        if (!m39906h(imageProxy)) {
            C1915r1.m39525c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        } else if (!m39907g(i)) {
            C1915r1.m39525c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        } else {
            EnumC1763a aVar2 = EnumC1763a.ERROR_CONVERSION;
            if (i > 0) {
                aVar = m39902l(imageProxy, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i);
            } else {
                aVar = aVar2;
            }
            if (aVar == aVar2) {
                C1915r1.m39525c("ImageProcessingUtil", "rotate YUV failure");
                return null;
            }
            final ImageProxy d = m1Var.mo3156d();
            if (d == null) {
                C1915r1.m39525c("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
                return null;
            }
            C1892m2 m2Var = new C1892m2(d);
            m2Var.m39702b(new AbstractC1833i0.AbstractC1834a() { // from class: androidx.camera.core.m1
                @Override // androidx.camera.core.AbstractC1833i0.AbstractC1834a
                /* renamed from: c */
                public final void mo39498c(ImageProxy imageProxy2) {
                    ImageProcessingUtil.m39904j(ImageProxy.this, imageProxy, imageProxy2);
                }
            });
            return m2Var;
        }
    }

    /* renamed from: l */
    private static EnumC1763a m39902l(ImageProxy imageProxy, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int d = imageProxy.mo39701d0()[0].mo39900d();
        int d2 = imageProxy.mo39701d0()[1].mo39900d();
        int d3 = imageProxy.mo39701d0()[2].mo39900d();
        int e = imageProxy.mo39701d0()[1].mo39899e();
        Image b = C1230a.m41558b(imageWriter);
        if (b == null) {
            return EnumC1763a.ERROR_CONVERSION;
        }
        if (nativeRotateYUV(imageProxy.mo39701d0()[0].mo39901c(), d, imageProxy.mo39701d0()[1].mo39901c(), d2, imageProxy.mo39701d0()[2].mo39901c(), d3, e, b.getPlanes()[0].getBuffer(), b.getPlanes()[0].getRowStride(), b.getPlanes()[0].getPixelStride(), b.getPlanes()[1].getBuffer(), b.getPlanes()[1].getRowStride(), b.getPlanes()[1].getPixelStride(), b.getPlanes()[2].getBuffer(), b.getPlanes()[2].getRowStride(), b.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) != 0) {
            return EnumC1763a.ERROR_CONVERSION;
        }
        C1230a.m41555e(imageWriter, b);
        return EnumC1763a.SUCCESS;
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);
}
