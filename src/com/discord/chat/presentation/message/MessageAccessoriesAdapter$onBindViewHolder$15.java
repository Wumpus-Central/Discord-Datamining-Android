package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9674n;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class MessageAccessoriesAdapter$onBindViewHolder$15 extends C9674n implements Function1<MessageId, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageAccessoriesAdapter$onBindViewHolder$15(Object obj) {
        super(1, obj, ChatEventHandler.class, "onTapSeeMore", "onTapSeeMore-1xi1bu0(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId) {
        m41749invoke1xi1bu0(messageId.m42123unboximpl());
        return Unit.f25780a;
    }

    /* renamed from: invoke-1xi1bu0  reason: not valid java name */
    public final void m41749invoke1xi1bu0(String p0) {
        C9677q.m14633g(p0, "p0");
        ((ChatEventHandler) this.receiver).mo41725onTapSeeMore1xi1bu0(p0);
    }
}
