package p280p7;

import android.net.Uri;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.Map;
import p119g9.C7510a;
import p119g9.C7570y;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10521o;
import p228m7.AbstractC10534y;
import p228m7.C10520n;
import p228m7.C10533x;

/* renamed from: p7.c */
/* loaded from: classes7.dex */
public final class C11581c implements AbstractC10514i {

    /* renamed from: q */
    public static final AbstractC10521o f25825q = new AbstractC10521o() { // from class: p7.b
        @Override // p228m7.AbstractC10521o
        /* renamed from: a */
        public /* synthetic */ AbstractC10514i[] mo2230a(Uri uri, Map map) {
            return C10520n.m12973a(this, uri, map);
        }

        @Override // p228m7.AbstractC10521o
        /* renamed from: b */
        public final AbstractC10514i[] mo2229b() {
            AbstractC10514i[] h;
            h = C11581c.m9316h();
            return h;
        }
    };

    /* renamed from: f */
    private AbstractC10516k f25831f;

    /* renamed from: h */
    private boolean f25833h;

    /* renamed from: i */
    private long f25834i;

    /* renamed from: j */
    private int f25835j;

    /* renamed from: k */
    private int f25836k;

    /* renamed from: l */
    private int f25837l;

    /* renamed from: m */
    private long f25838m;

    /* renamed from: n */
    private boolean f25839n;

    /* renamed from: o */
    private C11579a f25840o;

    /* renamed from: p */
    private C11585f f25841p;

    /* renamed from: a */
    private final C7570y f25826a = new C7570y(4);

    /* renamed from: b */
    private final C7570y f25827b = new C7570y(9);

    /* renamed from: c */
    private final C7570y f25828c = new C7570y(11);

    /* renamed from: d */
    private final C7570y f25829d = new C7570y();

    /* renamed from: e */
    private final C11582d f25830e = new C11582d();

    /* renamed from: g */
    private int f25832g = 1;

    /* renamed from: f */
    private void m9318f() {
        if (!this.f25839n) {
            this.f25831f.mo7936j(new AbstractC10534y.C10536b(-9223372036854775807L));
            this.f25839n = true;
        }
    }

