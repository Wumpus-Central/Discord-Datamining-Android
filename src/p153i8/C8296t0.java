package p153i8;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.AbstractC5318g;
import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.C5309d;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.Collections;
import p079e7.C6722k;
import p081e9.AbstractC6765b;
import p081e9.AbstractC6795x;
import p119g9.C7510a;
import p153i8.AbstractC8299u;

/* renamed from: i8.t0 */
/* loaded from: classes7.dex */
public final class C8296t0 extends AbstractC8230a {

    /* renamed from: q */
    private final C5288a f18085q;

    /* renamed from: r */
    private final DataSource.Factory f18086r;

    /* renamed from: s */
    private final C6722k f18087s;

    /* renamed from: t */
    private final long f18088t;

    /* renamed from: u */
    private final AbstractC5318g f18089u;

    /* renamed from: v */
    private final boolean f18090v;

    /* renamed from: w */
    private final Timeline f18091w;

    /* renamed from: x */
    private final MediaItem f18092x;

    /* renamed from: y */
    private AbstractC6795x f18093y;

    /* renamed from: i8.t0$b */
    /* loaded from: classes7.dex */
    public static final class C8298b {

        /* renamed from: a */
        private final DataSource.Factory f18094a;

        /* renamed from: b */
        private AbstractC5318g f18095b = new C5309d();

        /* renamed from: c */
        private boolean f18096c = true;

        /* renamed from: d */
        private Object f18097d;

        /* renamed from: e */
        private String f18098e;

        public C8298b(DataSource.Factory factory) {
            this.f18094a = (DataSource.Factory) C7510a.m22367e(factory);
        }

        @Deprecated
        /* renamed from: a */
        public C8296t0 m20006a(Uri uri, C6722k kVar, long j) {
            String str = kVar.f14318k;
            if (str == null) {
                str = this.f18098e;
            }
            return new C8296t0(str, new MediaItem.C5152h(uri, (String) C7510a.m22367e(kVar.f14329v), kVar.f14320m, kVar.f14321n), this.f18094a, j, this.f18095b, this.f18096c, this.f18097d);
        }
    }

    @Override // p153i8.AbstractC8230a
    /* renamed from: A */
    protected void mo20008A(AbstractC6795x xVar) {
        this.f18093y = xVar;
        m20266B(this.f18091w);
    }

    @Override // p153i8.AbstractC8230a
    /* renamed from: C */
    protected void mo20007C() {
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: c */
    public MediaItem mo20004c() {
        return this.f18092x;
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: l */
    public void mo19998l(AbstractC8287r rVar) {
        ((C8291s0) rVar).m20015s();
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: m */
    public AbstractC8287r mo19997m(AbstractC8299u.C8300a aVar, AbstractC6765b bVar, long j) {
        return new C8291s0(this.f18085q, this.f18086r, this.f18093y, this.f18087s, this.f18088t, this.f18089u, m20262v(aVar), this.f18090v);
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: n */
    public void mo19996n() {
    }

    private C8296t0(String str, MediaItem.C5152h hVar, DataSource.Factory factory, long j, AbstractC5318g gVar, boolean z, Object obj) {
        this.f18086r = factory;
        this.f18088t = j;
        this.f18089u = gVar;
        this.f18090v = z;
        MediaItem a = new MediaItem.C5147c().m30543i(Uri.EMPTY).m30548d(hVar.f9022a.toString()).m30545g(Collections.singletonList(hVar)).m30544h(obj).m30551a();
        this.f18092x = a;
        this.f18087s = new C6722k.C6724b().m24505S(str).m24488e0(hVar.f9023b).m24502V(hVar.f9024c).m24484g0(hVar.f9025d).m24492c0(hVar.f9026e).m24503U(hVar.f9027f).m24519E();
        this.f18085q = new C5288a.C5289b().m29615i(hVar.f9022a).m29622b(1).m29623a();
        this.f18091w = new C8289r0(j, true, false, false, null, a);
    }
}
