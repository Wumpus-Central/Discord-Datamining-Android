package com.discord.chat.presentation.message;

import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class MessageAccessoriesAdapter$onCreateViewHolder$2 extends C9968n implements Function2<Sticker, MessageId, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageAccessoriesAdapter$onCreateViewHolder$2(Object obj) {
        super(2, obj, ChatEventHandler.class, "onWelcomeReplyClicked", "onWelcomeReplyClicked-Ayv7vGE(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Sticker sticker, MessageId messageId) {
        m41758invokeAyv7vGE(sticker, messageId.m42123unboximpl());
        return Unit.f22042a;
    }

    /* renamed from: invoke-Ayv7vGE  reason: not valid java name */
    public final void m41758invokeAyv7vGE(Sticker p0, String p1) {
        C9971q.m14633g(p0, "p0");
        C9971q.m14633g(p1, "p1");
        ((ChatEventHandler) this.receiver).mo41731onWelcomeReplyClickedAyv7vGE(p0, p1);
    }
}
