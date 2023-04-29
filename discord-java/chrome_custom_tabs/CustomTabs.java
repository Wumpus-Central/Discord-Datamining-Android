package com.discord.chrome_custom_tabs;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import n.a;
import n.b;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016Jy\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b2\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/discord/chrome_custom_tabs/CustomTabs;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "", "showTitle", "", "toolbarColor", "animShowEnterResId", "animShowExitResId", "animHideEnterResId", "animHideExitResId", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "onFailure", "openUrlWithCustomTabs", "(Landroid/content/Context;Landroid/net/Uri;ZILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "<init>", "()V", "chrome_custom_tabs_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class CustomTabs {
    public static final CustomTabs INSTANCE = new CustomTabs();

    private CustomTabs() {
    }

    public final void openUrlWithCustomTabs(Context context, Uri uri, boolean z10, int i10, Integer num, Integer num2, Integer num3, Integer num4, Function1<? super Exception, Unit> onFailure) {
        q.g(context, "context");
        q.g(uri, "uri");
        q.g(onFailure, "onFailure");
        if (CustomTabsPackages.INSTANCE.getCustomTabsDefaultPackage(context) != null) {
            a a10 = new a.C0345a().b(i10).d(i10).c(i10).a();
            q.f(a10, "Builder()\n              …\n                .build()");
            b.a e10 = new b.a().b(a10).e(z10);
            if (!(num == null || num2 == null)) {
                e10.f(context, num.intValue(), num2.intValue());
            }
            if (!(num3 == null || num4 == null)) {
                e10.c(context, num3.intValue(), num4.intValue());
            }
            b a11 = e10.a();
            q.f(a11, "Builder()\n              …\n                .build()");
            try {
                a11.f23609a.setData(uri);
                a11.a(context, uri);
            } catch (ActivityNotFoundException e11) {
                onFailure.invoke(e11);
            }
        } else {
            onFailure.invoke(new IllegalStateException("Unable to find custom tabs package."));
        }
    }
}
