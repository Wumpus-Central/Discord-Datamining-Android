package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class GuildEventInviteViewHolder$bind$1$1$10 extends n implements Function1<MessageId, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public GuildEventInviteViewHolder$bind$1$1$10(Object obj) {
        super(1, obj, ChatEventHandler.class, "onTapSeeMore", "onTapSeeMore-1xi1bu0(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId) {
        m324invoke1xi1bu0(messageId.m580unboximpl());
        return Unit.f22080a;
    }

    /* renamed from: invoke-1xi1bu0  reason: not valid java name */
    public final void m324invoke1xi1bu0(String p02) {
        q.g(p02, "p0");
        ((ChatEventHandler) this.receiver).mo164onTapSeeMore1xi1bu0(p02);
    }
}
