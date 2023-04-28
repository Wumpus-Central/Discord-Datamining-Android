package p228m7;

import p119g9.C7510a;
import p119g9.C7557q0;
import p228m7.AbstractC10534y;

/* renamed from: m7.a */
/* loaded from: classes7.dex */
public abstract class AbstractC10492a {

    /* renamed from: a */
    protected final C0337a f23175a;

    /* renamed from: b */
    protected final AbstractC10497f f23176b;

    /* renamed from: c */
    protected C10494c f23177c;

    /* renamed from: d */
    private final int f23178d;

    /* renamed from: m7.a$a */
    /* loaded from: classes7.dex */
    public static class C0337a implements AbstractC10534y {

        /* renamed from: a */
        private final AbstractC10495d f23179a;

        /* renamed from: b */
        private final long f23180b;

        /* renamed from: c */
        private final long f23181c;

        /* renamed from: d */
        private final long f23182d;

        /* renamed from: e */
        private final long f23183e;

        /* renamed from: f */
        private final long f23184f;

        /* renamed from: g */
        private final long f23185g;

        public C0337a(AbstractC10495d dVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f23179a = dVar;
            this.f23180b = j;
            this.f23181c = j2;
            this.f23182d = j3;
            this.f23183e = j4;
            this.f23184f = j5;
            this.f23185g = j6;
        }

        @Override // p228m7.AbstractC10534y
        /* renamed from: f */
        public AbstractC10534y.C10535a mo2208f(long j) {
            return new AbstractC10534y.C10535a(new C10537z(j, C10494c.m13024h(this.f23179a.mo10493a(j), this.f23181c, this.f23182d, this.f23183e, this.f23184f, this.f23185g)));
        }

        @Override // p228m7.AbstractC10534y
        /* renamed from: h */
        public boolean mo2207h() {
            return true;
        }

        @Override // p228m7.AbstractC10534y
        /* renamed from: i */
        public long mo2206i() {
            return this.f23180b;
        }

        /* renamed from: k */
        public long m13032k(long j) {
            return this.f23179a.mo10493a(j);
        }
    }

