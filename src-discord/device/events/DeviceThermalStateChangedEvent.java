package com.discord.device.events;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.Metadata;
import nf.x;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/discord/device/events/DeviceThermalStateChangedEvent;", "Lcom/discord/reactevents/ReactEvent;", "state", "", "(I)V", "serialize", "Lcom/facebook/react/bridge/WritableNativeMap;", "device_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceThermalStateChangedEvent implements ReactEvent {
    private final int state;

    public DeviceThermalStateChangedEvent(int i10) {
        this.state = i10;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableNativeMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(x.a("state", Integer.valueOf(this.state)));
    }
}