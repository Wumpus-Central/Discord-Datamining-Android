package p427xg;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.collections.C9921w;
import nf.C11098x;
import p108fh.C7177i;
import p108fh.EnumC7176h;
import p249nh.C11137c;
import p267of.C11288u;
import p267of.C11289v;

/* renamed from: xg.c */
/* loaded from: classes8.dex */
public final class C14109c {

    /* renamed from: a */
    private static final C11137c f31868a = new C11137c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b */
    private static final C11137c f31869b = new C11137c("javax.annotation.meta.TypeQualifier");

    /* renamed from: c */
    private static final C11137c f31870c = new C11137c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d */
    private static final C11137c f31871d = new C11137c("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e */
    private static final List<EnumC14107b> f31872e;

    /* renamed from: f */
    private static final Map<C11137c, C14150r> f31873f;

    /* renamed from: g */
    private static final Map<C11137c, C14150r> f31874g;

    /* renamed from: h */
    private static final Set<C11137c> f31875h;

    static {
        List<EnumC14107b> l;
        Map<C11137c, C14150r> e;
        List d;
        List d2;
        Map k;
        Map<C11137c, C14150r> o;
        Set<C11137c> i;
        EnumC14107b bVar = EnumC14107b.VALUE_PARAMETER;
        l = C9906j.m14817l(EnumC14107b.FIELD, EnumC14107b.METHOD_RETURN_TYPE, bVar, EnumC14107b.TYPE_PARAMETER_BOUNDS, EnumC14107b.TYPE_USE);
        f31872e = l;
        C11137c i2 = C14110c0.m1627i();
        EnumC7176h hVar = EnumC7176h.NOT_NULL;
        e = C11288u.m10254e(C11098x.m10921a(i2, new C14150r(new C7177i(hVar, false, 2, null), l, false)));
        f31873f = e;
        C11137c cVar = new C11137c("javax.annotation.ParametersAreNullableByDefault");
        C7177i iVar = new C7177i(EnumC7176h.NULLABLE, false, 2, null);
        d = C9905i.m14825d(bVar);
        C11137c cVar2 = new C11137c("javax.annotation.ParametersAreNonnullByDefault");
        C7177i iVar2 = new C7177i(hVar, false, 2, null);
        d2 = C9905i.m14825d(bVar);
        k = C11289v.m10248k(C11098x.m10921a(cVar, new C14150r(iVar, d, false, 4, null)), C11098x.m10921a(cVar2, new C14150r(iVar2, d2, false, 4, null)));
        o = C11289v.m10244o(k, e);
        f31874g = o;
        i = C9921w.m14717i(C14110c0.m1630f(), C14110c0.m1631e());
        f31875h = i;
    }

    /* renamed from: a */
    public static final Map<C11137c, C14150r> m1642a() {
        return f31874g;
    }

    /* renamed from: b */
    public static final Set<C11137c> m1641b() {
        return f31875h;
    }

    /* renamed from: c */
    public static final Map<C11137c, C14150r> m1640c() {
        return f31873f;
    }

    /* renamed from: d */
    public static final C11137c m1639d() {
        return f31871d;
    }

    /* renamed from: e */
    public static final C11137c m1638e() {
        return f31870c;
    }

    /* renamed from: f */
    public static final C11137c m1637f() {
        return f31869b;
    }

    /* renamed from: g */
    public static final C11137c m1636g() {
        return f31868a;
    }
}
