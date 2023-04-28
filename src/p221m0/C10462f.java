package p221m0;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import p390w.AbstractC13595f2;

/* renamed from: m0.f */
/* loaded from: classes.dex */
public class C10462f implements AbstractC13595f2 {

    /* renamed from: a */
    private static final List<String> f23081a = Arrays.asList("SM-N9208", "SM-G920V");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m13125a() {
        if (f23081a.contains(Build.MODEL.toUpperCase())) {
            return true;
        }
        return false;
    }
}
