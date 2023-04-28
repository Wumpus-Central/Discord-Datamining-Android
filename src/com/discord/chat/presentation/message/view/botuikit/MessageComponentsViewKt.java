package com.discord.chat.presentation.message.view.botuikit;

import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.bridge.botuikit.Component;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9610j;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u0004¨\u0006\u0007"}, m15073d2 = {"replaceViews", "", "Landroid/view/ViewGroup;", "views", "", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "Lcom/discord/chat/bridge/botuikit/Component;", "chat_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class MessageComponentsViewKt {
    public static final void replaceViews(ViewGroup viewGroup, List<? extends ComponentView<? extends Component>> views) {
        C9677q.m14633g(viewGroup, "<this>");
        C9677q.m14633g(views, "views");
        int i = 0;
        for (Object obj : views) {
            int i2 = i + 1;
            if (i < 0) {
                C9610j.m14810s();
            }
            ComponentView componentView = (ComponentView) obj;
            if (i >= viewGroup.getChildCount()) {
                C9677q.m14635e(componentView, "null cannot be cast to non-null type android.view.View");
                viewGroup.addView((View) componentView, i);
            } else if (viewGroup.getChildAt(i) != componentView) {
                viewGroup.removeViewAt(i);
                C9677q.m14635e(componentView, "null cannot be cast to non-null type android.view.View");
                viewGroup.addView((View) componentView, i);
            }
            i = i2;
        }
        if (views.size() < viewGroup.getChildCount()) {
            viewGroup.removeViews(views.size(), viewGroup.getChildCount() - views.size());
        }
    }
}
