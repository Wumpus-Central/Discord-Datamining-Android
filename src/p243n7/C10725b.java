package p243n7;

import android.net.Uri;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Map;
import p079e7.C6722k;
import p079e7.C6728o;
import p119g9.C7510a;
import p119g9.C7557q0;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10521o;
import p228m7.AbstractC10534y;
import p228m7.C10510e;
import p228m7.C10520n;
import p228m7.C10533x;

/* renamed from: n7.b */
/* loaded from: classes7.dex */
public final class C10725b implements AbstractC10514i {

    /* renamed from: r */
    private static final int[] f23764r;

    /* renamed from: u */
    private static final int f23767u;

    /* renamed from: a */
    private final byte[] f23768a;

    /* renamed from: b */
    private final int f23769b;

    /* renamed from: c */
    private boolean f23770c;

    /* renamed from: d */
    private long f23771d;

    /* renamed from: e */
    private int f23772e;

    /* renamed from: f */
    private int f23773f;

    /* renamed from: g */
    private boolean f23774g;

    /* renamed from: h */
    private long f23775h;

    /* renamed from: i */
    private int f23776i;

    /* renamed from: j */
    private int f23777j;

    /* renamed from: k */
    private long f23778k;

    /* renamed from: l */
    private AbstractC10516k f23779l;

    /* renamed from: m */
    private AbstractC10500b0 f23780m;

    /* renamed from: n */
    private AbstractC10534y f23781n;

    /* renamed from: o */
    private boolean f23782o;

    /* renamed from: p */
    public static final AbstractC10521o f23762p = new AbstractC10521o() { // from class: n7.a
        @Override // p228m7.AbstractC10521o
        /* renamed from: a */
        public /* synthetic */ AbstractC10514i[] mo2230a(Uri uri, Map map) {
            return C10520n.m12973a(this, uri, map);
        }

        @Override // p228m7.AbstractC10521o
        /* renamed from: b */
        public final AbstractC10514i[] mo2229b() {
            AbstractC10514i[] m;
            m = C10725b.m12549m();
            return m;
        }
    };

    /* renamed from: q */
    private static final int[] f23763q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: s */
    private static final byte[] f23765s = C7557q0.m22140l0("#!AMR\n");

