package com.discord.chat.presentation.list.delegate;

import android.content.Context;
import android.view.ViewGroup;
import com.discord.chat.presentation.blockedmessage.BlockedMessageGroupView;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.item.BlockedGroupChatListItem;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007\u0012\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\t0\u0005j\u0002`\n¢\u0006\u0002\u0010\u000bJ&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0018\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\u0004\u0012\u00020\t0\u0005j\u0002`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/presentation/list/delegate/BlockedGroupDelegate;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/BlockedGroupChatListItem;", "Lcom/discord/chat/presentation/blockedmessage/BlockedMessageGroupView;", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "messageComponentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "Lcom/discord/chat/presentation/list/delegate/MessageComponentProvider;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "bindView", "", "view", "item", "metadata", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "createView", "parent", "Landroid/view/ViewGroup;", "isForItem", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.POSITION, "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BlockedGroupDelegate extends BaseChatListItemDelegate<BlockedGroupChatListItem, BlockedMessageGroupView> {
    private final Function0<ChatEventHandler> eventHandlerProvider;
    private final Function0<ComponentProvider> messageComponentProvider;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/discord/chat/presentation/blockedmessage/BlockedMessageGroupView;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.chat.presentation.list.delegate.BlockedGroupDelegate$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass1 extends s implements Function1<BlockedMessageGroupView, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BlockedMessageGroupView blockedMessageGroupView) {
            invoke2(blockedMessageGroupView);
            return Unit.f22042a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(BlockedMessageGroupView blockedMessageGroupView) {
            q.g(blockedMessageGroupView, "$this$null");
            BlockedGroupDelegateKt.setupLayout(blockedMessageGroupView);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BlockedGroupDelegate(Function0<? extends ChatEventHandler> eventHandlerProvider, Function0<ComponentProvider> messageComponentProvider) {
        super(eventHandlerProvider, AnonymousClass1.INSTANCE);
        q.g(eventHandlerProvider, "eventHandlerProvider");
        q.g(messageComponentProvider, "messageComponentProvider");
        this.eventHandlerProvider = eventHandlerProvider;
        this.messageComponentProvider = messageComponentProvider;
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public boolean isForItem(ChatListItem item, int i10) {
        q.g(item, "item");
        return item instanceof BlockedGroupChatListItem;
    }

    public void bindView(BlockedMessageGroupView view, BlockedGroupChatListItem item, BaseChatListItemDelegate.Metadata<BlockedMessageGroupView> metadata) {
        q.g(view, "view");
        q.g(item, "item");
        q.g(metadata, "metadata");
        view.bind(item, getEventHandler());
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public BlockedMessageGroupView createView(ViewGroup parent) {
        q.g(parent, "parent");
        Context context = parent.getContext();
        q.f(context, "parent.context");
        BlockedMessageGroupView blockedMessageGroupView = new BlockedMessageGroupView(context, null, 2, null);
        blockedMessageGroupView.setupUI(this.eventHandlerProvider, this.messageComponentProvider);
        return blockedMessageGroupView;
    }
}
