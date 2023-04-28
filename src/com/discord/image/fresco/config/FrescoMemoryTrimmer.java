package com.discord.image.fresco.config;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import p209l4.C10061c;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m15073d2 = {"Lcom/discord/image/fresco/config/FrescoMemoryTrimmer;", "", "()V", "initialize", "", "context", "Landroid/content/Context;", "fresco_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class FrescoMemoryTrimmer {
    public static final FrescoMemoryTrimmer INSTANCE = new FrescoMemoryTrimmer();

    private FrescoMemoryTrimmer() {
    }

    public final void initialize(Context context) {
        C9677q.m14633g(context, "context");
        context.registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.discord.image.fresco.config.FrescoMemoryTrimmer$initialize$1
            private final void clearMemoryCaches() {
                C10061c.m13589a().m31488c();
            }

            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration newConfig) {
                C9677q.m14633g(newConfig, "newConfig");
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
                clearMemoryCaches();
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i) {
                if (i == 5 || i == 10 || i == 15 || i == 40 || i == 60 || i == 80) {
                    clearMemoryCaches();
                }
            }
        });
    }
}
