package androidx.camera.core;

import androidx.core.util.C2517g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.camera.core.g0 */
/* loaded from: classes.dex */
public final class C1811g0 {

    /* renamed from: a */
    private final List<C1935v1> f1707a;

    /* renamed from: b */
    private final List<C1935v1> f1708b;

    /* renamed from: c */
    private final List<C1935v1> f1709c;

    /* renamed from: d */
    private final long f1710d;

    /* renamed from: androidx.camera.core.g0$a */
    /* loaded from: classes.dex */
    public static class C1812a {

        /* renamed from: a */
        final List<C1935v1> f1711a = new ArrayList();

        /* renamed from: b */
        final List<C1935v1> f1712b = new ArrayList();

        /* renamed from: c */
        final List<C1935v1> f1713c = new ArrayList();

        /* renamed from: d */
        long f1714d = 5000;

        public C1812a(C1935v1 v1Var, int i) {
            m39785a(v1Var, i);
        }

        /* renamed from: a */
        public C1812a m39785a(C1935v1 v1Var, int i) {
            boolean z;
            boolean z2 = false;
            if (v1Var != null) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37593b(z, "Point cannot be null.");
            if (i >= 1 && i <= 7) {
                z2 = true;
            }
            C2517g.m37593b(z2, "Invalid metering mode " + i);
            if ((i & 1) != 0) {
                this.f1711a.add(v1Var);
            }
            if ((i & 2) != 0) {
                this.f1712b.add(v1Var);
            }
            if ((i & 4) != 0) {
                this.f1713c.add(v1Var);
            }
            return this;
        }

        /* renamed from: b */
        public C1811g0 m39784b() {
            return new C1811g0(this);
        }

        /* renamed from: c */
        public C1812a m39783c(long j, TimeUnit timeUnit) {
            boolean z;
            if (j >= 1) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37593b(z, "autoCancelDuration must be at least 1");
            this.f1714d = timeUnit.toMillis(j);
            return this;
        }
    }

    C1811g0(C1812a aVar) {
        this.f1707a = Collections.unmodifiableList(aVar.f1711a);
        this.f1708b = Collections.unmodifiableList(aVar.f1712b);
        this.f1709c = Collections.unmodifiableList(aVar.f1713c);
        this.f1710d = aVar.f1714d;
    }

    /* renamed from: a */
    public long m39790a() {
        return this.f1710d;
    }

    /* renamed from: b */
    public List<C1935v1> m39789b() {
        return this.f1708b;
    }

    /* renamed from: c */
    public List<C1935v1> m39788c() {
        return this.f1707a;
    }

    /* renamed from: d */
    public List<C1935v1> m39787d() {
        return this.f1709c;
    }

    /* renamed from: e */
    public boolean m39786e() {
        return this.f1710d > 0;
    }
}
