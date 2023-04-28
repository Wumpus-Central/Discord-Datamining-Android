package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.smoothstreaming.AbstractC5248b;
import com.google.android.exoplayer2.source.smoothstreaming.C5246a;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.upstream.AbstractC5318g;
import com.google.android.exoplayer2.upstream.C5309d;
import com.google.android.exoplayer2.upstream.C5320h;
import com.google.android.exoplayer2.upstream.C5328i;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p079e7.C6713c;
import p079e7.C6720i;
import p081e9.AbstractC6765b;
import p081e9.AbstractC6790t;
import p081e9.AbstractC6795x;
import p119g9.C7510a;
import p119g9.C7557q0;
import p132h8.C7936b;
import p132h8.C7937c;
import p153i8.AbstractC8230a;
import p153i8.AbstractC8233b0;
import p153i8.AbstractC8236c0;
import p153i8.AbstractC8252h;
import p153i8.AbstractC8287r;
import p153i8.AbstractC8299u;
import p153i8.C8254i;
import p153i8.C8273n;
import p153i8.C8284q;
import p153i8.C8289r0;
import p193k7.AbstractC9818x;
import p193k7.AbstractC9820y;
import p193k7.C9796k;
import p297q8.C12041a;
import p297q8.C12043b;

/* loaded from: classes7.dex */
public final class SsMediaSource extends AbstractC8230a implements C5320h.AbstractC5322b<C5328i<C12041a>> {

    /* renamed from: A */
    private final AbstractC8233b0.C8234a f37286A;

    /* renamed from: B */
    private final C5328i.AbstractC5329a<? extends C12041a> f37287B;

    /* renamed from: C */
    private final ArrayList<C5250c> f37288C;

    /* renamed from: D */
    private DataSource f37289D;

    /* renamed from: E */
    private C5320h f37290E;

    /* renamed from: F */
    private AbstractC6790t f37291F;

    /* renamed from: G */
    private AbstractC6795x f37292G;

    /* renamed from: H */
    private long f37293H;

    /* renamed from: I */
    private C12041a f37294I;

    /* renamed from: J */
    private Handler f37295J;

    /* renamed from: q */
    private final boolean f9498q;

    /* renamed from: r */
    private final Uri f9499r;

    /* renamed from: s */
    private final MediaItem.C5151g f9500s;

    /* renamed from: t */
    private final MediaItem f9501t;

    /* renamed from: u */
    private final DataSource.Factory f9502u;

    /* renamed from: v */
    private final AbstractC5248b.AbstractC5249a f9503v;

    /* renamed from: w */
    private final AbstractC8252h f9504w;

    /* renamed from: x */
    private final AbstractC9818x f9505x;

    /* renamed from: y */
    private final AbstractC5318g f9506y;

    /* renamed from: z */
    private final long f9507z;

    /* loaded from: classes7.dex */
    public static final class Factory implements AbstractC8236c0 {

        /* renamed from: a */
        private final AbstractC5248b.AbstractC5249a f9508a;

        /* renamed from: b */
        private final DataSource.Factory f9509b;

        /* renamed from: c */
        private AbstractC8252h f9510c;

        /* renamed from: d */
        private boolean f9511d;

        /* renamed from: e */
        private AbstractC9820y f9512e;

        /* renamed from: f */
        private AbstractC5318g f9513f;

        /* renamed from: g */
        private long f9514g;

        /* renamed from: h */
        private C5328i.AbstractC5329a<? extends C12041a> f9515h;

        /* renamed from: i */
        private List<C7937c> f9516i;

        /* renamed from: j */
        private Object f9517j;

