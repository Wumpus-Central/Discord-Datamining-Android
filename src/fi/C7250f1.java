package fi;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p182ji.AbstractC9613d;
import p182ji.AbstractC9618i;
import p182ji.AbstractC9620k;
import p182ji.AbstractC9625p;
import p286pi.C11773f;

/* renamed from: fi.f1 */
/* loaded from: classes8.dex */
public class C7250f1 {

    /* renamed from: a */
    private final boolean f15700a;

    /* renamed from: b */
    private final boolean f15701b;

    /* renamed from: c */
    private final boolean f15702c;

    /* renamed from: d */
    private final AbstractC9625p f15703d;

    /* renamed from: e */
    private final AbstractC7269h f15704e;

    /* renamed from: f */
    private final AbstractC7277i f15705f;

    /* renamed from: g */
    private int f15706g;

    /* renamed from: h */
    private boolean f15707h;

    /* renamed from: i */
    private ArrayDeque<AbstractC9620k> f15708i;

    /* renamed from: j */
    private Set<AbstractC9620k> f15709j;

    /* renamed from: fi.f1$a */
    /* loaded from: classes8.dex */
    public interface AbstractC7251a {

        /* renamed from: fi.f1$a$a */
        /* loaded from: classes8.dex */
        public static final class C0223a implements AbstractC7251a {

            /* renamed from: a */
            private boolean f15710a;

            @Override // fi.C7250f1.AbstractC7251a
            /* renamed from: a */
            public void mo23083a(Function0<Boolean> block) {
                C9971q.m14633g(block, "block");
                if (!this.f15710a) {
                    this.f15710a = block.invoke().booleanValue();
                }
            }

            /* renamed from: b */
            public final boolean m23082b() {
                return this.f15710a;
            }
        }

        /* renamed from: a */
        void mo23083a(Function0<Boolean> function0);
    }

    /* renamed from: fi.f1$b */
    /* loaded from: classes8.dex */
    public enum EnumC7252b {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* renamed from: fi.f1$c */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC7253c {

        /* renamed from: fi.f1$c$a */
        /* loaded from: classes8.dex */
        public static abstract class AbstractC7254a extends AbstractC7253c {
            public AbstractC7254a() {
                super(null);
            }
        }

        /* renamed from: fi.f1$c$b */
        /* loaded from: classes8.dex */
        public static final class C7255b extends AbstractC7253c {

            /* renamed from: a */
            public static final C7255b f15715a = new C7255b();

            private C7255b() {
                super(null);
            }

            @Override // fi.C7250f1.AbstractC7253c
            /* renamed from: a */
            public AbstractC9620k mo21709a(C7250f1 state, AbstractC9618i type) {
                C9971q.m14633g(state, "state");
                C9971q.m14633g(type, "type");
                return state.m23091j().mo5907m(type);
            }
        }

        /* renamed from: fi.f1$c$c */
        /* loaded from: classes8.dex */
        public static final class C0224c extends AbstractC7253c {

            /* renamed from: a */
            public static final C0224c f15716a = new C0224c();

            private C0224c() {
                super(null);
            }

            @Override // fi.C7250f1.AbstractC7253c
            /* renamed from: a */
            public /* bridge */ /* synthetic */ AbstractC9620k mo21709a(C7250f1 f1Var, AbstractC9618i iVar) {
                return (AbstractC9620k) m23080b(f1Var, iVar);
            }

