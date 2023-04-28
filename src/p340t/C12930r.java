package p340t;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p390w.AbstractC13595f2;

/* renamed from: t.r */
/* loaded from: classes.dex */
public class C12930r implements AbstractC13595f2 {

    /* renamed from: a */
    private static final List<String> f29012a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m5043a() {
        if (!"Google".equals(Build.MANUFACTURER) || !f29012a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()))) {
            return false;
        }
        return true;
    }
}
