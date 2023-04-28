package androidx.core.p018os;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: androidx.core.os.v */
/* loaded from: classes.dex */
public class C2461v {

    /* renamed from: androidx.core.os.v$a */
    /* loaded from: classes.dex */
    static class C2462a {
        /* renamed from: a */
        static boolean m37711a(Context context) {
            boolean isUserUnlocked;
            isUserUnlocked = ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
            return isUserUnlocked;
        }
    }

    /* renamed from: a */
    public static boolean m37712a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C2462a.m37711a(context);
        }
        return true;
    }
}
