package com.facebook.imagepipeline.backends.okhttp3;

import android.content.Context;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import okhttp3.OkHttpClient;

/* renamed from: com.facebook.imagepipeline.backends.okhttp3.a */
/* loaded from: classes7.dex */
public class C4898a {
    /* renamed from: a */
    public static ImagePipelineConfig.Builder m31512a(Context context, OkHttpClient okHttpClient) {
        return ImagePipelineConfig.m31461J(context).m31444P(new OkHttpNetworkFetcher(okHttpClient));
    }
}
