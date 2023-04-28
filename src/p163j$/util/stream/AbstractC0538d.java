package p163j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;
import p163j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.d */
/* loaded from: classes2.dex */
public abstract class AbstractC0538d extends AbstractC0548f {

    /* renamed from: h */
    protected final AtomicReference f20636h;

    /* renamed from: i */
    protected volatile boolean f20637i;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0538d(AbstractC0538d dVar, Spliterator spliterator) {
        super(dVar, spliterator);
        this.f20636h = dVar.f20636h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0538d(AbstractC0606t0 t0Var, Spliterator spliterator) {
        super(t0Var, spliterator);
        this.f20636h = new AtomicReference(null);
    }

    @Override // p163j$.util.stream.AbstractC0548f
    /* renamed from: b */
    public final Object mo16372b() {
        if (!(m16371c() == null)) {
            return super.mo16372b();
        }
        Object obj = this.f20636h.get();
        return obj == null ? mo16303i() : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
        r8 = r7.mo16305a();
     */
    @Override // p163j$.util.stream.AbstractC0548f, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void compute() {
        /*
            r10 = this;
            j$.util.Spliterator r0 = r10.f20650b
            long r1 = r0.estimateSize()
            long r3 = r10.f20651c
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x000f
            goto L_0x0015
        L_0x000f:
            long r3 = p163j$.util.stream.AbstractC0548f.m16369f(r1)
            r10.f20651c = r3
        L_0x0015:
            java.util.concurrent.atomic.AtomicReference r5 = r10.f20636h
            r6 = 0
            r7 = r10
        L_0x0019:
            java.lang.Object r8 = r5.get()
            if (r8 != 0) goto L_0x006f
            boolean r8 = r7.f20637i
            if (r8 != 0) goto L_0x0034
            j$.util.stream.f r9 = r7.m16371c()
        L_0x0027:
            j$.util.stream.d r9 = (p163j$.util.stream.AbstractC0538d) r9
            if (r8 != 0) goto L_0x0034
            if (r9 == 0) goto L_0x0034
            boolean r8 = r9.f20637i
            j$.util.stream.f r9 = r9.m16371c()
            goto L_0x0027
        L_0x0034:
            if (r8 == 0) goto L_0x003b
            java.lang.Object r8 = r7.mo16303i()
            goto L_0x006f
        L_0x003b:
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x006b
            j$.util.Spliterator r1 = r0.trySplit()
            if (r1 != 0) goto L_0x0046
            goto L_0x006b
        L_0x0046:
            j$.util.stream.f r2 = r7.mo16304d(r1)
            j$.util.stream.d r2 = (p163j$.util.stream.AbstractC0538d) r2
            r7.f20652d = r2
            j$.util.stream.f r8 = r7.mo16304d(r0)
            j$.util.stream.d r8 = (p163j$.util.stream.AbstractC0538d) r8
            r7.f20653e = r8
            r9 = 1
            r7.setPendingCount(r9)
            if (r6 == 0) goto L_0x0060
            r0 = r1
            r7 = r2
            r2 = r8
            goto L_0x0061
        L_0x0060:
            r7 = r8
        L_0x0061:
            r6 = r6 ^ 1
            r2.fork()
            long r1 = r0.estimateSize()
            goto L_0x0019
        L_0x006b:
            java.lang.Object r8 = r7.mo16305a()
        L_0x006f:
            r7.mo16370e(r8)
            r7.tryComplete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163j$.util.stream.AbstractC0538d.compute():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p163j$.util.stream.AbstractC0548f
    /* renamed from: e */
    public final void mo16370e(Object obj) {
        if (!(m16371c() == null)) {
            super.mo16370e(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.f20636h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    /* renamed from: g */
    protected void mo16331g() {
        this.f20637i = true;
    }

    @Override // p163j$.util.stream.AbstractC0548f, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return mo16372b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final void m16377h() {
        AbstractC0538d dVar = (AbstractC0538d) m16371c();
        AbstractC0538d dVar2 = this;
        while (dVar != null) {
            if (dVar.f20652d == dVar2) {
                AbstractC0538d dVar3 = (AbstractC0538d) dVar.f20653e;
                if (!dVar3.f20637i) {
                    dVar3.mo16331g();
                }
            }
            dVar = (AbstractC0538d) dVar.m16371c();
            dVar2 = dVar;
        }
    }

    /* renamed from: i */
    protected abstract Object mo16303i();
}
