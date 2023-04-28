package p398w7;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.util.Map;
import p079e7.C6728o;
import p119g9.C7510a;
import p119g9.C7569x;
import p119g9.C7570y;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10521o;
import p228m7.AbstractC10534y;
import p228m7.C10510e;
import p228m7.C10520n;
import p228m7.C10533x;
import p398w7.AbstractC13772i0;

/* renamed from: w7.h */
/* loaded from: classes7.dex */
public final class C13767h implements AbstractC10514i {

    /* renamed from: m */
    public static final AbstractC10521o f30788m = new AbstractC10521o() { // from class: w7.g
        @Override // p228m7.AbstractC10521o
        /* renamed from: a */
        public /* synthetic */ AbstractC10514i[] mo2230a(Uri uri, Map map) {
            return C10520n.m12973a(this, uri, map);
        }

        @Override // p228m7.AbstractC10521o
        /* renamed from: b */
        public final AbstractC10514i[] mo2229b() {
            AbstractC10514i[] i;
            i = C13767h.m2775i();
            return i;
        }
    };

    /* renamed from: a */
    private final int f30789a;

    /* renamed from: b */
    private final C13771i f30790b;

    /* renamed from: c */
    private final C7570y f30791c;

    /* renamed from: d */
    private final C7570y f30792d;

    /* renamed from: e */
    private final C7569x f30793e;

    /* renamed from: f */
    private AbstractC10516k f30794f;

    /* renamed from: g */
    private long f30795g;

    /* renamed from: h */
    private long f30796h;

    /* renamed from: i */
    private int f30797i;

    /* renamed from: j */
    private boolean f30798j;

    /* renamed from: k */
    private boolean f30799k;

    /* renamed from: l */
    private boolean f30800l;

    public C13767h() {
        this(0);
    }

    /* renamed from: f */
    private void m2778f(AbstractC10515j jVar) {
        int h;
        if (!this.f30798j) {
            this.f30797i = -1;
            jVar.mo12936f();
            long j = 0;
            if (jVar.getPosition() == 0) {
                m2773k(jVar);
            }
            int i = 0;
            int i2 = 0;
            do {
                try {
                    if (!jVar.mo12937d(this.f30792d.m22012d(), 0, 2, true)) {
                        break;
                    }
                    this.f30792d.m22017P(0);
                    if (!C13771i.m2742m(this.f30792d.m22023J())) {
                        break;
                    } else if (!jVar.mo12937d(this.f30792d.m22012d(), 0, 4, true)) {
                        break;
                    } else {
                        this.f30793e.m22036p(14);
                        h = this.f30793e.m22044h(13);
                        if (h > 6) {
                            j += h;
                            i2++;
                            if (i2 == 1000) {
                                break;
                            }
                        } else {
                            this.f30798j = true;
                            throw new C6728o("Malformed ADTS stream");
                        }
                    }
                } catch (EOFException unused) {
                }
            } while (jVar.mo12931l(h - 6, true));
            i = i2;
            jVar.mo12936f();
            if (i > 0) {
                this.f30797i = (int) (j / i);
            } else {
                this.f30797i = -1;
            }
            this.f30798j = true;
        }
    }

    /* renamed from: g */
    private static int m2777g(int i, long j) {
        return (int) (((i * 8) * 1000000) / j);
    }

