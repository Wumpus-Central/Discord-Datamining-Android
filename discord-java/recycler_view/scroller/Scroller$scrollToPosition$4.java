package com.discord.recycler_view.scroller;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Scroller$scrollToPosition$4 extends s implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $onComplete;
    final /* synthetic */ Function0<Unit> $onScrollProgress;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scroller$scrollToPosition$4(Function0<Unit> function0, Function0<Unit> function02) {
        super(0);
        this.$onScrollProgress = function0;
        this.$onComplete = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onScrollProgress.invoke();
        this.$onComplete.invoke();
    }
}
