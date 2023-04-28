package p163j$.util.stream;

import p163j$.util.AbstractC9234B;
import p163j$.util.AbstractC9447y;
import p163j$.util.Spliterator;

/* renamed from: j$.util.stream.A3 */
/* loaded from: classes2.dex */
public abstract class AbstractC9317A3 {
    /* renamed from: a */
    public static AbstractC9328D m16479a(AbstractC9447y yVar) {
        return new C0625y(yVar, EnumC9394S2.m16440c(yVar));
    }

    /* renamed from: b */
    public static IntStream m16478b(Spliterator.OfInt ofInt) {
        return new C9415Y(ofInt, EnumC9394S2.m16440c(ofInt));
    }

    /* renamed from: c */
    public static AbstractC0571k0 m16477c(AbstractC9234B b) {
        return new C0549f0(b, EnumC9394S2.m16440c(b));
    }

    /* renamed from: d */
    public static Stream m16476d(Spliterator spliterator, boolean z) {
        spliterator.getClass();
        return new C9397T1(spliterator, EnumC9394S2.m16440c(spliterator), z);
    }
}
