package p244n8;

import android.net.Uri;
import cc.AbstractC3884i0;
import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p079e7.C6722k;
import p080e8.C6750h;
import p080e8.C6758l;
import p119g9.C7510a;
import p119g9.C7544l0;
import p119g9.C7548n0;
import p119g9.C7557q0;
import p119g9.C7570y;
import p163j$.util.Spliterator;
import p193k7.C9798l;
import p194k8.AbstractC9838m;
import p228m7.AbstractC10515j;
import p228m7.C10511f;
import p244n8.C10732f;
import p260o8.C11220g;
import p459z7.C14576a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n8.i */
/* loaded from: classes7.dex */
public final class C10740i extends AbstractC9838m {

    /* renamed from: L */
    private static final AtomicInteger f38826L = new AtomicInteger();

    /* renamed from: A */
    private final boolean f38827A;

    /* renamed from: B */
    private final boolean f38828B;

    /* renamed from: C */
    private AbstractC10741j f38829C;

    /* renamed from: D */
    private C10748q f38830D;

    /* renamed from: E */
    private int f38831E;

    /* renamed from: F */
    private boolean f38832F;

    /* renamed from: G */
    private volatile boolean f38833G;

    /* renamed from: H */
    private boolean f38834H;

    /* renamed from: I */
    private AbstractC3884i0<Integer> f38835I;

    /* renamed from: J */
    private boolean f38836J;

    /* renamed from: K */
    private boolean f38837K;

    /* renamed from: k */
    public final int f23829k;

    /* renamed from: l */
    public final int f23830l;

    /* renamed from: m */
    public final Uri f23831m;

    /* renamed from: n */
    public final boolean f23832n;

    /* renamed from: o */
    public final int f23833o;

    /* renamed from: p */
    private final DataSource f23834p;

    /* renamed from: q */
    private final C5288a f23835q;

    /* renamed from: r */
    private final AbstractC10741j f23836r;

    /* renamed from: s */
    private final boolean f23837s;

    /* renamed from: t */
    private final boolean f23838t;

    /* renamed from: u */
    private final C7544l0 f23839u;

    /* renamed from: v */
    private final AbstractC10739h f23840v;

    /* renamed from: w */
    private final List<C6722k> f23841w;

    /* renamed from: x */
    private final C9798l f23842x;

    /* renamed from: y */
    private final C6750h f23843y;

    /* renamed from: z */
    private final C7570y f23844z;

    private C10740i(AbstractC10739h hVar, DataSource dataSource, C5288a aVar, C6722k kVar, boolean z, DataSource dataSource2, C5288a aVar2, boolean z2, Uri uri, List<C6722k> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, C7544l0 l0Var, C9798l lVar, AbstractC10741j jVar, C6750h hVar2, C7570y yVar, boolean z6) {
        super(dataSource, aVar, kVar, i, obj, j, j2, j3);
        this.f38827A = z;
        this.f23833o = i2;
        this.f38837K = z3;
        this.f23830l = i3;
        this.f23835q = aVar2;
        this.f23834p = dataSource2;
        this.f38832F = aVar2 != null;
        this.f38828B = z2;
        this.f23831m = uri;
        this.f23837s = z5;
        this.f23839u = l0Var;
        this.f23838t = z4;
        this.f23840v = hVar;
        this.f23841w = list;
        this.f23842x = lVar;
        this.f23836r = jVar;
        this.f23843y = hVar2;
        this.f23844z = yVar;
        this.f23832n = z6;
        this.f38835I = AbstractC3884i0.m33399x();
        this.f23829k = f38826L.getAndIncrement();
    }

