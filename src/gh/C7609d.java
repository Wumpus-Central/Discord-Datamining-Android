package gh;

import bi.C3573e;
import fi.AbstractC7267g0;
import gh.AbstractC7637r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kh.AbstractC9874c;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p087ei.AbstractC6944n;
import p159ih.C8541b;
import p249nh.C11136b;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11313e;
import p268og.AbstractC11327h0;
import p268og.AbstractC11335j1;
import p268og.C11337k0;
import p268og.C11393x;
import p286pi.C11754a;
import p326ri.C12719v;
import p447yg.C14378a;
import pg.AbstractC11666c;
import pg.C11668d;
import th.AbstractC13104g;
import th.AbstractC13110k;
import th.C13097a;
import th.C13101d;
import th.C13103f;
import th.C13105h;
import th.C13109j;
import th.C13114m;
import th.C13122q;
import th.C13126r;
import th.C13129u;
import th.C13131w;
import th.C13132x;
import th.C13133y;
import th.C13134z;

/* renamed from: gh.d */
/* loaded from: classes8.dex */
public final class C7609d extends AbstractC7593a<AbstractC11666c, AbstractC13104g<?>> {

    /* renamed from: c */
    private final AbstractC11327h0 f16585c;

    /* renamed from: d */
    private final C11337k0 f16586d;

    /* renamed from: e */
    private final C3573e f16587e;

    /* renamed from: gh.d$a */
    /* loaded from: classes8.dex */
    private abstract class AbstractC7610a implements AbstractC7637r.AbstractC7638a {

        /* renamed from: gh.d$a$a */
        /* loaded from: classes8.dex */
        public static final class C0238a implements AbstractC7637r.AbstractC7638a {

            /* renamed from: a */
            private final /* synthetic */ AbstractC7637r.AbstractC7638a f16589a;

            /* renamed from: b */
            final /* synthetic */ AbstractC7637r.AbstractC7638a f16590b;

            /* renamed from: c */
            final /* synthetic */ AbstractC7610a f16591c;

            /* renamed from: d */
            final /* synthetic */ C11142f f16592d;

            /* renamed from: e */
            final /* synthetic */ ArrayList<AbstractC11666c> f16593e;

            C0238a(AbstractC7637r.AbstractC7638a aVar, AbstractC7610a aVar2, C11142f fVar, ArrayList<AbstractC11666c> arrayList) {
                this.f16590b = aVar;
                this.f16591c = aVar2;
                this.f16592d = fVar;
                this.f16593e = arrayList;
                this.f16589a = aVar;
            }

            @Override // gh.AbstractC7637r.AbstractC7638a
            /* renamed from: a */
            public void mo20804a() {
                Object r0;
                this.f16590b.mo20804a();
                AbstractC7610a aVar = this.f16591c;
                C11142f fVar = this.f16592d;
                r0 = C9914r.m14747r0(this.f16593e);
                aVar.mo21888h(fVar, new C13097a((AbstractC11666c) r0));
            }

            @Override // gh.AbstractC7637r.AbstractC7638a
            /* renamed from: b */
            public AbstractC7637r.AbstractC7639b mo20803b(C11142f fVar) {
                return this.f16589a.mo20803b(fVar);
            }

            @Override // gh.AbstractC7637r.AbstractC7638a
            /* renamed from: c */
            public void mo20802c(C11142f fVar, C11136b enumClassId, C11142f enumEntryName) {
                C9971q.m14633g(enumClassId, "enumClassId");
                C9971q.m14633g(enumEntryName, "enumEntryName");
                this.f16589a.mo20802c(fVar, enumClassId, enumEntryName);
            }

            @Override // gh.AbstractC7637r.AbstractC7638a
            /* renamed from: d */
            public AbstractC7637r.AbstractC7638a mo20801d(C11142f fVar, C11136b classId) {
                C9971q.m14633g(classId, "classId");
                return this.f16589a.mo20801d(fVar, classId);
            }

            @Override // gh.AbstractC7637r.AbstractC7638a
            /* renamed from: e */
            public void mo20800e(C11142f fVar, C13103f value) {
                C9971q.m14633g(value, "value");
                this.f16589a.mo20800e(fVar, value);
            }

            @Override // gh.AbstractC7637r.AbstractC7638a
            /* renamed from: f */
            public void mo20799f(C11142f fVar, Object obj) {
                this.f16589a.mo20799f(fVar, obj);
            }
        }

