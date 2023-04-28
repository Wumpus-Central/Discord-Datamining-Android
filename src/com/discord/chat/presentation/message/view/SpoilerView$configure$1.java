package com.discord.chat.presentation.message.view;

import com.discord.chat.bridge.spoiler.SpoilerConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9674n;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class SpoilerView$configure$1 extends C9674n implements Function0<Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SpoilerView$configure$1(Object obj) {
        super(0, obj, SpoilerConfig.class, "onReveal", "onReveal()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SpoilerConfig) this.receiver).onReveal();
    }
}
