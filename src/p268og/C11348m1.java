package p268og;

import java.util.Map;
import kotlin.jvm.internal.C9971q;
import p267of.C11288u;

/* renamed from: og.m1 */
/* loaded from: classes8.dex */
public final class C11348m1 {

    /* renamed from: a */
    public static final C11348m1 f25274a = new C11348m1();

    /* renamed from: b */
    private static final Map<AbstractC11362n1, Integer> f25275b;

    /* renamed from: c */
    private static final C11356h f25276c;

    /* renamed from: og.m1$a */
    /* loaded from: classes8.dex */
    public static final class C11349a extends AbstractC11362n1 {

        /* renamed from: c */
        public static final C11349a f25277c = new C11349a();

        private C11349a() {
            super("inherited", false);
        }
    }

    /* renamed from: og.m1$b */
    /* loaded from: classes8.dex */
    public static final class C11350b extends AbstractC11362n1 {

        /* renamed from: c */
        public static final C11350b f25278c = new C11350b();

        private C11350b() {
            super("internal", false);
        }
    }

    /* renamed from: og.m1$c */
    /* loaded from: classes8.dex */
    public static final class C11351c extends AbstractC11362n1 {

        /* renamed from: c */
        public static final C11351c f25279c = new C11351c();

        private C11351c() {
            super("invisible_fake", false);
        }
    }

    /* renamed from: og.m1$d */
    /* loaded from: classes8.dex */
    public static final class C11352d extends AbstractC11362n1 {

        /* renamed from: c */
        public static final C11352d f25280c = new C11352d();

        private C11352d() {
            super("local", false);
        }
    }

    /* renamed from: og.m1$e */
    /* loaded from: classes8.dex */
    public static final class C11353e extends AbstractC11362n1 {

        /* renamed from: c */
        public static final C11353e f25281c = new C11353e();

        private C11353e() {
            super("private", false);
        }
    }

    /* renamed from: og.m1$f */
    /* loaded from: classes8.dex */
    public static final class C11354f extends AbstractC11362n1 {

        /* renamed from: c */
        public static final C11354f f25282c = new C11354f();

        private C11354f() {
            super("private_to_this", false);
        }

        @Override // p268og.AbstractC11362n1
        /* renamed from: b */
        public String mo5176b() {
            return "private/*private to this*/";
        }
    }

    /* renamed from: og.m1$g */
    /* loaded from: classes8.dex */
    public static final class C11355g extends AbstractC11362n1 {

        /* renamed from: c */
        public static final C11355g f25283c = new C11355g();

        private C11355g() {
            super("protected", true);
        }
    }

    /* renamed from: og.m1$h */
    /* loaded from: classes8.dex */
    public static final class C11356h extends AbstractC11362n1 {

        /* renamed from: c */
        public static final C11356h f25284c = new C11356h();

        private C11356h() {
            super("public", true);
        }
    }

    /* renamed from: og.m1$i */
    /* loaded from: classes8.dex */
    public static final class C11357i extends AbstractC11362n1 {

        /* renamed from: c */
        public static final C11357i f25285c = new C11357i();

        private C11357i() {
            super("unknown", false);
        }
    }

    static {
        Map c;
        Map<AbstractC11362n1, Integer> b;
        c = C11288u.m10256c();
        c.put(C11354f.f25282c, 0);
        c.put(C11353e.f25281c, 0);
        c.put(C11350b.f25278c, 1);
        c.put(C11355g.f25283c, 1);
        C11356h hVar = C11356h.f25284c;
        c.put(hVar, 2);
        b = C11288u.m10257b(c);
        f25275b = b;
        f25276c = hVar;
    }

    private C11348m1() {
    }

    /* renamed from: a */
    public final Integer m10189a(AbstractC11362n1 first, AbstractC11362n1 second) {
        C9971q.m14633g(first, "first");
        C9971q.m14633g(second, "second");
        if (first == second) {
            return 0;
        }
        Map<AbstractC11362n1, Integer> map = f25275b;
        Integer num = map.get(first);
        Integer num2 = map.get(second);
        if (num == null || num2 == null || C9971q.m14638b(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    /* renamed from: b */
    public final boolean m10188b(AbstractC11362n1 visibility) {
        C9971q.m14633g(visibility, "visibility");
        if (visibility == C11353e.f25281c || visibility == C11354f.f25282c) {
            return true;
        }
        return false;
    }
}
