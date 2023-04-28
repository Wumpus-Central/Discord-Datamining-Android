package com.discord.async_init;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;

@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 176)
/* loaded from: classes.dex */
public final class AsyncInitDispatcher$post$1 extends AbstractC9973s implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $task;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncInitDispatcher$post$1(Function0<Unit> function0) {
        super(0);
        this.$task = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$task.invoke();
    }
}
