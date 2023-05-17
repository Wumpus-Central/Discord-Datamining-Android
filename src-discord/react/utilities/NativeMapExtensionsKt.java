package com.discord.react.utilities;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableNativeMap;
import dj.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.k;
import nf.s;
import nf.t;
import org.json.JSONObject;
import yi.j;

@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\u001a3\u0010\u0004\u001a\u00020\u00052&\u0010\u0006\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u00030\b0\u0007\"\f\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u00030\b¢\u0006\u0002\u0010\n\u001a\u001e\u0010\u000b\u001a\u00020\f*\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\f\u001a\u001c\u0010\u0010\u001a\u00020\u0011*\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u0013*\u00020\r2\u0006\u0010\u000e\u001a\u00020\t\u001a\u0012\u0010\u0014\u001a\u00020\t*\u00020\r2\u0006\u0010\u000e\u001a\u00020\t\u001a\u0012\u0010\u0015\u001a\u00020\t*\u00020\r2\u0006\u0010\u0016\u001a\u00020\t\u001a%\u0010\u0017\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0019*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u001a\u001a\u0002H\u0019¢\u0006\u0002\u0010\u001b\u001a\n\u0010\u001c\u001a\u00020\u001d*\u00020\r\u001a\n\u0010\u001e\u001a\u00020\t*\u00020\r\u001a\u001a\u0010\u001f\u001a\u0002H \"\u0006\b\u0000\u0010 \u0018\u0001*\u00020\rH\u0086\b¢\u0006\u0002\u0010!\u001a\u001c\u0010\"\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0019*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00190#\u001a\u0016\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0#*\u00020\r\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006%"}, d2 = {"json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "nativeMapOf", "Lcom/facebook/react/bridge/WritableNativeMap;", "pairs", "", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)Lcom/facebook/react/bridge/WritableNativeMap;", "getBoolean", "", "Lcom/facebook/react/bridge/ReadableMap;", "key", "default", "getDouble", "", "getNonNullArray", "Lcom/facebook/react/bridge/ReadableArray;", "getNonNullString", "getStringOrEmpty", "name", "put", "", "V", "value", "(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V", "toJson", "Lorg/json/JSONObject;", "toJsonString", "toKotlinObject", "T", "(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/Object;", "toNativeMap", "", "toStringMap", "react_utilities_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NativeMapExtensionsKt {
    private static final Json json = k.b(null, NativeMapExtensionsKt$json$1.INSTANCE, 1, null);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
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

    public static final boolean getBoolean(ReadableMap readableMap, String key, boolean z10) {
        q.g(key, "key");
        boolean z11 = false;
        if (readableMap != null && readableMap.hasKey(key)) {
            z11 = true;
        }
        if (z11) {
            return readableMap.getBoolean(key);
        }
        return z10;
    }

    public static /* synthetic */ boolean getBoolean$default(ReadableMap readableMap, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return getBoolean(readableMap, str, z10);
    }

    public static final double getDouble(ReadableMap readableMap, String key, double d10) {
        Double d11;
        q.g(key, "key");
        try {
            s.a aVar = s.f24600l;
            q.d(readableMap);
            d11 = s.b(Double.valueOf(readableMap.getDouble(key)));
        } catch (Throwable th2) {
            s.a aVar2 = s.f24600l;
            d11 = s.b(t.a(th2));
        }
        Double valueOf = Double.valueOf(d10);
        if (s.g(d11)) {
            d11 = valueOf;
        }
        return ((Number) d11).doubleValue();
    }

    public static final Json getJson() {
        return json;
    }

    public static final ReadableArray getNonNullArray(ReadableMap readableMap, String key) {
        q.g(readableMap, "<this>");
        q.g(key, "key");
        ReadableArray array = readableMap.getArray(key);
        q.d(array);
        return array;
    }

    public static final String getNonNullString(ReadableMap readableMap, String key) {
        q.g(readableMap, "<this>");
        q.g(key, "key");
        String string = readableMap.getString(key);
        q.d(string);
        return string;
    }

    public static final String getStringOrEmpty(ReadableMap readableMap, String name) {
        q.g(readableMap, "<this>");
        q.g(name, "name");
        String string = readableMap.getString(name);
        if (string == null) {
            return "";
        }
        return string;
    }

    public static final WritableNativeMap nativeMapOf(Pair<String, ?>... pairs) {
        q.g(pairs, "pairs");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        for (Pair<String, ?> pair : pairs) {
            put(writableNativeMap, pair.a(), pair.b());
        }
        return writableNativeMap;
    }

    public static final <V> void put(WritableNativeMap writableNativeMap, String key, V v10) {
        boolean z10;
        q.g(writableNativeMap, "<this>");
        q.g(key, "key");
        if (v10 instanceof String) {
            writableNativeMap.putString(key, (String) v10);
        } else if (v10 instanceof Integer) {
            writableNativeMap.putInt(key, ((Number) v10).intValue());
        } else if (v10 instanceof Double) {
            writableNativeMap.putDouble(key, ((Number) v10).doubleValue());
        } else if (v10 instanceof Float) {
            writableNativeMap.putDouble(key, ((Number) v10).floatValue());
        } else if (v10 instanceof Boolean) {
            writableNativeMap.putBoolean(key, ((Boolean) v10).booleanValue());
        } else if (v10 instanceof ReadableArray) {
            writableNativeMap.putArray(key, (ReadableArray) v10);
        } else if (v10 instanceof ReadableMap) {
            writableNativeMap.putMap(key, (ReadableMap) v10);
        } else if (v10 instanceof int[]) {
            writableNativeMap.putArray(key, NativeArrayExtensionsKt.toNativeArray((int[]) v10));
        } else if (v10 instanceof Long) {
            writableNativeMap.putDouble(key, ((Number) v10).longValue());
        } else {
            if (v10 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                writableNativeMap.putNull(key);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public static final JSONObject toJson(ReadableMap readableMap) {
        q.g(readableMap, "<this>");
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        q.f(keySetIterator, "keySetIterator()");
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
                    q.d(map);
                    jSONObject.put(nextKey, toJson(map));
                    break;
                case 6:
                    ReadableArray array = readableMap.getArray(nextKey);
                    q.d(array);
                    jSONObject.put(nextKey, NativeArrayExtensionsKt.toJson(array));
                    break;
            }
        }
        return jSONObject;
    }

    public static final String toJsonString(ReadableMap readableMap) {
        q.g(readableMap, "<this>");
        String jSONObject = toJson(readableMap).toString();
        q.f(jSONObject, "toJson().toString()");
        return jSONObject;
    }

    public static final /* synthetic */ <T> T toKotlinObject(ReadableMap readableMap) {
        q.g(readableMap, "<this>");
        Json json2 = getJson();
        String jsonString = toJsonString(readableMap);
        c a10 = json2.a();
        q.m(6, "T");
        u.a("kotlinx.serialization.serializer.withModule");
        return (T) json2.b(j.c(a10, null), jsonString);
    }

    public static final <V> WritableNativeMap toNativeMap(Map<String, ? extends V> map) {
        q.g(map, "<this>");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            put(writableNativeMap, (String) entry.getKey(), entry.getValue());
        }
        return writableNativeMap;
    }

    public static final Map<String, String> toStringMap(ReadableMap readableMap) {
        q.g(readableMap, "<this>");
        HashMap<String, Object> hashMap = readableMap.toHashMap();
        q.e(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        return hashMap;
    }
}
