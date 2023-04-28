package io.sentry;

import io.sentry.C8951o3;
import io.sentry.C9157y3;
import io.sentry.Scope;
import io.sentry.clientreport.EnumC8827e;
import io.sentry.exception.C8859b;
import io.sentry.hints.AbstractC8884c;
import io.sentry.protocol.C8973c;
import io.sentry.protocol.C9001p;
import io.sentry.protocol.C9015w;
import io.sentry.transport.AbstractC9080p;
import io.sentry.util.C9105h;
import io.sentry.util.C9111k;
import java.io.Closeable;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.o2 */
/* loaded from: classes8.dex */
public final class C8948o2 implements AbstractC8905j0 {

    /* renamed from: b */
    private final C8951o3 f19660b;

    /* renamed from: c */
    private final AbstractC9080p f19661c;

    /* renamed from: d */
    private final SecureRandom f19662d;

    /* renamed from: e */
    private final C8950b f19663e = new C8950b();

    /* renamed from: a */
    private boolean f19659a = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.o2$b */
    /* loaded from: classes8.dex */
    public static final class C8950b implements Comparator<C8843d> {
        private C8950b() {
        }

        /* renamed from: b */
        public int compare(C8843d dVar, C8843d dVar2) {
            return dVar.m17911j().compareTo(dVar2.m17911j());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8948o2(C8951o3 o3Var) {
        SecureRandom secureRandom = null;
        this.f19660b = (C8951o3) C9111k.m16995a(o3Var, "SentryOptions is required.");
        AbstractC8946o0 transportFactory = o3Var.getTransportFactory();
        if (transportFactory instanceof C9024q1) {
            transportFactory = new C8689a();
            o3Var.setTransportFactory(transportFactory);
        }
        this.f19661c = transportFactory.mo17210a(o3Var, new C9162z1(o3Var).m16752a());
        this.f19662d = o3Var.getSampleRate() != null ? new SecureRandom() : secureRandom;
    }

    /* renamed from: j */
    private void m17576j(Scope scope, C9116v vVar) {
        if (scope != null) {
            vVar.m16980a(scope.m18387g());
        }
    }

    /* renamed from: k */
    private <T extends AbstractC8926l2> T m17575k(T t, Scope scope) {
        if (scope != null) {
            if (t.m17661I() == null) {
                t.m17647W(scope.m18380n());
            }
            if (t.m17655O() == null) {
                t.m17640b0(scope.m18375s());
            }
            if (t.m17658L() == null) {
                t.m17642a0(new HashMap(scope.m18378p()));
            } else {
                for (Map.Entry<String, String> entry : scope.m18378p().entrySet()) {
                    if (!t.m17658L().containsKey(entry.getKey())) {
                        t.m17658L().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (t.m17669A() == null) {
                t.m17654P(new ArrayList(scope.m18386h()));
            } else {
                m17561y(t, scope.m18386h());
            }
            if (t.m17664F() == null) {
                t.m17650T(new HashMap(scope.m18383k()));
            } else {
                for (Map.Entry<String, Object> entry2 : scope.m18383k().entrySet()) {
                    if (!t.m17664F().containsKey(entry2.getKey())) {
                        t.m17664F().put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            C8973c B = t.m17668B();
            for (Map.Entry<String, Object> entry3 : new C8973c(scope.m18385i()).entrySet()) {
                if (!B.containsKey(entry3.getKey())) {
                    B.put(entry3.getKey(), entry3.getValue());
                }
            }
        }
        return t;
    }

    /* renamed from: l */
    private C8908j3 m17574l(C8908j3 j3Var, Scope scope, C9116v vVar) {
        if (scope == null) {
            return j3Var;
        }
        m17575k(j3Var, scope);
        if (j3Var.m17734r0() == null) {
            j3Var.m17751B0(scope.m18376r());
        }
        if (j3Var.m17737o0() == null) {
            j3Var.m17729w0(scope.m18382l());
        }
        if (scope.m18381m() != null) {
            j3Var.m17728x0(scope.m18381m());
        }
        ISpan o = scope.m18379o();
        if (j3Var.m17668B().m17501f() == null && o != null) {
            j3Var.m17668B().m17493n(o.mo16831m());
        }
        return m17566t(j3Var, vVar, scope.m18384j());
    }

    /* renamed from: m */
    private C9025q2 m17573m(AbstractC8926l2 l2Var, List<C8804b> list, C9157y3 y3Var, C8918k4 k4Var, C9137w1 w1Var) {
        C9001p pVar;
        ArrayList arrayList = new ArrayList();
        if (l2Var != null) {
            arrayList.add(C8879h3.m17781r(this.f19660b.getSerializer(), l2Var));
            pVar = l2Var.m17665E();
        } else {
            pVar = null;
        }
        if (y3Var != null) {
            arrayList.add(C8879h3.m17779t(this.f19660b.getSerializer(), y3Var));
        }
        if (w1Var != null) {
            arrayList.add(C8879h3.m17780s(w1Var, this.f19660b.getMaxTraceFileSize(), this.f19660b.getSerializer()));
            if (pVar == null) {
                pVar = new C9001p(w1Var.m16891A());
            }
        }
        if (list != null) {
            for (C8804b bVar : list) {
                arrayList.add(C8879h3.m17783p(bVar, this.f19660b.getMaxAttachmentSize()));
            }
        }
        if (!arrayList.isEmpty()) {
            return new C9025q2(new C9032r2(pVar, this.f19660b.getSdkVersion(), k4Var), arrayList);
        }
        return null;
    }

    /* renamed from: n */
    private C8908j3 m17572n(C8908j3 j3Var, C9116v vVar) {
        C8951o3.AbstractC8953b beforeSend = this.f19660b.getBeforeSend();
        if (beforeSend == null) {
            return j3Var;
        }
        try {
            return beforeSend.mo17169a(j3Var, vVar);
        } catch (Throwable th2) {
            this.f19660b.getLogger().mo17723b(EnumC8942n3.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th2);
            C8843d dVar = new C8843d();
            dVar.m17906o("BeforeSend callback failed.");
            dVar.m17909l("SentryClient");
            dVar.m17907n(EnumC8942n3.ERROR);
            if (th2.getMessage() != null) {
                dVar.m17908m("sentry:message", th2.getMessage());
            }
            j3Var.m17616z(dVar);
            return j3Var;
        }
    }

    /* renamed from: o */
    private C9015w m17571o(C9015w wVar, C9116v vVar) {
        this.f19660b.getBeforeSendTransaction();
        return wVar;
    }

    /* renamed from: p */
    private List<C8804b> m17570p(List<C8804b> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C8804b bVar : list) {
            if (bVar.m18043g()) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    private List<C8804b> m17569q(C9116v vVar) {
        List<C8804b> e = vVar.m16976e();
        C8804b f = vVar.m16975f();
        if (f != null) {
            e.add(f);
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ void m17568r(C9157y3 y3Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m17567s(C8908j3 j3Var, C9116v vVar, C9157y3 y3Var) {
        C9157y3.EnumC9159b bVar;
        boolean z = false;
        if (y3Var != null) {
            String str = null;
            if (j3Var.m17733s0()) {
                bVar = C9157y3.EnumC9159b.Crashed;
            } else {
                bVar = null;
            }
            if (C9157y3.EnumC9159b.Crashed == bVar || j3Var.m17732t0()) {
                z = true;
            }
            if (!(j3Var.m17661I() == null || j3Var.m17661I().m17361k() == null || !j3Var.m17661I().m17361k().containsKey("user-agent"))) {
                str = j3Var.m17661I().m17361k().get("user-agent");
            }
            if (y3Var.m16759m(bVar, str, z) && C9105h.m17012g(vVar, AbstractC8884c.class)) {
                y3Var.m16769c();
                return;
            }
            return;
        }
        this.f19660b.getLogger().mo17722c(EnumC8942n3.INFO, "Session is null on scope.withSession", new Object[0]);
    }

    /* renamed from: t */
    private C8908j3 m17566t(C8908j3 j3Var, C9116v vVar, List<AbstractC9053t> list) {
        Iterator<AbstractC9053t> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC9053t next = it.next();
            try {
                j3Var = next.mo17164b(j3Var, vVar);
                continue;
            } catch (Throwable th2) {
                this.f19660b.getLogger().mo17724a(EnumC8942n3.ERROR, th2, "An exception occurred while processing event by processor: %s", next.getClass().getName());
                continue;
            }
            if (j3Var == null) {
                this.f19660b.getLogger().mo17722c(EnumC8942n3.DEBUG, "Event was dropped by a processor: %s", next.getClass().getName());
                this.f19660b.getClientReportRecorder().mo17938a(EnumC8827e.EVENT_PROCESSOR, EnumC8868g.Error);
                break;
            }
        }
        return j3Var;
    }

    /* renamed from: u */
    private C9015w m17565u(C9015w wVar, C9116v vVar, List<AbstractC9053t> list) {
        Iterator<AbstractC9053t> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC9053t next = it.next();
            try {
                wVar = next.mo17163g(wVar, vVar);
                continue;
            } catch (Throwable th2) {
                this.f19660b.getLogger().mo17724a(EnumC8942n3.ERROR, th2, "An exception occurred while processing transaction by processor: %s", next.getClass().getName());
                continue;
            }
            if (wVar == null) {
                this.f19660b.getLogger().mo17722c(EnumC8942n3.DEBUG, "Transaction was dropped by a processor: %s", next.getClass().getName());
                this.f19660b.getClientReportRecorder().mo17938a(EnumC8827e.EVENT_PROCESSOR, EnumC8868g.Transaction);
                break;
            }
        }
        return wVar;
    }

    /* renamed from: v */
    private boolean m17564v() {
        if (this.f19660b.getSampleRate() == null || this.f19662d == null || this.f19660b.getSampleRate().doubleValue() >= this.f19662d.nextDouble()) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private boolean m17563w(AbstractC8926l2 l2Var, C9116v vVar) {
        if (C9105h.m17000s(vVar)) {
            return true;
        }
        this.f19660b.getLogger().mo17722c(EnumC8942n3.DEBUG, "Event was cached so not applying scope: %s", l2Var.m17665E());
        return false;
    }

    /* renamed from: x */
    private boolean m17562x(C9157y3 y3Var, C9157y3 y3Var2) {
        boolean z;
        boolean z2;
        if (y3Var2 == null) {
            return false;
        }
        if (y3Var == null) {
            return true;
        }
        C9157y3.EnumC9159b j = y3Var2.m16762j();
        C9157y3.EnumC9159b bVar = C9157y3.EnumC9159b.Crashed;
        if (j != bVar || y3Var.m16762j() == bVar) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        if (y3Var2.m16767e() <= 0 || y3Var.m16767e() > 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    private void m17561y(AbstractC8926l2 l2Var, Collection<C8843d> collection) {
        List<C8843d> A = l2Var.m17669A();
        if (A != null && !collection.isEmpty()) {
            A.addAll(collection);
            Collections.sort(A, this.f19663e);
        }
    }

    @Override // io.sentry.AbstractC8905j0
    /* renamed from: a */
    public C9001p mo17585a(C9015w wVar, C8918k4 k4Var, Scope scope, C9116v vVar) {
        C9116v vVar2;
        C9001p pVar;
        C9015w wVar2 = wVar;
        C9111k.m16995a(wVar, "Transaction is required.");
        if (vVar == null) {
            vVar2 = new C9116v();
        } else {
            vVar2 = vVar;
        }
        if (m17563w(wVar, vVar2)) {
            m17576j(scope, vVar2);
        }
        AbstractC8869g0 logger = this.f19660b.getLogger();
        EnumC8942n3 n3Var = EnumC8942n3.DEBUG;
        logger.mo17722c(n3Var, "Capturing transaction: %s", wVar.m17665E());
        C9001p pVar2 = C9001p.f19786l;
        if (wVar.m17665E() != null) {
            pVar = wVar.m17665E();
        } else {
            pVar = pVar2;
        }
        if (m17563w(wVar, vVar2)) {
            wVar2 = (C9015w) m17575k(wVar, scope);
            if (!(wVar2 == null || scope == null)) {
                wVar2 = m17565u(wVar2, vVar2, scope.m18384j());
            }
            if (wVar2 == null) {
                this.f19660b.getLogger().mo17722c(n3Var, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (wVar2 != null) {
            wVar2 = m17565u(wVar2, vVar2, this.f19660b.getEventProcessors());
        }
        if (wVar2 == null) {
            this.f19660b.getLogger().mo17722c(n3Var, "Transaction was dropped by Event processors.", new Object[0]);
            return pVar2;
        }
        C9015w o = m17571o(wVar2, vVar2);
        if (o == null) {
            this.f19660b.getLogger().mo17722c(n3Var, "Transaction was dropped by beforeSendTransaction.", new Object[0]);
            this.f19660b.getClientReportRecorder().mo17938a(EnumC8827e.BEFORE_SEND, EnumC8868g.Transaction);
            return pVar2;
        }
        try {
            C9025q2 m = m17573m(o, m17570p(m17569q(vVar2)), null, k4Var, null);
            vVar2.m16979b();
            if (m == null) {
                return pVar2;
            }
            this.f19661c.mo17110x(m, vVar2);
            return pVar;
        } catch (C8859b | IOException e) {
            this.f19660b.getLogger().mo17724a(EnumC8942n3.WARNING, e, "Capturing transaction %s failed.", pVar);
            return C9001p.f19786l;
        }
    }

    @Override // io.sentry.AbstractC8905j0
    /* renamed from: b */
    public /* synthetic */ C9001p mo17584b(C8908j3 j3Var, Scope scope) {
        return C8894i0.m17770a(this, j3Var, scope);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129 A[Catch: b -> 0x011d, IOException -> 0x011f, TryCatch #2 {b -> 0x011d, IOException -> 0x011f, blocks: (B:47:0x010d, B:49:0x0113, B:59:0x0129, B:60:0x012d, B:62:0x0139), top: B:65:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139 A[Catch: b -> 0x011d, IOException -> 0x011f, TRY_LEAVE, TryCatch #2 {b -> 0x011d, IOException -> 0x011f, blocks: (B:47:0x010d, B:49:0x0113, B:59:0x0129, B:60:0x012d, B:62:0x0139), top: B:65:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // io.sentry.AbstractC8905j0
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.protocol.C9001p mo17583c(io.sentry.C8908j3 r13, io.sentry.Scope r14, io.sentry.C9116v r15) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C8948o2.mo17583c(io.sentry.j3, io.sentry.Scope, io.sentry.v):io.sentry.protocol.p");
    }

    @Override // io.sentry.AbstractC8905j0
    public void close() {
        this.f19660b.getLogger().mo17722c(EnumC8942n3.INFO, "Closing SentryClient.", new Object[0]);
        try {
            mo17582d(this.f19660b.getShutdownTimeoutMillis());
            this.f19661c.close();
        } catch (IOException e) {
            this.f19660b.getLogger().mo17723b(EnumC8942n3.WARNING, "Failed to close the connection to the Sentry Server.", e);
        }
        for (AbstractC9053t tVar : this.f19660b.getEventProcessors()) {
            if (tVar instanceof Closeable) {
                try {
                    ((Closeable) tVar).close();
                } catch (IOException e2) {
                    this.f19660b.getLogger().mo17722c(EnumC8942n3.WARNING, "Failed to close the event processor {}.", tVar, e2);
                }
            }
        }
        this.f19659a = false;
    }

    @Override // io.sentry.AbstractC8905j0
    /* renamed from: d */
    public void mo17582d(long j) {
        this.f19661c.mo17111d(j);
    }

    @Override // io.sentry.AbstractC8905j0
    /* renamed from: e */
    public void mo17581e(C9157y3 y3Var, C9116v vVar) {
        C9111k.m16995a(y3Var, "Session is required.");
        if (y3Var.m16765g() == null || y3Var.m16765g().isEmpty()) {
            this.f19660b.getLogger().mo17722c(EnumC8942n3.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            mo17580f(C9025q2.m17207b(this.f19660b.getSerializer(), y3Var, this.f19660b.getSdkVersion()), vVar);
        } catch (IOException e) {
            this.f19660b.getLogger().mo17723b(EnumC8942n3.ERROR, "Failed to capture session.", e);
        }
    }

    @Override // io.sentry.AbstractC8905j0
    /* renamed from: f */
    public C9001p mo17580f(C9025q2 q2Var, C9116v vVar) {
        C9111k.m16995a(q2Var, "SentryEnvelope is required.");
        if (vVar == null) {
            vVar = new C9116v();
        }
        try {
            vVar.m16979b();
            this.f19661c.mo17110x(q2Var, vVar);
            C9001p a = q2Var.m17206c().m17190a();
            if (a != null) {
                return a;
            }
            return C9001p.f19786l;
        } catch (IOException e) {
            this.f19660b.getLogger().mo17723b(EnumC8942n3.ERROR, "Failed to capture envelope.", e);
            return C9001p.f19786l;
        }
    }

    @Override // io.sentry.AbstractC8905j0
    /* renamed from: g */
    public /* synthetic */ C9001p mo17579g(String str, EnumC8942n3 n3Var, Scope scope) {
        return C8894i0.m17769b(this, str, n3Var, scope);
    }

    /* renamed from: z */
    C9157y3 m17560z(final C8908j3 j3Var, final C9116v vVar, Scope scope) {
        if (C9105h.m17000s(vVar)) {
            if (scope != null) {
                return scope.m18395A(new Scope.AbstractC8686a() { // from class: io.sentry.n2
                    @Override // io.sentry.Scope.AbstractC8686a
                    /* renamed from: a */
                    public final void mo17593a(C9157y3 y3Var) {
                        C8948o2.this.m17567s(j3Var, vVar, y3Var);
                    }
                });
            }
            this.f19660b.getLogger().mo17722c(EnumC8942n3.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }
}
