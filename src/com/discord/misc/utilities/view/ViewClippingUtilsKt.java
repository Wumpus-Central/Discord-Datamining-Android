package com.discord.misc.utilities.view;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000#\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0001\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0012\u0010\t\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\f"}, m15073d2 = {"circleOutlineProvider", "com/discord/misc/utilities/view/ViewClippingUtilsKt$circleOutlineProvider$1", "Lcom/discord/misc/utilities/view/ViewClippingUtilsKt$circleOutlineProvider$1;", "clipToCircle", "", "Landroid/view/View;", "clipToOutline", "outlineProvider", "Landroid/view/ViewOutlineProvider;", "clipToRoundedRectangle", "radiusPx", "", "misc_utilities_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class ViewClippingUtilsKt {
    private static final ViewClippingUtilsKt$circleOutlineProvider$1 circleOutlineProvider = new ViewOutlineProvider() { // from class: com.discord.misc.utilities.view.ViewClippingUtilsKt$circleOutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            C9677q.m14633g(view, "view");
            C9677q.m14633g(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), view.getHeight() / 2.0f);
        }
    };

    public static final void clipToCircle(View view) {
        C9677q.m14633g(view, "<this>");
        clipToOutline(view, circleOutlineProvider);
    }

    private static final void clipToOutline(View view, ViewOutlineProvider viewOutlineProvider) {
        view.setClipToOutline(true);
        view.setOutlineProvider(viewOutlineProvider);
    }

    public static final void clipToRoundedRectangle(View view, final int i) {
        C9677q.m14633g(view, "<this>");
        clipToOutline(view, new ViewOutlineProvider() { // from class: com.discord.misc.utilities.view.ViewClippingUtilsKt$clipToRoundedRectangle$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                C9677q.m14633g(view2, "view");
                C9677q.m14633g(outline, "outline");
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), i);
            }
        });
    }
}
