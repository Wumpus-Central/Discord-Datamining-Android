package p422xb;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: xb.l */
/* loaded from: classes3.dex */
public class C14049l {

    /* renamed from: a */
    private final C14053m[] f31687a = new C14053m[4];

    /* renamed from: b */
    private final Matrix[] f31688b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f31689c = new Matrix[4];

    /* renamed from: d */
    private final PointF f31690d = new PointF();

    /* renamed from: e */
    private final Path f31691e = new Path();

    /* renamed from: f */
    private final Path f31692f = new Path();

    /* renamed from: g */
    private final C14053m f31693g = new C14053m();

    /* renamed from: h */
    private final float[] f31694h = new float[2];

    /* renamed from: i */
    private final float[] f31695i = new float[2];

    /* renamed from: j */
    private final Path f31696j = new Path();

    /* renamed from: k */
    private final Path f31697k = new Path();

    /* renamed from: l */
    private boolean f31698l = true;

    /* renamed from: xb.l$a */
    /* loaded from: classes3.dex */
    private static class C14050a {

        /* renamed from: a */
        static final C14049l f31699a = new C14049l();
    }

    /* renamed from: xb.l$b */
    /* loaded from: classes3.dex */
    public interface AbstractC14051b {
        /* renamed from: a */
        void mo1863a(C14053m mVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo1862b(C14053m mVar, Matrix matrix, int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xb.l$c */
    /* loaded from: classes3.dex */
    public static final class C14052c {

        /* renamed from: a */
        public final C14045k f31700a;

        /* renamed from: b */
        public final Path f31701b;

        /* renamed from: c */
        public final RectF f31702c;

        /* renamed from: d */
        public final AbstractC14051b f31703d;

        /* renamed from: e */
        public final float f31704e;

        C14052c(C14045k kVar, float f, RectF rectF, AbstractC14051b bVar, Path path) {
            this.f31703d = bVar;
            this.f31700a = kVar;
            this.f31704e = f;
            this.f31702c = rectF;
            this.f31701b = path;
        }
    }

    public C14049l() {
        for (int i = 0; i < 4; i++) {
            this.f31687a[i] = new C14053m();
            this.f31688b[i] = new Matrix();
            this.f31689c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m1877a(int i) {
        return (i + 1) * 90;
    }

    /* renamed from: b */
    private void m1876b(C14052c cVar, int i) {
        this.f31694h[0] = this.f31687a[i].m1851k();
        this.f31694h[1] = this.f31687a[i].m1850l();
        this.f31688b[i].mapPoints(this.f31694h);
        if (i == 0) {
            Path path = cVar.f31701b;
            float[] fArr = this.f31694h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f31701b;
            float[] fArr2 = this.f31694h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f31687a[i].m1858d(this.f31688b[i], cVar.f31701b);
        AbstractC14051b bVar = cVar.f31703d;
        if (bVar != null) {
            bVar.mo1863a(this.f31687a[i], this.f31688b[i], i);
        }
    }

    /* renamed from: c */
    private void m1875c(C14052c cVar, int i) {
        int i2 = (i + 1) % 4;
        this.f31694h[0] = this.f31687a[i].m1853i();
        this.f31694h[1] = this.f31687a[i].m1852j();
        this.f31688b[i].mapPoints(this.f31694h);
        this.f31695i[0] = this.f31687a[i2].m1851k();
        this.f31695i[1] = this.f31687a[i2].m1850l();
        this.f31688b[i2].mapPoints(this.f31695i);
        float[] fArr = this.f31694h;
        float f = fArr[0];
        float[] fArr2 = this.f31695i;
        float max = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float i3 = m1869i(cVar.f31702c, i);
        this.f31693g.m1848n(0.0f, 0.0f);
        C14037f j = m1868j(i, cVar.f31700a);
        j.mo2006c(max, i3, cVar.f31704e, this.f31693g);
        this.f31696j.reset();
        this.f31693g.m1858d(this.f31689c[i], this.f31696j);
        if (!this.f31698l || (!j.m2007a() && !m1866l(this.f31696j, i) && !m1866l(this.f31696j, i2))) {
            this.f31693g.m1858d(this.f31689c[i], cVar.f31701b);
        } else {
            Path path = this.f31696j;
            path.op(path, this.f31692f, Path.Op.DIFFERENCE);
            this.f31694h[0] = this.f31693g.m1851k();
            this.f31694h[1] = this.f31693g.m1850l();
            this.f31689c[i].mapPoints(this.f31694h);
            Path path2 = this.f31691e;
            float[] fArr3 = this.f31694h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f31693g.m1858d(this.f31689c[i], this.f31691e);
        }
        AbstractC14051b bVar = cVar.f31703d;
        if (bVar != null) {
            bVar.mo1862b(this.f31693g, this.f31689c[i], i);
        }
    }

    /* renamed from: f */
    private void m1872f(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* renamed from: g */
    private AbstractC14034c m1871g(int i, C14045k kVar) {
        if (i == 1) {
            return kVar.m1924l();
        }
        if (i == 2) {
            return kVar.m1926j();
        }
        if (i != 3) {
            return kVar.m1916t();
        }
        return kVar.m1918r();
    }

    /* renamed from: h */
    private C14035d m1870h(int i, C14045k kVar) {
        if (i == 1) {
            return kVar.m1925k();
        }
        if (i == 2) {
            return kVar.m1927i();
        }
        if (i != 3) {
            return kVar.m1917s();
        }
        return kVar.m1919q();
    }

    /* renamed from: i */
    private float m1869i(RectF rectF, int i) {
        float[] fArr = this.f31694h;
        C14053m mVar = this.f31687a[i];
        fArr[0] = mVar.f31707c;
        fArr[1] = mVar.f31708d;
        this.f31688b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.f31694h[0]);
        }
        return Math.abs(rectF.centerY() - this.f31694h[1]);
    }

    /* renamed from: j */
    private C14037f m1868j(int i, C14045k kVar) {
        if (i == 1) {
            return kVar.m1928h();
        }
        if (i == 2) {
            return kVar.m1922n();
        }
        if (i != 3) {
            return kVar.m1921o();
        }
        return kVar.m1920p();
    }

    /* renamed from: k */
    public static C14049l m1867k() {
        return C14050a.f31699a;
    }

    /* renamed from: l */
    private boolean m1866l(Path path, int i) {
        this.f31697k.reset();
        this.f31687a[i].m1858d(this.f31688b[i], this.f31697k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f31697k.computeBounds(rectF, true);
        path.op(this.f31697k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private void m1865m(C14052c cVar, int i) {
        m1870h(i, cVar.f31700a).m2008b(this.f31687a[i], 90.0f, cVar.f31704e, cVar.f31702c, m1871g(i, cVar.f31700a));
        float a = m1877a(i);
        this.f31688b[i].reset();
        m1872f(i, cVar.f31702c, this.f31690d);
        Matrix matrix = this.f31688b[i];
        PointF pointF = this.f31690d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f31688b[i].preRotate(a);
    }

    /* renamed from: n */
    private void m1864n(int i) {
        this.f31694h[0] = this.f31687a[i].m1853i();
        this.f31694h[1] = this.f31687a[i].m1852j();
        this.f31688b[i].mapPoints(this.f31694h);
        float a = m1877a(i);
        this.f31689c[i].reset();
        Matrix matrix = this.f31689c[i];
        float[] fArr = this.f31694h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f31689c[i].preRotate(a);
    }

    /* renamed from: d */
    public void m1874d(C14045k kVar, float f, RectF rectF, Path path) {
        m1873e(kVar, f, rectF, null, path);
    }

    /* renamed from: e */
    public void m1873e(C14045k kVar, float f, RectF rectF, AbstractC14051b bVar, Path path) {
        path.rewind();
        this.f31691e.rewind();
        this.f31692f.rewind();
        this.f31692f.addRect(rectF, Path.Direction.CW);
        C14052c cVar = new C14052c(kVar, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            m1865m(cVar, i);
            m1864n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m1876b(cVar, i2);
            m1875c(cVar, i2);
        }
        path.close();
        this.f31691e.close();
        if (!this.f31691e.isEmpty()) {
            path.op(this.f31691e, Path.Op.UNION);
        }
    }
}
