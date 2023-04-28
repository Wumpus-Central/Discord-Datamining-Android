package p153i8;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.upstream.C5291c;
import com.google.android.exoplayer2.upstream.DataSource;
import p153i8.C8264k0;
import p228m7.AbstractC10521o;

/* renamed from: i8.j */
/* loaded from: classes7.dex */
public final class C8256j implements AbstractC8236c0 {

    /* renamed from: a */
    private final DataSource.Factory f17895a;

    /* renamed from: b */
    private final SparseArray<AbstractC8236c0> f17896b;

    /* renamed from: c */
    private final int[] f17897c;

    /* renamed from: d */
    private long f17898d;

    /* renamed from: e */
    private long f17899e;

    /* renamed from: f */
    private long f17900f;

    /* renamed from: g */
    private float f17901g;

    /* renamed from: h */
    private float f17902h;

    public C8256j(Context context, AbstractC10521o oVar) {
        this(new C5291c(context), oVar);
    }

    /* renamed from: a */
    private static SparseArray<AbstractC8236c0> m20191a(DataSource.Factory factory, AbstractC10521o oVar) {
        SparseArray<AbstractC8236c0> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (AbstractC8236c0) DashMediaSource.Factory.class.asSubclass(AbstractC8236c0.class).getConstructor(DataSource.Factory.class).newInstance(factory));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (AbstractC8236c0) SsMediaSource.Factory.class.asSubclass(AbstractC8236c0.class).getConstructor(DataSource.Factory.class).newInstance(factory));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (AbstractC8236c0) HlsMediaSource.Factory.class.asSubclass(AbstractC8236c0.class).getConstructor(DataSource.Factory.class).newInstance(factory));
        } catch (Exception unused3) {
        }
        sparseArray.put(3, new C8264k0.C8266b(factory, oVar));
        return sparseArray;
    }

    public C8256j(DataSource.Factory factory, AbstractC10521o oVar) {
        this.f17895a = factory;
        SparseArray<AbstractC8236c0> a = m20191a(factory, oVar);
        this.f17896b = a;
        this.f17897c = new int[a.size()];
        for (int i = 0; i < this.f17896b.size(); i++) {
            this.f17897c[i] = this.f17896b.keyAt(i);
        }
        this.f17898d = -9223372036854775807L;
        this.f17899e = -9223372036854775807L;
        this.f17900f = -9223372036854775807L;
        this.f17901g = -3.4028235E38f;
        this.f17902h = -3.4028235E38f;
    }
}
