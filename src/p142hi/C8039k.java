package p142hi;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7290k1;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import ki.C9883a;
import kotlin.collections.C9906j;
import kotlin.collections.C9920v;
import kotlin.jvm.internal.C9971q;
import p249nh.C11142f;
import p268og.AbstractC11327h0;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;

/* renamed from: hi.k */
/* loaded from: classes8.dex */
public final class C8039k {

    /* renamed from: c */
    private static final C8028a f17410c;

    /* renamed from: f */
    private static final AbstractC11388u0 f17413f;

    /* renamed from: g */
    private static final Set<AbstractC11388u0> f17414g;

    /* renamed from: a */
    public static final C8039k f17408a = new C8039k();

    /* renamed from: b */
    private static final AbstractC11327h0 f17409b = C8032d.f17335k;

    /* renamed from: d */
    private static final AbstractC7267g0 f17411d = m20774d(EnumC8038j.CYCLIC_SUPERTYPES, new String[0]);

    /* renamed from: e */
    private static final AbstractC7267g0 f17412e = m20774d(EnumC8038j.ERROR_PROPERTY_TYPE, new String[0]);

    static {
        Set<AbstractC11388u0> c;
        String format = String.format(EnumC8029b.ERROR_CLASS.m20791b(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        C9971q.m14634f(format, "format(this, *args)");
        C11142f i = C11142f.m10764i(format);
        C9971q.m14634f(i, "special(ErrorEntity.ERRO….format(\"unknown class\"))");
        f17410c = new C8028a(i);
        C8033e eVar = new C8033e();
        f17413f = eVar;
        c = C9920v.m14723c(eVar);
        f17414g = c;
    }

    private C8039k() {
    }

    /* renamed from: a */
    public static final C8034f m20777a(EnumC8035g kind, boolean z, String... formatParams) {
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(formatParams, "formatParams");
        if (z) {
            return new C8040l(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        }
        return new C8034f(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    /* renamed from: b */
    public static final C8034f m20776b(EnumC8035g kind, String... formatParams) {
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(formatParams, "formatParams");
        return m20777a(kind, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    /* renamed from: d */
    public static final C8036h m20774d(EnumC8038j kind, String... formatParams) {
        List<? extends AbstractC7290k1> i;
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(formatParams, "formatParams");
        C8039k kVar = f17408a;
        i = C9906j.m14820i();
        return kVar.m20771g(kind, i, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    /* renamed from: m */
    public static final boolean m20765m(AbstractC11346m mVar) {
        if (mVar != null) {
            C8039k kVar = f17408a;
            if (kVar.m20764n(mVar) || kVar.m20764n(mVar.mo6104b()) || mVar == f17409b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    private final boolean m20764n(AbstractC11346m mVar) {
        return mVar instanceof C8028a;
    }

    /* renamed from: o */
    public static final boolean m20763o(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            return false;
        }
        AbstractC7268g1 N0 = g0Var.mo5172N0();
        if (!(N0 instanceof C8037i) || ((C8037i) N0).m20782c() != EnumC8038j.UNINFERRED_TYPE_VARIABLE) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final C8036h m20775c(EnumC8038j kind, AbstractC7268g1 typeConstructor, String... formatParams) {
        List<? extends AbstractC7290k1> i;
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(typeConstructor, "typeConstructor");
        C9971q.m14633g(formatParams, "formatParams");
        i = C9906j.m14820i();
        return m20772f(kind, i, typeConstructor, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    /* renamed from: e */
    public final C8037i m20773e(EnumC8038j kind, String... formatParams) {
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(formatParams, "formatParams");
        return new C8037i(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    /* renamed from: f */
    public final C8036h m20772f(EnumC8038j kind, List<? extends AbstractC7290k1> arguments, AbstractC7268g1 typeConstructor, String... formatParams) {
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(arguments, "arguments");
        C9971q.m14633g(typeConstructor, "typeConstructor");
        C9971q.m14633g(formatParams, "formatParams");
        return new C8036h(typeConstructor, m20776b(EnumC8035g.ERROR_TYPE_SCOPE, typeConstructor.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    /* renamed from: g */
    public final C8036h m20771g(EnumC8038j kind, List<? extends AbstractC7290k1> arguments, String... formatParams) {
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(arguments, "arguments");
        C9971q.m14633g(formatParams, "formatParams");
        return m20772f(kind, arguments, m20773e(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    /* renamed from: h */
    public final C8028a m20770h() {
        return f17410c;
    }

    /* renamed from: i */
    public final AbstractC11327h0 m20769i() {
        return f17409b;
    }

    /* renamed from: j */
    public final Set<AbstractC11388u0> m20768j() {
        return f17414g;
    }

    /* renamed from: k */
    public final AbstractC7267g0 m20767k() {
        return f17412e;
    }

    /* renamed from: l */
    public final AbstractC7267g0 m20766l() {
        return f17411d;
    }

    /* renamed from: p */
    public final String m20762p(AbstractC7267g0 type) {
        C9971q.m14633g(type, "type");
        C9883a.m15086s(type);
        AbstractC7268g1 N0 = type.mo5172N0();
        if (N0 != null) {
            return ((C8037i) N0).m20781d(0);
        }
        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
    }
}
