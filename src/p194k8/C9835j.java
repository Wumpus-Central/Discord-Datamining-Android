package p194k8;

import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.DataSource;
import p079e7.C6722k;
import p081e9.C6793v;
import p119g9.C7557q0;
import p194k8.AbstractC9828f;
import p228m7.C10511f;

/* renamed from: k8.j */
/* loaded from: classes7.dex */
public class C9835j extends AbstractC9822a {

    /* renamed from: o */
    private final int f21919o;

    /* renamed from: p */
    private final long f21920p;

    /* renamed from: q */
    private final AbstractC9828f f21921q;

    /* renamed from: r */
    private long f21922r;

    /* renamed from: s */
    private volatile boolean f21923s;

    /* renamed from: t */
    private boolean f21924t;

    public C9835j(DataSource dataSource, C5288a aVar, C6722k kVar, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, AbstractC9828f fVar) {
        super(dataSource, aVar, kVar, i, obj, j, j2, j3, j4, j5);
        this.f21919o = i2;
        this.f21920p = j6;
        this.f21921q = fVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5325e
    /* renamed from: a */
    public final void mo12497a() {
        long j;
        long j2;
        if (this.f21922r == 0) {
            C9824c j3 = m15262j();
            j3.m15258b(this.f21920p);
            AbstractC9828f fVar = this.f21921q;
            AbstractC9828f.AbstractC9829a l = m15209l(j3);
            long j4 = this.f21861k;
            if (j4 == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                j = j4 - this.f21920p;
            }
            long j5 = this.f21862l;
            if (j5 == -9223372036854775807L) {
                j2 = -9223372036854775807L;
            } else {
                j2 = j5 - this.f21920p;
            }
            fVar.mo15251b(l, j, j2);
        }
        try {
            C5288a e = this.f21888b.m29625e(this.f21922r);
            C6793v vVar = this.f21895i;
            C10511f fVar2 = new C10511f(vVar, e.f9752g, vVar.mo12542b(e));
            while (!this.f21923s && this.f21921q.mo15252a(fVar2)) {
            }
            this.f21922r = fVar2.getPosition() - this.f21888b.f9752g;
            C7557q0.m22137n(this.f21895i);
            this.f21924t = !this.f21923s;
        } catch (Throwable th2) {
            C7557q0.m22137n(this.f21895i);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5325e
    /* renamed from: c */
    public final void mo12496c() {
        this.f21923s = true;
    }

    @Override // p194k8.AbstractC9838m
    /* renamed from: g */
    public long mo15205g() {
        return this.f21931j + this.f21919o;
    }

    @Override // p194k8.AbstractC9838m
    /* renamed from: h */
    public boolean mo12495h() {
        return this.f21924t;
    }

    /* renamed from: l */
    protected AbstractC9828f.AbstractC9829a m15209l(C9824c cVar) {
        return cVar;
    }
}
