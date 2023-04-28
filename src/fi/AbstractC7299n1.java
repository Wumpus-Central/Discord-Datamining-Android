package fi;

import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pg.AbstractC11672g;

/* renamed from: fi.n1 */
/* loaded from: classes8.dex */
public abstract class AbstractC7299n1 {

    /* renamed from: a */
    public static final C7301b f15778a = new C7301b(null);

    /* renamed from: b */
    public static final AbstractC7299n1 f15779b = new C7300a();

    /* renamed from: fi.n1$a */
    /* loaded from: classes8.dex */
    public static final class C7300a extends AbstractC7299n1 {
        C7300a() {
        }

        @Override // fi.AbstractC7299n1
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC7290k1 mo5147e(AbstractC7267g0 g0Var) {
            return (AbstractC7290k1) m23001i(g0Var);
        }

        @Override // fi.AbstractC7299n1
        /* renamed from: f */
        public boolean mo22911f() {
            return true;
        }

        /* renamed from: i */
        public Void m23001i(AbstractC7267g0 key) {
            C9971q.m14633g(key, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* renamed from: fi.n1$b */
    /* loaded from: classes8.dex */
    public static final class C7301b {
        private C7301b() {
        }

        public /* synthetic */ C7301b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: fi.n1$c */
    /* loaded from: classes8.dex */
    public static final class C7302c extends AbstractC7299n1 {
        C7302c() {
        }

        @Override // fi.AbstractC7299n1
        /* renamed from: a */
        public boolean mo22913a() {
            return false;
        }

        @Override // fi.AbstractC7299n1
        /* renamed from: b */
        public boolean mo5148b() {
            return false;
        }

        @Override // fi.AbstractC7299n1
        /* renamed from: d */
        public AbstractC11672g mo22912d(AbstractC11672g annotations) {
            C9971q.m14633g(annotations, "annotations");
            return AbstractC7299n1.this.mo22912d(annotations);
        }

        @Override // fi.AbstractC7299n1
        /* renamed from: e */
        public AbstractC7290k1 mo5147e(AbstractC7267g0 key) {
            C9971q.m14633g(key, "key");
            return AbstractC7299n1.this.mo5147e(key);
        }

        @Override // fi.AbstractC7299n1
        /* renamed from: f */
        public boolean mo22911f() {
            return AbstractC7299n1.this.mo22911f();
        }

        @Override // fi.AbstractC7299n1
        /* renamed from: g */
        public AbstractC7267g0 mo22910g(AbstractC7267g0 topLevelType, EnumC7338w1 position) {
            C9971q.m14633g(topLevelType, "topLevelType");
            C9971q.m14633g(position, "position");
            return AbstractC7299n1.this.mo22910g(topLevelType, position);
        }
    }

    /* renamed from: a */
    public boolean mo22913a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo5148b() {
        return false;
    }

    /* renamed from: c */
    public final C7309p1 m23003c() {
        C7309p1 g = C7309p1.m22979g(this);
        C9971q.m14634f(g, "create(this)");
        return g;
    }

    /* renamed from: d */
    public AbstractC11672g mo22912d(AbstractC11672g annotations) {
        C9971q.m14633g(annotations, "annotations");
        return annotations;
    }

    /* renamed from: e */
    public abstract AbstractC7290k1 mo5147e(AbstractC7267g0 g0Var);

    /* renamed from: f */
    public boolean mo22911f() {
        return false;
    }

    /* renamed from: g */
    public AbstractC7267g0 mo22910g(AbstractC7267g0 topLevelType, EnumC7338w1 position) {
        C9971q.m14633g(topLevelType, "topLevelType");
        C9971q.m14633g(position, "position");
        return topLevelType;
    }

    /* renamed from: h */
    public final AbstractC7299n1 m23002h() {
        return new C7302c();
    }
}
