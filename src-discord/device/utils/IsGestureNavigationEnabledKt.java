package com.discord.device.utils;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isGestureNavigationEnabled", "", "Landroid/content/Context;", "device_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IsGestureNavigationEnabledKt {
    public static final boolean isGestureNavigationEnabled(Context context) {
        int i10;
        q.g(context, "<this>");
        int identifier = context.getResources().getIdentifier("config_navBarInteractionMode", "integer", "android");
        if (identifier > 0) {
            i10 = context.getResources().getInteger(identifier);
        } else {
            i10 = 0;
        }
        if (i10 == NavigationType.GESTURE.getValue()) {
            return true;
        }
        return false;
    }
}
