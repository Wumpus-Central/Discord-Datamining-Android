package com.discord.reactions;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/reactions/AddBurstReactionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "addReactionView", "Lcom/discord/reactions/AddReactionView;", "(Lcom/discord/reactions/AddReactionView;)V", "bind", "", "addReactionLabel", "", "addNewReactionAccessibilityLabel", "onAddReactionClick", "Landroid/view/View$OnClickListener;", "reactionsTheme", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "reactions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class AddBurstReactionViewHolder extends RecyclerView.ViewHolder {
    private final AddReactionView addReactionView;

    
    public AddBurstReactionViewHolder(AddReactionView addReactionView) {
        super(addReactionView);
        q.h(addReactionView, "addReactionView");
        this.addReactionView = addReactionView;
    }

    public final void bind(String addReactionLabel, String addNewReactionAccessibilityLabel, View.OnClickListener onAddReactionClick, ReactionView.ReactionsTheme reactionsTheme) {
        q.h(addReactionLabel, "addReactionLabel");
        q.h(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        q.h(onAddReactionClick, "onAddReactionClick");
        AddReactionView addReactionView = this.addReactionView;
        addReactionView.configure(addReactionLabel, reactionsTheme, true);
        addReactionView.setContentDescription(addNewReactionAccessibilityLabel);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(addReactionView, false, onAddReactionClick, 1, null);
    }
}
