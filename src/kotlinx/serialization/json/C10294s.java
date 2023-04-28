package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p014aj.AbstractC1413e;
import p014aj.C1427g;
import p045cj.C4025a0;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m15073d2 = {"Lkotlinx/serialization/json/s;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "b", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.s */
/* loaded from: classes8.dex */
public final class C10294s implements KSerializer<JsonPrimitive> {

    /* renamed from: a */
    public static final C10294s f22605a = new C10294s();

    /* renamed from: b */
    private static final SerialDescriptor f22606b = C1427g.m41128d("kotlinx.serialization.json.JsonPrimitive", AbstractC1413e.C1421i.f471a, new SerialDescriptor[0], null, 8, null);

    private C10294s() {
    }

    /* renamed from: a */
    public JsonPrimitive deserialize(Decoder decoder) {
        C9971q.m14633g(decoder, "decoder");
        JsonElement g = C10281h.m13703d(decoder).mo13729g();
        if (g instanceof JsonPrimitive) {
            return (JsonPrimitive) g;
        }
        throw C4025a0.m33033e(-1, "Unexpected JSON element, expected JsonPrimitive, had " + C9951f0.m14684b(g.getClass()), g.toString());
    }

    /* renamed from: b */
    public void serialize(Encoder encoder, JsonPrimitive value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        C10281h.m13704c(encoder);
        if (value instanceof JsonNull) {
            encoder.mo13872r(C10291q.f22598a, JsonNull.INSTANCE);
        } else {
            encoder.mo13872r(C10288n.f22596a, (C10287m) value);
        }
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f22606b;
    }
}
