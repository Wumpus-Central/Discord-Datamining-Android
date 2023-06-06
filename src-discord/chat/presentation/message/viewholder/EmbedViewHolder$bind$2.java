package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public /* synthetic */ class EmbedViewHolder$bind$2 extends n implements Function3<MessageId, String, String, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public EmbedViewHolder$bind$2(Object obj) {
        super(3, obj, ChatEventHandler.class, "onLinkClicked", "onLinkClicked-u7_MRrM(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId, String str, String str2) {
        m318invokeu7_MRrM(messageId.m580unboximpl(), str, str2);
        return Unit.f22063a;
    }

    /* renamed from: invoke-u7_MRrM  reason: not valid java name */
    public final void m318invokeu7_MRrM(String p02, String p12, String str) {
        q.g(p02, "p0");
        q.g(p12, "p1");
        ((ChatEventHandler) this.receiver).mo142onLinkClickedu7_MRrM(p02, p12, str);
    }
}
