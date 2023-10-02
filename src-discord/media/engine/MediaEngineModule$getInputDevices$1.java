package com.discord.media.engine;

import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.facebook.react.bridge.Callback;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "devices", "", "", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MediaEngineModule$getInputDevices$1 extends s implements Function1<List<? extends Map<String, ? extends Object>>, Unit> {
    final  Callback $callback;

    
    
    public MediaEngineModule$getInputDevices$1(Callback callback) {
        super(1);
        this.$callback = callback;
    }

    @Override 
    public   Unit invoke(List<? extends Map<String, ? extends Object>> list) {
        invoke2(list);
        return Unit.f21601a;
    }

    
    public final void invoke2(List<? extends Map<String, ? extends Object>> devices) {
        q.h(devices, "devices");
        this.$callback.invoke(NativeArrayExtensionsKt.toNativeArrayOfMaps(devices));
    }
}
