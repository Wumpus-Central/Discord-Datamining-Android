package kotlin.collections;

import com.facebook.react.uimanager.ViewProps;
import eg.C6884j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import nf.C11098x;
import p267of.C11280m;
import p267of.C11281n;
import p267of.C11288u;
import p326ri.C12708m;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000Â\u0001\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0000\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0000\u0010\u0006\u001a\u001d\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\n\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\t\u001a'\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0010\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0014\u0010\u0006\u001a\u001d\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u0015\u0010\t\u001a\u001f\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0016\u0010\u0006\u001a\u001f\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u0017\u0010\t\u001a\u001d\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0018\u0010\u0006\u001a\u001d\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u0019\u0010\t\u001a\u001f\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001a\u0010\u0006\u001a\u001f\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u001b\u0010\t\u001a$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001c\u001a\u00020\f\u001a$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u001c\u001a\u00020\f\u001a6\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u001fH\u0086\bø\u0001\u0000\u001a\"\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0000*\u00020\"*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001a=\u0010'\u001a\u00028\u0000\"\u0010\b\u0000\u0010%*\n\u0012\u0006\b\u0000\u0012\u00028\u00010$\"\b\b\u0001\u0010\u0000*\u00020\"*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010&\u001a\u00028\u0000¢\u0006\u0004\b'\u0010(\u001a$\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010*\u001a\u00020)\u001a$\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001c\u001a\u00020\f\u001a$\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u001c\u001a\u00020\f\u001a&\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000.*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a8\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u00102\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u000000j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`1\u001a\u0010\u00106\u001a\u000205*\b\u0012\u0004\u0012\u00020\u000304\u001a\u0010\u00108\u001a\u000207*\b\u0012\u0004\u0012\u00020\f04\u001a7\u00109\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010%*\n\u0012\u0006\b\u0000\u0012\u00028\u00000$*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010&\u001a\u00028\u0001¢\u0006\u0004\b9\u0010(\u001a&\u0010<\u001a\u0012\u0012\u0004\u0012\u00028\u00000:j\b\u0012\u0004\u0012\u00028\u0000`;\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000>\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000004\u001a\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a<\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010#*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fH\u0086\bø\u0001\u0000\u001a\"\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000E0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a-\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000A\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004\u001a\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000J\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a-\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000A\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004\u001a0\u0010M\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u001fH\u0086\bø\u0001\u0000\u001a+\u0010N\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000.*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\bN\u0010O\u001a.\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bP\u0010Q\u001a.\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bR\u0010Q\u001a.\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u0000042\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bS\u0010T\u001a-\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u001a-\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u0000042\f\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u001aH\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010Y0\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010#*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010H\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010XH\u0086\u0004¢\u0006\u0004\bZ\u0010[\u001a?\u0010\\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010Y0\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010#*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0086\u0004\u001a}\u0010g\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010_*\u00060]j\u0002`^*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010`\u001a\u00028\u00012\b\b\u0002\u0010b\u001a\u00020a2\b\b\u0002\u0010c\u001a\u00020a2\b\b\u0002\u0010d\u001a\u00020a2\b\b\u0002\u0010e\u001a\u00020\f2\b\b\u0002\u0010f\u001a\u00020a2\u0016\b\u0002\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020a\u0018\u00010\u001f¢\u0006\u0004\bg\u0010h\u001a`\u0010j\u001a\u00020i\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010b\u001a\u00020a2\b\b\u0002\u0010c\u001a\u00020a2\b\b\u0002\u0010d\u001a\u00020a2\b\b\u0002\u0010e\u001a\u00020\f2\b\b\u0002\u0010f\u001a\u00020a2\u0016\b\u0002\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020a\u0018\u00010\u001f\u001a\u001c\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000k\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u0019\u0010n\u001a\u00020m*\b\u0012\u0004\u0012\u00020m0\u0001H\u0007¢\u0006\u0004\bn\u0010o\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006p"}, m15073d2 = {"T", "", "element", "", "M", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "(Ljava/lang/Iterable;)Ljava/lang/Object;", "", "U", "(Ljava/util/List;)Ljava/lang/Object;", "V", "W", "", "index", "X", "(Ljava/util/List;I)Ljava/lang/Object;", "Y", "(Ljava/lang/Iterable;Ljava/lang/Object;)I", "Z", "(Ljava/util/List;Ljava/lang/Object;)I", "f0", "g0", "h0", "i0", "q0", "r0", "s0", "t0", "n", "O", "P", "Lkotlin/Function1;", "predicate", "Q", "", "R", "", "C", "destination", "S", "(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;", "Lkotlin/ranges/IntRange;", "indices", "u0", "x0", "y0", "", "v0", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "w0", "", "", "z0", "", "C0", "A0", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "B0", "D0", "", "E0", "F0", "", "H0", ViewProps.TRANSFORM, "j0", "Lof/m;", "J0", "N", "other", "a0", "", "G0", "I0", "J", "k0", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "l0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;", "n0", "p0", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "elements", "m0", "o0", "", "Lkotlin/Pair;", "L0", "(Ljava/lang/Iterable;[Ljava/lang/Object;)Ljava/util/List;", "K0", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "b0", "(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "d0", "Lkotlin/sequences/Sequence;", "K", "", "L", "(Ljava/lang/Iterable;)D", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.r */
/* loaded from: classes8.dex */
public class C9914r extends C9913q {

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, m15073d2 = {"kotlin/collections/r$a", "Lkotlin/sequences/Sequence;", "", "iterator", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: kotlin.collections.r$a */
    /* loaded from: classes8.dex */
    public static final class C9915a implements Sequence<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f22054a;

        public C9915a(Iterable iterable) {
            this.f22054a = iterable;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return this.f22054a.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"T", "", "a", "()Ljava/util/Iterator;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: kotlin.collections.r$b */
    /* loaded from: classes8.dex */
    public static final class C9916b extends AbstractC9973s implements Function0<Iterator<? extends T>> {

        /* renamed from: k */
        final /* synthetic */ Iterable<T> f22055k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C9916b(Iterable<? extends T> iterable) {
            super(0);
            this.f22055k = iterable;
        }

        /* renamed from: a */
        public final Iterator<T> invoke() {
            return this.f22055k.iterator();
        }
    }

    /* renamed from: A0 */
    public static final <T, C extends Collection<? super T>> C m14793A0(Iterable<? extends T> iterable, C destination) {
        C9971q.m14633g(iterable, "<this>");
        C9971q.m14633g(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    /* renamed from: B0 */
    public static <T> HashSet<T> m14792B0(Iterable<? extends T> iterable) {
        int t;
        int d;
        C9971q.m14633g(iterable, "<this>");
        t = C9907k.m14809t(iterable, 12);
        d = C11288u.m10255d(t);
        return (HashSet) m14793A0(iterable, new HashSet(d));
    }

    /* renamed from: C0 */
    public static int[] m14791C0(Collection<Integer> collection) {
        C9971q.m14633g(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            iArr[i] = num.intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: D0 */
    public static <T> List<T> m14790D0(Iterable<? extends T> iterable) {
        List<T> p;
        List<T> i;
        Object obj;
        List<T> d;
        List<T> F0;
        C9971q.m14633g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                i = C9906j.m14820i();
                return i;
            } else if (size != 1) {
                F0 = m14788F0(collection);
                return F0;
            } else {
                if (iterable instanceof List) {
                    obj = ((List) iterable).get(0);
                } else {
                    obj = iterable.iterator().next();
                }
                d = C9905i.m14825d(obj);
                return d;
            }
        } else {
            p = C9906j.m14813p(m14789E0(iterable));
            return p;
        }
    }

    /* renamed from: E0 */
    public static final <T> List<T> m14789E0(Iterable<? extends T> iterable) {
        List<T> F0;
        C9971q.m14633g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return (List) m14793A0(iterable, new ArrayList());
        }
        F0 = m14788F0((Collection) iterable);
        return F0;
    }

    /* renamed from: F0 */
    public static <T> List<T> m14788F0(Collection<? extends T> collection) {
        C9971q.m14633g(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: G0 */
    public static <T> Set<T> m14787G0(Iterable<? extends T> iterable) {
        C9971q.m14633g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) m14793A0(iterable, new LinkedHashSet());
    }

    /* renamed from: H0 */
    public static <T> Set<T> m14786H0(Iterable<? extends T> iterable) {
        Set<T> d;
        Object obj;
        Set<T> c;
        int d2;
        C9971q.m14633g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C9921w.m14718h((Set) m14793A0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            d = C9921w.m14722d();
            return d;
        } else if (size != 1) {
            d2 = C11288u.m10255d(collection.size());
            return (Set) m14793A0(iterable, new LinkedHashSet(d2));
        } else {
            if (iterable instanceof List) {
                obj = ((List) iterable).get(0);
            } else {
                obj = iterable.iterator().next();
            }
            c = C9920v.m14723c(obj);
            return c;
        }
    }

    /* renamed from: I0 */
    public static <T> Set<T> m14785I0(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Set<T> G0;
        C9971q.m14633g(iterable, "<this>");
        C9971q.m14633g(other, "other");
        G0 = m14787G0(iterable);
        C9911o.m14801y(G0, other);
        return G0;
    }

    /* renamed from: J */
    public static <T> boolean m14784J(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        C9971q.m14633g(iterable, "<this>");
        C9971q.m14633g(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!predicate.invoke((Object) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: J0 */
    public static <T> Iterable<C11280m<T>> m14783J0(Iterable<? extends T> iterable) {
        C9971q.m14633g(iterable, "<this>");
        return new C11281n(new C9916b(iterable));
    }

    /* renamed from: K */
    public static <T> Sequence<T> m14782K(Iterable<? extends T> iterable) {
        C9971q.m14633g(iterable, "<this>");
        return new C9915a(iterable);
    }

    /* renamed from: K0 */
    public static <T, R> List<Pair<T, R>> m14781K0(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        int t;
        int t2;
        C9971q.m14633g(iterable, "<this>");
        C9971q.m14633g(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        t = C9907k.m14809t(iterable, 10);
        t2 = C9907k.m14809t(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(t, t2));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C11098x.m10921a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: L */
    public static double m14780L(Iterable<Double> iterable) {
        C9971q.m14633g(iterable, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Double d2 : iterable) {
            d += d2.doubleValue();
            i++;
            if (i < 0) {
                C9906j.m14811r();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    /* renamed from: L0 */
    public static <T, R> List<Pair<T, R>> m14779L0(Iterable<? extends T> iterable, R[] other) {
        int t;
        C9971q.m14633g(iterable, "<this>");
        C9971q.m14633g(other, "other");
        int length = other.length;
        t = C9907k.m14809t(iterable, 10);
        ArrayList arrayList = new ArrayList(Math.min(t, length));
        int i = 0;
        for (Object obj : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(C11098x.m10921a(obj, other[i]));
            i++;
        }
        return arrayList;
    }

    /* renamed from: M */
    public static <T> boolean m14778M(Iterable<? extends T> iterable, T t) {
        C9971q.m14633g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        if (m14766Y(iterable, t) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public static <T> List<T> m14777N(Iterable<? extends T> iterable) {
        Set G0;
        List<T> D0;
        C9971q.m14633g(iterable, "<this>");
        G0 = m14787G0(iterable);
        D0 = m14790D0(G0);
        return D0;
    }

    /* renamed from: O */
    public static <T> List<T> m14776O(Iterable<? extends T> iterable, int i) {
        boolean z;
        ArrayList arrayList;
        List<T> p;
        Object f0;
        List<T> d;
        List<T> i2;
        List<T> D0;
        C9971q.m14633g(iterable, "<this>");
        int i3 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            D0 = m14790D0(iterable);
            return D0;
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    i2 = C9906j.m14820i();
                    return i2;
                } else if (size == 1) {
                    f0 = m14759f0(iterable);
                    d = C9905i.m14825d(f0);
                    return d;
                } else {
                    arrayList = new ArrayList(size);
                    if (iterable instanceof List) {
                        if (iterable instanceof RandomAccess) {
                            int size2 = collection.size();
                            while (i < size2) {
                                arrayList.add(((List) iterable).get(i));
                                i++;
                            }
                        } else {
                            ListIterator listIterator = ((List) iterable).listIterator(i);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        return arrayList;
                    }
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object obj : iterable) {
                if (i3 >= i) {
                    arrayList.add(obj);
                } else {
                    i3++;
                }
            }
            p = C9906j.m14813p(arrayList);
            return p;
        }
    }

    /* renamed from: P */
    public static <T> List<T> m14775P(List<? extends T> list, int i) {
        boolean z;
        int c;
        List<T> x0;
        C9971q.m14633g(list, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c = C6884j.m23961c(list.size() - i, 0);
            x0 = m14741x0(list, c);
            return x0;
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: Q */
    public static <T> List<T> m14774Q(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        C9971q.m14633g(iterable, "<this>");
        C9971q.m14633g(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            if (predicate.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: R */
    public static <T> List<T> m14773R(Iterable<? extends T> iterable) {
        C9971q.m14633g(iterable, "<this>");
        return (List) m14772S(iterable, new ArrayList());
    }

    /* renamed from: S */
    public static final <C extends Collection<? super T>, T> C m14772S(Iterable<? extends T> iterable, C destination) {
        C9971q.m14633g(iterable, "<this>");
        C9971q.m14633g(destination, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* renamed from: T */
    public static <T> T m14771T(Iterable<? extends T> iterable) {
        Object U;
        C9971q.m14633g(iterable, "<this>");
        if (iterable instanceof List) {
            U = m14770U((List) iterable);
            return (T) U;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return (T) it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: U */
    public static <T> T m14770U(List<? extends T> list) {
        C9971q.m14633g(list, "<this>");
        if (!list.isEmpty()) {
            return (T) list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: V */
    public static <T> T m14769V(Iterable<? extends T> iterable) {
        C9971q.m14633g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return (T) it.next();
    }

    /* renamed from: W */
    public static <T> T m14768W(List<? extends T> list) {
        C9971q.m14633g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return (T) list.get(0);
    }

    /* renamed from: X */
    public static <T> T m14767X(List<? extends T> list, int i) {
        int k;
        C9971q.m14633g(list, "<this>");
        if (i >= 0) {
            k = C9906j.m14818k(list);
            if (i <= k) {
                return (T) list.get(i);
            }
        }
        return null;
    }

    /* renamed from: Y */
    public static final <T> int m14766Y(Iterable<? extends T> iterable, T t) {
        C9971q.m14633g(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (Object obj : iterable) {
            if (i < 0) {
                C9906j.m14810s();
            }
            if (C9971q.m14638b(t, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: Z */
    public static <T> int m14765Z(List<? extends T> list, T t) {
        C9971q.m14633g(list, "<this>");
        return list.indexOf(t);
    }

    /* renamed from: a0 */
    public static <T> Set<T> m14764a0(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Set<T> G0;
        C9971q.m14633g(iterable, "<this>");
        C9971q.m14633g(other, "other");
        G0 = m14787G0(iterable);
        C9911o.m14802C(G0, other);
        return G0;
    }

    /* renamed from: b0 */
    public static final <T, A extends Appendable> A m14763b0(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        C9971q.m14633g(iterable, "<this>");
        C9971q.m14633g(buffer, "buffer");
        C9971q.m14633g(separator, "separator");
        C9971q.m14633g(prefix, "prefix");
        C9971q.m14633g(postfix, "postfix");
        C9971q.m14633g(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (Object obj : iterable) {
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

    /* renamed from: c0 */
    public static /* synthetic */ Appendable m14762c0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i3;
        CharSequence charSequence7;
        Function1 function12;
        if ((i2 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i2 & 4) != 0) {
            charSequence6 = charSequence8;
        } else {
            charSequence6 = charSequence2;
        }
        if ((i2 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i2 & 16) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i2 & 64) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        return m14763b0(iterable, appendable, charSequence5, charSequence6, charSequence8, i3, charSequence7, function12);
    }

    /* renamed from: d0 */
    public static final <T> String m14761d0(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        C9971q.m14633g(iterable, "<this>");
        C9971q.m14633g(separator, "separator");
        C9971q.m14633g(prefix, "prefix");
        C9971q.m14633g(postfix, "postfix");
        C9971q.m14633g(truncated, "truncated");
        String sb2 = ((StringBuilder) m14763b0(iterable, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
        C9971q.m14634f(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: e0 */
    public static /* synthetic */ String m14760e0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return m14761d0(iterable, charSequence, charSequence5, charSequence6, i, charSequence4, function1);
    }

    /* renamed from: f0 */
    public static <T> T m14759f0(Iterable<? extends T> iterable) {
        Object g0;
        C9971q.m14633g(iterable, "<this>");
        if (iterable instanceof List) {
            g0 = m14758g0((List) iterable);
            return (T) g0;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T t = (T) it.next();
            while (it.hasNext()) {
                t = (T) it.next();
            }
            return t;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: g0 */
    public static <T> T m14758g0(List<? extends T> list) {
        int k;
        C9971q.m14633g(list, "<this>");
        if (!list.isEmpty()) {
            k = C9906j.m14818k(list);
            return (T) list.get(k);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: h0 */
    public static <T> T m14757h0(Iterable<? extends T> iterable) {
        C9971q.m14633g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (T) it.next();
        while (it.hasNext()) {
            t = (T) it.next();
        }
        return t;
    }

    /* renamed from: i0 */
    public static <T> T m14756i0(List<? extends T> list) {
        C9971q.m14633g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return (T) list.get(list.size() - 1);
    }

    /* renamed from: j0 */
    public static <T, R> List<R> m14755j0(Iterable<? extends T> iterable, Function1<? super T, ? extends R> transform) {
        int t;
        C9971q.m14633g(iterable, "<this>");
        C9971q.m14633g(transform, "transform");
        t = C9907k.m14809t(iterable, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke((Object) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T extends java.lang.Comparable<? super T>> T m14754k0(java.lang.Iterable<? extends T> r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9971q.m14633g(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x0011
            r3 = 0
            return r3
        L_0x0011:
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L_0x0017:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L_0x0017
            r0 = r1
            goto L_0x0017
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C9914r.m14754k0(java.lang.Iterable):java.lang.Comparable");
    }

    /* renamed from: l0 */
    public static <T> List<T> m14753l0(Iterable<? extends T> iterable, T t) {
        int t2;
        C9971q.m14633g(iterable, "<this>");
        t2 = C9907k.m14809t(iterable, 10);
        ArrayList arrayList = new ArrayList(t2);
        boolean z = false;
        for (Object obj : iterable) {
            boolean z2 = true;
            if (!z && C9971q.m14638b(obj, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: m0 */
    public static <T> List<T> m14752m0(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        List<T> o0;
        C9971q.m14633g(iterable, "<this>");
        C9971q.m14633g(elements, "elements");
        if (iterable instanceof Collection) {
            o0 = m14750o0((Collection) iterable, elements);
            return o0;
        }
        ArrayList arrayList = new ArrayList();
        C9911o.m14801y(arrayList, iterable);
        C9911o.m14801y(arrayList, elements);
        return arrayList;
    }

    /* renamed from: n0 */
    public static <T> List<T> m14751n0(Iterable<? extends T> iterable, T t) {
        List<T> p0;
        C9971q.m14633g(iterable, "<this>");
        if (iterable instanceof Collection) {
            p0 = m14749p0((Collection) iterable, t);
            return p0;
        }
        ArrayList arrayList = new ArrayList();
        C9911o.m14801y(arrayList, iterable);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: o0 */
    public static <T> List<T> m14750o0(Collection<? extends T> collection, Iterable<? extends T> elements) {
        C9971q.m14633g(collection, "<this>");
        C9971q.m14633g(elements, "elements");
        if (elements instanceof Collection) {
            Collection collection2 = (Collection) elements;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C9911o.m14801y(arrayList2, elements);
        return arrayList2;
    }

    /* renamed from: p0 */
    public static <T> List<T> m14749p0(Collection<? extends T> collection, T t) {
        C9971q.m14633g(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: q0 */
    public static <T> T m14748q0(Iterable<? extends T> iterable) {
        Object r0;
        C9971q.m14633g(iterable, "<this>");
        if (iterable instanceof List) {
            r0 = m14747r0((List) iterable);
            return (T) r0;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T t = (T) it.next();
            if (!it.hasNext()) {
                return t;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: r0 */
    public static <T> T m14747r0(List<? extends T> list) {
        C9971q.m14633g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return (T) list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    /* renamed from: s0 */
    public static <T> T m14746s0(Iterable<? extends T> iterable) {
        C9971q.m14633g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (T) it.next();
        if (it.hasNext()) {
            return null;
        }
        return t;
    }

    /* renamed from: t0 */
    public static <T> T m14745t0(List<? extends T> list) {
        C9971q.m14633g(list, "<this>");
        if (list.size() == 1) {
            return (T) list.get(0);
        }
        return null;
    }

    /* renamed from: u0 */
    public static <T> List<T> m14744u0(List<? extends T> list, IntRange indices) {
        List<T> D0;
        List<T> i;
        C9971q.m14633g(list, "<this>");
        C9971q.m14633g(indices, "indices");
        if (indices.isEmpty()) {
            i = C9906j.m14820i();
            return i;
        }
        D0 = m14790D0(list.subList(indices.m14607p().intValue(), indices.m14608j().intValue() + 1));
        return D0;
    }

    /* renamed from: v0 */
    public static <T extends Comparable<? super T>> List<T> m14743v0(Iterable<? extends T> iterable) {
        List<T> d;
        List<T> D0;
        C9971q.m14633g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                D0 = m14790D0(iterable);
                return D0;
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C9897e.m14978q((Comparable[]) array);
            d = C9897e.m14991d(array);
            return d;
        }
        List<T> E0 = m14789E0(iterable);
        C9910n.m14806w(E0);
        return E0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w0 */
    public static <T> List<T> m14742w0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        List<T> d;
        List<T> D0;
        C9971q.m14633g(iterable, "<this>");
        C9971q.m14633g(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                D0 = m14790D0(iterable);
                return D0;
            }
            Object[] array = collection.toArray(new Object[0]);
            C9897e.m14977r(array, comparator);
            d = C9897e.m14991d(array);
            return d;
        }
        List<T> E0 = m14789E0(iterable);
        C9910n.m14805x(E0, comparator);
        return E0;
    }

    /* renamed from: x0 */
    public static <T> List<T> m14741x0(Iterable<? extends T> iterable, int i) {
        boolean z;
        List<T> p;
        Object T;
        List<T> d;
        List<T> D0;
        List<T> i2;
        C9971q.m14633g(iterable, "<this>");
        int i3 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            i2 = C9906j.m14820i();
            return i2;
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    D0 = m14790D0(iterable);
                    return D0;
                } else if (i == 1) {
                    T = m14771T(iterable);
                    d = C9905i.m14825d(T);
                    return d;
                }
            }
            ArrayList arrayList = new ArrayList(i);
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
                i3++;
                if (i3 == i) {
                    break;
                }
            }
            p = C9906j.m14813p(arrayList);
            return p;
        }
    }

    /* renamed from: y0 */
    public static <T> List<T> m14740y0(List<? extends T> list, int i) {
        boolean z;
        Object g0;
        List<T> d;
        List<T> D0;
        List<T> i2;
        C9971q.m14633g(list, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            i2 = C9906j.m14820i();
            return i2;
        } else {
            int size = list.size();
            if (i >= size) {
                D0 = m14790D0(list);
                return D0;
            } else if (i == 1) {
                g0 = m14758g0(list);
                d = C9905i.m14825d(g0);
                return d;
            } else {
                ArrayList arrayList = new ArrayList(i);
                if (list instanceof RandomAccess) {
                    for (int i3 = size - i; i3 < size; i3++) {
                        arrayList.add(list.get(i3));
                    }
                } else {
                    ListIterator<? extends T> listIterator = list.listIterator(size - i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        }
    }

    /* renamed from: z0 */
    public static boolean[] m14739z0(Collection<Boolean> collection) {
        C9971q.m14633g(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        int i = 0;
        for (Boolean bool : collection) {
            zArr[i] = bool.booleanValue();
            i++;
        }
        return zArr;
    }
}
