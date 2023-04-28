package com.discord.misc.utilities.activity;

import android.app.Activity;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0004"}, m15073d2 = {"getContentView", "Landroid/view/View;", "Landroid/app/Activity;", "getRootView", "misc_utilities_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class ActivityExtensionsKt {
    public static final View getContentView(Activity activity) {
        C9971q.m14633g(activity, "<this>");
        return activity.findViewById(16908290);
    }

    public static final View getRootView(Activity activity) {
        C9971q.m14633g(activity, "<this>");
        View contentView = getContentView(activity);
        if (contentView != null) {
            return contentView.getRootView();
        }
        return null;
    }
}
