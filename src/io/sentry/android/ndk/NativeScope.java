package io.sentry.android.ndk;

/* loaded from: classes8.dex */
final class NativeScope implements AbstractC8801b {
    public static native void nativeAddBreadcrumb(String str, String str2, String str3, String str4, String str5, String str6);

    public static native void nativeRemoveExtra(String str);

    public static native void nativeRemoveTag(String str);

    public static native void nativeRemoveUser();

    public static native void nativeSetExtra(String str, String str2);

    public static native void nativeSetTag(String str, String str2);

    public static native void nativeSetUser(String str, String str2, String str3, String str4);

    @Override // io.sentry.android.ndk.AbstractC8801b
    /* renamed from: a */
    public void mo18055a(String str, String str2) {
        nativeSetTag(str, str2);
    }

    @Override // io.sentry.android.ndk.AbstractC8801b
    /* renamed from: b */
    public void mo18054b(String str, String str2) {
        nativeSetExtra(str, str2);
    }

    @Override // io.sentry.android.ndk.AbstractC8801b
    /* renamed from: c */
    public void mo18053c(String str, String str2, String str3, String str4, String str5, String str6) {
        nativeAddBreadcrumb(str, str2, str3, str4, str5, str6);
    }

    @Override // io.sentry.android.ndk.AbstractC8801b
    /* renamed from: d */
    public void mo18052d() {
        nativeRemoveUser();
    }

    @Override // io.sentry.android.ndk.AbstractC8801b
    /* renamed from: e */
    public void mo18051e(String str, String str2, String str3, String str4) {
        nativeSetUser(str, str2, str3, str4);
    }
}
