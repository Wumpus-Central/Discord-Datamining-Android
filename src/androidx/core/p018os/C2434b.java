package androidx.core.p018os;

import android.os.Bundle;
import android.os.IBinder;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\f"}, m15073d2 = {"Landroidx/core/os/b;", "", "Landroid/os/Bundle;", "bundle", "", "key", "Landroid/os/IBinder;", "value", "", "a", "<init>", "()V", "core-ktx_release"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: androidx.core.os.b */
/* loaded from: classes.dex */
final class C2434b {

    /* renamed from: a */
    public static final C2434b f3368a = new C2434b();

    private C2434b() {
    }

    /* renamed from: a */
    public static final void m37749a(Bundle bundle, String key, IBinder iBinder) {
        C9971q.m14633g(bundle, "bundle");
        C9971q.m14633g(key, "key");
        bundle.putBinder(key, iBinder);
    }
}
