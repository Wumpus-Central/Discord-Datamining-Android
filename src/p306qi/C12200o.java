package p306qi;

import ag.AbstractC1385a;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;
import kotlin.sequences.Sequence;
import p267of.C11294z;
import p326ri.C12708m;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0003\u001a$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00020\u0005\u001a0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u001a0\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u001a\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\r*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001a0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u001a7\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u000f*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a<\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\b\u001a6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u001a<\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0018*\u00020\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\b\u001a\u0016\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a,\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\u0005H\u0007\u001a.\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b \u0010!\u001a-\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0086\u0002\u001a@\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\tH\u0007\u001a}\u00101\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010$*\u00060(j\u0002`)*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010*\u001a\u00028\u00012\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020+2\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020+\u0018\u00010\b¢\u0006\u0004\b1\u00102\u001a`\u00104\u001a\u000203\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020+2\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020+\u0018\u00010\b\u001a\u001c\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u00066"}, m15073d2 = {"T", "Lkotlin/sequences/Sequence;", "s", "(Lkotlin/sequences/Sequence;)Ljava/lang/Object;", "x", "", "n", "o", "Lkotlin/Function1;", "", "predicate", "p", "q", "", "r", "C", "", "destination", "D", "(Lkotlin/sequences/Sequence;Ljava/util/Collection;)Ljava/util/Collection;", "", "E", "", "F", "R", ViewProps.TRANSFORM, "t", "y", "z", "size", "m", "element", "B", "(Lkotlin/sequences/Sequence;Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "", "elements", "A", "step", "partialWindows", "G", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "u", "(Lkotlin/sequences/Sequence;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "v", "l", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/sequences/SequencesKt")
/* renamed from: qi.o */
/* loaded from: classes8.dex */
public class C12200o extends C12199n {

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, m15073d2 = {"qi/o$a", "", "", "iterator", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: qi.o$a */
    /* loaded from: classes8.dex */
    public static final class C12201a implements Iterable<T>, AbstractC1385a {

        /* renamed from: k */
        final /* synthetic */ Sequence f27357k;

        public C12201a(Sequence sequence) {
            this.f27357k = sequence;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f27357k.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"", "T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: qi.o$b */
    /* loaded from: classes8.dex */
    public static final class C12202b extends AbstractC9973s implements Function1<T, Boolean> {

        /* renamed from: k */
        public static final C12202b f27358k = new C12202b();

        C12202b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(T t) {
            return Boolean.valueOf(t == 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: qi.o$c */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C12203c extends C9968n implements Function1<Sequence<? extends R>, Iterator<? extends R>> {

        /* renamed from: k */
        public static final C12203c f27359k = new C12203c();

        C12203c() {
            super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: i */
        public final Iterator<R> invoke(Sequence<? extends R> p0) {
            C9971q.m14633g(p0, "p0");
            return p0.iterator();
        }
    }

    /* renamed from: A */
    public static <T> Sequence<T> m7440A(Sequence<? extends T> sequence, Iterable<? extends T> elements) {
        Sequence K;
        C9971q.m14633g(sequence, "<this>");
        C9971q.m14633g(elements, "elements");
        K = C9914r.m14782K(elements);
        return C12193m.m7447f(C12193m.m7442k(sequence, K));
    }

    /* renamed from: B */
    public static <T> Sequence<T> m7439B(Sequence<? extends T> sequence, T t) {
        C9971q.m14633g(sequence, "<this>");
        return C12193m.m7447f(C12193m.m7442k(sequence, C12193m.m7442k(t)));
    }

    /* renamed from: C */
    public static <T> Sequence<T> m7438C(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        C9971q.m14633g(sequence, "<this>");
        C9971q.m14633g(predicate, "predicate");
        return new C12204p(sequence, predicate);
    }

    /* renamed from: D */
    public static final <T, C extends Collection<? super T>> C m7437D(Sequence<? extends T> sequence, C destination) {
        C9971q.m14633g(sequence, "<this>");
        C9971q.m14633g(destination, "destination");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    /* renamed from: E */
    public static <T> List<T> m7436E(Sequence<? extends T> sequence) {
        List F;
        List<T> p;
        C9971q.m14633g(sequence, "<this>");
        F = m7435F(sequence);
        p = C9906j.m14813p(F);
        return p;
    }

    /* renamed from: F */
    public static <T> List<T> m7435F(Sequence<? extends T> sequence) {
        C9971q.m14633g(sequence, "<this>");
        return (List) m7437D(sequence, new ArrayList());
    }

    /* renamed from: G */
    public static final <T> Sequence<List<T>> m7434G(Sequence<? extends T> sequence, int i, int i2, boolean z) {
        C9971q.m14633g(sequence, "<this>");
        return C11294z.m10227c(sequence, i, i2, z, false);
    }

    /* renamed from: l */
    public static <T> Iterable<T> m7433l(Sequence<? extends T> sequence) {
        C9971q.m14633g(sequence, "<this>");
        return new C12201a(sequence);
    }

    /* renamed from: m */
    public static <T> Sequence<List<T>> m7432m(Sequence<? extends T> sequence, int i) {
        C9971q.m14633g(sequence, "<this>");
        return m7434G(sequence, i, i, true);
    }

    /* renamed from: n */
    public static <T> int m7431n(Sequence<? extends T> sequence) {
        C9971q.m14633g(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                C9906j.m14811r();
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static <T> Sequence<T> m7430o(Sequence<? extends T> sequence, int i) {
        boolean z;
        C9971q.m14633g(sequence, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return sequence;
        } else {
            if (sequence instanceof AbstractC12179c) {
                return ((AbstractC12179c) sequence).mo7495a(i);
            }
            return new C12177b(sequence, i);
        }
    }

    /* renamed from: p */
    public static <T> Sequence<T> m7429p(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        C9971q.m14633g(sequence, "<this>");
        C9971q.m14633g(predicate, "predicate");
        return new C12181e(sequence, true, predicate);
    }

    /* renamed from: q */
    public static <T> Sequence<T> m7428q(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        C9971q.m14633g(sequence, "<this>");
        C9971q.m14633g(predicate, "predicate");
        return new C12181e(sequence, false, predicate);
    }

    /* renamed from: r */
    public static <T> Sequence<T> m7427r(Sequence<? extends T> sequence) {
        Sequence<T> q;
        C9971q.m14633g(sequence, "<this>");
        q = m7428q(sequence, C12202b.f27358k);
        C9971q.m14635e(q, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return q;
    }

    /* renamed from: s */
    public static <T> T m7426s(Sequence<? extends T> sequence) {
        C9971q.m14633g(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return (T) it.next();
    }

    /* renamed from: t */
    public static <T, R> Sequence<R> m7425t(Sequence<? extends T> sequence, Function1<? super T, ? extends Sequence<? extends R>> transform) {
        C9971q.m14633g(sequence, "<this>");
        C9971q.m14633g(transform, "transform");
        return new C12183f(sequence, transform, C12203c.f27359k);
    }

    /* renamed from: u */
    public static final <T, A extends Appendable> A m7424u(Sequence<? extends T> sequence, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        C9971q.m14633g(sequence, "<this>");
        C9971q.m14633g(buffer, "buffer");
        C9971q.m14633g(separator, "separator");
        C9971q.m14633g(prefix, "prefix");
        C9971q.m14633g(postfix, "postfix");
        C9971q.m14633g(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (Object obj : sequence) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C12708m.m5761a(buffer, obj, function1);
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: v */
    public static final <T> String m7423v(Sequence<? extends T> sequence, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        C9971q.m14633g(sequence, "<this>");
        C9971q.m14633g(separator, "separator");
        C9971q.m14633g(prefix, "prefix");
        C9971q.m14633g(postfix, "postfix");
        C9971q.m14633g(truncated, "truncated");
        String sb2 = ((StringBuilder) m7424u(sequence, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
        C9971q.m14634f(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: w */
    public static /* synthetic */ String m7422w(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return m7423v(sequence, charSequence, charSequence5, charSequence6, i, charSequence4, function1);
    }

    /* renamed from: x */
    public static <T> T m7421x(Sequence<? extends T> sequence) {
        C9971q.m14633g(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (it.hasNext()) {
            T t = (T) it.next();
            while (it.hasNext()) {
                t = (T) it.next();
            }
            return t;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* renamed from: y */
    public static <T, R> Sequence<R> m7420y(Sequence<? extends T> sequence, Function1<? super T, ? extends R> transform) {
        C9971q.m14633g(sequence, "<this>");
        C9971q.m14633g(transform, "transform");
        return new C12206q(sequence, transform);
    }

    /* renamed from: z */
    public static <T, R> Sequence<R> m7419z(Sequence<? extends T> sequence, Function1<? super T, ? extends R> transform) {
        Sequence<R> r;
        C9971q.m14633g(sequence, "<this>");
        C9971q.m14633g(transform, "transform");
        r = m7427r(new C12206q(sequence, transform));
        return r;
    }
}
