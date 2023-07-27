package com.discord.media.engine;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.Callback;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "errorMessage", "", "connectionInfo", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MediaEngineModule$createSpeedTestConnectionWithOptions$1 extends s implements Function2<String, Map<String, ? extends Object>, Unit> {
    final  Callback $callback;

    
    
    public MediaEngineModule$createSpeedTestConnectionWithOptions$1(Callback callback) {
        super(2);
        this.$callback = callback;
    }

    @Override 
    public   Unit invoke(String str, Map<String, ? extends Object> map) {
        invoke2(str, map);
        return Unit.f20670a;
    }

    
    public final void invoke2(String errorMessage, Map<String, ? extends Object> connectionInfo) {
        q.g(errorMessage, "errorMessage");
        q.g(connectionInfo, "connectionInfo");
        this.$callback.invoke(errorMessage, NativeMapExtensionsKt.toNativeMap(connectionInfo));
    }
}
