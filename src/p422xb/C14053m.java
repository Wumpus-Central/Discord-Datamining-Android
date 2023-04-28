package p422xb;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p402wb.C13857a;

/* renamed from: xb.m */
/* loaded from: classes3.dex */
public class C14053m {
    @Deprecated

    /* renamed from: a */
    public float f31705a;
    @Deprecated

    /* renamed from: b */
    public float f31706b;
    @Deprecated

    /* renamed from: c */
    public float f31707c;
    @Deprecated

    /* renamed from: d */
    public float f31708d;
    @Deprecated

    /* renamed from: e */
    public float f31709e;
    @Deprecated

    /* renamed from: f */
    public float f31710f;

    /* renamed from: g */
    private final List<AbstractC14059f> f31711g = new ArrayList();

    /* renamed from: h */
    private final List<AbstractC14060g> f31712h = new ArrayList();

    /* renamed from: i */
    private boolean f31713i;

    /* renamed from: xb.m$a */
    /* loaded from: classes3.dex */
    class C14054a extends AbstractC14060g {

        /* renamed from: b */
        final /* synthetic */ List f31714b;

        /* renamed from: c */
        final /* synthetic */ Matrix f31715c;

        C14054a(List list, Matrix matrix) {
            this.f31714b = list;
            this.f31715c = matrix;
        }

