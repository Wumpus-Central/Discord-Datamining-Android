package p163j$.util;

import java.util.Comparator;
import p163j$.util.Spliterator;
import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.n */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0518n {
    /* renamed from: c */
    public static void m16489c(AbstractC9447y yVar, Consumer consumer) {
        if (consumer instanceof AbstractC0494i) {
            yVar.mo16224g((AbstractC0494i) consumer);
        } else if (!AbstractC9251T.f20302a) {
            consumer.getClass();
            yVar.mo16224g(new C0517m(consumer));
        } else {
            AbstractC9251T.m16583a(yVar.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        }
    }

    /* renamed from: d */
    public static void m16488d(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            ofInt.forEachRemaining((IntConsumer) consumer);
        } else if (!AbstractC9251T.f20302a) {
            consumer.getClass();
            ofInt.forEachRemaining((IntConsumer) new C0521q(consumer));
        } else {
            AbstractC9251T.m16583a(ofInt.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        }
    }

    /* renamed from: e */
    public static void m16487e(AbstractC9234B b, Consumer consumer) {
        if (consumer instanceof AbstractC9290M) {
            b.mo16362a((AbstractC9290M) consumer);
        } else if (!AbstractC9251T.f20302a) {
            consumer.getClass();
            b.mo16362a(new C0633t(consumer));
        } else {
            AbstractC9251T.m16583a(b.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        }
    }

    /* renamed from: h */
    public static boolean m16486h(AbstractC9447y yVar, Consumer consumer) {
        if (consumer instanceof AbstractC0494i) {
            return yVar.mo16225f((AbstractC0494i) consumer);
        }
        if (!AbstractC9251T.f20302a) {
            consumer.getClass();
            return yVar.mo16225f(new C0517m(consumer));
        }
        AbstractC9251T.m16583a(yVar.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
        throw null;
    }

    /* renamed from: i */
    public static boolean m16485i(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return ofInt.tryAdvance((IntConsumer) consumer);
        }
        if (!AbstractC9251T.f20302a) {
            consumer.getClass();
            return ofInt.tryAdvance((IntConsumer) new C0521q(consumer));
        }
        AbstractC9251T.m16583a(ofInt.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
        throw null;
    }

    /* renamed from: j */
    public static boolean m16484j(AbstractC9234B b, Consumer consumer) {
        if (consumer instanceof AbstractC9290M) {
            return b.mo16361b((AbstractC9290M) consumer);
        }
        if (!AbstractC9251T.f20302a) {
            consumer.getClass();
            return b.mo16361b(new C0633t(consumer));
        }
        AbstractC9251T.m16583a(b.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
        throw null;
    }

    /* renamed from: k */
    public static boolean m16483k(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: l */
    public static /* synthetic */ Comparator m16482l(Comparator comparator, Comparator comparator2) {
        return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : comparator2.getClass();
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
