package mh;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kh.AbstractC9874c;
import kh.C9870b;
import kh.C9877e;
import kh.C9878f;
import kh.C9879g;
import kotlin.Pair;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import mh.AbstractC10609d;
import p159ih.C8544c;
import p159ih.C8547d;
import p159ih.C8568i;
import p159ih.C8575l;
import p159ih.C8581n;
import p159ih.C8593q;
import p159ih.C8611u;
import p218lh.C10440a;
import ph.AbstractC11702i;
import ph.C11697g;

/* renamed from: mh.i */
/* loaded from: classes8.dex */
public final class C10619i {

    /* renamed from: a */
    public static final C10619i f23511a = new C10619i();

    /* renamed from: b */
    private static final C11697g f23512b;

    static {
        C11697g d = C11697g.m8879d();
        C10440a.m13311a(d);
        C9971q.m14634f(d, "newInstance().apply(JvmP…f::registerAllExtensions)");
        f23512b = d;
    }

    private C10619i() {
    }

    /* renamed from: d */
    public static /* synthetic */ AbstractC10609d.C10610a m12725d(C10619i iVar, C8581n nVar, AbstractC9874c cVar, C9879g gVar, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return iVar.m12726c(nVar, cVar, gVar, z);
    }

    /* renamed from: f */
    public static final boolean m12723f(C8581n proto) {
        C9971q.m14633g(proto, "proto");
        C9870b.C0301b a = C10608c.f23490a.m12738a();
        Object v = proto.m8832v(C10440a.f22979e);
        C9971q.m14634f(v, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean g = a.mo15135d(((Number) v).intValue());
        C9971q.m14634f(g, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return g.booleanValue();
    }

    /* renamed from: g */
    private final String m12722g(C8593q qVar, AbstractC9874c cVar) {
        if (qVar.m18794m0()) {
            return C10607b.m12739b(cVar.mo12730b(qVar.m18809X()));
        }
        return null;
    }

    /* renamed from: h */
    public static final Pair<C10614f, C8544c> m12721h(byte[] bytes, String[] strings) {
        C9971q.m14633g(bytes, "bytes");
        C9971q.m14633g(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair<>(f23511a.m12718k(byteArrayInputStream, strings), C8544c.m19352x1(byteArrayInputStream, f23512b));
    }

    /* renamed from: i */
    public static final Pair<C10614f, C8544c> m12720i(String[] data, String[] strings) {
        C9971q.m14633g(data, "data");
        C9971q.m14633g(strings, "strings");
        byte[] e = C10606a.m12742e(data);
        C9971q.m14634f(e, "decodeBytes(data)");
        return m12721h(e, strings);
    }

    /* renamed from: j */
    public static final Pair<C10614f, C8568i> m12719j(String[] data, String[] strings) {
        C9971q.m14633g(data, "data");
        C9971q.m14633g(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C10606a.m12742e(data));
        return new Pair<>(f23511a.m12718k(byteArrayInputStream, strings), C8568i.m19141F0(byteArrayInputStream, f23512b));
    }

    /* renamed from: k */
    private final C10614f m12718k(InputStream inputStream, String[] strArr) {
        C10440a.C10446e E = C10440a.C10446e.m13219E(inputStream, f23512b);
        C9971q.m14634f(E, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new C10614f(E, strArr);
    }

    /* renamed from: l */
    public static final Pair<C10614f, C8575l> m12717l(byte[] bytes, String[] strings) {
        C9971q.m14633g(bytes, "bytes");
        C9971q.m14633g(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair<>(f23511a.m12718k(byteArrayInputStream, strings), C8575l.m19037e0(byteArrayInputStream, f23512b));
    }

    /* renamed from: m */
    public static final Pair<C10614f, C8575l> m12716m(String[] data, String[] strings) {
        C9971q.m14633g(data, "data");
        C9971q.m14633g(strings, "strings");
        byte[] e = C10606a.m12742e(data);
        C9971q.m14634f(e, "decodeBytes(data)");
        return m12717l(e, strings);
    }

    /* renamed from: a */
    public final C11697g m12728a() {
        return f23512b;
    }

    /* renamed from: b */
    public final AbstractC10609d.C10611b m12727b(C8547d proto, AbstractC9874c nameResolver, C9879g typeTable) {
        String str;
        String str2;
        int t;
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(nameResolver, "nameResolver");
        C9971q.m14633g(typeTable, "typeTable");
        AbstractC11702i.C11709f<C8547d, C10440a.C10442c> constructorSignature = C10440a.f22975a;
        C9971q.m14634f(constructorSignature, "constructorSignature");
        C10440a.C10442c cVar = (C10440a.C10442c) C9877e.m15132a(proto, constructorSignature);
        if (cVar == null || !cVar.m13285A()) {
            str = "<init>";
        } else {
            str = nameResolver.getString(cVar.m13273y());
        }
        if (cVar == null || !cVar.m13272z()) {
            List<C8611u> N = proto.m19301N();
            C9971q.m14634f(N, "proto.valueParameterList");
            t = C9907k.m14809t(N, 10);
            ArrayList arrayList = new ArrayList(t);
            for (C8611u it : N) {
                C10619i iVar = f23511a;
                C9971q.m14634f(it, "it");
                String g = iVar.m12722g(C9878f.m15114q(it, typeTable), nameResolver);
                if (g == null) {
                    return null;
                }
                arrayList.add(g);
            }
            str2 = C9914r.m14760e0(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            str2 = nameResolver.getString(cVar.m13274x());
        }
        return new AbstractC10609d.C10611b(str, str2);
    }

    /* renamed from: c */
    public final AbstractC10609d.C10610a m12726c(C8581n proto, AbstractC9874c nameResolver, C9879g typeTable, boolean z) {
        C10440a.C10441b bVar;
        int i;
        String str;
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(nameResolver, "nameResolver");
        C9971q.m14633g(typeTable, "typeTable");
        AbstractC11702i.C11709f<C8581n, C10440a.C10444d> propertySignature = C10440a.f22978d;
        C9971q.m14634f(propertySignature, "propertySignature");
        C10440a.C10444d dVar = (C10440a.C10444d) C9877e.m15132a(proto, propertySignature);
        if (dVar == null) {
            return null;
        }
        if (dVar.m13254G()) {
            bVar = dVar.m13259B();
        } else {
            bVar = null;
        }
        if (bVar == null && z) {
            return null;
        }
        if (bVar == null || !bVar.m13310A()) {
            i = proto.m18952d0();
        } else {
            i = bVar.m13298y();
        }
        if (bVar == null || !bVar.m13297z()) {
            str = m12722g(C9878f.m15117n(proto, typeTable), nameResolver);
            if (str == null) {
                return null;
            }
        } else {
            str = nameResolver.getString(bVar.m13299x());
        }
        return new AbstractC10609d.C10610a(nameResolver.getString(i), str);
    }

    /* renamed from: e */
    public final AbstractC10609d.C10611b m12724e(C8568i proto, AbstractC9874c nameResolver, C9879g typeTable) {
        int i;
        String str;
        List m;
        int t;
        List<C8593q> o0;
        int t2;
        String e0;
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(nameResolver, "nameResolver");
        C9971q.m14633g(typeTable, "typeTable");
        AbstractC11702i.C11709f<C8568i, C10440a.C10442c> methodSignature = C10440a.f22976b;
        C9971q.m14634f(methodSignature, "methodSignature");
        C10440a.C10442c cVar = (C10440a.C10442c) C9877e.m15132a(proto, methodSignature);
        if (cVar == null || !cVar.m13285A()) {
            i = proto.m19115e0();
        } else {
            i = cVar.m13273y();
        }
        if (cVar == null || !cVar.m13272z()) {
            m = C9906j.m14816m(C9878f.m15120k(proto, typeTable));
            List<C8611u> q0 = proto.m19103q0();
            C9971q.m14634f(q0, "proto.valueParameterList");
            t = C9907k.m14809t(q0, 10);
            ArrayList arrayList = new ArrayList(t);
            for (C8611u it : q0) {
                C9971q.m14634f(it, "it");
                arrayList.add(C9878f.m15114q(it, typeTable));
            }
            o0 = C9914r.m14750o0(m, arrayList);
            t2 = C9907k.m14809t(o0, 10);
            ArrayList arrayList2 = new ArrayList(t2);
            for (C8593q qVar : o0) {
                String g = f23511a.m12722g(qVar, nameResolver);
                if (g == null) {
                    return null;
                }
                arrayList2.add(g);
            }
            String g2 = m12722g(C9878f.m15118m(proto, typeTable), nameResolver);
            if (g2 == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            e0 = C9914r.m14760e0(arrayList2, "", "(", ")", 0, null, null, 56, null);
            sb2.append(e0);
            sb2.append(g2);
            str = sb2.toString();
        } else {
            str = nameResolver.getString(cVar.m13274x());
        }
        return new AbstractC10609d.C10611b(nameResolver.getString(i), str);
    }
}
