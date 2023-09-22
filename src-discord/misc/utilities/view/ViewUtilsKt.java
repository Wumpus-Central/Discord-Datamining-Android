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

public final class ViewUtilsKt {
    public static final  <T extends ViewGroup> T findParentView(View view) {
        T t10;
        q.h(view, "<this>");
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

    
    
    
    public static final  <T extends android.view.ViewGroup> java.util.List<T> findParentViews(android.view.View r5) {
        
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
        q.h(view, "<this>");
        if (view.getLayoutDirection() == 0) {
            return true;
        }
        return false;
    }

    
    
    public static final void setOptionalText(android.widget.TextView r2, java.lang.CharSequence r3) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.misc.utilities.view.ViewUtilsKt.setOptionalText(android.widget.TextView, java.lang.CharSequence):void");
    }
}
