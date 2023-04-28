package p343t2;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p167j2.AbstractC9473k;
import p223m2.C10469a;
import p223m2.C10474e;
import p254o2.C11184n;

/* renamed from: t2.i */
/* loaded from: classes.dex */
public class C12948i {

    /* renamed from: a */
    private static final PointF f29039a = new PointF();

    /* renamed from: a */
    public static PointF m4982a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    public static float m4981b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: c */
    public static int m4980c(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* renamed from: d */
    public static boolean m4979d(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: e */
    private static int m4978e(int i, int i2) {
        boolean z;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (z || i4 == 0) {
            return i3;
        }
        return i3 - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m4977f(float f, float f2) {
        return m4976g((int) f, (int) f2);
    }

    /* renamed from: g */
    private static int m4976g(int i, int i2) {
        return i - (i2 * m4978e(i, i2));
    }

    /* renamed from: h */
    public static void m4975h(C11184n nVar, Path path) {
        path.reset();
        PointF b = nVar.m10556b();
        path.moveTo(b.x, b.y);
        f29039a.set(b.x, b.y);
        for (int i = 0; i < nVar.m10557a().size(); i++) {
            C10469a aVar = nVar.m10557a().get(i);
            PointF a = aVar.m13110a();
            PointF b2 = aVar.m13109b();
            PointF c = aVar.m13108c();
            PointF pointF = f29039a;
            if (!a.equals(pointF) || !b2.equals(c)) {
                path.cubicTo(a.x, a.y, b2.x, b2.y, c.x, c.y);
            } else {
                path.lineTo(c.x, c.y);
            }
            pointF.set(c.x, c.y);
        }
        if (nVar.m10554d()) {
            path.close();
        }
    }

    /* renamed from: i */
    public static float m4974i(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: j */
    public static int m4973j(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    /* renamed from: k */
    public static void m4972k(C10474e eVar, int i, List<C10474e> list, C10474e eVar2, AbstractC9473k kVar) {
        if (eVar.m13094c(kVar.getName(), i)) {
            list.add(eVar2.m13096a(kVar.getName()).m13088i(kVar));
        }
    }
}
