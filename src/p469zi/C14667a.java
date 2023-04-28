package p469zi;

import bj.C3622a2;
import bj.C3637d2;
import bj.C3640e0;
import bj.C3643f;
import bj.C3646f1;
import bj.C3650g1;
import bj.C3651g2;
import bj.C3652h;
import bj.C3659i1;
import bj.C3661i2;
import bj.C3662j;
import bj.C3670k2;
import bj.C3676m0;
import bj.C3678m2;
import bj.C3682n2;
import bj.C3683o;
import bj.C3695r0;
import bj.C3701t0;
import bj.C3708v1;
import bj.C3710w0;
import bj.C3712x;
import bj.C3713x0;
import bj.C3717y;
import bj.C3723z1;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.C9943c;
import kotlin.jvm.internal.C9945d;
import kotlin.jvm.internal.C9950f;
import kotlin.jvm.internal.C9958i0;
import kotlin.jvm.internal.C9959j;
import kotlin.jvm.internal.C9961k;
import kotlin.jvm.internal.C9962k0;
import kotlin.jvm.internal.C9970p;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.C9974t;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.C10254a;
import kotlinx.serialization.internal.C10255b;
import kotlinx.serialization.internal.C10256c;
import kotlinx.serialization.internal.C10257d;
import kotlinx.serialization.internal.C10258e;
import kotlinx.serialization.internal.C10259f;
import kotlinx.serialization.internal.C10260g;
import kotlinx.serialization.internal.C10261h;
import kotlinx.serialization.internal.C10262i;
import kotlinx.serialization.internal.C10263j;
import kotlinx.serialization.internal.C10264k;
import kotlinx.serialization.internal.C10265l;
import nf.C11053a0;
import nf.C11056b0;
import nf.C11059c0;
import nf.C11062d0;
import nf.C11065e0;
import nf.C11070g0;
import nf.C11073h0;
import nf.C11097w;
import nf.C11100z;
import si.C12905a;

