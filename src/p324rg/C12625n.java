package p324rg;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7304o0;
import fi.C7291l;
import gi.AbstractC7664g;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p087ei.AbstractC6936g;
import p087ei.AbstractC6938i;
import p087ei.AbstractC6944n;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11309d;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11329h1;
import p268og.AbstractC11346m;
import p268og.AbstractC11387u;
import p268og.AbstractC11388u0;
import p268og.AbstractC11404z0;
import p268og.C11373t;
import p268og.EnumC11314e0;
import p268og.EnumC11317f;
import p325rh.AbstractC12667i;
import p325rh.C12669k;
import p406wg.AbstractC13878b;
import p406wg.EnumC13881d;
import p448yh.AbstractC14411h;
import p448yh.AbstractC14414i;
import p448yh.C14403d;
import pg.AbstractC11672g;

/* renamed from: rg.n */
/* loaded from: classes8.dex */
public class C12625n extends AbstractC12606g {

    /* renamed from: s */
    private final AbstractC7268g1 f28379s;

    /* renamed from: t */
    private final AbstractC14411h f28380t;

    /* renamed from: u */
    private final AbstractC6938i<Set<C11142f>> f28381u;

    /* renamed from: v */
    private final AbstractC11672g f28382v;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rg.n$a */
    /* loaded from: classes8.dex */
    public class C12626a extends AbstractC14414i {

        /* renamed from: b */
        private final AbstractC6936g<C11142f, Collection<? extends AbstractC11404z0>> f28383b;

        /* renamed from: c */
        private final AbstractC6936g<C11142f, Collection<? extends AbstractC11388u0>> f28384c;

        /* renamed from: d */
        private final AbstractC6938i<Collection<AbstractC11346m>> f28385d;

        /* renamed from: e */
        final /* synthetic */ C12625n f28386e;

        /* renamed from: rg.n$a$a */
        /* loaded from: classes8.dex */
        class C0404a implements Function1<C11142f, Collection<? extends AbstractC11404z0>> {

            /* renamed from: k */
            final /* synthetic */ C12625n f28387k;

            C0404a(C12625n nVar) {
                this.f28387k = nVar;
            }

            /* renamed from: a */
            public Collection<? extends AbstractC11404z0> invoke(C11142f fVar) {
                return C12626a.this.m6287m(fVar);
            }
        }

        /* renamed from: rg.n$a$b */
        /* loaded from: classes8.dex */
        class C12627b implements Function1<C11142f, Collection<? extends AbstractC11388u0>> {

            /* renamed from: k */
            final /* synthetic */ C12625n f28389k;

            C12627b(C12625n nVar) {
                this.f28389k = nVar;
            }

            /* renamed from: a */
            public Collection<? extends AbstractC11388u0> invoke(C11142f fVar) {
                return C12626a.this.m6286n(fVar);
            }
        }

        /* renamed from: rg.n$a$c */
        /* loaded from: classes8.dex */
        class C12628c implements Function0<Collection<AbstractC11346m>> {

            /* renamed from: k */
            final /* synthetic */ C12625n f28391k;

            C12628c(C12625n nVar) {
                this.f28391k = nVar;
            }

