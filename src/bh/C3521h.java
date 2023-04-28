package bh;

import gh.AbstractC7637r;
import gh.AbstractC7649x;
import gh.C7636q;
import gh.C7643s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KProperty;
import nf.C11098x;
import p013ah.C1389a;
import p013ah.C1396e;
import p013ah.C1399g;
import p086eh.AbstractC6895g;
import p086eh.AbstractC6909u;
import p087ei.AbstractC6938i;
import p087ei.AbstractC6944n;
import p087ei.C6943m;
import p141hh.C8019a;
import p249nh.C11136b;
import p249nh.C11137c;
import p267of.C11289v;
import p268og.AbstractC11299a1;
import p268og.AbstractC11313e;
import p324rg.AbstractC12653z;
import p407wh.C13885d;
import pg.AbstractC11672g;

/* renamed from: bh.h */
/* loaded from: classes8.dex */
public final class C3521h extends AbstractC12653z {

    /* renamed from: x */
    static final /* synthetic */ KProperty<Object>[] f5686x = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C3521h.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C3521h.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* renamed from: q */
    private final AbstractC6909u f5687q;

    /* renamed from: r */
    private final C1399g f5688r;

    /* renamed from: s */
    private final AbstractC6938i f5689s;

    /* renamed from: t */
    private final C3496d f5690t;

    /* renamed from: u */
    private final AbstractC6938i<List<C11137c>> f5691u;

    /* renamed from: v */
    private final AbstractC11672g f5692v;

    /* renamed from: w */
    private final AbstractC6938i f5693w;

    /* renamed from: bh.h$a */
    /* loaded from: classes8.dex */
    static final class C3522a extends AbstractC9973s implements Function0<Map<String, ? extends AbstractC7637r>> {
        C3522a() {
            super(0);
        }

        /* renamed from: a */
        public final Map<String, AbstractC7637r> invoke() {
            Map<String, AbstractC7637r> r;
            Pair pair;
            AbstractC7649x o = C3521h.this.f5688r.m41174a().m41195o();
            String b = C3521h.this.mo6103e().m10803b();
            C9971q.m14634f(b, "fqName.asString()");
            List<String> a = o.mo21798a(b);
            C3521h hVar = C3521h.this;
            ArrayList arrayList = new ArrayList();
            for (String str : a) {
                C11136b m = C11136b.m10805m(C13885d.m2399d(str).m2398e());
                C9971q.m14634f(m, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                AbstractC7637r b2 = C7636q.m21818b(hVar.f5688r.m41174a().m41200j(), m);
                if (b2 != null) {
                    pair = C11098x.m10921a(str, b2);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            r = C11289v.m10241r(arrayList);
            return r;
        }
    }

    /* renamed from: bh.h$b */
    /* loaded from: classes8.dex */
    static final class C3523b extends AbstractC9973s implements Function0<HashMap<C13885d, C13885d>> {

        /* renamed from: bh.h$b$a */
        /* loaded from: classes8.dex */
        public /* synthetic */ class C3524a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f5696a;

            static {
                int[] iArr = new int[C8019a.EnumC0249a.values().length];
                try {
                    iArr[C8019a.EnumC0249a.MULTIFILE_CLASS_PART.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C8019a.EnumC0249a.FILE_FACADE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f5696a = iArr;
            }
        }

        C3523b() {
            super(0);
        }

        /* renamed from: a */
        public final HashMap<C13885d, C13885d> invoke() {
            HashMap<C13885d, C13885d> hashMap = new HashMap<>();
            for (Map.Entry<String, AbstractC7637r> entry : C3521h.this.m34192M0().entrySet()) {
                C13885d d = C13885d.m2399d(entry.getKey());
                C9971q.m14634f(d, "byInternalName(partInternalName)");
                C8019a d2 = entry.getValue().mo4630d();
                int i = C3524a.f5696a[d2.m20842c().ordinal()];
                if (i == 1) {
                    String e = d2.m20840e();
                    if (e != null) {
                        C13885d d3 = C13885d.m2399d(e);
                        C9971q.m14634f(d3, "byInternalName(header.mu…: continue@kotlinClasses)");
                        hashMap.put(d, d3);
                    }
                } else if (i == 2) {
                    hashMap.put(d, d);
                }
            }
            return hashMap;
        }
    }

    /* renamed from: bh.h$c */
    /* loaded from: classes8.dex */
    static final class C3525c extends AbstractC9973s implements Function0<List<? extends C11137c>> {
        C3525c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends C11137c> invoke() {
            int t;
            Collection<AbstractC6909u> u = C3521h.this.f5687q.mo3972u();
            t = C9907k.m14809t(u, 10);
            ArrayList arrayList = new ArrayList(t);
            for (AbstractC6909u uVar : u) {
                arrayList.add(uVar.mo3973e());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3521h(C1399g outerContext, AbstractC6909u jPackage) {
        super(outerContext.m41171d(), jPackage.mo3973e());
        List i;
        AbstractC11672g gVar;
        C9971q.m14633g(outerContext, "outerContext");
        C9971q.m14633g(jPackage, "jPackage");
        this.f5687q = jPackage;
        C1399g d = C1389a.m41217d(outerContext, this, null, 0, 6, null);
        this.f5688r = d;
        this.f5689s = d.m41170e().mo23898c(new C3522a());
        this.f5690t = new C3496d(d, jPackage, this);
        AbstractC6944n e = d.m41170e();
        C3525c cVar = new C3525c();
        i = C9906j.m14820i();
        this.f5691u = e.mo23899b(cVar, i);
        if (d.m41174a().m41201i().m1483b()) {
            gVar = AbstractC11672g.f26044g.m9048b();
        } else {
            gVar = C1396e.m41179a(d, jPackage);
        }
        this.f5692v = gVar;
        this.f5693w = d.m41170e().mo23898c(new C3523b());
    }

    /* renamed from: L0 */
    public final AbstractC11313e m34193L0(AbstractC6895g jClass) {
        C9971q.m14633g(jClass, "jClass");
        return this.f5690t.m34291j().m34185O(jClass);
    }

    /* renamed from: M0 */
    public final Map<String, AbstractC7637r> m34192M0() {
        return (Map) C6943m.m23902a(this.f5689s, this, f5686x[0]);
    }

    /* renamed from: N0 */
    public C3496d mo6298o() {
        return this.f5690t;
    }

    /* renamed from: O0 */
    public final List<C11137c> m34190O0() {
        return this.f5691u.invoke();
    }

    @Override // pg.C11665b, pg.AbstractC11664a
    public AbstractC11672g getAnnotations() {
        return this.f5692v;
    }

    @Override // p324rg.AbstractC12653z, p324rg.AbstractC12616k, p268og.AbstractC11365p
    /* renamed from: j */
    public AbstractC11299a1 mo6102j() {
        return new C7643s(this);
    }

    @Override // p324rg.AbstractC12653z, p324rg.AbstractC12612j
    public String toString() {
        return "Lazy Java package fragment: " + mo6103e() + " of module " + this.f5688r.m41174a().m41197m();
    }
}
