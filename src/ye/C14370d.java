package ye;

import android.content.Context;
import androidx.core.content.C2337a;

/* renamed from: ye.d */
/* loaded from: classes6.dex */
public class C14370d {
    /* renamed from: a */
    public static boolean m751a(Context context) {
        if (C2337a.m38137a(context, "android.permission.ACCESS_WIFI_STATE") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m750b(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - i) - 1];
            bArr[(bArr.length - i) - 1] = b;
        }
    }
}
