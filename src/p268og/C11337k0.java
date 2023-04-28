package p268og;

import eg.C6884j;
import fi.AbstractC7304o0;
import fi.C7291l;
import fi.EnumC7338w1;
import gi.AbstractC7664g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9920v;
import kotlin.collections.C9921w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.IntRange;
import p087ei.AbstractC6936g;
import p087ei.AbstractC6944n;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11142f;
import p267of.AbstractC11283p;
import p324rg.AbstractC12606g;
import p324rg.C12617k0;
import p324rg.C12623m;
import p388vh.C13508c;
import p448yh.AbstractC14411h;
import pg.AbstractC11672g;

/* renamed from: og.k0 */
/* loaded from: classes8.dex */
public final class C11337k0 {

    /* renamed from: a */
    private final AbstractC6944n f25263a;

    /* renamed from: b */
    private final AbstractC11327h0 f25264b;

    /* renamed from: c */
    private final AbstractC6936g<C11137c, AbstractC11344l0> f25265c;

    /* renamed from: d */
    private final AbstractC6936g<C11338a, AbstractC11313e> f25266d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: og.k0$a */
    /* loaded from: classes8.dex */
    public static final class C11338a {

        /* renamed from: a */
        private final C11136b f25267a;

        /* renamed from: b */
        private final List<Integer> f25268b;

        public C11338a(C11136b classId, List<Integer> typeParametersCount) {
            C9971q.m14633g(classId, "classId");
            C9971q.m14633g(typeParametersCount, "typeParametersCount");
            this.f25267a = classId;
            this.f25268b = typeParametersCount;
        }

        /* renamed from: a */
        public final C11136b m10196a() {
            return this.f25267a;
        }

