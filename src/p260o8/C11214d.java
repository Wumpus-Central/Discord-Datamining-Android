package p260o8;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import cc.C3976z0;
import com.facebook.react.uimanager.ViewDefaults;
import com.google.android.exoplayer2.upstream.AbstractC5311f;
import com.google.android.exoplayer2.upstream.AbstractC5318g;
import com.google.android.exoplayer2.upstream.C5320h;
import com.google.android.exoplayer2.upstream.C5328i;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p079e7.C6713c;
import p079e7.C6728o;
import p119g9.C7510a;
import p119g9.C7557q0;
import p153i8.AbstractC8233b0;
import p153i8.C8273n;
import p153i8.C8284q;
import p244n8.AbstractC10738g;
import p260o8.AbstractC11232k;
import p260o8.C11214d;
import p260o8.C11217f;
import p260o8.C11220g;
import p260o8.C11228i;

/* renamed from: o8.d */
/* loaded from: classes7.dex */
public final class C11214d implements AbstractC11232k, C5320h.AbstractC5322b<C5328i<AbstractC11227h>> {

    /* renamed from: z */
    public static final AbstractC11232k.AbstractC11233a f25012z = new AbstractC11232k.AbstractC11233a() { // from class: o8.b
        @Override // p260o8.AbstractC11232k.AbstractC11233a
        /* renamed from: a */
        public final AbstractC11232k mo10375a(AbstractC10738g gVar, AbstractC5318g gVar2, AbstractC11231j jVar) {
            return new C11214d(gVar, gVar2, jVar);
        }
    };

    /* renamed from: k */
    private final AbstractC10738g f25013k;

    /* renamed from: l */
    private final AbstractC11231j f25014l;

    /* renamed from: m */
    private final AbstractC5318g f25015m;

    /* renamed from: n */
    private final HashMap<Uri, C11215a> f25016n;

    /* renamed from: o */
    private final List<AbstractC11232k.AbstractC11234b> f25017o;

    /* renamed from: p */
    private final double f25018p;

    /* renamed from: q */
    private AbstractC8233b0.C8234a f25019q;

    /* renamed from: r */
    private C5320h f25020r;

    /* renamed from: s */
    private Handler f25021s;

    /* renamed from: t */
    private AbstractC11232k.AbstractC11237e f25022t;

    /* renamed from: u */
    private C11217f f25023u;

    /* renamed from: v */
    private Uri f25024v;

    /* renamed from: w */
    private C11220g f25025w;

    /* renamed from: x */
    private boolean f25026x;

    /* renamed from: y */
    private long f25027y;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o8.d$a */
    /* loaded from: classes7.dex */
    public final class C11215a implements C5320h.AbstractC5322b<C5328i<AbstractC11227h>> {

        /* renamed from: k */
        private final Uri f25028k;

