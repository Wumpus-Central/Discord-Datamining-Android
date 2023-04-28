package sa;

import java.util.Objects;

/* renamed from: sa.w */
/* loaded from: classes3.dex */
final class C12856w {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m5259a(Object obj, Object obj2) {
        if (obj == null) {
            Objects.toString(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }
}
