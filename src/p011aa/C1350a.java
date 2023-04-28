package p011aa;

import android.util.Log;
import java.util.Locale;
import p420x9.C13980i;

/* renamed from: aa.a */
/* loaded from: classes5.dex */
public class C1350a {

    /* renamed from: a */
    private final String f280a;

    /* renamed from: b */
    private final String f281b;

    /* renamed from: c */
    private final C13980i f282c;

    /* renamed from: d */
    private final int f283d;

    public C1350a(String str, String... strArr) {
        String str2;
        if (strArr.length == 0) {
            str2 = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str3 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str3);
            }
            sb2.append("] ");
            str2 = sb2.toString();
        }
        this.f281b = str2;
        this.f280a = str;
        this.f282c = new C13980i(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f280a, i)) {
            i++;
        }
        this.f283d = i;
    }

    /* renamed from: a */
    public void m41258a(String str, Object... objArr) {
        if (m41255d(3)) {
            Log.d(this.f280a, m41256c(str, objArr));
        }
    }

    /* renamed from: b */
    public void m41257b(String str, Object... objArr) {
        Log.e(this.f280a, m41256c(str, objArr));
    }

    /* renamed from: c */
    protected String m41256c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f281b.concat(str);
    }

    /* renamed from: d */
    public boolean m41255d(int i) {
        return this.f283d <= i;
    }
}
