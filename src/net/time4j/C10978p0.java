package net.time4j;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Iterator;
import net.time4j.base.AbstractC10814d;
import net.time4j.base.AbstractC10816e;
import net.time4j.base.C10813c;
import p271oj.AbstractC11412e;
import p271oj.C11410d;
import p271oj.EnumC11413f;

/* renamed from: net.time4j.p0 */
/* loaded from: classes8.dex */
public final class C10978p0 implements AbstractC10816e<C10779a0> {

    /* renamed from: c */
    private static final AbstractC11412e f24387c;

    /* renamed from: d */
    private static final boolean f24388d;

    /* renamed from: e */
    public static final C10978p0 f24389e;

    /* renamed from: f */
    public static final C10978p0 f24390f;

    /* renamed from: a */
    private final boolean f24391a;

    /* renamed from: b */
    private final long f24392b;

    /* renamed from: net.time4j.p0$b */
    /* loaded from: classes8.dex */
    private static class C10980b implements AbstractC11412e {
        private C10980b() {
        }

        @Override // p271oj.AbstractC11412e
        /* renamed from: a */
        public long mo10111a() {
            return System.nanoTime();
        }

        @Override // p271oj.AbstractC11412e
        /* renamed from: b */
        public String mo10110b() {
            return "";
        }
    }

    static {
        AbstractC11412e eVar;
        String property = System.getProperty("java.vm.name");
        Iterator it = AbstractC10814d.m12187c().mo12183g(AbstractC11412e.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                eVar = null;
                break;
            }
            eVar = (AbstractC11412e) it.next();
            if (property.equals(eVar.mo10110b())) {
                break;
            }
        }
        if (eVar == null) {
            eVar = new C10980b();
        }
        f24387c = eVar;
        f24388d = Boolean.getBoolean("net.time4j.systemclock.nanoTime");
        f24389e = new C10978p0(false, m11388a());
        f24390f = new C10978p0(true, m11388a());
    }

    private C10978p0(boolean z, long j) {
        this.f24391a = z;
        this.f24392b = j;
    }

    /* renamed from: a */
    private static long m11388a() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = 0;
        int i = 0;
        while (i < 10) {
            if (f24388d) {
                j = System.nanoTime();
            } else {
                j = f24387c.mo10111a();
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            if (currentTimeMillis == currentTimeMillis2) {
                break;
            }
            i++;
            currentTimeMillis = currentTimeMillis2;
        }
        return C10813c.m12190m(C10813c.m12194i(C11410d.m10131A().m10120s(C10813c.m12201b(currentTimeMillis, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA)), 1000000000L) + (C10813c.m12199d(currentTimeMillis, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) * 1000000), j);
    }

    /* renamed from: b */
    public static C10779a0 m11387b() {
        return f24389e.m11386c();
    }

    /* renamed from: d */
    private long m11385d() {
        long j;
        if (f24388d) {
            j = System.nanoTime();
        } else {
            j = f24387c.mo10111a();
        }
        return C10813c.m12197f(j, this.f24392b);
    }

    /* renamed from: c */
    public C10779a0 m11386c() {
        if ((this.f24391a || f24388d) && C11410d.m10131A().m10127G()) {
            long d = m11385d();
            return C10779a0.m12308o0(C10813c.m12201b(d, 1000000000), C10813c.m12199d(d, 1000000000), EnumC11413f.UTC);
        }
        long currentTimeMillis = System.currentTimeMillis();
        return C10779a0.m12308o0(C10813c.m12201b(currentTimeMillis, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA), C10813c.m12199d(currentTimeMillis, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) * 1000000, EnumC11413f.POSIX);
    }
}
