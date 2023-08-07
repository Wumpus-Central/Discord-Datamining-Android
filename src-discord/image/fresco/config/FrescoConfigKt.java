package com.discord.image.fresco.config;

import android.content.Context;
import com.discord.resource_usage.DeviceResourceUsageRecorder;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.network.OkHttpClientProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import y4.l;
import y4.x;
import y4.y;
import y4.z;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"frescoConfig", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig;", "Landroid/content/Context;", "fresco_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class FrescoConfigKt {
    public static final ImagePipelineConfig frescoConfig(Context context) {
        q.h(context, "<this>");
        ImagePipelineConfig.Builder defaultConfigBuilder = FrescoModule.getDefaultConfigBuilder(new ReactContext(context));
        FrescoDiskCache frescoDiskCache = FrescoDiskCache.INSTANCE;
        ImagePipelineConfig.Builder M = defaultConfigBuilder.O(frescoDiskCache.newRegularDiskCache(context)).S(frescoDiskCache.newSmallDiskCache(context)).M(new FrescoBitmapSupplier(context));
        OkHttpClient.Builder B = OkHttpClientProvider.createClient().B();
        final DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.Companion;
        ImagePipelineConfig.Builder P = M.P(new ReactOkHttpNetworkFetcher(B.b(new Interceptor() { 
            @Override 
            public final Response intercept(Interceptor.Chain chain) {
                q.h(chain, "chain");
                return DeviceResourceUsageRecorder.Companion.this.frescoInterceptor(chain);
            }
        }).c()));
        x.b n10 = x.n();
        z a10 = l.a();
        ImagePipelineConfig K = P.Q(new y(n10.n(new z(a10.f30596b, a10.f30595a * 2, a10.f30597c)).m())).N(true).L().t(true).K();
        q.g(K, "getDefaultConfigBuilder(…ns(true)\n        .build()");
        return K;
    }
}
