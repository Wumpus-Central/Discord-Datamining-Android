package androidx.core.p018os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000e"}, m15073d2 = {"Landroidx/core/os/c;", "", "Landroid/os/Bundle;", "bundle", "", "key", "Landroid/util/Size;", "value", "", "a", "Landroid/util/SizeF;", "b", "<init>", "()V", "core-ktx_release"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: androidx.core.os.c */
/* loaded from: classes.dex */
final class C2435c {

    /* renamed from: a */
    public static final C2435c f3369a = new C2435c();

    private C2435c() {
    }

    /* renamed from: a */
    public static final void m37748a(Bundle bundle, String key, Size size) {
        C9971q.m14633g(bundle, "bundle");
        C9971q.m14633g(key, "key");
        bundle.putSize(key, size);
    }

    /* renamed from: b */
    public static final void m37747b(Bundle bundle, String key, SizeF sizeF) {
        C9971q.m14633g(bundle, "bundle");
        C9971q.m14633g(key, "key");
        bundle.putSizeF(key, sizeF);
    }
}
