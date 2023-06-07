package com.discord.chat.presentation.list.delegate.messagebundling;

import android.content.Context;
import android.view.View;
import com.discord.chat.presentation.list.item.MessageBundleConversationItem;
import com.discord.chat.presentation.list.item.MessageBundleItem;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.presentation.list.messagebundling.MessageBundleConversationView;
import com.discord.primitives.MessageId;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J.\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R1\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u00128\u0006@\u0006X\u0086\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleConversationDelegate;", "Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleBaseDelegate;", "", "Lcom/discord/chat/presentation/list/item/MessageBundleItem;", "items", "", ViewProps.POSITION, "", "isForViewType", "Landroid/view/View;", "view", "item", "", "onBindViewHolder", "Landroid/content/Context;", "context", "Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;", "createView", "Lkotlin/Function1;", "Lcom/discord/primitives/MessageId;", "onTapReply", "Lkotlin/jvm/functions/Function1;", "getOnTapReply", "()Lkotlin/jvm/functions/Function1;", "setOnTapReply", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function3;", "onMeasured", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class MessageBundleConversationDelegate extends MessageBundleBaseDelegate {
    private Function1<? super MessageId, Unit> onTapReply = MessageBundleConversationDelegate$onTapReply$1.INSTANCE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageBundleConversationDelegate(Function3<? super View, ? super Integer, ? super Integer, Unit> onMeasured) {
        super(onMeasured);
        q.g(onMeasured, "onMeasured");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(MessageBundleConversationDelegate this$0, MessageBundleItem item, View view) {
        q.g(this$0, "this$0");
        q.g(item, "$item");
        this$0.onTapReply.invoke(MessageId.m572boximpl(((MessageBundleConversationItem) item).getMessageItem().getMessage().m17getId3Eiw7ao()));
    }

    public final Function1<MessageId, Unit> getOnTapReply() {
        return this.onTapReply;
    }

    @Override // com.discord.chat.presentation.list.delegate.messagebundling.MessageBundleBaseDelegate
    public void onBindViewHolder(View view, final MessageBundleItem item, List<? extends MessageBundleItem> items, int i10) {
        q.g(view, "view");
        q.g(item, "item");
        q.g(items, "items");
        if ((view instanceof MessageBundleConversationView) && (item instanceof MessageBundleConversationItem)) {
            MessageBundleConversationView messageBundleConversationView = (MessageBundleConversationView) view;
            MessageBundleConversationItem messageBundleConversationItem = (MessageBundleConversationItem) item;
            MessageItem messageItem = messageBundleConversationItem.getMessageItem();
            MessageItem messageItem2 = messageBundleConversationItem.getMessageItem();
            Context context = messageBundleConversationView.getContext();
            q.f(context, "view.context");
            messageBundleConversationView.configure(messageItem, MessageBundleDelegateUtilsKt.getEventHandler(messageItem2, context));
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(view, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.list.delegate.messagebundling.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MessageBundleConversationDelegate.onBindViewHolder$lambda$0(MessageBundleConversationDelegate.this, item, view2);
                }
            }, 1, null);
        }
    }

    public final void setOnTapReply(Function1<? super MessageId, Unit> function1) {
        q.g(function1, "<set-?>");
        this.onTapReply = function1;
    }

    @Override // com.discord.chat.presentation.list.delegate.messagebundling.MessageBundleBaseDelegate
    public MessageBundleConversationView createView(Context context) {
        q.g(context, "context");
        return new MessageBundleConversationView(context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isForViewType(List<? extends MessageBundleItem> items, int i10) {
        q.g(items, "items");
        return items.get(i10) instanceof MessageBundleConversationItem;
    }
}
