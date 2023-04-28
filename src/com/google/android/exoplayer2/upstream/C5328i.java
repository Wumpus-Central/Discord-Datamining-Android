package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.C5320h;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import p081e9.C6779m;
import p081e9.C6793v;
import p119g9.C7510a;
import p119g9.C7557q0;
import p153i8.C8273n;

/* renamed from: com.google.android.exoplayer2.upstream.i */
/* loaded from: classes5.dex */
public final class C5328i<T> implements C5320h.AbstractC5325e {

    /* renamed from: a */
    public final long f9894a;

    /* renamed from: b */
    public final C5288a f9895b;

    /* renamed from: c */
    public final int f9896c;

    /* renamed from: d */
    private final C6793v f9897d;

    /* renamed from: e */
    private final AbstractC5329a<? extends T> f9898e;

    /* renamed from: f */
    private volatile T f9899f;

    /* renamed from: com.google.android.exoplayer2.upstream.i$a */
    /* loaded from: classes5.dex */
    public interface AbstractC5329a<T> {
        /* renamed from: a */
        T mo7921a(Uri uri, InputStream inputStream);
    }

    public C5328i(DataSource dataSource, Uri uri, int i, AbstractC5329a<? extends T> aVar) {
        this(dataSource, new C5288a.C5289b().m29615i(uri).m29622b(1).m29623a(), i, aVar);
    }

    @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5325e
    /* renamed from: a */
    public final void mo12497a() {
        this.f9897d.m24317r();
        C6779m mVar = new C6779m(this.f9897d, this.f9895b);
        try {
            mVar.m24352g();
            this.f9899f = (T) this.f9898e.mo7921a((Uri) C7510a.m22367e(this.f9897d.mo12539m()), mVar);
        } finally {
            C7557q0.m22135o(mVar);
        }
    }

    /* renamed from: b */
    public long m29463b() {
        return this.f9897d.m24320o();
    }

    @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5325e
    /* renamed from: c */
    public final void mo12496c() {
    }

    /* renamed from: d */
    public Map<String, List<String>> m29462d() {
        return this.f9897d.m24318q();
    }

    /* renamed from: e */
    public final T m29461e() {
        return this.f9899f;
    }

    /* renamed from: f */
    public Uri m29460f() {
        return this.f9897d.m24319p();
    }

    public C5328i(DataSource dataSource, C5288a aVar, int i, AbstractC5329a<? extends T> aVar2) {
        this.f9897d = new C6793v(dataSource);
        this.f9895b = aVar;
        this.f9896c = i;
        this.f9898e = aVar2;
        this.f9894a = C8273n.m20108a();
    }
}
