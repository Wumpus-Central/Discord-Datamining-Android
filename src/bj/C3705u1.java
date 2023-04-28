package bj;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9943c;
import kotlin.jvm.internal.C9945d;
import kotlin.jvm.internal.C9950f;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9958i0;
import kotlin.jvm.internal.C9959j;
import kotlin.jvm.internal.C9961k;
import kotlin.jvm.internal.C9962k0;
import kotlin.jvm.internal.C9970p;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.C9974t;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nf.C11053a0;
import nf.C11056b0;
import nf.C11059c0;
import nf.C11062d0;
import nf.C11065e0;
import nf.C11070g0;
import nf.C11073h0;
import nf.C11098x;
import nf.C11100z;
import p014aj.AbstractC1413e;
import p267of.C11289v;
import p326ri.C12692c;
import p326ri.C12709n;
import p326ri.C12718u;
import p469zi.C14667a;
import si.C12905a;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\f\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0002\u001a$\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\"\b\b\u0000\u0010\n*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0000\"6\u0010\u0012\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\f0\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m15073d2 = {"", "serialName", "Laj/e;", "kind", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "", "d", "c", "", "T", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "b", "", "Ljava/util/Map;", "getBUILTIN_SERIALIZERS$annotations", "()V", "BUILTIN_SERIALIZERS", "kotlinx-serialization-core"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: bj.u1 */
/* loaded from: classes8.dex */
public final class C3705u1 {

    /* renamed from: a */
    private static final Map<KClass<? extends Object>, KSerializer<? extends Object>> f6024a;

    static {
        Map<KClass<? extends Object>, KSerializer<? extends Object>> k;
        k = C11289v.m10248k(C11098x.m10921a(C9951f0.m14684b(String.class), C14667a.m39E(C9962k0.f22091a)), C11098x.m10921a(C9951f0.m14684b(Character.TYPE), C14667a.m9y(C9950f.f22076a)), C11098x.m10921a(C9951f0.m14684b(char[].class), C14667a.m30d()), C11098x.m10921a(C9951f0.m14684b(Double.TYPE), C14667a.m8z(C9959j.f22088a)), C11098x.m10921a(C9951f0.m14684b(double[].class), C14667a.m29e()), C11098x.m10921a(C9951f0.m14684b(Float.TYPE), C14667a.m43A(C9961k.f22090a)), C11098x.m10921a(C9951f0.m14684b(float[].class), C14667a.m28f()), C11098x.m10921a(C9951f0.m14684b(Long.TYPE), C14667a.m41C(C9974t.f22095a)), C11098x.m10921a(C9951f0.m14684b(long[].class), C14667a.m25i()), C11098x.m10921a(C9951f0.m14684b(C11062d0.class), C14667a.m36H(C11062d0.f24580l)), C11098x.m10921a(C9951f0.m14684b(C11065e0.class), C14667a.m15s()), C11098x.m10921a(C9951f0.m14684b(Integer.TYPE), C14667a.m42B(C9970p.f22094a)), C11098x.m10921a(C9951f0.m14684b(int[].class), C14667a.m27g()), C11098x.m10921a(C9951f0.m14684b(C11056b0.class), C14667a.m37G(C11056b0.f24571l)), C11098x.m10921a(C9951f0.m14684b(C11059c0.class), C14667a.m16r()), C11098x.m10921a(C9951f0.m14684b(Short.TYPE), C14667a.m40D(C9958i0.f22087a)), C11098x.m10921a(C9951f0.m14684b(short[].class), C14667a.m19o()), C11098x.m10921a(C9951f0.m14684b(C11070g0.class), C14667a.m35I(C11070g0.f24586l)), C11098x.m10921a(C9951f0.m14684b(C11073h0.class), C14667a.m14t()), C11098x.m10921a(C9951f0.m14684b(Byte.TYPE), C14667a.m10x(C9945d.f22073a)), C11098x.m10921a(C9951f0.m14684b(byte[].class), C14667a.m31c()), C11098x.m10921a(C9951f0.m14684b(C11100z.class), C14667a.m38F(C11100z.f24620l)), C11098x.m10921a(C9951f0.m14684b(C11053a0.class), C14667a.m17q()), C11098x.m10921a(C9951f0.m14684b(Boolean.TYPE), C14667a.m11w(C9943c.f22072a)), C11098x.m10921a(C9951f0.m14684b(boolean[].class), C14667a.m32b()), C11098x.m10921a(C9951f0.m14684b(Unit.class), C14667a.m12v(Unit.f22042a)), C11098x.m10921a(C9951f0.m14684b(Void.class), C14667a.m22l()), C11098x.m10921a(C9951f0.m14684b(C12905a.class), C14667a.m34J(C12905a.f28981l)));
        f6024a = k;
    }

    /* renamed from: a */
    public static final SerialDescriptor m33787a(String serialName, AbstractC1413e kind) {
        C9971q.m14633g(serialName, "serialName");
        C9971q.m14633g(kind, "kind");
        m33784d(serialName);
        return new C3702t1(serialName, kind);
    }

    /* renamed from: b */
    public static final <T> KSerializer<T> m33786b(KClass<T> kClass) {
        C9971q.m14633g(kClass, "<this>");
        return (KSerializer<T>) f6024a.get(kClass);
    }

    /* renamed from: c */
    private static final String m33785c(String str) {
        if (!(str.length() > 0)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char charAt = str.charAt(0);
        sb2.append((Object) (Character.isLowerCase(charAt) ? C12692c.m5865e(charAt) : String.valueOf(charAt)));
        String substring = str.substring(1);
        C9971q.m14634f(substring, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring);
        return sb2.toString();
    }

    /* renamed from: d */
    private static final void m33784d(String str) {
        boolean t;
        String f;
        boolean t2;
        for (KClass<? extends Object> kClass : f6024a.keySet()) {
            String l = kClass.mo14598l();
            C9971q.m14636d(l);
            String c = m33785c(l);
            t = C12718u.m5732t(str, "kotlin." + c, true);
            if (!t) {
                t2 = C12718u.m5732t(str, c, true);
                if (t2) {
                }
            }
            f = C12709n.m5756f("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + m33785c(c) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
            throw new IllegalArgumentException(f);
        }
    }
}