        public Factory(DataSource.Factory factory) {
            this(new C5246a.C0142a(factory), factory);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ AbstractC9818x m29845d(AbstractC9818x xVar, MediaItem mediaItem) {
            return xVar;
        }

        @Deprecated
        /* renamed from: b */
        public SsMediaSource m29847b(Uri uri) {
            return m29846c(new MediaItem.C5147c().m30543i(uri).m30551a());
        }

        /* renamed from: c */
        public SsMediaSource m29846c(MediaItem mediaItem) {
            List<C7937c> list;
            C7936b bVar;
            boolean z;
            MediaItem mediaItem2 = mediaItem;
            C7510a.m22367e(mediaItem2.f8963b);
            C5328i.AbstractC5329a aVar = this.f9515h;
            if (aVar == null) {
                aVar = new C12043b();
            }
            if (!mediaItem2.f8963b.f9018e.isEmpty()) {
                list = mediaItem2.f8963b.f9018e;
            } else {
                list = this.f9516i;
            }
            if (!list.isEmpty()) {
                bVar = new C7936b(aVar, list);
            } else {
                bVar = aVar;
            }
            MediaItem.C5151g gVar = mediaItem2.f8963b;
            boolean z2 = true;
            if (gVar.f9021h != null || this.f9517j == null) {
                z = false;
            } else {
                z = true;
            }
            if (!gVar.f9018e.isEmpty() || list.isEmpty()) {
                z2 = false;
            }
            if (z && z2) {
                mediaItem2 = mediaItem.m30553a().m30544h(this.f9517j).m30546f(list).m30551a();
            } else if (z) {
                mediaItem2 = mediaItem.m30553a().m30544h(this.f9517j).m30551a();
            } else if (z2) {
                mediaItem2 = mediaItem.m30553a().m30546f(list).m30551a();
            }
            return new SsMediaSource(mediaItem2, null, this.f9509b, bVar, this.f9508a, this.f9510c, this.f9512e.mo9295a(mediaItem2), this.f9513f, this.f9514g);
        }

        /* renamed from: e */
        public Factory m29844e(final AbstractC9818x xVar) {
            if (xVar == null) {
                m29843f(null);
            } else {
                m29843f(new AbstractC9820y() { // from class: p8.b
                    @Override // p193k7.AbstractC9820y
                    /* renamed from: a */
                    public final AbstractC9818x mo9295a(MediaItem mediaItem) {
                        AbstractC9818x d;
                        d = SsMediaSource.Factory.m29845d(AbstractC9818x.this, mediaItem);
                        return d;
                    }
                });
            }
            return this;
        }

        /* renamed from: f */
        public Factory m29843f(AbstractC9820y yVar) {
            if (yVar != null) {
                this.f9512e = yVar;
                this.f9511d = true;
            } else {
                this.f9512e = new C9796k();
                this.f9511d = false;
            }
            return this;
        }

        /* renamed from: g */
        public Factory m29842g(AbstractC5318g gVar) {
            if (gVar == null) {
                gVar = new C5309d();
            }
            this.f9513f = gVar;
            return this;
        }

        public Factory(AbstractC5248b.AbstractC5249a aVar, DataSource.Factory factory) {
            this.f9508a = (AbstractC5248b.AbstractC5249a) C7510a.m22367e(aVar);
            this.f9509b = factory;
            this.f9512e = new C9796k();
            this.f9513f = new C5309d();
            this.f9514g = 30000L;
            this.f9510c = new C8254i();
            this.f9516i = Collections.emptyList();
        }
    }

    static {
        C6720i.m24534a("goog.exo.smoothstreaming");
    }

