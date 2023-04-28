package p340t;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p390w.AbstractC13595f2;

/* renamed from: t.h */
/* loaded from: classes.dex */
public class C12920h implements AbstractC13595f2 {

    /* renamed from: a */
    static final List<String> f29002a = Arrays.asList("SM-A3000", "SM-A3009", "SM-A300F", "SM-A300FU", "SM-A300G", "SM-A300H", "SM-A300M", "SM-A300X", "SM-A300XU", "SM-A300XZ", "SM-A300Y", "SM-A300YZ", "SM-J510FN", "5059X");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m5068a() {
        return f29002a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
