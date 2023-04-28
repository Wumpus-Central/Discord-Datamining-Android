package com.discord.foreground_service.react;

import com.discord.foreground_service.service.ServiceNotificationConfiguration;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.IntRange;
import p267of.AbstractC11283p;
import p267of.C11289v;

@Metadata(m15074d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, m15073d2 = {"parse", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Companion;", "readableMap", "Lcom/facebook/react/bridge/ReadableMap;", "parseAction", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;", "parseList", "", "readableArray", "Lcom/facebook/react/bridge/ReadableArray;", "parsePriority", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Priority;", "value", "", "foreground_service_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ForegroudServiceConfigurationParserKt {
    public static final ServiceNotificationConfiguration parse(ServiceNotificationConfiguration.Companion companion, ReadableMap readableMap) {
        ServiceNotificationConfiguration.Action action;
        ArrayList arrayList;
        List i;
        int t;
        C9971q.m14633g(companion, "<this>");
        C9971q.m14633g(readableMap, "readableMap");
        String nonNullString = NativeMapExtensionsKt.getNonNullString(readableMap, "title");
        String string = readableMap.getString("content");
        ServiceNotificationConfiguration.Companion companion2 = ServiceNotificationConfiguration.Companion;
        ServiceNotificationConfiguration.Priority parsePriority = parsePriority(companion2, readableMap.getInt("priority"));
        ReadableMap map = readableMap.getMap("contentAction");
        if (map != null) {
            action = parseAction(companion2, map);
        } else {
            action = null;
        }
        ReadableArray array = readableMap.getArray("auxiliaryActions");
        if (array != null) {
            IntRange sizeRange = NativeArrayExtensionsKt.sizeRange(array);
            t = C9907k.m14809t(sizeRange, 10);
            ArrayList arrayList2 = new ArrayList(t);
            Iterator<Integer> it = sizeRange.iterator();
            while (it.hasNext()) {
                ReadableMap map2 = array.getMap(((AbstractC11283p) it).nextInt());
                C9971q.m14634f(map2, "array.getMap(index)");
                arrayList2.add(parseAction(ServiceNotificationConfiguration.Companion, map2));
            }
            arrayList = arrayList2;
        } else {
            i = C9906j.m14820i();
            arrayList = i;
        }
        return new ServiceNotificationConfiguration(nonNullString, string, parsePriority, action, arrayList);
    }

    private static final ServiceNotificationConfiguration.Action parseAction(ServiceNotificationConfiguration.Companion companion, ReadableMap readableMap) {
        Map<String, String> map;
        String nonNullString = NativeMapExtensionsKt.getNonNullString(readableMap, "tag");
        String nonNullString2 = NativeMapExtensionsKt.getNonNullString(readableMap, "taskName");
        String stringOrEmpty = NativeMapExtensionsKt.getStringOrEmpty(readableMap, "title");
        ReadableMap map2 = readableMap.getMap("data");
        if (map2 == null || (map = NativeMapExtensionsKt.toStringMap(map2)) == null) {
            map = C11289v.m10251h();
        }
        return new ServiceNotificationConfiguration.Action(nonNullString, nonNullString2, stringOrEmpty, map);
    }

    public static final List<ServiceNotificationConfiguration> parseList(ServiceNotificationConfiguration.Companion companion, ReadableArray readableArray) {
        int t;
        C9971q.m14633g(companion, "<this>");
        C9971q.m14633g(readableArray, "readableArray");
        IntRange sizeRange = NativeArrayExtensionsKt.sizeRange(readableArray);
        t = C9907k.m14809t(sizeRange, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<Integer> it = sizeRange.iterator();
        while (it.hasNext()) {
            int nextInt = ((AbstractC11283p) it).nextInt();
            ServiceNotificationConfiguration.Companion companion2 = ServiceNotificationConfiguration.Companion;
            ReadableMap map = readableArray.getMap(nextInt);
            C9971q.m14634f(map, "readableArray.getMap(index)");
            arrayList.add(parse(companion2, map));
        }
        return arrayList;
    }

    private static final ServiceNotificationConfiguration.Priority parsePriority(ServiceNotificationConfiguration.Companion companion, int i) {
        if (i == 0) {
            return ServiceNotificationConfiguration.Priority.HIGH;
        }
        if (i == 1) {
            return ServiceNotificationConfiguration.Priority.MEDIUM;
        }
        if (i == 2) {
            return ServiceNotificationConfiguration.Priority.LOW;
        }
        throw new IllegalArgumentException("Unknown priority: " + i + ".");
    }
}
