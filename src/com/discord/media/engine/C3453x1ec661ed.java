package com.discord.media.engine;

import com.facebook.react.bridge.Callback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;

@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* renamed from: com.discord.media.engine.MediaEngineModule$speedTestConnectionInstanceStartSpeedTestReceiver$1 */
/* loaded from: classes5.dex */
final class C3453x1ec661ed extends AbstractC9679s implements Function0<Unit> {
    final /* synthetic */ Callback $callback;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3453x1ec661ed(Callback callback) {
        super(0);
        this.$callback = callback;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$callback.invoke(new Object[0]);
    }
}
