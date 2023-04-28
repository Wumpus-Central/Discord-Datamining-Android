package p194k8;

import com.facebook.react.uimanager.ViewDefaults;
import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.DataSource;
import p079e7.C6722k;
import p119g9.C7557q0;
import p228m7.AbstractC10500b0;
import p228m7.C10511f;

/* renamed from: k8.o */
/* loaded from: classes7.dex */
public final class C9841o extends AbstractC9822a {

    /* renamed from: o */
    private final int f21933o;

    /* renamed from: p */
    private final C6722k f21934p;

    /* renamed from: q */
    private long f21935q;

    /* renamed from: r */
    private boolean f21936r;

    public C9841o(DataSource dataSource, C5288a aVar, C6722k kVar, int i, Object obj, long j, long j2, long j3, int i2, C6722k kVar2) {
        super(dataSource, aVar, kVar, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.f21933o = i2;
        this.f21934p = kVar2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5325e
    /* renamed from: a */
    public void mo12497a() {
        C9824c j = m15262j();
        j.m15258b(0L);
        AbstractC10500b0 e = j.mo15248e(0, this.f21933o);
        e.mo12388d(this.f21934p);
        try {
            long b = this.f21895i.mo12542b(this.f21888b.m29625e(this.f21935q));
            if (b != -1) {
                b += this.f21935q;
            }
            C10511f fVar = new C10511f(this.f21895i, this.f21935q, b);
            for (int i = 0; i != -1; i = e.mo12387e(fVar, ViewDefaults.NUMBER_OF_LINES, true)) {
                this.f21935q += i;
            }
            e.mo12382c(this.f21893g, 1, (int) this.f21935q, 0, null);
            C7557q0.m22137n(this.f21895i);
            this.f21936r = true;
        } catch (Throwable th2) {
            C7557q0.m22137n(this.f21895i);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5325e
    /* renamed from: c */
    public void mo12496c() {
    }

    @Override // p194k8.AbstractC9838m
    /* renamed from: h */
    public boolean mo12495h() {
        return this.f21936r;
    }
}
