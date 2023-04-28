package p163j$.util.stream;

import java.util.LinkedHashSet;
import p163j$.util.C0484e;
import p163j$.util.C0485f;
import p163j$.util.C0511g;
import p163j$.util.C0512h;
import p163j$.util.C0514j;
import p163j$.util.C0515k;
import p163j$.util.C0516l;
import p163j$.util.function.AbstractC0489d;
import p163j$.util.function.AbstractC0492g;
import p163j$.util.function.AbstractC0496k;
import p163j$.util.function.AbstractC0507w;
import p163j$.util.function.AbstractC9292O;
import p163j$.util.function.AbstractC9302Z;
import p163j$.util.function.AbstractC9304b0;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntFunction;
import p163j$.util.function.Predicate;
import p163j$.util.function.Supplier;
import p163j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.I0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9353I0 implements AbstractC0489d, AbstractC9292O, IntFunction, ToLongFunction, Consumer, Supplier, BiConsumer, AbstractC0492g, AbstractC0496k, AbstractC9302Z, Predicate, AbstractC0507w, AbstractC9304b0 {

    /* renamed from: a */
    public final /* synthetic */ int f20504a;

    public /* synthetic */ C9353I0(int i) {
        this.f20504a = i;
    }

    @Override // p163j$.util.function.AbstractC9304b0
    /* renamed from: a */
    public final void mo16406a(int i, Object obj) {
        ((C0485f) obj).accept(i);
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
    }

    @Override // p163j$.util.function.AbstractC9302Z
    public final void accept(Object obj, double d) {
        ((C0484e) obj).accept(d);
    }

    @Override // p163j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f20504a) {
            case 16:
                ((LinkedHashSet) obj).add(obj2);
                return;
            case 17:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                return;
            default:
                ((C0484e) obj).m16553a((C0484e) obj2);
                return;
        }
    }

    @Override // p163j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f20504a) {
            case 23:
                return predicate.getClass();
            case 24:
                return predicate.getClass();
            case 25:
                return predicate.getClass();
            default:
                return predicate.getClass();
        }
    }

    @Override // p163j$.util.function.BiConsumer
    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f20504a) {
            case 16:
                return biConsumer.getClass();
            case 17:
                return biConsumer.getClass();
            default:
                return biConsumer.getClass();
        }
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f20504a) {
            case 10:
                return consumer.getClass();
            default:
                return consumer.getClass();
        }
    }

    @Override // p163j$.util.function.AbstractC0496k
    public final Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // p163j$.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.f20504a) {
            case 4:
                return new Object[i];
            case 5:
            default:
                return new Double[i];
            case 6:
                return new Object[i];
            case 7:
                return new Integer[i];
            case 8:
                return new Long[i];
        }
    }

    @Override // p163j$.util.function.AbstractC9292O
    public final Object apply(long j) {
        return AbstractC0606t0.m16300C0(j);
    }

    @Override // p163j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f20504a) {
            case 0:
                return new C9365L0((AbstractC0630z0) obj, (AbstractC0630z0) obj2);
            case 1:
            default:
                return new C9377O0((AbstractC9324C0) obj, (AbstractC9324C0) obj2);
            case 2:
                return new C9369M0((AbstractC9314A0) obj, (AbstractC9314A0) obj2);
        }
    }

    @Override // p163j$.util.function.AbstractC0492g
    public final double applyAsDouble(double d, double d2) {
        switch (this.f20504a) {
            case 18:
                return Math.min(d, d2);
            default:
                return Math.max(d, d2);
        }
    }

    @Override // p163j$.util.function.AbstractC0507w
    public final int applyAsInt(int i, int i2) {
        switch (this.f20504a) {
            case 27:
                return Math.min(i, i2);
            default:
                return i + i2;
        }
    }

    @Override // p163j$.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return 1L;
    }

    @Override // p163j$.util.function.Supplier
    public final Object get() {
        switch (this.f20504a) {
            case 12:
                return new C0484e();
            case 13:
                return new C0485f();
            case 14:
                return new C0511g();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // p163j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.f20504a) {
            case 23:
                return Predicate.CC.$default$negate(this);
            case 24:
                return Predicate.CC.$default$negate(this);
            case 25:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    @Override // p163j$.util.function.Predicate
    /* renamed from: or */
    public final /* synthetic */ Predicate mo16468or(Predicate predicate) {
        switch (this.f20504a) {
            case 23:
                return predicate.getClass();
            case 24:
                return predicate.getClass();
            case 25:
                return predicate.getClass();
            default:
                return predicate.getClass();
        }
    }

    @Override // p163j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f20504a) {
            case 23:
                return ((C0514j) obj).m16499c();
            case 24:
                return ((C0516l) obj).m16491c();
            case 25:
                return ((C0512h) obj).m16507c();
            default:
                return ((C0515k) obj).m16495c();
        }
    }
}
