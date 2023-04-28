package io.sentry.android.ndk;

import io.sentry.C8951o3;
import io.sentry.android.core.AbstractC8772n0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.C9111k;

/* renamed from: io.sentry.android.ndk.a */
/* loaded from: classes8.dex */
final class C8800a implements AbstractC8772n0 {

    /* renamed from: c */
    private static final Object f19452c = new Object();

    /* renamed from: a */
    private final C8951o3 f19453a;

    /* renamed from: b */
    private final NativeModuleListLoader f19454b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8800a(SentryAndroidOptions sentryAndroidOptions, NativeModuleListLoader nativeModuleListLoader) {
        this.f19453a = (C8951o3) C9111k.m16995a(sentryAndroidOptions, "The SentryAndroidOptions is required.");
        this.f19454b = (NativeModuleListLoader) C9111k.m16995a(nativeModuleListLoader, "The NativeModuleListLoader is required.");
    }
}
