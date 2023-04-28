package p163j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import p163j$.util.C0512h;
import p163j$.util.Spliterator;
import p163j$.util.Spliterators;
import p163j$.util.function.AbstractC0489d;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.BiFunction;
import p163j$.util.function.C0487b;
import p163j$.util.function.C0488c;
import p163j$.util.function.C9309g0;
import p163j$.util.function.Consumer;
import p163j$.util.function.Function;
import p163j$.util.function.IntFunction;
import p163j$.util.function.Predicate;
import p163j$.util.function.ToDoubleFunction;
import p163j$.util.function.ToIntFunction;
import p163j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.W1 */
/* loaded from: classes2.dex */
abstract class AbstractC9409W1 extends AbstractC0533c implements Stream {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9409W1(Spliterator spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9409W1(AbstractC0533c cVar, int i) {
        super(cVar, i);
    }

    @Override // p163j$.util.stream.Stream
    /* renamed from: D */
    public final boolean mo16428D(Predicate predicate) {
        return ((Boolean) m16386M0(AbstractC0606t0.m16295H0(predicate, EnumC0595q0.ALL))).booleanValue();
    }

    @Override // p163j$.util.stream.Stream
    /* renamed from: E */
    public final AbstractC0571k0 mo16427E(Function function) {
        function.getClass();
        return new C0617w(this, EnumC9394S2.f20574p | EnumC9394S2.f20572n | EnumC9394S2.f20578t, function, 6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0606t0
    /* renamed from: G0 */
    public final AbstractC0622x0 mo16296G0(long j, IntFunction intFunction) {
        return AbstractC0606t0.m16267l0(j, intFunction);
    }

    @Override // p163j$.util.stream.Stream
    /* renamed from: I */
    public final boolean mo16426I(Predicate predicate) {
        return ((Boolean) m16386M0(AbstractC0606t0.m16295H0(predicate, EnumC0595q0.NONE))).booleanValue();
    }

    @Override // p163j$.util.stream.Stream
    /* renamed from: J */
    public final AbstractC0571k0 mo16425J(ToLongFunction toLongFunction) {
        toLongFunction.getClass();
        return new C0617w(this, EnumC9394S2.f20574p | EnumC9394S2.f20572n, toLongFunction, 7);
    }

    @Override // p163j$.util.stream.Stream
    /* renamed from: L */
    public final AbstractC9328D mo16424L(ToDoubleFunction toDoubleFunction) {
        toDoubleFunction.getClass();
        return new C0605t(this, EnumC9394S2.f20574p | EnumC9394S2.f20572n, toDoubleFunction, 6);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: O0 */
    final AbstractC9324C0 mo16360O0(AbstractC0606t0 t0Var, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0606t0.m16266m0(t0Var, spliterator, z, intFunction);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: P0 */
    final void mo16359P0(Spliterator spliterator, AbstractC0546e2 e2Var) {
        while (!e2Var.mo16234e() && spliterator.tryAdvance(e2Var)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: Q0 */
    public final EnumC9398T2 mo16358Q0() {
        return EnumC9398T2.REFERENCE;
    }

    @Override // p163j$.util.stream.Stream
    /* renamed from: a */
    public final IntStream mo16423a(Function function) {
        function.getClass();
        return new C0613v(this, EnumC9394S2.f20574p | EnumC9394S2.f20572n | EnumC9394S2.f20578t, function, 7);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: a1 */
    final Spliterator mo16357a1(AbstractC0606t0 t0Var, C0523a aVar, boolean z) {
        return new C9442z3(t0Var, aVar, z);
    }

    @Override // p163j$.util.stream.Stream
    /* renamed from: c */
    public final Object mo16422c(Object obj, C0488c cVar) {
        cVar.getClass();
        cVar.getClass();
        return m16386M0(new C0611u1(EnumC9398T2.REFERENCE, cVar, cVar, obj, 2));
    }

    @Override // p163j$.util.stream.Stream
    public final long count() {
        return ((AbstractC0563i0) mo16425J(new C9353I0(5))).sum();
    }

    @Override // p163j$.util.stream.Stream
    /* renamed from: d */
    public final Object mo16421d(C0566j jVar) {
        Object obj;
        if (!isParallel() || !jVar.m16349b().contains(EnumC0562i.CONCURRENT) || (m16383S0() && !jVar.m16349b().contains(EnumC0562i.UNORDERED))) {
            jVar.getClass();
            C9309g0 f = jVar.m16345f();
            obj = m16386M0(new C9330D1(EnumC9398T2.REFERENCE, jVar.m16348c(), jVar.m16350a(), f, jVar));
        } else {
            obj = jVar.m16345f().get();
            forEach(new C0578m(5, jVar.m16350a(), obj));
        }
        return jVar.m16349b().contains(EnumC0562i.IDENTITY_FINISH) ? obj : jVar.m16346e().apply(obj);
    }

    @Override // p163j$.util.stream.Stream
    public final Stream distinct() {
        return new C0590p(this, EnumC9394S2.f20571m | EnumC9394S2.f20578t);
    }

    @Override // p163j$.util.stream.Stream
    /* renamed from: e */
    public final Object mo16420e(C9309g0 g0Var, BiConsumer biConsumer, BiConsumer biConsumer2) {
        g0Var.getClass();
        biConsumer.getClass();
        biConsumer2.getClass();
        return m16386M0(new C0611u1(EnumC9398T2.REFERENCE, biConsumer2, biConsumer, g0Var, 3));
    }

    @Override // p163j$.util.stream.Stream
    /* renamed from: f */
    public final AbstractC9328D mo16419f(Function function) {
        function.getClass();
        return new C0605t(this, EnumC9394S2.f20574p | EnumC9394S2.f20572n | EnumC9394S2.f20578t, function, 7);
    }

    @Override // p163j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new C0609u(this, EnumC9394S2.f20578t, predicate, 4);
    }

    @Override // p163j$.util.stream.Stream
    public final C0512h findAny() {
        return (C0512h) m16386M0(new C9333E(false, EnumC9398T2.REFERENCE, C0512h.m16509a(), new C9353I0(25), new C0528b(12)));
    }

    @Override // p163j$.util.stream.Stream
    public final C0512h findFirst() {
        return (C0512h) m16386M0(new C9333E(true, EnumC9398T2.REFERENCE, C0512h.m16509a(), new C9353I0(25), new C0528b(12)));
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        m16386M0(new C9376O(consumer, false));
    }

    @Override // p163j$.util.stream.Stream
    /* renamed from: h */
    public final Object mo16418h(Object obj, BiFunction biFunction, C0488c cVar) {
        biFunction.getClass();
        cVar.getClass();
        return m16386M0(new C0611u1(EnumC9398T2.REFERENCE, cVar, biFunction, obj, 2));
    }

    @Override // p163j$.util.stream.AbstractC0558h
    public final Iterator iterator() {
        return Spliterators.m16587i(spliterator());
    }

    @Override // p163j$.util.stream.Stream
    /* renamed from: j */
    public final Stream mo16417j(Consumer consumer) {
        consumer.getClass();
        return new C0609u(this, 0, consumer, 3);
    }

    @Override // p163j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j >= 0) {
            return AbstractC0593p2.m16309h(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p163j$.util.stream.Stream
    public final C0512h max(Comparator comparator) {
        comparator.getClass();
        return mo16411x(new C0487b(0, comparator));
    }

    @Override // p163j$.util.stream.Stream
    public final C0512h min(Comparator comparator) {
        comparator.getClass();
        return mo16411x(new C0487b(1, comparator));
    }

    @Override // p163j$.util.stream.Stream
    /* renamed from: p */
    public final boolean mo16416p(Predicate predicate) {
        return ((Boolean) m16386M0(AbstractC0606t0.m16295H0(predicate, EnumC0595q0.ANY))).booleanValue();
    }

    /* renamed from: s */
    public void mo16415s(Consumer consumer) {
        consumer.getClass();
        m16386M0(new C9376O(consumer, true));
    }

    @Override // p163j$.util.stream.Stream
    public final Stream skip(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? this : AbstractC0593p2.m16309h(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p163j$.util.stream.Stream
    public final Stream sorted() {
        return new C9316A2(this);
    }

    @Override // p163j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new C9316A2(this, comparator);
    }

    @Override // p163j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new C9353I0(4));
    }

    @Override // p163j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC0606t0.m16256w0(m16385N0(intFunction), intFunction).mo16318m(intFunction);
    }

    @Override // p163j$.util.stream.Stream
    /* renamed from: u */
    public final IntStream mo16414u(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new C0613v(this, EnumC9394S2.f20574p | EnumC9394S2.f20572n, toIntFunction, 6);
    }

    @Override // p163j$.util.stream.AbstractC0558h
    public final AbstractC0558h unordered() {
        return !m16383S0() ? this : new C9389R1(this, EnumC9394S2.f20576r);
    }

    @Override // p163j$.util.stream.Stream
    /* renamed from: v */
    public final Stream mo16413v(Function function) {
        function.getClass();
        return new C9393S1(this, EnumC9394S2.f20574p | EnumC9394S2.f20572n, function, 0);
    }

    @Override // p163j$.util.stream.Stream
    /* renamed from: w */
    public final Stream mo16412w(Function function) {
        function.getClass();
        return new C9393S1(this, EnumC9394S2.f20574p | EnumC9394S2.f20572n | EnumC9394S2.f20578t, function, 1);
    }

    @Override // p163j$.util.stream.Stream
    /* renamed from: x */
    public final C0512h mo16411x(AbstractC0489d dVar) {
        dVar.getClass();
        return (C0512h) m16386M0(new C0627y1(EnumC9398T2.REFERENCE, dVar, 1));
    }
}
