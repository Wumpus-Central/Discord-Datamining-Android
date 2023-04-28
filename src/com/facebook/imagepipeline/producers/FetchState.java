package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.imagepipeline.common.BytesRange;
import p380v5.C13434e;

/* loaded from: classes7.dex */
public class FetchState {

    /* renamed from: a */
    private final Consumer<C13434e> f8366a;

    /* renamed from: b */
    private final ProducerContext f8367b;

    /* renamed from: c */
    private long f8368c = 0;

    /* renamed from: d */
    private int f8369d;

    /* renamed from: e */
    private BytesRange f8370e;

    public FetchState(Consumer<C13434e> consumer, ProducerContext producerContext) {
        this.f8366a = consumer;
        this.f8367b = producerContext;
    }

    /* renamed from: a */
    public Consumer<C13434e> m31225a() {
        return this.f8366a;
    }

    /* renamed from: b */
    public ProducerContext m31224b() {
        return this.f8367b;
    }

    /* renamed from: c */
    public long m31223c() {
        return this.f8368c;
    }

    /* renamed from: d */
    public AbstractC5011n0 m31222d() {
        return this.f8367b.mo31163h();
    }

    /* renamed from: e */
    public int m31221e() {
        return this.f8369d;
    }

    /* renamed from: f */
    public BytesRange m31220f() {
        return this.f8370e;
    }

    /* renamed from: g */
    public Uri m31219g() {
        return this.f8367b.mo31159l().getSourceUri();
    }

    /* renamed from: h */
    public void m31218h(long j) {
        this.f8368c = j;
    }

    /* renamed from: i */
    public void m31217i(int i) {
        this.f8369d = i;
    }

    /* renamed from: j */
    public void m31216j(BytesRange bytesRange) {
        this.f8370e = bytesRange;
    }
}
