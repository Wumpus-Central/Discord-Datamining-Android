package kotlinx.serialization.json;

import bj.C3667k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9962k0;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nf.C11075i;
import p045cj.C4066r0;
import p326ri.C12716s;
import p326ri.C12717t;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u0000P\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0002\" \u0010\u000e\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\"\u0015\u0010\u0011\u001a\u00020\u0002*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0019\u001a\u00020\u0016*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0015\u0010\u001d\u001a\u00020\u001a*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0017\u0010 \u001a\u0004\u0018\u00010\u001a*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0015\u0010$\u001a\u00020!*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0017\u0010'\u001a\u0004\u0018\u00010!*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u0015\u0010+\u001a\u00020(*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0015\u0010/\u001a\u00020,*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u0017\u00102\u001a\u0004\u0018\u00010,*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u00101\"\u0017\u00105\u001a\u0004\u0018\u00010\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, m15073d2 = {"", "value", "Lkotlinx/serialization/json/JsonPrimitive;", "a", "Lkotlinx/serialization/json/JsonElement;", "element", "", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "l", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getJsonUnquotedLiteralDescriptor$annotations", "()V", "jsonUnquotedLiteralDescriptor", "k", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;", "jsonPrimitive", "Lkotlinx/serialization/json/JsonObject;", "j", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;", "jsonObject", "", "i", "(Lkotlinx/serialization/json/JsonPrimitive;)I", "int", "", "m", "(Lkotlinx/serialization/json/JsonPrimitive;)J", "long", "n", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;", "longOrNull", "", "f", "(Lkotlinx/serialization/json/JsonPrimitive;)D", "double", "g", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;", "doubleOrNull", "", "h", "(Lkotlinx/serialization/json/JsonPrimitive;)F", "float", "", "c", "(Lkotlinx/serialization/json/JsonPrimitive;)Z", "boolean", "d", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;", "booleanOrNull", "e", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;", "contentOrNull", "kotlinx-serialization-json"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.f */
/* loaded from: classes8.dex */
public final class C10274f {

    /* renamed from: a */
    private static final SerialDescriptor f22583a = C3667k0.m33855a("kotlinx.serialization.json.JsonUnquotedLiteral", C14667a.m39E(C9962k0.f22091a));

    /* renamed from: a */
    public static final JsonPrimitive m13728a(String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        return new C10287m(str, true, null, 4, null);
    }

    /* renamed from: b */
    private static final Void m13727b(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + C9951f0.m14684b(jsonElement.getClass()) + " is not a " + str);
    }

    /* renamed from: c */
    public static final boolean m13726c(JsonPrimitive jsonPrimitive) {
        C9971q.m14633g(jsonPrimitive, "<this>");
        Boolean d = C4066r0.m32892d(jsonPrimitive.mo13692a());
        if (d != null) {
            return d.booleanValue();
        }
        throw new IllegalStateException(jsonPrimitive + " does not represent a Boolean");
    }

    /* renamed from: d */
    public static final Boolean m13725d(JsonPrimitive jsonPrimitive) {
        C9971q.m14633g(jsonPrimitive, "<this>");
        return C4066r0.m32892d(jsonPrimitive.mo13692a());
    }

    /* renamed from: e */
    public static final String m13724e(JsonPrimitive jsonPrimitive) {
        C9971q.m14633g(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.mo13692a();
    }

    /* renamed from: f */
    public static final double m13723f(JsonPrimitive jsonPrimitive) {
        C9971q.m14633g(jsonPrimitive, "<this>");
        return Double.parseDouble(jsonPrimitive.mo13692a());
    }

    /* renamed from: g */
    public static final Double m13722g(JsonPrimitive jsonPrimitive) {
        Double k;
        C9971q.m14633g(jsonPrimitive, "<this>");
        k = C12716s.m5749k(jsonPrimitive.mo13692a());
        return k;
    }

    /* renamed from: h */
    public static final float m13721h(JsonPrimitive jsonPrimitive) {
        C9971q.m14633g(jsonPrimitive, "<this>");
        return Float.parseFloat(jsonPrimitive.mo13692a());
    }

    /* renamed from: i */
    public static final int m13720i(JsonPrimitive jsonPrimitive) {
        C9971q.m14633g(jsonPrimitive, "<this>");
        return Integer.parseInt(jsonPrimitive.mo13692a());
    }

    /* renamed from: j */
    public static final JsonObject m13719j(JsonElement jsonElement) {
        JsonObject jsonObject;
        C9971q.m14633g(jsonElement, "<this>");
        if (jsonElement instanceof JsonObject) {
            jsonObject = (JsonObject) jsonElement;
        } else {
            jsonObject = null;
        }
        if (jsonObject != null) {
            return jsonObject;
        }
        m13727b(jsonElement, "JsonObject");
        throw new C11075i();
    }

    /* renamed from: k */
    public static final JsonPrimitive m13718k(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        C9971q.m14633g(jsonElement, "<this>");
        if (jsonElement instanceof JsonPrimitive) {
            jsonPrimitive = (JsonPrimitive) jsonElement;
        } else {
            jsonPrimitive = null;
        }
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        m13727b(jsonElement, "JsonPrimitive");
        throw new C11075i();
    }

    /* renamed from: l */
    public static final SerialDescriptor m13717l() {
        return f22583a;
    }

    /* renamed from: m */
    public static final long m13716m(JsonPrimitive jsonPrimitive) {
        C9971q.m14633g(jsonPrimitive, "<this>");
        return Long.parseLong(jsonPrimitive.mo13692a());
    }

    /* renamed from: n */
    public static final Long m13715n(JsonPrimitive jsonPrimitive) {
        Long o;
        C9971q.m14633g(jsonPrimitive, "<this>");
        o = C12717t.m5745o(jsonPrimitive.mo13692a());
        return o;
    }
}
