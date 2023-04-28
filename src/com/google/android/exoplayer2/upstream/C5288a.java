package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p119g9.C7510a;

/* renamed from: com.google.android.exoplayer2.upstream.a */
/* loaded from: classes5.dex */
public final class C5288a {

    /* renamed from: a */
    public final Uri f9746a;

    /* renamed from: b */
    public final long f9747b;

    /* renamed from: c */
    public final int f9748c;

    /* renamed from: d */
    public final byte[] f9749d;

    /* renamed from: e */
    public final Map<String, String> f9750e;
    @Deprecated

    /* renamed from: f */
    public final long f9751f;

    /* renamed from: g */
    public final long f9752g;

    /* renamed from: h */
    public final long f9753h;

    /* renamed from: i */
    public final String f9754i;

    /* renamed from: j */
    public final int f9755j;

    /* renamed from: k */
    public final Object f9756k;

    /* renamed from: com.google.android.exoplayer2.upstream.a$b */
    /* loaded from: classes5.dex */
    public static final class C5289b {

        /* renamed from: a */
        private Uri f9757a;

        /* renamed from: b */
        private long f9758b;

        /* renamed from: c */
        private int f9759c;

        /* renamed from: d */
        private byte[] f9760d;

        /* renamed from: e */
        private Map<String, String> f9761e;

        /* renamed from: f */
        private long f9762f;

        /* renamed from: g */
        private long f9763g;

        /* renamed from: h */
        private String f9764h;

        /* renamed from: i */
        private int f9765i;

        /* renamed from: j */
        private Object f9766j;

        /* renamed from: a */
        public C5288a m29623a() {
            C7510a.m22363i(this.f9757a, "The uri must be set.");
            return new C5288a(this.f9757a, this.f9758b, this.f9759c, this.f9760d, this.f9761e, this.f9762f, this.f9763g, this.f9764h, this.f9765i, this.f9766j);
        }

        /* renamed from: b */
        public C5289b m29622b(int i) {
            this.f9765i = i;
            return this;
        }

        /* renamed from: c */
        public C5289b m29621c(byte[] bArr) {
            this.f9760d = bArr;
            return this;
        }

        /* renamed from: d */
        public C5289b m29620d(int i) {
            this.f9759c = i;
            return this;
        }

        /* renamed from: e */
        public C5289b m29619e(Map<String, String> map) {
            this.f9761e = map;
            return this;
        }

        /* renamed from: f */
        public C5289b m29618f(String str) {
            this.f9764h = str;
            return this;
        }

        /* renamed from: g */
        public C5289b m29617g(long j) {
            this.f9763g = j;
            return this;
        }

        /* renamed from: h */
        public C5289b m29616h(long j) {
            this.f9762f = j;
            return this;
        }

        /* renamed from: i */
        public C5289b m29615i(Uri uri) {
            this.f9757a = uri;
            return this;
        }

        /* renamed from: j */
        public C5289b m29614j(String str) {
            this.f9757a = Uri.parse(str);
            return this;
        }

        /* renamed from: k */
        public C5289b m29613k(long j) {
            this.f9758b = j;
            return this;
        }

        public C5289b() {
            this.f9759c = 1;
            this.f9761e = Collections.emptyMap();
            this.f9763g = -1L;
        }

        private C5289b(C5288a aVar) {
            this.f9757a = aVar.f9746a;
            this.f9758b = aVar.f9747b;
            this.f9759c = aVar.f9748c;
            this.f9760d = aVar.f9749d;
            this.f9761e = aVar.f9750e;
            this.f9762f = aVar.f9752g;
            this.f9763g = aVar.f9753h;
            this.f9764h = aVar.f9754i;
            this.f9765i = aVar.f9755j;
            this.f9766j = aVar.f9756k;
        }
    }

    /* renamed from: c */
    public static String m29627c(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public C5289b m29629a() {
        return new C5289b();
    }

    /* renamed from: b */
    public final String m29628b() {
        return m29627c(this.f9748c);
    }

    /* renamed from: d */
    public boolean m29626d(int i) {
        return (this.f9755j & i) == i;
    }

    /* renamed from: e */
    public C5288a m29625e(long j) {
        long j2 = this.f9753h;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return m29624f(j, j3);
    }

    /* renamed from: f */
    public C5288a m29624f(long j, long j2) {
        if (j == 0 && this.f9753h == j2) {
            return this;
        }
        return new C5288a(this.f9746a, this.f9747b, this.f9748c, this.f9749d, this.f9750e, this.f9752g + j, j2, this.f9754i, this.f9755j, this.f9756k);
    }

    public String toString() {
        return "DataSpec[" + m29628b() + " " + this.f9746a + ", " + this.f9752g + ", " + this.f9753h + ", " + this.f9754i + ", " + this.f9755j + "]";
    }

    public C5288a(Uri uri) {
        this(uri, 0L, -1L);
    }

    public C5288a(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j, j2, null, 0, null);
    }

    private C5288a(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        boolean z = true;
        C7510a.m22371a(j4 >= 0);
        C7510a.m22371a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C7510a.m22371a(z);
        this.f9746a = uri;
        this.f9747b = j;
        this.f9748c = i;
        this.f9749d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f9750e = Collections.unmodifiableMap(new HashMap(map));
        this.f9752g = j2;
        this.f9751f = j4;
        this.f9753h = j3;
        this.f9754i = str;
        this.f9755j = i2;
        this.f9756k = obj;
    }
}
