package com.discord.portals;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.discord.crash_reporting.CrashReporting;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import nf.C10853x;
import p268of.C11052u;

@Metadata(m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m15073d2 = {"removeFromParent", "", "Landroid/view/View;", "portals_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes3.dex */
public final class PortalViewContextUtilsKt {
    public static final void removeFromParent(View view) {
        Map e;
        C9677q.m14633g(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.endViewTransition(view);
                viewGroup.removeView(view);
            }
        }
        if (view.getParent() != null) {
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            String simpleName = PortalViewContextManager.INSTANCE.getClass().getSimpleName();
            C9677q.m14634f(simpleName, "PortalViewContextManager.javaClass.simpleName");
            e = C11052u.m10254e(C10853x.m10921a("parentView", view.getParent().getClass().getSimpleName()));
            CrashReporting.addBreadcrumb$default(crashReporting, simpleName, e, null, 4, null);
        }
    }
}
