package com.discord.bundle_updater;

import android.webkit.CookieManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/webkit/CookieManager;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class BundleUpdater$cookieManager$2 extends s implements Function0<CookieManager> {
    public static final BundleUpdater$cookieManager$2 INSTANCE = new BundleUpdater$cookieManager$2();

    BundleUpdater$cookieManager$2() {
        super(0);
    }

    
    @Override 
    public final CookieManager invoke() {
        return CookieManager.getInstance();
    }
}
