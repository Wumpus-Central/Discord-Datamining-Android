package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class EmbedViewHolder$bind$2 extends C9968n implements Function3<MessageId, String, String, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public EmbedViewHolder$bind$2(Object obj) {
        super(3, obj, ChatEventHandler.class, "onLinkClicked", "onLinkClicked-u7_MRrM(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId, String str, String str2) {
        m41879invokeu7_MRrM(messageId.m42123unboximpl(), str, str2);
        return Unit.f22042a;
    }

    /* renamed from: invoke-u7_MRrM  reason: not valid java name */
    public final void m41879invokeu7_MRrM(String p0, String p1, String str) {
        C9971q.m14633g(p0, "p0");
        C9971q.m14633g(p1, "p1");
        ((ChatEventHandler) this.receiver).mo41704onLinkClickedu7_MRrM(p0, p1, str);
    }
}
