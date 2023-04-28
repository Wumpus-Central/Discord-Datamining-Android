package com.google.android.gms.internal.gtm;

import com.reactnativecommunity.webview.RNCWebViewManager;
import p365u9.C13221g;

/* loaded from: classes3.dex */
public final class zzbt {
    public static final String zza;
    public static final String zzb;

    static {
        String str;
        String replaceAll = String.valueOf(C13221g.f29689a / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        zza = replaceAll;
        String valueOf = String.valueOf(replaceAll);
        if (valueOf.length() != 0) {
            str = "ma".concat(valueOf);
        } else {
            str = new String("ma");
        }
        zzb = str;
    }
}
