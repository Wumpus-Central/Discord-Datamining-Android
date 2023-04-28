package p427xg;

import fi.AbstractC7304o0;
import gi.C7684u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p217lg.AbstractC10420h;
import p249nh.C11142f;
import p268og.AbstractC11297a;
import p268og.AbstractC11301b;
import p268og.AbstractC11313e;
import p268og.AbstractC11346m;
import p268og.AbstractC11386t0;
import p268og.AbstractC11388u0;
import p268og.AbstractC11404z0;
import p325rh.C12661e;
import p388vh.C13508c;
import p467zg.AbstractC14648c;

/* renamed from: xg.h0 */
/* loaded from: classes8.dex */
public final class C14126h0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xg.h0$a */
    /* loaded from: classes8.dex */
    public static final class C14127a extends AbstractC9973s implements Function1<AbstractC11301b, Boolean> {

        /* renamed from: k */
        public static final C14127a f31914k = new C14127a();

        C14127a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC11301b it) {
            C9971q.m14633g(it, "it");
            return Boolean.valueOf(C14130i.f31917a.m1568b(C13508c.m3522s(it)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xg.h0$b */
    /* loaded from: classes8.dex */
    public static final class C14128b extends AbstractC9973s implements Function1<AbstractC11301b, Boolean> {

        /* renamed from: k */
        public static final C14128b f31915k = new C14128b();

        C14128b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC11301b it) {
            C9971q.m14633g(it, "it");
            return Boolean.valueOf(C14114e.f31894n.m1611j((AbstractC11404z0) it));
        }
    }

    /* renamed from: xg.h0$c */
    /* loaded from: classes8.dex */
    static final class C14129c extends AbstractC9973s implements Function1<AbstractC11301b, Boolean> {

        /* renamed from: k */
        public static final C14129c f31916k = new C14129c();

        C14129c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC11301b it) {
            boolean z;
            C9971q.m14633g(it, "it");
            if (!AbstractC10420h.m13391f0(it) || C14118f.m1601m(it) == null) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static final boolean m1580a(AbstractC11301b bVar) {
        C9971q.m14633g(bVar, "<this>");
        if (m1577d(bVar) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final String m1579b(AbstractC11301b callableMemberDescriptor) {
        AbstractC11301b s;
        C11142f i;
        C9971q.m14633g(callableMemberDescriptor, "callableMemberDescriptor");
        AbstractC11301b c = m1578c(callableMemberDescriptor);
        if (c == null || (s = C13508c.m3522s(c)) == null) {
            return null;
        }
        if (s instanceof AbstractC11388u0) {
            return C14130i.f31917a.m1569a(s);
        }
        if (!(s instanceof AbstractC11404z0) || (i = C14114e.f31894n.m1612i((AbstractC11404z0) s)) == null) {
            return null;
        }
        return i.m10771b();
    }

    /* renamed from: c */
    private static final AbstractC11301b m1578c(AbstractC11301b bVar) {
        if (AbstractC10420h.m13391f0(bVar)) {
            return m1577d(bVar);
        }
        return null;
    }

    /* renamed from: d */
    public static final <T extends AbstractC11301b> T m1577d(T t) {
        boolean z;
        C9971q.m14633g(t, "<this>");
        if (!C14132i0.f31919a.m1551g().contains(t.getName()) && !C14122g.f31903a.m1589d().contains(C13508c.m3522s(t).getName())) {
            return null;
        }
        if (t instanceof AbstractC11388u0) {
            z = true;
        } else {
            z = t instanceof AbstractC11386t0;
        }
        if (z) {
            return (T) C13508c.m3535f(t, false, C14127a.f31914k, 1, null);
        }
        if (t instanceof AbstractC11404z0) {
            return (T) C13508c.m3535f(t, false, C14128b.f31915k, 1, null);
        }
        return null;
    }

    /* renamed from: e */
    public static final <T extends AbstractC11301b> T m1576e(T t) {
        C9971q.m14633g(t, "<this>");
        T t2 = (T) m1577d(t);
        if (t2 != null) {
            return t2;
        }
        C14118f fVar = C14118f.f31900n;
        C11142f name = t.getName();
        C9971q.m14634f(name, "name");
        if (!fVar.m1602l(name)) {
            return null;
        }
        return (T) C13508c.m3535f(t, false, C14129c.f31916k, 1, null);
    }

    /* renamed from: f */
    public static final boolean m1575f(AbstractC11313e eVar, AbstractC11297a specialCallableDescriptor) {
        C9971q.m14633g(eVar, "<this>");
        C9971q.m14633g(specialCallableDescriptor, "specialCallableDescriptor");
        AbstractC11346m b = specialCallableDescriptor.mo6104b();
        C9971q.m14635e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        AbstractC7304o0 p = ((AbstractC11313e) b).mo6166p();
        C9971q.m14634f(p, "specialCallableDescripto…ssDescriptor).defaultType");
        AbstractC11313e s = C12661e.m6035s(eVar);
        while (true) {
            boolean z = false;
            if (s == null) {
                return false;
            }
            if (!(s instanceof AbstractC14648c)) {
                if (C7684u.m21659b(s.mo6166p(), p) != null) {
                    z = true;
                }
                if (z) {
                    return !AbstractC10420h.m13391f0(s);
                }
            }
            s = C12661e.m6035s(s);
        }
    }

    /* renamed from: g */
    public static final boolean m1574g(AbstractC11301b bVar) {
        C9971q.m14633g(bVar, "<this>");
        return C13508c.m3522s(bVar).mo6104b() instanceof AbstractC14648c;
    }

    /* renamed from: h */
    public static final boolean m1573h(AbstractC11301b bVar) {
        C9971q.m14633g(bVar, "<this>");
        if (m1574g(bVar) || AbstractC10420h.m13391f0(bVar)) {
            return true;
        }
        return false;
    }
}
