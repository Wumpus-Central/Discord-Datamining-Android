package p163j$.util.stream;

import p163j$.util.AbstractC0522s;
import p163j$.util.C0485f;
import p163j$.util.C0514j;
import p163j$.util.C0515k;
import p163j$.util.Spliterator;
import p163j$.util.Spliterators;
import p163j$.util.function.AbstractC0507w;
import p163j$.util.function.AbstractC9284G;
import p163j$.util.function.AbstractC9304b0;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.C9278A;
import p163j$.util.function.C9279B;
import p163j$.util.function.C9281D;
import p163j$.util.function.C9285H;
import p163j$.util.function.IntConsumer;
import p163j$.util.function.IntFunction;
import p163j$.util.function.Supplier;

/* renamed from: j$.util.stream.IntStream */
/* loaded from: classes2.dex */
public interface IntStream extends AbstractC0558h {

    /* renamed from: j$.util.stream.IntStream$-CC */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static IntStream range(int i, int i2) {
            if (i >= i2) {
                Spliterator.OfInt c = Spliterators.m16593c();
                return new C9415Y(c, EnumC9394S2.m16440c(c));
            }
            C9327C3 c3 = new C9327C3(i, i2);
            return new C9415Y(c3, EnumC9394S2.m16440c(c3));
        }
    }

    /* renamed from: A */
    void mo16405A(IntConsumer intConsumer);

    /* renamed from: B */
    Stream mo16404B(IntFunction intFunction);

    /* renamed from: C */
    void mo16403C(IntConsumer intConsumer);

    /* renamed from: F */
    boolean mo16402F(C9279B b);

    /* renamed from: G */
    C0515k mo16401G(AbstractC0507w wVar);

    /* renamed from: H */
    IntStream mo16400H(IntConsumer intConsumer);

    /* renamed from: K */
    boolean mo16399K(C9279B b);

    /* renamed from: M */
    IntStream mo16398M(C9278A a);

    AbstractC9328D asDoubleStream();

    AbstractC0571k0 asLongStream();

    C0514j average();

    /* renamed from: b */
    AbstractC0571k0 mo16397b(AbstractC9284G g);

    Stream boxed();

    long count();

    IntStream distinct();

    C0515k findAny();

    C0515k findFirst();

    /* renamed from: g */
    IntStream mo16394g(C9285H h);

    /* renamed from: i */
    int mo16393i(int i, AbstractC0507w wVar);

    @Override // p163j$.util.stream.AbstractC0558h
    AbstractC0522s iterator();

    /* renamed from: k */
    IntStream mo16392k(C9279B b);

    IntStream limit(long j);

    /* renamed from: m */
    boolean mo16391m(C9279B b);

    C0515k max();

    C0515k min();

    /* renamed from: n */
    Object mo16390n(Supplier supplier, AbstractC9304b0 b0Var, BiConsumer biConsumer);

    @Override // p163j$.util.stream.AbstractC0558h, p163j$.util.stream.AbstractC9328D
    IntStream parallel();

    /* renamed from: r */
    AbstractC9328D mo16389r(C9281D d);

    @Override // p163j$.util.stream.AbstractC0558h, p163j$.util.stream.AbstractC9328D
    IntStream sequential();

    IntStream skip(long j);

    IntStream sorted();

    @Override // p163j$.util.stream.AbstractC0558h
    Spliterator.OfInt spliterator();

    int sum();

    C0485f summaryStatistics();

    int[] toArray();
}
