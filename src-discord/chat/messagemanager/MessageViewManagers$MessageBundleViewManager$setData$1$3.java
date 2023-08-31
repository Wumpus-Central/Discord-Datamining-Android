package com.discord.chat.messagemanager;

import com.discord.chat.messagemanager.MessageViewManagers;
import com.discord.chat.presentation.list.messagebundling.MessageBundleView;
import com.discord.misc.utilities.measure.ViewMeasuringWrapper;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "messageId", "Lcom/discord/primitives/MessageId;", "invoke-1xi1bu0", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MessageViewManagers$MessageBundleViewManager$setData$1$3 extends s implements Function1<MessageId, Unit> {
    final  ViewMeasuringWrapper<MessageBundleView> $wrappedView;
    final  MessageViewManagers.MessageBundleViewManager this$0;

    
    
    public MessageViewManagers$MessageBundleViewManager$setData$1$3(MessageViewManagers.MessageBundleViewManager messageBundleViewManager, ViewMeasuringWrapper<MessageBundleView> viewMeasuringWrapper) {
        super(1);
        this.this$0 = messageBundleViewManager;
        this.$wrappedView = viewMeasuringWrapper;
    }

    @Override 
    public   Unit invoke(MessageId messageId) {
        m155invoke1xi1bu0(messageId.m625unboximpl());
        return Unit.f21215a;
    }

    
    public final void m155invoke1xi1bu0(String messageId) {
        q.h(messageId, "messageId");
        this.this$0.m152emitOnTapReplyAyv7vGE(this.$wrappedView, messageId);
    }
}
