package com.discord.chat.presentation.list.delegate;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m15073d2 = {"Lcom/discord/chat/presentation/list/delegate/ChatListItemViewHolder;", "V", "Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "Landroid/view/View;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ChatListItemViewHolder<V extends View> extends RecyclerView.ViewHolder {
    private final V view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListItemViewHolder(V view) {
        super(view);
        C9677q.m14633g(view, "view");
        this.view = view;
    }

    public final V getView() {
        return this.view;
    }
}
