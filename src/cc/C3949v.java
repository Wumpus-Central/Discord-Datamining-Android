package cc;

import java.util.Collection;
import p030bc.C3457i;

/* renamed from: cc.v */
/* loaded from: classes3.dex */
public final class C3949v {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static StringBuilder m33302a(int i) {
        C3911m.m33352b(i, "size");
        return new StringBuilder((int) Math.min(i * 8, 1073741824L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m33301b(Collection<?> collection, Object obj) {
        C3457i.m34352i(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
