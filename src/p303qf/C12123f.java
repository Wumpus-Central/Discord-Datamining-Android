package p303qf;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p163j$.util.Comparator;
import p163j$.util.function.Function;
import p163j$.util.function.ToDoubleFunction;
import p163j$.util.function.ToIntFunction;
import p163j$.util.function.ToLongFunction;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ$\u0010\u0006\u001a\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\"\u0010\b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004¨\u0006\u000b"}, m15073d2 = {"Lqf/f;", "Ljava/util/Comparator;", "", "", "Lkotlin/Comparator;", "a", "b", "", "reversed", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: qf.f */
/* loaded from: classes8.dex */
public final class C12123f implements Comparator<Comparable<? super Object>>, p163j$.util.Comparator {

    /* renamed from: k */
    public static final C12123f f27208k = new C12123f();

    private C12123f() {
    }

    /* renamed from: b */
    public int compare(Comparable<Object> a, Comparable<Object> b) {
        C9971q.m14633g(a, "a");
        C9971q.m14633g(b, "b");
        return a.compareTo(b);
    }

    @Override // java.util.Comparator, p163j$.util.Comparator
    public final Comparator<Comparable<Object>> reversed() {
        return C12124g.f27209k;
    }

    @Override // p163j$.util.Comparator
    public /* synthetic */ Comparator thenComparing(Function function) {
        return function.getClass();
    }

    @Override // p163j$.util.Comparator
    public /* synthetic */ Comparator thenComparing(Function function, Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }

    @Override // java.util.Comparator, p163j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return comparator.getClass();
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator<Comparable<? super Object>> thenComparing(java.util.function.Function function) {
        return thenComparing(Function.VivifiedWrapper.convert(function));
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator<Comparable<? super Object>> thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
        return thenComparing(Function.VivifiedWrapper.convert(function), comparator);
    }

    @Override // p163j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return toDoubleFunction.getClass();
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator<Comparable<? super Object>> thenComparingDouble(java.util.function.ToDoubleFunction<? super Comparable<? super Object>> toDoubleFunction) {
        return thenComparingDouble(ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction));
    }

    @Override // p163j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return toIntFunction.getClass();
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator<Comparable<? super Object>> thenComparingInt(java.util.function.ToIntFunction<? super Comparable<? super Object>> toIntFunction) {
        return thenComparingInt(ToIntFunction.VivifiedWrapper.convert(toIntFunction));
    }

    @Override // p163j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return toLongFunction.getClass();
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator<Comparable<? super Object>> thenComparingLong(java.util.function.ToLongFunction<? super Comparable<? super Object>> toLongFunction) {
        return thenComparingLong(ToLongFunction.VivifiedWrapper.convert(toLongFunction));
    }
}
