package p153i8;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.AbstractC5318g;
import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.C5320h;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import p029b9.AbstractC3415h;
import p079e7.C6713c;
import p079e7.C6722k;
import p079e7.C6725l;
import p079e7.C6736w;
import p081e9.AbstractC6795x;
import p081e9.C6793v;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7562u;
import p152i7.C8223h;
import p153i8.AbstractC8233b0;
import p153i8.AbstractC8287r;
import p163j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i8.s0 */
/* loaded from: classes7.dex */
public final class C8291s0 implements AbstractC8287r, C5320h.AbstractC5322b<C8294c> {

    /* renamed from: k */
    private final C5288a f18064k;

    /* renamed from: l */
    private final DataSource.Factory f18065l;

    /* renamed from: m */
    private final AbstractC6795x f18066m;

    /* renamed from: n */
    private final AbstractC5318g f18067n;

    /* renamed from: o */
    private final AbstractC8233b0.C8234a f18068o;

    /* renamed from: p */
    private final TrackGroupArray f18069p;

    /* renamed from: r */
    private final long f18071r;

    /* renamed from: t */
    final C6722k f18073t;

    /* renamed from: u */
    final boolean f18074u;

    /* renamed from: v */
    boolean f18075v;

    /* renamed from: w */
    byte[] f18076w;

    /* renamed from: x */
    int f18077x;

    /* renamed from: q */
    private final ArrayList<C8293b> f18070q = new ArrayList<>();

    /* renamed from: s */
    final C5320h f18072s = new C5320h("Loader:SingleSampleMediaPeriod");

    /* renamed from: i8.s0$b */
    /* loaded from: classes7.dex */
    private final class C8293b implements AbstractC8278o0 {

        /* renamed from: k */
        private int f18078k;

        /* renamed from: l */
        private boolean f18079l;

        private C8293b() {
        }

