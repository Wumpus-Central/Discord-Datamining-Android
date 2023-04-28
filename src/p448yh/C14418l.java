package p448yh;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KProperty;
import p087ei.AbstractC6938i;
import p087ei.AbstractC6944n;
import p087ei.C6943m;
import p249nh.C11142f;
import p268og.AbstractC11301b;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p268og.AbstractC11388u0;
import p268og.AbstractC11404z0;
import p268og.EnumC11317f;
import p286pi.C11768e;
import p325rh.C12659d;
import p406wg.AbstractC13878b;

/* renamed from: yh.l */
/* loaded from: classes8.dex */
public final class C14418l extends AbstractC14414i {

    /* renamed from: e */
    static final /* synthetic */ KProperty<Object>[] f32627e = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C14418l.class), "functions", "getFunctions()Ljava/util/List;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C14418l.class), "properties", "getProperties()Ljava/util/List;"))};

    /* renamed from: b */
    private final AbstractC11313e f32628b;

    /* renamed from: c */
    private final AbstractC6938i f32629c;

    /* renamed from: d */
    private final AbstractC6938i f32630d;

    /* renamed from: yh.l$a */
    /* loaded from: classes8.dex */
    static final class C14419a extends AbstractC9973s implements Function0<List<? extends AbstractC11404z0>> {
        C14419a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC11404z0> invoke() {
            List<? extends AbstractC11404z0> l;
            l = C9906j.m14817l(C12659d.m6078g(C14418l.this.f32628b), C12659d.m6077h(C14418l.this.f32628b));
            return l;
        }
    }

    /* renamed from: yh.l$b */
    /* loaded from: classes8.dex */
    static final class C14420b extends AbstractC9973s implements Function0<List<? extends AbstractC11388u0>> {
        C14420b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC11388u0> invoke() {
            List<? extends AbstractC11388u0> m;
            m = C9906j.m14816m(C12659d.m6079f(C14418l.this.f32628b));
            return m;
        }
    }

    public C14418l(AbstractC6944n storageManager, AbstractC11313e containingClass) {
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(containingClass, "containingClass");
        this.f32628b = containingClass;
        containingClass.mo6116g();
        EnumC11317f fVar = EnumC11317f.CLASS;
        this.f32629c = storageManager.mo23898c(new C14419a());
        this.f32630d = storageManager.mo23898c(new C14420b());
    }

    /* renamed from: l */
    private final List<AbstractC11404z0> m640l() {
        return (List) C6943m.m23902a(this.f32629c, this, f32627e[0]);
    }

    /* renamed from: m */
    private final List<AbstractC11388u0> m639m() {
        return (List) C6943m.m23902a(this.f32630d, this, f32627e[1]);
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: a */
    public Collection<AbstractC11388u0> mo627a(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        List<AbstractC11388u0> m = m639m();
        C11768e eVar = new C11768e();
        for (Object obj : m) {
            if (C9971q.m14638b(((AbstractC11388u0) obj).getName(), name)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14416k
    /* renamed from: e */
    public /* bridge */ /* synthetic */ AbstractC11326h mo636e(C11142f fVar, AbstractC13878b bVar) {
        return (AbstractC11326h) m643i(fVar, bVar);
    }

    /* renamed from: i */
    public Void m643i(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        return null;
    }

    /* renamed from: j */
    public List<AbstractC11301b> mo625f(C14403d kindFilter, Function1<? super C11142f, Boolean> nameFilter) {
        List<AbstractC11301b> o0;
        C9971q.m14633g(kindFilter, "kindFilter");
        C9971q.m14633g(nameFilter, "nameFilter");
        o0 = C9914r.m14750o0(m640l(), m639m());
        return o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public C11768e<AbstractC11404z0> mo626d(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        List<AbstractC11404z0> l = m640l();
        C11768e<AbstractC11404z0> eVar = new C11768e<>();
        for (Object obj : l) {
            if (C9971q.m14638b(((AbstractC11404z0) obj).getName(), name)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }
}
