package p145i0;

import androidx.core.util.C2517g;

/* renamed from: i0.i1 */
/* loaded from: classes.dex */
public abstract class AbstractC8143i1 {

    /* renamed from: a */
    private final AbstractC8188s f17610a;

    /* renamed from: b */
    private final AbstractC8203y0 f17611b;

    /* renamed from: i0.i1$a */
    /* loaded from: classes.dex */
    public static final class C8144a extends AbstractC8143i1 {

        /* renamed from: c */
        private final AbstractC8190t f17612c;

        /* renamed from: d */
        private final int f17613d;

        /* renamed from: e */
        private final Throwable f17614e;

        C8144a(AbstractC8188s sVar, AbstractC8203y0 y0Var, AbstractC8190t tVar, int i, Throwable th2) {
            super(sVar, y0Var);
            this.f17612c = tVar;
            this.f17613d = i;
            this.f17614e = th2;
        }

        /* renamed from: i */
        public Throwable m20514i() {
            return this.f17614e;
        }

        /* renamed from: j */
        public int m20513j() {
            return this.f17613d;
        }

        /* renamed from: k */
        public AbstractC8190t m20512k() {
            return this.f17612c;
        }

        /* renamed from: l */
        public boolean m20511l() {
            return this.f17613d != 0;
        }
    }

    /* renamed from: i0.i1$b */
    /* loaded from: classes.dex */
    public static final class C8145b extends AbstractC8143i1 {
        C8145b(AbstractC8188s sVar, AbstractC8203y0 y0Var) {
            super(sVar, y0Var);
        }
    }

    /* renamed from: i0.i1$c */
    /* loaded from: classes.dex */
    public static final class C8146c extends AbstractC8143i1 {
        C8146c(AbstractC8188s sVar, AbstractC8203y0 y0Var) {
            super(sVar, y0Var);
        }
    }

    /* renamed from: i0.i1$d */
    /* loaded from: classes.dex */
    public static final class C8147d extends AbstractC8143i1 {
        C8147d(AbstractC8188s sVar, AbstractC8203y0 y0Var) {
            super(sVar, y0Var);
        }
    }

    /* renamed from: i0.i1$e */
    /* loaded from: classes.dex */
    public static final class C8148e extends AbstractC8143i1 {
        C8148e(AbstractC8188s sVar, AbstractC8203y0 y0Var) {
            super(sVar, y0Var);
        }
    }

    AbstractC8143i1(AbstractC8188s sVar, AbstractC8203y0 y0Var) {
        this.f17610a = (AbstractC8188s) C2517g.m37588g(sVar);
        this.f17611b = (AbstractC8203y0) C2517g.m37588g(y0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C8144a m20522a(AbstractC8188s sVar, AbstractC8203y0 y0Var, AbstractC8190t tVar) {
        return new C8144a(sVar, y0Var, tVar, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C8144a m20521b(AbstractC8188s sVar, AbstractC8203y0 y0Var, AbstractC8190t tVar, int i, Throwable th2) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        C2517g.m37593b(z, "An error type is required.");
        return new C8144a(sVar, y0Var, tVar, i, th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C8145b m20518e(AbstractC8188s sVar, AbstractC8203y0 y0Var) {
        return new C8145b(sVar, y0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C8146c m20517f(AbstractC8188s sVar, AbstractC8203y0 y0Var) {
        return new C8146c(sVar, y0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C8147d m20516g(AbstractC8188s sVar, AbstractC8203y0 y0Var) {
        return new C8147d(sVar, y0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static C8148e m20515h(AbstractC8188s sVar, AbstractC8203y0 y0Var) {
        return new C8148e(sVar, y0Var);
    }

    /* renamed from: c */
    public AbstractC8188s m20520c() {
        return this.f17610a;
    }

    /* renamed from: d */
    public AbstractC8203y0 m20519d() {
        return this.f17611b;
    }
}
