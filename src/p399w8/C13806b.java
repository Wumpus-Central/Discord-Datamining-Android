package p399w8;

import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import p119g9.C7510a;
import p119g9.C7557q0;

/* renamed from: w8.b */
/* loaded from: classes7.dex */
final class C13806b {

    /* renamed from: a */
    public final int f31082a;

    /* renamed from: b */
    public final int f31083b;

    /* renamed from: c */
    public final int f31084c;

    /* renamed from: d */
    public final int f31085d;

    /* renamed from: e */
    public final int f31086e;

    private C13806b(int i, int i2, int i3, int i4, int i5) {
        this.f31082a = i;
        this.f31083b = i2;
        this.f31084c = i3;
        this.f31085d = i4;
        this.f31086e = i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static C13806b m2606a(String str) {
        char c;
        C7510a.m22371a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < split.length; i5++) {
            String U0 = C7557q0.m22174U0(split[i5].trim());
            U0.hashCode();
            switch (U0.hashCode()) {
                case 100571:
                    if (U0.equals(ViewProps.END)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (U0.equals("text")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (U0.equals(ViewProps.START)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (U0.equals("style")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    i2 = i5;
                    break;
                case 1:
                    i4 = i5;
                    break;
                case 2:
                    i = i5;
                    break;
                case 3:
                    i3 = i5;
                    break;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new C13806b(i, i2, i3, i4, split.length);
    }
}
