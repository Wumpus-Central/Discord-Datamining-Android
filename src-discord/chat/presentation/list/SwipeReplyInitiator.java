package com.discord.chat.presentation.list;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/discord/chat/presentation/list/SwipeReplyInitiator;", "", "enableSwipeToReply", "", "getEnableSwipeToReply", "()Z", "setEnableSwipeToReply", "(Z)V", "onInitiateReply", "Lkotlin/Function0;", "", "getOnInitiateReply", "()Lkotlin/jvm/functions/Function0;", "setOnInitiateReply", "(Lkotlin/jvm/functions/Function0;)V", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SwipeReplyInitiator {
    boolean getEnableSwipeToReply();

    Function0<Unit> getOnInitiateReply();

    void setEnableSwipeToReply(boolean z10);

    void setOnInitiateReply(Function0<Unit> function0);
}
