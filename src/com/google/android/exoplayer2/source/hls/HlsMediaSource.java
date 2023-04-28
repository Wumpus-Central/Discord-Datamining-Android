package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.upstream.AbstractC5318g;
import com.google.android.exoplayer2.upstream.C5309d;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.Collections;
import java.util.List;
import p079e7.C6713c;
import p079e7.C6720i;
import p081e9.AbstractC6765b;
import p081e9.AbstractC6795x;
import p119g9.C7510a;
import p119g9.C7557q0;
import p132h8.C7937c;
import p153i8.AbstractC8230a;
import p153i8.AbstractC8233b0;
import p153i8.AbstractC8236c0;
import p153i8.AbstractC8252h;
import p153i8.AbstractC8287r;
import p153i8.AbstractC8299u;
import p153i8.C8254i;
import p153i8.C8289r0;
import p193k7.AbstractC9818x;
import p193k7.AbstractC9820y;
import p193k7.C9796k;
import p244n8.AbstractC10738g;
import p244n8.AbstractC10739h;
import p244n8.C10728c;
import p244n8.C10742k;
import p260o8.AbstractC11231j;
import p260o8.AbstractC11232k;
import p260o8.C11211a;
import p260o8.C11214d;
import p260o8.C11216e;
import p260o8.C11217f;
import p260o8.C11220g;

/* loaded from: classes7.dex */
public final class HlsMediaSource extends AbstractC8230a implements AbstractC11232k.AbstractC11237e {

    /* renamed from: A */
    private final long f37282A;

    /* renamed from: B */
    private final MediaItem f37283B;

    /* renamed from: C */
    private MediaItem.C5150f f37284C;

    /* renamed from: D */
    private AbstractC6795x f37285D;

    /* renamed from: q */
    private final AbstractC10739h f9472q;

    /* renamed from: r */
    private final MediaItem.C5151g f9473r;

    /* renamed from: s */
    private final AbstractC10738g f9474s;

    /* renamed from: t */
    private final AbstractC8252h f9475t;

    /* renamed from: u */
    private final AbstractC9818x f9476u;

    /* renamed from: v */
    private final AbstractC5318g f9477v;

    /* renamed from: w */
    private final boolean f9478w;

    /* renamed from: x */
    private final int f9479x;

    /* renamed from: y */
    private final boolean f9480y;

    /* renamed from: z */
    private final AbstractC11232k f9481z;

    /* loaded from: classes7.dex */
    public static final class Factory implements AbstractC8236c0 {

        /* renamed from: a */
        private final AbstractC10738g f9482a;

        /* renamed from: b */
        private AbstractC10739h f9483b;

        /* renamed from: c */
        private AbstractC11231j f9484c;

        /* renamed from: d */
        private AbstractC11232k.AbstractC11233a f9485d;

        /* renamed from: e */
        private AbstractC8252h f9486e;

        /* renamed from: f */
        private boolean f9487f;

        /* renamed from: g */
        private AbstractC9820y f9488g;

        /* renamed from: h */
        private AbstractC5318g f9489h;

        /* renamed from: i */
        private boolean f9490i;

        /* renamed from: j */
        private int f9491j;

        /* renamed from: k */
        private boolean f9492k;

        /* renamed from: l */
        private List<C7937c> f9493l;

        /* renamed from: m */
        private Object f9494m;

        /* renamed from: n */
        private long f9495n;