        /* renamed from: gh.d$a$b */
        /* loaded from: classes8.dex */
        public static final class C7611b implements AbstractC7637r.AbstractC7639b {

            /* renamed from: a */
            private final ArrayList<AbstractC13104g<?>> f16594a = new ArrayList<>();

            /* renamed from: b */
            final /* synthetic */ C7609d f16595b;

            /* renamed from: c */
            final /* synthetic */ C11142f f16596c;

            /* renamed from: d */
            final /* synthetic */ AbstractC7610a f16597d;

            /* renamed from: gh.d$a$b$a */
            /* loaded from: classes8.dex */
            public static final class C0239a implements AbstractC7637r.AbstractC7638a {

                /* renamed from: a */
                private final /* synthetic */ AbstractC7637r.AbstractC7638a f16598a;

                /* renamed from: b */
                final /* synthetic */ AbstractC7637r.AbstractC7638a f16599b;

                /* renamed from: c */
                final /* synthetic */ C7611b f16600c;

                /* renamed from: d */
                final /* synthetic */ ArrayList<AbstractC11666c> f16601d;

                C0239a(AbstractC7637r.AbstractC7638a aVar, C7611b bVar, ArrayList<AbstractC11666c> arrayList) {
                    this.f16599b = aVar;
                    this.f16600c = bVar;
                    this.f16601d = arrayList;
                    this.f16598a = aVar;
                }

                @Override // gh.AbstractC7637r.AbstractC7638a
                /* renamed from: a */
                public void mo20804a() {
                    Object r0;
                    this.f16599b.mo20804a();
                    ArrayList arrayList = this.f16600c.f16594a;
                    r0 = C9914r.m14747r0(this.f16601d);
                    arrayList.add(new C13097a((AbstractC11666c) r0));
                }

                @Override // gh.AbstractC7637r.AbstractC7638a
                /* renamed from: b */
                public AbstractC7637r.AbstractC7639b mo20803b(C11142f fVar) {
                    return this.f16598a.mo20803b(fVar);
                }

                @Override // gh.AbstractC7637r.AbstractC7638a
                /* renamed from: c */
                public void mo20802c(C11142f fVar, C11136b enumClassId, C11142f enumEntryName) {
                    C9971q.m14633g(enumClassId, "enumClassId");
                    C9971q.m14633g(enumEntryName, "enumEntryName");
                    this.f16598a.mo20802c(fVar, enumClassId, enumEntryName);
                }

                @Override // gh.AbstractC7637r.AbstractC7638a
                /* renamed from: d */
                public AbstractC7637r.AbstractC7638a mo20801d(C11142f fVar, C11136b classId) {
                    C9971q.m14633g(classId, "classId");
                    return this.f16598a.mo20801d(fVar, classId);
                }

                @Override // gh.AbstractC7637r.AbstractC7638a
                /* renamed from: e */
                public void mo20800e(C11142f fVar, C13103f value) {
                    C9971q.m14633g(value, "value");
                    this.f16598a.mo20800e(fVar, value);
                }

                @Override // gh.AbstractC7637r.AbstractC7638a
                /* renamed from: f */
                public void mo20799f(C11142f fVar, Object obj) {
                    this.f16598a.mo20799f(fVar, obj);
                }
            }

            C7611b(C7609d dVar, C11142f fVar, AbstractC7610a aVar) {
                this.f16595b = dVar;
                this.f16596c = fVar;
                this.f16597d = aVar;
            }

            @Override // gh.AbstractC7637r.AbstractC7639b
            /* renamed from: a */
            public void mo20818a() {
                this.f16597d.mo21889g(this.f16596c, this.f16594a);
            }

            @Override // gh.AbstractC7637r.AbstractC7639b
            /* renamed from: b */
            public void mo20817b(C13103f value) {
                C9971q.m14633g(value, "value");
                this.f16594a.add(new C13122q(value));
            }

            @Override // gh.AbstractC7637r.AbstractC7639b
            /* renamed from: c */
            public AbstractC7637r.AbstractC7638a mo20816c(C11136b classId) {
                C9971q.m14633g(classId, "classId");
                ArrayList arrayList = new ArrayList();
                C7609d dVar = this.f16595b;
                AbstractC11299a1 NO_SOURCE = AbstractC11299a1.f25230a;
                C9971q.m14634f(NO_SOURCE, "NO_SOURCE");
                AbstractC7637r.AbstractC7638a v = dVar.mo21892v(classId, NO_SOURCE, arrayList);
                C9971q.m14636d(v);
                return new C0239a(v, this, arrayList);
            }

