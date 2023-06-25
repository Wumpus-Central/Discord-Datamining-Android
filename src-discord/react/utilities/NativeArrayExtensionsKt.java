package com.discord.react.utilities;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableNativeArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.q;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import xf.j;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010$\n\u0000\u001a#\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\u0006\u0010\n\u001a\u0002H\b¢\u0006\u0002\u0010\u000b\u001a\n\u0010\f\u001a\u00020\r*\u00020\u000e\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\u000e\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u000e\u001a\u001b\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00140\u0003¢\u0006\u0002\u0010\u0005\u001a\n\u0010\u0013\u001a\u00020\u0001*\u00020\u0015\u001a\u0016\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00140\u0016\u001a\"\u0010\u0017\u001a\u00020\u0001\"\u0004\b\u0000\u0010\b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002H\b0\u00180\u0016¨\u0006\u0019"}, d2 = {"nativeArrayOf", "Lcom/facebook/react/bridge/ReadableNativeArray;", "elements", "", "", "([Ljava/lang/Object;)Lcom/facebook/react/bridge/ReadableNativeArray;", "push", "", "V", "Lcom/facebook/react/bridge/WritableNativeArray;", "value", "(Lcom/facebook/react/bridge/WritableNativeArray;Ljava/lang/Object;)V", "sizeRange", "Lkotlin/ranges/IntRange;", "Lcom/facebook/react/bridge/ReadableArray;", "toJson", "Lorg/json/JSONArray;", "toJsonString", "", "toNativeArray", "T", "", "", "toNativeArrayOfMaps", "", "react_utilities_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NativeArrayExtensionsKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
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

    public static final ReadableNativeArray nativeArrayOf(Object... elements) {
        q.g(elements, "elements");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Object obj : elements) {
            push(writableNativeArray, obj);
        }
        return writableNativeArray;
    }

    public static final <V> void push(WritableNativeArray writableNativeArray, V v10) {
        boolean z10;
        q.g(writableNativeArray, "<this>");
        if (v10 instanceof String) {
            writableNativeArray.pushString((String) v10);
        } else if (v10 instanceof Integer) {
            writableNativeArray.pushInt(((Number) v10).intValue());
        } else if (v10 instanceof Double) {
            writableNativeArray.pushDouble(((Number) v10).doubleValue());
        } else if (v10 instanceof Boolean) {
            writableNativeArray.pushBoolean(((Boolean) v10).booleanValue());
        } else if (v10 instanceof ReadableArray) {
            writableNativeArray.pushArray((ReadableArray) v10);
        } else if (v10 instanceof ReadableMap) {
            writableNativeArray.pushMap((ReadableMap) v10);
        } else if (v10 instanceof Long) {
            writableNativeArray.pushDouble(((Number) v10).longValue());
        } else {
            if (v10 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                writableNativeArray.pushNull();
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public static final IntRange sizeRange(ReadableArray readableArray) {
        IntRange p10;
        q.g(readableArray, "<this>");
        p10 = j.p(0, readableArray.size());
        return p10;
    }

    public static final JSONArray toJson(ReadableArray readableArray) {
        q.g(readableArray, "<this>");
        JSONArray jSONArray = new JSONArray();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[readableArray.getType(i10).ordinal()];
            if (i11 == 2) {
                jSONArray.put(readableArray.getBoolean(i10));
            } else if (i11 == 3) {
                jSONArray.put(readableArray.getDouble(i10));
            } else if (i11 == 4) {
                jSONArray.put(readableArray.getString(i10));
            } else if (i11 == 5) {
                ReadableMap map = readableArray.getMap(i10);
                q.f(map, "getMap(i)");
                jSONArray.put(NativeMapExtensionsKt.toJson(map));
            } else if (i11 == 6) {
                ReadableArray array = readableArray.getArray(i10);
                q.f(array, "getArray(i)");
                jSONArray.put(toJson(array));
            }
        }
        return jSONArray;
    }

    public static final String toJsonString(ReadableArray readableArray) {
        q.g(readableArray, "<this>");
        String jSONArray = toJson(readableArray).toString();
        q.f(jSONArray, "toJson().toString()");
        return jSONArray;
    }

    public static final <T> ReadableNativeArray toNativeArray(Collection<? extends T> collection) {
        q.g(collection, "<this>");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (T t10 : collection) {
            push(writableNativeArray, t10);
        }
        return writableNativeArray;
    }

    public static final <V> ReadableNativeArray toNativeArrayOfMaps(Collection<? extends Map<String, ? extends V>> collection) {
        int s10;
        q.g(collection, "<this>");
        s10 = k.s(collection, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(NativeMapExtensionsKt.toNativeMap((Map) it.next()));
        }
        return toNativeArray(arrayList);
    }

    public static final <T> ReadableNativeArray toNativeArray(T[] tArr) {
        q.g(tArr, "<this>");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (T t10 : tArr) {
            push(writableNativeArray, t10);
        }
        return writableNativeArray;
    }

    public static final ReadableNativeArray toNativeArray(int[] iArr) {
        q.g(iArr, "<this>");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (int i10 : iArr) {
            push(writableNativeArray, Integer.valueOf(i10));
        }
        return writableNativeArray;
    }
}
