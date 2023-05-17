package com.discord.chat.presentation.message.view.botuikit;

import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.bridge.botuikit.Component;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u0004¨\u0006\u0007"}, d2 = {"replaceViews", "", "Landroid/view/ViewGroup;", "views", "", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "Lcom/discord/chat/bridge/botuikit/Component;", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MessageComponentsViewKt {
    public static final void replaceViews(ViewGroup viewGroup, List<? extends ComponentView<? extends Component>> views) {
        q.g(viewGroup, "<this>");
        q.g(views, "views");
        int i10 = 0;
        for (Object obj : views) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                j.s();
            }
            ComponentView componentView = (ComponentView) obj;
            if (i10 >= viewGroup.getChildCount()) {
                q.e(componentView, "null cannot be cast to non-null type android.view.View");
                viewGroup.addView((View) componentView, i10);
            } else if (viewGroup.getChildAt(i10) != componentView) {
                viewGroup.removeViewAt(i10);
                q.e(componentView, "null cannot be cast to non-null type android.view.View");
                viewGroup.addView((View) componentView, i10);
            }
            i10 = i11;
        }
        if (views.size() < viewGroup.getChildCount()) {
            viewGroup.removeViews(views.size(), viewGroup.getChildCount() - views.size());
        }
    }
}
