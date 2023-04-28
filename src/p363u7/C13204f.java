package p363u7;

import java.io.EOFException;
import p079e7.C6728o;
import p119g9.C7510a;
import p119g9.C7570y;
import p228m7.AbstractC10515j;

/* renamed from: u7.f */
/* loaded from: classes7.dex */
final class C13204f {

    /* renamed from: a */
    public int f29622a;

    /* renamed from: b */
    public int f29623b;

    /* renamed from: c */
    public long f29624c;

    /* renamed from: d */
    public long f29625d;

    /* renamed from: e */
    public long f29626e;

    /* renamed from: f */
    public long f29627f;

    /* renamed from: g */
    public int f29628g;

    /* renamed from: h */
    public int f29629h;

    /* renamed from: i */
    public int f29630i;

    /* renamed from: j */
    public final int[] f29631j = new int[255];

    /* renamed from: k */
    private final C7570y f29632k = new C7570y(255);

    /* renamed from: a */
    private static boolean m4337a(AbstractC10515j jVar, byte[] bArr, int i, int i2, boolean z) {
        try {
            return jVar.mo12937d(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: b */
    public boolean m4336b(AbstractC10515j jVar, boolean z) {
        m4335c();
        this.f29632k.m22021L(27);
        if (!m4337a(jVar, this.f29632k.m22012d(), 0, 27, z) || this.f29632k.m22027F() != 1332176723) {
            return false;
        }
        int D = this.f29632k.m22029D();
        this.f29622a = D;
        if (D == 0) {
            this.f29623b = this.f29632k.m22029D();
            this.f29624c = this.f29632k.m21998r();
            this.f29625d = this.f29632k.m21996t();
            this.f29626e = this.f29632k.m21996t();
            this.f29627f = this.f29632k.m21996t();
            int D2 = this.f29632k.m22029D();
            this.f29628g = D2;
            this.f29629h = D2 + 27;
            this.f29632k.m22021L(D2);
            jVar.mo12930n(this.f29632k.m22012d(), 0, this.f29628g);
            for (int i = 0; i < this.f29628g; i++) {
                this.f29631j[i] = this.f29632k.m22029D();
                this.f29630i += this.f29631j[i];
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw new C6728o("unsupported bit stream revision");
        }
    }

    /* renamed from: c */
    public void m4335c() {
        this.f29622a = 0;
        this.f29623b = 0;
        this.f29624c = 0L;
        this.f29625d = 0L;
        this.f29626e = 0L;
        this.f29627f = 0L;
        this.f29628g = 0;
        this.f29629h = 0;
        this.f29630i = 0;
    }

    /* renamed from: d */
    public boolean m4334d(AbstractC10515j jVar) {
        return m4333e(jVar, -1L);
    }

    /* renamed from: e */
    public boolean m4333e(AbstractC10515j jVar, long j) {
        boolean z;
        int i;
        if (jVar.getPosition() == jVar.mo7939h()) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        this.f29632k.m22021L(4);
        while (true) {
            i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if ((i == 0 || jVar.getPosition() + 4 < j) && m4337a(jVar, this.f29632k.m22012d(), 0, 4, true)) {
                this.f29632k.m22017P(0);
                if (this.f29632k.m22027F() == 1332176723) {
                    jVar.mo12936f();
                    return true;
                }
                jVar.mo12932k(1);
            }
        }
        do {
            if (i != 0 && jVar.getPosition() >= j) {
                break;
            }
        } while (jVar.mo12938a(1) != -1);
        return false;
    }
}
