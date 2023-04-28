package p153i8;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.AbstractC5318g;
import com.google.android.exoplayer2.upstream.C5309d;
import com.google.android.exoplayer2.upstream.DataSource;
import p081e9.AbstractC6765b;
import p081e9.AbstractC6795x;
import p119g9.C7510a;
import p153i8.AbstractC8299u;
import p153i8.C8257j0;
import p153i8.C8264k0;
import p193k7.AbstractC9818x;
import p193k7.AbstractC9820y;
import p193k7.C9796k;
import p228m7.AbstractC10521o;
import p228m7.C10512g;

/* renamed from: i8.k0 */
/* loaded from: classes7.dex */
public final class C8264k0 extends AbstractC8230a implements C8257j0.AbstractC8259b {

    /* renamed from: A */
    private boolean f38594A;

    /* renamed from: B */
    private AbstractC6795x f38595B;

    /* renamed from: q */
    private final MediaItem f17942q;

    /* renamed from: r */
    private final MediaItem.C5151g f17943r;

    /* renamed from: s */
    private final DataSource.Factory f17944s;

    /* renamed from: t */
    private final AbstractC10521o f17945t;

    /* renamed from: u */
    private final AbstractC9818x f17946u;

    /* renamed from: v */
    private final AbstractC5318g f17947v;

    /* renamed from: w */
    private final int f17948w;

    /* renamed from: x */
    private boolean f17949x = true;

    /* renamed from: y */
    private long f17950y = -9223372036854775807L;

    /* renamed from: z */
    private boolean f17951z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.k0$a */
    /* loaded from: classes7.dex */
    public class C8265a extends AbstractC8267l {
        C8265a(Timeline timeline) {
            super(timeline);
        }

        @Override // p153i8.AbstractC8267l, com.google.android.exoplayer2.Timeline
        /* renamed from: o */
        public Timeline.C5161c mo20023o(int i, Timeline.C5161c cVar, long j) {
            super.mo20023o(i, cVar, j);
            cVar.f9101l = true;
            return cVar;
        }
    }

    /* renamed from: i8.k0$b */
    /* loaded from: classes7.dex */
    public static final class C8266b implements AbstractC8236c0 {

        /* renamed from: a */
        private final DataSource.Factory f17953a;

        /* renamed from: b */
        private AbstractC10521o f17954b;

        /* renamed from: c */
        private boolean f17955c;

        /* renamed from: d */
        private AbstractC9820y f17956d;

        /* renamed from: e */
        private AbstractC5318g f17957e;

        /* renamed from: f */
        private int f17958f;

        /* renamed from: g */
        private String f17959g;

        /* renamed from: h */
        private Object f17960h;

