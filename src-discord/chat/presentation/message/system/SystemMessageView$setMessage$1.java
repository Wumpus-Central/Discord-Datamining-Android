package com.discord.chat.presentation.message.system;

import android.view.View;
import androidx.core.view.w0;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.message.MessageViewAccessibilityDelegate;
import com.discord.chat.presentation.message.view.MessageContentView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/presentation/message/view/MessageContentView;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class SystemMessageView$setMessage$1 extends s implements Function1<MessageContentView, Unit> {
    final  Message $message;
    final  View.OnLongClickListener $onLongClick;
    final  SystemMessageView this$0;

    
    
    public SystemMessageView$setMessage$1(SystemMessageView systemMessageView, Message message, View.OnLongClickListener onLongClickListener) {
        super(1);
        this.this$0 = systemMessageView;
        this.$message = message;
        this.$onLongClick = onLongClickListener;
    }

    
    public static final void invoke$lambda$0(View view) {
    }

    @Override 
    public   Unit invoke(MessageContentView messageContentView) {
        invoke2(messageContentView);
        return Unit.f21444a;
    }

    
    public final void invoke2(MessageContentView it) {
        q.h(it, "it");
        w0.q0(this.this$0, new MessageViewAccessibilityDelegate(this.$message, it, new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                SystemMessageView$setMessage$1.invoke$lambda$0(view);
            }
        }, this.$onLongClick));
    }
}
