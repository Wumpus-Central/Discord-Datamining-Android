package com.discord.utils;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m15073d2 = {"Lcom/discord/utils/SoLoaderUtils;", "", "()V", "init", "", "context", "Landroid/content/Context;", "nativeExoPackage", "", "app_canaryRelease"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class SoLoaderUtils {
    public static final SoLoaderUtils INSTANCE = new SoLoaderUtils();

    private SoLoaderUtils() {
    }

    public static /* synthetic */ void init$default(SoLoaderUtils soLoaderUtils, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        soLoaderUtils.init(context, z);
    }

    public final void init(Context context, boolean z) {
        C9971q.m14633g(context, "context");
        SoLoader.m30793l(context, z);
    }
}
