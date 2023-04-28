package na;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* renamed from: na.e */
/* loaded from: classes3.dex */
public final class C10771e {

    /* renamed from: a */
    public static final int f23924a;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r0.charAt(0) <= 'Z') goto L_0x0029;
     */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 < r1) goto L_0x0009
            goto L_0x0029
        L_0x0009:
            r1 = 30
            r3 = 0
            if (r0 < r1) goto L_0x0028
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            int r1 = r0.length()
            r4 = 1
            if (r1 != r4) goto L_0x0028
            char r1 = r0.charAt(r3)
            r4 = 83
            if (r1 < r4) goto L_0x0028
            char r0 = r0.charAt(r3)
            r1 = 90
            if (r0 > r1) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r2 = r3
        L_0x0029:
            na.C10771e.f23924a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: na.C10771e.<clinit>():void");
    }

    /* renamed from: a */
    public static PendingIntent m12355a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, i, intent, i2);
    }
}
