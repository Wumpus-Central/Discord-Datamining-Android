package com.discord.chat.messagemanager;

import android.content.Context;
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

public final class MessageViewManagers$MessageBundleViewManager$createViewInstance$2$1$1 extends s implements Function1<MessageId, Unit> {
    final  MessageBundleView $this_apply;
    final  ViewMeasuringWrapper<MessageBundleView> $wrapper;
    final  MessageViewManagers.MessageBundleViewManager this$0;

    
    
    public MessageViewManagers$MessageBundleViewManager$createViewInstance$2$1$1(MessageViewManagers.MessageBundleViewManager messageBundleViewManager, MessageBundleView messageBundleView, ViewMeasuringWrapper<MessageBundleView> viewMeasuringWrapper) {
        super(1);
        this.this$0 = messageBundleViewManager;
        this.$this_apply = messageBundleView;
        this.$wrapper = viewMeasuringWrapper;
    }

    @Override 
    public   Unit invoke(MessageId messageId) {
        m146invoke1xi1bu0(messageId.m613unboximpl());
        return Unit.f21036a;
    }

    
    public final void m146invoke1xi1bu0(String messageId) {
        q.h(messageId, "messageId");
        MessageViewManagers.MessageBundleViewManager messageBundleViewManager = this.this$0;
        Context context = this.$this_apply.getContext();
        q.g(context, "context");
        messageBundleViewManager.m145emitOnTruncateMessageJPrav84(context, this.$wrapper.getId(), messageId);
    }
}
