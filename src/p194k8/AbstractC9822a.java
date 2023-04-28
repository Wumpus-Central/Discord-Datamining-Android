package p194k8;

import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.DataSource;
import p079e7.C6722k;
import p119g9.C7510a;

/* renamed from: k8.a */
/* loaded from: classes7.dex */
public abstract class AbstractC9822a extends AbstractC9838m {

    /* renamed from: k */
    public final long f21861k;

    /* renamed from: l */
    public final long f21862l;

    /* renamed from: m */
    private C9824c f21863m;

    /* renamed from: n */
    private int[] f21864n;

    public AbstractC9822a(DataSource dataSource, C5288a aVar, C6722k kVar, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(dataSource, aVar, kVar, i, obj, j, j2, j5);
        this.f21861k = j3;
        this.f21862l = j4;
    }

    /* renamed from: i */
    public final int m15263i(int i) {
        return ((int[]) C7510a.m22364h(this.f21864n))[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final C9824c m15262j() {
        return (C9824c) C7510a.m22364h(this.f21863m);
    }

    /* renamed from: k */
    public void m15261k(C9824c cVar) {
        this.f21863m = cVar;
        this.f21864n = cVar.m15259a();
    }
}
