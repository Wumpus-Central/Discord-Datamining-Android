package p315r6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p315r6.C12406b;

/* renamed from: r6.i */
/* loaded from: classes7.dex */
public abstract class AbstractC12420i {

    /* renamed from: r6.i$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC12421a {
        /* renamed from: a */
        public final AbstractC12421a m6833a(String str, int i) {
            mo6829e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final AbstractC12421a m6832b(String str, long j) {
            mo6829e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final AbstractC12421a m6831c(String str, String str2) {
            mo6829e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract AbstractC12420i mo6830d();

        /* renamed from: e */
        protected abstract Map<String, String> mo6829e();

        /* renamed from: f */
        protected abstract AbstractC12421a mo6828f(Map<String, String> map);

        /* renamed from: g */
        public abstract AbstractC12421a mo6827g(Integer num);

        /* renamed from: h */
        public abstract AbstractC12421a mo6826h(C12419h hVar);

        /* renamed from: i */
        public abstract AbstractC12421a mo6825i(long j);

        /* renamed from: j */
        public abstract AbstractC12421a mo6824j(String str);

        /* renamed from: k */
        public abstract AbstractC12421a mo6823k(long j);
    }

    /* renamed from: a */
    public static AbstractC12421a m6845a() {
        return new C12406b.C0398b().mo6828f(new HashMap());
    }

    /* renamed from: b */
    public final String m6844b(String str) {
        String str2 = mo6843c().get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<String, String> mo6843c();

    /* renamed from: d */
    public abstract Integer mo6842d();

    /* renamed from: e */
    public abstract C12419h mo6841e();

    /* renamed from: f */
    public abstract long mo6840f();

    /* renamed from: g */
    public final int m6839g(String str) {
        String str2 = mo6843c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long m6838h(String str) {
        String str2 = mo6843c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> m6837i() {
        return Collections.unmodifiableMap(mo6843c());
    }

    /* renamed from: j */
    public abstract String mo6836j();

    /* renamed from: k */
    public abstract long mo6835k();

    /* renamed from: l */
    public AbstractC12421a m6834l() {
        return new C12406b.C0398b().mo6824j(mo6836j()).mo6827g(mo6842d()).mo6826h(mo6841e()).mo6825i(mo6840f()).mo6823k(mo6835k()).mo6828f(new HashMap(mo6843c()));
    }
}
