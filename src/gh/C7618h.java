package gh;

import bi.C3577g;
import bi.C3585k;
import bi.C3600t;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C9906j;
import kotlin.collections.C9920v;
import kotlin.collections.C9921w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.C10612e;
import mh.C10614f;
import mh.C10619i;
import p070di.C6504i;
import p070di.EnumC6482e;
import p141hh.C8019a;
import p159ih.C8544c;
import p159ih.C8575l;
import p249nh.C11142f;
import p268og.AbstractC11313e;
import p268og.AbstractC11344l0;
import p448yh.AbstractC14411h;
import ph.C11713k;

/* renamed from: gh.h */
/* loaded from: classes8.dex */
public final class C7618h {

    /* renamed from: c */
    private static final Set<C8019a.EnumC0249a> f16613c;

    /* renamed from: d */
    private static final Set<C8019a.EnumC0249a> f16614d;

    /* renamed from: a */
    public C3585k f16618a;

    /* renamed from: b */
    public static final C7619a f16612b = new C7619a(null);

    /* renamed from: e */
    private static final C10612e f16615e = new C10612e(1, 1, 2);

    /* renamed from: f */
    private static final C10612e f16616f = new C10612e(1, 1, 11);

    /* renamed from: g */
    private static final C10612e f16617g = new C10612e(1, 1, 13);

    /* renamed from: gh.h$a */
    /* loaded from: classes8.dex */
    public static final class C7619a {
        private C7619a() {
        }

        public /* synthetic */ C7619a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C10612e m21862a() {
            return C7618h.f16617g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gh.h$b */
    /* loaded from: classes8.dex */
    public static final class C7620b extends AbstractC9973s implements Function0<Collection<? extends C11142f>> {

        /* renamed from: k */
        public static final C7620b f16619k = new C7620b();

        C7620b() {
            super(0);
        }

        /* renamed from: a */
        public final Collection<C11142f> invoke() {
            List i;
            i = C9906j.m14820i();
            return i;
        }
    }

    static {
        Set<C8019a.EnumC0249a> c;
        Set<C8019a.EnumC0249a> i;
        c = C9920v.m14723c(C8019a.EnumC0249a.CLASS);
        f16613c = c;
        i = C9921w.m14717i(C8019a.EnumC0249a.FILE_FACADE, C8019a.EnumC0249a.MULTIFILE_CLASS_PART);
        f16614d = i;
    }

    /* renamed from: c */
    private final EnumC6482e m21873c(AbstractC7637r rVar) {
        if (m21872d().m34043g().mo34024d()) {
            return EnumC6482e.STABLE;
        }
        if (rVar.mo4630d().m20835j()) {
            return EnumC6482e.FIR_UNSTABLE;
        }
        if (rVar.mo4630d().m20834k()) {
            return EnumC6482e.IR_UNSTABLE;
        }
        return EnumC6482e.STABLE;
    }

    /* renamed from: e */
    private final C3600t<C10612e> m21871e(AbstractC7637r rVar) {
        if (m21870f() || rVar.mo4630d().m20841d().m12732h()) {
            return null;
        }
        return new C3600t<>(rVar.mo4630d().m20841d(), C10612e.f23499i, rVar.mo4633a(), rVar.mo4628k());
    }

    /* renamed from: f */
    private final boolean m21870f() {
        return m21872d().m34043g().mo34023e();
    }

    /* renamed from: g */
    private final boolean m21869g(AbstractC7637r rVar) {
        if (m21872d().m34043g().mo34026b() || !rVar.mo4630d().m20836i() || !C9971q.m14638b(rVar.mo4630d().m20841d(), f16616f)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private final boolean m21868h(AbstractC7637r rVar) {
        if ((!m21872d().m34043g().mo34022f() || (!rVar.mo4630d().m20836i() && !C9971q.m14638b(rVar.mo4630d().m20841d(), f16615e))) && !m21869g(rVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private final String[] m21866j(AbstractC7637r rVar, Set<? extends C8019a.EnumC0249a> set) {
        C8019a d = rVar.mo4630d();
        String[] a = d.m20844a();
        if (a == null) {
            a = d.m20843b();
        }
        if (a == null || !set.contains(d.m20842c())) {
            return null;
        }
        return a;
    }

    /* renamed from: b */
    public final AbstractC14411h m21874b(AbstractC11344l0 descriptor, AbstractC7637r kotlinClass) {
        Pair<C10614f, C8575l> pair;
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(kotlinClass, "kotlinClass");
        String[] j = m21866j(kotlinClass, f16614d);
        if (j == null) {
            return null;
        }
        String[] g = kotlinClass.mo4630d().m20838g();
        try {
        } catch (Throwable th2) {
            if (m21870f() || kotlinClass.mo4630d().m20841d().m12732h()) {
                throw th2;
            }
            pair = null;
        }
        if (g == null) {
            return null;
        }
        try {
            pair = C10619i.m12716m(j, g);
            if (pair == null) {
                return null;
            }
            C10614f a = pair.m15067a();
            C8575l b = pair.m15066b();
            C7624l lVar = new C7624l(kotlinClass, b, a, m21871e(kotlinClass), m21868h(kotlinClass), m21873c(kotlinClass));
            return new C6504i(descriptor, b, a, kotlinClass.mo4630d().m20841d(), lVar, m21872d(), "scope for " + lVar + " in " + descriptor, C7620b.f16619k);
        } catch (C11713k e) {
            throw new IllegalStateException("Could not read data from " + kotlinClass.mo4633a(), e);
        }
    }

    /* renamed from: d */
    public final C3585k m21872d() {
        C3585k kVar = this.f16618a;
        if (kVar != null) {
            return kVar;
        }
        C9971q.m14615y("components");
        return null;
    }

    /* renamed from: i */
    public final C3577g m21867i(AbstractC7637r kotlinClass) {
        String[] g;
        Pair<C10614f, C8544c> pair;
        C9971q.m14633g(kotlinClass, "kotlinClass");
        String[] j = m21866j(kotlinClass, f16613c);
        if (j == null || (g = kotlinClass.mo4630d().m20838g()) == null) {
            return null;
        }
        try {
            try {
                pair = C10619i.m12720i(j, g);
            } catch (C11713k e) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.mo4633a(), e);
            }
        } catch (Throwable th2) {
            if (m21870f() || kotlinClass.mo4630d().m20841d().m12732h()) {
                throw th2;
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        return new C3577g(pair.m15067a(), pair.m15066b(), kotlinClass.mo4630d().m20841d(), new C7644t(kotlinClass, m21871e(kotlinClass), m21868h(kotlinClass), m21873c(kotlinClass)));
    }

    /* renamed from: k */
    public final AbstractC11313e m21865k(AbstractC7637r kotlinClass) {
        C9971q.m14633g(kotlinClass, "kotlinClass");
        C3577g i = m21867i(kotlinClass);
        if (i == null) {
            return null;
        }
        return m21872d().m34044f().m34057d(kotlinClass.mo4628k(), i);
    }

    /* renamed from: l */
    public final void m21864l(C3585k kVar) {
        C9971q.m14633g(kVar, "<set-?>");
        this.f16618a = kVar;
    }

    /* renamed from: m */
    public final void m21863m(C7614f components) {
        C9971q.m14633g(components, "components");
        m21864l(components.m21882a());
    }
}
