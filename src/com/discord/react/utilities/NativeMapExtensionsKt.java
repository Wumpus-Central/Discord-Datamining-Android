package com.discord.react.utilities;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableNativeMap;
import dj.AbstractC5943c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.C9681u;
import kotlinx.serialization.json.C10006k;
import kotlinx.serialization.json.Json;
import nf.C10845s;
import nf.C10848t;
import org.json.JSONObject;
import p450yi.C14378j;

@Metadata(m15074d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\u001a3\u0010\u0004\u001a\u00020\u00052&\u0010\u0006\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u00030\b0\u0007\"\f\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u00030\b¢\u0006\u0002\u0010\n\u001a\u001e\u0010\u000b\u001a\u00020\f*\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\f\u001a\u001c\u0010\u0010\u001a\u00020\u0011*\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u0013*\u00020\r2\u0006\u0010\u000e\u001a\u00020\t\u001a\u0012\u0010\u0014\u001a\u00020\t*\u00020\r2\u0006\u0010\u000e\u001a\u00020\t\u001a\u0012\u0010\u0015\u001a\u00020\t*\u00020\r2\u0006\u0010\u0016\u001a\u00020\t\u001a%\u0010\u0017\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0019*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u001a\u001a\u0002H\u0019¢\u0006\u0002\u0010\u001b\u001a\n\u0010\u001c\u001a\u00020\u001d*\u00020\r\u001a\n\u0010\u001e\u001a\u00020\t*\u00020\r\u001a\u001a\u0010\u001f\u001a\u0002H \"\u0006\b\u0000\u0010 \u0018\u0001*\u00020\rH\u0086\b¢\u0006\u0002\u0010!\u001a\u001c\u0010\"\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0019*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00190#\u001a\u0016\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0#*\u00020\r\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006%"}, m15073d2 = {"json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "nativeMapOf", "Lcom/facebook/react/bridge/WritableNativeMap;", "pairs", "", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)Lcom/facebook/react/bridge/WritableNativeMap;", "getBoolean", "", "Lcom/facebook/react/bridge/ReadableMap;", "key", "default", "getDouble", "", "getNonNullArray", "Lcom/facebook/react/bridge/ReadableArray;", "getNonNullString", "getStringOrEmpty", "name", "put", "", "V", "value", "(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V", "toJson", "Lorg/json/JSONObject;", "toJsonString", "toKotlinObject", "T", "(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/Object;", "toNativeMap", "", "toStringMap", "react_utilities_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes3.dex */
public final class NativeMapExtensionsKt {
    private static final Json json = C10006k.m13694b(null, NativeMapExtensionsKt$json$1.INSTANCE, 1, null);

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean getBoolean(ReadableMap readableMap, String key, boolean z) {
        C9677q.m14633g(key, "key");
        boolean z2 = false;
        if (readableMap != null && readableMap.hasKey(key)) {
            z2 = true;
        }
        if (z2) {
            return readableMap.getBoolean(key);
        }
        return z;
    }

    public static /* synthetic */ boolean getBoolean$default(ReadableMap readableMap, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getBoolean(readableMap, str, z);
    }

    public static final double getDouble(ReadableMap readableMap, String key, double d) {
        Double d2;
        C9677q.m14633g(key, "key");
        try {
            C10845s.C10846a aVar = C10845s.f28533l;
            C9677q.m14636d(readableMap);
            d2 = C10845s.m10940b(Double.valueOf(readableMap.getDouble(key)));
        } catch (Throwable th2) {
            C10845s.C10846a aVar2 = C10845s.f28533l;
            d2 = C10845s.m10940b(C10848t.m10931a(th2));
        }
        Double valueOf = Double.valueOf(d);
        if (C10845s.m10935g(d2)) {
            d2 = valueOf;
        }
        return ((Number) d2).doubleValue();
    }

    public static final Json getJson() {
        return json;
    }

    public static final ReadableArray getNonNullArray(ReadableMap readableMap, String key) {
        C9677q.m14633g(readableMap, "<this>");
        C9677q.m14633g(key, "key");
        ReadableArray array = readableMap.getArray(key);
        C9677q.m14636d(array);
        return array;
    }

    public static final String getNonNullString(ReadableMap readableMap, String key) {
        C9677q.m14633g(readableMap, "<this>");
        C9677q.m14633g(key, "key");
        String string = readableMap.getString(key);
        C9677q.m14636d(string);
        return string;
    }

    public static final String getStringOrEmpty(ReadableMap readableMap, String name) {
        C9677q.m14633g(readableMap, "<this>");
        C9677q.m14633g(name, "name");
        String string = readableMap.getString(name);
        if (string == null) {
            return "";
        }
        return string;
    }

    public static final WritableNativeMap nativeMapOf(Pair<String, ?>... pairs) {
        C9677q.m14633g(pairs, "pairs");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        for (Pair<String, ?> pair : pairs) {
            put(writableNativeMap, pair.m15067a(), pair.m15066b());
        }
        return writableNativeMap;
    }

    public static final <V> void put(WritableNativeMap writableNativeMap, String key, V v) {
        boolean z;
        C9677q.m14633g(writableNativeMap, "<this>");
        C9677q.m14633g(key, "key");
        if (v instanceof String) {
            writableNativeMap.putString(key, (String) v);
        } else if (v instanceof Integer) {
            writableNativeMap.putInt(key, ((Number) v).intValue());
        } else if (v instanceof Double) {
            writableNativeMap.putDouble(key, ((Number) v).doubleValue());
        } else if (v instanceof Float) {
            writableNativeMap.putDouble(key, ((Number) v).floatValue());
        } else if (v instanceof Boolean) {
            writableNativeMap.putBoolean(key, ((Boolean) v).booleanValue());
        } else if (v instanceof ReadableArray) {
            writableNativeMap.putArray(key, (ReadableArray) v);
        } else if (v instanceof ReadableMap) {
            writableNativeMap.putMap(key, (ReadableMap) v);
        } else if (v instanceof int[]) {
            writableNativeMap.putArray(key, NativeArrayExtensionsKt.toNativeArray((int[]) v));
        } else if (v instanceof Long) {
            writableNativeMap.putDouble(key, ((Number) v).longValue());
        } else {
            if (v == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                writableNativeMap.putNull(key);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public static final JSONObject toJson(ReadableMap readableMap) {
        C9677q.m14633g(readableMap, "<this>");
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        C9677q.m14634f(keySetIterator, "keySetIterator()");
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (WhenMappings.$EnumSwitchMapping$0[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    jSONObject.put(nextKey, JSONObject.NULL);
                    break;
                case 2:
                    jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    jSONObject.put(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 4:
                    jSONObject.put(nextKey, readableMap.getString(nextKey));
                    break;
                case 5:
                    ReadableMap map = readableMap.getMap(nextKey);
                    C9677q.m14636d(map);
                    jSONObject.put(nextKey, toJson(map));
                    break;
                case 6:
                    ReadableArray array = readableMap.getArray(nextKey);
                    C9677q.m14636d(array);
                    jSONObject.put(nextKey, NativeArrayExtensionsKt.toJson(array));
                    break;
            }
        }
        return jSONObject;
    }

    public static final String toJsonString(ReadableMap readableMap) {
        C9677q.m14633g(readableMap, "<this>");
        String jSONObject = toJson(readableMap).toString();
        C9677q.m14634f(jSONObject, "toJson().toString()");
        return jSONObject;
    }

    public static final /* synthetic */ <T> T toKotlinObject(ReadableMap readableMap) {
        C9677q.m14633g(readableMap, "<this>");
        Json json2 = getJson();
        String jsonString = toJsonString(readableMap);
        AbstractC5943c a = json2.mo611a();
        C9677q.m14627m(6, "T");
        C9681u.m14613a("kotlinx.serialization.serializer.withModule");
        return (T) json2.mo578b(C14378j.m602c(a, null), jsonString);
    }

    public static final <V> WritableNativeMap toNativeMap(Map<String, ? extends V> map) {
        C9677q.m14633g(map, "<this>");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            put(writableNativeMap, (String) entry.getKey(), entry.getValue());
        }
        return writableNativeMap;
    }

    public static final Map<String, String> toStringMap(ReadableMap readableMap) {
        C9677q.m14633g(readableMap, "<this>");
        HashMap<String, Object> hashMap = readableMap.toHashMap();
        C9677q.m14635e(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        return hashMap;
    }
}
