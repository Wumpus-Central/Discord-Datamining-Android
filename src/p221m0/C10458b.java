package p221m0;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p390w.AbstractC13595f2;

/* renamed from: m0.b */
/* loaded from: classes.dex */
public class C10458b implements AbstractC13595f2 {

    /* renamed from: a */
    private static final Set<String> f23079a = new HashSet(Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m13129a() {
        if (!"SAMSUNG".equalsIgnoreCase(Build.BRAND) || !f23079a.contains(Build.HARDWARE.toLowerCase())) {
            return false;
        }
        return true;
    }
}
