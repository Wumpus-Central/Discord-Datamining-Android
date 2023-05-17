package com.discord.image.fresco.config;

import android.content.Context;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.fresco.FrescoModule;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import y5.l;
import y5.x;
import y5.y;
import y5.z;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"frescoConfig", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig;", "Landroid/content/Context;", "fresco_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FrescoConfigKt {
    public static final ImagePipelineConfig frescoConfig(Context context) {
        q.g(context, "<this>");
        ImagePipelineConfig.Builder defaultConfigBuilder = FrescoModule.getDefaultConfigBuilder(new ReactContext(context));
        FrescoDiskCache frescoDiskCache = FrescoDiskCache.INSTANCE;
        ImagePipelineConfig.Builder M = defaultConfigBuilder.O(frescoDiskCache.newRegularDiskCache(context)).S(frescoDiskCache.newSmallDiskCache(context)).M(new FrescoBitmapSupplier(context));
        x.b n10 = x.n();
        z a10 = l.a();
        ImagePipelineConfig K = M.Q(new y(n10.n(new z(a10.f32211b, a10.f32210a * 2, a10.f32212c)).m())).N(true).L().t(true).K();
        q.f(K, "getDefaultConfigBuilder(…ns(true)\n        .build()");
        return K;
    }
}
