package th;

import fi.AbstractC7267g0;
import fi.AbstractC7290k1;
import fi.AbstractC7304o0;
import fi.C7232c1;
import fi.C7270h0;
import fi.C7278i0;
import fi.C7296m1;
import fi.EnumC7338w1;
import java.util.List;
import ki.C9883a;
import kotlin.collections.C9905i;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11088q;
import p142hi.C8039k;
import p142hi.EnumC8038j;
import p217lg.AbstractC10420h;
import p217lg.C10434k;
import p249nh.C11136b;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.AbstractC11327h0;
import p268og.C11393x;
import p388vh.C13508c;

/* renamed from: th.q */
/* loaded from: classes8.dex */
public final class C13122q extends AbstractC13104g<AbstractC13124b> {

    /* renamed from: b */
    public static final C13123a f29432b = new C13123a(null);

    /* renamed from: th.q$a */
    /* loaded from: classes8.dex */
    public static final class C13123a {
        private C13123a() {
        }

        public /* synthetic */ C13123a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC13104g<?> m4562a(AbstractC7267g0 argumentType) {
            Object r0;
            C9971q.m14633g(argumentType, "argumentType");
            if (C7278i0.m23035a(argumentType)) {
                return null;
            }
            AbstractC7267g0 g0Var = argumentType;
            int i = 0;
            while (AbstractC10420h.m13397c0(g0Var)) {
                r0 = C9914r.m14747r0(g0Var.mo5174L0());
                g0Var = ((AbstractC7290k1) r0).getType();
                C9971q.m14634f(g0Var, "type.arguments.single().type");
                i++;
            }
            AbstractC11326h p = g0Var.mo5172N0().mo4565p();
            if (p instanceof AbstractC11313e) {
                C11136b k = C13508c.m3530k(p);
                if (k == null) {
                    return new C13122q(new AbstractC13124b.C13125a(argumentType));
                }
                return new C13122q(k, i);
            } else if (!(p instanceof AbstractC11319f1)) {
                return null;
            } else {
                C11136b m = C11136b.m10805m(C10434k.C10435a.f22902b.m10782l());
                C9971q.m14634f(m, "topLevel(StandardNames.FqNames.any.toSafe())");
                return new C13122q(m, 0);
            }
        }
    }

    /* renamed from: th.q$b */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC13124b {

        /* renamed from: th.q$b$a */
        /* loaded from: classes8.dex */
        public static final class C13125a extends AbstractC13124b {

            /* renamed from: a */
            private final AbstractC7267g0 f29433a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13125a(AbstractC7267g0 type) {
                super(null);
                C9971q.m14633g(type, "type");
                this.f29433a = type;
            }

            /* renamed from: a */
            public final AbstractC7267g0 m4561a() {
                return this.f29433a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13125a) && C9971q.m14638b(this.f29433a, ((C13125a) obj).f29433a);
            }

            public int hashCode() {
                return this.f29433a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f29433a + ')';
            }
        }

        /* renamed from: th.q$b$b */
        /* loaded from: classes8.dex */
        public static final class C0421b extends AbstractC13124b {

            /* renamed from: a */
            private final C13103f f29434a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0421b(C13103f value) {
                super(null);
                C9971q.m14633g(value, "value");
                this.f29434a = value;
            }

            /* renamed from: a */
            public final int m4560a() {
                return this.f29434a.m4599c();
            }

            /* renamed from: b */
            public final C11136b m4559b() {
                return this.f29434a.m4598d();
            }

            /* renamed from: c */
            public final C13103f m4558c() {
                return this.f29434a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0421b) && C9971q.m14638b(this.f29434a, ((C0421b) obj).f29434a);
            }

            public int hashCode() {
                return this.f29434a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f29434a + ')';
            }
        }

        private AbstractC13124b() {
        }

        public /* synthetic */ AbstractC13124b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13122q(AbstractC13124b value) {
        super(value);
        C9971q.m14633g(value, "value");
    }

    @Override // th.AbstractC13104g
    /* renamed from: a */
    public AbstractC7267g0 mo4552a(AbstractC11327h0 module) {
        List d;
        C9971q.m14633g(module, "module");
        C7232c1 h = C7232c1.f15671l.m23149h();
        AbstractC11313e E = module.mo6136n().m13423E();
        C9971q.m14634f(E, "module.builtIns.kClass");
        d = C9905i.m14825d(new C7296m1(m4563c(module)));
        return C7270h0.m23053g(h, E, d);
    }

    /* renamed from: c */
    public final AbstractC7267g0 m4563c(AbstractC11327h0 module) {
        C9971q.m14633g(module, "module");
        AbstractC13124b b = mo4590b();
        if (b instanceof AbstractC13124b.C13125a) {
            return ((AbstractC13124b.C13125a) mo4590b()).m4561a();
        }
        if (b instanceof AbstractC13124b.C0421b) {
            C13103f c = ((AbstractC13124b.C0421b) mo4590b()).m4558c();
            C11136b a = c.m4601a();
            int b2 = c.m4600b();
            AbstractC11313e a2 = C11393x.m10149a(module, a);
            if (a2 == null) {
                EnumC8038j jVar = EnumC8038j.UNRESOLVED_KCLASS_CONSTANT_VALUE;
                String bVar = a.toString();
                C9971q.m14634f(bVar, "classId.toString()");
                return C8039k.m20774d(jVar, bVar, String.valueOf(b2));
            }
            AbstractC7304o0 p = a2.mo6166p();
            C9971q.m14634f(p, "descriptor.defaultType");
            AbstractC7267g0 w = C9883a.m15082w(p);
            for (int i = 0; i < b2; i++) {
                w = module.mo6136n().m13381l(EnumC7338w1.INVARIANT, w);
                C9971q.m14634f(w, "module.builtIns.getArray…Variance.INVARIANT, type)");
            }
            return w;
        }
        throw new C11088q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13122q(C13103f value) {
        this(new AbstractC13124b.C0421b(value));
        C9971q.m14633g(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13122q(C11136b classId, int i) {
        this(new C13103f(classId, i));
        C9971q.m14633g(classId, "classId");
    }
}
