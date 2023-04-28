package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.AbstractC3304a;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC3304a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3168a = (IconCompat) aVar.m34726v(remoteActionCompat.f3168a, 1);
        remoteActionCompat.f3169b = aVar.m34732l(remoteActionCompat.f3169b, 2);
        remoteActionCompat.f3170c = aVar.m34732l(remoteActionCompat.f3170c, 3);
        remoteActionCompat.f3171d = (PendingIntent) aVar.m34729r(remoteActionCompat.f3171d, 4);
        remoteActionCompat.f3172e = aVar.m34734h(remoteActionCompat.f3172e, 5);
        remoteActionCompat.f3173f = aVar.m34734h(remoteActionCompat.f3173f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC3304a aVar) {
        aVar.m34725x(false, false);
        aVar.m34740M(remoteActionCompat.f3168a, 1);
        aVar.m34746D(remoteActionCompat.f3169b, 2);
        aVar.m34746D(remoteActionCompat.f3170c, 3);
        aVar.m34744H(remoteActionCompat.f3171d, 4);
        aVar.m34724z(remoteActionCompat.f3172e, 5);
        aVar.m34724z(remoteActionCompat.f3173f, 6);
    }
}