        public Factory(DataSource.Factory factory) {
            this(new C10728c(factory));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ AbstractC9818x m29859d(AbstractC9818x xVar, MediaItem mediaItem) {
            return xVar;
        }

        @Deprecated
        /* renamed from: b */
        public HlsMediaSource m29861b(Uri uri) {
            return m29860c(new MediaItem.C5147c().m30543i(uri).m30547e("application/x-mpegURL").m30551a());
        }

        /* renamed from: c */
        public HlsMediaSource m29860c(MediaItem mediaItem) {
            List<C7937c> list;
            boolean z;
            MediaItem mediaItem2 = mediaItem;
            C7510a.m22367e(mediaItem2.f8963b);
            AbstractC11231j jVar = this.f9484c;
            if (mediaItem2.f8963b.f9018e.isEmpty()) {
                list = this.f9493l;
            } else {
                list = mediaItem2.f8963b.f9018e;
            }
            if (!list.isEmpty()) {
                jVar = new C11216e(jVar, list);
            }
            MediaItem.C5151g gVar = mediaItem2.f8963b;
            boolean z2 = true;
            if (gVar.f9021h != null || this.f9494m == null) {
                z = false;
            } else {
                z = true;
            }
            if (!gVar.f9018e.isEmpty() || list.isEmpty()) {
                z2 = false;
            }
            if (z && z2) {
                mediaItem2 = mediaItem.m30553a().m30544h(this.f9494m).m30546f(list).m30551a();
            } else if (z) {
                mediaItem2 = mediaItem.m30553a().m30544h(this.f9494m).m30551a();
            } else if (z2) {
                mediaItem2 = mediaItem.m30553a().m30546f(list).m30551a();
            }
            AbstractC10738g gVar2 = this.f9482a;
            AbstractC10739h hVar = this.f9483b;
            AbstractC8252h hVar2 = this.f9486e;
            AbstractC9818x a = this.f9488g.mo9295a(mediaItem2);
            AbstractC5318g gVar3 = this.f9489h;
            return new HlsMediaSource(mediaItem2, gVar2, hVar, hVar2, a, gVar3, this.f9485d.mo10375a(this.f9482a, gVar3, jVar), this.f9495n, this.f9490i, this.f9491j, this.f9492k);
        }

        /* renamed from: e */
        public Factory m29858e(final AbstractC9818x xVar) {
            if (xVar == null) {
                m29857f(null);
            } else {
                m29857f(new AbstractC9820y() { // from class: n8.l
                    @Override // p193k7.AbstractC9820y
                    /* renamed from: a */
                    public final AbstractC9818x mo9295a(MediaItem mediaItem) {
                        AbstractC9818x d;
                        d = HlsMediaSource.Factory.m29859d(AbstractC9818x.this, mediaItem);
                        return d;
                    }
                });
            }
            return this;
        }

        /* renamed from: f */
        public Factory m29857f(AbstractC9820y yVar) {
            if (yVar != null) {
                this.f9488g = yVar;
                this.f9487f = true;
            } else {
                this.f9488g = new C9796k();
                this.f9487f = false;
            }
            return this;
        }

        /* renamed from: g */
        public Factory m29856g(AbstractC5318g gVar) {
            if (gVar == null) {
                gVar = new C5309d();
            }
            this.f9489h = gVar;
            return this;
        }

        public Factory(AbstractC10738g gVar) {
            this.f9482a = (AbstractC10738g) C7510a.m22367e(gVar);
            this.f9488g = new C9796k();
            this.f9484c = new C11211a();
            this.f9485d = C11214d.f25012z;
            this.f9483b = AbstractC10739h.f23828a;
            this.f9489h = new C5309d();
            this.f9486e = new C8254i();
            this.f9491j = 1;
            this.f9493l = Collections.emptyList();
            this.f9495n = -9223372036854775807L;
        }
    }

    static {
        C6720i.m24534a("goog.exo.hls");
    }

    /* renamed from: D */
    private long m29866D(C11220g gVar) {
        if (gVar.f25072n) {
            return C6713c.m24566c(C7557q0.m22165Z(this.f37282A)) - gVar.m10422e();
        }
        return 0L;
    }

    /* renamed from: E */
    private static long m29865E(C11220g gVar, long j) {
        long j2;
        C11220g.C11226f fVar = gVar.f25078t;
        long j3 = gVar.f25063e;
        if (j3 != -9223372036854775807L) {
            j2 = gVar.f25077s - j3;
        } else {
            long j4 = fVar.f25100d;
            if (j4 == -9223372036854775807L || gVar.f25070l == -9223372036854775807L) {
                long j5 = fVar.f25099c;
                if (j5 != -9223372036854775807L) {
                    j2 = j5;
                } else {
                    j2 = gVar.f25069k * 3;
                }
            } else {
                j2 = j4;
            }
        }
        return j2 + j;
    }

    /* renamed from: F */
    private long m29864F(C11220g gVar, long j) {
        List<C11220g.C11224d> list = gVar.f25074p;
        int size = list.size() - 1;
        long c = (gVar.f25077s + j) - C6713c.m24566c(this.f37284C.f9009a);
        while (size > 0 && list.get(size).f25090o > c) {
            size--;
        }
        return list.get(size).f25090o;
    }

