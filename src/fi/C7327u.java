package fi;

import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pg.AbstractC11672g;

/* renamed from: fi.u */
/* loaded from: classes8.dex */
public final class C7327u extends AbstractC7299n1 {

    /* renamed from: e */
    public static final C7328a f15811e = new C7328a(null);

    /* renamed from: c */
    private final AbstractC7299n1 f15812c;

    /* renamed from: d */
    private final AbstractC7299n1 f15813d;

    /* renamed from: fi.u$a */
    /* loaded from: classes8.dex */
    public static final class C7328a {
        private C7328a() {
        }

        public /* synthetic */ C7328a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC7299n1 m22908a(AbstractC7299n1 first, AbstractC7299n1 second) {
            C9971q.m14633g(first, "first");
            C9971q.m14633g(second, "second");
            if (first.mo22911f()) {
                return second;
            }
            if (second.mo22911f()) {
                return first;
            }
            return new C7327u(first, second, null);
        }
    }

    private C7327u(AbstractC7299n1 n1Var, AbstractC7299n1 n1Var2) {
        this.f15812c = n1Var;
        this.f15813d = n1Var2;
    }

    public /* synthetic */ C7327u(AbstractC7299n1 n1Var, AbstractC7299n1 n1Var2, DefaultConstructorMarker defaultConstructorMarker) {
        this(n1Var, n1Var2);
    }

    /* renamed from: i */
    public static final AbstractC7299n1 m22909i(AbstractC7299n1 n1Var, AbstractC7299n1 n1Var2) {
        return f15811e.m22908a(n1Var, n1Var2);
    }

    @Override // fi.AbstractC7299n1
    /* renamed from: a */
    public boolean mo22913a() {
        return this.f15812c.mo22913a() || this.f15813d.mo22913a();
    }

    @Override // fi.AbstractC7299n1
    /* renamed from: b */
    public boolean mo5148b() {
        return this.f15812c.mo5148b() || this.f15813d.mo5148b();
    }

    @Override // fi.AbstractC7299n1
    /* renamed from: d */
    public AbstractC11672g mo22912d(AbstractC11672g annotations) {
        C9971q.m14633g(annotations, "annotations");
        return this.f15813d.mo22912d(this.f15812c.mo22912d(annotations));
    }

    @Override // fi.AbstractC7299n1
    /* renamed from: e */
    public AbstractC7290k1 mo5147e(AbstractC7267g0 key) {
        C9971q.m14633g(key, "key");
        AbstractC7290k1 e = this.f15812c.mo5147e(key);
        if (e == null) {
            return this.f15813d.mo5147e(key);
        }
        return e;
    }

    @Override // fi.AbstractC7299n1
    /* renamed from: f */
    public boolean mo22911f() {
        return false;
    }

    @Override // fi.AbstractC7299n1
    /* renamed from: g */
    public AbstractC7267g0 mo22910g(AbstractC7267g0 topLevelType, EnumC7338w1 position) {
        C9971q.m14633g(topLevelType, "topLevelType");
        C9971q.m14633g(position, "position");
        return this.f15813d.mo22910g(this.f15812c.mo22910g(topLevelType, position), position);
    }
}
