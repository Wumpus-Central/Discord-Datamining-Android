package com.discord.reactevents;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kg.x;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KClass;
import lg.v;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\tJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000bJ\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\nR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/reactevents/ReactEventRegistry;", "", "()V", "<set-?>", "", "didExportEvents", "getDidExportEvents", "()Z", "events", "", "Lkotlin/reflect/KClass;", "Lcom/discord/reactevents/ReactEvent;", "", "exportEventConstants", "getEventName", "event", "registerEvent", "", "eventName", "eventClass", "react_events_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ReactEventRegistry {
    private boolean didExportEvents;
    private final Map<KClass<? extends ReactEvent>, String> events = new LinkedHashMap();

    public final Map<String, Object> exportEventConstants() {
        Map l10;
        this.didExportEvents = true;
        Collection<String> values = this.events.values();
        HashMap hashMap = new HashMap();
        for (Object obj : values) {
            l10 = v.l(x.a("registrationName", (String) obj));
            hashMap.put(obj, l10);
        }
        return hashMap;
    }

    public final boolean getDidExportEvents() {
        return this.didExportEvents;
    }

    public final String getEventName(ReactEvent event) {
        q.g(event, "event");
        String str = this.events.get(f0.b(event.getClass()));
        if (str != null) {
            return str;
        }
        KClass b10 = f0.b(event.getClass());
        throw new IllegalStateException(("No event name registered for event: " + b10).toString());
    }

    public final void registerEvent(String eventName, KClass<? extends ReactEvent> eventClass) {
        q.g(eventName, "eventName");
        q.g(eventClass, "eventClass");
        if (!this.events.containsKey(eventClass)) {
            this.events.put(eventClass, eventName);
            return;
        }
        String str = this.events.get(eventClass);
        throw new IllegalStateException("event " + ((Object) str) + " already registered for" + eventClass + ". using the same class for multiple events is not supported.");
    }
}
