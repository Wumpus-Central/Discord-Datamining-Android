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
import kotlin.collections.j;
import kotlin.collections.k;
import kotlin.jvm.internal.q;
import kotlin.ranges.IntRange;
import qf.p;
import qf.v;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, d2 = {"parse", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Companion;", "readableMap", "Lcom/facebook/react/bridge/ReadableMap;", "parseAction", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;", "parseList", "", "readableArray", "Lcom/facebook/react/bridge/ReadableArray;", "parsePriority", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Priority;", "value", "", "foreground_service_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class ForegroudServiceConfigurationParserKt {
    public static final ServiceNotificationConfiguration parse(ServiceNotificationConfiguration.Companion companion, ReadableMap readableMap) {
        ServiceNotificationConfiguration.Action action;
        ArrayList arrayList;
        List i10;
        int t10;
        q.h(companion, "<this>");
        q.h(readableMap, "readableMap");
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
            t10 = k.t(sizeRange, 10);
            ArrayList arrayList2 = new ArrayList(t10);
            Iterator<Integer> it = sizeRange.iterator();
            while (it.hasNext()) {
                ReadableMap map2 = array.getMap(((p) it).nextInt());
                q.g(map2, "array.getMap(index)");
                arrayList2.add(parseAction(ServiceNotificationConfiguration.Companion, map2));
            }
            arrayList = arrayList2;
        } else {
            i10 = j.i();
            arrayList = i10;
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
            map = v.h();
        }
        return new ServiceNotificationConfiguration.Action(nonNullString, nonNullString2, stringOrEmpty, map);
    }

    public static final List<ServiceNotificationConfiguration> parseList(ServiceNotificationConfiguration.Companion companion, ReadableArray readableArray) {
        int t10;
        q.h(companion, "<this>");
        q.h(readableArray, "readableArray");
        IntRange sizeRange = NativeArrayExtensionsKt.sizeRange(readableArray);
        t10 = k.t(sizeRange, 10);
        ArrayList arrayList = new ArrayList(t10);
        Iterator<Integer> it = sizeRange.iterator();
        while (it.hasNext()) {
            int nextInt = ((p) it).nextInt();
            ServiceNotificationConfiguration.Companion companion2 = ServiceNotificationConfiguration.Companion;
            ReadableMap map = readableArray.getMap(nextInt);
            q.g(map, "readableArray.getMap(index)");
            arrayList.add(parse(companion2, map));
        }
        return arrayList;
    }

    private static final ServiceNotificationConfiguration.Priority parsePriority(ServiceNotificationConfiguration.Companion companion, int i10) {
        if (i10 == 0) {
            return ServiceNotificationConfiguration.Priority.HIGH;
        }
        if (i10 == 1) {
            return ServiceNotificationConfiguration.Priority.MEDIUM;
        }
        if (i10 == 2) {
            return ServiceNotificationConfiguration.Priority.LOW;
        }
        throw new IllegalArgumentException("Unknown priority: " + i10 + ".");
    }
}