    /* renamed from: h */
    private AbstractC10534y m2776h(long j) {
        return new C10510e(j, this.f30796h, m2777g(this.f30797i, this.f30790b.m2744k()), this.f30797i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ AbstractC10514i[] m2775i() {
        return new AbstractC10514i[]{new C13767h()};
    }

    /* renamed from: j */
    private void m2774j(long j, boolean z, boolean z2) {
        boolean z3;
        if (!this.f30800l) {
            if (!z || this.f30797i <= 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3 || this.f30790b.m2744k() != -9223372036854775807L || z2) {
                if (!z3 || this.f30790b.m2744k() == -9223372036854775807L) {
                    this.f30794f.mo7936j(new AbstractC10534y.C10536b(-9223372036854775807L));
                } else {
                    this.f30794f.mo7936j(m2776h(j));
                }
                this.f30800l = true;
            }
        }
    }

    /* renamed from: k */
    private int m2773k(AbstractC10515j jVar) {
        int i = 0;
        while (true) {
            jVar.mo12930n(this.f30792d.m22012d(), 0, 10);
            this.f30792d.m22017P(0);
            if (this.f30792d.m22026G() != 4801587) {
                break;
            }
            this.f30792d.m22016Q(3);
            int C = this.f30792d.m22030C();
            i += C + 10;
            jVar.mo12934i(C);
        }
        jVar.mo12936f();
        jVar.mo12934i(i);
        if (this.f30796h == -1) {
            this.f30796h = i;
        }
        return i;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: a */
    public void mo2228a(long j, long j2) {
        this.f30799k = false;
        this.f30790b.mo2658c();
        this.f30795g = j2;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: b */
    public void mo2227b(AbstractC10516k kVar) {
        this.f30794f = kVar;
        this.f30790b.mo2657d(kVar, new AbstractC13772i0.C13776d(0, 1));
        kVar.mo7935s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
        r9.mo12936f();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
        if ((r3 - r0) < 8192) goto L_0x002f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
        return false;
     */
    @Override // p228m7.AbstractC10514i
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo2225d(p228m7.AbstractC10515j r9) {
        /*
            r8 = this;
            int r0 = r8.m2773k(r9)
            r1 = 0
            r3 = r0
        L_0x0006:
            r2 = r1
            r4 = r2
        L_0x0008:
            g9.y r5 = r8.f30792d
            byte[] r5 = r5.m22012d()
            r6 = 2
            r9.mo12930n(r5, r1, r6)
            g9.y r5 = r8.f30792d
            r5.m22017P(r1)
            g9.y r5 = r8.f30792d
            int r5 = r5.m22023J()
            boolean r5 = p398w7.C13771i.m2742m(r5)
            if (r5 != 0) goto L_0x0033
            r9.mo12936f()
            int r3 = r3 + 1
            int r2 = r3 - r0
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r2 < r4) goto L_0x002f
            return r1
        L_0x002f:
            r9.mo12934i(r3)
            goto L_0x0006
        L_0x0033:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L_0x003d
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L_0x003d
            return r5
        L_0x003d:
            g9.y r5 = r8.f30792d
            byte[] r5 = r5.m22012d()
            r9.mo12930n(r5, r1, r6)
            g9.x r5 = r8.f30793e
            r6 = 14
            r5.m22036p(r6)
            g9.x r5 = r8.f30793e
            r6 = 13
            int r5 = r5.m22044h(r6)
            r6 = 6
            if (r5 > r6) goto L_0x0059
            return r1
        L_0x0059:
            int r6 = r5 + (-6)
            r9.mo12934i(r6)
            int r4 = r4 + r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: p398w7.C13767h.mo2225d(m7.j):boolean");
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: e */
    public int mo2224e(AbstractC10515j jVar, C10533x xVar) {
        boolean z;
        boolean z2;
        C7510a.m22364h(this.f30794f);
        long length = jVar.getLength();
        if ((this.f30789a & 1) == 0 || length == -1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            m2778f(jVar);
        }
        int read = jVar.read(this.f30791c.m22012d(), 0, RecyclerView.ItemAnimator.FLAG_MOVED);
        if (read == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        m2774j(length, z, z2);
        if (z2) {
            return -1;
        }
        this.f30791c.m22017P(0);
        this.f30791c.m22018O(read);
        if (!this.f30799k) {
            this.f30790b.mo2655f(this.f30795g, 4);
            this.f30799k = true;
        }
        this.f30790b.mo2659b(this.f30791c);
        return 0;
    }

    @Override // p228m7.AbstractC10514i
    public void release() {
    }

    public C13767h(int i) {
        this.f30789a = i;
        this.f30790b = new C13771i(true);
        this.f30791c = new C7570y((int) RecyclerView.ItemAnimator.FLAG_MOVED);
        this.f30797i = -1;
        this.f30796h = -1L;
        C7570y yVar = new C7570y(10);
        this.f30792d = yVar;
        this.f30793e = new C7569x(yVar.m22012d());
    }
}