        /* renamed from: b */
        private void m20014b() {
            if (!this.f18079l) {
                C8291s0.this.f18068o.m20245i(C7562u.m22076l(C8291s0.this.f18073t.f14329v), C8291s0.this.f18073t, 0, null, 0L);
                this.f18079l = true;
            }
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: a */
        public void mo12456a() {
            C8291s0 s0Var = C8291s0.this;
            if (!s0Var.f18074u) {
                s0Var.f18072s.mo24321a();
            }
        }

        /* renamed from: c */
        public void m20013c() {
            if (this.f18078k == 2) {
                this.f18078k = 1;
            }
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: e */
        public boolean mo12452e() {
            return C8291s0.this.f18075v;
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: j */
        public int mo12451j(C6725l lVar, C8223h hVar, boolean z) {
            m20014b();
            int i = this.f18078k;
            if (i == 2) {
                hVar.m20304e(4);
                return -4;
            } else if (z || i == 0) {
                lVar.f14361b = C8291s0.this.f18073t;
                this.f18078k = 1;
                return -5;
            } else {
                C8291s0 s0Var = C8291s0.this;
                if (!s0Var.f18075v) {
                    return -3;
                }
                if (s0Var.f18076w != null) {
                    hVar.m20304e(1);
                    hVar.f17800o = 0L;
                    if (hVar.m20282r()) {
                        return -4;
                    }
                    hVar.m20285o(C8291s0.this.f18077x);
                    ByteBuffer byteBuffer = hVar.f17798m;
                    C8291s0 s0Var2 = C8291s0.this;
                    byteBuffer.put(s0Var2.f18076w, 0, s0Var2.f18077x);
                } else {
                    hVar.m20304e(4);
                }
                this.f18078k = 2;
                return -4;
            }
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: s */
        public int mo12450s(long j) {
            m20014b();
            if (j <= 0 || this.f18078k == 2) {
                return 0;
            }
            this.f18078k = 2;
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.s0$c */
    /* loaded from: classes7.dex */
    public static final class C8294c implements C5320h.AbstractC5325e {

        /* renamed from: a */
        public final long f18081a = C8273n.m20108a();

        /* renamed from: b */
        public final C5288a f18082b;

        /* renamed from: c */
        private final C6793v f18083c;

        /* renamed from: d */
        private byte[] f18084d;

        public C8294c(C5288a aVar, DataSource dataSource) {
            this.f18082b = aVar;
            this.f18083c = new C6793v(dataSource);
        }

        @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5325e
        /* renamed from: a */
        public void mo12497a() {
            this.f18083c.m24317r();
            try {
                this.f18083c.mo12542b(this.f18082b);
                int i = 0;
                while (i != -1) {
                    int o = (int) this.f18083c.m24320o();
                    byte[] bArr = this.f18084d;
                    if (bArr == null) {
                        this.f18084d = new byte[Spliterator.IMMUTABLE];
                    } else if (o == bArr.length) {
                        this.f18084d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    C6793v vVar = this.f18083c;
                    byte[] bArr2 = this.f18084d;
                    i = vVar.read(bArr2, o, bArr2.length - o);
                }
            } finally {
                C7557q0.m22137n(this.f18083c);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5325e
        /* renamed from: c */
        public void mo12496c() {
        }
    }

    public C8291s0(C5288a aVar, DataSource.Factory factory, AbstractC6795x xVar, C6722k kVar, long j, AbstractC5318g gVar, AbstractC8233b0.C8234a aVar2, boolean z) {
        this.f18064k = aVar;
        this.f18065l = factory;
        this.f18066m = xVar;
        this.f18073t = kVar;
        this.f18071r = j;
        this.f18067n = gVar;
        this.f18068o = aVar2;
        this.f18074u = z;
        this.f18069p = new TrackGroupArray(new C8302u0(kVar));
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: b */
    public long mo12421b() {
        return (this.f18075v || this.f18072s.m29477j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: c */
    public boolean mo12419c() {
        return this.f18072s.m29477j();
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: d */
    public long mo12472d(long j, C6736w wVar) {
        return j;
    }

    /* renamed from: e */
    public void mo10446i(C8294c cVar, long j, long j2, boolean z) {
        C6793v vVar = cVar.f18083c;
        C8273n nVar = new C8273n(cVar.f18081a, cVar.f18082b, vVar.m24319p(), vVar.m24318q(), j, j2, vVar.m24320o());
        this.f18067n.mo29486d(cVar.f18081a);
        this.f18068o.m20236r(nVar, 1, -1, null, 0, null, 0L, this.f18071r);
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: f */
    public boolean mo12415f(long j) {
        if (this.f18075v || this.f18072s.m29477j() || this.f18072s.m29478i()) {
            return false;
        }
        DataSource createDataSource = this.f18065l.createDataSource();
        AbstractC6795x xVar = this.f18066m;
        if (xVar != null) {
            createDataSource.mo12541c(xVar);
        }
        C8294c cVar = new C8294c(this.f18064k, createDataSource);
        this.f18068o.m20259A(new C8273n(cVar.f18081a, this.f18064k, this.f18072s.m29473n(cVar, this, this.f18067n.mo29487c(1))), 1, -1, this.f18073t, 0, null, 0L, this.f18071r);
        return true;
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: g */
    public long mo12413g() {
        return this.f18075v ? Long.MIN_VALUE : 0L;
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: h */
    public void mo12411h(long j) {
    }

    /* renamed from: j */
    public void mo10444k(C8294c cVar, long j, long j2) {
        this.f18077x = (int) cVar.f18083c.m24320o();
        this.f18076w = (byte[]) C7510a.m22367e(cVar.f18084d);
        this.f18075v = true;
        C6793v vVar = cVar.f18083c;
        C8273n nVar = new C8273n(cVar.f18081a, cVar.f18082b, vVar.m24319p(), vVar.m24318q(), j, j2, this.f18077x);
        this.f18067n.mo29486d(cVar.f18081a);
        this.f18068o.m20233u(nVar, 1, -1, this.f18073t, 0, null, 0L, this.f18071r);
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: l */
    public long mo12470l(long j) {
        for (int i = 0; i < this.f18070q.size(); i++) {
            this.f18070q.get(i).m20013c();
        }
        return j;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: m */
    public void mo12469m(AbstractC8287r.AbstractC8288a aVar, long j) {
        aVar.mo20028j(this);
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: n */
    public long mo12468n() {
        return -9223372036854775807L;
    }

    /* renamed from: p */
    public C5320h.C5323c mo10440o(C8294c cVar, long j, long j2, IOException iOException, int i) {
        boolean z;
        C5320h.C5323c cVar2;
        C6793v vVar = cVar.f18083c;
        C8273n nVar = new C8273n(cVar.f18081a, cVar.f18082b, vVar.m24319p(), vVar.m24318q(), j, j2, vVar.m24320o());
        long a = this.f18067n.mo29489a(new AbstractC5318g.C5319a(nVar, new C8284q(1, -1, this.f18073t, 0, null, 0L, C6713c.m24565d(this.f18071r)), iOException, i));
        int i2 = (a > (-9223372036854775807L) ? 1 : (a == (-9223372036854775807L) ? 0 : -1));
        if (i2 == 0 || i >= this.f18067n.mo29487c(1)) {
            z = true;
        } else {
            z = false;
        }
        if (this.f18074u && z) {
            C7558r.m22103i("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f18075v = true;
            cVar2 = C5320h.f9876f;
        } else if (i2 != 0) {
            cVar2 = C5320h.m29479h(false, a);
        } else {
            cVar2 = C5320h.f9877g;
        }
        boolean z2 = !cVar2.m29470c();
        this.f18068o.m20231w(nVar, 1, -1, this.f18073t, 0, null, 0L, this.f18071r, iOException, z2);
        if (z2) {
            this.f18067n.mo29486d(cVar.f18081a);
        }
        return cVar2;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: q */
    public long mo12466q(AbstractC3415h[] hVarArr, boolean[] zArr, AbstractC8278o0[] o0VarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < hVarArr.length; i++) {
            AbstractC8278o0 o0Var = o0VarArr[i];
            if (o0Var != null && (hVarArr[i] == null || !zArr[i])) {
                this.f18070q.remove(o0Var);
                o0VarArr[i] = null;
            }
            if (o0VarArr[i] == null && hVarArr[i] != null) {
                C8293b bVar = new C8293b();
                this.f18070q.add(bVar);
                o0VarArr[i] = bVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: r */
    public void mo12465r() {
    }

    /* renamed from: s */
    public void m20015s() {
        this.f18072s.m29475l();
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: t */
    public TrackGroupArray mo12463t() {
        return this.f18069p;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: u */
    public void mo12462u(long j, boolean z) {
    }
}
