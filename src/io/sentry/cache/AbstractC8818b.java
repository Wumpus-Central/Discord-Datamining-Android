package io.sentry.cache;

import io.sentry.AbstractC8924l0;
import io.sentry.C8879h3;
import io.sentry.C8951o3;
import io.sentry.C9025q2;
import io.sentry.C9157y3;
import io.sentry.EnumC8935m3;
import io.sentry.EnumC8942n3;
import io.sentry.clientreport.EnumC8827e;
import io.sentry.util.C9111k;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.cache.b */
/* loaded from: classes8.dex */
public abstract class AbstractC8818b {

    /* renamed from: o */
    protected static final Charset f19495o = Charset.forName("UTF-8");

    /* renamed from: k */
    protected final C8951o3 f19496k;

    /* renamed from: l */
    protected final AbstractC8924l0 f19497l;

    /* renamed from: m */
    protected final File f19498m;

    /* renamed from: n */
    private final int f19499n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8818b(C8951o3 o3Var, String str, int i) {
        C9111k.m16995a(str, "Directory is required.");
        this.f19496k = (C8951o3) C9111k.m16995a(o3Var, "SentryOptions is required.");
        this.f19497l = o3Var.getSerializer();
        this.f19498m = new File(str);
        this.f19499n = i;
    }

    /* renamed from: b */
    private C9025q2 m17980b(C9025q2 q2Var, C8879h3 h3Var) {
        ArrayList arrayList = new ArrayList();
        for (C8879h3 h3Var2 : q2Var.m17205d()) {
            arrayList.add(h3Var2);
        }
        arrayList.add(h3Var);
        return new C9025q2(q2Var.m17206c(), arrayList);
    }

    /* renamed from: e */
    private C9157y3 m17979e(C9025q2 q2Var) {
        for (C8879h3 h3Var : q2Var.m17205d()) {
            if (m17977g(h3Var)) {
                return m17971t(h3Var);
            }
        }
        return null;
    }

    /* renamed from: g */
    private boolean m17977g(C8879h3 h3Var) {
        if (h3Var == null) {
            return false;
        }
        return h3Var.m17776w().m17763b().equals(EnumC8935m3.Session);
    }

    /* renamed from: i */
    private boolean m17976i(C9025q2 q2Var) {
        return q2Var.m17205d().iterator().hasNext();
    }

    /* renamed from: j */
    private boolean m17975j(C9157y3 y3Var) {
        if (y3Var.m16762j().equals(C9157y3.EnumC9159b.Ok) && y3Var.m16763i() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ int m17974p(File file, File file2) {
        return Long.compare(file.lastModified(), file2.lastModified());
    }

    /* renamed from: r */
    private void m17973r(File file, File[] fileArr) {
        Boolean f;
        int i;
        File file2;
        C9025q2 s;
        C8879h3 h3Var;
        C9157y3 t;
        C9025q2 s2 = m17972s(file);
        if (s2 != null && m17976i(s2)) {
            this.f19496k.getClientReportRecorder().mo17937b(EnumC8827e.CACHE_OVERFLOW, s2);
            C9157y3 e = m17979e(s2);
            if (e != null && m17975j(e) && (f = e.m16766f()) != null && f.booleanValue()) {
                int length = fileArr.length;
                for (i = 0; i < length; i++) {
                    file2 = fileArr[i];
                    s = m17972s(file2);
                    if (s != null && m17976i(s)) {
                        Iterator<C8879h3> it = s.m17205d().iterator();
                        while (true) {
                            h3Var = null;
                            if (!it.hasNext()) {
                                break;
                            }
                            C8879h3 next = it.next();
                            if (m17977g(next) && (t = m17971t(next)) != null && m17975j(t)) {
                                Boolean f2 = t.m16766f();
                                if (f2 != null && f2.booleanValue()) {
                                    this.f19496k.getLogger().mo17722c(EnumC8942n3.ERROR, "Session %s has 2 times the init flag.", e.m16763i());
                                    return;
                                } else if (e.m16763i() != null && e.m16763i().equals(t.m16763i())) {
                                    t.m16761k();
                                    try {
                                        h3Var = C8879h3.m17779t(this.f19497l, t);
                                        it.remove();
                                        break;
                                    } catch (IOException e2) {
                                        this.f19496k.getLogger().mo17724a(EnumC8942n3.ERROR, e2, "Failed to create new envelope item for the session %s", e.m16763i());
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        return;
        if (h3Var != null) {
            C9025q2 b = m17980b(s, h3Var);
            long lastModified = file2.lastModified();
            if (!file2.delete()) {
                this.f19496k.getLogger().mo17722c(EnumC8942n3.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
            }
            m17969v(b, file2, lastModified);
            return;
        }
    }

    /* renamed from: s */
    private C9025q2 m17972s(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            C9025q2 d = this.f19497l.mo17604d(bufferedInputStream);
            bufferedInputStream.close();
            return d;
        } catch (IOException e) {
            this.f19496k.getLogger().mo17723b(EnumC8942n3.ERROR, "Failed to deserialize the envelope.", e);
            return null;
        }
    }

    /* renamed from: t */
    private C9157y3 m17971t(C8879h3 h3Var) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(h3Var.m17777v()), f19495o));
            C9157y3 y3Var = (C9157y3) this.f19497l.mo17605c(bufferedReader, C9157y3.class);
            bufferedReader.close();
            return y3Var;
        } catch (Throwable th2) {
            this.f19496k.getLogger().mo17723b(EnumC8942n3.ERROR, "Failed to deserialize the session.", th2);
            return null;
        }
    }

    /* renamed from: v */
    private void m17969v(C9025q2 q2Var, File file, long j) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            this.f19497l.mo17606b(q2Var, fileOutputStream);
            file.setLastModified(j);
            fileOutputStream.close();
        } catch (Throwable th2) {
            this.f19496k.getLogger().mo17723b(EnumC8942n3.ERROR, "Failed to serialize the new envelope to the disk.", th2);
        }
    }

    /* renamed from: w */
    private void m17968w(File[] fileArr) {
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, new Comparator() { // from class: io.sentry.cache.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int p;
                    p = AbstractC8818b.m17974p((File) obj, (File) obj2);
                    return p;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public boolean m17978f() {
        if (this.f19498m.isDirectory() && this.f19498m.canWrite() && this.f19498m.canRead()) {
            return true;
        }
        this.f19496k.getLogger().mo17722c(EnumC8942n3.ERROR, "The directory for caching files is inaccessible.: %s", this.f19498m.getAbsolutePath());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public void m17970u(File[] fileArr) {
        int length = fileArr.length;
        if (length >= this.f19499n) {
            this.f19496k.getLogger().mo17722c(EnumC8942n3.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i = (length - this.f19499n) + 1;
            m17968w(fileArr);
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArr, i, length);
            for (int i2 = 0; i2 < i; i2++) {
                File file = fileArr[i2];
                m17973r(file, fileArr2);
                if (!file.delete()) {
                    this.f19496k.getLogger().mo17722c(EnumC8942n3.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
            }
        }
    }
}
