package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class EmbedViewHolder$bind$5 extends C9968n implements Function1<CharSequence, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public EmbedViewHolder$bind$5(Object obj) {
        super(1, obj, ChatEventHandler.class, "onTapCopyText", "onTapCopyText(Ljava/lang/CharSequence;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence p0) {
        C9971q.m14633g(p0, "p0");
        ((ChatEventHandler) this.receiver).onTapCopyText(p0);
    }
}
