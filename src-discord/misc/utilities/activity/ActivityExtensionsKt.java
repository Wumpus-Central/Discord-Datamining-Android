package com.discord.misc.utilities.activity;

import android.app.Activity;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0004"}, d2 = {"getContentView", "Landroid/view/View;", "Landroid/app/Activity;", "getRootView", "misc_utilities_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ActivityExtensionsKt {
    public static final View getContentView(Activity activity) {
        q.g(activity, "<this>");
        return activity.findViewById(16908290);
    }

    public static final View getRootView(Activity activity) {
        q.g(activity, "<this>");
        View contentView = getContentView(activity);
        if (contentView != null) {
            return contentView.getRootView();
        }
        return null;
    }
}