        /* renamed from: b */
        public final List<Integer> m10195b() {
            return this.f25268b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11338a)) {
                return false;
            }
            C11338a aVar = (C11338a) obj;
            return C9971q.m14638b(this.f25267a, aVar.f25267a) && C9971q.m14638b(this.f25268b, aVar.f25268b);
        }

        public int hashCode() {
            return (this.f25267a.hashCode() * 31) + this.f25268b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f25267a + ", typeParametersCount=" + this.f25268b + ')';
        }
    }

    /* renamed from: og.k0$b */
    /* loaded from: classes8.dex */
    public static final class C11339b extends AbstractC12606g {

        /* renamed from: s */
        private final boolean f25269s;

        /* renamed from: t */
        private final List<AbstractC11319f1> f25270t;

        /* renamed from: u */
        private final C7291l f25271u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11339b(AbstractC6944n storageManager, AbstractC11346m container, C11142f name, boolean z, int i) {
            super(storageManager, container, name, AbstractC11299a1.f25230a, false);
            IntRange q;
            int t;
            Set c;
            C9971q.m14633g(storageManager, "storageManager");
            C9971q.m14633g(container, "container");
            C9971q.m14633g(name, "name");
            this.f25269s = z;
            q = C6884j.m23947q(0, i);
            t = C9907k.m14809t(q, 10);
            ArrayList arrayList = new ArrayList(t);
            Iterator<Integer> it = q.iterator();
            while (it.hasNext()) {
                int nextInt = ((AbstractC11283p) it).nextInt();
                AbstractC11672g b = AbstractC11672g.f26044g.m9048b();
                EnumC7338w1 w1Var = EnumC7338w1.INVARIANT;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('T');
                sb2.append(nextInt);
                arrayList.add(C12617k0.m6328R0(this, b, false, w1Var, C11142f.m10767f(sb2.toString()), nextInt, storageManager));
            }
            this.f25270t = arrayList;
            List<AbstractC11319f1> d = C11322g1.m10209d(this);
            c = C9920v.m14723c(C13508c.m3525p(this).mo6136n().m13387i());
            this.f25271u = new C7291l(this, d, c, storageManager);
        }

        @Override // p268og.AbstractC11313e
        /* renamed from: B */
        public AbstractC11309d mo6129B() {
            return null;
        }

        @Override // p268og.AbstractC11313e
        /* renamed from: I0 */
        public boolean mo6127I0() {
            return false;
        }

        /* renamed from: K0 */
        public AbstractC14411h.C14413b mo6113i0() {
            return AbstractC14411h.C14413b.f32626b;
        }

        /* renamed from: L0 */
        public C7291l mo6111k() {
            return this.f25271u;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: M0 */
        public AbstractC14411h.C14413b mo6117e0(AbstractC7664g kotlinTypeRefiner) {
            C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
            return AbstractC14411h.C14413b.f32626b;
        }

        @Override // p268og.AbstractC11313e
        /* renamed from: S */
        public AbstractC11329h1<AbstractC7304o0> mo6121S() {
            return null;
        }

        @Override // p268og.AbstractC11310d0
        /* renamed from: V */
        public boolean mo6120V() {
            return false;
        }

        @Override // p268og.AbstractC11313e
        /* renamed from: X */
        public boolean mo6119X() {
            return false;
        }

        @Override // p268og.AbstractC11313e
        /* renamed from: b0 */
        public boolean mo6118b0() {
            return false;
        }

        @Override // p268og.AbstractC11313e
        /* renamed from: g */
        public EnumC11317f mo6116g() {
            return EnumC11317f.CLASS;
        }

        @Override // p268og.AbstractC11313e
        /* renamed from: g0 */
        public boolean mo6115g0() {
            return false;
        }

        @Override // pg.AbstractC11664a
        public AbstractC11672g getAnnotations() {
            return AbstractC11672g.f26044g.m9048b();
        }

        @Override // p268og.AbstractC11313e, p268og.AbstractC11367q, p268og.AbstractC11310d0
        public AbstractC11387u getVisibility() {
            AbstractC11387u PUBLIC = C11373t.f25299e;
            C9971q.m14634f(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // p268og.AbstractC11310d0
        /* renamed from: h0 */
        public boolean mo6114h0() {
            return false;
        }

        @Override // p324rg.AbstractC12606g, p268og.AbstractC11310d0
        public boolean isExternal() {
            return false;
        }

        @Override // p268og.AbstractC11313e
        public boolean isInline() {
            return false;
        }

        @Override // p268og.AbstractC11313e
        /* renamed from: j0 */
        public AbstractC11313e mo6112j0() {
            return null;
        }

        @Override // p268og.AbstractC11313e
        /* renamed from: l */
        public Collection<AbstractC11309d> mo6110l() {
            Set d;
            d = C9921w.m14722d();
            return d;
        }

        @Override // p268og.AbstractC11313e, p268og.AbstractC11330i
        /* renamed from: r */
        public List<AbstractC11319f1> mo6109r() {
            return this.f25270t;
        }

        @Override // p268og.AbstractC11313e, p268og.AbstractC11310d0
        /* renamed from: s */
        public EnumC11314e0 mo6108s() {
            return EnumC11314e0.FINAL;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // p268og.AbstractC11313e
        /* renamed from: x */
        public Collection<AbstractC11313e> mo6107x() {
            List i;
            i = C9906j.m14820i();
            return i;
        }

        @Override // p268og.AbstractC11330i
        /* renamed from: y */
        public boolean mo6106y() {
            return this.f25269s;
        }
    }

    /* renamed from: og.k0$c */
    /* loaded from: classes8.dex */
    static final class C11340c extends AbstractC9973s implements Function1<C11338a, AbstractC11313e> {
        C11340c() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
            if (r1 != null) goto L_0x003c;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p268og.AbstractC11313e invoke(p268og.C11337k0.C11338a r9) {
            /*
                r8 = this;
                java.lang.String r0 = "<name for destructuring parameter 0>"
                kotlin.jvm.internal.C9971q.m14633g(r9, r0)
                nh.b r0 = r9.m10196a()
                java.util.List r9 = r9.m10195b()
                boolean r1 = r0.m10807k()
                if (r1 != 0) goto L_0x0066
                nh.b r1 = r0.m10811g()
                if (r1 == 0) goto L_0x0027
                og.k0 r2 = p268og.C11337k0.this
                r3 = 1
                java.util.List r3 = kotlin.collections.C9904h.m14883O(r9, r3)
                og.e r1 = r2.m10197d(r1, r3)
                if (r1 == 0) goto L_0x0027
                goto L_0x003c
            L_0x0027:
                og.k0 r1 = p268og.C11337k0.this
                ei.g r1 = p268og.C11337k0.m10199b(r1)
                nh.c r2 = r0.m10810h()
                java.lang.String r3 = "classId.packageFqName"
                kotlin.jvm.internal.C9971q.m14634f(r2, r3)
                java.lang.Object r1 = r1.invoke(r2)
                og.g r1 = (p268og.AbstractC11320g) r1
            L_0x003c:
                r4 = r1
                boolean r6 = r0.m10806l()
                og.k0$b r1 = new og.k0$b
                og.k0 r2 = p268og.C11337k0.this
                ei.n r3 = p268og.C11337k0.m10198c(r2)
                nh.f r5 = r0.m10808j()
                java.lang.String r0 = "classId.shortClassName"
                kotlin.jvm.internal.C9971q.m14634f(r5, r0)
                java.lang.Object r9 = kotlin.collections.C9904h.m14876W(r9)
                java.lang.Integer r9 = (java.lang.Integer) r9
                if (r9 == 0) goto L_0x005f
                int r9 = r9.intValue()
                goto L_0x0060
            L_0x005f:
                r9 = 0
            L_0x0060:
                r7 = r9
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r1
            L_0x0066:
                java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unresolved local class: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p268og.C11337k0.C11340c.invoke(og.k0$a):og.e");
        }
    }

    /* renamed from: og.k0$d */
    /* loaded from: classes8.dex */
    static final class C11341d extends AbstractC9973s implements Function1<C11137c, AbstractC11344l0> {
        C11341d() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC11344l0 invoke(C11137c fqName) {
            C9971q.m14633g(fqName, "fqName");
            return new C12623m(C11337k0.this.f25264b, fqName);
        }
    }

    public C11337k0(AbstractC6944n storageManager, AbstractC11327h0 module) {
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(module, "module");
        this.f25263a = storageManager;
        this.f25264b = module;
        this.f25265c = storageManager.mo23892i(new C11341d());
        this.f25266d = storageManager.mo23892i(new C11340c());
    }

    /* renamed from: d */
    public final AbstractC11313e m10197d(C11136b classId, List<Integer> typeParametersCount) {
        C9971q.m14633g(classId, "classId");
        C9971q.m14633g(typeParametersCount, "typeParametersCount");
        return this.f25266d.invoke(new C11338a(classId, typeParametersCount));
    }
}