    /* renamed from: i */
    private static DataSource m12494i(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return dataSource;
        }
        C7510a.m22367e(bArr2);
        return new C10726a(dataSource, bArr, bArr2);
    }

    /* renamed from: j */
    public static C10740i m12493j(AbstractC10739h hVar, DataSource dataSource, C6722k kVar, long j, C11220g gVar, C10732f.C10737e eVar, Uri uri, List<C6722k> list, int i, Object obj, boolean z, C10758t tVar, C10740i iVar, byte[] bArr, byte[] bArr2) {
        boolean z2;
        boolean z3;
        C5288a aVar;
        DataSource dataSource2;
        boolean z4;
        C7570y yVar;
        C6750h hVar2;
        AbstractC10741j jVar;
        int i2;
        C11220g.C11225e eVar2 = eVar.f23824a;
        C5288a a = new C5288a.C5289b().m29615i(C7548n0.m22233d(gVar.f25102a, eVar2.f25086k)).m29616h(eVar2.f25094s).m29617g(eVar2.f25095t).m29622b(eVar.f23827d ? 8 : 0).m29623a();
        boolean z5 = bArr != null;
        DataSource i3 = m12494i(dataSource, bArr, z5 ? m12491l((String) C7510a.m22367e(eVar2.f25093r)) : null);
        C11220g.C11224d dVar = eVar2.f25087l;
        if (dVar != null) {
            boolean z6 = bArr2 != null;
            byte[] l = z6 ? m12491l((String) C7510a.m22367e(dVar.f25093r)) : null;
            z2 = z5;
            aVar = new C5288a(C7548n0.m22233d(gVar.f25102a, dVar.f25086k), dVar.f25094s, dVar.f25095t);
            dataSource2 = m12494i(dataSource, bArr2, l);
            z3 = z6;
        } else {
            z2 = z5;
            dataSource2 = null;
            aVar = null;
            z3 = false;
        }
        long j2 = j + eVar2.f25090o;
        long j3 = j2 + eVar2.f25088m;
        int i4 = gVar.f25066h + eVar2.f25089n;
        if (iVar != null) {
            boolean z7 = uri.equals(iVar.f23831m) && iVar.f38834H;
            C6750h hVar3 = iVar.f23843y;
            C7570y yVar2 = iVar.f23844z;
            z4 = !(z7 || (m12487p(eVar, gVar) && j2 >= iVar.f21894h));
            if (!z7 || iVar.f38836J) {
                i2 = i4;
            } else {
                i2 = i4;
                if (iVar.f23830l == i2) {
                    jVar = iVar.f38829C;
                    hVar2 = hVar3;
                    yVar = yVar2;
                }
            }
            jVar = null;
            hVar2 = hVar3;
            yVar = yVar2;
        } else {
            i2 = i4;
            hVar2 = new C6750h();
            yVar = new C7570y(10);
            jVar = null;
            z4 = false;
        }
        return new C10740i(hVar, i3, a, kVar, z2, dataSource2, aVar, z3, uri, list, i, obj, j2, j3, eVar.f23825b, eVar.f23826c, !eVar.f23827d, i2, eVar2.f25096u, z, tVar.m12373a(i2), eVar2.f25091p, jVar, hVar2, yVar, z4);
    }

    /* renamed from: k */
    private void m12492k(DataSource dataSource, C5288a aVar, boolean z) {
        C5288a aVar2;
        long position;
        long j;
        boolean z2 = false;
        if (z) {
            if (this.f38831E != 0) {
                z2 = true;
            }
            aVar2 = aVar;
        } else {
            aVar2 = aVar.m29625e(this.f38831E);
        }
        try {
            C10511f u = m12482u(dataSource, aVar2);
            if (z2) {
                u.mo12932k(this.f38831E);
            }
            do {
                try {
                    if (this.f38833G) {
                        break;
                    }
                } catch (EOFException e) {
                    if ((this.f21890d.f14322o & Spliterator.SUBSIZED) != 0) {
                        this.f38829C.mo12478c();
                        position = u.getPosition();
                        j = aVar.f9752g;
                    } else {
                        throw e;
                    }
                }
            } while (this.f38829C.mo12480a(u));
            position = u.getPosition();
            j = aVar.f9752g;
            this.f38831E = (int) (position - j);
        } finally {
            C7557q0.m22137n(dataSource);
        }
    }

    /* renamed from: l */
    private static byte[] m12491l(String str) {
        int i;
        if (C7557q0.m22174U0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i = byteArray.length - 16;
        } else {
            i = 0;
        }
        System.arraycopy(byteArray, i, bArr, (16 - byteArray.length) + i, byteArray.length - i);
        return bArr;
    }

    /* renamed from: p */
    private static boolean m12487p(C10732f.C10737e eVar, C11220g gVar) {
        C11220g.C11225e eVar2 = eVar.f23824a;
        if (!(eVar2 instanceof C11220g.C11222b)) {
            return gVar.f25104c;
        }
        if (((C11220g.C11222b) eVar2).f25079v || (eVar.f23826c == 0 && gVar.f25104c)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private void m12485r() {
        try {
            this.f23839u.m22258h(this.f23837s, this.f21893g);
            m12492k(this.f21895i, this.f21888b, this.f38827A);
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    /* renamed from: s */
    private void m12484s() {
        if (this.f38832F) {
            C7510a.m22367e(this.f23834p);
            C7510a.m22367e(this.f23835q);
            m12492k(this.f23834p, this.f23835q, this.f38828B);
            this.f38831E = 0;
            this.f38832F = false;
        }
    }

    /* renamed from: t */
    private long m12483t(AbstractC10515j jVar) {
        jVar.mo12936f();
        try {
            this.f23844z.m22021L(10);
            jVar.mo12930n(this.f23844z.m22012d(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f23844z.m22026G() != 4801587) {
            return -9223372036854775807L;
        }
        this.f23844z.m22016Q(3);
        int C = this.f23844z.m22030C();
        int i = C + 10;
        if (i > this.f23844z.m22014b()) {
            byte[] d = this.f23844z.m22012d();
            this.f23844z.m22021L(i);
            System.arraycopy(d, 0, this.f23844z.m22012d(), 0, 10);
        }
        jVar.mo12930n(this.f23844z.m22012d(), 10, C);
        C14576a e = this.f23843y.m24404e(this.f23844z.m22012d(), C);
        if (e == null) {
            return -9223372036854775807L;
        }
        int f = e.m183f();
        for (int i2 = 0; i2 < f; i2++) {
            C14576a.AbstractC14577b e2 = e.m184e(i2);
            if (e2 instanceof C6758l) {
                C6758l lVar = (C6758l) e2;
                if ("com.apple.streaming.transportStreamTimestamp".equals(lVar.f14411l)) {
                    System.arraycopy(lVar.f14412m, 0, this.f23844z.m22012d(), 0, 8);
                    this.f23844z.m22017P(0);
                    this.f23844z.m22018O(8);
                    return this.f23844z.m21993w() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: u */
    private C10511f m12482u(DataSource dataSource, C5288a aVar) {
        AbstractC10741j jVar;
        long j;
        C10511f fVar = new C10511f(dataSource, aVar.f9752g, dataSource.mo12542b(aVar));
        if (this.f38829C == null) {
            long t = m12483t(fVar);
            fVar.mo12936f();
            AbstractC10741j jVar2 = this.f23836r;
            if (jVar2 != null) {
                jVar = jVar2.mo12475f();
            } else {
                jVar = this.f23840v.mo12498a(aVar.f9746a, this.f21890d, this.f23841w, this.f23839u, dataSource.mo12540e(), fVar);
            }
            this.f38829C = jVar;
            if (jVar.mo12476e()) {
                C10748q qVar = this.f38830D;
                if (t != -9223372036854775807L) {
                    j = this.f23839u.m22264b(t);
                } else {
                    j = this.f21893g;
                }
                qVar.m12405m0(j);
            } else {
                this.f38830D.m12405m0(0L);
            }
            this.f38830D.m12425Y();
            this.f38829C.mo12479b(this.f38830D);
        }
        this.f38830D.m12408j0(this.f23842x);
        return fVar;
    }

    @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5325e
    /* renamed from: a */
    public void mo12497a() {
        AbstractC10741j jVar;
        C7510a.m22367e(this.f38830D);
        if (this.f38829C == null && (jVar = this.f23836r) != null && jVar.mo12477d()) {
            this.f38829C = this.f23836r;
            this.f38832F = false;
        }
        m12484s();
        if (!this.f38833G) {
            if (!this.f23838t) {
                m12485r();
            }
            this.f38834H = !this.f38833G;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5325e
    /* renamed from: c */
    public void mo12496c() {
        this.f38833G = true;
    }

    @Override // p194k8.AbstractC9838m
    /* renamed from: h */
    public boolean mo12495h() {
        return this.f38834H;
    }

    /* renamed from: m */
    public int m12490m(int i) {
        C7510a.m22366f(!this.f23832n);
        if (i >= this.f38835I.size()) {
            return 0;
        }
        return this.f38835I.get(i).intValue();
    }

    /* renamed from: n */
    public void m12489n(C10748q qVar, AbstractC3884i0<Integer> i0Var) {
        this.f38830D = qVar;
        this.f38835I = i0Var;
    }

    /* renamed from: o */
    public void m12488o() {
        this.f38836J = true;
    }

    /* renamed from: q */
    public boolean m12486q() {
        return this.f38837K;
    }

    /* renamed from: v */
    public void m12481v() {
        this.f38837K = true;
    }
}
