package com.discord.portals;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.discord.crash_reporting.CrashReporting;
import java.util.Map;
import jf.x;
import kf.u;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"removeFromParent", "", "Landroid/view/View;", "portals_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class PortalViewContextUtilsKt {
    public static final void removeFromParent(View view) {
        Map e10;
        q.h(view, "<this>");
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
            q.g(simpleName, "PortalViewContextManager.javaClass.simpleName");
            e10 = u.e(x.a("parentView", view.getParent().getClass().getSimpleName()));
            CrashReporting.addBreadcrumb$default(crashReporting, simpleName, e10, null, 4, null);
        }
    }
}
