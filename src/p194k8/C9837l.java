package p194k8;

import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.DataSource;
import p079e7.C6722k;
import p081e9.C6793v;
import p119g9.C7557q0;
import p194k8.AbstractC9828f;
import p228m7.C10511f;

/* renamed from: k8.l */
/* loaded from: classes7.dex */
public final class C9837l extends AbstractC9827e {

    /* renamed from: j */
    private final AbstractC9828f f21927j;

    /* renamed from: k */
    private AbstractC9828f.AbstractC9829a f21928k;

    /* renamed from: l */
    private long f21929l;

    /* renamed from: m */
    private volatile boolean f21930m;

    public C9837l(DataSource dataSource, C5288a aVar, C6722k kVar, int i, Object obj, AbstractC9828f fVar) {
        super(dataSource, aVar, 2, kVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f21927j = fVar;
    }

    @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5325e
    /* renamed from: a */
    public void mo12497a() {
        if (this.f21929l == 0) {
            this.f21927j.mo15251b(this.f21928k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C5288a e = this.f21888b.m29625e(this.f21929l);
            C6793v vVar = this.f21895i;
            C10511f fVar = new C10511f(vVar, e.f9752g, vVar.mo12542b(e));
            while (!this.f21930m && this.f21927j.mo15252a(fVar)) {
            }
            this.f21929l = fVar.getPosition() - this.f21888b.f9752g;
        } finally {
            C7557q0.m22137n(this.f21895i);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5325e
    /* renamed from: c */
    public void mo12496c() {
        this.f21930m = true;
    }

    /* renamed from: g */
    public void m15206g(AbstractC9828f.AbstractC9829a aVar) {
        this.f21928k = aVar;
    }
}
