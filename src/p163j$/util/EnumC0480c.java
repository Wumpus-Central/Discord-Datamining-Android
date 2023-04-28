package p163j$.util;

import java.util.Comparator;
import p163j$.util.Comparator;
import p163j$.util.function.Function;
import p163j$.util.function.ToDoubleFunction;
import p163j$.util.function.ToIntFunction;
import p163j$.util.function.ToLongFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: j$.util.c */
/* loaded from: classes2.dex */
public final class EnumC0480c extends Enum implements Comparator, Comparator {
    public static final EnumC0480c INSTANCE;

    /* renamed from: a */
    private static final /* synthetic */ EnumC0480c[] f20308a;

    static {
        EnumC0480c cVar = new EnumC0480c();
        INSTANCE = cVar;
        f20308a = new EnumC0480c[]{cVar};
    }

    private EnumC0480c() {
    }

    public static EnumC0480c valueOf(String str) {
        return (EnumC0480c) Enum.valueOf(EnumC0480c.class, str);
    }

    public static EnumC0480c[] values() {
        return (EnumC0480c[]) f20308a.clone();
    }

    @Override // java.util.Comparator, p163j$.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator, p163j$.util.Comparator
    public final Comparator reversed() {
        return Comparator.CC.reverseOrder();
    }

    @Override // p163j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function) {
        return function.getClass();
    }

    @Override // p163j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }

    @Override // java.util.Comparator, p163j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return comparator.getClass();
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function) {
        return Function.VivifiedWrapper.convert(function).getClass();
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, Function.VivifiedWrapper.convert(function), comparator);
    }

    @Override // p163j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return toDoubleFunction.getClass();
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
        return ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction).getClass();
    }

    @Override // p163j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return toIntFunction.getClass();
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(java.util.function.ToIntFunction toIntFunction) {
        return ToIntFunction.VivifiedWrapper.convert(toIntFunction).getClass();
    }

    @Override // p163j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return toLongFunction.getClass();
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(java.util.function.ToLongFunction toLongFunction) {
        return ToLongFunction.VivifiedWrapper.convert(toLongFunction).getClass();
    }
}
