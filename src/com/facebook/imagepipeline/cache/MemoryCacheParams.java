package com.facebook.imagepipeline.cache;

import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class MemoryCacheParams {

    /* renamed from: a */
    public final int f8116a;

    /* renamed from: b */
    public final int f8117b;

    /* renamed from: c */
    public final int f8118c;

    /* renamed from: d */
    public final int f8119d;

    /* renamed from: e */
    public final int f8120e;

    /* renamed from: f */
    public final long f8121f;

    public MemoryCacheParams(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, i5, TimeUnit.MINUTES.toMillis(5L));
    }

    public MemoryCacheParams(int i, int i2, int i3, int i4, int i5, long j) {
        this.f8116a = i;
        this.f8117b = i2;
        this.f8118c = i3;
        this.f8119d = i4;
        this.f8120e = i5;
        this.f8121f = j;
    }
}
