package p340t;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p020b0.AbstractC3340e;
import p308r.C12267f0;

/* renamed from: t.p */
/* loaded from: classes.dex */
public final class C12928p implements AbstractC3340e {

    /* renamed from: a */
    private static final Set<String> f29010a = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo"));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m5046a(C12267f0 f0Var) {
        return f29010a.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
