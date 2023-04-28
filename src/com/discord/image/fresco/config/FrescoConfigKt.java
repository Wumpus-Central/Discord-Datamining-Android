package com.discord.image.fresco.config;

import android.content.Context;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.fresco.FrescoModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p437y5.C14241l;
import p437y5.C14253x;
import p437y5.C14256y;
import p437y5.C14257z;

@Metadata(m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m15073d2 = {"frescoConfig", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig;", "Landroid/content/Context;", "fresco_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class FrescoConfigKt {
    public static final ImagePipelineConfig frescoConfig(Context context) {
        C9971q.m14633g(context, "<this>");
        ImagePipelineConfig.Builder defaultConfigBuilder = FrescoModule.getDefaultConfigBuilder(new ReactContext(context));
        FrescoDiskCache frescoDiskCache = FrescoDiskCache.INSTANCE;
        ImagePipelineConfig.Builder M = defaultConfigBuilder.m31445O(frescoDiskCache.newRegularDiskCache(context)).m31441S(frescoDiskCache.newSmallDiskCache(context)).m31447M(new FrescoBitmapSupplier(context));
        C14253x.C14255b n = C14253x.m1248n();
        C14257z a = C14241l.m1299a();
        ImagePipelineConfig K = M.m31443Q(new C14256y(n.m1234n(new C14257z(a.f32217b, a.f32216a * 2, a.f32218c)).m1235m())).m31446N(true).m31448L().m31364t(true).m31449K();
        C9971q.m14634f(K, "getDefaultConfigBuilder(…ns(true)\n        .build()");
        return K;
    }
}
