package p163j$.util.stream;

import p163j$.util.Spliterator;
import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c */
/* loaded from: classes2.dex */
public abstract class AbstractC0533c extends AbstractC0606t0 implements AbstractC0558h {

    /* renamed from: h */
    private final AbstractC0533c f20622h;

    /* renamed from: i */
    private final AbstractC0533c f20623i;

    /* renamed from: j */
    protected final int f20624j;

    /* renamed from: k */
    private AbstractC0533c f20625k;

    /* renamed from: l */
    private int f20626l;

    /* renamed from: m */
    private int f20627m;

    /* renamed from: n */
    private Spliterator f20628n;

    /* renamed from: o */
    private boolean f20629o;

    /* renamed from: p */
    private boolean f20630p;

    /* renamed from: q */
    private Runnable f20631q;

    /* renamed from: r */
    private boolean f20632r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0533c(Spliterator spliterator, int i, boolean z) {
        this.f20623i = null;
        this.f20628n = spliterator;
        this.f20622h = this;
        int i2 = EnumC9394S2.f20565g & i;
        this.f20624j = i2;
        this.f20627m = (~(i2 << 1)) & EnumC9394S2.f20570l;
        this.f20626l = 0;
        this.f20632r = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0533c(AbstractC0533c cVar, int i) {
        if (!cVar.f20629o) {
            cVar.f20629o = true;
            cVar.f20625k = this;
            this.f20623i = cVar;
            this.f20624j = EnumC9394S2.f20566h & i;
            this.f20627m = EnumC9394S2.m16442a(i, cVar.f20627m);
            AbstractC0533c cVar2 = cVar.f20622h;
            this.f20622h = cVar2;
            if (mo16236W0()) {
                cVar2.f20630p = true;
            }
            this.f20626l = cVar.f20626l + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* renamed from: Y0 */
    private Spliterator m16381Y0(int i) {
        int i2;
        int i3;
        AbstractC0533c cVar = this.f20622h;
        Spliterator spliterator = cVar.f20628n;
        if (spliterator != null) {
            cVar.f20628n = null;
            if (cVar.f20632r && cVar.f20630p) {
                AbstractC0533c cVar2 = cVar.f20625k;
                int i4 = 1;
                while (cVar != this) {
                    int i5 = cVar2.f20624j;
                    if (cVar2.mo16236W0()) {
                        if (EnumC9394S2.SHORT_CIRCUIT.m16439d(i5)) {
                            i5 &= ~EnumC9394S2.f20579u;
                        }
                        spliterator = cVar2.mo16323V0(cVar, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i3 = (~EnumC9394S2.f20578t) & i5;
                            i2 = EnumC9394S2.f20577s;
                        } else {
                            i3 = (~EnumC9394S2.f20577s) & i5;
                            i2 = EnumC9394S2.f20578t;
                        }
                        i5 = i2 | i3;
                        i4 = 0;
                    }
                    i4++;
                    cVar2.f20626l = i4;
                    cVar2.f20627m = EnumC9394S2.m16442a(i5, cVar.f20627m);
                    cVar2 = cVar2.f20625k;
                    cVar = cVar2;
                }
            }
            if (i != 0) {
                this.f20627m = EnumC9394S2.m16442a(i, this.f20627m);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0606t0
    /* renamed from: A0 */
    public final int mo16302A0() {
        return this.f20627m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0606t0
    /* renamed from: J0 */
    public final AbstractC0546e2 mo16294J0(Spliterator spliterator, AbstractC0546e2 e2Var) {
        e2Var.getClass();
        mo16261r0(spliterator, mo16293K0(e2Var));
        return e2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0606t0
    /* renamed from: K0 */
    public final AbstractC0546e2 mo16293K0(AbstractC0546e2 e2Var) {
        e2Var.getClass();
        AbstractC0533c cVar = this;
        while (cVar.f20626l > 0) {
            AbstractC0533c cVar2 = cVar.f20623i;
            e2Var = cVar.mo16230X0(cVar2.f20627m, e2Var);
            cVar = cVar2;
        }
        return e2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0 */
    public final AbstractC9324C0 m16387L0(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.f20622h.f20632r) {
            return mo16360O0(this, spliterator, z, intFunction);
        }
        AbstractC0622x0 G0 = mo16296G0(mo16257v0(spliterator), intFunction);
        mo16294J0(spliterator, G0);
        return G0.mo42182build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M0 */
    public final Object m16386M0(AbstractC9332D3 d3) {
        if (!this.f20629o) {
            this.f20629o = true;
            return this.f20622h.f20632r ? d3.mo16268l(this, m16381Y0(d3.mo16254y())) : d3.mo16292N(this, m16381Y0(d3.mo16254y()));
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N0 */
    public final AbstractC9324C0 m16385N0(IntFunction intFunction) {
        AbstractC0533c cVar;
        if (!this.f20629o) {
            this.f20629o = true;
            if (!this.f20622h.f20632r || (cVar = this.f20623i) == null || !mo16236W0()) {
                return m16387L0(m16381Y0(0), true, intFunction);
            }
            this.f20626l = 0;
            return mo16231U0(cVar.m16381Y0(0), intFunction, cVar);
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* renamed from: O0 */
    abstract AbstractC9324C0 mo16360O0(AbstractC0606t0 t0Var, Spliterator spliterator, boolean z, IntFunction intFunction);

    /* renamed from: P0 */
    abstract void mo16359P0(Spliterator spliterator, AbstractC0546e2 e2Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public abstract EnumC9398T2 mo16358Q0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R0 */
    public final EnumC9398T2 m16384R0() {
        AbstractC0533c cVar = this;
        while (cVar.f20626l > 0) {
            cVar = cVar.f20623i;
        }
        return cVar.mo16358Q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S0 */
    public final boolean m16383S0() {
        return EnumC9394S2.ORDERED.m16439d(this.f20627m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T0 */
    public final /* synthetic */ Spliterator m16382T0() {
        return m16381Y0(0);
    }

    /* renamed from: U0 */
    AbstractC9324C0 mo16231U0(Spliterator spliterator, IntFunction intFunction, AbstractC0533c cVar) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    /* renamed from: V0 */
    Spliterator mo16323V0(AbstractC0533c cVar, Spliterator spliterator) {
        return mo16231U0(spliterator, new C0528b(0), cVar).mo42181spliterator();
    }

    /* renamed from: W0 */
    abstract boolean mo16236W0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X0 */
    public abstract AbstractC0546e2 mo16230X0(int i, AbstractC0546e2 e2Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public final Spliterator m16380Z0() {
        AbstractC0533c cVar = this.f20622h;
        if (this != cVar) {
            throw new IllegalStateException();
        } else if (!this.f20629o) {
            this.f20629o = true;
            Spliterator spliterator = cVar.f20628n;
            if (spliterator != null) {
                cVar.f20628n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        } else {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
    }

    /* renamed from: a1 */
    abstract Spliterator mo16357a1(AbstractC0606t0 t0Var, C0523a aVar, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1 */
    public final Spliterator m16379b1(Spliterator spliterator) {
        return this.f20626l == 0 ? spliterator : mo16357a1(this, new C0523a(0, spliterator), this.f20622h.f20632r);
    }

    @Override // p163j$.util.stream.AbstractC0558h, java.lang.AutoCloseable
    public final void close() {
        this.f20629o = true;
        this.f20628n = null;
        AbstractC0533c cVar = this.f20622h;
        Runnable runnable = cVar.f20631q;
        if (runnable != null) {
            cVar.f20631q = null;
            runnable.run();
        }
    }

    @Override // p163j$.util.stream.AbstractC0558h
    public final boolean isParallel() {
        return this.f20622h.f20632r;
    }

    @Override // p163j$.util.stream.AbstractC0558h
    public final AbstractC0558h onClose(Runnable runnable) {
        AbstractC0533c cVar = this.f20622h;
        Runnable runnable2 = cVar.f20631q;
        if (runnable2 != null) {
            runnable = new RunnableC9322B3(runnable2, runnable);
        }
        cVar.f20631q = runnable;
        return this;
    }

    public final AbstractC0558h parallel() {
        this.f20622h.f20632r = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0606t0
    /* renamed from: r0 */
    public final void mo16261r0(Spliterator spliterator, AbstractC0546e2 e2Var) {
        e2Var.getClass();
        if (!EnumC9394S2.SHORT_CIRCUIT.m16439d(this.f20627m)) {
            e2Var.mo16235c(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(e2Var);
            e2Var.end();
            return;
        }
        mo16260s0(spliterator, e2Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0606t0
    /* renamed from: s0 */
    public final void mo16260s0(Spliterator spliterator, AbstractC0546e2 e2Var) {
        AbstractC0533c cVar = this;
        while (cVar.f20626l > 0) {
            cVar = cVar.f20623i;
        }
        e2Var.mo16235c(spliterator.getExactSizeIfKnown());
        cVar.mo16359P0(spliterator, e2Var);
        e2Var.end();
    }

    public final AbstractC0558h sequential() {
        this.f20622h.f20632r = false;
        return this;
    }

    public Spliterator spliterator() {
        if (!this.f20629o) {
            this.f20629o = true;
            AbstractC0533c cVar = this.f20622h;
            if (this != cVar) {
                return mo16357a1(this, new C0523a(1, this), cVar.f20632r);
            }
            Spliterator spliterator = cVar.f20628n;
            if (spliterator != null) {
                cVar.f20628n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0606t0
    /* renamed from: v0 */
    public final long mo16257v0(Spliterator spliterator) {
        if (EnumC9394S2.SIZED.m16439d(this.f20627m)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }
}
