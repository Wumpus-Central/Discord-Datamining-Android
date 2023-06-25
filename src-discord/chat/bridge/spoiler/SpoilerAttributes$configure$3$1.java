package com.discord.chat.bridge.spoiler;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "spoilerId", "Lcom/discord/chat/bridge/spoiler/SpoilerIdentifier;", "invoke-V2PEE7g", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class SpoilerAttributes$configure$3$1 extends s implements Function1<SpoilerIdentifier, Unit> {
    final /* synthetic */ Function0<Unit> $onTapSpoiler;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpoilerAttributes$configure$3$1(Function0<Unit> function0) {
        super(1);
        this.$onTapSpoiler = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SpoilerIdentifier spoilerIdentifier) {
        m121invokeV2PEE7g(spoilerIdentifier.m128unboximpl());
        return Unit.f20684a;
    }

    /* renamed from: invoke-V2PEE7g  reason: not valid java name */
    public final void m121invokeV2PEE7g(String spoilerId) {
        q.g(spoilerId, "spoilerId");
        SpoilerManager.INSTANCE.m132markRevealedV2PEE7g(spoilerId);
        this.$onTapSpoiler.invoke();
    }
}
