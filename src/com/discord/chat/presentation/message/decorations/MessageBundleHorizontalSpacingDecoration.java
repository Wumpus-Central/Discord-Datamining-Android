package com.discord.chat.presentation.message.decorations;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.message.MessageView;
import com.discord.misc.utilities.measure.ViewMeasuringWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m15073d2 = {"Lcom/discord/chat/presentation/message/decorations/MessageBundleHorizontalSpacingDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "leftMarginPx", "", "rightMarginPx", "(II)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class MessageBundleHorizontalSpacingDecoration extends RecyclerView.ItemDecoration {
    private final int leftMarginPx;
    private final int rightMarginPx;

    public MessageBundleHorizontalSpacingDecoration(int i, int i2) {
        this.leftMarginPx = i;
        this.rightMarginPx = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        C9971q.m14633g(outRect, "outRect");
        C9971q.m14633g(view, "view");
        C9971q.m14633g(parent, "parent");
        C9971q.m14633g(state, "state");
        View view2 = null;
        if (!(view instanceof ViewMeasuringWrapper)) {
            view = null;
        }
        ViewMeasuringWrapper viewMeasuringWrapper = (ViewMeasuringWrapper) view;
        if (viewMeasuringWrapper != null) {
            view2 = viewMeasuringWrapper.getView();
        }
        if (!(view2 instanceof MessageView)) {
            outRect.left = this.leftMarginPx;
            outRect.right = this.rightMarginPx;
        }
    }
}
