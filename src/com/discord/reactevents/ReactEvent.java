package com.discord.reactevents;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import p088ej.AbstractC6385a;
import p450yi.C14378j;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m15073d2 = {"Lcom/discord/reactevents/ReactEvent;", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "react_events_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes6.dex */
public interface ReactEvent {

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static WritableMap serialize(ReactEvent reactEvent) {
            return NativeMapExtensionsKt.toNativeMap(AbstractC6385a.f18386b.m23890e(C14378j.m601d(reactEvent.getClass()), reactEvent));
        }
    }

    WritableMap serialize();
}
