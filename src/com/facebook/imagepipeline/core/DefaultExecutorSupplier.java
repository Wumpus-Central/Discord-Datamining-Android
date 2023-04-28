package com.facebook.imagepipeline.core;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p314r5.AbstractC12391e;
import p314r5.ThreadFactoryC12395i;

/* loaded from: classes7.dex */
public class DefaultExecutorSupplier implements AbstractC12391e {

    /* renamed from: b */
    private final Executor f8151b;

    /* renamed from: c */
    private final Executor f8152c;

    /* renamed from: e */
    private final ScheduledExecutorService f8154e;

    /* renamed from: a */
    private final Executor f8150a = Executors.newFixedThreadPool(2, new ThreadFactoryC12395i(10, "FrescoIoBoundExecutor", true));

    /* renamed from: d */
    private final Executor f8153d = Executors.newFixedThreadPool(1, new ThreadFactoryC12395i(10, "FrescoLightWeightBackgroundExecutor", true));

    public DefaultExecutorSupplier(int i) {
        this.f8151b = Executors.newFixedThreadPool(i, new ThreadFactoryC12395i(10, "FrescoDecodeExecutor", true));
        this.f8152c = Executors.newFixedThreadPool(i, new ThreadFactoryC12395i(10, "FrescoBackgroundExecutor", true));
        this.f8154e = Executors.newScheduledThreadPool(i, new ThreadFactoryC12395i(10, "FrescoBackgroundExecutor", true));
    }

    @Override // p314r5.AbstractC12391e
    /* renamed from: a */
    public Executor mo6965a() {
        return this.f8153d;
    }

    @Override // p314r5.AbstractC12391e
    /* renamed from: b */
    public Executor mo6964b() {
        return this.f8150a;
    }

    @Override // p314r5.AbstractC12391e
    /* renamed from: c */
    public ScheduledExecutorService mo6963c() {
        return this.f8154e;
    }

    @Override // p314r5.AbstractC12391e
    /* renamed from: d */
    public Executor mo6962d() {
        return this.f8151b;
    }

    @Override // p314r5.AbstractC12391e
    /* renamed from: e */
    public Executor mo6961e() {
        return this.f8152c;
    }

    @Override // p314r5.AbstractC12391e
    /* renamed from: f */
    public Executor mo6960f() {
        return this.f8150a;
    }

    @Override // p314r5.AbstractC12391e
    /* renamed from: g */
    public Executor mo6959g() {
        return this.f8150a;
    }
}
