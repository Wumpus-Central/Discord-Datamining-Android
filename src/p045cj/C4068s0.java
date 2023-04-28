package p045cj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.C10287m;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import nf.C11088q;

@Metadata(m15074d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m15073d2 = {"T", "Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "a", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "", "discriminator", "Lkotlinx/serialization/json/JsonObject;", "b", "(Lkotlinx/serialization/json/Json;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "kotlinx-serialization-json"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: cj.s0 */
/* loaded from: classes8.dex */
public final class C4068s0 {
    /* renamed from: a */
    public static final <T> T m32889a(Json json, JsonElement element, DeserializationStrategy<? extends T> deserializer) {
        Decoder decoder;
        boolean z;
        C9971q.m14633g(json, "<this>");
        C9971q.m14633g(element, "element");
        C9971q.m14633g(deserializer, "deserializer");
        if (element instanceof JsonObject) {
            decoder = new C4039g0(json, (JsonObject) element, null, null, 12, null);
        } else if (element instanceof JsonArray) {
            decoder = new C4041h0(json, (JsonArray) element);
        } else {
            if (element instanceof C10287m) {
                z = true;
            } else {
                z = C9971q.m14638b(element, JsonNull.INSTANCE);
            }
            if (z) {
                decoder = new C4033d0(json, (JsonPrimitive) element);
            } else {
                throw new C11088q();
            }
        }
        return (T) decoder.mo13909G(deserializer);
    }

    /* renamed from: b */
    public static final <T> T m32888b(Json json, String discriminator, JsonObject element, DeserializationStrategy<? extends T> deserializer) {
        C9971q.m14633g(json, "<this>");
        C9971q.m14633g(discriminator, "discriminator");
        C9971q.m14633g(element, "element");
        C9971q.m14633g(deserializer, "deserializer");
        return (T) new C4039g0(json, element, discriminator, deserializer.getDescriptor()).mo13909G(deserializer);
    }
}
