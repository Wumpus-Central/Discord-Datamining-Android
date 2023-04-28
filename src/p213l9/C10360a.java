package p213l9;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.gms.internal.gtm.zzfs;
import p420x9.C14004p;

/* renamed from: l9.a */
/* loaded from: classes5.dex */
public class C10360a extends BroadcastReceiver {
    static Boolean zza;

    public static boolean zzb(Context context) {
        C14004p.m2051j(context);
        Boolean bool = zza;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zzi = zzfs.zzi(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        zza = Boolean.valueOf(zzi);
        return zzi;
    }
}
