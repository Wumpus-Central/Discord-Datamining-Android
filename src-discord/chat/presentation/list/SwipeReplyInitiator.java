package com.discord.chat.presentation.list;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0015\u001a\u00020\nH&J\b\u0010\u0016\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/discord/chat/presentation/list/SwipeReplyInitiator;", "", "enableSwipeToReply", "", "getEnableSwipeToReply", "()Z", "setEnableSwipeToReply", "(Z)V", "onInitiateReply", "Lkotlin/Function0;", "", "getOnInitiateReply", "()Lkotlin/jvm/functions/Function0;", "setOnInitiateReply", "(Lkotlin/jvm/functions/Function0;)V", "shadowView", "Lcom/discord/chat/presentation/list/MaskedShadowView;", "getShadowView", "()Lcom/discord/chat/presentation/list/MaskedShadowView;", "setShadowView", "(Lcom/discord/chat/presentation/list/MaskedShadowView;)V", "onSwipeEnd", "onSwipeStart", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public interface SwipeReplyInitiator {
    boolean getEnableSwipeToReply();

    Function0<Unit> getOnInitiateReply();

    MaskedShadowView getShadowView();

    void onSwipeEnd();

    void onSwipeStart();

    void setEnableSwipeToReply(boolean z10);

    void setOnInitiateReply(Function0<Unit> function0);

    void setShadowView(MaskedShadowView maskedShadowView);
}
