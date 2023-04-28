package p163j$.util.stream;

import p163j$.util.AbstractC9236D;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntConsumer;
import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.a1 */
/* loaded from: classes2.dex */
public final class C0525a1 extends C9363K2 implements AbstractC0630z0, AbstractC0614v0 {
    @Override // p163j$.util.stream.AbstractC9319B0, p163j$.util.stream.AbstractC9324C0
    /* renamed from: a */
    public final AbstractC9319B0 mo16321a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final /* synthetic */ void accept(double d) {
        AbstractC0606t0.m16291O();
        throw null;
    }

    @Override // p163j$.util.stream.C9363K2, p163j$.util.function.IntConsumer
    public final void accept(int i) {
        super.accept(i);
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void accept(long j) {
        AbstractC0606t0.m16283W();
        throw null;
    }

    @Override // p163j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo16334d((Integer) obj);
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }

    @Override // p163j$.util.stream.AbstractC9379O2, p163j$.util.stream.AbstractC9319B0
    /* renamed from: b */
    public final Object mo16343b() {
        return (int[]) super.mo16343b();
    }

    @Override // p163j$.util.stream.AbstractC0614v0, p163j$.util.stream.AbstractC0622x0
    /* renamed from: build */
    public final AbstractC9324C0 mo42182build() {
        return this;
    }

    @Override // p163j$.util.stream.AbstractC0614v0, p163j$.util.stream.AbstractC0622x0
    /* renamed from: build  reason: collision with other method in class */
    public final AbstractC0630z0 mo42182build() {
        return this;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        clear();
        m16451r(j);
    }

    @Override // p163j$.util.stream.AbstractC0536c2
    /* renamed from: d */
    public final /* synthetic */ void mo16334d(Integer num) {
        AbstractC0606t0.m16288R(this, num);
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public final /* synthetic */ boolean mo16234e() {
        return false;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final void end() {
    }

    @Override // p163j$.util.stream.AbstractC9379O2, p163j$.util.stream.AbstractC9319B0
    /* renamed from: f */
    public final void mo16342f(int i, Object obj) {
        super.mo16342f(i, (int[]) obj);
    }

    @Override // p163j$.util.stream.AbstractC9379O2, p163j$.util.stream.AbstractC9319B0
    /* renamed from: g */
    public final void mo16341g(Object obj) {
        super.mo16341g((IntConsumer) obj);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: l */
    public final /* synthetic */ int mo16319l() {
        return 0;
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: m */
    public final /* synthetic */ Object[] mo16318m(IntFunction intFunction) {
        return AbstractC0606t0.m16282X(this, intFunction);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: n */
    public final /* synthetic */ AbstractC9324C0 mo16317n(long j, long j2, IntFunction intFunction) {
        return AbstractC0606t0.m16274f0(this, j, j2);
    }

    @Override // p163j$.util.stream.C9363K2, p163j$.util.stream.AbstractC9379O2, java.lang.Iterable
    /* renamed from: spliterator */
    public final AbstractC9236D mo42183spliterator() {
        return super.mo42183spliterator();
    }

    @Override // p163j$.util.stream.C9363K2, p163j$.util.stream.AbstractC9379O2, java.lang.Iterable
    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator mo42183spliterator() {
        return super.mo42183spliterator();
    }

    @Override // p163j$.util.stream.C9363K2
    /* renamed from: u */
    public final Spliterator.OfInt mo16408u() {
        return super.mo42183spliterator();
    }

    /* renamed from: v */
    public final /* synthetic */ void mo16320i(Integer[] numArr, int i) {
        AbstractC0606t0.m16280Z(this, numArr, i);
    }
}
