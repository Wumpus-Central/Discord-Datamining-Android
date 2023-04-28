package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import p153i8.C8273n;
import p153i8.C8284q;

/* renamed from: com.google.android.exoplayer2.upstream.g */
/* loaded from: classes5.dex */
public interface AbstractC5318g {

    /* renamed from: com.google.android.exoplayer2.upstream.g$a */
    /* loaded from: classes5.dex */
    public static final class C5319a {

        /* renamed from: a */
        public final C8273n f9870a;

        /* renamed from: b */
        public final C8284q f9871b;

        /* renamed from: c */
        public final IOException f9872c;

        /* renamed from: d */
        public final int f9873d;

        public C5319a(C8273n nVar, C8284q qVar, IOException iOException, int i) {
            this.f9870a = nVar;
            this.f9871b = qVar;
            this.f9872c = iOException;
            this.f9873d = i;
        }
    }

    /* renamed from: a */
    long mo29489a(C5319a aVar);

    /* renamed from: b */
    long mo29488b(C5319a aVar);

    /* renamed from: c */
    int mo29487c(int i);

    /* renamed from: d */
    void mo29486d(long j);
}
