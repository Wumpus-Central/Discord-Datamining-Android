package p163j$.util.stream;

import p163j$.util.Spliterator;
import p163j$.util.function.IntFunction;

/* renamed from: j$.util.stream.o2 */
/* loaded from: classes2.dex */
final class C0589o2 extends AbstractC0538d {

    /* renamed from: j */
    private final AbstractC0533c f20718j;

    /* renamed from: k */
    private final IntFunction f20719k;

    /* renamed from: l */
    private final long f20720l;

    /* renamed from: m */
    private final long f20721m;

    /* renamed from: n */
    private long f20722n;

    /* renamed from: o */
    private volatile boolean f20723o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0589o2(AbstractC0533c cVar, AbstractC0533c cVar2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(cVar2, spliterator);
        this.f20718j = cVar;
        this.f20719k = intFunction;
        this.f20720l = j;
        this.f20721m = j2;
    }

    C0589o2(C0589o2 o2Var, Spliterator spliterator) {
        super(o2Var, spliterator);
        this.f20718j = o2Var.f20718j;
        this.f20719k = o2Var.f20719k;
        this.f20720l = o2Var.f20720l;
        this.f20721m = o2Var.f20721m;
    }

    /* renamed from: j */
    private long m16330j(long j) {
        if (this.f20723o) {
            return this.f20722n;
        }
        C0589o2 o2Var = (C0589o2) this.f20652d;
        C0589o2 o2Var2 = (C0589o2) this.f20653e;
        if (o2Var == null || o2Var2 == null) {
            return this.f20722n;
        }
        long j2 = o2Var.m16330j(j);
        return j2 >= j ? j2 : j2 + o2Var2.m16330j(j);
    }

    @Override // p163j$.util.stream.AbstractC0548f
    /* renamed from: a */
    protected final Object mo16305a() {
        long j = -1;
        if (m16371c() == null) {
            if (EnumC9394S2.SIZED.m16438e(this.f20718j.f20624j)) {
                j = this.f20718j.mo16257v0(this.f20650b);
            }
            AbstractC0622x0 G0 = this.f20718j.mo16296G0(j, this.f20719k);
            AbstractC0546e2 X0 = this.f20718j.mo16230X0(this.f20649a.mo16302A0(), G0);
            AbstractC0606t0 t0Var = this.f20649a;
            t0Var.mo16260s0(this.f20650b, t0Var.mo16293K0(X0));
            return G0.mo42182build();
        }
        AbstractC0606t0 t0Var2 = this.f20649a;
        AbstractC0622x0 G02 = t0Var2.mo16296G0(-1L, this.f20719k);
        t0Var2.mo16294J0(this.f20650b, G02);
        AbstractC9324C0 build = G02.mo42182build();
        this.f20722n = build.count();
        this.f20723o = true;
        this.f20650b = null;
        return build;
    }

    @Override // p163j$.util.stream.AbstractC0548f
    /* renamed from: d */
    protected final AbstractC0548f mo16304d(Spliterator spliterator) {
        return new C0589o2(this, spliterator);
    }

    @Override // p163j$.util.stream.AbstractC0538d
    /* renamed from: g */
    protected final void mo16331g() {
        this.f20637i = true;
        if (this.f20723o) {
            mo16370e(mo16303i());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final AbstractC9408W0 mo16303i() {
        return AbstractC0606t0.m16258u0(this.f20718j.mo16358Q0());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    @Override // p163j$.util.stream.AbstractC0548f, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r15) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p163j$.util.stream.C0589o2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