        @Override // p422xb.C14053m.AbstractC14060g
        /* renamed from: a */
        public void mo1814a(Matrix matrix, C13857a aVar, int i, Canvas canvas) {
            for (AbstractC14060g gVar : this.f31714b) {
                gVar.mo1814a(this.f31715c, aVar, i, canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xb.m$b */
    /* loaded from: classes3.dex */
    public static class C14055b extends AbstractC14060g {

        /* renamed from: b */
        private final C14057d f31717b;

        public C14055b(C14057d dVar) {
            this.f31717b = dVar;
        }

        @Override // p422xb.C14053m.AbstractC14060g
        /* renamed from: a */
        public void mo1814a(Matrix matrix, C13857a aVar, int i, Canvas canvas) {
            aVar.m2532a(canvas, matrix, new RectF(this.f31717b.m1830k(), this.f31717b.m1826o(), this.f31717b.m1829l(), this.f31717b.m1831j()), i, this.f31717b.m1828m(), this.f31717b.m1827n());
        }
    }

    /* renamed from: xb.m$c */
    /* loaded from: classes3.dex */
    static class C14056c extends AbstractC14060g {

        /* renamed from: b */
        private final C14058e f31718b;

        /* renamed from: c */
        private final float f31719c;

        /* renamed from: d */
        private final float f31720d;

        public C14056c(C14058e eVar, float f, float f2) {
            this.f31718b = eVar;
            this.f31719c = f;
            this.f31720d = f2;
        }

        @Override // p422xb.C14053m.AbstractC14060g
        /* renamed from: a */
        public void mo1814a(Matrix matrix, C13857a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f31718b.f31729c - this.f31720d, this.f31718b.f31728b - this.f31719c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f31719c, this.f31720d);
            matrix2.preRotate(m1840c());
            aVar.m2531b(canvas, matrix2, rectF, i);
        }

        /* renamed from: c */
        float m1840c() {
            return (float) Math.toDegrees(Math.atan((this.f31718b.f31729c - this.f31720d) / (this.f31718b.f31728b - this.f31719c)));
        }
    }

    /* renamed from: xb.m$d */
    /* loaded from: classes3.dex */
    public static class C14057d extends AbstractC14059f {

        /* renamed from: h */
        private static final RectF f31721h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f31722b;
        @Deprecated

        /* renamed from: c */
        public float f31723c;
        @Deprecated

        /* renamed from: d */
        public float f31724d;
        @Deprecated

        /* renamed from: e */
        public float f31725e;
        @Deprecated

        /* renamed from: f */
        public float f31726f;
        @Deprecated

        /* renamed from: g */
        public float f31727g;

        public C14057d(float f, float f2, float f3, float f4) {
            m1824q(f);
            m1820u(f2);
            m1823r(f3);
            m1825p(f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public float m1831j() {
            return this.f31725e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public float m1830k() {
            return this.f31722b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public float m1829l() {
            return this.f31724d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public float m1828m() {
            return this.f31726f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public float m1827n() {
            return this.f31727g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public float m1826o() {
            return this.f31723c;
        }

        /* renamed from: p */
        private void m1825p(float f) {
            this.f31725e = f;
        }

        /* renamed from: q */
        private void m1824q(float f) {
            this.f31722b = f;
        }

        /* renamed from: r */
        private void m1823r(float f) {
            this.f31724d = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public void m1822s(float f) {
            this.f31726f = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public void m1821t(float f) {
            this.f31727g = f;
        }

        /* renamed from: u */
        private void m1820u(float f) {
            this.f31723c = f;
        }

        @Override // p422xb.C14053m.AbstractC14059f
        /* renamed from: a */
        public void mo1815a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f31730a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f31721h;
            rectF.set(m1830k(), m1826o(), m1829l(), m1831j());
            path.arcTo(rectF, m1828m(), m1827n(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: xb.m$e */
    /* loaded from: classes3.dex */
    public static class C14058e extends AbstractC14059f {

        /* renamed from: b */
        private float f31728b;

        /* renamed from: c */
        private float f31729c;

        @Override // p422xb.C14053m.AbstractC14059f
        /* renamed from: a */
        public void mo1815a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f31730a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f31728b, this.f31729c);
            path.transform(matrix);
        }
    }

    /* renamed from: xb.m$f */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC14059f {

        /* renamed from: a */
        protected final Matrix f31730a = new Matrix();

        /* renamed from: a */
        public abstract void mo1815a(Matrix matrix, Path path);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xb.m$g */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC14060g {

        /* renamed from: a */
        static final Matrix f31731a = new Matrix();

        AbstractC14060g() {
        }

        /* renamed from: a */
        public abstract void mo1814a(Matrix matrix, C13857a aVar, int i, Canvas canvas);

        /* renamed from: b */
        public final void m1813b(C13857a aVar, int i, Canvas canvas) {
            mo1814a(f31731a, aVar, i, canvas);
        }
    }

    public C14053m() {
        m1848n(0.0f, 0.0f);
    }

    /* renamed from: b */
    private void m1860b(float f) {
        if (m1855g() != f) {
            float g = ((f - m1855g()) + 360.0f) % 360.0f;
            if (g <= 180.0f) {
                C14057d dVar = new C14057d(m1853i(), m1852j(), m1853i(), m1852j());
                dVar.m1822s(m1855g());
                dVar.m1821t(g);
                this.f31712h.add(new C14055b(dVar));
                m1846p(f);
            }
        }
    }

    /* renamed from: c */
    private void m1859c(AbstractC14060g gVar, float f, float f2) {
        m1860b(f);
        this.f31712h.add(gVar);
        m1846p(f2);
    }

    /* renamed from: g */
    private float m1855g() {
        return this.f31709e;
    }

    /* renamed from: h */
    private float m1854h() {
        return this.f31710f;
    }

    /* renamed from: p */
    private void m1846p(float f) {
        this.f31709e = f;
    }

    /* renamed from: q */
    private void m1845q(float f) {
        this.f31710f = f;
    }

    /* renamed from: r */
    private void m1844r(float f) {
        this.f31707c = f;
    }

    /* renamed from: s */
    private void m1843s(float f) {
        this.f31708d = f;
    }

    /* renamed from: t */
    private void m1842t(float f) {
        this.f31705a = f;
    }

    /* renamed from: u */
    private void m1841u(float f) {
        this.f31706b = f;
    }

    /* renamed from: a */
    public void m1861a(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        float f7;
        C14057d dVar = new C14057d(f, f2, f3, f4);
        dVar.m1822s(f5);
        dVar.m1821t(f6);
        this.f31711g.add(dVar);
        C14055b bVar = new C14055b(dVar);
        float f8 = f5 + f6;
        if (f6 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        if (z) {
            f7 = (180.0f + f8) % 360.0f;
        } else {
            f7 = f8;
        }
        m1859c(bVar, f5, f7);
        double d = f8;
        m1844r(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m1843s(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: d */
    public void m1858d(Matrix matrix, Path path) {
        int size = this.f31711g.size();
        for (int i = 0; i < size; i++) {
            this.f31711g.get(i).mo1815a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m1857e() {
        return this.f31713i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public AbstractC14060g m1856f(Matrix matrix) {
        m1860b(m1854h());
        return new C14054a(new ArrayList(this.f31712h), new Matrix(matrix));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float m1853i() {
        return this.f31707c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m1852j() {
        return this.f31708d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public float m1851k() {
        return this.f31705a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public float m1850l() {
        return this.f31706b;
    }

    /* renamed from: m */
    public void m1849m(float f, float f2) {
        C14058e eVar = new C14058e();
        eVar.f31728b = f;
        eVar.f31729c = f2;
        this.f31711g.add(eVar);
        C14056c cVar = new C14056c(eVar, m1853i(), m1852j());
        m1859c(cVar, cVar.m1840c() + 270.0f, cVar.m1840c() + 270.0f);
        m1844r(f);
        m1843s(f2);
    }

    /* renamed from: n */
    public void m1848n(float f, float f2) {
        m1847o(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: o */
    public void m1847o(float f, float f2, float f3, float f4) {
        m1842t(f);
        m1841u(f2);
        m1844r(f);
        m1843s(f2);
        m1846p(f3);
        m1845q((f3 + f4) % 360.0f);
        this.f31711g.clear();
        this.f31712h.clear();
        this.f31713i = false;
    }
}