            @Override // gh.AbstractC7637r.AbstractC7639b
            /* renamed from: d */
            public void mo20815d(C11136b enumClassId, C11142f enumEntryName) {
                C9971q.m14633g(enumClassId, "enumClassId");
                C9971q.m14633g(enumEntryName, "enumEntryName");
                this.f16594a.add(new C13109j(enumClassId, enumEntryName));
            }

            @Override // gh.AbstractC7637r.AbstractC7639b
            /* renamed from: e */
            public void mo20814e(Object obj) {
                this.f16594a.add(this.f16595b.m21897I(this.f16596c, obj));
            }
        }

        public AbstractC7610a() {
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: b */
        public AbstractC7637r.AbstractC7639b mo20803b(C11142f fVar) {
            return new C7611b(C7609d.this, fVar, this);
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: c */
        public void mo20802c(C11142f fVar, C11136b enumClassId, C11142f enumEntryName) {
            C9971q.m14633g(enumClassId, "enumClassId");
            C9971q.m14633g(enumEntryName, "enumEntryName");
            mo21888h(fVar, new C13109j(enumClassId, enumEntryName));
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: d */
        public AbstractC7637r.AbstractC7638a mo20801d(C11142f fVar, C11136b classId) {
            C9971q.m14633g(classId, "classId");
            ArrayList arrayList = new ArrayList();
            C7609d dVar = C7609d.this;
            AbstractC11299a1 NO_SOURCE = AbstractC11299a1.f25230a;
            C9971q.m14634f(NO_SOURCE, "NO_SOURCE");
            AbstractC7637r.AbstractC7638a v = dVar.mo21892v(classId, NO_SOURCE, arrayList);
            C9971q.m14636d(v);
            return new C0238a(v, this, fVar, arrayList);
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: e */
        public void mo20800e(C11142f fVar, C13103f value) {
            C9971q.m14633g(value, "value");
            mo21888h(fVar, new C13122q(value));
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: f */
        public void mo20799f(C11142f fVar, Object obj) {
            mo21888h(fVar, C7609d.this.m21897I(fVar, obj));
        }

        /* renamed from: g */
        public abstract void mo21889g(C11142f fVar, ArrayList<AbstractC13104g<?>> arrayList);

        /* renamed from: h */
        public abstract void mo21888h(C11142f fVar, AbstractC13104g<?> gVar);
    }

    /* renamed from: gh.d$b */
    /* loaded from: classes8.dex */
    public static final class C7612b extends AbstractC7610a {

        /* renamed from: b */
        private final HashMap<C11142f, AbstractC13104g<?>> f16602b = new HashMap<>();

        /* renamed from: d */
        final /* synthetic */ AbstractC11313e f16604d;

        /* renamed from: e */
        final /* synthetic */ C11136b f16605e;

        /* renamed from: f */
        final /* synthetic */ List<AbstractC11666c> f16606f;

        /* renamed from: g */
        final /* synthetic */ AbstractC11299a1 f16607g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7612b(AbstractC11313e eVar, C11136b bVar, List<AbstractC11666c> list, AbstractC11299a1 a1Var) {
            super();
            this.f16604d = eVar;
            this.f16605e = bVar;
            this.f16606f = list;
            this.f16607g = a1Var;
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: a */
        public void mo20804a() {
            if (!C7609d.this.m21947C(this.f16605e, this.f16602b) && !C7609d.this.m21917u(this.f16605e)) {
                this.f16606f.add(new C11668d(this.f16604d.mo6166p(), this.f16602b, this.f16607g));
            }
        }

        @Override // gh.C7609d.AbstractC7610a
        /* renamed from: g */
        public void mo21889g(C11142f fVar, ArrayList<AbstractC13104g<?>> elements) {
            C9971q.m14633g(elements, "elements");
            if (fVar != null) {
                AbstractC11335j1 b = C14378a.m732b(fVar, this.f16604d);
                if (b != null) {
                    HashMap<C11142f, AbstractC13104g<?>> hashMap = this.f16602b;
                    C13105h hVar = C13105h.f29410a;
                    List<? extends AbstractC13104g<?>> c = C11754a.m8687c(elements);
                    AbstractC7267g0 type = b.getType();
                    C9971q.m14634f(type, "parameter.type");
                    hashMap.put(fVar, hVar.m4597a(c, type));
                } else if (C7609d.this.m21917u(this.f16605e) && C9971q.m14638b(fVar.m10771b(), "value")) {
                    ArrayList<C13097a> arrayList = new ArrayList();
                    for (Object obj : elements) {
                        if (obj instanceof C13097a) {
                            arrayList.add(obj);
                        }
                    }
                    List<AbstractC11666c> list = this.f16606f;
                    for (C13097a aVar : arrayList) {
                        list.add(aVar.mo4590b());
                    }
                }
            }
        }

        @Override // gh.C7609d.AbstractC7610a
        /* renamed from: h */
        public void mo21888h(C11142f fVar, AbstractC13104g<?> value) {
            C9971q.m14633g(value, "value");
            if (fVar != null) {
                this.f16602b.put(fVar, value);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7609d(AbstractC11327h0 module, C11337k0 notFoundClasses, AbstractC6944n storageManager, AbstractC7633p kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        C9971q.m14633g(module, "module");
        C9971q.m14633g(notFoundClasses, "notFoundClasses");
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(kotlinClassFinder, "kotlinClassFinder");
        this.f16585c = module;
        this.f16586d = notFoundClasses;
        this.f16587e = new C3573e(module, notFoundClasses);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final AbstractC13104g<?> m21897I(C11142f fVar, Object obj) {
        AbstractC13104g<?> c = C13105h.f29410a.m4595c(obj);
        if (c != null) {
            return c;
        }
        AbstractC13110k.C13111a aVar = AbstractC13110k.f29415b;
        return aVar.m4588a("Unsupported annotation argument: " + fVar);
    }

    /* renamed from: L */
    private final AbstractC11313e m21894L(C11136b bVar) {
        return C11393x.m10147c(this.f16585c, bVar, this.f16586d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J */
    public AbstractC13104g<?> mo21900E(String desc, Object initializer) {
        boolean M;
        C9971q.m14633g(desc, "desc");
        C9971q.m14633g(initializer, "initializer");
        boolean z = false;
        M = C12719v.m5709M("ZBCS", desc, false, 2, null);
        if (M) {
            int intValue = ((Integer) initializer).intValue();
            int hashCode = desc.hashCode();
            if (hashCode == 66) {
                if (desc.equals("B")) {
                    initializer = Byte.valueOf((byte) intValue);
                }
                throw new AssertionError(desc);
            } else if (hashCode == 67) {
                if (desc.equals("C")) {
                    initializer = Character.valueOf((char) intValue);
                }
                throw new AssertionError(desc);
            } else if (hashCode != 83) {
                if (hashCode == 90 && desc.equals("Z")) {
                    if (intValue != 0) {
                        z = true;
                    }
                    initializer = Boolean.valueOf(z);
                }
                throw new AssertionError(desc);
            } else {
                if (desc.equals("S")) {
                    initializer = Short.valueOf((short) intValue);
                }
                throw new AssertionError(desc);
            }
        }
        return C13105h.f29410a.m4595c(initializer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public AbstractC11666c mo21891y(C8541b proto, AbstractC9874c nameResolver) {
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(nameResolver, "nameResolver");
        return this.f16587e.m34072a(proto, nameResolver);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public AbstractC13104g<?> mo21899G(AbstractC13104g<?> constant) {
        AbstractC13104g<?> yVar;
        C9971q.m14633g(constant, "constant");
        if (constant instanceof C13101d) {
            yVar = new C13131w(((C13101d) constant).mo4590b().byteValue());
        } else if (constant instanceof C13129u) {
            yVar = new C13134z(((C13129u) constant).mo4590b().shortValue());
        } else if (constant instanceof C13114m) {
            yVar = new C13132x(((C13114m) constant).mo4590b().intValue());
        } else if (!(constant instanceof C13126r)) {
            return constant;
        } else {
            yVar = new C13133y(((C13126r) constant).mo4590b().longValue());
        }
        return yVar;
    }

    @Override // gh.AbstractC7600b
    /* renamed from: v */
    protected AbstractC7637r.AbstractC7638a mo21892v(C11136b annotationClassId, AbstractC11299a1 source, List<AbstractC11666c> result) {
        C9971q.m14633g(annotationClassId, "annotationClassId");
        C9971q.m14633g(source, "source");
        C9971q.m14633g(result, "result");
        return new C7612b(m21894L(annotationClassId), annotationClassId, result, source);
    }
}