    /* renamed from: m7.a$b */
    /* loaded from: classes7.dex */
    public static final class C10493b implements AbstractC10495d {
        @Override // p228m7.AbstractC10492a.AbstractC10495d
        /* renamed from: a */
        public long mo10493a(long j) {
            return j;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m7.a$c */
    /* loaded from: classes7.dex */
    public static class C10494c {

        /* renamed from: a */
        private final long f23186a;

        /* renamed from: b */
        private final long f23187b;

        /* renamed from: c */
        private final long f23188c;

        /* renamed from: d */
        private long f23189d;

        /* renamed from: e */
        private long f23190e;

        /* renamed from: f */
        private long f23191f;

        /* renamed from: g */
        private long f23192g;

        /* renamed from: h */
        private long f23193h;

        protected C10494c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f23186a = j;
            this.f23187b = j2;
            this.f23189d = j3;
            this.f23190e = j4;
            this.f23191f = j5;
            this.f23192g = j6;
            this.f23188c = j7;
            this.f23193h = m13024h(j2, j3, j4, j5, j6, j7);
        }

        /* renamed from: h */
        protected static long m13024h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
            return C7557q0.m22127s(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public long m13023i() {
            return this.f23192g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public long m13022j() {
            return this.f23191f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public long m13021k() {
            return this.f23193h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public long m13020l() {
            return this.f23186a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public long m13019m() {
            return this.f23187b;
        }

        /* renamed from: n */
        private void m13018n() {
            this.f23193h = m13024h(this.f23187b, this.f23189d, this.f23190e, this.f23191f, this.f23192g, this.f23188c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public void m13017o(long j, long j2) {
            this.f23190e = j;
            this.f23192g = j2;
            m13018n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public void m13016p(long j, long j2) {
            this.f23189d = j;
            this.f23191f = j2;
            m13018n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m7.a$d */
    /* loaded from: classes7.dex */
    public interface AbstractC10495d {
        /* renamed from: a */
        long mo10493a(long j);
    }

    /* renamed from: m7.a$e */
    /* loaded from: classes7.dex */
    public static final class C10496e {

        /* renamed from: d */
        public static final C10496e f23194d = new C10496e(-3, -9223372036854775807L, -1);

        /* renamed from: a */
        private final int f23195a;

        /* renamed from: b */
        private final long f23196b;

        /* renamed from: c */
        private final long f23197c;

        private C10496e(int i, long j, long j2) {
            this.f23195a = i;
            this.f23196b = j;
            this.f23197c = j2;
        }

        /* renamed from: d */
        public static C10496e m13012d(long j, long j2) {
            return new C10496e(-1, j, j2);
        }

        /* renamed from: e */
        public static C10496e m13011e(long j) {
            return new C10496e(0, -9223372036854775807L, j);
        }

        /* renamed from: f */
        public static C10496e m13010f(long j, long j2) {
            return new C10496e(-2, j, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m7.a$f */
    /* loaded from: classes7.dex */
    public interface AbstractC10497f {
        /* renamed from: a */
        C10496e mo2635a(AbstractC10515j jVar, long j);

        /* renamed from: b */
        void mo2634b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC10492a(AbstractC10495d dVar, AbstractC10497f fVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f23176b = fVar;
        this.f23178d = i;
        this.f23175a = new C0337a(dVar, j, j2, j3, j4, j5, j6);
    }

    /* renamed from: a */
    protected C10494c m13046a(long j) {
        return new C10494c(j, this.f23175a.m13032k(j), this.f23175a.f23181c, this.f23175a.f23182d, this.f23175a.f23183e, this.f23175a.f23184f, this.f23175a.f23185g);
    }

    /* renamed from: b */
    public final AbstractC10534y m13045b() {
        return this.f23175a;
    }

    /* renamed from: c */
    public int m13044c(AbstractC10515j jVar, C10533x xVar) {
        while (true) {
            C10494c cVar = (C10494c) C7510a.m22364h(this.f23177c);
            long j = cVar.m13022j();
            long i = cVar.m13023i();
            long k = cVar.m13021k();
            if (i - j <= this.f23178d) {
                m13042e(false, j);
                return m13040g(jVar, j, xVar);
            } else if (!m13038i(jVar, k)) {
                return m13040g(jVar, k, xVar);
            } else {
                jVar.mo12936f();
                C10496e a = this.f23176b.mo2635a(jVar, cVar.m13019m());
                int i2 = a.f23195a;
                if (i2 == -3) {
                    m13042e(false, k);
                    return m13040g(jVar, k, xVar);
                } else if (i2 == -2) {
                    cVar.m13016p(a.f23196b, a.f23197c);
                } else if (i2 == -1) {
                    cVar.m13017o(a.f23196b, a.f23197c);
                } else if (i2 == 0) {
                    m13038i(jVar, a.f23197c);
                    m13042e(true, a.f23197c);
                    return m13040g(jVar, a.f23197c, xVar);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    /* renamed from: d */
    public final boolean m13043d() {
        return this.f23177c != null;
    }

    /* renamed from: e */
    protected final void m13042e(boolean z, long j) {
        this.f23177c = null;
        this.f23176b.mo2634b();
        m13041f(z, j);
    }

    /* renamed from: f */
    protected void m13041f(boolean z, long j) {
    }

    /* renamed from: g */
    protected final int m13040g(AbstractC10515j jVar, long j, C10533x xVar) {
        if (j == jVar.getPosition()) {
            return 0;
        }
        xVar.f23290a = j;
        return 1;
    }

    /* renamed from: h */
    public final void m13039h(long j) {
        C10494c cVar = this.f23177c;
        if (cVar == null || cVar.m13020l() != j) {
            this.f23177c = m13046a(j);
        }
    }

    /* renamed from: i */
    protected final boolean m13038i(AbstractC10515j jVar, long j) {
        long position = j - jVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        jVar.mo12932k((int) position);
        return true;
    }
}
