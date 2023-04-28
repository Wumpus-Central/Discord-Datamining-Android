package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.f */
/* loaded from: classes5.dex */
public interface AbstractC5311f extends DataSource {

    /* renamed from: com.google.android.exoplayer2.upstream.f$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC5312a implements AbstractC5314c {

        /* renamed from: a */
        private final C5317g f9860a = new C5317g();

        /* renamed from: a */
        protected abstract AbstractC5311f mo13548a(C5317g gVar);

        @Deprecated
        /* renamed from: b */
        public final C5317g m29492b() {
            return this.f9860a;
        }

        @Override // com.google.android.exoplayer2.upstream.AbstractC5311f.AbstractC5314c, com.google.android.exoplayer2.upstream.DataSource.Factory
        public final AbstractC5311f createDataSource() {
            return mo13548a(this.f9860a);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.f$b */
    /* loaded from: classes5.dex */
    public static final class C5313b extends C5315d {
        public C5313b(IOException iOException, C5288a aVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, aVar, 1);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.f$c */
    /* loaded from: classes5.dex */
    public interface AbstractC5314c extends DataSource.Factory {
        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        AbstractC5311f createDataSource();
    }

    /* renamed from: com.google.android.exoplayer2.upstream.f$e */
    /* loaded from: classes5.dex */
    public static final class C5316e extends C5315d {

        /* renamed from: m */
        public final String f9863m;

        public C5316e(String str, C5288a aVar) {
            super("Invalid content type: " + str, aVar, 1);
            this.f9863m = str;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.f$f */
    /* loaded from: classes5.dex */
    public static final class C0146f extends C5315d {

        /* renamed from: m */
        public final int f9864m;

        /* renamed from: n */
        public final String f9865n;

        /* renamed from: o */
        public final Map<String, List<String>> f9866o;

        /* renamed from: p */
        public final byte[] f9867p;

        public C0146f(int i, String str, Map<String, List<String>> map, C5288a aVar, byte[] bArr) {
            super("Response code: " + i, aVar, 1);
            this.f9864m = i;
            this.f9865n = str;
            this.f9866o = map;
            this.f9867p = bArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.f$g */
    /* loaded from: classes5.dex */
    public static final class C5317g {

        /* renamed from: a */
        private final Map<String, String> f9868a = new HashMap();

        /* renamed from: b */
        private Map<String, String> f9869b;

        /* renamed from: a */
        public synchronized Map<String, String> m29491a() {
            if (this.f9869b == null) {
                this.f9869b = Collections.unmodifiableMap(new HashMap(this.f9868a));
            }
            return this.f9869b;
        }

        /* renamed from: b */
        public synchronized void m29490b(Map<String, String> map) {
            this.f9869b = null;
            this.f9868a.putAll(map);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.f$d */
    /* loaded from: classes5.dex */
    public static class C5315d extends IOException {

        /* renamed from: k */
        public final int f9861k;

        /* renamed from: l */
        public final C5288a f9862l;

        public C5315d(String str, C5288a aVar, int i) {
            super(str);
            this.f9862l = aVar;
            this.f9861k = i;
        }

        public C5315d(IOException iOException, C5288a aVar, int i) {
            super(iOException);
            this.f9862l = aVar;
            this.f9861k = i;
        }

        public C5315d(String str, IOException iOException, C5288a aVar, int i) {
            super(str, iOException);
            this.f9862l = aVar;
            this.f9861k = i;
        }
    }
}
