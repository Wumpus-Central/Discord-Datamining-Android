package sa;

import java.util.Set;

/* renamed from: sa.h */
/* loaded from: classes3.dex */
public final class C12841h {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m5298a(Set set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }
}
