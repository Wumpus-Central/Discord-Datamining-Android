package com.discord.chat.presentation.list;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u001b\u001a\u00020\rH&J\b\u0010\u001c\u001a\u00020\rH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fX¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0015\u001a\u00020\u0016X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/discord/chat/presentation/list/SwipeReplyInitiator;", "", "enableSwipeToEdit", "", "getEnableSwipeToEdit", "()Z", "setEnableSwipeToEdit", "(Z)V", "enableSwipeToReply", "getEnableSwipeToReply", "setEnableSwipeToReply", "onInitiateEdit", "Lkotlin/Function0;", "", "getOnInitiateEdit", "()Lkotlin/jvm/functions/Function0;", "setOnInitiateEdit", "(Lkotlin/jvm/functions/Function0;)V", "onInitiateReply", "getOnInitiateReply", "setOnInitiateReply", "shadowView", "Lcom/discord/chat/presentation/list/MaskedShadowView;", "getShadowView", "()Lcom/discord/chat/presentation/list/MaskedShadowView;", "setShadowView", "(Lcom/discord/chat/presentation/list/MaskedShadowView;)V", "onSwipeEnd", "onSwipeStart", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public interface SwipeReplyInitiator {
    boolean getEnableSwipeToEdit();

    boolean getEnableSwipeToReply();

    Function0<Unit> getOnInitiateEdit();

    Function0<Unit> getOnInitiateReply();

    MaskedShadowView getShadowView();

    void onSwipeEnd();

    void onSwipeStart();

    void setEnableSwipeToEdit(boolean z10);

    void setEnableSwipeToReply(boolean z10);

    void setOnInitiateEdit(Function0<Unit> function0);

    void setOnInitiateReply(Function0<Unit> function0);

    void setShadowView(MaskedShadowView maskedShadowView);
}