            /* renamed from: b */
            public Void m23080b(C7250f1 state, AbstractC9618i type) {
                C9971q.m14633g(state, "state");
                C9971q.m14633g(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* renamed from: fi.f1$c$d */
        /* loaded from: classes8.dex */
        public static final class C7256d extends AbstractC7253c {

            /* renamed from: a */
            public static final C7256d f15717a = new C7256d();

            private C7256d() {
                super(null);
            }

            @Override // fi.C7250f1.AbstractC7253c
            /* renamed from: a */
            public AbstractC9620k mo21709a(C7250f1 state, AbstractC9618i type) {
                C9971q.m14633g(state, "state");
                C9971q.m14633g(type, "type");
                return state.m23091j().mo5891u(type);
            }
        }

        private AbstractC7253c() {
        }

        public /* synthetic */ AbstractC7253c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public abstract AbstractC9620k mo21709a(C7250f1 f1Var, AbstractC9618i iVar);
    }

    public C7250f1(boolean z, boolean z2, boolean z3, AbstractC9625p typeSystemContext, AbstractC7269h kotlinTypePreparator, AbstractC7277i kotlinTypeRefiner) {
        C9971q.m14633g(typeSystemContext, "typeSystemContext");
        C9971q.m14633g(kotlinTypePreparator, "kotlinTypePreparator");
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f15700a = z;
        this.f15701b = z2;
        this.f15702c = z3;
        this.f15703d = typeSystemContext;
        this.f15704e = kotlinTypePreparator;
        this.f15705f = kotlinTypeRefiner;
    }

    /* renamed from: d */
    public static /* synthetic */ Boolean m23096d(C7250f1 f1Var, AbstractC9618i iVar, AbstractC9618i iVar2, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = false;
            }
            return f1Var.m23097c(iVar, iVar2, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
    }

    /* renamed from: c */
    public Boolean m23097c(AbstractC9618i subType, AbstractC9618i superType, boolean z) {
        C9971q.m14633g(subType, "subType");
        C9971q.m14633g(superType, "superType");
        return null;
    }

    /* renamed from: e */
    public final void m23095e() {
        ArrayDeque<AbstractC9620k> arrayDeque = this.f15708i;
        C9971q.m14636d(arrayDeque);
        arrayDeque.clear();
        Set<AbstractC9620k> set = this.f15709j;
        C9971q.m14636d(set);
        set.clear();
        this.f15707h = false;
    }

    /* renamed from: f */
    public boolean mo5879f(AbstractC9618i subType, AbstractC9618i superType) {
        C9971q.m14633g(subType, "subType");
        C9971q.m14633g(superType, "superType");
        return true;
    }

    /* renamed from: g */
    public EnumC7252b m23094g(AbstractC9620k subType, AbstractC9613d superType) {
        C9971q.m14633g(subType, "subType");
        C9971q.m14633g(superType, "superType");
        return EnumC7252b.CHECK_SUBTYPE_AND_LOWER;
    }

    /* renamed from: h */
    public final ArrayDeque<AbstractC9620k> m23093h() {
        return this.f15708i;
    }

    /* renamed from: i */
    public final Set<AbstractC9620k> m23092i() {
        return this.f15709j;
    }

    /* renamed from: j */
    public final AbstractC9625p m23091j() {
        return this.f15703d;
    }

    /* renamed from: k */
    public final void m23090k() {
        this.f15707h = true;
        if (this.f15708i == null) {
            this.f15708i = new ArrayDeque<>(4);
        }
        if (this.f15709j == null) {
            this.f15709j = C11773f.f26275m.m8654a();
        }
    }

    /* renamed from: l */
    public final boolean m23089l(AbstractC9618i type) {
        C9971q.m14633g(type, "type");
        if (!this.f15702c || !this.f15703d.mo5883y(type)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean m23088m() {
        return this.f15700a;
    }

    /* renamed from: n */
    public final boolean m23087n() {
        return this.f15701b;
    }

    /* renamed from: o */
    public final AbstractC9618i m23086o(AbstractC9618i type) {
        C9971q.m14633g(type, "type");
        return this.f15704e.mo21705a(type);
    }

    /* renamed from: p */
    public final AbstractC9618i m23085p(AbstractC9618i type) {
        C9971q.m14633g(type, "type");
        return this.f15705f.mo21701a(type);
    }

    /* renamed from: q */
    public boolean m23084q(Function1<? super AbstractC7251a, Unit> block) {
        C9971q.m14633g(block, "block");
        AbstractC7251a.C0223a aVar = new AbstractC7251a.C0223a();
        block.invoke(aVar);
        return aVar.m23082b();
    }
}