@Metadata(m15074d1 = {"\u0000¦\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\u001a@\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u001a@\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u001aZ\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f0\u0002\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002*\u00020\u0011\u001a\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0002\u001a\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002*\u00020\u0016\u001a\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0002\u001a\u0011\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0002H\u0007ø\u0001\u0000\u001a\u0010\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0002*\u00020\u001d\u001a\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0002\u001a\u0011\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0002H\u0007ø\u0001\u0000\u001a\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020%0\u0002*\u00020$\u001a\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0002\u001a\u0011\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0002H\u0007ø\u0001\u0000\u001a\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020+0\u0002*\u00020*\u001a\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0002\u001a\u0011\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0002H\u0007ø\u0001\u0000\u001a\u0010\u0010\t\u001a\b\u0012\u0004\u0012\u0002010\u0002*\u000200\u001a\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0002\u001a\u0010\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0002*\u000204\u001a\f\u00108\u001a\b\u0012\u0004\u0012\u0002070\u0002\u001a\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0002*\u000209¢\u0006\u0004\b;\u0010<\u001a\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u0002\u001a\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u0002*\u00020?¢\u0006\u0004\b@\u0010A\u001a\u0010\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u0002*\u00020B\u001aF\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010J0\u0002\"\b\b\u0000\u0010F*\u00020E\"\n\b\u0001\u0010D*\u0004\u0018\u00018\u00002\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000G2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u001a&\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000L0\u0002\"\u0004\b\u0000\u0010F2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a&\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000N0\u0002\"\u0004\b\u0000\u0010F2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a@\u0010Q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010P0\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u001a\u0013\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u0002*\u00020Rø\u0001\u0000\u001a\u0013\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\u0002*\u00020Uø\u0001\u0000\u001a\u0013\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\u0002*\u00020Xø\u0001\u0000\u001a\u0013\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0\u0002*\u00020[ø\u0001\u0000\u001a\u0013\u0010`\u001a\b\u0012\u0004\u0012\u00020_0\u0002*\u00020^ø\u0001\u0000\u001a\u000e\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u0002H\u0007\"3\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\b\b\u0000\u0010F*\u00020E*\b\u0012\u0004\u0012\u00028\u00000\u00028F¢\u0006\f\u0012\u0004\be\u0010f\u001a\u0004\bc\u0010d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006h"}, m15073d2 = {"K", "V", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "Lkotlin/Pair;", "m", "", "j", "A", "B", "C", "aSerializer", "bSerializer", "cSerializer", "Lnf/w;", "p", "Lkotlin/Char$Companion;", "", "y", "", "d", "Lkotlin/Byte$Companion;", "", "x", "", "c", "Lnf/a0;", "q", "Lkotlin/Short$Companion;", "", "D", "", "o", "Lnf/h0;", "t", "Lkotlin/Int$Companion;", "", "", "g", "Lnf/c0;", "r", "Lkotlin/Long$Companion;", "", "", "i", "Lnf/e0;", "s", "Lkotlin/Float$Companion;", "", "", "f", "Lkotlin/Double$Companion;", "", "z", "", "e", "Lkotlin/Boolean$Companion;", "", "w", "(Lkotlin/jvm/internal/c;)Lkotlinx/serialization/KSerializer;", "", "b", "", "v", "(Lkotlin/Unit;)Lkotlinx/serialization/KSerializer;", "Lkotlin/String$Companion;", "", "E", "", "T", "Lkotlin/reflect/KClass;", "kClass", "elementSerializer", "", "a", "", "h", "", "n", "", "k", "Lnf/b0$a;", "Lnf/b0;", "G", "Lnf/d0$a;", "Lnf/d0;", "H", "Lnf/z$a;", "Lnf/z;", "F", "Lnf/g0$a;", "Lnf/g0;", "I", "Lsi/a$a;", "Lsi/a;", "J", "", "l", "u", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "getNullable$annotations", "(Lkotlinx/serialization/KSerializer;)V", "nullable", "kotlinx-serialization-core"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: zi.a */
/* loaded from: classes8.dex */
public final class C14667a {
    /* renamed from: A */
    public static final KSerializer<Float> m43A(C9961k kVar) {
        C9971q.m14633g(kVar, "<this>");
        return C3640e0.f5942a;
    }

    /* renamed from: B */
    public static final KSerializer<Integer> m42B(C9970p pVar) {
        C9971q.m14633g(pVar, "<this>");
        return C3676m0.f5992a;
    }

    /* renamed from: C */
    public static final KSerializer<Long> m41C(C9974t tVar) {
        C9971q.m14633g(tVar, "<this>");
        return C3710w0.f6033a;
    }

    /* renamed from: D */
    public static final KSerializer<Short> m40D(C9958i0 i0Var) {
        C9971q.m14633g(i0Var, "<this>");
        return C3723z1.f6061a;
    }

    /* renamed from: E */
    public static final KSerializer<String> m39E(C9962k0 k0Var) {
        C9971q.m14633g(k0Var, "<this>");
        return C3622a2.f5917a;
    }

    /* renamed from: F */
    public static final KSerializer<C11100z> m38F(C11100z.C11101a aVar) {
        C9971q.m14633g(aVar, "<this>");
        return C3651g2.f5957a;
    }

    /* renamed from: G */
    public static final KSerializer<C11056b0> m37G(C11056b0.C11057a aVar) {
        C9971q.m14633g(aVar, "<this>");
        return C3661i2.f5975a;
    }

    /* renamed from: H */
    public static final KSerializer<C11062d0> m36H(C11062d0.C11063a aVar) {
        C9971q.m14633g(aVar, "<this>");
        return C3670k2.f5985a;
    }

    /* renamed from: I */
    public static final KSerializer<C11070g0> m35I(C11070g0.C11071a aVar) {
        C9971q.m14633g(aVar, "<this>");
        return C3678m2.f5995a;
    }

    /* renamed from: J */
    public static final KSerializer<C12905a> m34J(C12905a.C0415a aVar) {
        C9971q.m14633g(aVar, "<this>");
        return C3717y.f6045a;
    }

    /* renamed from: a */
    public static final <T, E extends T> KSerializer<E[]> m33a(KClass<T> kClass, KSerializer<E> elementSerializer) {
        C9971q.m14633g(kClass, "kClass");
        C9971q.m14633g(elementSerializer, "elementSerializer");
        return new C3708v1(kClass, elementSerializer);
    }

    /* renamed from: b */
    public static final KSerializer<boolean[]> m32b() {
        return C10254a.f22531c;
    }

    /* renamed from: c */
    public static final KSerializer<byte[]> m31c() {
        return C10255b.f22532c;
    }

    /* renamed from: d */
    public static final KSerializer<char[]> m30d() {
        return C10256c.f22533c;
    }

    /* renamed from: e */
    public static final KSerializer<double[]> m29e() {
        return C10257d.f22534c;
    }

    /* renamed from: f */
    public static final KSerializer<float[]> m28f() {
        return C10258e.f22535c;
    }

    /* renamed from: g */
    public static final KSerializer<int[]> m27g() {
        return C10259f.f22536c;
    }

    /* renamed from: h */
    public static final <T> KSerializer<List<T>> m26h(KSerializer<T> elementSerializer) {
        C9971q.m14633g(elementSerializer, "elementSerializer");
        return new C3643f(elementSerializer);
    }

    /* renamed from: i */
    public static final KSerializer<long[]> m25i() {
        return C10260g.f22537c;
    }

    /* renamed from: j */
    public static final <K, V> KSerializer<Map.Entry<K, V>> m24j(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        C9971q.m14633g(keySerializer, "keySerializer");
        C9971q.m14633g(valueSerializer, "valueSerializer");
        return new C3713x0(keySerializer, valueSerializer);
    }

    /* renamed from: k */
    public static final <K, V> KSerializer<Map<K, V>> m23k(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        C9971q.m14633g(keySerializer, "keySerializer");
        C9971q.m14633g(valueSerializer, "valueSerializer");
        return new C3695r0(keySerializer, valueSerializer);
    }

    /* renamed from: l */
    public static final KSerializer m22l() {
        return C3646f1.f5949a;
    }

    /* renamed from: m */
    public static final <K, V> KSerializer<Pair<K, V>> m21m(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        C9971q.m14633g(keySerializer, "keySerializer");
        C9971q.m14633g(valueSerializer, "valueSerializer");
        return new C3659i1(keySerializer, valueSerializer);
    }

    /* renamed from: n */
    public static final <T> KSerializer<Set<T>> m20n(KSerializer<T> elementSerializer) {
        C9971q.m14633g(elementSerializer, "elementSerializer");
        return new C3701t0(elementSerializer);
    }

    /* renamed from: o */
    public static final KSerializer<short[]> m19o() {
        return C10261h.f22538c;
    }

    /* renamed from: p */
    public static final <A, B, C> KSerializer<C11097w<A, B, C>> m18p(KSerializer<A> aSerializer, KSerializer<B> bSerializer, KSerializer<C> cSerializer) {
        C9971q.m14633g(aSerializer, "aSerializer");
        C9971q.m14633g(bSerializer, "bSerializer");
        C9971q.m14633g(cSerializer, "cSerializer");
        return new C3637d2(aSerializer, bSerializer, cSerializer);
    }

    /* renamed from: q */
    public static final KSerializer<C11053a0> m17q() {
        return C10262i.f22539c;
    }

    /* renamed from: r */
    public static final KSerializer<C11059c0> m16r() {
        return C10263j.f22540c;
    }

    /* renamed from: s */
    public static final KSerializer<C11065e0> m15s() {
        return C10264k.f22541c;
    }

    /* renamed from: t */
    public static final KSerializer<C11073h0> m14t() {
        return C10265l.f22542c;
    }

    /* renamed from: u */
    public static final <T> KSerializer<T> m13u(KSerializer<T> kSerializer) {
        C9971q.m14633g(kSerializer, "<this>");
        if (kSerializer.getDescriptor().mo13683b()) {
            return kSerializer;
        }
        return new C3650g1(kSerializer);
    }

    /* renamed from: v */
    public static final KSerializer<Unit> m12v(Unit unit) {
        C9971q.m14633g(unit, "<this>");
        return C3682n2.f5999b;
    }

    /* renamed from: w */
    public static final KSerializer<Boolean> m11w(C9943c cVar) {
        C9971q.m14633g(cVar, "<this>");
        return C3652h.f5959a;
    }

    /* renamed from: x */
    public static final KSerializer<Byte> m10x(C9945d dVar) {
        C9971q.m14633g(dVar, "<this>");
        return C3662j.f5977a;
    }

    /* renamed from: y */
    public static final KSerializer<Character> m9y(C9950f fVar) {
        C9971q.m14633g(fVar, "<this>");
        return C3683o.f6001a;
    }

    /* renamed from: z */
    public static final KSerializer<Double> m8z(C9959j jVar) {
        C9971q.m14633g(jVar, "<this>");
        return C3712x.f6038a;
    }
}
