package com.discord.media.engine;

import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.facebook.react.bridge.Callback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "regions", "", "", "invoke", "([Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MediaEngineModule$rankRtcRegions$1 extends s implements Function1<String[], Unit> {
    final  Callback $callback;

    
    
    public MediaEngineModule$rankRtcRegions$1(Callback callback) {
        super(1);
        this.$callback = callback;
    }

    @Override 
    public   Unit invoke(String[] strArr) {
        invoke2(strArr);
        return Unit.f20664a;
    }

    
    public final void invoke2(String[] regions) {
        q.g(regions, "regions");
        this.$callback.invoke(NativeArrayExtensionsKt.toNativeArray(regions));
    }
}
