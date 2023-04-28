package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.core.util.C2517g;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p053d0.C6390b;
import p390w.AbstractC13571b0;
import p390w.AbstractC13589e0;
import p390w.AbstractC13597g0;
import p390w.AbstractC13617k1;
import p390w.AbstractC13662r0;
import p390w.AbstractC13689w0;
import p390w.AbstractC13697x2;
import p390w.AbstractC13702y2;
import p390w.C13619k2;
import p390w.C13696x1;
import p451z.AbstractC14506i;

/* renamed from: androidx.camera.core.w2 */
/* loaded from: classes.dex */
public abstract class AbstractC1948w2 {

    /* renamed from: d */
    private AbstractC13697x2<?> f2023d;

    /* renamed from: e */
    private AbstractC13697x2<?> f2024e;

    /* renamed from: f */
    private AbstractC13697x2<?> f2025f;

    /* renamed from: g */
    private Size f2026g;

    /* renamed from: h */
    private AbstractC13697x2<?> f2027h;

    /* renamed from: i */
    private Rect f2028i;

    /* renamed from: j */
    private AbstractC13597g0 f2029j;

    /* renamed from: a */
    private final Set<AbstractC1952d> f2020a = new HashSet();

    /* renamed from: b */
    private final Object f2021b = new Object();

    /* renamed from: c */
    private EnumC1951c f2022c = EnumC1951c.INACTIVE;

    /* renamed from: k */
    private C13619k2 f2030k = C13619k2.m3207a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.w2$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C1949a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2031a;

