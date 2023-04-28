package com.discord.bundle_updater;

import android.webkit.CookieManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;

@Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "Landroid/webkit/CookieManager;", "kotlin.jvm.PlatformType", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
final class BundleUpdater$cookieManager$2 extends AbstractC9679s implements Function0<CookieManager> {
    public static final BundleUpdater$cookieManager$2 INSTANCE = new BundleUpdater$cookieManager$2();

    BundleUpdater$cookieManager$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CookieManager invoke() {
        return CookieManager.getInstance();
    }
}
