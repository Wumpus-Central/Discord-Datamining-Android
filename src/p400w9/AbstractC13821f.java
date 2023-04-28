package p400w9;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: w9.f */
/* loaded from: classes5.dex */
public interface AbstractC13821f {
    /* renamed from: a */
    void mo2555a(String str, LifecycleCallback lifecycleCallback);

    /* renamed from: b */
    <T extends LifecycleCallback> T mo2554b(String str, Class<T> cls);

    /* renamed from: c */
    Activity mo2553c();

    void startActivityForResult(Intent intent, int i);
}
