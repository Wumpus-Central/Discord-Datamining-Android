package p153i8;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C5288a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: i8.n */
/* loaded from: classes7.dex */
public final class C8273n {

    /* renamed from: h */
    private static final AtomicLong f17980h = new AtomicLong();

    /* renamed from: a */
    public final long f17981a;

    /* renamed from: b */
    public final C5288a f17982b;

    /* renamed from: c */
    public final Uri f17983c;

    /* renamed from: d */
    public final Map<String, List<String>> f17984d;

    /* renamed from: e */
    public final long f17985e;

    /* renamed from: f */
    public final long f17986f;

    /* renamed from: g */
    public final long f17987g;

    public C8273n(long j, C5288a aVar, long j2) {
        this(j, aVar, aVar.f9746a, Collections.emptyMap(), j2, 0L, 0L);
    }

    /* renamed from: a */
    public static long m20108a() {
        return f17980h.getAndIncrement();
    }

    public C8273n(long j, C5288a aVar, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.f17981a = j;
        this.f17982b = aVar;
        this.f17983c = uri;
        this.f17984d = map;
        this.f17985e = j2;
        this.f17986f = j3;
        this.f17987g = j4;
    }
}
