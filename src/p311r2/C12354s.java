package p311r2;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p331s2.AbstractC12777c;

/* renamed from: r2.s */
/* loaded from: classes.dex */
class C12354s {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27740a = AbstractC12777c.C12778a.m5511a("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r2.s$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C12355a {

        /* renamed from: a */
        static final /* synthetic */ int[] f27741a;

        static {
            int[] iArr = new int[AbstractC12777c.EnumC12779b.values().length];
            f27741a = iArr;
            try {
                iArr[AbstractC12777c.EnumC12779b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27741a[AbstractC12777c.EnumC12779b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27741a[AbstractC12777c.EnumC12779b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    private static PointF m7095a(AbstractC12777c cVar, float f) {
        cVar.mo5493g();
        float s = (float) cVar.mo5486s();
        float s2 = (float) cVar.mo5486s();
        while (cVar.mo5497Q() != AbstractC12777c.EnumC12779b.END_ARRAY) {
            cVar.mo5494Y();
        }
        cVar.mo5491i();
        return new PointF(s * f, s2 * f);
    }

    /* renamed from: b */
    private static PointF m7094b(AbstractC12777c cVar, float f) {
        float s = (float) cVar.mo5486s();
        float s2 = (float) cVar.mo5486s();
        while (cVar.mo5488p()) {
            cVar.mo5494Y();
        }
        return new PointF(s * f, s2 * f);
    }

    /* renamed from: c */
    private static PointF m7093c(AbstractC12777c cVar, float f) {
        cVar.mo5492h();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (cVar.mo5488p()) {
            int S = cVar.mo5496S(f27740a);
            if (S == 0) {
                f2 = m7089g(cVar);
            } else if (S != 1) {
                cVar.mo5495U();
                cVar.mo5494Y();
            } else {
                f3 = m7089g(cVar);
            }
        }
        cVar.mo5489l();
        return new PointF(f2 * f, f3 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m7092d(AbstractC12777c cVar) {
        cVar.mo5493g();
        int s = (int) (cVar.mo5486s() * 255.0d);
        int s2 = (int) (cVar.mo5486s() * 255.0d);
        int s3 = (int) (cVar.mo5486s() * 255.0d);
        while (cVar.mo5488p()) {
            cVar.mo5494Y();
        }
        cVar.mo5491i();
        return Color.argb(255, s, s2, s3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static PointF m7091e(AbstractC12777c cVar, float f) {
        int i = C12355a.f27741a[cVar.mo5497Q().ordinal()];
        if (i == 1) {
            return m7094b(cVar, f);
        }
        if (i == 2) {
            return m7095a(cVar, f);
        }
        if (i == 3) {
            return m7093c(cVar, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.mo5497Q());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static List<PointF> m7090f(AbstractC12777c cVar, float f) {
        ArrayList arrayList = new ArrayList();
        cVar.mo5493g();
        while (cVar.mo5497Q() == AbstractC12777c.EnumC12779b.BEGIN_ARRAY) {
            cVar.mo5493g();
            arrayList.add(m7091e(cVar, f));
            cVar.mo5491i();
        }
        cVar.mo5491i();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static float m7089g(AbstractC12777c cVar) {
        AbstractC12777c.EnumC12779b Q = cVar.mo5497Q();
        int i = C12355a.f27741a[Q.ordinal()];
        if (i == 1) {
            return (float) cVar.mo5486s();
        }
        if (i == 2) {
            cVar.mo5493g();
            float s = (float) cVar.mo5486s();
            while (cVar.mo5488p()) {
                cVar.mo5494Y();
            }
            cVar.mo5491i();
            return s;
        }
        throw new IllegalArgumentException("Unknown value for token of type " + Q);
    }
}
