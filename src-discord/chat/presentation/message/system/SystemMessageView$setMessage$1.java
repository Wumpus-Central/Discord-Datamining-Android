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

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/presentation/message/view/MessageContentView;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SystemMessageView$setMessage$1 extends s implements Function1<MessageContentView, Unit> {
    final /* synthetic */ Message $message;
    final /* synthetic */ View.OnLongClickListener $onLongClick;
    final /* synthetic */ SystemMessageView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemMessageView$setMessage$1(SystemMessageView systemMessageView, Message message, View.OnLongClickListener onLongClickListener) {
        super(1);
        this.this$0 = systemMessageView;
        this.$message = message;
        this.$onLongClick = onLongClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(View view) {
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MessageContentView messageContentView) {
        invoke2(messageContentView);
        return Unit.f22105a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MessageContentView it) {
        q.g(it, "it");
        w0.q0(this.this$0, new MessageViewAccessibilityDelegate(this.$message, it, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.system.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SystemMessageView$setMessage$1.invoke$lambda$0(view);
            }
        }, this.$onLongClick));
    }
}
