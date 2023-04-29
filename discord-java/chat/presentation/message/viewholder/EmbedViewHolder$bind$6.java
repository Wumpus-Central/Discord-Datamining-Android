package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class EmbedViewHolder$bind$6 extends n implements Function1<EmojiContentNode, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public EmbedViewHolder$bind$6(Object obj) {
        super(1, obj, ChatEventHandler.class, "onTapEmoji", "onTapEmoji(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(EmojiContentNode emojiContentNode) {
        invoke2(emojiContentNode);
        return Unit.f22034a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(EmojiContentNode p02) {
        q.g(p02, "p0");
        ((ChatEventHandler) this.receiver).onTapEmoji(p02);
    }
}
