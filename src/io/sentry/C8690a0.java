package io.sentry;

import io.sentry.C8873g4;
import io.sentry.Scope;
import io.sentry.clientreport.EnumC8827e;
import io.sentry.hints.C8889h;
import io.sentry.hints.C8891j;
import io.sentry.protocol.C9001p;
import io.sentry.protocol.C9015w;
import io.sentry.util.C9099b;
import io.sentry.util.C9105h;
import io.sentry.util.C9111k;
import io.sentry.util.C9112l;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import p163j$.util.DesugarCollections;

/* renamed from: io.sentry.a0 */
/* loaded from: classes8.dex */
public final class C8690a0 implements AbstractC8861f0 {

    /* renamed from: a */
    private volatile C9001p f19203a;

    /* renamed from: b */
    private final C8951o3 f19204b;

    /* renamed from: c */
    private volatile boolean f19205c;

    /* renamed from: d */
    private final C8873g4 f19206d;

    /* renamed from: e */
    private final C8930l4 f19207e;

    /* renamed from: f */
    private final Map<Throwable, C9112l<WeakReference<ISpan>, String>> f19208f;

    public C8690a0(C8951o3 o3Var) {
        this(o3Var, m18363C(o3Var));
    }

    /* renamed from: A */
    private C9001p m18365A(Throwable th2, C9116v vVar, AbstractC8807b2 b2Var) {
        C9001p pVar = C9001p.f19786l;
        if (!isEnabled()) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        } else if (th2 == null) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "captureException called with null parameter.", new Object[0]);
        } else {
            try {
                C8873g4.C8874a a = this.f19206d.m17853a();
                C8908j3 j3Var = new C8908j3(th2);
                m18356b(j3Var);
                pVar = a.m17850a().mo17583c(j3Var, m18355c(a.m17848c(), b2Var), vVar);
            } catch (Throwable th3) {
                AbstractC8869g0 logger = this.f19204b.getLogger();
                EnumC8942n3 n3Var = EnumC8942n3.ERROR;
                logger.mo17723b(n3Var, "Error while capturing exception: " + th2.getMessage(), th3);
            }
        }
        this.f19203a = pVar;
        return pVar;
    }

    /* renamed from: B */
    private C9001p m18364B(String str, EnumC8942n3 n3Var, AbstractC8807b2 b2Var) {
        C9001p pVar = C9001p.f19786l;
        if (!isEnabled()) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.", new Object[0]);
        } else if (str == null) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "captureMessage called with null parameter.", new Object[0]);
        } else {
            try {
                C8873g4.C8874a a = this.f19206d.m17853a();
                pVar = a.m17850a().mo17579g(str, n3Var, m18355c(a.m17848c(), b2Var));
            } catch (Throwable th2) {
                AbstractC8869g0 logger = this.f19204b.getLogger();
                EnumC8942n3 n3Var2 = EnumC8942n3.ERROR;
                logger.mo17723b(n3Var2, "Error while capturing message: " + str, th2);
            }
        }
        this.f19203a = pVar;
        return pVar;
    }

    /* renamed from: C */
    private static C8873g4.C8874a m18363C(C8951o3 o3Var) {
        m18358H(o3Var);
        return new C8873g4.C8874a(o3Var, new C8948o2(o3Var), new Scope(o3Var));
    }

    /* renamed from: D */
    private AbstractC8932m0 m18362D(C8944n4 n4Var, C8860f fVar, boolean z, Date date, boolean z2, Long l, boolean z3, AbstractC8959o4 o4Var) {
        final AbstractC8932m0 m0Var;
        C9111k.m16995a(n4Var, "transactionContext is required");
        if (!isEnabled()) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            m0Var = C8947o1.m17586n();
        } else if (!this.f19204b.getInstrumenter().equals(n4Var.m17590p())) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", n4Var.m17590p(), this.f19204b.getInstrumenter());
            m0Var = C8947o1.m17586n();
        } else if (!this.f19204b.isTracingEnabled()) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            m0Var = C8947o1.m17586n();
        } else {
            C8937m4 a = this.f19207e.m17611a(new C8692a2(n4Var, fVar));
            n4Var.m17985l(a);
            C9141w3 w3Var = new C9141w3(n4Var, this, date, z2, l, z3, o4Var);
            if (a.m17598c().booleanValue() && a.m17600a().booleanValue()) {
                this.f19204b.getTransactionProfiler().mo17553a(w3Var);
            }
            m0Var = w3Var;
        }
        if (z) {
            mo17829i(new AbstractC8807b2() { // from class: io.sentry.z
                @Override // io.sentry.AbstractC8807b2
                /* renamed from: a */
                public final void mo16755a(Scope scope) {
                    scope.m18370x(AbstractC8932m0.this);
                }
            });
        }
        return m0Var;
    }

    /* renamed from: H */
    private static void m18358H(C8951o3 o3Var) {
        C9111k.m16995a(o3Var, "SentryOptions is required.");
        if (o3Var.getDsn() == null || o3Var.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
        }
    }

    /* renamed from: b */
    private void m18356b(C8908j3 j3Var) {
        C9112l<WeakReference<ISpan>, String> lVar;
        ISpan iSpan;
        if (this.f19204b.isTracingEnabled() && j3Var.m17657M() != null && (lVar = this.f19208f.get(C9099b.m17021a(j3Var.m17657M()))) != null) {
            WeakReference<ISpan> a = lVar.m16994a();
            if (!(j3Var.m17668B().m17501f() != null || a == null || (iSpan = a.get()) == null)) {
                j3Var.m17668B().m17493n(iSpan.mo16831m());
            }
            String b = lVar.m16993b();
            if (j3Var.m17734r0() == null && b != null) {
                j3Var.m17751B0(b);
            }
        }
    }

    /* renamed from: c */
    private Scope m18355c(Scope scope, AbstractC8807b2 b2Var) {
        if (b2Var != null) {
            try {
                Scope scope2 = new Scope(scope);
                b2Var.mo16755a(scope2);
                return scope2;
            } catch (Throwable th2) {
                this.f19204b.getLogger().mo17723b(EnumC8942n3.ERROR, "Error in the 'ScopeCallback' callback.", th2);
            }
        }
        return scope;
    }

    /* renamed from: z */
    private C9001p m18354z(C8908j3 j3Var, C9116v vVar, AbstractC8807b2 b2Var) {
        C9001p pVar = C9001p.f19786l;
        if (!isEnabled()) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return pVar;
        } else if (j3Var == null) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return pVar;
        } else {
            try {
                m18356b(j3Var);
                C8873g4.C8874a a = this.f19206d.m17853a();
                pVar = a.m17850a().mo17583c(j3Var, m18355c(a.m17848c(), b2Var), vVar);
                this.f19203a = pVar;
                return pVar;
            } catch (Throwable th2) {
                AbstractC8869g0 logger = this.f19204b.getLogger();
                EnumC8942n3 n3Var = EnumC8942n3.ERROR;
                logger.mo17723b(n3Var, "Error while capturing event with id: " + j3Var.m17665E(), th2);
                return pVar;
            }
        }
    }

    /* renamed from: F */
    public void m18360F() {
        if (!isEnabled()) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "Instance is disabled and this 'popScope' call is a no-op.", new Object[0]);
        } else {
            this.f19206d.m17852b();
        }
    }

    /* renamed from: G */
    public void m18359G() {
        if (!isEnabled()) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "Instance is disabled and this 'pushScope' call is a no-op.", new Object[0]);
            return;
        }
        C8873g4.C8874a a = this.f19206d.m17853a();
        this.f19206d.m17851c(new C8873g4.C8874a(this.f19204b, a.m17850a(), new Scope(a.m17848c())));
    }

    @Override // io.sentry.AbstractC8861f0
    public void close() {
        if (!isEnabled()) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (AbstractC9023q0 q0Var : this.f19204b.getIntegrations()) {
                if (q0Var instanceof Closeable) {
                    ((Closeable) q0Var).close();
                }
            }
            this.f19204b.getExecutorService().mo17613a(this.f19204b.getShutdownTimeoutMillis());
            this.f19206d.m17853a().m17850a().close();
        } catch (Throwable th2) {
            this.f19204b.getLogger().mo17723b(EnumC8942n3.ERROR, "Error while closing the Hub.", th2);
        }
        this.f19205c = false;
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: d */
    public void mo17834d(long j) {
        if (!isEnabled()) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.f19206d.m17853a().m17850a().mo17582d(j);
        } catch (Throwable th2) {
            this.f19204b.getLogger().mo17723b(EnumC8942n3.ERROR, "Error in the 'client.flush'.", th2);
        }
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: e */
    public /* synthetic */ void mo17833e(C8843d dVar) {
        C8852e0.m17871a(this, dVar);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: f */
    public C9001p mo17832f(C9025q2 q2Var, C9116v vVar) {
        C9111k.m16995a(q2Var, "SentryEnvelope is required.");
        C9001p pVar = C9001p.f19786l;
        if (!isEnabled()) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return pVar;
        }
        try {
            C9001p f = this.f19206d.m17853a().m17850a().mo17580f(q2Var, vVar);
            if (f != null) {
                return f;
            }
            return pVar;
        } catch (Throwable th2) {
            this.f19204b.getLogger().mo17723b(EnumC8942n3.ERROR, "Error while capturing envelope.", th2);
            return pVar;
        }
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: g */
    public C9001p mo17831g(C9015w wVar, C8918k4 k4Var, C9116v vVar) {
        C9111k.m16995a(wVar, "transaction is required");
        C9001p pVar = C9001p.f19786l;
        if (!isEnabled()) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return pVar;
        } else if (!wVar.m17237m0()) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", wVar.m17665E());
            return pVar;
        } else if (!Boolean.TRUE.equals(Boolean.valueOf(wVar.m17236n0()))) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.DEBUG, "Transaction %s was dropped due to sampling decision.", wVar.m17665E());
            this.f19204b.getClientReportRecorder().mo17938a(EnumC8827e.SAMPLE_RATE, EnumC8868g.Transaction);
            return pVar;
        } else {
            try {
                C8873g4.C8874a a = this.f19206d.m17853a();
                return a.m17850a().mo17585a(wVar, k4Var, a.m17848c(), vVar);
            } catch (Throwable th2) {
                AbstractC8869g0 logger = this.f19204b.getLogger();
                EnumC8942n3 n3Var = EnumC8942n3.ERROR;
                logger.mo17723b(n3Var, "Error while capturing transaction with id: " + wVar.m17665E(), th2);
                return pVar;
            }
        }
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: h */
    public void mo17830h(C8843d dVar, C9116v vVar) {
        if (!isEnabled()) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (dVar == null) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.f19206d.m17853a().m17848c().m18392b(dVar, vVar);
        }
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: i */
    public void mo17829i(AbstractC8807b2 b2Var) {
        if (!isEnabled()) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            b2Var.mo16755a(this.f19206d.m17853a().m17848c());
        } catch (Throwable th2) {
            this.f19204b.getLogger().mo17723b(EnumC8942n3.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    @Override // io.sentry.AbstractC8861f0
    public boolean isEnabled() {
        return this.f19205c;
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: j */
    public AbstractC8932m0 mo17828j(C8944n4 n4Var, C8860f fVar, boolean z) {
        return m18362D(n4Var, fVar, z, null, false, null, false, null);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: k */
    public void mo17827k(Throwable th2, ISpan iSpan, String str) {
        C9111k.m16995a(th2, "throwable is required");
        C9111k.m16995a(iSpan, "span is required");
        C9111k.m16995a(str, "transactionName is required");
        Throwable a = C9099b.m17021a(th2);
        if (!this.f19208f.containsKey(a)) {
            this.f19208f.put(a, new C9112l<>(new WeakReference(iSpan), str));
        }
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: l */
    public C8951o3 mo17826l() {
        return this.f19206d.m17853a().m17849b();
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: m */
    public C9001p mo17825m(String str, EnumC8942n3 n3Var) {
        return m18364B(str, n3Var, null);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: n */
    public /* synthetic */ AbstractC8932m0 mo17824n(String str, String str2, C8860f fVar) {
        return C8852e0.m17867e(this, str, str2, fVar);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: o */
    public void mo17823o() {
        if (!isEnabled()) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        C8873g4.C8874a a = this.f19206d.m17853a();
        C9157y3 f = a.m17848c().m18388f();
        if (f != null) {
            a.m17850a().mo17581e(f, C9105h.m17014e(new C8889h()));
        }
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: p */
    public /* synthetic */ C9001p mo17822p(C9025q2 q2Var) {
        return C8852e0.m17870b(this, q2Var);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: q */
    public C9001p mo17821q(C8908j3 j3Var, C9116v vVar) {
        return m18354z(j3Var, vVar, null);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: r */
    public /* synthetic */ AbstractC8932m0 mo17820r(String str, String str2) {
        return C8852e0.m17868d(this, str, str2);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: s */
    public AbstractC8932m0 mo17819s(C8944n4 n4Var, C8965p4 p4Var) {
        p4Var.m17546a();
        return m18362D(n4Var, null, p4Var.m17542e(), p4Var.m17544c(), p4Var.m17540g(), p4Var.m17545b(), p4Var.m17541f(), p4Var.m17543d());
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: t */
    public Boolean mo17818t() {
        return C8963p2.m17550a().m17549b(this.f19204b.getCacheDirPath(), !this.f19204b.isEnableAutoSessionTracking());
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: u */
    public void mo17817u(AbstractC8807b2 b2Var) {
        if (!isEnabled()) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "Instance is disabled and this 'withScope' call is a no-op.", new Object[0]);
            return;
        }
        m18359G();
        try {
            b2Var.mo16755a(this.f19206d.m17853a().m17848c());
        } catch (Throwable th2) {
            this.f19204b.getLogger().mo17723b(EnumC8942n3.ERROR, "Error in the 'withScope' callback.", th2);
        }
        m18360F();
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: v */
    public /* synthetic */ C9001p mo17816v(Throwable th2) {
        return C8852e0.m17869c(this, th2);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: w */
    public /* synthetic */ AbstractC8932m0 mo17815w(String str, String str2, C8860f fVar, boolean z) {
        return C8852e0.m17866f(this, str, str2, fVar, z);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: x */
    public C9001p mo17814x(Throwable th2, C9116v vVar) {
        return m18365A(th2, vVar, null);
    }

    @Override // io.sentry.AbstractC8861f0
    /* renamed from: y */
    public void mo17813y() {
        if (!isEnabled()) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        C8873g4.C8874a a = this.f19206d.m17853a();
        Scope.C8688c z = a.m17848c().m18368z();
        if (z != null) {
            if (z.m18366b() != null) {
                a.m17850a().mo17581e(z.m18366b(), C9105h.m17014e(new C8889h()));
            }
            a.m17850a().mo17581e(z.m18367a(), C9105h.m17014e(new C8891j()));
            return;
        }
        this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "Session could not be started.", new Object[0]);
    }

    private C8690a0(C8951o3 o3Var, C8873g4 g4Var) {
        this.f19208f = DesugarCollections.synchronizedMap(new WeakHashMap());
        m18358H(o3Var);
        this.f19204b = o3Var;
        this.f19207e = new C8930l4(o3Var);
        this.f19206d = g4Var;
        this.f19203a = C9001p.f19786l;
        this.f19205c = true;
    }

    @Override // io.sentry.AbstractC8861f0
    public AbstractC8861f0 clone() {
        if (!isEnabled()) {
            this.f19204b.getLogger().mo17722c(EnumC8942n3.WARNING, "Disabled Hub cloned.", new Object[0]);
        }
        return new C8690a0(this.f19204b, new C8873g4(this.f19206d));
    }

    private C8690a0(C8951o3 o3Var, C8873g4.C8874a aVar) {
        this(o3Var, new C8873g4(o3Var.getLogger(), aVar));
    }
}
