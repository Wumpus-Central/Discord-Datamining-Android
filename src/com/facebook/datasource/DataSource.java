package com.facebook.datasource;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public interface DataSource<T> {
    /* renamed from: a */
    boolean mo32020a();

    /* renamed from: b */
    boolean mo31971b();

    /* renamed from: c */
    Throwable mo32019c();

    boolean close();

    /* renamed from: d */
    void mo32018d(AbstractC4782d<T> dVar, Executor executor);

    /* renamed from: e */
    float mo32017e();

    /* renamed from: f */
    boolean mo32016f();

    /* renamed from: g */
    T mo31326g();

    Map<String, Object> getExtras();
}
