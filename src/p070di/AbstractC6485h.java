package p070di;

import bi.C3588m;
import bi.C3613x;
import eg.C6884j;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9910n;
import kotlin.collections.C9911o;
import kotlin.collections.C9914r;
import kotlin.collections.C9922x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KProperty;
import p087ei.AbstractC6936g;
import p087ei.AbstractC6937h;
import p087ei.AbstractC6938i;
import p087ei.AbstractC6939j;
import p087ei.C6943m;
import p159ih.C8568i;
import p159ih.C8581n;
import p159ih.C8600r;
import p249nh.C11136b;
import p249nh.C11142f;
import p267of.C11288u;
import p267of.C11289v;
import p268og.AbstractC11313e;
import p268og.AbstractC11316e1;
import p268og.AbstractC11326h;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;
import p268og.AbstractC11404z0;
import p286pi.C11754a;
import p325rh.C12666h;
import p406wg.AbstractC13878b;
import p448yh.AbstractC14414i;
import p448yh.C14403d;
import ph.AbstractC11686a;
import ph.AbstractC11724q;
import ph.AbstractC11727s;

/* renamed from: di.h */
/* loaded from: classes8.dex */
public abstract class AbstractC6485h extends AbstractC14414i {

    /* renamed from: f */
    static final /* synthetic */ KProperty<Object>[] f13584f = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(AbstractC6485h.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(AbstractC6485h.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b */
    private final C3588m f13585b;

    /* renamed from: c */
    private final AbstractC6486a f13586c;

    /* renamed from: d */
    private final AbstractC6938i f13587d;

    /* renamed from: e */
    private final AbstractC6939j f13588e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: di.h$a */
    /* loaded from: classes8.dex */
    public interface AbstractC6486a {
        /* renamed from: a */
        Collection<AbstractC11388u0> mo25442a(C11142f fVar, AbstractC13878b bVar);

        /* renamed from: b */
        Set<C11142f> mo25441b();

        /* renamed from: c */
        Set<C11142f> mo25440c();

        /* renamed from: d */
        Collection<AbstractC11404z0> mo25439d(C11142f fVar, AbstractC13878b bVar);

        /* renamed from: e */
        AbstractC11316e1 mo25438e(C11142f fVar);

        /* renamed from: f */
        Set<C11142f> mo25437f();

        /* renamed from: g */
        void mo25436g(Collection<AbstractC11346m> collection, C14403d dVar, Function1<? super C11142f, Boolean> function1, AbstractC13878b bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: di.h$b */
    /* loaded from: classes8.dex */
    public final class C6487b implements AbstractC6486a {

        /* renamed from: o */
        static final /* synthetic */ KProperty<Object>[] f13589o = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C6487b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C6487b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C6487b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C6487b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C6487b.class), "allProperties", "getAllProperties()Ljava/util/List;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C6487b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C6487b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C6487b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C6487b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C6487b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a */
        private final List<C8568i> f13590a;

        /* renamed from: b */
        private final List<C8581n> f13591b;

        /* renamed from: c */
        private final List<C8600r> f13592c;

        /* renamed from: d */
        private final AbstractC6938i f13593d;

        /* renamed from: e */
        private final AbstractC6938i f13594e;

        /* renamed from: f */
        private final AbstractC6938i f13595f;

        /* renamed from: g */
        private final AbstractC6938i f13596g;

        /* renamed from: h */
        private final AbstractC6938i f13597h;

        /* renamed from: i */
        private final AbstractC6938i f13598i;

        /* renamed from: j */
        private final AbstractC6938i f13599j;

        /* renamed from: k */
        private final AbstractC6938i f13600k;

        /* renamed from: l */
        private final AbstractC6938i f13601l;

        /* renamed from: m */
        private final AbstractC6938i f13602m;

        /* renamed from: n */
        final /* synthetic */ AbstractC6485h f13603n;

        /* renamed from: di.h$b$a */
        /* loaded from: classes8.dex */
        static final class C6488a extends AbstractC9973s implements Function0<List<? extends AbstractC11404z0>> {
            C6488a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AbstractC11404z0> invoke() {
                List<? extends AbstractC11404z0> o0;
                o0 = C9914r.m14750o0(C6487b.this.m25471D(), C6487b.this.m25454t());
                return o0;
            }
        }

        /* renamed from: di.h$b$b */
        /* loaded from: classes8.dex */
        static final class C0196b extends AbstractC9973s implements Function0<List<? extends AbstractC11388u0>> {
            C0196b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AbstractC11388u0> invoke() {
                List<? extends AbstractC11388u0> o0;
                o0 = C9914r.m14750o0(C6487b.this.m25470E(), C6487b.this.m25453u());
                return o0;
            }
        }

        /* renamed from: di.h$b$c */
        /* loaded from: classes8.dex */
        static final class C6489c extends AbstractC9973s implements Function0<List<? extends AbstractC11316e1>> {
            C6489c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AbstractC11316e1> invoke() {
                return C6487b.this.m25448z();
            }
        }

        /* renamed from: di.h$b$d */
        /* loaded from: classes8.dex */
        static final class C6490d extends AbstractC9973s implements Function0<List<? extends AbstractC11404z0>> {
            C6490d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AbstractC11404z0> invoke() {
                return C6487b.this.m25452v();
            }
        }

        /* renamed from: di.h$b$e */
        /* loaded from: classes8.dex */
        static final class C6491e extends AbstractC9973s implements Function0<List<? extends AbstractC11388u0>> {
            C6491e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AbstractC11388u0> invoke() {
                return C6487b.this.m25449y();
            }
        }

        /* renamed from: di.h$b$f */
        /* loaded from: classes8.dex */
        static final class C6492f extends AbstractC9973s implements Function0<Set<? extends C11142f>> {

            /* renamed from: l */
            final /* synthetic */ AbstractC6485h f13610l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6492f(AbstractC6485h hVar) {
                super(0);
                this.f13610l = hVar;
            }

            /* renamed from: a */
            public final Set<C11142f> invoke() {
                Set<C11142f> l;
                C6487b bVar = C6487b.this;
                List<AbstractC11724q> list = bVar.f13590a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                AbstractC6485h hVar = bVar.f13603n;
                for (AbstractC11724q qVar : list) {
                    linkedHashSet.add(C3613x.m33979b(hVar.m25479p().m34015g(), ((C8568i) qVar).m19115e0()));
                }
                l = C9922x.m14714l(linkedHashSet, this.f13610l.mo25415t());
                return l;
            }
        }

        /* renamed from: di.h$b$g */
        /* loaded from: classes8.dex */
        static final class C6493g extends AbstractC9973s implements Function0<Map<C11142f, ? extends List<? extends AbstractC11404z0>>> {
            C6493g() {
                super(0);
            }

            /* renamed from: a */
            public final Map<C11142f, List<AbstractC11404z0>> invoke() {
                List A = C6487b.this.m25474A();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : A) {
                    C11142f name = ((AbstractC11404z0) obj).getName();
                    C9971q.m14634f(name, "it.name");
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* renamed from: di.h$b$h */
        /* loaded from: classes8.dex */
        static final class C0197h extends AbstractC9973s implements Function0<Map<C11142f, ? extends List<? extends AbstractC11388u0>>> {
            C0197h() {
                super(0);
            }

            /* renamed from: a */
            public final Map<C11142f, List<AbstractC11388u0>> invoke() {
                List B = C6487b.this.m25473B();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : B) {
                    C11142f name = ((AbstractC11388u0) obj).getName();
                    C9971q.m14634f(name, "it.name");
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* renamed from: di.h$b$i */
        /* loaded from: classes8.dex */
        static final class C6494i extends AbstractC9973s implements Function0<Map<C11142f, ? extends AbstractC11316e1>> {
            C6494i() {
                super(0);
            }

            /* renamed from: a */
            public final Map<C11142f, AbstractC11316e1> invoke() {
                int t;
                int d;
                int c;
                List C = C6487b.this.m25472C();
                t = C9907k.m14809t(C, 10);
                d = C11288u.m10255d(t);
                c = C6884j.m23961c(d, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                for (Object obj : C) {
                    C11142f name = ((AbstractC11316e1) obj).getName();
                    C9971q.m14634f(name, "it.name");
                    linkedHashMap.put(name, obj);
                }
                return linkedHashMap;
            }
        }

        /* renamed from: di.h$b$j */
        /* loaded from: classes8.dex */
        static final class C6495j extends AbstractC9973s implements Function0<Set<? extends C11142f>> {

            /* renamed from: l */
            final /* synthetic */ AbstractC6485h f13615l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6495j(AbstractC6485h hVar) {
                super(0);
                this.f13615l = hVar;
            }

            /* renamed from: a */
            public final Set<C11142f> invoke() {
                Set<C11142f> l;
                C6487b bVar = C6487b.this;
                List<AbstractC11724q> list = bVar.f13591b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                AbstractC6485h hVar = bVar.f13603n;
                for (AbstractC11724q qVar : list) {
                    linkedHashSet.add(C3613x.m33979b(hVar.m25479p().m34015g(), ((C8581n) qVar).m18952d0()));
                }
                l = C9922x.m14714l(linkedHashSet, this.f13615l.mo25414u());
                return l;
            }
        }

        public C6487b(AbstractC6485h hVar, List<C8568i> functionList, List<C8581n> propertyList, List<C8600r> typeAliasList) {
            C9971q.m14633g(functionList, "functionList");
            C9971q.m14633g(propertyList, "propertyList");
            C9971q.m14633g(typeAliasList, "typeAliasList");
            this.f13603n = hVar;
            this.f13590a = functionList;
            this.f13591b = propertyList;
            this.f13592c = !hVar.m25479p().m34019c().m34043g().mo34025c() ? C9906j.m14820i() : typeAliasList;
            this.f13593d = hVar.m25479p().m34014h().mo23898c(new C6490d());
            this.f13594e = hVar.m25479p().m34014h().mo23898c(new C6491e());
            this.f13595f = hVar.m25479p().m34014h().mo23898c(new C6489c());
            this.f13596g = hVar.m25479p().m34014h().mo23898c(new C6488a());
            this.f13597h = hVar.m25479p().m34014h().mo23898c(new C0196b());
            this.f13598i = hVar.m25479p().m34014h().mo23898c(new C6494i());
            this.f13599j = hVar.m25479p().m34014h().mo23898c(new C6493g());
            this.f13600k = hVar.m25479p().m34014h().mo23898c(new C0197h());
            this.f13601l = hVar.m25479p().m34014h().mo23898c(new C6492f(hVar));
            this.f13602m = hVar.m25479p().m34014h().mo23898c(new C6495j(hVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A */
        public final List<AbstractC11404z0> m25474A() {
            return (List) C6943m.m23902a(this.f13596g, this, f13589o[3]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B */
        public final List<AbstractC11388u0> m25473B() {
            return (List) C6943m.m23902a(this.f13597h, this, f13589o[4]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final List<AbstractC11316e1> m25472C() {
            return (List) C6943m.m23902a(this.f13595f, this, f13589o[2]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D */
        public final List<AbstractC11404z0> m25471D() {
            return (List) C6943m.m23902a(this.f13593d, this, f13589o[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E */
        public final List<AbstractC11388u0> m25470E() {
            return (List) C6943m.m23902a(this.f13594e, this, f13589o[1]);
        }

        /* renamed from: F */
        private final Map<C11142f, Collection<AbstractC11404z0>> m25469F() {
            return (Map) C6943m.m23902a(this.f13599j, this, f13589o[6]);
        }

        /* renamed from: G */
        private final Map<C11142f, Collection<AbstractC11388u0>> m25468G() {
            return (Map) C6943m.m23902a(this.f13600k, this, f13589o[7]);
        }

        /* renamed from: H */
        private final Map<C11142f, AbstractC11316e1> m25467H() {
            return (Map) C6943m.m23902a(this.f13598i, this, f13589o[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public final List<AbstractC11404z0> m25454t() {
            Set<C11142f> t = this.f13603n.mo25415t();
            ArrayList arrayList = new ArrayList();
            for (C11142f fVar : t) {
                C9911o.m14801y(arrayList, m25451w(fVar));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public final List<AbstractC11388u0> m25453u() {
            Set<C11142f> u = this.f13603n.mo25414u();
            ArrayList arrayList = new ArrayList();
            for (C11142f fVar : u) {
                C9911o.m14801y(arrayList, m25450x(fVar));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public final List<AbstractC11404z0> m25452v() {
            List<C8568i> list = this.f13590a;
            AbstractC6485h hVar = this.f13603n;
            ArrayList arrayList = new ArrayList();
            for (AbstractC11724q qVar : list) {
                AbstractC11404z0 j = hVar.m25479p().m34016f().m33990j((C8568i) qVar);
                if (!hVar.mo25475x(j)) {
                    j = null;
                }
                if (j != null) {
                    arrayList.add(j);
                }
            }
            return arrayList;
        }

        /* renamed from: w */
        private final List<AbstractC11404z0> m25451w(C11142f fVar) {
            List<AbstractC11404z0> D = m25471D();
            AbstractC6485h hVar = this.f13603n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : D) {
                if (C9971q.m14638b(((AbstractC11346m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            hVar.mo25483k(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* renamed from: x */
        private final List<AbstractC11388u0> m25450x(C11142f fVar) {
            List<AbstractC11388u0> E = m25470E();
            AbstractC6485h hVar = this.f13603n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : E) {
                if (C9971q.m14638b(((AbstractC11346m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            hVar.mo25482l(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public final List<AbstractC11388u0> m25449y() {
            List<C8581n> list = this.f13591b;
            AbstractC6485h hVar = this.f13603n;
            ArrayList arrayList = new ArrayList();
            for (AbstractC11724q qVar : list) {
                AbstractC11388u0 l = hVar.m25479p().m34016f().m33988l((C8581n) qVar);
                if (l != null) {
                    arrayList.add(l);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public final List<AbstractC11316e1> m25448z() {
            List<C8600r> list = this.f13592c;
            AbstractC6485h hVar = this.f13603n;
            ArrayList arrayList = new ArrayList();
            for (AbstractC11724q qVar : list) {
                AbstractC11316e1 m = hVar.m25479p().m34016f().m33987m((C8600r) qVar);
                if (m != null) {
                    arrayList.add(m);
                }
            }
            return arrayList;
        }

        @Override // p070di.AbstractC6485h.AbstractC6486a
        /* renamed from: a */
        public Collection<AbstractC11388u0> mo25442a(C11142f name, AbstractC13878b location) {
            List i;
            List i2;
            C9971q.m14633g(name, "name");
            C9971q.m14633g(location, "location");
            if (!mo25440c().contains(name)) {
                i2 = C9906j.m14820i();
                return i2;
            }
            Collection<AbstractC11388u0> collection = m25468G().get(name);
            if (collection != null) {
                return collection;
            }
            i = C9906j.m14820i();
            return i;
        }

        @Override // p070di.AbstractC6485h.AbstractC6486a
        /* renamed from: b */
        public Set<C11142f> mo25441b() {
            return (Set) C6943m.m23902a(this.f13601l, this, f13589o[8]);
        }

        @Override // p070di.AbstractC6485h.AbstractC6486a
        /* renamed from: c */
        public Set<C11142f> mo25440c() {
            return (Set) C6943m.m23902a(this.f13602m, this, f13589o[9]);
        }

        @Override // p070di.AbstractC6485h.AbstractC6486a
        /* renamed from: d */
        public Collection<AbstractC11404z0> mo25439d(C11142f name, AbstractC13878b location) {
            List i;
            List i2;
            C9971q.m14633g(name, "name");
            C9971q.m14633g(location, "location");
            if (!mo25441b().contains(name)) {
                i2 = C9906j.m14820i();
                return i2;
            }
            Collection<AbstractC11404z0> collection = m25469F().get(name);
            if (collection != null) {
                return collection;
            }
            i = C9906j.m14820i();
            return i;
        }

        @Override // p070di.AbstractC6485h.AbstractC6486a
        /* renamed from: e */
        public AbstractC11316e1 mo25438e(C11142f name) {
            C9971q.m14633g(name, "name");
            return m25467H().get(name);
        }

        @Override // p070di.AbstractC6485h.AbstractC6486a
        /* renamed from: f */
        public Set<C11142f> mo25437f() {
            List<C8600r> list = this.f13592c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC6485h hVar = this.f13603n;
            for (AbstractC11724q qVar : list) {
                linkedHashSet.add(C3613x.m33979b(hVar.m25479p().m34015g(), ((C8600r) qVar).m18704X()));
            }
            return linkedHashSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p070di.AbstractC6485h.AbstractC6486a
        /* renamed from: g */
        public void mo25436g(Collection<AbstractC11346m> result, C14403d kindFilter, Function1<? super C11142f, Boolean> nameFilter, AbstractC13878b location) {
            C9971q.m14633g(result, "result");
            C9971q.m14633g(kindFilter, "kindFilter");
            C9971q.m14633g(nameFilter, "nameFilter");
            C9971q.m14633g(location, "location");
            if (kindFilter.m683a(C14403d.f32585c.m661i())) {
                for (Object obj : m25473B()) {
                    C11142f name = ((AbstractC11388u0) obj).getName();
                    C9971q.m14634f(name, "it.name");
                    if (nameFilter.invoke(name).booleanValue()) {
                        result.add(obj);
                    }
                }
            }
            if (kindFilter.m683a(C14403d.f32585c.m666d())) {
                for (Object obj2 : m25474A()) {
                    C11142f name2 = ((AbstractC11404z0) obj2).getName();
                    C9971q.m14634f(name2, "it.name");
                    if (nameFilter.invoke(name2).booleanValue()) {
                        result.add(obj2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: di.h$c */
    /* loaded from: classes8.dex */
    public final class C6496c implements AbstractC6486a {

        /* renamed from: j */
        static final /* synthetic */ KProperty<Object>[] f13616j = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C6496c.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C6496c.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a */
        private final Map<C11142f, byte[]> f13617a;

        /* renamed from: b */
        private final Map<C11142f, byte[]> f13618b;

        /* renamed from: c */
        private final Map<C11142f, byte[]> f13619c;

        /* renamed from: d */
        private final AbstractC6936g<C11142f, Collection<AbstractC11404z0>> f13620d;

        /* renamed from: e */
        private final AbstractC6936g<C11142f, Collection<AbstractC11388u0>> f13621e;

        /* renamed from: f */
        private final AbstractC6937h<C11142f, AbstractC11316e1> f13622f;

        /* renamed from: g */
        private final AbstractC6938i f13623g;

        /* renamed from: h */
        private final AbstractC6938i f13624h;

        /* renamed from: i */
        final /* synthetic */ AbstractC6485h f13625i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: di.h$c$a */
        /* loaded from: classes8.dex */
        public static final class C6497a extends AbstractC9973s implements Function0 {

            /* renamed from: k */
            final /* synthetic */ AbstractC11727s f13626k;

            /* renamed from: l */
            final /* synthetic */ ByteArrayInputStream f13627l;

            /* renamed from: m */
            final /* synthetic */ AbstractC6485h f13628m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6497a(AbstractC11727s sVar, ByteArrayInputStream byteArrayInputStream, AbstractC6485h hVar) {
                super(0);
                this.f13626k = sVar;
                this.f13627l = byteArrayInputStream;
                this.f13628m = hVar;
            }

            /* renamed from: a */
            public final AbstractC11724q invoke() {
                return (AbstractC11724q) this.f13626k.mo8774a(this.f13627l, this.f13628m.m25479p().m34019c().m34040j());
            }
        }

        /* renamed from: di.h$c$b */
        /* loaded from: classes8.dex */
        static final class C6498b extends AbstractC9973s implements Function0<Set<? extends C11142f>> {

            /* renamed from: l */
            final /* synthetic */ AbstractC6485h f13630l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6498b(AbstractC6485h hVar) {
                super(0);
                this.f13630l = hVar;
            }

            /* renamed from: a */
            public final Set<C11142f> invoke() {
                Set<C11142f> l;
                l = C9922x.m14714l(C6496c.this.f13617a.keySet(), this.f13630l.mo25415t());
                return l;
            }
        }

        /* renamed from: di.h$c$c */
        /* loaded from: classes8.dex */
        static final class C0198c extends AbstractC9973s implements Function1<C11142f, Collection<? extends AbstractC11404z0>> {
            C0198c() {
                super(1);
            }

            /* renamed from: a */
            public final Collection<AbstractC11404z0> invoke(C11142f it) {
                C9971q.m14633g(it, "it");
                return C6496c.this.m25430m(it);
            }
        }

        /* renamed from: di.h$c$d */
        /* loaded from: classes8.dex */
        static final class C6499d extends AbstractC9973s implements Function1<C11142f, Collection<? extends AbstractC11388u0>> {
            C6499d() {
                super(1);
            }

            /* renamed from: a */
            public final Collection<AbstractC11388u0> invoke(C11142f it) {
                C9971q.m14633g(it, "it");
                return C6496c.this.m25429n(it);
            }
        }

        /* renamed from: di.h$c$e */
        /* loaded from: classes8.dex */
        static final class C6500e extends AbstractC9973s implements Function1<C11142f, AbstractC11316e1> {
            C6500e() {
                super(1);
            }

            /* renamed from: a */
            public final AbstractC11316e1 invoke(C11142f it) {
                C9971q.m14633g(it, "it");
                return C6496c.this.m25428o(it);
            }
        }

        /* renamed from: di.h$c$f */
        /* loaded from: classes8.dex */
        static final class C6501f extends AbstractC9973s implements Function0<Set<? extends C11142f>> {

            /* renamed from: l */
            final /* synthetic */ AbstractC6485h f13635l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6501f(AbstractC6485h hVar) {
                super(0);
                this.f13635l = hVar;
            }

            /* renamed from: a */
            public final Set<C11142f> invoke() {
                Set<C11142f> l;
                l = C9922x.m14714l(C6496c.this.f13618b.keySet(), this.f13635l.mo25414u());
                return l;
            }
        }

        public C6496c(AbstractC6485h hVar, List<C8568i> functionList, List<C8581n> propertyList, List<C8600r> typeAliasList) {
            Map<C11142f, byte[]> map;
            C9971q.m14633g(functionList, "functionList");
            C9971q.m14633g(propertyList, "propertyList");
            C9971q.m14633g(typeAliasList, "typeAliasList");
            this.f13625i = hVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                C11142f b = C3613x.m33979b(hVar.m25479p().m34015g(), ((C8568i) ((AbstractC11724q) obj)).m19115e0());
                Object obj2 = linkedHashMap.get(b);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(b, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.f13617a = m25427p(linkedHashMap);
            AbstractC6485h hVar2 = this.f13625i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : propertyList) {
                C11142f b2 = C3613x.m33979b(hVar2.m25479p().m34015g(), ((C8581n) ((AbstractC11724q) obj3)).m18952d0());
                Object obj4 = linkedHashMap2.get(b2);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(b2, obj4);
                }
                ((List) obj4).add(obj3);
            }
            this.f13618b = m25427p(linkedHashMap2);
            if (this.f13625i.m25479p().m34019c().m34043g().mo34025c()) {
                AbstractC6485h hVar3 = this.f13625i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj5 : typeAliasList) {
                    C11142f b3 = C3613x.m33979b(hVar3.m25479p().m34015g(), ((C8600r) ((AbstractC11724q) obj5)).m18704X());
                    Object obj6 = linkedHashMap3.get(b3);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap3.put(b3, obj6);
                    }
                    ((List) obj6).add(obj5);
                }
                map = m25427p(linkedHashMap3);
            } else {
                map = C11289v.m10251h();
            }
            this.f13619c = map;
            this.f13620d = this.f13625i.m25479p().m34014h().mo23892i(new C0198c());
            this.f13621e = this.f13625i.m25479p().m34014h().mo23892i(new C6499d());
            this.f13622f = this.f13625i.m25479p().m34014h().mo23894g(new C6500e());
            this.f13623g = this.f13625i.m25479p().m34014h().mo23898c(new C6498b(this.f13625i));
            this.f13624h = this.f13625i.m25479p().m34014h().mo23898c(new C6501f(this.f13625i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
            if (r0 != null) goto L_0x002e;
         */
        /* renamed from: m */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Collection<p268og.AbstractC11404z0> m25430m(p249nh.C11142f r7) {
            /*
                r6 = this;
                java.util.Map<nh.f, byte[]> r0 = r6.f13617a
                ph.s<ih.i> r1 = p159ih.C8568i.f38645G
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.C9971q.m14634f(r1, r2)
                di.h r2 = r6.f13625i
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L_0x002a
                di.h r3 = r6.f13625i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                di.h$c$a r0 = new di.h$c$a
                r0.<init>(r1, r4, r3)
                kotlin.sequences.Sequence r0 = p306qi.C12189j.m7467i(r0)
                java.util.List r0 = p306qi.C12189j.m7475E(r0)
                if (r0 == 0) goto L_0x002a
                goto L_0x002e
            L_0x002a:
                java.util.List r0 = kotlin.collections.C9904h.m14862i()
            L_0x002e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L_0x003b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0066
                java.lang.Object r3 = r0.next()
                ih.i r3 = (p159ih.C8568i) r3
                bi.m r4 = r2.m25479p()
                bi.w r4 = r4.m34016f()
                java.lang.String r5 = "it"
                kotlin.jvm.internal.C9971q.m14634f(r3, r5)
                og.z0 r3 = r4.m33990j(r3)
                boolean r4 = r2.mo25475x(r3)
                if (r4 == 0) goto L_0x005f
                goto L_0x0060
            L_0x005f:
                r3 = 0
            L_0x0060:
                if (r3 == 0) goto L_0x003b
                r1.add(r3)
                goto L_0x003b
            L_0x0066:
                r2.mo25483k(r7, r1)
                java.util.List r7 = p286pi.C11754a.m8687c(r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p070di.AbstractC6485h.C6496c.m25430m(nh.f):java.util.Collection");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
            if (r0 != null) goto L_0x002e;
         */
        /* renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Collection<p268og.AbstractC11388u0> m25429n(p249nh.C11142f r7) {
            /*
                r6 = this;
                java.util.Map<nh.f, byte[]> r0 = r6.f13618b
                ph.s<ih.n> r1 = p159ih.C8581n.f38654G
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.C9971q.m14634f(r1, r2)
                di.h r2 = r6.f13625i
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L_0x002a
                di.h r3 = r6.f13625i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                di.h$c$a r0 = new di.h$c$a
                r0.<init>(r1, r4, r3)
                kotlin.sequences.Sequence r0 = p306qi.C12189j.m7467i(r0)
                java.util.List r0 = p306qi.C12189j.m7475E(r0)
                if (r0 == 0) goto L_0x002a
                goto L_0x002e
            L_0x002a:
                java.util.List r0 = kotlin.collections.C9904h.m14862i()
            L_0x002e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L_0x003b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x005e
                java.lang.Object r3 = r0.next()
                ih.n r3 = (p159ih.C8581n) r3
                bi.m r4 = r2.m25479p()
                bi.w r4 = r4.m34016f()
                java.lang.String r5 = "it"
                kotlin.jvm.internal.C9971q.m14634f(r3, r5)
                og.u0 r3 = r4.m33988l(r3)
                if (r3 == 0) goto L_0x003b
                r1.add(r3)
                goto L_0x003b
            L_0x005e:
                r2.mo25482l(r7, r1)
                java.util.List r7 = p286pi.C11754a.m8687c(r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p070di.AbstractC6485h.C6496c.m25429n(nh.f):java.util.Collection");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public final AbstractC11316e1 m25428o(C11142f fVar) {
            C8600r o0;
            byte[] bArr = this.f13619c.get(fVar);
            if (bArr == null || (o0 = C8600r.m18687o0(new ByteArrayInputStream(bArr), this.f13625i.m25479p().m34019c().m34040j())) == null) {
                return null;
            }
            return this.f13625i.m25479p().m34016f().m33987m(o0);
        }

        /* renamed from: p */
        private final Map<C11142f, byte[]> m25427p(Map<C11142f, ? extends Collection<? extends AbstractC11686a>> map) {
            int d;
            int t;
            d = C11288u.m10255d(map.size());
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<AbstractC11686a> iterable = (Iterable) entry.getValue();
                t = C9907k.m14809t(iterable, 10);
                ArrayList arrayList = new ArrayList(t);
                for (AbstractC11686a aVar : iterable) {
                    aVar.m9033i(byteArrayOutputStream);
                    arrayList.add(Unit.f22042a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        @Override // p070di.AbstractC6485h.AbstractC6486a
        /* renamed from: a */
        public Collection<AbstractC11388u0> mo25442a(C11142f name, AbstractC13878b location) {
            List i;
            C9971q.m14633g(name, "name");
            C9971q.m14633g(location, "location");
            if (mo25440c().contains(name)) {
                return this.f13621e.invoke(name);
            }
            i = C9906j.m14820i();
            return i;
        }

        @Override // p070di.AbstractC6485h.AbstractC6486a
        /* renamed from: b */
        public Set<C11142f> mo25441b() {
            return (Set) C6943m.m23902a(this.f13623g, this, f13616j[0]);
        }

        @Override // p070di.AbstractC6485h.AbstractC6486a
        /* renamed from: c */
        public Set<C11142f> mo25440c() {
            return (Set) C6943m.m23902a(this.f13624h, this, f13616j[1]);
        }

        @Override // p070di.AbstractC6485h.AbstractC6486a
        /* renamed from: d */
        public Collection<AbstractC11404z0> mo25439d(C11142f name, AbstractC13878b location) {
            List i;
            C9971q.m14633g(name, "name");
            C9971q.m14633g(location, "location");
            if (mo25441b().contains(name)) {
                return this.f13620d.invoke(name);
            }
            i = C9906j.m14820i();
            return i;
        }

        @Override // p070di.AbstractC6485h.AbstractC6486a
        /* renamed from: e */
        public AbstractC11316e1 mo25438e(C11142f name) {
            C9971q.m14633g(name, "name");
            return this.f13622f.invoke(name);
        }

        @Override // p070di.AbstractC6485h.AbstractC6486a
        /* renamed from: f */
        public Set<C11142f> mo25437f() {
            return this.f13619c.keySet();
        }

        @Override // p070di.AbstractC6485h.AbstractC6486a
        /* renamed from: g */
        public void mo25436g(Collection<AbstractC11346m> result, C14403d kindFilter, Function1<? super C11142f, Boolean> nameFilter, AbstractC13878b location) {
            C9971q.m14633g(result, "result");
            C9971q.m14633g(kindFilter, "kindFilter");
            C9971q.m14633g(nameFilter, "nameFilter");
            C9971q.m14633g(location, "location");
            if (kindFilter.m683a(C14403d.f32585c.m661i())) {
                Set<C11142f> c = mo25440c();
                ArrayList arrayList = new ArrayList();
                for (C11142f fVar : c) {
                    if (nameFilter.invoke(fVar).booleanValue()) {
                        arrayList.addAll(mo25442a(fVar, location));
                    }
                }
                C12666h INSTANCE = C12666h.f28505k;
                C9971q.m14634f(INSTANCE, "INSTANCE");
                C9910n.m14805x(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.m683a(C14403d.f32585c.m666d())) {
                Set<C11142f> b = mo25441b();
                ArrayList arrayList2 = new ArrayList();
                for (C11142f fVar2 : b) {
                    if (nameFilter.invoke(fVar2).booleanValue()) {
                        arrayList2.addAll(mo25439d(fVar2, location));
                    }
                }
                C12666h INSTANCE2 = C12666h.f28505k;
                C9971q.m14634f(INSTANCE2, "INSTANCE");
                C9910n.m14805x(arrayList2, INSTANCE2);
                result.addAll(arrayList2);
            }
        }
    }

    /* renamed from: di.h$d */
    /* loaded from: classes8.dex */
    static final class C6502d extends AbstractC9973s implements Function0<Set<? extends C11142f>> {

        /* renamed from: k */
        final /* synthetic */ Function0<Collection<C11142f>> f13636k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6502d(Function0<? extends Collection<C11142f>> function0) {
            super(0);
            this.f13636k = function0;
        }

        /* renamed from: a */
        public final Set<C11142f> invoke() {
            Set<C11142f> H0;
            H0 = C9914r.m14786H0(this.f13636k.invoke());
            return H0;
        }
    }

    /* renamed from: di.h$e */
    /* loaded from: classes8.dex */
    static final class C6503e extends AbstractC9973s implements Function0<Set<? extends C11142f>> {
        C6503e() {
            super(0);
        }

        /* renamed from: a */
        public final Set<C11142f> invoke() {
            Set l;
            Set<C11142f> l2;
            Set<C11142f> s = AbstractC6485h.this.mo25416s();
            if (s == null) {
                return null;
            }
            l = C9922x.m14714l(AbstractC6485h.this.m25478q(), AbstractC6485h.this.f13586c.mo25437f());
            l2 = C9922x.m14714l(l, s);
            return l2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC6485h(C3588m c, List<C8568i> functionList, List<C8581n> propertyList, List<C8600r> typeAliasList, Function0<? extends Collection<C11142f>> classNames) {
        C9971q.m14633g(c, "c");
        C9971q.m14633g(functionList, "functionList");
        C9971q.m14633g(propertyList, "propertyList");
        C9971q.m14633g(typeAliasList, "typeAliasList");
        C9971q.m14633g(classNames, "classNames");
        this.f13585b = c;
        this.f13586c = m25481n(functionList, propertyList, typeAliasList);
        this.f13587d = c.m34014h().mo23898c(new C6502d(classNames));
        this.f13588e = c.m34014h().mo23896e(new C6503e());
    }

    /* renamed from: n */
    private final AbstractC6486a m25481n(List<C8568i> list, List<C8581n> list2, List<C8600r> list3) {
        if (this.f13585b.m34019c().m34043g().mo34027a()) {
            return new C6487b(this, list, list2, list3);
        }
        return new C6496c(this, list, list2, list3);
    }

    /* renamed from: o */
    private final AbstractC11313e m25480o(C11142f fVar) {
        return this.f13585b.m34019c().m34048b(mo25417m(fVar));
    }

    /* renamed from: r */
    private final Set<C11142f> m25477r() {
        return (Set) C6943m.m23901b(this.f13588e, this, f13584f[1]);
    }

    /* renamed from: v */
    private final AbstractC11316e1 m25476v(C11142f fVar) {
        return this.f13586c.mo25438e(fVar);
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: a */
    public Collection<AbstractC11388u0> mo627a(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        return this.f13586c.mo25442a(name, location);
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: b */
    public Set<C11142f> mo638b() {
        return this.f13586c.mo25441b();
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: c */
    public Set<C11142f> mo637c() {
        return this.f13586c.mo25440c();
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: d */
    public Collection<AbstractC11404z0> mo626d(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        return this.f13586c.mo25439d(name, location);
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14416k
    /* renamed from: e */
    public AbstractC11326h mo636e(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        if (mo25413w(name)) {
            return m25480o(name);
        }
        if (this.f13586c.mo25437f().contains(name)) {
            return m25476v(name);
        }
        return null;
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: g */
    public Set<C11142f> mo635g() {
        return m25477r();
    }

    /* renamed from: i */
    protected abstract void mo25418i(Collection<AbstractC11346m> collection, Function1<? super C11142f, Boolean> function1);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final Collection<AbstractC11346m> m25484j(C14403d kindFilter, Function1<? super C11142f, Boolean> nameFilter, AbstractC13878b location) {
        C9971q.m14633g(kindFilter, "kindFilter");
        C9971q.m14633g(nameFilter, "nameFilter");
        C9971q.m14633g(location, "location");
        ArrayList arrayList = new ArrayList(0);
        C14403d.C14404a aVar = C14403d.f32585c;
        if (kindFilter.m683a(aVar.m663g())) {
            mo25418i(arrayList, nameFilter);
        }
        this.f13586c.mo25436g(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.m683a(aVar.m667c())) {
            for (C11142f fVar : m25478q()) {
                if (nameFilter.invoke(fVar).booleanValue()) {
                    C11754a.m8689a(arrayList, m25480o(fVar));
                }
            }
        }
        if (kindFilter.m683a(C14403d.f32585c.m662h())) {
            for (C11142f fVar2 : this.f13586c.mo25437f()) {
                if (nameFilter.invoke(fVar2).booleanValue()) {
                    C11754a.m8689a(arrayList, this.f13586c.mo25438e(fVar2));
                }
            }
        }
        return C11754a.m8687c(arrayList);
    }

    /* renamed from: k */
    protected void mo25483k(C11142f name, List<AbstractC11404z0> functions) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(functions, "functions");
    }

    /* renamed from: l */
    protected void mo25482l(C11142f name, List<AbstractC11388u0> descriptors) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(descriptors, "descriptors");
    }

    /* renamed from: m */
    protected abstract C11136b mo25417m(C11142f fVar);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public final C3588m m25479p() {
        return this.f13585b;
    }

    /* renamed from: q */
    public final Set<C11142f> m25478q() {
        return (Set) C6943m.m23902a(this.f13587d, this, f13584f[0]);
    }

    /* renamed from: s */
    protected abstract Set<C11142f> mo25416s();

    /* renamed from: t */
    protected abstract Set<C11142f> mo25415t();

    /* renamed from: u */
    protected abstract Set<C11142f> mo25414u();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public boolean mo25413w(C11142f name) {
        C9971q.m14633g(name, "name");
        return m25478q().contains(name);
    }

    /* renamed from: x */
    protected boolean mo25475x(AbstractC11404z0 function) {
        C9971q.m14633g(function, "function");
        return true;
    }
}
