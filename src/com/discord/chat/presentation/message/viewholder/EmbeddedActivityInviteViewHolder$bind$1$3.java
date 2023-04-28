package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9674n;
import kotlin.jvm.internal.C9677q;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class EmbeddedActivityInviteViewHolder$bind$1$3 extends C9674n implements Function3<String, String, String, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public EmbeddedActivityInviteViewHolder$bind$1$3(Object obj) {
        super(3, obj, ChatEventHandler.class, "onTapChannel", "onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3) {
        invoke2(str, str2, str3);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String p0, String str, String str2) {
        C9677q.m14633g(p0, "p0");
        ((ChatEventHandler) this.receiver).onTapChannel(p0, str, str2);
    }
}
