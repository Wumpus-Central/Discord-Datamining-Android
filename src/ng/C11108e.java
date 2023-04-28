package ng;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9905i;
import kotlin.collections.C9914r;
import kotlin.collections.C9920v;
import kotlin.collections.C9921w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p087ei.AbstractC6938i;
import p087ei.AbstractC6944n;
import p087ei.C6943m;
import p217lg.AbstractC10413b;
import p217lg.C10434k;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11138d;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11309d;
import p268og.AbstractC11313e;
import p268og.AbstractC11327h0;
import p268og.AbstractC11344l0;
import p268og.AbstractC11346m;
import p268og.EnumC11314e0;
import p268og.EnumC11317f;
import p304qg.AbstractC12126b;
import p324rg.C12608h;

/* renamed from: ng.e */
/* loaded from: classes8.dex */
public final class C11108e implements AbstractC12126b {

    /* renamed from: g */
    private static final C11142f f24650g;

    /* renamed from: h */
    private static final C11136b f24651h;

    /* renamed from: a */
    private final AbstractC11327h0 f24652a;

    /* renamed from: b */
    private final Function1<AbstractC11327h0, AbstractC11346m> f24653b;

    /* renamed from: c */
    private final AbstractC6938i f24654c;

    /* renamed from: e */
    static final /* synthetic */ KProperty<Object>[] f24648e = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C11108e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: d */
    public static final C11110b f24647d = new C11110b(null);

    /* renamed from: f */
    private static final C11137c f24649f = C10434k.f22894u;

    /* renamed from: ng.e$a */
    /* loaded from: classes8.dex */
    static final class C11109a extends AbstractC9973s implements Function1<AbstractC11327h0, AbstractC10413b> {

        /* renamed from: k */
        public static final C11109a f24655k = new C11109a();

        C11109a() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC10413b invoke(AbstractC11327h0 module) {
            Object U;
            C9971q.m14633g(module, "module");
            List<AbstractC11344l0> f0 = module.mo6135n0(C11108e.f24649f).mo6181f0();
            ArrayList arrayList = new ArrayList();
            for (Object obj : f0) {
                if (obj instanceof AbstractC10413b) {
                    arrayList.add(obj);
                }
            }
            U = C9914r.m14770U(arrayList);
            return (AbstractC10413b) U;
        }
    }

    /* renamed from: ng.e$b */
    /* loaded from: classes8.dex */
    public static final class C11110b {
        private C11110b() {
        }

        public /* synthetic */ C11110b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C11136b m10875a() {
            return C11108e.f24651h;
        }
    }

    /* renamed from: ng.e$c */
    /* loaded from: classes8.dex */
    static final class C11111c extends AbstractC9973s implements Function0<C12608h> {

        /* renamed from: l */
        final /* synthetic */ AbstractC6944n f24657l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11111c(AbstractC6944n nVar) {
            super(0);
            this.f24657l = nVar;
        }

        /* renamed from: a */
        public final C12608h invoke() {
            List d;
            Set<AbstractC11309d> d2;
            AbstractC11346m mVar = (AbstractC11346m) C11108e.this.f24653b.invoke(C11108e.this.f24652a);
            C11142f fVar = C11108e.f24650g;
            EnumC11314e0 e0Var = EnumC11314e0.ABSTRACT;
            EnumC11317f fVar2 = EnumC11317f.INTERFACE;
            d = C9905i.m14825d(C11108e.this.f24652a.mo6136n().m13387i());
            C12608h hVar = new C12608h(mVar, fVar, e0Var, fVar2, d, AbstractC11299a1.f25230a, false, this.f24657l);
            C11102a aVar = new C11102a(this.f24657l, hVar);
            d2 = C9921w.m14722d();
            hVar.m6359K0(aVar, d2, null);
            return hVar;
        }
    }

    static {
        C11138d dVar = C10434k.C10435a.f22906d;
        C11142f i = dVar.m10785i();
        C9971q.m14634f(i, "cloneable.shortName()");
        f24650g = i;
        C11136b m = C11136b.m10805m(dVar.m10782l());
        C9971q.m14634f(m, "topLevel(StandardNames.FqNames.cloneable.toSafe())");
        f24651h = m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11108e(AbstractC6944n storageManager, AbstractC11327h0 moduleDescriptor, Function1<? super AbstractC11327h0, ? extends AbstractC11346m> computeContainingDeclaration) {
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(moduleDescriptor, "moduleDescriptor");
        C9971q.m14633g(computeContainingDeclaration, "computeContainingDeclaration");
        this.f24652a = moduleDescriptor;
        this.f24653b = computeContainingDeclaration;
        this.f24654c = storageManager.mo23898c(new C11111c(storageManager));
    }

    /* renamed from: i */
    private final C12608h m10877i() {
        return (C12608h) C6943m.m23902a(this.f24654c, this, f24648e[0]);
    }

    @Override // p304qg.AbstractC12126b
    /* renamed from: a */
    public Collection<AbstractC11313e> mo7769a(C11137c packageFqName) {
        Set d;
        Set c;
        C9971q.m14633g(packageFqName, "packageFqName");
        if (C9971q.m14638b(packageFqName, f24649f)) {
            c = C9920v.m14723c(m10877i());
            return c;
        }
        d = C9921w.m14722d();
        return d;
    }

    @Override // p304qg.AbstractC12126b
    /* renamed from: b */
    public boolean mo7768b(C11137c packageFqName, C11142f name) {
        C9971q.m14633g(packageFqName, "packageFqName");
        C9971q.m14633g(name, "name");
        if (!C9971q.m14638b(name, f24650g) || !C9971q.m14638b(packageFqName, f24649f)) {
            return false;
        }
        return true;
    }

    @Override // p304qg.AbstractC12126b
    /* renamed from: c */
    public AbstractC11313e mo7767c(C11136b classId) {
        C9971q.m14633g(classId, "classId");
        if (C9971q.m14638b(classId, f24651h)) {
            return m10877i();
        }
        return null;
    }

    public /* synthetic */ C11108e(AbstractC6944n nVar, AbstractC11327h0 h0Var, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, h0Var, (i & 4) != 0 ? C11109a.f24655k : function1);
    }
}
