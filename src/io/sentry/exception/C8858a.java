package io.sentry.exception;

import io.sentry.protocol.C8985h;
import io.sentry.util.C9111k;

/* renamed from: io.sentry.exception.a */
/* loaded from: classes8.dex */
public final class C8858a extends RuntimeException {

    /* renamed from: k */
    private final C8985h f19550k;

    /* renamed from: l */
    private final Throwable f19551l;

    /* renamed from: m */
    private final Thread f19552m;

    /* renamed from: n */
    private final boolean f19553n;

    public C8858a(C8985h hVar, Throwable th2, Thread thread, boolean z) {
        this.f19550k = (C8985h) C9111k.m16995a(hVar, "Mechanism is required.");
        this.f19551l = (Throwable) C9111k.m16995a(th2, "Throwable is required.");
        this.f19552m = (Thread) C9111k.m16995a(thread, "Thread is required.");
        this.f19553n = z;
    }

    /* renamed from: a */
    public C8985h m17862a() {
        return this.f19550k;
    }

    /* renamed from: b */
    public Thread m17861b() {
        return this.f19552m;
    }

    /* renamed from: c */
    public Throwable m17860c() {
        return this.f19551l;
    }

    /* renamed from: d */
    public boolean m17859d() {
        return this.f19553n;
    }

    public C8858a(C8985h hVar, Throwable th2, Thread thread) {
        this(hVar, th2, thread, false);
    }
}