        /* renamed from: l */
        private final C5320h f25029l = new C5320h("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: m */
        private final DataSource f25030m;

        /* renamed from: n */
        private C11220g f25031n;

        /* renamed from: o */
        private long f25032o;

        /* renamed from: p */
        private long f25033p;

        /* renamed from: q */
        private long f25034q;

        /* renamed from: r */
        private long f25035r;

        /* renamed from: s */
        private boolean f25036s;

        /* renamed from: t */
        private IOException f25037t;

        public C11215a(Uri uri) {
            this.f25028k = uri;
            this.f25030m = C11214d.this.f25013k.mo12499a(4);
        }

        /* renamed from: f */
        private boolean m10449f(long j) {
            this.f25035r = SystemClock.elapsedRealtime() + j;
            if (!this.f25028k.equals(C11214d.this.f25024v) || C11214d.this.m10473H()) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        private Uri m10448g() {
            String str;
            C11220g gVar = this.f25031n;
            if (gVar != null) {
                C11220g.C11226f fVar = gVar.f25078t;
                if (fVar.f25097a != -9223372036854775807L || fVar.f25101e) {
                    Uri.Builder buildUpon = this.f25028k.buildUpon();
                    C11220g gVar2 = this.f25031n;
                    if (gVar2.f25078t.f25101e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(gVar2.f25067i + gVar2.f25074p.size()));
                        C11220g gVar3 = this.f25031n;
                        if (gVar3.f25070l != -9223372036854775807L) {
                            List<C11220g.C11222b> list = gVar3.f25075q;
                            int size = list.size();
                            if (!list.isEmpty() && ((C11220g.C11222b) C3976z0.m33215c(list)).f25080w) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    C11220g.C11226f fVar2 = this.f25031n.f25078t;
                    if (fVar2.f25097a != -9223372036854775807L) {
                        if (fVar2.f25098b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        buildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    return buildUpon.build();
                }
            }
            return this.f25028k;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m10443l(Uri uri) {
            this.f25036s = false;
            m10441n(uri);
        }

        /* renamed from: n */
        private void m10441n(Uri uri) {
            C5328i iVar = new C5328i(this.f25030m, uri, 4, C11214d.this.f25014l.mo10387b(C11214d.this.f25023u, this.f25031n));
            C11214d.this.f25019q.m20228z(new C8273n(iVar.f9894a, iVar.f9895b, this.f25029l.m29473n(iVar, this, C11214d.this.f25015m.mo29487c(iVar.f9896c))), iVar.f9896c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public void m10439p(final Uri uri) {
            this.f25035r = 0L;
            if (!this.f25036s && !this.f25029l.m29477j() && !this.f25029l.m29478i()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < this.f25034q) {
                    this.f25036s = true;
                    C11214d.this.f25021s.postDelayed(new Runnable() { // from class: o8.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            C11214d.C11215a.this.m10443l(uri);
                        }
                    }, this.f25034q - elapsedRealtime);
                    return;
                }
                m10441n(uri);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public void m10434u(C11220g gVar, C8273n nVar) {
            long j;
            C11220g gVar2 = this.f25031n;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f25032o = elapsedRealtime;
            C11220g C = C11214d.this.m10478C(gVar2, gVar);
            this.f25031n = C;
            boolean z = true;
            if (C != gVar2) {
                this.f25037t = null;
                this.f25033p = elapsedRealtime;
                C11214d.this.m10467N(this.f25028k, C);
            } else if (!C.f25071m) {
                C11220g gVar3 = this.f25031n;
                if (gVar.f25067i + gVar.f25074p.size() < gVar3.f25067i) {
                    this.f25037t = new AbstractC11232k.C11235c(this.f25028k);
                    C11214d.this.m10471J(this.f25028k, -9223372036854775807L);
                } else if (elapsedRealtime - this.f25033p > C6713c.m24565d(gVar3.f25069k) * C11214d.this.f25018p) {
                    this.f25037t = new AbstractC11232k.C11236d(this.f25028k);
                    long b = C11214d.this.f25015m.mo29488b(new AbstractC5318g.C5319a(nVar, new C8284q(4), this.f25037t, 1));
                    C11214d.this.m10471J(this.f25028k, b);
                    if (b != -9223372036854775807L) {
                        m10449f(b);
                    }
                }
            }
            C11220g gVar4 = this.f25031n;
            if (gVar4.f25078t.f25101e) {
                j = 0;
            } else if (gVar4 != gVar2) {
                j = gVar4.f25069k;
            } else {
                j = gVar4.f25069k / 2;
            }
            this.f25034q = elapsedRealtime + C6713c.m24565d(j);
            if (this.f25031n.f25070l == -9223372036854775807L && !this.f25028k.equals(C11214d.this.f25024v)) {
                z = false;
            }
            if (z && !this.f25031n.f25071m) {
                m10439p(m10448g());
            }
        }

        /* renamed from: h */
        public C11220g m10447h() {
            return this.f25031n;
        }

        /* renamed from: j */
        public boolean m10445j() {
            int i;
            if (this.f25031n == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, C6713c.m24565d(this.f25031n.f25077s));
            C11220g gVar = this.f25031n;
            if (gVar.f25071m || (i = gVar.f25062d) == 2 || i == 1 || this.f25032o + max > elapsedRealtime) {
                return true;
            }
            return false;
        }

        /* renamed from: m */
        public void m10442m() {
            m10439p(this.f25028k);
        }

        /* renamed from: q */
        public void m10438q() {
            this.f25029l.mo24321a();
            IOException iOException = this.f25037t;
            if (iOException != null) {
                throw iOException;
            }
        }

        /* renamed from: r */
        public void mo10446i(C5328i<AbstractC11227h> iVar, long j, long j2, boolean z) {
            C8273n nVar = new C8273n(iVar.f9894a, iVar.f9895b, iVar.m29460f(), iVar.m29462d(), j, j2, iVar.m29463b());
            C11214d.this.f25015m.mo29486d(iVar.f9894a);
            C11214d.this.f25019q.m20237q(nVar, 4);
        }

        /* renamed from: s */
        public void mo10444k(C5328i<AbstractC11227h> iVar, long j, long j2) {
            AbstractC11227h e = iVar.m29461e();
            C8273n nVar = new C8273n(iVar.f9894a, iVar.f9895b, iVar.m29460f(), iVar.m29462d(), j, j2, iVar.m29463b());
            if (e instanceof C11220g) {
                m10434u((C11220g) e, nVar);
                C11214d.this.f25019q.m20234t(nVar, 4);
            } else {
                this.f25037t = new C6728o("Loaded playlist has unexpected type.");
                C11214d.this.f25019q.m20230x(nVar, 4, this.f25037t, true);
            }
            C11214d.this.f25015m.mo29486d(iVar.f9894a);
        }

        /* renamed from: t */
        public C5320h.C5323c mo10440o(C5328i<AbstractC11227h> iVar, long j, long j2, IOException iOException, int i) {
            boolean z;
            boolean z2;
            boolean z3;
            C5320h.C5323c cVar;
            int i2;
            C8273n nVar = new C8273n(iVar.f9894a, iVar.f9895b, iVar.m29460f(), iVar.m29462d(), j, j2, iVar.m29463b());
            if (iVar.m29460f().getQueryParameter("_HLS_msn") != null) {
                z = true;
            } else {
                z = false;
            }
            boolean z4 = iOException instanceof C11228i.C11229a;
            if (z || z4) {
                if (iOException instanceof AbstractC5311f.C0146f) {
                    i2 = ((AbstractC5311f.C0146f) iOException).f9864m;
                } else {
                    i2 = ViewDefaults.NUMBER_OF_LINES;
                }
                if (z4 || i2 == 400 || i2 == 503) {
                    this.f25034q = SystemClock.elapsedRealtime();
                    m10442m();
                    ((AbstractC8233b0.C8234a) C7557q0.m22145j(C11214d.this.f25019q)).m20230x(nVar, iVar.f9896c, iOException, true);
                    return C5320h.f9876f;
                }
            }
            AbstractC5318g.C5319a aVar = new AbstractC5318g.C5319a(nVar, new C8284q(iVar.f9896c), iOException, i);
            long b = C11214d.this.f25015m.mo29488b(aVar);
            if (b != -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (C11214d.this.m10471J(this.f25028k, b) || !z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2) {
                z3 |= m10449f(b);
            }
            if (z3) {
                long a = C11214d.this.f25015m.mo29489a(aVar);
                if (a != -9223372036854775807L) {
                    cVar = C5320h.m29479h(false, a);
                } else {
                    cVar = C5320h.f9877g;
                }
            } else {
                cVar = C5320h.f9876f;
            }
            boolean z5 = !cVar.m29470c();
            C11214d.this.f25019q.m20230x(nVar, iVar.f9896c, iOException, z5);
            if (z5) {
                C11214d.this.f25015m.mo29486d(iVar.f9894a);
            }
            return cVar;
        }

        /* renamed from: v */
        public void m10433v() {
            this.f25029l.m29475l();
        }
    }

    public C11214d(AbstractC10738g gVar, AbstractC5318g gVar2, AbstractC11231j jVar) {
        this(gVar, gVar2, jVar, 3.5d);
    }

    /* renamed from: A */
    private void m10480A(List<Uri> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = list.get(i);
            this.f25016n.put(uri, new C11215a(uri));
        }
    }

    /* renamed from: B */
    private static C11220g.C11224d m10479B(C11220g gVar, C11220g gVar2) {
        int i = (int) (gVar2.f25067i - gVar.f25067i);
        List<C11220g.C11224d> list = gVar.f25074p;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public C11220g m10478C(C11220g gVar, C11220g gVar2) {
        if (gVar2.m10421f(gVar)) {
            return gVar2.m10424c(m10476E(gVar, gVar2), m10477D(gVar, gVar2));
        }
        if (gVar2.f25071m) {
            return gVar.m10423d();
        }
        return gVar;
    }

    /* renamed from: D */
    private int m10477D(C11220g gVar, C11220g gVar2) {
        int i;
        if (gVar2.f25065g) {
            return gVar2.f25066h;
        }
        C11220g gVar3 = this.f25025w;
        if (gVar3 != null) {
            i = gVar3.f25066h;
        } else {
            i = 0;
        }
        if (gVar == null) {
            return i;
        }
        C11220g.C11224d B = m10479B(gVar, gVar2);
        if (B != null) {
            return (gVar.f25066h + B.f25089n) - gVar2.f25074p.get(0).f25089n;
        }
        return i;
    }

    /* renamed from: E */
    private long m10476E(C11220g gVar, C11220g gVar2) {
        long j;
        if (gVar2.f25072n) {
            return gVar2.f25064f;
        }
        C11220g gVar3 = this.f25025w;
        if (gVar3 != null) {
            j = gVar3.f25064f;
        } else {
            j = 0;
        }
        if (gVar == null) {
            return j;
        }
        int size = gVar.f25074p.size();
        C11220g.C11224d B = m10479B(gVar, gVar2);
        if (B != null) {
            return gVar.f25064f + B.f25090o;
        }
        if (size == gVar2.f25067i - gVar.f25067i) {
            return gVar.m10422e();
        }
        return j;
    }

    /* renamed from: F */
    private Uri m10475F(Uri uri) {
        C11220g.C11223c cVar;
        C11220g gVar = this.f25025w;
        if (gVar == null || !gVar.f25078t.f25101e || (cVar = gVar.f25076r.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f25082b));
        int i = cVar.f25083c;
        if (i != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return buildUpon.build();
    }

    /* renamed from: G */
    private boolean m10474G(Uri uri) {
        List<C11217f.C11219b> list = this.f25023u.f25043e;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(list.get(i).f25056a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public boolean m10473H() {
        List<C11217f.C11219b> list = this.f25023u.f25043e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C11215a aVar = (C11215a) C7510a.m22367e(this.f25016n.get(list.get(i).f25056a));
            if (elapsedRealtime > aVar.f25035r) {
                Uri uri = aVar.f25028k;
                this.f25024v = uri;
                aVar.m10439p(m10475F(uri));
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    private void m10472I(Uri uri) {
        if (!uri.equals(this.f25024v) && m10474G(uri)) {
            C11220g gVar = this.f25025w;
            if (gVar == null || !gVar.f25071m) {
                this.f25024v = uri;
                this.f25016n.get(uri).m10439p(m10475F(uri));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public boolean m10471J(Uri uri, long j) {
        int size = this.f25017o.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z |= !this.f25017o.get(i).mo10373k(uri, j);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public void m10467N(Uri uri, C11220g gVar) {
        if (uri.equals(this.f25024v)) {
            if (this.f25025w == null) {
                this.f25026x = !gVar.f25071m;
                this.f25027y = gVar.f25064f;
            }
            this.f25025w = gVar;
            this.f25022t.mo10372a(gVar);
        }
        int size = this.f25017o.size();
        for (int i = 0; i < size; i++) {
            this.f25017o.get(i).mo10374e();
        }
    }

    /* renamed from: K */
    public void mo10446i(C5328i<AbstractC11227h> iVar, long j, long j2, boolean z) {
        C8273n nVar = new C8273n(iVar.f9894a, iVar.f9895b, iVar.m29460f(), iVar.m29462d(), j, j2, iVar.m29463b());
        this.f25015m.mo29486d(iVar.f9894a);
        this.f25019q.m20237q(nVar, 4);
    }

    /* renamed from: L */
    public void mo10444k(C5328i<AbstractC11227h> iVar, long j, long j2) {
        C11217f fVar;
        AbstractC11227h e = iVar.m29461e();
        boolean z = e instanceof C11220g;
        if (z) {
            fVar = C11217f.m10429e(e.f25102a);
        } else {
            fVar = (C11217f) e;
        }
        this.f25023u = fVar;
        this.f25024v = fVar.f25043e.get(0).f25056a;
        m10480A(fVar.f25042d);
        C8273n nVar = new C8273n(iVar.f9894a, iVar.f9895b, iVar.m29460f(), iVar.m29462d(), j, j2, iVar.m29463b());
        C11215a aVar = this.f25016n.get(this.f25024v);
        if (z) {
            aVar.m10434u((C11220g) e, nVar);
        } else {
            aVar.m10442m();
        }
        this.f25015m.mo29486d(iVar.f9894a);
        this.f25019q.m20234t(nVar, 4);
    }

    /* renamed from: M */
    public C5320h.C5323c mo10440o(C5328i<AbstractC11227h> iVar, long j, long j2, IOException iOException, int i) {
        boolean z;
        C8273n nVar = new C8273n(iVar.f9894a, iVar.f9895b, iVar.m29460f(), iVar.m29462d(), j, j2, iVar.m29463b());
        long a = this.f25015m.mo29489a(new AbstractC5318g.C5319a(nVar, new C8284q(iVar.f9896c), iOException, i));
        if (a == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        this.f25019q.m20230x(nVar, iVar.f9896c, iOException, z);
        if (z) {
            this.f25015m.mo29486d(iVar.f9894a);
        }
        if (z) {
            return C5320h.f9877g;
        }
        return C5320h.m29479h(false, a);
    }

    @Override // p260o8.AbstractC11232k
    /* renamed from: a */
    public void mo10386a(AbstractC11232k.AbstractC11234b bVar) {
        C7510a.m22367e(bVar);
        this.f25017o.add(bVar);
    }

    @Override // p260o8.AbstractC11232k
    /* renamed from: b */
    public void mo10385b(Uri uri) {
        this.f25016n.get(uri).m10438q();
    }

    @Override // p260o8.AbstractC11232k
    /* renamed from: c */
    public long mo10384c() {
        return this.f25027y;
    }

    @Override // p260o8.AbstractC11232k
    /* renamed from: d */
    public C11217f mo10383d() {
        return this.f25023u;
    }

    @Override // p260o8.AbstractC11232k
    /* renamed from: e */
    public void mo10382e(Uri uri) {
        this.f25016n.get(uri).m10442m();
    }

    @Override // p260o8.AbstractC11232k
    /* renamed from: f */
    public boolean mo10381f(Uri uri) {
        return this.f25016n.get(uri).m10445j();
    }

    @Override // p260o8.AbstractC11232k
    /* renamed from: g */
    public void mo10380g(AbstractC11232k.AbstractC11234b bVar) {
        this.f25017o.remove(bVar);
    }

    @Override // p260o8.AbstractC11232k
    /* renamed from: h */
    public boolean mo10379h() {
        return this.f25026x;
    }

    @Override // p260o8.AbstractC11232k
    /* renamed from: j */
    public void mo10378j() {
        C5320h hVar = this.f25020r;
        if (hVar != null) {
            hVar.mo24321a();
        }
        Uri uri = this.f25024v;
        if (uri != null) {
            mo10385b(uri);
        }
    }

    @Override // p260o8.AbstractC11232k
    /* renamed from: l */
    public C11220g mo10377l(Uri uri, boolean z) {
        C11220g h = this.f25016n.get(uri).m10447h();
        if (h != null && z) {
            m10472I(uri);
        }
        return h;
    }

    @Override // p260o8.AbstractC11232k
    /* renamed from: m */
    public void mo10376m(Uri uri, AbstractC8233b0.C8234a aVar, AbstractC11232k.AbstractC11237e eVar) {
        boolean z;
        this.f25021s = C7557q0.m22117x();
        this.f25019q = aVar;
        this.f25022t = eVar;
        C5328i iVar = new C5328i(this.f25013k.mo12499a(4), uri, 4, this.f25014l.mo10388a());
        if (this.f25020r == null) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        C5320h hVar = new C5320h("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f25020r = hVar;
        aVar.m20228z(new C8273n(iVar.f9894a, iVar.f9895b, hVar.m29473n(iVar, this, this.f25015m.mo29487c(iVar.f9896c))), iVar.f9896c);
    }

    @Override // p260o8.AbstractC11232k
    public void stop() {
        this.f25024v = null;
        this.f25025w = null;
        this.f25023u = null;
        this.f25027y = -9223372036854775807L;
        this.f25020r.m29475l();
        this.f25020r = null;
        for (C11215a aVar : this.f25016n.values()) {
            aVar.m10433v();
        }
        this.f25021s.removeCallbacksAndMessages(null);
        this.f25021s = null;
        this.f25016n.clear();
    }

    public C11214d(AbstractC10738g gVar, AbstractC5318g gVar2, AbstractC11231j jVar, double d) {
        this.f25013k = gVar;
        this.f25014l = jVar;
        this.f25015m = gVar2;
        this.f25018p = d;
        this.f25017o = new ArrayList();
        this.f25016n = new HashMap<>();
        this.f25027y = -9223372036854775807L;
    }
}
