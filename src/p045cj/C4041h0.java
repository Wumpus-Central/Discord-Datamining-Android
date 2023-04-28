package p045cj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0014J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u001b"}, m15073d2 = {"Lcj/h0;", "Lcj/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "d0", "tag", "Lkotlinx/serialization/json/JsonElement;", "h0", "o", "Lkotlinx/serialization/json/JsonArray;", "f", "Lkotlinx/serialization/json/JsonArray;", "y0", "()Lkotlinx/serialization/json/JsonArray;", "value", "g", "I", "size", "h", "currentIndex", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonArray;)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.h0 */
/* loaded from: classes8.dex */
public final class C4041h0 extends AbstractC4029c {

    /* renamed from: f */
    private final JsonArray f6645f;

    /* renamed from: g */
    private final int f6646g = mo32955w0().size();

    /* renamed from: h */
    private int f6647h = -1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4041h0(Json json, JsonArray value) {
        super(json, value, null);
        C9971q.m14633g(json, "json");
        C9971q.m14633g(value, "value");
        this.f6645f = value;
    }

    @Override // bj.AbstractC3626b1
    /* renamed from: d0 */
    protected String mo32957d0(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return String.valueOf(i);
    }

    @Override // p045cj.AbstractC4029c
    /* renamed from: h0 */
    protected JsonElement mo32956h0(String tag) {
        C9971q.m14633g(tag, "tag");
        return mo32955w0().get(Integer.parseInt(tag));
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: o */
    public int mo13851o(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        int i = this.f6647h;
        if (i >= this.f6646g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f6647h = i2;
        return i2;
    }

    /* renamed from: y0 */
    public JsonArray mo32955w0() {
        return this.f6645f;
    }
}
