package p268og;

import fi.AbstractC7268g1;
import gi.AbstractC7664g;
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
import p388vh.C13508c;
import p448yh.AbstractC14411h;

/* renamed from: og.y0 */
/* loaded from: classes8.dex */
public final class C11399y0<T extends AbstractC14411h> {

    /* renamed from: a */
    private final AbstractC11313e f25317a;

    /* renamed from: b */
    private final Function1<AbstractC7664g, T> f25318b;

    /* renamed from: c */
    private final AbstractC7664g f25319c;

    /* renamed from: d */
    private final AbstractC6938i f25320d;

    /* renamed from: f */
    static final /* synthetic */ KProperty<Object>[] f25316f = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C11399y0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: e */
    public static final C11400a f25315e = new C11400a(null);

    /* renamed from: og.y0$a */
    /* loaded from: classes8.dex */
    public static final class C11400a {
        private C11400a() {
        }

        public /* synthetic */ C11400a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <T extends AbstractC14411h> C11399y0<T> m10139a(AbstractC11313e classDescriptor, AbstractC6944n storageManager, AbstractC7664g kotlinTypeRefinerForOwnerModule, Function1<? super AbstractC7664g, ? extends T> scopeFactory) {
            C9971q.m14633g(classDescriptor, "classDescriptor");
            C9971q.m14633g(storageManager, "storageManager");
            C9971q.m14633g(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            C9971q.m14633g(scopeFactory, "scopeFactory");
            return new C11399y0<>(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: og.y0$b */
    /* loaded from: classes8.dex */
    public static final class C11401b extends AbstractC9973s implements Function0<T> {

        /* renamed from: k */
        final /* synthetic */ C11399y0<T> f25321k;

        /* renamed from: l */
        final /* synthetic */ AbstractC7664g f25322l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11401b(C11399y0<T> y0Var, AbstractC7664g gVar) {
            super(0);
            this.f25321k = y0Var;
            this.f25322l = gVar;
        }

        /* renamed from: a */
        public final T invoke() {
            return (T) ((AbstractC14411h) ((C11399y0) this.f25321k).f25318b.invoke(this.f25322l));
        }
    }

    /* renamed from: og.y0$c */
    /* loaded from: classes8.dex */
    static final class C11402c extends AbstractC9973s implements Function0<T> {

        /* renamed from: k */
        final /* synthetic */ C11399y0<T> f25323k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11402c(C11399y0<T> y0Var) {
            super(0);
            this.f25323k = y0Var;
        }

        /* renamed from: a */
        public final T invoke() {
            return (T) ((AbstractC14411h) ((C11399y0) this.f25323k).f25318b.invoke(((C11399y0) this.f25323k).f25319c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C11399y0(AbstractC11313e eVar, AbstractC6944n nVar, Function1<? super AbstractC7664g, ? extends T> function1, AbstractC7664g gVar) {
        this.f25317a = eVar;
        this.f25318b = function1;
        this.f25319c = gVar;
        this.f25320d = nVar.mo23898c(new C11402c(this));
    }

    public /* synthetic */ C11399y0(AbstractC11313e eVar, AbstractC6944n nVar, Function1 function1, AbstractC7664g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, nVar, function1, gVar);
    }

    /* renamed from: d */
    private final T m10140d() {
        return (T) ((AbstractC14411h) C6943m.m23902a(this.f25320d, this, f25316f[0]));
    }

    /* renamed from: c */
    public final T m10141c(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!kotlinTypeRefiner.mo21698d(C13508c.m3525p(this.f25317a))) {
            return m10140d();
        }
        AbstractC7268g1 k = this.f25317a.mo6111k();
        C9971q.m14634f(k, "classDescriptor.typeConstructor");
        if (!kotlinTypeRefiner.mo21697e(k)) {
            return m10140d();
        }
        return (T) kotlinTypeRefiner.mo21699c(this.f25317a, new C11401b(this, kotlinTypeRefiner));
    }
}
