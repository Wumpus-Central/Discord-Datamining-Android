package com.google.firebase.messaging;

import bd.C3467b;
import bd.EnumC3469c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p063da.ThreadFactoryC6419b;

/* renamed from: com.google.firebase.messaging.m */
/* loaded from: classes3.dex */
class C5843m {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ScheduledExecutorService m27104a() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC6419b("Firebase-Messaging-Init"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static ExecutorService m27103b() {
        return C3467b.m34329a().mo34328a(new ThreadFactoryC6419b("Firebase-Messaging-Intent-Handle"), EnumC3469c.HIGH_SPEED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static ExecutorService m27102c() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC6419b("Firebase-Messaging-Network-Io"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static ExecutorService m27101d() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC6419b("Firebase-Messaging-Task"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static ScheduledExecutorService m27100e() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC6419b("Firebase-Messaging-Topics-Io"));
    }
}
