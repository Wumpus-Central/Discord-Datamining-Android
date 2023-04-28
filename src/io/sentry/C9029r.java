package io.sentry;

import io.sentry.hints.AbstractC8885d;
import io.sentry.hints.AbstractC8887f;
import io.sentry.util.C9105h;
import io.sentry.util.C9111k;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: io.sentry.r */
/* loaded from: classes8.dex */
public final class C9029r extends AbstractC8911k implements AbstractC8845d0 {

    /* renamed from: c */
    private final AbstractC8861f0 f19855c;

    /* renamed from: d */
    private final AbstractC8924l0 f19856d;

    /* renamed from: e */
    private final AbstractC8869g0 f19857e;

    public C9029r(AbstractC8861f0 f0Var, AbstractC8924l0 l0Var, AbstractC8869g0 g0Var, long j) {
        super(g0Var, j);
        this.f19855c = (AbstractC8861f0) C9111k.m16995a(f0Var, "Hub is required.");
        this.f19856d = (AbstractC8924l0) C9111k.m16995a(l0Var, "Serializer is required.");
        this.f19857e = (AbstractC8869g0) C9111k.m16995a(g0Var, "Logger is required.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m17196j(AbstractC8885d dVar) {
        if (!dVar.mo17178d()) {
            this.f19857e.mo17722c(EnumC8942n3.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m17195k(Throwable th2, File file, AbstractC8887f fVar) {
        fVar.mo17715c(false);
        this.f19857e.mo17724a(EnumC8942n3.INFO, th2, "File '%s' won't retry.", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m17194l(File file, AbstractC8887f fVar) {
        if (!fVar.mo17717a()) {
            m17193m(file, "after trying to capture it");
            this.f19857e.mo17722c(EnumC8942n3.DEBUG, "Deleted file %s.", file.getAbsolutePath());
            return;
        }
        this.f19857e.mo17722c(EnumC8942n3.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
    }

    /* renamed from: m */
    private void m17193m(File file, String str) {
        try {
            if (!file.delete()) {
                this.f19857e.mo17722c(EnumC8942n3.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
            }
        } catch (Throwable th2) {
            this.f19857e.mo17724a(EnumC8942n3.ERROR, th2, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
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
        return str.endsWith(".envelope");
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
        if (!file.isFile()) {
            this.f19857e.mo17722c(EnumC8942n3.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
        } else if (!mo17039c(file.getName())) {
            this.f19857e.mo17722c(EnumC8942n3.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
        } else {
            try {
                if (!file.getParentFile().canWrite()) {
                    this.f19857e.mo17722c(EnumC8942n3.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                    return;
                }
                try {
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    } catch (IOException e) {
                        this.f19857e.mo17724a(EnumC8942n3.ERROR, e, "I/O on file '%s' failed.", file.getAbsolutePath());
                        g0Var = this.f19857e;
                        aVar = new C9105h.AbstractC9106a() { // from class: io.sentry.p
                            @Override // io.sentry.util.C9105h.AbstractC9106a
                            public final void accept(Object obj) {
                                C9029r.this.m17194l(file, (AbstractC8887f) obj);
                            }
                        };
                    }
                } catch (FileNotFoundException e2) {
                    this.f19857e.mo17724a(EnumC8942n3.ERROR, e2, "File '%s' cannot be found.", file.getAbsolutePath());
                    g0Var = this.f19857e;
                    aVar = new C9105h.AbstractC9106a() { // from class: io.sentry.p
                        @Override // io.sentry.util.C9105h.AbstractC9106a
                        public final void accept(Object obj) {
                            C9029r.this.m17194l(file, (AbstractC8887f) obj);
                        }
                    };
                }
                try {
                    C9025q2 d = this.f19856d.mo17604d(bufferedInputStream);
                    if (d == null) {
                        this.f19857e.mo17722c(EnumC8942n3.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                    } else {
                        this.f19855c.mo17832f(d, vVar);
                    }
                    C9105h.m17003p(vVar, AbstractC8885d.class, this.f19857e, new C9105h.AbstractC9106a() { // from class: io.sentry.o
                        @Override // io.sentry.util.C9105h.AbstractC9106a
                        public final void accept(Object obj) {
                            C9029r.this.m17196j((AbstractC8885d) obj);
                        }
                    });
                    bufferedInputStream.close();
                    g0Var = this.f19857e;
                    aVar = new C9105h.AbstractC9106a() { // from class: io.sentry.p
                        @Override // io.sentry.util.C9105h.AbstractC9106a
                        public final void accept(Object obj) {
                            C9029r.this.m17194l(file, (AbstractC8887f) obj);
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
            }
        }
    }
}
