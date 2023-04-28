package com.discord.external_pip;

import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import nf.C10845s;

@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"Lnf/s;", "", "result", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class ExternalPipModule$enterPipMode$1 extends AbstractC9679s implements Function1<C10845s<? extends Unit>, Unit> {
    final /* synthetic */ Promise $onResultPromise;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalPipModule$enterPipMode$1(Promise promise) {
        super(1);
        this.$onResultPromise = promise;
    }

    @Override // kotlin.jvm.functions.Function1
    public final void invoke(C10845s<? extends Unit> sVar) {
        if (C10845s.m10934h(sVar)) {
            this.$onResultPromise.resolve(Boolean.TRUE);
        } else {
            this.$onResultPromise.reject(C10845s.m10937e(sVar));
        }
    }
}
