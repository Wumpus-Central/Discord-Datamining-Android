package p045cj;

import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.C10274f;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import p267of.C11289v;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0014J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006!"}, m15073d2 = {"Lcj/i0;", "Lcj/g0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "d0", "o", "tag", "Lkotlinx/serialization/json/JsonElement;", "h0", "", "c", "Lkotlinx/serialization/json/JsonObject;", "k", "Lkotlinx/serialization/json/JsonObject;", "A0", "()Lkotlinx/serialization/json/JsonObject;", "value", "", "l", "Ljava/util/List;", "keys", "m", "I", "size", "n", ViewProps.POSITION, "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonObject;)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.i0 */
/* loaded from: classes8.dex */
public final class C4043i0 extends C4039g0 {

    /* renamed from: k */
    private final JsonObject f6649k;

    /* renamed from: l */
    private final List<String> f6650l;

    /* renamed from: m */
    private final int f6651m;

    /* renamed from: n */
    private int f6652n = -1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4043i0(Json json, JsonObject value) {
        super(json, value, null, null, 12, null);
        List<String> D0;
        C9971q.m14633g(json, "json");
        C9971q.m14633g(value, "value");
        this.f6649k = value;
        D0 = C9914r.m14790D0(mo32955w0().keySet());
        this.f6650l = D0;
        this.f6651m = D0.size() * 2;
    }

    @Override // p045cj.C4039g0
    /* renamed from: A0 */
    public JsonObject mo32955w0() {
        return this.f6649k;
    }

    @Override // p045cj.C4039g0, p045cj.AbstractC4029c, bj.AbstractC3627b2, kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: c */
    public void mo13857c(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
    }

    @Override // p045cj.C4039g0, bj.AbstractC3626b1
    /* renamed from: d0 */
    protected String mo32957d0(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return this.f6650l.get(i / 2);
    }

    @Override // p045cj.C4039g0, p045cj.AbstractC4029c
    /* renamed from: h0 */
    protected JsonElement mo32956h0(String tag) {
        Object i;
        C9971q.m14633g(tag, "tag");
        if (this.f6652n % 2 == 0) {
            return C10274f.m13728a(tag);
        }
        i = C11289v.m10250i(mo32955w0(), tag);
        return (JsonElement) i;
    }

    @Override // p045cj.C4039g0, kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: o */
    public int mo13851o(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        int i = this.f6652n;
        if (i >= this.f6651m - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f6652n = i2;
        return i2;
    }
}
