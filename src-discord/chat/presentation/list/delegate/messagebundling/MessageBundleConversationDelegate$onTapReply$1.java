package com.discord.chat.presentation.list.delegate.messagebundling;

import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/primitives/MessageId;", "invoke-1xi1bu0", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MessageBundleConversationDelegate$onTapReply$1 extends s implements Function1<MessageId, Unit> {
    public static final MessageBundleConversationDelegate$onTapReply$1 INSTANCE = new MessageBundleConversationDelegate$onTapReply$1();

    MessageBundleConversationDelegate$onTapReply$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId) {
        m177invoke1xi1bu0(messageId.m571unboximpl());
        return Unit.f22035a;
    }

    /* renamed from: invoke-1xi1bu0  reason: not valid java name */
    public final void m177invoke1xi1bu0(String it) {
        q.g(it, "it");
    }
}