    /* renamed from: H */
    private void m29851H() {
        C12041a.C12042b[] bVarArr;
        C8289r0 r0Var;
        long j;
        long j2;
        for (int i = 0; i < this.f37288C.size(); i++) {
            this.f37288C.get(i).m29831w(this.f37294I);
        }
        long j3 = Long.MIN_VALUE;
        long j4 = Long.MAX_VALUE;
        for (C12041a.C12042b bVar : this.f37294I.f27028f) {
            if (bVar.f27044k > 0) {
                j4 = Math.min(j4, bVar.m7922e(0));
                j3 = Math.max(j3, bVar.m7922e(bVar.f27044k - 1) + bVar.m7924c(bVar.f27044k - 1));
            }
        }
        if (j4 == Long.MAX_VALUE) {
            if (this.f37294I.f27026d) {
                j2 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            C12041a aVar = this.f37294I;
            boolean z = aVar.f27026d;
            r0Var = new C8289r0(j2, 0L, 0L, 0L, true, z, z, aVar, this.f9501t);
        } else {
            C12041a aVar2 = this.f37294I;
            if (aVar2.f27026d) {
                long j5 = aVar2.f27030h;
                if (j5 != -9223372036854775807L && j5 > 0) {
                    j4 = Math.max(j4, j3 - j5);
                }
                long j6 = j3 - j4;
                long c = j6 - C6713c.m24566c(this.f9507z);
                if (c < 5000000) {
                    c = Math.min(5000000L, j6 / 2);
                }
                r0Var = new C8289r0(-9223372036854775807L, j6, j4, c, true, true, true, this.f37294I, this.f9501t);
            } else {
                long j7 = aVar2.f27029g;
                if (j7 != -9223372036854775807L) {
                    j = j7;
                } else {
                    j = j3 - j4;
                }
                r0Var = new C8289r0(j4 + j, j, j4, 0L, true, false, false, this.f37294I, this.f9501t);
            }
        }
        m20266B(r0Var);
    }

    /* renamed from: I */
    private void m29850I() {
        if (this.f37294I.f27026d) {
            this.f37295J.postDelayed(new Runnable() { // from class: p8.a
                @Override // java.lang.Runnable
                public final void run() {
                    SsMediaSource.this.m29849J();
                }
            }, Math.max(0L, (this.f37293H + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public void m29849J() {
        if (!this.f37290E.m29478i()) {
            C5328i iVar = new C5328i(this.f37289D, this.f9499r, 4, this.f37287B);
            this.f37286A.m20228z(new C8273n(iVar.f9894a, iVar.f9895b, this.f37290E.m29473n(iVar, this, this.f9506y.mo29487c(iVar.f9896c))), iVar.f9896c);
        }
    }

    @Override // p153i8.AbstractC8230a
    /* renamed from: A */
    protected void mo20008A(AbstractC6795x xVar) {
        this.f37292G = xVar;
        this.f9505x.mo15275c();
        if (this.f9498q) {
            this.f37291F = new AbstractC6790t.C6791a();
            m29851H();
            return;
        }
        this.f37289D = this.f9502u.createDataSource();
        C5320h hVar = new C5320h("Loader:Manifest");
        this.f37290E = hVar;
        this.f37291F = hVar;
        this.f37295J = C7557q0.m22117x();
        m29849J();
    }

    @Override // p153i8.AbstractC8230a
    /* renamed from: C */
    protected void mo20007C() {
        C12041a aVar;
        if (this.f9498q) {
            aVar = this.f37294I;
        } else {
            aVar = null;
        }
        this.f37294I = aVar;
        this.f37289D = null;
        this.f37293H = 0L;
        C5320h hVar = this.f37290E;
        if (hVar != null) {
            hVar.m29475l();
            this.f37290E = null;
        }
        Handler handler = this.f37295J;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f37295J = null;
        }
        this.f9505x.release();
    }

    /* renamed from: E */
    public void mo10446i(C5328i<C12041a> iVar, long j, long j2, boolean z) {
        C8273n nVar = new C8273n(iVar.f9894a, iVar.f9895b, iVar.m29460f(), iVar.m29462d(), j, j2, iVar.m29463b());
        this.f9506y.mo29486d(iVar.f9894a);
        this.f37286A.m20237q(nVar, iVar.f9896c);
    }

    /* renamed from: F */
    public void mo10444k(C5328i<C12041a> iVar, long j, long j2) {
        C8273n nVar = new C8273n(iVar.f9894a, iVar.f9895b, iVar.m29460f(), iVar.m29462d(), j, j2, iVar.m29463b());
        this.f9506y.mo29486d(iVar.f9894a);
        this.f37286A.m20234t(nVar, iVar.f9896c);
        this.f37294I = iVar.m29461e();
        this.f37293H = j - j2;
        m29851H();
        m29850I();
    }

    /* renamed from: G */
    public C5320h.C5323c mo10440o(C5328i<C12041a> iVar, long j, long j2, IOException iOException, int i) {
        C5320h.C5323c cVar;
        C8273n nVar = new C8273n(iVar.f9894a, iVar.f9895b, iVar.m29460f(), iVar.m29462d(), j, j2, iVar.m29463b());
        long a = this.f9506y.mo29489a(new AbstractC5318g.C5319a(nVar, new C8284q(iVar.f9896c), iOException, i));
        if (a == -9223372036854775807L) {
            cVar = C5320h.f9877g;
        } else {
            cVar = C5320h.m29479h(false, a);
        }
        boolean z = !cVar.m29470c();
        this.f37286A.m20230x(nVar, iVar.f9896c, iOException, z);
        if (z) {
            this.f9506y.mo29486d(iVar.f9894a);
        }
        return cVar;
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: c */
    public MediaItem mo20004c() {
        return this.f9501t;
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: l */
    public void mo19998l(AbstractC8287r rVar) {
        ((C5250c) rVar).m29832v();
        this.f37288C.remove(rVar);
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: m */
    public AbstractC8287r mo19997m(AbstractC8299u.C8300a aVar, AbstractC6765b bVar, long j) {
        AbstractC8233b0.C8234a v = m20262v(aVar);
        C5250c cVar = new C5250c(this.f37294I, this.f9503v, this.f37292G, this.f9504w, this.f9505x, m20264t(aVar), this.f9506y, v, this.f37291F, bVar);
        this.f37288C.add(cVar);
        return cVar;
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: n */
    public void mo19996n() {
        this.f37291F.mo24321a();
    }

    private SsMediaSource(MediaItem mediaItem, C12041a aVar, DataSource.Factory factory, C5328i.AbstractC5329a<? extends C12041a> aVar2, AbstractC5248b.AbstractC5249a aVar3, AbstractC8252h hVar, AbstractC9818x xVar, AbstractC5318g gVar, long j) {
        boolean z = false;
        C7510a.m22366f(aVar == null || !aVar.f27026d);
        this.f9501t = mediaItem;
        MediaItem.C5151g gVar2 = (MediaItem.C5151g) C7510a.m22367e(mediaItem.f8963b);
        this.f9500s = gVar2;
        this.f37294I = aVar;
        this.f9499r = gVar2.f9014a.equals(Uri.EMPTY) ? null : C7557q0.m22211C(gVar2.f9014a);
        this.f9502u = factory;
        this.f37287B = aVar2;
        this.f9503v = aVar3;
        this.f9504w = hVar;
        this.f9505x = xVar;
        this.f9506y = gVar;
        this.f9507z = j;
        this.f37286A = m20262v(null);
        this.f9498q = aVar != null ? true : z;
        this.f37288C = new ArrayList<>();
    }
}