    /* renamed from: t */
    private static final byte[] f23766t = C7557q0.m22140l0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f23764r = iArr;
        f23767u = iArr[8];
    }

    public C10725b() {
        this(0);
    }

    /* renamed from: f */
    private void m12556f() {
        C7510a.m22364h(this.f23780m);
        C7557q0.m22145j(this.f23779l);
    }

    /* renamed from: g */
    private static int m12555g(int i, long j) {
        return (int) (((i * 8) * 1000000) / j);
    }

    /* renamed from: h */
    private AbstractC10534y m12554h(long j) {
        return new C10510e(j, this.f23775h, m12555g(this.f23776i, 20000L), this.f23776i);
    }

    /* renamed from: i */
    private int m12553i(int i) {
        String str;
        if (!m12551k(i)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Illegal AMR ");
            if (this.f23770c) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb2.append(str);
            sb2.append(" frame type ");
            sb2.append(i);
            throw new C6728o(sb2.toString());
        } else if (this.f23770c) {
            return f23764r[i];
        } else {
            return f23763q[i];
        }
    }

    /* renamed from: j */
    private boolean m12552j(int i) {
        return !this.f23770c && (i < 12 || i > 14);
    }

    /* renamed from: k */
    private boolean m12551k(int i) {
        return i >= 0 && i <= 15 && (m12550l(i) || m12552j(i));
    }

    /* renamed from: l */
    private boolean m12550l(int i) {
        return this.f23770c && (i < 10 || i > 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ AbstractC10514i[] m12549m() {
        return new AbstractC10514i[]{new C10725b()};
    }

    /* renamed from: n */
    private void m12548n() {
        String str;
        int i;
        if (!this.f23782o) {
            this.f23782o = true;
            boolean z = this.f23770c;
            if (z) {
                str = "audio/amr-wb";
            } else {
                str = "audio/3gpp";
            }
            if (z) {
                i = 16000;
            } else {
                i = 8000;
            }
            this.f23780m.mo12388d(new C6722k.C6724b().m24488e0(str).m24501W(f23767u).m24516H(1).m24486f0(i).m24519E());
        }
    }

    /* renamed from: o */
    private void m12547o(long j, int i) {
        int i2;
        if (!this.f23774g) {
            if ((this.f23769b & 1) == 0 || j == -1 || !((i2 = this.f23776i) == -1 || i2 == this.f23772e)) {
                AbstractC10534y.C10536b bVar = new AbstractC10534y.C10536b(-9223372036854775807L);
                this.f23781n = bVar;
                this.f23779l.mo7936j(bVar);
                this.f23774g = true;
            } else if (this.f23777j >= 20 || i == -1) {
                AbstractC10534y h = m12554h(j);
                this.f23781n = h;
                this.f23779l.mo7936j(h);
                this.f23774g = true;
            }
        }
    }

    /* renamed from: p */
    private static boolean m12546p(AbstractC10515j jVar, byte[] bArr) {
        jVar.mo12936f();
        byte[] bArr2 = new byte[bArr.length];
        jVar.mo12930n(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: q */
    private int m12545q(AbstractC10515j jVar) {
        jVar.mo12936f();
        jVar.mo12930n(this.f23768a, 0, 1);
        byte b = this.f23768a[0];
        if ((b & 131) <= 0) {
            return m12553i((b >> 3) & 15);
        }
        throw new C6728o("Invalid padding bits for frame header " + ((int) b));
    }

    /* renamed from: r */
    private boolean m12544r(AbstractC10515j jVar) {
        byte[] bArr = f23765s;
        if (m12546p(jVar, bArr)) {
            this.f23770c = false;
            jVar.mo12932k(bArr.length);
            return true;
        }
        byte[] bArr2 = f23766t;
        if (!m12546p(jVar, bArr2)) {
            return false;
        }
        this.f23770c = true;
        jVar.mo12932k(bArr2.length);
        return true;
    }

    /* renamed from: s */
    private int m12543s(AbstractC10515j jVar) {
        if (this.f23773f == 0) {
            try {
                int q = m12545q(jVar);
                this.f23772e = q;
                this.f23773f = q;
                if (this.f23776i == -1) {
                    this.f23775h = jVar.getPosition();
                    this.f23776i = this.f23772e;
                }
                if (this.f23776i == this.f23772e) {
                    this.f23777j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int e = this.f23780m.mo12387e(jVar, this.f23773f, true);
        if (e == -1) {
            return -1;
        }
        int i = this.f23773f - e;
        this.f23773f = i;
        if (i > 0) {
            return 0;
        }
        this.f23780m.mo12382c(this.f23778k + this.f23771d, 1, this.f23772e, 0, null);
        this.f23771d += 20000;
        return 0;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: a */
    public void mo2228a(long j, long j2) {
        this.f23771d = 0L;
        this.f23772e = 0;
        this.f23773f = 0;
        if (j != 0) {
            AbstractC10534y yVar = this.f23781n;
            if (yVar instanceof C10510e) {
                this.f23778k = ((C10510e) yVar).m12984b(j);
                return;
            }
        }
        this.f23778k = 0L;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: b */
    public void mo2227b(AbstractC10516k kVar) {
        this.f23779l = kVar;
        this.f23780m = kVar.mo7937e(0, 1);
        kVar.mo7935s();
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: d */
    public boolean mo2225d(AbstractC10515j jVar) {
        return m12544r(jVar);
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: e */
    public int mo2224e(AbstractC10515j jVar, C10533x xVar) {
        m12556f();
        if (jVar.getPosition() != 0 || m12544r(jVar)) {
            m12548n();
            int s = m12543s(jVar);
            m12547o(jVar.getLength(), s);
            return s;
        }
        throw new C6728o("Could not find AMR header.");
    }

    @Override // p228m7.AbstractC10514i
    public void release() {
    }

    public C10725b(int i) {
        this.f23769b = i;
        this.f23768a = new byte[1];
        this.f23776i = -1;
    }
}
