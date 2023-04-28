package p194k8;

import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.DataSource;
import p079e7.C6722k;
import p119g9.C7510a;

/* renamed from: k8.m */
/* loaded from: classes7.dex */
public abstract class AbstractC9838m extends AbstractC9827e {

    /* renamed from: j */
    public final long f21931j;

    public AbstractC9838m(DataSource dataSource, C5288a aVar, C6722k kVar, int i, Object obj, long j, long j2, long j3) {
        super(dataSource, aVar, 1, kVar, i, obj, j, j2);
        C7510a.m22367e(kVar);
        this.f21931j = j3;
    }

    /* renamed from: g */
    public long mo15205g() {
        long j = this.f21931j;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    /* renamed from: h */
    public abstract boolean mo12495h();
}
