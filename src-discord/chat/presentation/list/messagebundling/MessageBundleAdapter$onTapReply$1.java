package com.discord.chat.presentation.list.messagebundling;

import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/primitives/MessageId;", "invoke-1xi1bu0", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MessageBundleAdapter$onTapReply$1 extends s implements Function1<MessageId, Unit> {
    public static final MessageBundleAdapter$onTapReply$1 INSTANCE = new MessageBundleAdapter$onTapReply$1();

    MessageBundleAdapter$onTapReply$1() {
        super(1);
    }

    @Override 
    public   Unit invoke(MessageId messageId) {
        m188invoke1xi1bu0(messageId.m598unboximpl());
        return Unit.f20663a;
    }

    
    public final void m188invoke1xi1bu0(String it) {
        q.g(it, "it");
    }
}
