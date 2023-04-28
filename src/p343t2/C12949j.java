package p343t2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import p126h2.C7742c;
import p167j2.C9485u;
import p188k2.C9730d;

/* renamed from: t2.j */
/* loaded from: classes.dex */
public final class C12949j {

    /* renamed from: a */
    private static final ThreadLocal<PathMeasure> f29040a = new C12950a();

    /* renamed from: b */
    private static final ThreadLocal<Path> f29041b = new C12951b();

    /* renamed from: c */
    private static final ThreadLocal<Path> f29042c = new C12952c();

    /* renamed from: d */
    private static final ThreadLocal<float[]> f29043d = new C12953d();

    /* renamed from: e */
    private static final float f29044e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* renamed from: t2.j$a */
    /* loaded from: classes.dex */
    class C12950a extends ThreadLocal<PathMeasure> {
        C12950a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* renamed from: t2.j$b */
    /* loaded from: classes.dex */
    class C12951b extends ThreadLocal<Path> {
        C12951b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: t2.j$c */
    /* loaded from: classes.dex */
    class C12952c extends ThreadLocal<Path> {
        C12952c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: t2.j$d */
    /* loaded from: classes.dex */
    class C12953d extends ThreadLocal<float[]> {
        C12953d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public float[] initialValue() {
            return new float[4];
        }
    }

    /* renamed from: a */
    public static void m4971a(Path path, float f, float f2, float f3) {
        C7742c.m21543a("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f29040a.get();
        Path path2 = f29041b.get();
        Path path3 = f29042c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C7742c.m21542b("applyTrimPathIfNeeded");
        } else if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            C7742c.m21542b("applyTrimPathIfNeeded");
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = C12948i.m4977f(min, length);
                max = C12948i.m4977f(max, length);
            }
            if (min < 0.0f) {
                min = C12948i.m4977f(min, length);
            }
            if (max < 0.0f) {
                max = C12948i.m4977f(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                C7742c.m21542b("applyTrimPathIfNeeded");
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            C7742c.m21542b("applyTrimPathIfNeeded");
        }
    }

    /* renamed from: b */
    public static void m4970b(Path path, C9485u uVar) {
        if (uVar != null && !uVar.m16156l()) {
            m4971a(path, ((C9730d) uVar.m16158j()).m15486p() / 100.0f, ((C9730d) uVar.m16160g()).m15486p() / 100.0f, ((C9730d) uVar.m16159i()).m15486p() / 360.0f);
        }
    }

    /* renamed from: c */
    public static void m4969c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static Path m4968d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF.x;
            float f2 = pointF2.x;
            float f3 = pointF2.y;
            path.cubicTo(pointF3.x + f, pointF.y + pointF3.y, f2 + pointF4.x, f3 + pointF4.y, f2, f3);
        }
        return path;
    }

    /* renamed from: e */
    public static float m4967e() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* renamed from: f */
    public static float m4966f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* renamed from: g */
    public static float m4965g(Matrix matrix) {
        float[] fArr = f29043d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f29044e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    /* renamed from: h */
    public static boolean m4964h(Matrix matrix) {
        float[] fArr = f29043d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static int m4963i(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (527 * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    /* renamed from: j */
    public static boolean m4962j(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    /* renamed from: k */
    public static boolean m4961k(Throwable th2) {
        return (th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException);
    }

    /* renamed from: l */
    public static Bitmap m4960l(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: m */
    public static void m4959m(Canvas canvas, RectF rectF, Paint paint) {
        m4958n(canvas, rectF, paint, 31);
    }

    /* renamed from: n */
    public static void m4958n(Canvas canvas, RectF rectF, Paint paint, int i) {
        C7742c.m21543a("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        C7742c.m21542b("Utils#saveLayer");
    }
}
