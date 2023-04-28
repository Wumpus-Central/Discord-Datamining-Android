package p194k8;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.C5320h;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.List;
import java.util.Map;
import p079e7.C6722k;
import p081e9.C6793v;
import p119g9.C7510a;
import p153i8.C8273n;

/* renamed from: k8.e */
/* loaded from: classes7.dex */
public abstract class AbstractC9827e implements C5320h.AbstractC5325e {

    /* renamed from: a */
    public final long f21887a = C8273n.m20108a();

    /* renamed from: b */
    public final C5288a f21888b;

    /* renamed from: c */
    public final int f21889c;

    /* renamed from: d */
    public final C6722k f21890d;

    /* renamed from: e */
    public final int f21891e;

    /* renamed from: f */
    public final Object f21892f;

    /* renamed from: g */
    public final long f21893g;

    /* renamed from: h */
    public final long f21894h;

    /* renamed from: i */
    protected final C6793v f21895i;

    public AbstractC9827e(DataSource dataSource, C5288a aVar, int i, C6722k kVar, int i2, Object obj, long j, long j2) {
        this.f21895i = new C6793v(dataSource);
        this.f21888b = (C5288a) C7510a.m22367e(aVar);
        this.f21889c = i;
        this.f21890d = kVar;
        this.f21891e = i2;
        this.f21892f = obj;
        this.f21893g = j;
        this.f21894h = j2;
    }

    /* renamed from: b */
    public final long m15256b() {
        return this.f21895i.m24320o();
    }

    /* renamed from: d */
    public final long m15255d() {
        return this.f21894h - this.f21893g;
    }

    /* renamed from: e */
    public final Map<String, List<String>> m15254e() {
        return this.f21895i.m24318q();
    }

    /* renamed from: f */
    public final Uri m15253f() {
        return this.f21895i.m24319p();
    }
}
