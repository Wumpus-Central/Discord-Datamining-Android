package bi;

import eg.C6884j;
import fi.AbstractC7267g0;
import fi.AbstractC7304o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh.AbstractC9874c;
import kh.C9870b;
import kotlin.Pair;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.IntRange;
import p142hi.C8039k;
import p159ih.C8541b;
import p217lg.AbstractC10420h;
import p249nh.C11136b;
import p249nh.C11142f;
import p267of.AbstractC11283p;
import p267of.C11288u;
import p267of.C11289v;
import p268og.AbstractC11299a1;
import p268og.AbstractC11309d;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p268og.AbstractC11327h0;
import p268og.AbstractC11335j1;
import p268og.C11337k0;
import p268og.C11393x;
import p325rh.C12661e;
import pg.AbstractC11666c;
import pg.C11668d;
import th.AbstractC13104g;
import th.AbstractC13110k;
import th.C13097a;
import th.C13099b;
import th.C13100c;
import th.C13101d;
import th.C13102e;
import th.C13108i;
import th.C13109j;
import th.C13113l;
import th.C13114m;
import th.C13122q;
import th.C13126r;
import th.C13129u;
import th.C13130v;
import th.C13131w;
import th.C13132x;
import th.C13133y;
import th.C13134z;

/* renamed from: bi.e */
/* loaded from: classes8.dex */
public final class C3573e {

    /* renamed from: a */
    private final AbstractC11327h0 f5801a;

    /* renamed from: b */
    private final C11337k0 f5802b;

    /* renamed from: bi.e$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C3574a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5803a;

        static {
            int[] iArr = new int[C8541b.C0266b.c.EnumC0269c.values().length];
            try {
                iArr[C8541b.C0266b.c.EnumC0269c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C8541b.C0266b.c.EnumC0269c.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C8541b.C0266b.c.EnumC0269c.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C8541b.C0266b.c.EnumC0269c.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C8541b.C0266b.c.EnumC0269c.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C8541b.C0266b.c.EnumC0269c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C8541b.C0266b.c.EnumC0269c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C8541b.C0266b.c.EnumC0269c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C8541b.C0266b.c.EnumC0269c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[C8541b.C0266b.c.EnumC0269c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[C8541b.C0266b.c.EnumC0269c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[C8541b.C0266b.c.EnumC0269c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[C8541b.C0266b.c.EnumC0269c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f5803a = iArr;
        }
    }

    public C3573e(AbstractC11327h0 module, C11337k0 notFoundClasses) {
        C9971q.m14633g(module, "module");
        C9971q.m14633g(notFoundClasses, "notFoundClasses");
        this.f5801a = module;
        this.f5802b = notFoundClasses;
    }

    /* renamed from: b */
    private final boolean m34071b(AbstractC13104g<?> gVar, AbstractC7267g0 g0Var, C8541b.C0266b.c cVar) {
        int i;
        AbstractC11313e eVar;
        boolean z;
        IntRange j;
        C8541b.C0266b.c.EnumC0269c T = cVar.m19506T();
        if (T == null) {
            i = -1;
        } else {
            i = C3574a.f5803a[T.ordinal()];
        }
        if (i == 10) {
            AbstractC11326h p = g0Var.mo5172N0().mo4565p();
            if (p instanceof AbstractC11313e) {
                eVar = (AbstractC11313e) p;
            } else {
                eVar = null;
            }
            if (eVar != null && !AbstractC10420h.m13382k0(eVar)) {
                return false;
            }
        } else if (i != 13) {
            return C9971q.m14638b(gVar.mo4552a(this.f5801a), g0Var);
        } else {
            if (!(gVar instanceof C13099b) || ((C13099b) gVar).mo4590b().size() != cVar.m19515K().size()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                AbstractC7267g0 k = m34070c().m13383k(g0Var);
                C9971q.m14634f(k, "builtIns.getArrayElementType(expectedType)");
                C13099b bVar = (C13099b) gVar;
                j = C9906j.m14819j(bVar.mo4590b());
                if (!(j instanceof Collection) || !((Collection) j).isEmpty()) {
                    Iterator<Integer> it = j.iterator();
                    while (it.hasNext()) {
                        int nextInt = ((AbstractC11283p) it).nextInt();
                        C8541b.C0266b.c I = cVar.m19517I(nextInt);
                        C9971q.m14634f(I, "value.getArrayElement(i)");
                        if (!m34071b((AbstractC13104g) bVar.mo4590b().get(nextInt), k, I)) {
                            return false;
                        }
                    }
                }
            } else {
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
            }
        }
        return true;
    }

    /* renamed from: c */
    private final AbstractC10420h m34070c() {
        return this.f5801a.mo6136n();
    }

    /* renamed from: d */
    private final Pair<C11142f, AbstractC13104g<?>> m34069d(C8541b.C0266b bVar, Map<C11142f, ? extends AbstractC11335j1> map, AbstractC9874c cVar) {
        AbstractC11335j1 j1Var = (AbstractC11335j1) map.get(C3613x.m33979b(cVar, bVar.m19539x()));
        if (j1Var == null) {
            return null;
        }
        C11142f b = C3613x.m33979b(cVar, bVar.m19539x());
        AbstractC7267g0 type = j1Var.getType();
        C9971q.m14634f(type, "parameter.type");
        C8541b.C0266b.c y = bVar.m19538y();
        C9971q.m14634f(y, "proto.value");
        return new Pair<>(b, m34066g(type, y, cVar));
    }

