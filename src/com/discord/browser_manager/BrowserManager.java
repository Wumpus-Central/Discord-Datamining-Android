package com.discord.browser_manager;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.discord.browser.C4235R;
import com.discord.chrome_custom_tabs.CustomTabs;
import com.discord.theme.utils.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\t0\u0006H\u0002J0\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\t0\u0006H\u0002J.\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\t0\u0006J.\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\t0\u0006¨\u0006\u0013"}, m15073d2 = {"Lcom/discord/browser_manager/BrowserManager;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "onFailure", "openUrlWithCustomTabs", "openUrlExternally", "", "url", "tryOpenUrlWithCustomTabs", "tryOpenUrlExternally", "<init>", "()V", "browser_manager_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BrowserManager {
    public static final BrowserManager INSTANCE = new BrowserManager();

    private BrowserManager() {
    }

    private final void openUrlExternally(Context context, Uri uri, Function1<? super Exception, Unit> function1) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", uri).addFlags(268435456));
        } catch (ActivityNotFoundException e) {
            function1.invoke(e);
        }
    }

    private final void openUrlWithCustomTabs(Context context, Uri uri, Function1<? super Exception, Unit> function1) {
        CustomTabs.INSTANCE.openUrlWithCustomTabs(context, uri, (r22 & 4) != 0 ? false : false, ColorUtilsKt.getThemeColor(context, C4235R.color.white, C4235R.color.primary_600), (r22 & 16) != 0 ? null : null, (r22 & 32) != 0 ? null : null, (r22 & 64) != 0 ? null : null, (r22 & 128) != 0 ? null : null, function1);
    }

    public final void tryOpenUrlExternally(Context context, String url, Function1<? super Exception, Unit> onFailure) {
        C9971q.m14633g(context, "context");
        C9971q.m14633g(url, "url");
        C9971q.m14633g(onFailure, "onFailure");
        try {
            Uri uri = Uri.parse(url);
            C9971q.m14634f(uri, "uri");
            openUrlExternally(context, uri, onFailure);
        } catch (Exception e) {
            onFailure.invoke(e);
        }
    }

    public final void tryOpenUrlWithCustomTabs(Context context, String url, Function1<? super Exception, Unit> onFailure) {
        C9971q.m14633g(context, "context");
        C9971q.m14633g(url, "url");
        C9971q.m14633g(onFailure, "onFailure");
        try {
            Uri uri = Uri.parse(url);
            C9971q.m14634f(uri, "uri");
            openUrlWithCustomTabs(context, uri, new BrowserManager$tryOpenUrlWithCustomTabs$1(context, url, onFailure));
        } catch (Exception unused) {
            tryOpenUrlExternally(context, url, onFailure);
        }
    }
}