    /* renamed from: G */
    private void m29863G(long j) {
        long d = C6713c.m24565d(j);
        if (d != this.f37284C.f9009a) {
            this.f37284C = this.f37283B.m30553a().m30549c(d).m30551a().f8964c;
        }
    }

    @Override // p153i8.AbstractC8230a
    /* renamed from: A */
    protected void mo20008A(AbstractC6795x xVar) {
        this.f37285D = xVar;
        this.f9476u.mo15275c();
        this.f9481z.mo10376m(this.f9473r.f9014a, m20262v(null), this);
    }

    @Override // p153i8.AbstractC8230a
    /* renamed from: C */
    protected void mo20007C() {
        this.f9481z.stop();
        this.f9476u.release();
    }

    @Override // p260o8.AbstractC11232k.AbstractC11237e
    /* renamed from: a */
    public void mo10372a(C11220g gVar) {
        long j;
        long j2;
        C8289r0 r0Var;
        long j3;
        long j4;
        long j5;
        long j6;
        if (gVar.f25072n) {
            j = C6713c.m24565d(gVar.f25064f);
        } else {
            j = -9223372036854775807L;
        }
        int i = gVar.f25062d;
        if (i == 2 || i == 1) {
            j2 = j;
        } else {
            j2 = -9223372036854775807L;
        }
        long j7 = gVar.f25063e;
        C5244a aVar = new C5244a((C11217f) C7510a.m22367e(this.f9481z.mo10383d()), gVar);
        if (this.f9481z.mo10379h()) {
            long D = m29866D(gVar);
            long j8 = this.f37284C.f9009a;
            if (j8 != -9223372036854775807L) {
                j4 = C6713c.m24566c(j8);
            } else {
                j4 = m29865E(gVar, D);
            }
            m29863G(C7557q0.m22127s(j4, D, gVar.f25077s + D));
            long c = gVar.f25064f - this.f9481z.mo10384c();
            if (gVar.f25071m) {
                j5 = c + gVar.f25077s;
            } else {
                j5 = -9223372036854775807L;
            }
            if (!gVar.f25074p.isEmpty()) {
                j6 = m29864F(gVar, D);
            } else if (j7 == -9223372036854775807L) {
                j6 = 0;
            } else {
                j6 = j7;
            }
            r0Var = new C8289r0(j2, j, -9223372036854775807L, j5, gVar.f25077s, c, j6, true, !gVar.f25071m, aVar, this.f37283B, this.f37284C);
        } else {
            if (j7 == -9223372036854775807L) {
                j3 = 0;
            } else {
                j3 = j7;
            }
            long j9 = gVar.f25077s;
            r0Var = new C8289r0(j2, j, -9223372036854775807L, j9, j9, 0L, j3, true, false, aVar, this.f37283B, null);
        }
        m20266B(r0Var);
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: c */
    public MediaItem mo20004c() {
        return this.f37283B;
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: l */
    public void mo19998l(AbstractC8287r rVar) {
        ((C10742k) rVar).m12473B();
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: m */
    public AbstractC8287r mo19997m(AbstractC8299u.C8300a aVar, AbstractC6765b bVar, long j) {
        AbstractC8233b0.C8234a v = m20262v(aVar);
        return new C10742k(this.f9472q, this.f9481z, this.f9474s, this.f37285D, this.f9476u, m20264t(aVar), this.f9477v, v, bVar, this.f9475t, this.f9478w, this.f9479x, this.f9480y);
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: n */
    public void mo19996n() {
        this.f9481z.mo10378j();
    }

    private HlsMediaSource(MediaItem mediaItem, AbstractC10738g gVar, AbstractC10739h hVar, AbstractC8252h hVar2, AbstractC9818x xVar, AbstractC5318g gVar2, AbstractC11232k kVar, long j, boolean z, int i, boolean z2) {
        this.f9473r = (MediaItem.C5151g) C7510a.m22367e(mediaItem.f8963b);
        this.f37283B = mediaItem;
        this.f37284C = mediaItem.f8964c;
        this.f9474s = gVar;
        this.f9472q = hVar;
        this.f9475t = hVar2;
        this.f9476u = xVar;
        this.f9477v = gVar2;
        this.f9481z = kVar;
        this.f37282A = j;
        this.f9478w = z;
        this.f9479x = i;
        this.f9480y = z2;
    }
}
