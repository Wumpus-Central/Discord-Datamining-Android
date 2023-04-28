package p244n8;

import com.google.android.exoplayer2.upstream.DataSource;

/* renamed from: n8.c */
/* loaded from: classes7.dex */
public final class C10728c implements AbstractC10738g {

    /* renamed from: a */
    private final DataSource.Factory f23791a;

    public C10728c(DataSource.Factory factory) {
        this.f23791a = factory;
    }

    @Override // p244n8.AbstractC10738g
    /* renamed from: a */
    public DataSource mo12499a(int i) {
        return this.f23791a.createDataSource();
    }
}
