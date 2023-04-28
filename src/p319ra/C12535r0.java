package p319ra;

import android.util.Log;
import java.io.File;

/* renamed from: ra.r0 */
/* loaded from: classes3.dex */
public final class C12535r0 {

    /* renamed from: a */
    private static File f28208a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static File m6578a() {
        return f28208a;
    }

    /* renamed from: b */
    public static void m6577b(File file) {
        if (file == null) {
            Log.e("NearbyConnections", "Cannot set null temp directory");
        } else {
            f28208a = file;
        }
    }
}
