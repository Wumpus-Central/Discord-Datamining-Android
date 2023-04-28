package com.discord.chat.presentation.list.delegate;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.DeserializationErrorMessageItem;
import com.discord.chat.presentation.message.ErrorMessageView;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0002\u0010\bJ&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0017J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, m15073d2 = {"Lcom/discord/chat/presentation/list/delegate/DeserializationErrorMessageDelegate;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/DeserializationErrorMessageItem;", "Lcom/discord/chat/presentation/message/ErrorMessageView;", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "(Lkotlin/jvm/functions/Function0;)V", "bindView", "", "view", "item", "metadata", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "createView", "parent", "Landroid/view/ViewGroup;", "isForItem", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.POSITION, "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class DeserializationErrorMessageDelegate extends BaseChatListItemDelegate<DeserializationErrorMessageItem, ErrorMessageView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializationErrorMessageDelegate(Function0<? extends ChatEventHandler> eventHandlerProvider) {
        super(eventHandlerProvider, null, 2, null);
        C9677q.m14633g(eventHandlerProvider, "eventHandlerProvider");
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public boolean isForItem(ChatListItem item, int i) {
        C9677q.m14633g(item, "item");
        return item instanceof DeserializationErrorMessageItem;
    }

    @SuppressLint({"SetTextI18n"})
    public void bindView(ErrorMessageView view, DeserializationErrorMessageItem item, BaseChatListItemDelegate.Metadata<ErrorMessageView> metadata) {
        C9677q.m14633g(view, "view");
        C9677q.m14633g(item, "item");
        C9677q.m14633g(metadata, "metadata");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C9677q.m14635e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(SizeUtilsKt.getDpToPx(16), 0, SizeUtilsKt.getDpToPx(16), 0);
        view.setErrorMessage(item.getMessage());
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public ErrorMessageView createView(ViewGroup parent) {
        C9677q.m14633g(parent, "parent");
        Context context = parent.getContext();
        C9677q.m14634f(context, "parent.context");
        ErrorMessageView errorMessageView = new ErrorMessageView(context, null, 2, null);
        int dpToPx = SizeUtilsKt.getDpToPx(8);
        errorMessageView.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        return errorMessageView;
    }
}
