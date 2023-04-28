package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C2228f;
import androidx.core.util.C2513d;

/* renamed from: androidx.core.content.h */
/* loaded from: classes.dex */
public final class C2350h {
    /* renamed from: a */
    public static int m38099a(Context context, String str, int i, int i2, String str2) {
        boolean z;
        int i3;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String c = C2228f.m38278c(str);
        if (c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid != i2 || !C2513d.m37601a(packageName, str2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i3 = C2228f.m38280a(context, i2, c, str2);
        } else {
            i3 = C2228f.m38279b(context, c, str2);
        }
        if (i3 == 0) {
            return 0;
        }
        return -2;
    }

    /* renamed from: b */
    public static int m38098b(Context context, String str) {
        return m38099a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
