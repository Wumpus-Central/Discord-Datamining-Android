package p306qi;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C9899f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.sequences.Sequence;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:80)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:52)
    */
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000(\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000\u001a\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002\u001aE\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0011\u001a?\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a<\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00102\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b¨\u0006\u0019"}, m15073d2 = {"T", "", "Lkotlin/sequences/Sequence;", "c", "", "elements", "k", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "e", "f", "R", "Lkotlin/Function1;", "iterator", "g", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "d", "", "Lkotlin/Function0;", "nextFunction", "i", "seed", "h", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "seedFunction", "j", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/sequences/SequencesKt")
/* renamed from: qi.m */
/* loaded from: classes8.dex */
public class C12193m extends C12192l {

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, m15073d2 = {"qi/m$a", "Lkotlin/sequences/Sequence;", "", "iterator", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: qi.m$a */
    /* loaded from: classes8.dex */
    public static final class C12194a implements Sequence<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f27352a;

        public C12194a(Iterator it) {
            this.f27352a = it;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return this.f27352a;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"T", "Lkotlin/sequences/Sequence;", "it", "", "a", "(Lkotlin/sequences/Sequence;)Ljava/util/Iterator;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: qi.m$b */
    /* loaded from: classes8.dex */
    static final class C12195b extends AbstractC9973s implements Function1<Sequence<? extends T>, Iterator<? extends T>> {

        /* renamed from: k */
        public static final C12195b f27353k = new C12195b();

        C12195b() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final Iterator<T> invoke(Sequence<? extends T> it) {
            C9971q.m14633g(it, "it");
            return it.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"<anonymous>", "T", "R", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: qi.m$c */
    /* loaded from: classes8.dex */
    public static final class C12196c extends AbstractC9973s implements Function1<T, T> {

        /* renamed from: k */
        public static final C12196c f27354k = new C12196c();

        C12196c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t) {
            return t;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: qi.m$d */
    /* loaded from: classes8.dex */
    public static final class C12197d extends AbstractC9973s implements Function1<T, T> {

        /* renamed from: k */
        final /* synthetic */ Function0<T> f27355k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C12197d(Function0<? extends T> function0) {
            super(1);
            this.f27355k = function0;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T it) {
            C9971q.m14633g(it, "it");
            return this.f27355k.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: qi.m$e */
    /* loaded from: classes8.dex */
    public static final class C12198e extends AbstractC9973s implements Function0<T> {

        /* renamed from: k */
        final /* synthetic */ T f27356k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12198e(T t) {
            super(0);
            this.f27356k = t;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return this.f27356k;
        }
    }

    /* renamed from: c */
    public static <T> Sequence<T> m7450c(Iterator<? extends T> it) {
        Sequence<T> d;
        C9971q.m14633g(it, "<this>");
        d = m7449d(new C12194a(it));
        return d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static <T> Sequence<T> m7449d(Sequence<? extends T> sequence) {
        C9971q.m14633g(sequence, "<this>");
        if (sequence instanceof C12176a) {
            return sequence;
        }
        return new C12176a(sequence);
    }

    /* renamed from: e */
    public static <T> Sequence<T> m7448e() {
        return C12180d.f27328a;
    }

    /* renamed from: f */
    public static final <T> Sequence<T> m7447f(Sequence<? extends Sequence<? extends T>> sequence) {
        C9971q.m14633g(sequence, "<this>");
        return m7446g(sequence, C12195b.f27353k);
    }

    /* renamed from: g */
    private static final <T, R> Sequence<R> m7446g(Sequence<? extends T> sequence, Function1<? super T, ? extends Iterator<? extends R>> function1) {
        if (sequence instanceof C12206q) {
            return ((C12206q) sequence).m7411d(function1);
        }
        return new C12183f(sequence, C12196c.f27354k, function1);
    }

    /* renamed from: h */
    public static <T> Sequence<T> m7445h(T t, Function1<? super T, ? extends T> nextFunction) {
        C9971q.m14633g(nextFunction, "nextFunction");
        if (t == null) {
            return C12180d.f27328a;
        }
        return new C12185g(new C12198e(t), nextFunction);
    }

    /* renamed from: i */
    public static <T> Sequence<T> m7444i(Function0<? extends T> nextFunction) {
        Sequence<T> d;
        C9971q.m14633g(nextFunction, "nextFunction");
        d = m7449d(new C12185g(nextFunction, new C12197d(nextFunction)));
        return d;
    }

    /* renamed from: j */
    public static <T> Sequence<T> m7443j(Function0<? extends T> seedFunction, Function1<? super T, ? extends T> nextFunction) {
        C9971q.m14633g(seedFunction, "seedFunction");
        C9971q.m14633g(nextFunction, "nextFunction");
        return new C12185g(seedFunction, nextFunction);
    }

    /* renamed from: k */
    public static final <T> Sequence<T> m7442k(T... elements) {
        boolean z;
        Sequence<T> u;
        Sequence<T> e;
        C9971q.m14633g(elements, "elements");
        if (elements.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            e = m7448e();
            return e;
        }
        u = C9899f.m14915u(elements);
        return u;
    }
}