            /* renamed from: a */
            public Collection<AbstractC11346m> invoke() {
                return C12626a.this.m6288l();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: rg.n$a$d */
        /* loaded from: classes8.dex */
        public class C12629d extends AbstractC12667i {

            /* renamed from: a */
            final /* synthetic */ Set f28393a;

            C12629d(Set set) {
                this.f28393a = set;
            }

            /* renamed from: f */
            private static /* synthetic */ void m6280f(int i) {
                Object[] objArr = new Object[3];
                if (i == 1) {
                    objArr[0] = "fromSuper";
                } else if (i != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i == 1 || i == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // p325rh.AbstractC12668j
            /* renamed from: a */
            public void mo652a(AbstractC11301b bVar) {
                if (bVar == null) {
                    m6280f(0);
                }
                C12669k.m6007K(bVar, null);
                this.f28393a.add(bVar);
            }

            @Override // p325rh.AbstractC12667i
            /* renamed from: e */
            protected void mo651e(AbstractC11301b bVar, AbstractC11301b bVar2) {
                if (bVar == null) {
                    m6280f(1);
                }
                if (bVar2 == null) {
                    m6280f(2);
                }
            }
        }

        public C12626a(C12625n nVar, AbstractC6944n nVar2) {
            if (nVar2 == null) {
                m6292h(0);
            }
            this.f28386e = nVar;
            this.f28383b = nVar2.mo23892i(new C0404a(nVar));
            this.f28384c = nVar2.mo23892i(new C12627b(nVar));
            this.f28385d = nVar2.mo23898c(new C12628c(nVar));
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00b5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void m6292h(int r13) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p324rg.C12625n.C12626a.m6292h(int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public Collection<AbstractC11346m> m6288l() {
            HashSet hashSet = new HashSet();
            for (C11142f fVar : (Set) this.f28386e.f28381u.invoke()) {
                EnumC13881d dVar = EnumC13881d.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(mo626d(fVar, dVar));
                hashSet.addAll(mo627a(fVar, dVar));
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public Collection<? extends AbstractC11404z0> m6287m(C11142f fVar) {
            if (fVar == null) {
                m6292h(8);
            }
            return m6284p(fVar, m6285o().mo626d(fVar, EnumC13881d.FOR_NON_TRACKED_SCOPE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public Collection<? extends AbstractC11388u0> m6286n(C11142f fVar) {
            if (fVar == null) {
                m6292h(4);
            }
            return m6284p(fVar, m6285o().mo627a(fVar, EnumC13881d.FOR_NON_TRACKED_SCOPE));
        }

        /* renamed from: o */
        private AbstractC14411h m6285o() {
            AbstractC14411h o = this.f28386e.mo6111k().mo4568m().iterator().next().mo5161o();
            if (o == null) {
                m6292h(9);
            }
            return o;
        }

        /* renamed from: p */
        private <D extends AbstractC11301b> Collection<? extends D> m6284p(C11142f fVar, Collection<? extends D> collection) {
            if (fVar == null) {
                m6292h(10);
            }
            if (collection == null) {
                m6292h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C12669k.f28507f.m5984v(fVar, collection, Collections.emptySet(), this.f28386e, new C12629d(linkedHashSet));
            return linkedHashSet;
        }

        @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
        /* renamed from: a */
        public Collection<? extends AbstractC11388u0> mo627a(C11142f fVar, AbstractC13878b bVar) {
            if (fVar == null) {
                m6292h(1);
            }
            if (bVar == null) {
                m6292h(2);
            }
            Collection<? extends AbstractC11388u0> invoke = this.f28384c.invoke(fVar);
            if (invoke == null) {
                m6292h(3);
            }
            return invoke;
        }

        @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
        /* renamed from: b */
        public Set<C11142f> mo638b() {
            Set<C11142f> set = (Set) this.f28386e.f28381u.invoke();
            if (set == null) {
                m6292h(17);
            }
            return set;
        }

        @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
        /* renamed from: c */
        public Set<C11142f> mo637c() {
            Set<C11142f> set = (Set) this.f28386e.f28381u.invoke();
            if (set == null) {
                m6292h(19);
            }
            return set;
        }

        @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
        /* renamed from: d */
        public Collection<? extends AbstractC11404z0> mo626d(C11142f fVar, AbstractC13878b bVar) {
            if (fVar == null) {
                m6292h(5);
            }
            if (bVar == null) {
                m6292h(6);
            }
            Collection<? extends AbstractC11404z0> invoke = this.f28383b.invoke(fVar);
            if (invoke == null) {
                m6292h(7);
            }
            return invoke;
        }

        @Override // p448yh.AbstractC14414i, p448yh.AbstractC14416k
        /* renamed from: f */
        public Collection<AbstractC11346m> mo625f(C14403d dVar, Function1<? super C11142f, Boolean> function1) {
            if (dVar == null) {
                m6292h(13);
            }
            if (function1 == null) {
                m6292h(14);
            }
            Collection<AbstractC11346m> invoke = this.f28385d.invoke();
            if (invoke == null) {
                m6292h(15);
            }
            return invoke;
        }

        @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
        /* renamed from: g */
        public Set<C11142f> mo635g() {
            Set<C11142f> emptySet = Collections.emptySet();
            if (emptySet == null) {
                m6292h(18);
            }
            return emptySet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C12625n(AbstractC6944n nVar, AbstractC11313e eVar, AbstractC7267g0 g0Var, C11142f fVar, AbstractC6938i<Set<C11142f>> iVar, AbstractC11672g gVar, AbstractC11299a1 a1Var) {
        super(nVar, eVar, fVar, a1Var, false);
        if (nVar == null) {
            m6295D0(6);
        }
        if (eVar == null) {
            m6295D0(7);
        }
        if (g0Var == null) {
            m6295D0(8);
        }
        if (fVar == null) {
            m6295D0(9);
        }
        if (iVar == null) {
            m6295D0(10);
        }
        if (gVar == null) {
            m6295D0(11);
        }
        if (a1Var == null) {
            m6295D0(12);
        }
        this.f28382v = gVar;
        this.f28379s = new C7291l(this, Collections.emptyList(), Collections.singleton(g0Var), nVar);
        this.f28380t = new C12626a(this, nVar);
        this.f28381u = iVar;
    }

    /* renamed from: D0 */
    private static /* synthetic */ void m6295D0(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: L0 */
    public static C12625n m6293L0(AbstractC6944n nVar, AbstractC11313e eVar, C11142f fVar, AbstractC6938i<Set<C11142f>> iVar, AbstractC11672g gVar, AbstractC11299a1 a1Var) {
        if (nVar == null) {
            m6295D0(0);
        }
        if (eVar == null) {
            m6295D0(1);
        }
        if (fVar == null) {
            m6295D0(2);
        }
        if (iVar == null) {
            m6295D0(3);
        }
        if (gVar == null) {
            m6295D0(4);
        }
        if (a1Var == null) {
            m6295D0(5);
        }
        return new C12625n(nVar, eVar, eVar.mo6166p(), fVar, iVar, gVar, a1Var);
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

    @Override // p324rg.AbstractC12644t
    /* renamed from: e0 */
    public AbstractC14411h mo6117e0(AbstractC7664g gVar) {
        if (gVar == null) {
            m6295D0(13);
        }
        AbstractC14411h hVar = this.f28380t;
        if (hVar == null) {
            m6295D0(14);
        }
        return hVar;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: g */
    public EnumC11317f mo6116g() {
        EnumC11317f fVar = EnumC11317f.ENUM_ENTRY;
        if (fVar == null) {
            m6295D0(18);
        }
        return fVar;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: g0 */
    public boolean mo6115g0() {
        return false;
    }

    @Override // pg.AbstractC11664a
    public AbstractC11672g getAnnotations() {
        AbstractC11672g gVar = this.f28382v;
        if (gVar == null) {
            m6295D0(21);
        }
        return gVar;
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11367q, p268og.AbstractC11310d0
    public AbstractC11387u getVisibility() {
        AbstractC11387u uVar = C11373t.f25299e;
        if (uVar == null) {
            m6295D0(20);
        }
        return uVar;
    }

    @Override // p268og.AbstractC11310d0
    /* renamed from: h0 */
    public boolean mo6114h0() {
        return false;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: i0 */
    public AbstractC14411h mo6113i0() {
        AbstractC14411h.C14413b bVar = AbstractC14411h.C14413b.f32626b;
        if (bVar == null) {
            m6295D0(15);
        }
        return bVar;
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

    @Override // p268og.AbstractC11326h
    /* renamed from: k */
    public AbstractC7268g1 mo6111k() {
        AbstractC7268g1 g1Var = this.f28379s;
        if (g1Var == null) {
            m6295D0(17);
        }
        return g1Var;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: l */
    public Collection<AbstractC11309d> mo6110l() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            m6295D0(16);
        }
        return emptyList;
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11330i
    /* renamed from: r */
    public List<AbstractC11319f1> mo6109r() {
        List<AbstractC11319f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m6295D0(22);
        }
        return emptyList;
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11310d0
    /* renamed from: s */
    public EnumC11314e0 mo6108s() {
        EnumC11314e0 e0Var = EnumC11314e0.FINAL;
        if (e0Var == null) {
            m6295D0(19);
        }
        return e0Var;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: x */
    public Collection<AbstractC11313e> mo6107x() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            m6295D0(23);
        }
        return emptyList;
    }

    @Override // p268og.AbstractC11330i
    /* renamed from: y */
    public boolean mo6106y() {
        return false;
    }
}