    /* renamed from: e */
    private final AbstractC11313e m34068e(C11136b bVar) {
        return C11393x.m10147c(this.f5801a, bVar, this.f5802b);
    }

    /* renamed from: g */
    private final AbstractC13104g<?> m34066g(AbstractC7267g0 g0Var, C8541b.C0266b.c cVar, AbstractC9874c cVar2) {
        AbstractC13104g<?> f = m34067f(g0Var, cVar, cVar2);
        if (!m34071b(f, g0Var, cVar)) {
            f = null;
        }
        if (f != null) {
            return f;
        }
        AbstractC13110k.C13111a aVar = AbstractC13110k.f29415b;
        return aVar.m4588a("Unexpected argument value: actual type " + cVar.m19506T() + " != expected type " + g0Var);
    }

    /* renamed from: a */
    public final AbstractC11666c m34072a(C8541b proto, AbstractC9874c nameResolver) {
        Map h;
        Object s0;
        int t;
        int d;
        int c;
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(nameResolver, "nameResolver");
        AbstractC11313e e = m34068e(C3613x.m33980a(nameResolver, proto.m19566B()));
        h = C11289v.m10251h();
        if (proto.m19553y() != 0 && !C8039k.m20765m(e) && C12661e.m6034t(e)) {
            Collection<AbstractC11309d> l = e.mo6110l();
            C9971q.m14634f(l, "annotationClass.constructors");
            s0 = C9914r.m14746s0(l);
            AbstractC11309d dVar = (AbstractC11309d) s0;
            if (dVar != null) {
                List<AbstractC11335j1> i = dVar.mo6242i();
                C9971q.m14634f(i, "constructor.valueParameters");
                t = C9907k.m14809t(i, 10);
                d = C11288u.m10255d(t);
                c = C6884j.m23961c(d, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                for (Object obj : i) {
                    linkedHashMap.put(((AbstractC11335j1) obj).getName(), obj);
                }
                List<C8541b.C0266b> z = proto.m19552z();
                C9971q.m14634f(z, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (C8541b.C0266b it : z) {
                    C9971q.m14634f(it, "it");
                    Pair<C11142f, AbstractC13104g<?>> d2 = m34069d(it, linkedHashMap, nameResolver);
                    if (d2 != null) {
                        arrayList.add(d2);
                    }
                }
                h = C11289v.m10241r(arrayList);
            }
        }
        return new C11668d(e.mo6166p(), h, AbstractC11299a1.f25230a);
    }

    /* renamed from: f */
    public final AbstractC13104g<?> m34067f(AbstractC7267g0 expectedType, C8541b.C0266b.c value, AbstractC9874c nameResolver) {
        int i;
        AbstractC13104g<?> gVar;
        AbstractC13104g<?> gVar2;
        boolean z;
        int t;
        C9971q.m14633g(expectedType, "expectedType");
        C9971q.m14633g(value, "value");
        C9971q.m14633g(nameResolver, "nameResolver");
        Boolean g = C9870b.f38762O.mo15135d(value.m19510P());
        C9971q.m14634f(g, "IS_UNSIGNED.get(value.flags)");
        boolean booleanValue = g.booleanValue();
        C8541b.C0266b.c.EnumC0269c T = value.m19506T();
        if (T == null) {
            i = -1;
        } else {
            i = C3574a.f5803a[T.ordinal()];
        }
        switch (i) {
            case 1:
                byte R = (byte) value.m19508R();
                if (booleanValue) {
                    return new C13131w(R);
                }
                return new C13101d(R);
            case 2:
                gVar = new C13102e((char) value.m19508R());
                break;
            case 3:
                short R2 = (short) value.m19508R();
                if (booleanValue) {
                    return new C13134z(R2);
                }
                return new C13129u(R2);
            case 4:
                int R3 = (int) value.m19508R();
                if (booleanValue) {
                    return new C13132x(R3);
                }
                return new C13114m(R3);
            case 5:
                long R4 = value.m19508R();
                if (booleanValue) {
                    gVar2 = new C13133y(R4);
                } else {
                    gVar2 = new C13126r(R4);
                }
                return gVar2;
            case 6:
                gVar = new C13113l(value.m19509Q());
                break;
            case 7:
                gVar = new C13108i(value.m19512N());
                break;
            case 8:
                if (value.m19508R() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                gVar = new C13100c(z);
                break;
            case 9:
                gVar = new C13130v(nameResolver.getString(value.m19507S()));
                break;
            case 10:
                gVar = new C13122q(C3613x.m33980a(nameResolver, value.m19514L()), value.m19518H());
                break;
            case 11:
                gVar = new C13109j(C3613x.m33980a(nameResolver, value.m19514L()), C3613x.m33979b(nameResolver, value.m19511O()));
                break;
            case 12:
                C8541b G = value.m19519G();
                C9971q.m14634f(G, "value.annotation");
                gVar = new C13097a(m34072a(G, nameResolver));
                break;
            case 13:
                List<C8541b.C0266b.c> K = value.m19515K();
                C9971q.m14634f(K, "value.arrayElementList");
                t = C9907k.m14809t(K, 10);
                ArrayList arrayList = new ArrayList(t);
                for (C8541b.C0266b.c it : K) {
                    AbstractC7304o0 i2 = m34070c().m13387i();
                    C9971q.m14634f(i2, "builtIns.anyType");
                    C9971q.m14634f(it, "it");
                    arrayList.add(m34067f(i2, it, nameResolver));
                }
                return new C3589n(arrayList, expectedType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.m19506T() + " (expected " + expectedType + ')').toString());
        }
        return gVar;
    }
}
