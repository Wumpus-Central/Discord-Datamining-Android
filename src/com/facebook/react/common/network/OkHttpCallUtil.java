package com.facebook.react.common.network;

import okhttp3.Call;
import okhttp3.OkHttpClient;

/* loaded from: classes7.dex */
public class OkHttpCallUtil {
    private OkHttpCallUtil() {
    }

    public static void cancelTag(OkHttpClient okHttpClient, Object obj) {
        for (Call call : okHttpClient.m9941r().m10077k()) {
            if (obj.equals(call.mo3426b().m9879j())) {
                call.cancel();
                return;
            }
        }
        for (Call call2 : okHttpClient.m9941r().m10076l()) {
            if (obj.equals(call2.mo3426b().m9879j())) {
                call2.cancel();
                return;
            }
        }
    }
}
