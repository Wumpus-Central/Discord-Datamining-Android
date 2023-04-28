package io.sentry;

import io.sentry.hints.AbstractC8885d;
import io.sentry.hints.AbstractC8886e;
import io.sentry.hints.AbstractC8887f;
import io.sentry.hints.AbstractC8892k;
import io.sentry.protocol.C9001p;
import io.sentry.protocol.C9015w;
import io.sentry.util.C9098a;
import io.sentry.util.C9105h;
import io.sentry.util.C9110j;
import io.sentry.util.C9111k;
import io.sentry.util.C9114n;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* renamed from: io.sentry.u1 */
/* loaded from: classes8.dex */
public final class C9095u1 extends AbstractC8911k implements AbstractC8845d0 {

    /* renamed from: g */
    private static final Charset f19969g = Charset.forName("UTF-8");

    /* renamed from: c */
    private final AbstractC8861f0 f19970c;

    /* renamed from: d */
    private final AbstractC8811c0 f19971d;

    /* renamed from: e */
    private final AbstractC8924l0 f19972e;

    /* renamed from: f */
    private final AbstractC8869g0 f19973f;

    public C9095u1(AbstractC8861f0 f0Var, AbstractC8811c0 c0Var, AbstractC8924l0 l0Var, AbstractC8869g0 g0Var, long j) {
        super(g0Var, j);
        this.f19970c = (AbstractC8861f0) C9111k.m16995a(f0Var, "Hub is required.");
        this.f19971d = (AbstractC8811c0) C9111k.m16995a(c0Var, "Envelope reader is required.");
        this.f19972e = (AbstractC8924l0) C9111k.m16995a(l0Var, "Serializer is required.");
        this.f19973f = (AbstractC8869g0) C9111k.m16995a(g0Var, "Logger is required.");
    }