        public C8266b(DataSource.Factory factory) {
            this(factory, new C10512g());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ AbstractC9818x m20137d(AbstractC9818x xVar, MediaItem mediaItem) {
            return xVar;
        }

        @Deprecated
        /* renamed from: b */
        public C8264k0 m20139b(Uri uri) {
            return m20138c(new MediaItem.C5147c().m30543i(uri).m30551a());
        }

        /* renamed from: c */
        public C8264k0 m20138c(MediaItem mediaItem) {
            boolean z;
            C7510a.m22367e(mediaItem.f8963b);
            MediaItem.C5151g gVar = mediaItem.f8963b;
            boolean z2 = true;
            if (gVar.f9021h != null || this.f17960h == null) {
                z = false;
            } else {
                z = true;
            }
            if (gVar.f9019f != null || this.f17959g == null) {
                z2 = false;
            }
            if (z && z2) {
                mediaItem = mediaItem.m30553a().m30544h(this.f17960h).m30550b(this.f17959g).m30551a();
            } else if (z) {
                mediaItem = mediaItem.m30553a().m30544h(this.f17960h).m30551a();
            } else if (z2) {
                mediaItem = mediaItem.m30553a().m30550b(this.f17959g).m30551a();
            }
            return new C8264k0(mediaItem, this.f17953a, this.f17954b, this.f17956d.mo9295a(mediaItem), this.f17957e, this.f17958f);
        }

        /* renamed from: e */
        public C8266b m20136e(final AbstractC9818x xVar) {
            if (xVar == null) {
                m20135f(null);
            } else {
                m20135f(new AbstractC9820y() { // from class: i8.l0
                    @Override // p193k7.AbstractC9820y
                    /* renamed from: a */
                    public final AbstractC9818x mo9295a(MediaItem mediaItem) {
                        AbstractC9818x d;
                        d = C8264k0.C8266b.m20137d(AbstractC9818x.this, mediaItem);
                        return d;
                    }
                });
            }
            return this;
        }

        /* renamed from: f */
        public C8266b m20135f(AbstractC9820y yVar) {
            if (yVar != null) {
                this.f17956d = yVar;
                this.f17955c = true;
            } else {
                this.f17956d = new C9796k();
                this.f17955c = false;
            }
            return this;
        }

        /* renamed from: g */
        public C8266b m20134g(AbstractC5318g gVar) {
            if (gVar == null) {
                gVar = new C5309d();
            }
            this.f17957e = gVar;
            return this;
        }

        public C8266b(DataSource.Factory factory, AbstractC10521o oVar) {
            this.f17953a = factory;
            this.f17954b = oVar;
            this.f17956d = new C9796k();
            this.f17957e = new C5309d();
            this.f17958f = 1048576;
        }
    }

    C8264k0(MediaItem mediaItem, DataSource.Factory factory, AbstractC10521o oVar, AbstractC9818x xVar, AbstractC5318g gVar, int i) {
        this.f17943r = (MediaItem.C5151g) C7510a.m22367e(mediaItem.f8963b);
        this.f17942q = mediaItem;
        this.f17944s = factory;
        this.f17945t = oVar;
        this.f17946u = xVar;
        this.f17947v = gVar;
        this.f17948w = i;
    }

    /* renamed from: D */
    private void m20142D() {
        Timeline r0Var = new C8289r0(this.f17950y, this.f17951z, false, this.f38594A, null, this.f17942q);
        if (this.f17949x) {
            r0Var = new C8265a(r0Var);
        }
        m20266B(r0Var);
    }

    @Override // p153i8.AbstractC8230a
    /* renamed from: A */
    protected void mo20008A(AbstractC6795x xVar) {
        this.f38595B = xVar;
        this.f17946u.mo15275c();
        m20142D();
    }

    @Override // p153i8.AbstractC8230a
    /* renamed from: C */
    protected void mo20007C() {
        this.f17946u.release();
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: c */
    public MediaItem mo20004c() {
        return this.f17942q;
    }

    @Override // p153i8.C8257j0.AbstractC8259b
    /* renamed from: j */
    public void mo20141j(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f17950y;
        }
        if (this.f17949x || this.f17950y != j || this.f17951z != z || this.f38594A != z2) {
            this.f17950y = j;
            this.f17951z = z;
            this.f38594A = z2;
            this.f17949x = false;
            m20142D();
        }
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: l */
    public void mo19998l(AbstractC8287r rVar) {
        ((C8257j0) rVar).m20162c0();
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: m */
    public AbstractC8287r mo19997m(AbstractC8299u.C8300a aVar, AbstractC6765b bVar, long j) {
        DataSource createDataSource = this.f17944s.createDataSource();
        AbstractC6795x xVar = this.f38595B;
        if (xVar != null) {
            createDataSource.mo12541c(xVar);
        }
        return new C8257j0(this.f17943r.f9014a, createDataSource, this.f17945t, this.f17946u, m20264t(aVar), this.f17947v, m20262v(aVar), this, bVar, this.f17943r.f9019f, this.f17948w);
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: n */
    public void mo19996n() {
    }
}
