package p133h9;

import java.util.Arrays;

/* renamed from: h9.e */
/* loaded from: classes5.dex */
final class C7948e {

    /* renamed from: c */
    private boolean f17065c;

    /* renamed from: d */
    private boolean f17066d;

    /* renamed from: f */
    private int f17068f;

    /* renamed from: a */
    private C7949a f17063a = new C7949a();

    /* renamed from: b */
    private C7949a f17064b = new C7949a();

    /* renamed from: e */
    private long f17067e = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h9.e$a */
    /* loaded from: classes5.dex */
    public static final class C7949a {

        /* renamed from: a */
        private long f17069a;

        /* renamed from: b */
        private long f17070b;

        /* renamed from: c */
        private long f17071c;

        /* renamed from: d */
        private long f17072d;

        /* renamed from: e */
        private long f17073e;

        /* renamed from: f */
        private long f17074f;

        /* renamed from: g */
        private final boolean[] f17075g = new boolean[15];

        /* renamed from: h */
        private int f17076h;

        /* renamed from: c */
        private static int m21060c(long j) {
            return (int) (j % 15);
        }

        /* renamed from: a */
        public long m21062a() {
            long j = this.f17073e;
            if (j == 0) {
                return 0L;
            }
            return this.f17074f / j;
        }

        /* renamed from: b */
        public long m21061b() {
            return this.f17074f;
        }

        /* renamed from: d */
        public boolean m21059d() {
            long j = this.f17072d;
            if (j == 0) {
                return false;
            }
            return this.f17075g[m21060c(j - 1)];
        }

        /* renamed from: e */
        public boolean m21058e() {
            return this.f17072d > 15 && this.f17076h == 0;
        }

        /* renamed from: f */
        public void m21057f(long j) {
            long j2 = this.f17072d;
            if (j2 == 0) {
                this.f17069a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f17069a;
                this.f17070b = j3;
                this.f17074f = j3;
                this.f17073e = 1L;
            } else {
                long j4 = j - this.f17071c;
                int c = m21060c(j2);
                if (Math.abs(j4 - this.f17070b) <= 1000000) {
                    this.f17073e++;
                    this.f17074f += j4;
                    boolean[] zArr = this.f17075g;
                    if (zArr[c]) {
                        zArr[c] = false;
                        this.f17076h--;
                    }
                } else {
                    boolean[] zArr2 = this.f17075g;
                    if (!zArr2[c]) {
                        zArr2[c] = true;
                        this.f17076h++;
                    }
                }
            }
            this.f17072d++;
            this.f17071c = j;
        }

        /* renamed from: g */
        public void m21056g() {
            this.f17072d = 0L;
            this.f17073e = 0L;
            this.f17074f = 0L;
            this.f17076h = 0;
            Arrays.fill(this.f17075g, false);
        }
    }

    /* renamed from: a */
    public long m21069a() {
        if (m21065e()) {
            return this.f17063a.m21062a();
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public float m21068b() {
        if (m21065e()) {
            return (float) (1.0E9d / this.f17063a.m21062a());
        }
        return -1.0f;
    }

    /* renamed from: c */
    public int m21067c() {
        return this.f17068f;
    }

    /* renamed from: d */
    public long m21066d() {
        if (m21065e()) {
            return this.f17063a.m21061b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public boolean m21065e() {
        return this.f17063a.m21058e();
    }

    /* renamed from: f */
    public void m21064f(long j) {
        this.f17063a.m21057f(j);
        int i = 0;
        if (this.f17063a.m21058e() && !this.f17066d) {
            this.f17065c = false;
        } else if (this.f17067e != -9223372036854775807L) {
            if (!this.f17065c || this.f17064b.m21059d()) {
                this.f17064b.m21056g();
                this.f17064b.m21057f(this.f17067e);
            }
            this.f17065c = true;
            this.f17064b.m21057f(j);
        }
        if (this.f17065c && this.f17064b.m21058e()) {
            C7949a aVar = this.f17063a;
            this.f17063a = this.f17064b;
            this.f17064b = aVar;
            this.f17065c = false;
            this.f17066d = false;
        }
        this.f17067e = j;
        if (!this.f17063a.m21058e()) {
            i = this.f17068f + 1;
        }
        this.f17068f = i;
    }

    /* renamed from: g */
    public void m21063g() {
        this.f17063a.m21056g();
        this.f17064b.m21056g();
        this.f17065c = false;
        this.f17067e = -9223372036854775807L;
        this.f17068f = 0;
    }
}
