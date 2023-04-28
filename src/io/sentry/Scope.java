package io.sentry;

import io.sentry.protocol.C8973c;
import io.sentry.protocol.C8991k;
import io.sentry.protocol.C9020z;
import io.sentry.util.C9098a;
import io.sentry.util.C9111k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import p163j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public final class Scope {

    /* renamed from: a */
    private EnumC8942n3 f19185a;

    /* renamed from: b */
    private AbstractC8932m0 f19186b;

    /* renamed from: c */
    private String f19187c;

    /* renamed from: d */
    private C9020z f19188d;

    /* renamed from: e */
    private C8991k f19189e;

    /* renamed from: f */
    private List<String> f19190f;

    /* renamed from: g */
    private Queue<C8843d> f19191g;

    /* renamed from: h */
    private Map<String, String> f19192h;

    /* renamed from: i */
    private Map<String, Object> f19193i;

    /* renamed from: j */
    private List<AbstractC9053t> f19194j;

    /* renamed from: k */
    private final C8951o3 f19195k;

    /* renamed from: l */
    private volatile C9157y3 f19196l;

    /* renamed from: m */
    private final Object f19197m;

    /* renamed from: n */
    private final Object f19198n;

    /* renamed from: o */
    private C8973c f19199o;

    /* renamed from: p */
    private List<C8804b> f19200p;

    /* renamed from: io.sentry.Scope$a */
    /* loaded from: classes8.dex */
    interface AbstractC8686a {
        /* renamed from: a */
        void mo17593a(C9157y3 y3Var);
    }

    /* renamed from: io.sentry.Scope$b */
    /* loaded from: classes8.dex */
    public interface AbstractC8687b {
        /* renamed from: a */
        void mo16971a(AbstractC8932m0 m0Var);
    }

    /* renamed from: io.sentry.Scope$c */
    /* loaded from: classes8.dex */
    static final class C8688c {

        /* renamed from: a */
        private final C9157y3 f19201a;

        /* renamed from: b */
        private final C9157y3 f19202b;

        public C8688c(C9157y3 y3Var, C9157y3 y3Var2) {
            this.f19202b = y3Var;
            this.f19201a = y3Var2;
        }

        /* renamed from: a */
        public C9157y3 m18367a() {
            return this.f19202b;
        }

        /* renamed from: b */
        public C9157y3 m18366b() {
            return this.f19201a;
        }
    }

    public Scope(C8951o3 o3Var) {
        this.f19190f = new ArrayList();
        this.f19192h = new ConcurrentHashMap();
        this.f19193i = new ConcurrentHashMap();
        this.f19194j = new CopyOnWriteArrayList();
        this.f19197m = new Object();
        this.f19198n = new Object();
        this.f19199o = new C8973c();
        this.f19200p = new CopyOnWriteArrayList();
        C8951o3 o3Var2 = (C8951o3) C9111k.m16995a(o3Var, "SentryOptions is required.");
        this.f19195k = o3Var2;
        this.f19191g = m18389e(o3Var2.getMaxBreadcrumbs());
    }

    /* renamed from: e */
    private Queue<C8843d> m18389e(int i) {
        return C8899i4.m17757e(new C8850e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public C9157y3 m18395A(AbstractC8686a aVar) {
        C9157y3 y3Var;
        synchronized (this.f19197m) {
            aVar.mo17593a(this.f19196l);
            if (this.f19196l != null) {
                y3Var = this.f19196l.clone();
            } else {
                y3Var = null;
            }
        }
        return y3Var;
    }

    /* renamed from: B */
    public void m18394B(AbstractC8687b bVar) {
        synchronized (this.f19198n) {
            bVar.mo16971a(this.f19186b);
        }
    }

    /* renamed from: a */
    public void m18393a(C8843d dVar) {
        m18392b(dVar, null);
    }

    /* renamed from: b */
    public void m18392b(C8843d dVar, C9116v vVar) {
        if (dVar != null) {
            if (vVar == null) {
                new C9116v();
            }
            this.f19195k.getBeforeBreadcrumb();
            this.f19191g.add(dVar);
            if (this.f19195k.isEnableScopeSync()) {
                for (AbstractC8876h0 h0Var : this.f19195k.getScopeObservers()) {
                    h0Var.mo17836e(dVar);
                }
            }
        }
    }

    /* renamed from: c */
    public void m18391c() {
        this.f19191g.clear();
    }

    /* renamed from: d */
    public void m18390d() {
        synchronized (this.f19198n) {
            this.f19186b = null;
        }
        this.f19187c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C9157y3 m18388f() {
        C9157y3 y3Var;
        synchronized (this.f19197m) {
            y3Var = null;
            if (this.f19196l != null) {
                this.f19196l.m16769c();
                C9157y3 b = this.f19196l.clone();
                this.f19196l = null;
                y3Var = b;
            }
        }
        return y3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public List<C8804b> m18387g() {
        return new CopyOnWriteArrayList(this.f19200p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Queue<C8843d> m18386h() {
        return this.f19191g;
    }

    /* renamed from: i */
    public C8973c m18385i() {
        return this.f19199o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public List<AbstractC9053t> m18384j() {
        return this.f19194j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Map<String, Object> m18383k() {
        return this.f19193i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public List<String> m18382l() {
        return this.f19190f;
    }

    /* renamed from: m */
    public EnumC8942n3 m18381m() {
        return this.f19185a;
    }

    /* renamed from: n */
    public C8991k m18380n() {
        return this.f19189e;
    }

    /* renamed from: o */
    public ISpan m18379o() {
        C8809b4 k;
        AbstractC8932m0 m0Var = this.f19186b;
        if (m0Var == null || (k = m0Var.mo16833k()) == null) {
            return m0Var;
        }
        return k;
    }

    /* renamed from: p */
    public Map<String, String> m18378p() {
        return C9098a.m17024b(this.f19192h);
    }

    /* renamed from: q */
    public AbstractC8932m0 m18377q() {
        return this.f19186b;
    }

    /* renamed from: r */
    public String m18376r() {
        AbstractC8932m0 m0Var = this.f19186b;
        if (m0Var != null) {
            return m0Var.getName();
        }
        return this.f19187c;
    }

    /* renamed from: s */
    public C9020z m18375s() {
        return this.f19188d;
    }

    /* renamed from: t */
    public void m18374t(String str, Object obj) {
        this.f19199o.put(str, obj);
    }

    /* renamed from: u */
    public void m18373u(String str, String str2) {
        this.f19193i.put(str, str2);
        if (this.f19195k.isEnableScopeSync()) {
            for (AbstractC8876h0 h0Var : this.f19195k.getScopeObservers()) {
                h0Var.mo17838b(str, str2);
            }
        }
    }

    /* renamed from: v */
    public void m18372v(List<String> list) {
        if (list != null) {
            this.f19190f = new ArrayList(list);
        }
    }

    /* renamed from: w */
    public void m18371w(String str, String str2) {
        this.f19192h.put(str, str2);
        if (this.f19195k.isEnableScopeSync()) {
            for (AbstractC8876h0 h0Var : this.f19195k.getScopeObservers()) {
                h0Var.mo17839a(str, str2);
            }
        }
    }

    /* renamed from: x */
    public void m18370x(AbstractC8932m0 m0Var) {
        synchronized (this.f19198n) {
            this.f19186b = m0Var;
        }
    }

    /* renamed from: y */
    public void m18369y(C9020z zVar) {
        this.f19188d = zVar;
        if (this.f19195k.isEnableScopeSync()) {
            for (AbstractC8876h0 h0Var : this.f19195k.getScopeObservers()) {
                h0Var.mo17837c(zVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public C8688c m18368z() {
        C8688c cVar;
        synchronized (this.f19197m) {
            if (this.f19196l != null) {
                this.f19196l.m16769c();
            }
            C9157y3 y3Var = this.f19196l;
            cVar = null;
            C9157y3 y3Var2 = null;
            if (this.f19195k.getRelease() != null) {
                this.f19196l = new C9157y3(this.f19195k.getDistinctId(), this.f19188d, this.f19195k.getEnvironment(), this.f19195k.getRelease());
                if (y3Var != null) {
                    y3Var2 = y3Var.clone();
                }
                cVar = new C8688c(this.f19196l.clone(), y3Var2);
            } else {
                this.f19195k.getLogger().mo17722c(EnumC8942n3.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(Scope scope) {
        this.f19190f = new ArrayList();
        this.f19192h = new ConcurrentHashMap();
        this.f19193i = new ConcurrentHashMap();
        this.f19194j = new CopyOnWriteArrayList();
        this.f19197m = new Object();
        this.f19198n = new Object();
        this.f19199o = new C8973c();
        this.f19200p = new CopyOnWriteArrayList();
        this.f19186b = scope.f19186b;
        this.f19187c = scope.f19187c;
        this.f19196l = scope.f19196l;
        this.f19195k = scope.f19195k;
        this.f19185a = scope.f19185a;
        C9020z zVar = scope.f19188d;
        C8991k kVar = null;
        this.f19188d = zVar != null ? new C9020z(zVar) : null;
        C8991k kVar2 = scope.f19189e;
        this.f19189e = kVar2 != null ? new C8991k(kVar2) : kVar;
        this.f19190f = new ArrayList(scope.f19190f);
        this.f19194j = new CopyOnWriteArrayList(scope.f19194j);
        C8843d[] dVarArr = (C8843d[]) scope.f19191g.toArray(new C8843d[0]);
        Queue<C8843d> e = m18389e(scope.f19195k.getMaxBreadcrumbs());
        for (C8843d dVar : dVarArr) {
            e.add(new C8843d(dVar));
        }
        this.f19191g = e;
        Map<String, String> map = scope.f19192h;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.f19192h = concurrentHashMap;
        Map<String, Object> map2 = scope.f19193i;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.f19193i = concurrentHashMap2;
        this.f19199o = new C8973c(scope.f19199o);
        this.f19200p = new CopyOnWriteArrayList(scope.f19200p);
    }
}
