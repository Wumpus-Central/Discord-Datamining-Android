package p340t;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import p390w.AbstractC13595f2;

/* renamed from: t.n */
/* loaded from: classes.dex */
public class C12926n implements AbstractC13595f2 {

    /* renamed from: a */
    public static final List<String> f29008a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m5048a() {
        if (!f29008a.contains(Build.MODEL) || !"Google".equals(Build.MANUFACTURER) || Build.VERSION.SDK_INT < 26) {
            return false;
        }
        return true;
    }
}
