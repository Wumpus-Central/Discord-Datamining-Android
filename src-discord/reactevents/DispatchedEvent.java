package com.discord.reactevents;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/reactevents/DispatchedEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewId", "eventName", "", "payload", "Lcom/discord/reactevents/ReactEvent;", "(IILjava/lang/String;Lcom/discord/reactevents/ReactEvent;)V", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "getEventName", "react_events_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class DispatchedEvent extends Event<DispatchedEvent> {
    private final String eventName;
    private final ReactEvent payload;

    
    public DispatchedEvent(int i10, int i11, String eventName, ReactEvent payload) {
        super(i10, i11);
        q.g(eventName, "eventName");
        q.g(payload, "payload");
        this.eventName = eventName;
        this.payload = payload;
    }

    @Override 
    protected WritableMap getEventData() {
        return this.payload.serialize();
    }

    @Override 
    public String getEventName() {
        return this.eventName;
    }
}
