package p340t;

import android.os.Build;
import android.util.Size;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p390w.AbstractC13595f2;
import p390w.AbstractC13658q2;

/* renamed from: t.s */
/* loaded from: classes.dex */
public class C12931s implements AbstractC13595f2 {

    /* renamed from: a */
    private static final List<String> f29013a = Arrays.asList("SM-T580", "SM-J710MN", "SM-A320FL", "SM-G570M", "SM-G610F", "SM-G610M");

    /* renamed from: t.s$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C12932a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29014a;

        static {
            int[] iArr = new int[AbstractC13658q2.EnumC13660b.values().length];
            f29014a = iArr;
            try {
                iArr[AbstractC13658q2.EnumC13660b.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29014a[AbstractC13658q2.EnumC13660b.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29014a[AbstractC13658q2.EnumC13660b.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    private static boolean m5042a() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND) || !f29013a.contains(Build.MODEL.toUpperCase(Locale.US))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m5041b() {
        return m5042a();
    }

    /* renamed from: c */
    public Size m5040c(AbstractC13658q2.EnumC13660b bVar) {
        if (!m5042a()) {
            return null;
        }
        int i = C12932a.f29014a[bVar.ordinal()];
        if (i == 1) {
            return new Size(1920, 1080);
        }
        if (i == 2) {
            return new Size(1280, 720);
        }
        if (i != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
