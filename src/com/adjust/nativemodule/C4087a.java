package com.adjust.nativemodule;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p074e2.AbstractC6608c0;
import p074e2.C6619g;
import p074e2.C6635j;
import p074e2.C6637k;
import p074e2.C6639l;
import p074e2.C6657o;
import p074e2.C6659p;

/* renamed from: com.adjust.nativemodule.a */
/* loaded from: classes.dex */
final class C4087a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adjust.nativemodule.a$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0102a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6727a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f6727a = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6727a[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6727a[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6727a[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6727a[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6727a[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: a */
    public static WritableMap m32868a(C6619g gVar) {
        double d;
        WritableMap createMap = Arguments.createMap();
        if (gVar == null) {
            return createMap;
        }
        String str = gVar.f13924k;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        createMap.putString("trackerToken", str);
        String str3 = gVar.f13925l;
        if (str3 == null) {
            str3 = str2;
        }
        createMap.putString("trackerName", str3);
        String str4 = gVar.f13926m;
        if (str4 == null) {
            str4 = str2;
        }
        createMap.putString("network", str4);
        String str5 = gVar.f13927n;
        if (str5 == null) {
            str5 = str2;
        }
        createMap.putString("campaign", str5);
        String str6 = gVar.f13928o;
        if (str6 == null) {
            str6 = str2;
        }
        createMap.putString("adgroup", str6);
        String str7 = gVar.f13929p;
        if (str7 == null) {
            str7 = str2;
        }
        createMap.putString("creative", str7);
        String str8 = gVar.f13930q;
        if (str8 == null) {
            str8 = str2;
        }
        createMap.putString("clickLabel", str8);
        String str9 = gVar.f13931r;
        if (str9 == null) {
            str9 = str2;
        }
        createMap.putString("adid", str9);
        String str10 = gVar.f13932s;
        if (str10 == null) {
            str10 = str2;
        }
        createMap.putString("costType", str10);
        Double d2 = gVar.f13933t;
        if (d2 == null || d2.isNaN()) {
            d = 0.0d;
        } else {
            d = gVar.f13933t.doubleValue();
        }
        createMap.putDouble("costAmount", d);
        String str11 = gVar.f13934u;
        if (str11 != null) {
            str2 = str11;
        }
        createMap.putString("costCurrency", str2);
        return createMap;
    }

    /* renamed from: b */
    public static WritableMap m32867b(Uri uri) {
        WritableMap createMap = Arguments.createMap();
        if (uri == null) {
            return createMap;
        }
        createMap.putString("uri", uri.toString());
        return createMap;
    }

    /* renamed from: c */
    public static WritableMap m32866c(C6635j jVar) {
        String str;
        WritableMap createMap = Arguments.createMap();
        if (jVar == null) {
            return createMap;
        }
        String str2 = jVar.f13999c;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        createMap.putString("message", str2);
        String str4 = jVar.f14000d;
        if (str4 == null) {
            str4 = str3;
        }
        createMap.putString("timestamp", str4);
        String str5 = jVar.f13998b;
        if (str5 == null) {
            str5 = str3;
        }
        createMap.putString("adid", str5);
        String str6 = jVar.f14001e;
        if (str6 == null) {
            str6 = str3;
        }
        createMap.putString("eventToken", str6);
        String str7 = jVar.f14002f;
        if (str7 == null) {
            str7 = str3;
        }
        createMap.putString("callbackId", str7);
        if (jVar.f13997a) {
            str = "true";
        } else {
            str = "false";
        }
        createMap.putString("willRetry", str);
        JSONObject jSONObject = jVar.f14003g;
        if (jSONObject != null) {
            str3 = jSONObject.toString();
        }
        createMap.putString("jsonResponse", str3);
        return createMap;
    }

    /* renamed from: d */
    public static WritableMap m32865d(C6637k kVar) {
        WritableMap createMap = Arguments.createMap();
        if (kVar == null) {
            return createMap;
        }
        String str = kVar.f14014b;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        createMap.putString("message", str);
        String str3 = kVar.f14015c;
        if (str3 == null) {
            str3 = str2;
        }
        createMap.putString("timestamp", str3);
        String str4 = kVar.f14013a;
        if (str4 == null) {
            str4 = str2;
        }
        createMap.putString("adid", str4);
        String str5 = kVar.f14016d;
        if (str5 == null) {
            str5 = str2;
        }
        createMap.putString("eventToken", str5);
        String str6 = kVar.f14017e;
        if (str6 == null) {
            str6 = str2;
        }
        createMap.putString("callbackId", str6);
        JSONObject jSONObject = kVar.f14018f;
        if (jSONObject != null) {
            str2 = jSONObject.toString();
        }
        createMap.putString("jsonResponse", str2);
        return createMap;
    }

    /* renamed from: e */
    public static WritableMap m32864e(C6657o oVar) {
        String str;
        WritableMap createMap = Arguments.createMap();
        if (oVar == null) {
            return createMap;
        }
        String str2 = oVar.f14095c;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        createMap.putString("message", str2);
        String str4 = oVar.f14096d;
        if (str4 == null) {
            str4 = str3;
        }
        createMap.putString("timestamp", str4);
        String str5 = oVar.f14094b;
        if (str5 == null) {
            str5 = str3;
        }
        createMap.putString("adid", str5);
        if (oVar.f14093a) {
            str = "true";
        } else {
            str = "false";
        }
        createMap.putString("willRetry", str);
        JSONObject jSONObject = oVar.f14097e;
        if (jSONObject != null) {
            str3 = jSONObject.toString();
        }
        createMap.putString("jsonResponse", str3);
        return createMap;
    }

    /* renamed from: f */
    public static WritableMap m32863f(C6659p pVar) {
        WritableMap createMap = Arguments.createMap();
        if (pVar == null) {
            return createMap;
        }
        String str = pVar.f14099b;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        createMap.putString("message", str);
        String str3 = pVar.f14100c;
        if (str3 == null) {
            str3 = str2;
        }
        createMap.putString("timestamp", str3);
        String str4 = pVar.f14098a;
        if (str4 == null) {
            str4 = str2;
        }
        createMap.putString("adid", str4);
        JSONObject jSONObject = pVar.f14101d;
        if (jSONObject != null) {
            str2 = jSONObject.toString();
        }
        createMap.putString("jsonResponse", str2);
        return createMap;
    }

    /* renamed from: g */
    public static List<Object> m32862g(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        List<Object> arrayList = new ArrayList<>(readableArray.size());
        for (int i = 0; i < readableArray.size(); i++) {
            switch (C0102a.f6727a[readableArray.getType(i).ordinal()]) {
                case 1:
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i)));
                    break;
                case 3:
                    double d = readableArray.getDouble(i);
                    int i2 = (int) d;
                    if (d == i2) {
                        arrayList.add(Integer.valueOf(i2));
                        break;
                    } else {
                        arrayList.add(Double.valueOf(d));
                        break;
                    }
                case 4:
                    arrayList.add(readableArray.getString(i));
                    break;
                case 5:
                    arrayList.add(m32861h(readableArray.getMap(i)));
                    break;
                case 6:
                    arrayList = m32862g(readableArray.getArray(i));
                    break;
                default:
                    C6639l.m24863j().mo24885b("Could not convert object with index: " + i + ".", new Object[0]);
                    break;
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static Map<String, Object> m32861h(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        if (!keySetIterator.hasNextKey()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            String obj = m32860i(readableMap, nextKey).toString();
            if (obj == null) {
                AbstractC6608c0 j = C6639l.m24863j();
                j.mo24886a("Null parameter inside key-value pair with key: " + nextKey, new Object[0]);
            } else {
                hashMap.put(nextKey, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: i */
    private static Object m32860i(ReadableMap readableMap, String str) {
        if (readableMap == null) {
            return null;
        }
        switch (C0102a.f6727a[readableMap.getType(str).ordinal()]) {
            case 1:
                return null;
            case 2:
                return Boolean.valueOf(readableMap.getBoolean(str));
            case 3:
                double d = readableMap.getDouble(str);
                int i = (int) d;
                if (d == i) {
                    return Integer.valueOf(i);
                }
                return Double.valueOf(d);
            case 4:
                return readableMap.getString(str);
            case 5:
                return m32861h(readableMap.getMap(str));
            case 6:
                return m32862g(readableMap.getArray(str));
            default:
                AbstractC6608c0 j = C6639l.m24863j();
                j.mo24885b("Could not convert object with key: " + str + ".", new Object[0]);
                return null;
        }
    }
}
