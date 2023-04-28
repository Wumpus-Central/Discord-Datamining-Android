package com.discord.chrome_custom_tabs;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9677q;
import p236n.C10419a;
import p236n.C10421b;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016Jy\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b2\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m15073d2 = {"Lcom/discord/chrome_custom_tabs/CustomTabs;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "", "showTitle", "", "toolbarColor", "animShowEnterResId", "animShowExitResId", "animHideEnterResId", "animHideExitResId", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "onFailure", "openUrlWithCustomTabs", "(Landroid/content/Context;Landroid/net/Uri;ZILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "<init>", "()V", "chrome_custom_tabs_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class CustomTabs {
    public static final CustomTabs INSTANCE = new CustomTabs();

    private CustomTabs() {
    }

    public final void openUrlWithCustomTabs(Context context, Uri uri, boolean z, int i, Integer num, Integer num2, Integer num3, Integer num4, Function1<? super Exception, Unit> onFailure) {
        C9677q.m14633g(context, "context");
        C9677q.m14633g(uri, "uri");
        C9677q.m14633g(onFailure, "onFailure");
        if (CustomTabsPackages.INSTANCE.getCustomTabsDefaultPackage(context) != null) {
            C10419a a = new C10419a.C10420a().m12668b(i).m12666d(i).m12667c(i).m12669a();
            C9677q.m14634f(a, "Builder()\n              …\n                .build()");
            C10421b.C10422a e = new C10421b.C10422a().m12663b(a).m12660e(z);
            if (!(num == null || num2 == null)) {
                e.m12659f(context, num.intValue(), num2.intValue());
            }
            if (!(num3 == null || num4 == null)) {
                e.m12662c(context, num3.intValue(), num4.intValue());
            }
            C10421b a2 = e.m12664a();
            C9677q.m14634f(a2, "Builder()\n              …\n                .build()");
            try {
                a2.f27415a.setData(uri);
                a2.m12665a(context, uri);
            } catch (ActivityNotFoundException e2) {
                onFailure.invoke(e2);
            }
        } else {
            onFailure.invoke(new IllegalStateException("Unable to find custom tabs package."));
        }
    }
}
