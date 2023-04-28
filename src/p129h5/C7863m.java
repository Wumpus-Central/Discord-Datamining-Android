package p129h5;

import android.os.Build;
import com.facebook.hermes.intl.C4877h;

/* renamed from: h5.m */
/* loaded from: classes7.dex */
public class C7863m {
    /* renamed from: a */
    public static AbstractC7805b m21222a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C7915x.m21161i();
        }
        return C4877h.m31575i();
    }

    /* renamed from: b */
    public static AbstractC7805b m21221b(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C7915x.m21160j(str);
        }
        return C4877h.m31574j(str);
    }
}
