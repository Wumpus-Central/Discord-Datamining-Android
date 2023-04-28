package p440y8;

import android.text.TextUtils;
import cc.AbstractC3960w0;
import com.facebook.react.uimanager.ViewProps;
import java.util.regex.Pattern;

/* renamed from: y8.b */
/* loaded from: classes7.dex */
final class C14311b {

    /* renamed from: d */
    private static final Pattern f32363d = Pattern.compile("\\s+");

    /* renamed from: e */
    private static final AbstractC3960w0<String> f32364e = AbstractC3960w0.m33254z("auto", ViewProps.NONE);

    /* renamed from: f */
    private static final AbstractC3960w0<String> f32365f = AbstractC3960w0.m33263A("dot", "sesame", "circle");

    /* renamed from: g */
    private static final AbstractC3960w0<String> f32366g = AbstractC3960w0.m33254z("filled", "open");

    /* renamed from: h */
    private static final AbstractC3960w0<String> f32367h = AbstractC3960w0.m33263A("after", "before", "outside");

    /* renamed from: a */
    public final int f32368a;

    /* renamed from: b */
    public final int f32369b;

    /* renamed from: c */
    public final int f32370c;

    private C14311b(int i, int i2, int i3) {
        this.f32368a = i;
        this.f32369b = i2;
        this.f32370c = i3;
    }

    /* renamed from: a */
    public static C14311b m956a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return m955b(AbstractC3960w0.m33258u(TextUtils.split(trim, f32363d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
        if (r9.equals("auto") != false) goto L_0x0085;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fe, code lost:
        if (r9.equals("dot") != false) goto L_0x0114;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0116  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p440y8.C14311b m955b(cc.AbstractC3960w0<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p440y8.C14311b.m955b(cc.w0):y8.b");
    }
}
