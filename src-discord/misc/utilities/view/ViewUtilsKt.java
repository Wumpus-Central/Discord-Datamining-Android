package com.discord.misc.utilities.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u001a\u0015\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0086\u0010\u001a \u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0006*\u00020\u0007H\u0086\b¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\n\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0006*\u00020\u0007H\u0086\b\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\u0007\u001a\u0014\u0010\r\u001a\u00020\u000e*\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¨\u0006\u0012"}, d2 = {"getWindow", "Landroid/view/Window;", "context", "Landroid/content/Context;", "findParentView", "T", "Landroid/view/ViewGroup;", "Landroid/view/View;", "(Landroid/view/View;)Landroid/view/ViewGroup;", "findParentViews", "", "isLtr", "", "setOptionalText", "", "Landroid/widget/TextView;", "text", "", "misc_utilities_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewUtilsKt {
    public static final /* synthetic */ <T extends ViewGroup> T findParentView(View view) {
        T t10;
        q.g(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            t10 = (T) ((ViewGroup) parent);
        } else {
            t10 = null;
        }
        if (t10 == null) {
            return null;
        }
        q.m(2, "T");
        return t10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0020 -> B:10:0x0021). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ <T extends android.view.ViewGroup> java.util.List<T> findParentViews(android.view.View r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.q.g(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.ViewParent r5 = r5.getParent()
            boolean r1 = r5 instanceof android.view.ViewGroup
            r2 = 0
            if (r1 == 0) goto L_0x0016
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L_0x0017
        L_0x0016:
            r5 = r2
        L_0x0017:
            java.lang.String r1 = "T"
            r3 = 2
            if (r5 == 0) goto L_0x0020
            kotlin.jvm.internal.q.m(r3, r1)
            goto L_0x0021
        L_0x0020:
            r5 = r2
        L_0x0021:
            if (r5 == 0) goto L_0x0038
            r0.add(r5)
            android.view.ViewParent r5 = r5.getParent()
            boolean r4 = r5 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x0031
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L_0x0032
        L_0x0031:
            r5 = r2
        L_0x0032:
            if (r5 == 0) goto L_0x0020
            kotlin.jvm.internal.q.m(r3, r1)
            goto L_0x0021
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.misc.utilities.view.ViewUtilsKt.findParentViews(android.view.View):java.util.List");
    }

    public static final Window getWindow(Context context) {
        ContextWrapper contextWrapper;
        while (context != null) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow();
            }
            if (context instanceof ContextWrapper) {
                contextWrapper = (ContextWrapper) context;
            } else {
                contextWrapper = null;
            }
            if (contextWrapper != null) {
                context = contextWrapper.getBaseContext();
            } else {
                context = null;
            }
        }
        return null;
    }

    public static final boolean isLtr(View view) {
        q.g(view, "<this>");
        if (view.getLayoutDirection() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void setOptionalText(android.widget.TextView r2, java.lang.CharSequence r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.q.g(r2, r0)
            r2.setText(r3)
            r0 = 0
            r1 = 1
            if (r3 == 0) goto L_0x0015
            boolean r3 = ji.l.w(r3)
            if (r3 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r3 = r0
            goto L_0x0016
        L_0x0015:
            r3 = r1
        L_0x0016:
            r3 = r3 ^ r1
            if (r3 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r0 = 8
        L_0x001c:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.misc.utilities.view.ViewUtilsKt.setOptionalText(android.widget.TextView, java.lang.CharSequence):void");
    }
}