    /* renamed from: g */
    private long m9317g() {
        if (this.f25833h) {
            return this.f25834i + this.f25838m;
        }
        if (this.f25830e.m9310d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f25838m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ AbstractC10514i[] m9316h() {
        return new AbstractC10514i[]{new C11581c()};
    }

    /* renamed from: i */
    private C7570y m9315i(AbstractC10515j jVar) {
        if (this.f25837l > this.f25829d.m22014b()) {
            C7570y yVar = this.f25829d;
            yVar.m22019N(new byte[Math.max(yVar.m22014b() * 2, this.f25837l)], 0);
        } else {
            this.f25829d.m22017P(0);
        }
        this.f25829d.m22018O(this.f25837l);
        jVar.readFully(this.f25829d.m22012d(), 0, this.f25837l);
        return this.f25829d;
    }

    /* renamed from: j */
    private boolean m9314j(AbstractC10515j jVar) {
        boolean z;
        boolean z2 = false;
        if (!jVar.mo12935g(this.f25827b.m22012d(), 0, 9, true)) {
            return false;
        }
        this.f25827b.m22017P(0);
        this.f25827b.m22016Q(4);
        int D = this.f25827b.m22029D();
        if ((D & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((D & 1) != 0) {
            z2 = true;
        }
        if (z && this.f25840o == null) {
            this.f25840o = new C11579a(this.f25831f.mo7937e(8, 1));
        }
        if (z2 && this.f25841p == null) {
            this.f25841p = new C11585f(this.f25831f.mo7937e(9, 2));
        }
        this.f25831f.mo7935s();
        this.f25835j = (this.f25827b.m22002n() - 9) + 4;
        this.f25832g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m9313k(p228m7.AbstractC10515j r10) {
        /*
            r9 = this;
            long r0 = r9.m9317g()
            int r2 = r9.f25836k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L_0x0023
            p7.a r3 = r9.f25840o
            if (r3 == 0) goto L_0x0023
            r9.m9318f()
            p7.a r2 = r9.f25840o
            g9.y r10 = r9.m9315i(r10)
            boolean r10 = r2.m9298a(r10, r0)
        L_0x0021:
            r0 = r6
            goto L_0x0075
        L_0x0023:
            r3 = 9
            if (r2 != r3) goto L_0x0039
            p7.f r3 = r9.f25841p
            if (r3 == 0) goto L_0x0039
            r9.m9318f()
            p7.f r2 = r9.f25841p
            g9.y r10 = r9.m9315i(r10)
            boolean r10 = r2.m9298a(r10, r0)
            goto L_0x0021
        L_0x0039:
            r3 = 18
            if (r2 != r3) goto L_0x006e
            boolean r2 = r9.f25839n
            if (r2 != 0) goto L_0x006e
            p7.d r2 = r9.f25830e
            g9.y r10 = r9.m9315i(r10)
            boolean r10 = r2.m9298a(r10, r0)
            p7.d r0 = r9.f25830e
            long r0 = r0.m9310d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0021
            m7.k r2 = r9.f25831f
            m7.w r3 = new m7.w
            p7.d r7 = r9.f25830e
            long[] r7 = r7.m9309e()
            p7.d r8 = r9.f25830e
            long[] r8 = r8.m9308f()
            r3.<init>(r7, r8, r0)
            r2.mo7936j(r3)
            r9.f25839n = r6
            goto L_0x0021
        L_0x006e:
            int r0 = r9.f25837l
            r10.mo12932k(r0)
            r10 = 0
            r0 = r10
        L_0x0075:
            boolean r1 = r9.f25833h
            if (r1 != 0) goto L_0x008f
            if (r10 == 0) goto L_0x008f
            r9.f25833h = r6
            p7.d r10 = r9.f25830e
            long r1 = r10.m9310d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x008b
            long r1 = r9.f25838m
            long r1 = -r1
            goto L_0x008d
        L_0x008b:
            r1 = 0
        L_0x008d:
            r9.f25834i = r1
        L_0x008f:
            r10 = 4
            r9.f25835j = r10
            r10 = 2
            r9.f25832g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p280p7.C11581c.m9313k(m7.j):boolean");
    }

    /* renamed from: l */
    private boolean m9312l(AbstractC10515j jVar) {
        if (!jVar.mo12935g(this.f25828c.m22012d(), 0, 11, true)) {
            return false;
        }
        this.f25828c.m22017P(0);
        this.f25836k = this.f25828c.m22029D();
        this.f25837l = this.f25828c.m22026G();
        this.f25838m = this.f25828c.m22026G();
        this.f25838m = ((this.f25828c.m22029D() << 24) | this.f25838m) * 1000;
        this.f25828c.m22016Q(3);
        this.f25832g = 4;
        return true;
    }

    /* renamed from: m */
    private void m9311m(AbstractC10515j jVar) {
        jVar.mo12932k(this.f25835j);
        this.f25835j = 0;
        this.f25832g = 3;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: a */
    public void mo2228a(long j, long j2) {
        if (j == 0) {
            this.f25832g = 1;
            this.f25833h = false;
        } else {
            this.f25832g = 3;
        }
        this.f25835j = 0;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: b */
    public void mo2227b(AbstractC10516k kVar) {
        this.f25831f = kVar;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: d */
    public boolean mo2225d(AbstractC10515j jVar) {
        jVar.mo12930n(this.f25826a.m22012d(), 0, 3);
        this.f25826a.m22017P(0);
        if (this.f25826a.m22026G() != 4607062) {
            return false;
        }
        jVar.mo12930n(this.f25826a.m22012d(), 0, 2);
        this.f25826a.m22017P(0);
        if ((this.f25826a.m22023J() & ItemTouchHelper.AbstractC3083c.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        jVar.mo12930n(this.f25826a.m22012d(), 0, 4);
        this.f25826a.m22017P(0);
        int n = this.f25826a.m22002n();
        jVar.mo12936f();
        jVar.mo12934i(n);
        jVar.mo12930n(this.f25826a.m22012d(), 0, 4);
        this.f25826a.m22017P(0);
        if (this.f25826a.m22002n() == 0) {
            return true;
        }
        return false;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: e */
    public int mo2224e(AbstractC10515j jVar, C10533x xVar) {
        C7510a.m22364h(this.f25831f);
        while (true) {
            int i = this.f25832g;
            if (i != 1) {
                if (i == 2) {
                    m9311m(jVar);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    } else if (m9313k(jVar)) {
                        return 0;
                    }
                } else if (!m9312l(jVar)) {
                    return -1;
                }
            } else if (!m9314j(jVar)) {
                return -1;
            }
        }
    }

    @Override // p228m7.AbstractC10514i
    public void release() {
    }
}
