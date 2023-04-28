package p427xg;

import gh.C7648w;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p249nh.C11142f;
import p268og.AbstractC11301b;
import p268og.AbstractC11397y;
import p388vh.C13508c;
import p427xg.C14132i0;

/* renamed from: xg.f */
/* loaded from: classes8.dex */
public final class C14118f extends C14132i0 {

    /* renamed from: n */
    public static final C14118f f31900n = new C14118f();

    /* renamed from: xg.f$a */
    /* loaded from: classes8.dex */
    static final class C14119a extends AbstractC9973s implements Function1<AbstractC11301b, Boolean> {

        /* renamed from: k */
        public static final C14119a f31901k = new C14119a();

        C14119a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC11301b it) {
            C9971q.m14633g(it, "it");
            return Boolean.valueOf(C14118f.f31900n.m1604j(it));
        }
    }

    /* renamed from: xg.f$b */
    /* loaded from: classes8.dex */
    static final class C14120b extends AbstractC9973s implements Function1<AbstractC11301b, Boolean> {

        /* renamed from: k */
        public static final C14120b f31902k = new C14120b();

        C14120b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC11301b it) {
            boolean z;
            C9971q.m14633g(it, "it");
            if (!(it instanceof AbstractC11397y) || !C14118f.f31900n.m1604j(it)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    private C14118f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final boolean m1604j(AbstractC11301b bVar) {
        boolean M;
        M = C9914r.m14778M(C14132i0.f31919a.m1553e(), C7648w.m21802d(bVar));
        return M;
    }

    /* renamed from: k */
    public static final AbstractC11397y m1603k(AbstractC11397y functionDescriptor) {
        C9971q.m14633g(functionDescriptor, "functionDescriptor");
        C14118f fVar = f31900n;
        C11142f name = functionDescriptor.getName();
        C9971q.m14634f(name, "functionDescriptor.name");
        if (!fVar.m1602l(name)) {
            return null;
        }
        return (AbstractC11397y) C13508c.m3535f(functionDescriptor, false, C14119a.f31901k, 1, null);
    }

    /* renamed from: m */
    public static final C14132i0.EnumC14134b m1601m(AbstractC11301b bVar) {
        AbstractC11301b f;
        String d;
        C9971q.m14633g(bVar, "<this>");
        C14132i0.C14133a aVar = C14132i0.f31919a;
        if (!aVar.m1554d().contains(bVar.getName()) || (f = C13508c.m3535f(bVar, false, C14120b.f31902k, 1, null)) == null || (d = C7648w.m21802d(f)) == null) {
            return null;
        }
        return aVar.m1546l(d);
    }

    /* renamed from: l */
    public final boolean m1602l(C11142f fVar) {
        C9971q.m14633g(fVar, "<this>");
        return C14132i0.f31919a.m1554d().contains(fVar);
    }
}
