package com.discord.chat.presentation.list.delegate;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.n;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class LoadingDelegate$bindView$2 extends n implements Function0<Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public LoadingDelegate$bindView$2(Object obj) {
        super(0, obj, ChatEventHandler.class, "onTapLoadMessagesAfter", "onTapLoadMessagesAfter()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ChatEventHandler) this.receiver).onTapLoadMessagesAfter();
    }
}