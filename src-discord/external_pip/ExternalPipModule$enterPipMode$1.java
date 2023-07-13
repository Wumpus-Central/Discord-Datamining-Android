package com.discord.external_pip;

import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lff/s;", "", "result", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})

final class ExternalPipModule$enterPipMode$1 extends s implements Function1<ff.s<? extends Unit>, Unit> {
    final  Promise $onResultPromise;

    
    
    public ExternalPipModule$enterPipMode$1(Promise promise) {
        super(1);
        this.$onResultPromise = promise;
    }

    @Override 
    public final void invoke(ff.s<? extends Unit> sVar) {
        if (ff.s.h(sVar)) {
            this.$onResultPromise.resolve(Boolean.TRUE);
        } else {
            this.$onResultPromise.reject(ff.s.e(sVar));
        }
    }
}
