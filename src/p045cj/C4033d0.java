package p045cj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m15073d2 = {"Lcj/d0;", "Lcj/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "o", "", "tag", "Lkotlinx/serialization/json/JsonElement;", "h0", "Lkotlinx/serialization/json/JsonPrimitive;", "f", "Lkotlinx/serialization/json/JsonPrimitive;", "y0", "()Lkotlinx/serialization/json/JsonPrimitive;", "value", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonPrimitive;)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.d0 */
/* loaded from: classes8.dex */
public final class C4033d0 extends AbstractC4029c {

    /* renamed from: f */
    private final JsonPrimitive f6629f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4033d0(Json json, JsonPrimitive value) {
        super(json, value, null);
        C9971q.m14633g(json, "json");
        C9971q.m14633g(value, "value");
        this.f6629f = value;
        m33945a0("primitive");
    }

    @Override // p045cj.AbstractC4029c
    /* renamed from: h0 */
    protected JsonElement mo32956h0(String tag) {
        boolean z;
        C9971q.m14633g(tag, "tag");
        if (tag == "primitive") {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return mo32955w0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: o */
    public int mo13851o(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        return 0;
    }

    /* renamed from: y0 */
    public JsonPrimitive mo32955w0() {
        return this.f6629f;
    }
}
