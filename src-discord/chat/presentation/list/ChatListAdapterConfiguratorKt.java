package com.discord.chat.presentation.list;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.AutomodSystemMessageDelegate;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.delegate.BlockedGroupDelegate;
import com.discord.chat.presentation.list.delegate.CallSystemMessageDelegate;
import com.discord.chat.presentation.list.delegate.DeserializationErrorDelegate;
import com.discord.chat.presentation.list.delegate.DeserializationErrorMessageDelegate;
import com.discord.chat.presentation.list.delegate.EmbeddedActivityMessageDelegate;
import com.discord.chat.presentation.list.delegate.LoadingDelegate;
import com.discord.chat.presentation.list.delegate.PortalViewDelegate;
import com.discord.chat.presentation.list.delegate.RegularMessageDelegate;
import com.discord.chat.presentation.list.delegate.SeparatorDelegate;
import com.discord.chat.presentation.list.delegate.SystemMessageDelegate;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.hannesdorfmann.adapterdelegates4.AdapterDelegatesManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aj\u0010\u0000\u001a&\u0012\u001c\u0012\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0004\u0012\u0006\b\u0001\u0012\u00020\u00050\u00030\u0002\u0012\u0004\u0012\u00020\u00060\u00012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\b2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r2\u0010\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000bj\u0002`\u00102\u0006\u0010\u0011\u001a\u00020\u0012¨\u0006\u0013"}, d2 = {"chatListAdapterConfigurator", "", "Ljava/lang/Class;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "Landroid/view/View;", "", "delegatesManager", "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;", "", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "messageComponentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "Lcom/discord/chat/presentation/list/delegate/MessageComponentProvider;", "messageAccessoriesRecycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChatListAdapterConfiguratorKt {
    public static final Map<Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ? extends View>>, Integer> chatListAdapterConfigurator(AdapterDelegatesManager<List<ChatListItem>> delegatesManager, Function0<? extends ChatEventHandler> eventHandlerProvider, Function0<ComponentProvider> messageComponentProvider, RecyclerView.RecycledViewPool messageAccessoriesRecycledViewPool) {
        List<BaseChatListItemDelegate> l10;
        q.g(delegatesManager, "delegatesManager");
        q.g(eventHandlerProvider, "eventHandlerProvider");
        q.g(messageComponentProvider, "messageComponentProvider");
        q.g(messageAccessoriesRecycledViewPool, "messageAccessoriesRecycledViewPool");
        HashMap hashMap = new HashMap();
        l10 = j.l(new RegularMessageDelegate(eventHandlerProvider, messageComponentProvider, messageAccessoriesRecycledViewPool), new SystemMessageDelegate(eventHandlerProvider, messageAccessoriesRecycledViewPool), new AutomodSystemMessageDelegate(eventHandlerProvider, messageComponentProvider, messageAccessoriesRecycledViewPool), new CallSystemMessageDelegate(eventHandlerProvider), new EmbeddedActivityMessageDelegate(eventHandlerProvider), new SeparatorDelegate(eventHandlerProvider), new LoadingDelegate(eventHandlerProvider), new BlockedGroupDelegate(eventHandlerProvider, messageComponentProvider), new PortalViewDelegate(eventHandlerProvider), new DeserializationErrorMessageDelegate(eventHandlerProvider), new DeserializationErrorDelegate(eventHandlerProvider));
        for (BaseChatListItemDelegate baseChatListItemDelegate : l10) {
            delegatesManager.c(baseChatListItemDelegate);
            hashMap.put(baseChatListItemDelegate.getClass(), Integer.valueOf(delegatesManager.f(baseChatListItemDelegate)));
        }
        return hashMap;
    }
}
