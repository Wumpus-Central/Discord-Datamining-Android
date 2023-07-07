package com.discord.chat.presentation.list.delegate.messagebundling;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.messageframe.MessageFrame;
import com.discord.chat.presentation.list.item.MessageBundleItem;
import com.discord.chat.presentation.list.item.MessageBundleMessageItem;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.presentation.message.MessageView;
import com.discord.chat.presentation.root.MessageContext;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0006\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J.\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleMessageDelegate;", "Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleBaseDelegate;", "", "", ViewProps.POSITION, "Lcom/discord/chat/presentation/message/MessageView$ChainPart;", "getChainPart", "Lcom/discord/chat/presentation/list/item/MessageBundleItem;", "items", "", "isForViewType", "Landroid/content/Context;", "context", "Lcom/discord/chat/presentation/message/MessageView;", "createView", "Landroid/view/View;", "view", "item", "", "onBindViewHolder", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "messageAccessoriesViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "getMessageAccessoriesViewPool", "()Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "setMessageAccessoriesViewPool", "(Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V", "Lkotlin/Function3;", "onMeasured", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class MessageBundleMessageDelegate extends MessageBundleBaseDelegate {
    private RecyclerView.RecycledViewPool messageAccessoriesViewPool;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageBundleMessageDelegate(Function3<? super View, ? super Integer, ? super Integer, Unit> onMeasured) {
        super(onMeasured);
        q.g(onMeasured, "onMeasured");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MessageView.ChainPart getChainPart(List<?> list, int i10) {
        int size = list.size();
        if (size == 0 || size == 1) {
            return MessageView.ChainPart.ONLY;
        }
        if (i10 == 0) {
            return MessageView.ChainPart.START;
        }
        if (i10 == size - 1) {
            return MessageView.ChainPart.END;
        }
        return MessageView.ChainPart.MIDDLE;
    }

    public final RecyclerView.RecycledViewPool getMessageAccessoriesViewPool() {
        return this.messageAccessoriesViewPool;
    }

    @Override // com.discord.chat.presentation.list.delegate.messagebundling.MessageBundleBaseDelegate
    public void onBindViewHolder(View view, MessageBundleItem item, List<? extends MessageBundleItem> items, int i10) {
        q.g(view, "view");
        q.g(item, "item");
        q.g(items, "items");
        if ((view instanceof MessageView) && (item instanceof MessageBundleMessageItem)) {
            MessageView messageView = (MessageView) view;
            MessageBundleMessageItem messageBundleMessageItem = (MessageBundleMessageItem) item;
            Message message = messageBundleMessageItem.getMessageItem().getMessage();
            MessageContext messageContext = messageBundleMessageItem.getMessageItem().getMessageContext();
            MessageFrame messageFrame = messageBundleMessageItem.getMessageItem().getMessageFrame();
            MessageItem messageItem = messageBundleMessageItem.getMessageItem();
            Context context = messageView.getContext();
            q.f(context, "view.context");
            MessageView.setMessage$default(messageView, message, messageContext, messageFrame, MessageBundleDelegateUtilsKt.getEventHandler(messageItem, context), null, new MessageBundleMessageDelegate$onBindViewHolder$1(this, items, i10), false, messageBundleMessageItem.getMessageItem().isHighlight(), messageBundleMessageItem.getMessageItem().getRenderContentOnly(), 80, null);
            RecyclerView.RecycledViewPool recycledViewPool = this.messageAccessoriesViewPool;
            if (recycledViewPool != null) {
                messageView.setAccessoriesRecycledViewPool(recycledViewPool);
            }
        }
    }

    public final void setMessageAccessoriesViewPool(RecyclerView.RecycledViewPool recycledViewPool) {
        this.messageAccessoriesViewPool = recycledViewPool;
    }

    @Override // com.discord.chat.presentation.list.delegate.messagebundling.MessageBundleBaseDelegate
    public MessageView createView(Context context) {
        q.g(context, "context");
        return new MessageView(context, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isForViewType(List<? extends MessageBundleItem> items, int i10) {
        q.g(items, "items");
        return items.get(i10) instanceof MessageBundleMessageItem;
    }
}
