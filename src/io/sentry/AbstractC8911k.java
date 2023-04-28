package io.sentry;

import io.sentry.hints.AbstractC8883b;
import io.sentry.hints.AbstractC8885d;
import io.sentry.hints.AbstractC8887f;
import io.sentry.hints.AbstractC8892k;
import io.sentry.util.C9105h;
import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.k */
/* loaded from: classes8.dex */
public abstract class AbstractC8911k {

    /* renamed from: a */
    private final AbstractC8869g0 f19593a;

    /* renamed from: b */
    private final long f19594b;

    /* renamed from: io.sentry.k$a */
    /* loaded from: classes8.dex */
    private static final class C8912a implements AbstractC8883b, AbstractC8887f, AbstractC8892k, AbstractC8885d {

        /* renamed from: a */
        boolean f19595a = false;

        /* renamed from: b */
        boolean f19596b = false;

        /* renamed from: c */
        private final CountDownLatch f19597c = new CountDownLatch(1);

        /* renamed from: d */
        private final long f19598d;

        /* renamed from: e */
        private final AbstractC8869g0 f19599e;

        public C8912a(long j, AbstractC8869g0 g0Var) {
            this.f19598d = j;
            this.f19599e = g0Var;
        }

        @Override // io.sentry.hints.AbstractC8887f
        /* renamed from: a */
        public boolean mo17717a() {
            return this.f19595a;
        }

        @Override // io.sentry.hints.AbstractC8892k
        /* renamed from: b */
        public void mo17716b(boolean z) {
            this.f19596b = z;
            this.f19597c.countDown();
        }

        @Override // io.sentry.hints.AbstractC8887f
        /* renamed from: c */
        public void mo17715c(boolean z) {
            this.f19595a = z;
        }

        @Override // io.sentry.hints.AbstractC8885d
        /* renamed from: d */
        public boolean mo17178d() {
            try {
                return this.f19597c.await(this.f19598d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                this.f19599e.mo17723b(EnumC8942n3.ERROR, "Exception while awaiting on lock.", e);
                return false;
            }
        }

        @Override // io.sentry.hints.AbstractC8892k
        /* renamed from: e */
        public boolean mo17714e() {
            return this.f19596b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8911k(AbstractC8869g0 g0Var, long j) {
        this.f19593a = g0Var;
        this.f19594b = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ boolean m17718d(File file, String str) {
        return mo17039c(str);
    }

    /* renamed from: c */
    protected abstract boolean mo17039c(String str);

    /* renamed from: e */
    public void mo17038e(File file) {
        int i;
        try {
            AbstractC8869g0 g0Var = this.f19593a;
            EnumC8942n3 n3Var = EnumC8942n3.DEBUG;
            g0Var.mo17722c(n3Var, "Processing dir. %s", file.getAbsolutePath());
            if (!file.exists()) {
                this.f19593a.mo17722c(EnumC8942n3.WARNING, "Directory '%s' doesn't exist. No cached events to send.", file.getAbsolutePath());
            } else if (!file.isDirectory()) {
                this.f19593a.mo17722c(EnumC8942n3.ERROR, "Cache dir %s is not a directory.", file.getAbsolutePath());
            } else {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    this.f19593a.mo17722c(EnumC8942n3.ERROR, "Cache dir %s is null.", file.getAbsolutePath());
                    return;
                }
                File[] listFiles2 = file.listFiles(new FilenameFilter() { // from class: io.sentry.j
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str) {
                        boolean d;
                        d = AbstractC8911k.this.m17718d(file2, str);
                        return d;
                    }
                });
                AbstractC8869g0 g0Var2 = this.f19593a;
                Object[] objArr = new Object[2];
                if (listFiles2 != null) {
                    i = listFiles2.length;
                } else {
                    i = 0;
                }
                objArr[0] = Integer.valueOf(i);
                objArr[1] = file.getAbsolutePath();
                g0Var2.mo17722c(n3Var, "Processing %d items from cache dir %s", objArr);
                for (File file2 : listFiles) {
                    if (!file2.isFile()) {
                        this.f19593a.mo17722c(EnumC8942n3.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                    } else {
                        this.f19593a.mo17722c(EnumC8942n3.DEBUG, "Processing file: %s", file2.getAbsolutePath());
                        mo17037f(file2, C9105h.m17014e(new C8912a(this.f19594b, this.f19593a)));
                    }
                }
            }
        } catch (Throwable th2) {
            this.f19593a.mo17724a(EnumC8942n3.ERROR, th2, "Failed processing '%s'", file.getAbsolutePath());
        }
    }

    /* renamed from: f */
    protected abstract void mo17037f(File file, C9116v vVar);
}
