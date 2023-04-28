package com.discord.cache;

import android.content.Context;
import com.discord.tti_manager.TTIMetrics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class CacheModule$Companion$quickInitCache$1 extends AbstractC9679s implements Function0<Unit> {
    final /* synthetic */ Context $applicationContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheModule$Companion$quickInitCache$1(Context context) {
        super(0);
        this.$applicationContext = context;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TTIMetrics tTIMetrics = TTIMetrics.INSTANCE;
        TTIMetrics.record$default(tTIMetrics, "CacheStorage Init Start", 0L, null, false, 14, null);
        this.$applicationContext.getSharedPreferences("CacheStore", 0).getString("hydrate", null);
        TTIMetrics.record$default(tTIMetrics, "CacheStorage Init End", 0L, null, false, 14, null);
        CacheModule.cacheLoaded = true;
    }
}
