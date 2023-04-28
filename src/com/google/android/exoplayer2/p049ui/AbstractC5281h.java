package com.google.android.exoplayer2.p049ui;

/* renamed from: com.google.android.exoplayer2.ui.h */
/* loaded from: classes5.dex */
public interface AbstractC5281h {

    /* renamed from: com.google.android.exoplayer2.ui.h$a */
    /* loaded from: classes5.dex */
    public interface AbstractC5282a {
        /* renamed from: a */
        void mo29654a(AbstractC5281h hVar, long j);

        /* renamed from: b */
        void mo29653b(AbstractC5281h hVar, long j, boolean z);

        /* renamed from: c */
        void mo29652c(AbstractC5281h hVar, long j);
    }

    /* renamed from: a */
    void mo29656a(AbstractC5282a aVar);

    /* renamed from: b */
    void mo29655b(long[] jArr, boolean[] zArr, int i);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
