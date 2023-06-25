package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
/* synthetic */ class ImageAttachmentViewHolder$bind$1 extends n implements Function1<String, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ImageAttachmentViewHolder$bind$1(Object obj) {
        super(1, obj, ChatEventHandler.class, "onTapShowAltText", "onTapShowAltText(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f20684a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String p02) {
        q.g(p02, "p0");
        ((ChatEventHandler) this.receiver).onTapShowAltText(p02);
    }
}