    /* renamed from: i */
    private C8937m4 m17034i(C8918k4 k4Var) {
        String a;
        if (!(k4Var == null || (a = k4Var.m17685a()) == null)) {
            try {
                Double valueOf = Double.valueOf(Double.parseDouble(a));
                if (C9114n.m16986f(valueOf, false)) {
                    return new C8937m4(Boolean.TRUE, valueOf);
                }
                this.f19973f.mo17722c(EnumC8942n3.ERROR, "Invalid sample rate parsed from TraceContext: %s", a);
            } catch (Exception unused) {
                this.f19973f.mo17722c(EnumC8942n3.ERROR, "Unable to parse sample rate from TraceContext: %s", a);
            }
        }
        return new C8937m4(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m17032k(File file, AbstractC8887f fVar) {
        if (!fVar.mo17717a()) {
            try {
                if (!file.delete()) {
                    this.f19973f.mo17722c(EnumC8942n3.ERROR, "Failed to delete: %s", file.getAbsolutePath());
                }
            } catch (RuntimeException e) {
                this.f19973f.mo17724a(EnumC8942n3.ERROR, e, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
    }

    /* renamed from: l */
    private void m17031l(C8879h3 h3Var, int i) {
        this.f19973f.mo17722c(EnumC8942n3.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i), h3Var.m17776w().m17763b());
    }

    /* renamed from: m */
    private void m17030m(int i) {
        this.f19973f.mo17722c(EnumC8942n3.DEBUG, "Item %d is being captured.", Integer.valueOf(i));
    }

    /* renamed from: n */
    private void m17029n(C9001p pVar) {
        this.f19973f.mo17722c(EnumC8942n3.WARNING, "Timed out waiting for event id submission: %s", pVar);
    }

    /* renamed from: o */
    private void m17028o(C9025q2 q2Var, C9001p pVar, int i) {
        this.f19973f.mo17722c(EnumC8942n3.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i), q2Var.m17206c().m17190a(), pVar);
    }

    /* renamed from: p */
    private void m17027p(C9025q2 q2Var, C9116v vVar) {
        Object f;
        this.f19973f.mo17722c(EnumC8942n3.DEBUG, "Processing Envelope with %d item(s)", Integer.valueOf(C9098a.m17022d(q2Var.m17205d())));
        int i = 0;
        for (C8879h3 h3Var : q2Var.m17205d()) {
            i++;
            if (h3Var.m17776w() == null) {
                this.f19973f.mo17722c(EnumC8942n3.ERROR, "Item %d has no header", Integer.valueOf(i));
            } else if (EnumC8935m3.Event.equals(h3Var.m17776w().m17763b())) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(h3Var.m17777v()), f19969g));
                    C8908j3 j3Var = (C8908j3) this.f19972e.mo17605c(bufferedReader, C8908j3.class);
                    if (j3Var == null) {
                        m17031l(h3Var, i);
                    } else {
                        if (j3Var.m17660J() != null) {
                            C9105h.m17002q(vVar, j3Var.m17660J().m17341f());
                        }
                        if (q2Var.m17206c().m17190a() == null || q2Var.m17206c().m17190a().equals(j3Var.m17665E())) {
                            this.f19970c.mo17821q(j3Var, vVar);
                            m17030m(i);
                            if (!m17026q(vVar)) {
                                m17029n(j3Var.m17665E());
                                bufferedReader.close();
                                return;
                            }
                        } else {
                            m17028o(q2Var, j3Var.m17665E(), i);
                            bufferedReader.close();
                        }
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    this.f19973f.mo17723b(EnumC8942n3.ERROR, "Item failed to process.", th2);
                }
                f = C9105h.m17013f(vVar);
                if ((f instanceof AbstractC8892k) || ((AbstractC8892k) f).mo17714e()) {
                    C9105h.m17005n(vVar, AbstractC8886e.class, new C9105h.AbstractC9106a() { // from class: io.sentry.t1
                        @Override // io.sentry.util.C9105h.AbstractC9106a
                        public final void accept(Object obj) {
                            ((AbstractC8886e) obj).reset();
                        }
                    });
                } else {
                    this.f19973f.mo17722c(EnumC8942n3.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i));
                    return;
                }
            } else {
                if (EnumC8935m3.Transaction.equals(h3Var.m17776w().m17763b())) {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(h3Var.m17777v()), f19969g));
                        C9015w wVar = (C9015w) this.f19972e.mo17605c(bufferedReader2, C9015w.class);
                        if (wVar == null) {
                            m17031l(h3Var, i);
                        } else if (q2Var.m17206c().m17190a() == null || q2Var.m17206c().m17190a().equals(wVar.m17665E())) {
                            C8918k4 c = q2Var.m17206c().m17188c();
                            if (wVar.m17668B().m17501f() != null) {
                                wVar.m17668B().m17501f().m17985l(m17034i(c));
                            }
                            this.f19970c.mo17831g(wVar, c, vVar);
                            m17030m(i);
                            if (!m17026q(vVar)) {
                                m17029n(wVar.m17665E());
                                bufferedReader2.close();
                                return;
                            }
                        } else {
                            m17028o(q2Var, wVar.m17665E(), i);
                            bufferedReader2.close();
                        }
                        bufferedReader2.close();
                    } catch (Throwable th3) {
                        this.f19973f.mo17723b(EnumC8942n3.ERROR, "Item failed to process.", th3);
                    }
                } else {
                    this.f19970c.mo17832f(new C9025q2(q2Var.m17206c().m17190a(), q2Var.m17206c().m17189b(), h3Var), vVar);
                    this.f19973f.mo17722c(EnumC8942n3.DEBUG, "%s item %d is being captured.", h3Var.m17776w().m17763b().getItemType(), Integer.valueOf(i));
                    if (!m17026q(vVar)) {
                        this.f19973f.mo17722c(EnumC8942n3.WARNING, "Timed out waiting for item type submission: %s", h3Var.m17776w().m17763b().getItemType());
                        return;
                    }
                }
                f = C9105h.m17013f(vVar);
                if (f instanceof AbstractC8892k) {
                }
                C9105h.m17005n(vVar, AbstractC8886e.class, new C9105h.AbstractC9106a() { // from class: io.sentry.t1
                    @Override // io.sentry.util.C9105h.AbstractC9106a
                    public final void accept(Object obj) {
                        ((AbstractC8886e) obj).reset();
                    }
                });
            }
        }
    }

    /* renamed from: q */
    private boolean m17026q(C9116v vVar) {
        Object f = C9105h.m17013f(vVar);
        if (f instanceof AbstractC8885d) {
            return ((AbstractC8885d) f).mo17178d();
        }
        C9110j.m16996a(AbstractC8885d.class, f, this.f19973f);
        return true;
    }

    @Override // io.sentry.AbstractC8845d0
    /* renamed from: a */
    public void mo17040a(String str, C9116v vVar) {
        C9111k.m16995a(str, "Path is required.");
        mo17037f(new File(str), vVar);
    }

    @Override // io.sentry.AbstractC8911k
    /* renamed from: c */
    protected boolean mo17039c(String str) {
        if (str == null || str.startsWith("session") || str.startsWith("startup_crash")) {
            return false;
        }
        return true;
    }

    @Override // io.sentry.AbstractC8911k
    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo17038e(File file) {
        super.mo17038e(file);
    }

    @Override // io.sentry.AbstractC8911k
    /* renamed from: f */
    protected void mo17037f(final File file, C9116v vVar) {
        C9105h.AbstractC9106a aVar;
        AbstractC8869g0 g0Var;
        BufferedInputStream bufferedInputStream;
        C9111k.m16995a(file, "File is required.");
        try {
            if (!mo17039c(file.getName())) {
                this.f19973f.mo17722c(EnumC8942n3.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            } catch (IOException e) {
                this.f19973f.mo17723b(EnumC8942n3.ERROR, "Error processing envelope.", e);
                g0Var = this.f19973f;
                aVar = new C9105h.AbstractC9106a() { // from class: io.sentry.s1
                    @Override // io.sentry.util.C9105h.AbstractC9106a
                    public final void accept(Object obj) {
                        C9095u1.this.m17032k(file, (AbstractC8887f) obj);
                    }
                };
            }
            try {
                C9025q2 a = this.f19971d.mo17597a(bufferedInputStream);
                if (a == null) {
                    this.f19973f.mo17722c(EnumC8942n3.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                } else {
                    m17027p(a, vVar);
                    this.f19973f.mo17722c(EnumC8942n3.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                }
                bufferedInputStream.close();
                g0Var = this.f19973f;
                aVar = new C9105h.AbstractC9106a() { // from class: io.sentry.s1
                    @Override // io.sentry.util.C9105h.AbstractC9106a
                    public final void accept(Object obj) {
                        C9095u1.this.m17032k(file, (AbstractC8887f) obj);
                    }
                };
                C9105h.m17003p(vVar, AbstractC8887f.class, g0Var, aVar);
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            C9105h.m17003p(vVar, AbstractC8887f.class, this.f19973f, new C9105h.AbstractC9106a() { // from class: io.sentry.s1
                @Override // io.sentry.util.C9105h.AbstractC9106a
                public final void accept(Object obj) {
                    C9095u1.this.m17032k(file, (AbstractC8887f) obj);
                }
            });
            throw th4;
        }
    }
}