        static {
            int[] iArr = new int[EnumC1951c.values().length];
            f2031a = iArr;
            try {
                iArr[EnumC1951c.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2031a[EnumC1951c.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: androidx.camera.core.w2$b */
    /* loaded from: classes.dex */
    public interface AbstractC1950b {
        /* renamed from: a */
        void mo25342a();

        /* renamed from: b */
        void mo25341b(AbstractC1911r rVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.w2$c */
    /* loaded from: classes.dex */
    public enum EnumC1951c {
        ACTIVE,
        INACTIVE
    }

    /* renamed from: androidx.camera.core.w2$d */
    /* loaded from: classes.dex */
    public interface AbstractC1952d {
        /* renamed from: c */
        void mo8505c(AbstractC1948w2 w2Var);

        /* renamed from: e */
        void mo8502e(AbstractC1948w2 w2Var);

        /* renamed from: k */
        void mo8495k(AbstractC1948w2 w2Var);

        /* renamed from: m */
        void mo8492m(AbstractC1948w2 w2Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1948w2(AbstractC13697x2<?> x2Var) {
        this.f2024e = x2Var;
        this.f2025f = x2Var;
    }

    /* renamed from: E */
    private void m39443E(AbstractC1952d dVar) {
        this.f2020a.remove(dVar);
    }

    /* renamed from: a */
    private void m39438a(AbstractC1952d dVar) {
        this.f2020a.add(dVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public AbstractC13697x2<?> mo20570A(AbstractC13589e0 e0Var, AbstractC13697x2.AbstractC13698a<?, ?, ?> aVar) {
        return aVar.mo2998d();
    }

    /* renamed from: B */
    public void mo20569B() {
        mo39418x();
    }

    /* renamed from: C */
    public void mo20568C() {
    }

    /* renamed from: D */
    protected abstract Size mo20567D(Size size);

    /* renamed from: F */
    public void mo39442F(Matrix matrix) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G */
    public boolean m39441G(int i) {
        int t = ((AbstractC13617k1) m39433f()).mo2961t(-1);
        if (t != -1 && t == i) {
            return false;
        }
        AbstractC13697x2.AbstractC13698a<?, ?, ?> m = mo20548m(this.f2024e);
        C6390b.m25634a(m, i);
        this.f2024e = m.mo2998d();
        AbstractC13597g0 c = m39436c();
        if (c == null) {
            this.f2025f = this.f2024e;
            return true;
        }
        this.f2025f = m39425p(c.mo3265j(), this.f2023d, this.f2027h);
        return true;
    }

    /* renamed from: H */
    public void mo20566H(Rect rect) {
        this.f2028i = rect;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public void m39440I(C13619k2 k2Var) {
        this.f2030k = k2Var;
        for (AbstractC13689w0 w0Var : k2Var.m3199i()) {
            if (w0Var.m3021e() == null) {
                w0Var.m3011o(getClass());
            }
        }
    }

    /* renamed from: J */
    public void m39439J(Size size) {
        this.f2026g = mo20567D(size);
    }

    /* renamed from: b */
    public Size m39437b() {
        return this.f2026g;
    }

    /* renamed from: c */
    public AbstractC13597g0 m39436c() {
        AbstractC13597g0 g0Var;
        synchronized (this.f2021b) {
            g0Var = this.f2029j;
        }
        return g0Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public AbstractC13571b0 m39435d() {
        synchronized (this.f2021b) {
            AbstractC13597g0 g0Var = this.f2029j;
            if (g0Var == null) {
                return AbstractC13571b0.f30362a;
            }
            return g0Var.mo3269f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public String m39434e() {
        AbstractC13597g0 c = m39436c();
        return ((AbstractC13597g0) C2517g.m37587h(c, "No camera attached to use case: " + this)).mo3265j().mo3297b();
    }

    /* renamed from: f */
    public AbstractC13697x2<?> m39433f() {
        return this.f2025f;
    }

    /* renamed from: g */
    public abstract AbstractC13697x2<?> mo20549g(boolean z, AbstractC13702y2 y2Var);

    /* renamed from: h */
    public int m39432h() {
        return this.f2025f.mo2969j();
    }

    /* renamed from: i */
    public String m39431i() {
        AbstractC13697x2<?> x2Var = this.f2025f;
        return x2Var.mo303m("<UnknownUseCase-" + hashCode() + ">");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public int m39430j(AbstractC13597g0 g0Var) {
        return g0Var.mo3265j().mo8419g(m39428l());
    }

    /* renamed from: k */
    public C13619k2 m39429k() {
        return this.f2030k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    /* renamed from: l */
    public int m39428l() {
        return ((AbstractC13617k1) this.f2025f).mo2961t(0);
    }

    /* renamed from: m */
    public abstract AbstractC13697x2.AbstractC13698a<?, ?, ?> mo20548m(AbstractC13662r0 r0Var);

    /* renamed from: n */
    public Rect m39427n() {
        return this.f2028i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public boolean m39426o(String str) {
        if (m39436c() == null) {
            return false;
        }
        return Objects.equals(str, m39434e());
    }

    /* renamed from: p */
    public AbstractC13697x2<?> m39425p(AbstractC13589e0 e0Var, AbstractC13697x2<?> x2Var, AbstractC13697x2<?> x2Var2) {
        C13696x1 x1Var;
        if (x2Var2 != null) {
            x1Var = C13696x1.m3001K(x2Var2);
            x1Var.m3000L(AbstractC14506i.f32899s);
        } else {
            x1Var = C13696x1.m3002J();
        }
        for (AbstractC13662r0.AbstractC13663a<?> aVar : this.f2024e.mo2975c()) {
            x1Var.mo3003E(aVar, this.f2024e.mo2974d(aVar), this.f2024e.mo2976b(aVar));
        }
        if (x2Var != null) {
            for (AbstractC13662r0.AbstractC13663a<?> aVar2 : x2Var.mo2975c()) {
                if (!aVar2.mo3100c().equals(AbstractC14506i.f32899s.mo3100c())) {
                    x1Var.mo3003E(aVar2, x2Var.mo2974d(aVar2), x2Var.mo2976b(aVar2));
                }
            }
        }
        if (x1Var.mo2973e(AbstractC13617k1.f30422h)) {
            AbstractC13662r0.AbstractC13663a<Integer> aVar3 = AbstractC13617k1.f30420f;
            if (x1Var.mo2973e(aVar3)) {
                x1Var.m3000L(aVar3);
            }
        }
        return mo20570A(e0Var, mo20548m(x1Var));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public final void m39424q() {
        this.f2022c = EnumC1951c.ACTIVE;
        m39421t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final void m39423r() {
        this.f2022c = EnumC1951c.INACTIVE;
        m39421t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final void m39422s() {
        for (AbstractC1952d dVar : this.f2020a) {
            dVar.mo8495k(this);
        }
    }

    /* renamed from: t */
    public final void m39421t() {
        int i = C1949a.f2031a[this.f2022c.ordinal()];
        if (i == 1) {
            for (AbstractC1952d dVar : this.f2020a) {
                dVar.mo8492m(this);
            }
        } else if (i == 2) {
            for (AbstractC1952d dVar2 : this.f2020a) {
                dVar2.mo8505c(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final void m39420u() {
        for (AbstractC1952d dVar : this.f2020a) {
            dVar.mo8502e(this);
        }
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: v */
    public void m39419v(AbstractC13597g0 g0Var, AbstractC13697x2<?> x2Var, AbstractC13697x2<?> x2Var2) {
        synchronized (this.f2021b) {
            this.f2029j = g0Var;
            m39438a(g0Var);
        }
        this.f2023d = x2Var;
        this.f2027h = x2Var2;
        AbstractC13697x2<?> p = m39425p(g0Var.mo3265j(), this.f2023d, this.f2027h);
        this.f2025f = p;
        AbstractC1950b D = p.mo300D(null);
        if (D != null) {
            D.mo25341b(g0Var.mo3265j());
        }
        mo20547w();
    }

    /* renamed from: w */
    public void mo20547w() {
    }

    /* renamed from: x */
    protected void mo39418x() {
    }

    /* renamed from: y */
    public void m39417y(AbstractC13597g0 g0Var) {
        boolean z;
        mo20546z();
        AbstractC1950b D = this.f2025f.mo300D(null);
        if (D != null) {
            D.mo25342a();
        }
        synchronized (this.f2021b) {
            if (g0Var == this.f2029j) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37594a(z);
            m39443E(this.f2029j);
            this.f2029j = null;
        }
        this.f2026g = null;
        this.f2028i = null;
        this.f2025f = this.f2024e;
        this.f2023d = null;
        this.f2027h = null;
    }

    /* renamed from: z */
    public void mo20546z() {
    }
}
