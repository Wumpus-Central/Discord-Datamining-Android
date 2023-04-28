package com.google.android.exoplayer2.upstream.cache;

import java.io.File;
import java.io.IOException;
import p100f9.AbstractC7094f;
import p100f9.C7092d;
import p100f9.C7095g;

/* renamed from: com.google.android.exoplayer2.upstream.cache.a */
/* loaded from: classes5.dex */
public interface AbstractC5293a {

    /* renamed from: com.google.android.exoplayer2.upstream.cache.a$a */
    /* loaded from: classes5.dex */
    public static class C0145a extends IOException {
        public C0145a(String str) {
            super(str);
        }

        public C0145a(Throwable th2) {
            super(th2);
        }

        public C0145a(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.cache.a$b */
    /* loaded from: classes5.dex */
    public interface AbstractC5294b {
        /* renamed from: a */
        void mo23410a(AbstractC5293a aVar, C7092d dVar, C7092d dVar2);

        /* renamed from: b */
        void mo23409b(AbstractC5293a aVar, C7092d dVar);

        /* renamed from: d */
        void mo23407d(AbstractC5293a aVar, C7092d dVar);
    }

    /* renamed from: a */
    File mo29584a(String str, long j, long j2);

    /* renamed from: b */
    AbstractC7094f mo29583b(String str);

    /* renamed from: c */
    C7092d mo29582c(String str, long j, long j2);

    /* renamed from: d */
    void mo29581d(C7092d dVar);

    /* renamed from: e */
    void mo29580e(C7092d dVar);

    /* renamed from: f */
    void mo29579f(String str, C7095g gVar);

    /* renamed from: g */
    C7092d mo29578g(String str, long j, long j2);

    /* renamed from: h */
    void mo29577h(File file, long j);
}
