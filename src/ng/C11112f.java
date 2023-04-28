package ng;

import java.util.List;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KProperty;
import p087ei.AbstractC6938i;
import p087ei.AbstractC6944n;
import p087ei.C6943m;
import p217lg.AbstractC10420h;
import p268og.AbstractC11327h0;
import p304qg.AbstractC12125a;
import p304qg.AbstractC12126b;
import p304qg.AbstractC12127c;
import p324rg.C12649x;

/* renamed from: ng.f */
/* loaded from: classes8.dex */
public final class C11112f extends AbstractC10420h {

    /* renamed from: k */
    static final /* synthetic */ KProperty<Object>[] f24658k = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C11112f.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: h */
    private final EnumC11113a f24659h;

    /* renamed from: i */
    private Function0<C11114b> f24660i;

    /* renamed from: j */
    private final AbstractC6938i f24661j;

    /* renamed from: ng.f$a */
    /* loaded from: classes8.dex */
    public enum EnumC11113a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* renamed from: ng.f$b */
    /* loaded from: classes8.dex */
    public static final class C11114b {

        /* renamed from: a */
        private final AbstractC11327h0 f24666a;

        /* renamed from: b */
        private final boolean f24667b;

        public C11114b(AbstractC11327h0 ownerModuleDescriptor, boolean z) {
            C9971q.m14633g(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f24666a = ownerModuleDescriptor;
            this.f24667b = z;
        }

        /* renamed from: a */
        public final AbstractC11327h0 m10863a() {
            return this.f24666a;
        }

        /* renamed from: b */
        public final boolean m10862b() {
            return this.f24667b;
        }
    }

    /* renamed from: ng.f$c */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C11115c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24668a;

        static {
            int[] iArr = new int[EnumC11113a.values().length];
            try {
                iArr[EnumC11113a.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11113a.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11113a.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24668a = iArr;
        }
    }

    /* renamed from: ng.f$d */
    /* loaded from: classes8.dex */
    static final class C11116d extends AbstractC9973s implements Function0<C11121i> {

        /* renamed from: l */
        final /* synthetic */ AbstractC6944n f24670l;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ng.f$d$a */
        /* loaded from: classes8.dex */
        public static final class C11117a extends AbstractC9973s implements Function0<C11114b> {

            /* renamed from: k */
            final /* synthetic */ C11112f f24671k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11117a(C11112f fVar) {
                super(0);
                this.f24671k = fVar;
            }

            /* renamed from: a */
            public final C11114b invoke() {
                Function0 function0 = this.f24671k.f24660i;
                if (function0 != null) {
                    C11114b bVar = (C11114b) function0.invoke();
                    this.f24671k.f24660i = null;
                    return bVar;
                }
                throw new AssertionError("JvmBuiltins instance has not been initialized properly");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11116d(AbstractC6944n nVar) {
            super(0);
            this.f24670l = nVar;
        }

        /* renamed from: a */
        public final C11121i invoke() {
            C12649x builtInsModule = C11112f.this.m13369r();
            C9971q.m14634f(builtInsModule, "builtInsModule");
            return new C11121i(builtInsModule, this.f24670l, new C11117a(C11112f.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ng.f$e */
    /* loaded from: classes8.dex */
    public static final class C11118e extends AbstractC9973s implements Function0<C11114b> {

        /* renamed from: k */
        final /* synthetic */ AbstractC11327h0 f24672k;

        /* renamed from: l */
        final /* synthetic */ boolean f24673l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11118e(AbstractC11327h0 h0Var, boolean z) {
            super(0);
            this.f24672k = h0Var;
            this.f24673l = z;
        }

        /* renamed from: a */
        public final C11114b invoke() {
            return new C11114b(this.f24672k, this.f24673l);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11112f(AbstractC6944n storageManager, EnumC11113a kind) {
        super(storageManager);
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(kind, "kind");
        this.f24659h = kind;
        this.f24661j = storageManager.mo23898c(new C11116d(storageManager));
        int i = C11115c.f24668a[kind.ordinal()];
        if (i == 2) {
            m13392f(false);
        } else if (i == 3) {
            m13392f(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G0 */
    public List<AbstractC12126b> mo10865v() {
        List<AbstractC12126b> n0;
        Iterable<AbstractC12126b> v = super.mo10865v();
        C9971q.m14634f(v, "super.getClassDescriptorFactories()");
        AbstractC6944n storageManager = m13408U();
        C9971q.m14634f(storageManager, "storageManager");
        C12649x builtInsModule = m13369r();
        C9971q.m14634f(builtInsModule, "builtInsModule");
        n0 = C9914r.m14751n0(v, new C11108e(storageManager, builtInsModule, null, 4, null));
        return n0;
    }

    /* renamed from: H0 */
    public final C11121i m10870H0() {
        return (C11121i) C6943m.m23902a(this.f24661j, this, f24658k[0]);
    }

    /* renamed from: I0 */
    public final void m10869I0(AbstractC11327h0 moduleDescriptor, boolean z) {
        C9971q.m14633g(moduleDescriptor, "moduleDescriptor");
        m10868J0(new C11118e(moduleDescriptor, z));
    }

    /* renamed from: J0 */
    public final void m10868J0(Function0<C11114b> computation) {
        C9971q.m14633g(computation, "computation");
        this.f24660i = computation;
    }

    @Override // p217lg.AbstractC10420h
    /* renamed from: M */
    protected AbstractC12127c mo10867M() {
        return m10870H0();
    }

    @Override // p217lg.AbstractC10420h
    /* renamed from: g */
    protected AbstractC12125a mo10866g() {
        return m10870H0();
    }
}
