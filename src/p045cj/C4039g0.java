package p045cj;

import bj.C3680n0;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9921w;
import kotlin.collections.C9922x;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.json.C10274f;
import kotlinx.serialization.json.C10295t;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p014aj.AbstractC1410d;
import p014aj.AbstractC1429h;
import p267of.C11289v;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006*"}, m15073d2 = {"Lcj/g0;", "Lcj/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "tag", "", "z0", "y0", "o", "D", "d0", "Lkotlinx/serialization/json/JsonElement;", "h0", "Lkotlinx/serialization/encoding/c;", "b", "", "c", "Lkotlinx/serialization/json/JsonObject;", "f", "Lkotlinx/serialization/json/JsonObject;", "A0", "()Lkotlinx/serialization/json/JsonObject;", "value", "g", "Ljava/lang/String;", "polyDiscriminator", "h", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "polyDescriptor", "i", "I", ViewProps.POSITION, "j", "Z", "forceNull", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.g0 */
/* loaded from: classes8.dex */
public class C4039g0 extends AbstractC4029c {

    /* renamed from: f */
    private final JsonObject f6638f;

    /* renamed from: g */
    private final String f6639g;

    /* renamed from: h */
    private final SerialDescriptor f6640h;

    /* renamed from: i */
    private int f6641i;

    /* renamed from: j */
    private boolean f6642j;

    public /* synthetic */ C4039g0(Json json, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonObject, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : serialDescriptor);
    }

    /* renamed from: y0 */
    private final boolean m32969y0(SerialDescriptor serialDescriptor, int i) {
        boolean z;
        if (mo13730d().m13765e().m13738f() || serialDescriptor.mo13675j(i) || !serialDescriptor.mo13677h(i).mo13683b()) {
            z = false;
        } else {
            z = true;
        }
        this.f6642j = z;
        return z;
    }

    /* renamed from: z0 */
    private final boolean m32968z0(SerialDescriptor serialDescriptor, int i, String str) {
        JsonPrimitive jsonPrimitive;
        Json d = mo13730d();
        SerialDescriptor h = serialDescriptor.mo13677h(i);
        if (!h.mo13683b() && (mo32956h0(str) instanceof JsonNull)) {
            return true;
        }
        if (C9971q.m14638b(h.mo13678g(), AbstractC1429h.C1431b.f480a) && (!h.mo13683b() || !(mo32956h0(str) instanceof JsonNull))) {
            JsonElement h0 = mo32956h0(str);
            String str2 = null;
            if (h0 instanceof JsonPrimitive) {
                jsonPrimitive = (JsonPrimitive) h0;
            } else {
                jsonPrimitive = null;
            }
            if (jsonPrimitive != null) {
                str2 = C10274f.m13724e(jsonPrimitive);
            }
            if (str2 != null && C4027b0.m33019g(h, d, str2) == -3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A0 */
    public JsonObject mo32955w0() {
        return this.f6638f;
    }

    @Override // p045cj.AbstractC4029c, bj.AbstractC3627b2, kotlinx.serialization.encoding.Decoder
    /* renamed from: D */
    public boolean mo13910D() {
        return !this.f6642j && super.mo13910D();
    }

    @Override // p045cj.AbstractC4029c, kotlinx.serialization.encoding.Decoder
    /* renamed from: b */
    public AbstractC10248c mo13905b(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        if (descriptor == this.f6640h) {
            return this;
        }
        return super.mo13905b(descriptor);
    }

    @Override // p045cj.AbstractC4029c, bj.AbstractC3627b2, kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: c */
    public void mo13857c(SerialDescriptor descriptor) {
        Set<String> set;
        Set set2;
        C9971q.m14633g(descriptor, "descriptor");
        if (!(this.f6623e.m13737g() || (descriptor.mo13678g() instanceof AbstractC1410d))) {
            C4027b0.m33015k(descriptor, mo13730d());
            if (!this.f6623e.m13733k()) {
                set = C3680n0.m33820a(descriptor);
            } else {
                Set<String> a = C3680n0.m33820a(descriptor);
                Map map = (Map) C10295t.m13672a(mo13730d()).m32885a(descriptor, C4027b0.m33021e());
                if (map != null) {
                    set2 = map.keySet();
                } else {
                    set2 = null;
                }
                if (set2 == null) {
                    set2 = C9921w.m14722d();
                }
                set = C9922x.m14714l(a, set2);
            }
            for (String str : mo32955w0().keySet()) {
                if (!(set.contains(str) || C9971q.m14638b(str, this.f6639g))) {
                    throw C4025a0.m33032f(str, mo32955w0().toString());
                }
            }
        }
    }

    @Override // bj.AbstractC3626b1
    /* renamed from: d0 */
    protected String mo32957d0(SerialDescriptor descriptor, int i) {
        Object obj;
        boolean z;
        C9971q.m14633g(descriptor, "descriptor");
        C4027b0.m33015k(descriptor, mo13730d());
        String e = descriptor.mo13680e(i);
        if (!this.f6623e.m13733k()) {
            return e;
        }
        if (mo32955w0().keySet().contains(e)) {
            return e;
        }
        Map<String, Integer> d = C4027b0.m33022d(mo13730d(), descriptor);
        Iterator<T> it = mo32955w0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer num = d.get((String) obj);
            if (num != null && num.intValue() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        return e;
    }

    @Override // p045cj.AbstractC4029c
    /* renamed from: h0 */
    protected JsonElement mo32956h0(String tag) {
        Object i;
        C9971q.m14633g(tag, "tag");
        i = C11289v.m10250i(mo32955w0(), tag);
        return (JsonElement) i;
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: o */
    public int mo13851o(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        while (this.f6641i < descriptor.mo13681d()) {
            int i = this.f6641i;
            this.f6641i = i + 1;
            String e0 = mo33947Y(descriptor, i);
            int i2 = this.f6641i - 1;
            this.f6642j = false;
            if (mo32955w0().containsKey(e0) || m32969y0(descriptor, i2)) {
                if (!this.f6623e.m13740d() || !m32968z0(descriptor, i2, e0)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4039g0(Json json, JsonObject value, String str, SerialDescriptor serialDescriptor) {
        super(json, value, null);
        C9971q.m14633g(json, "json");
        C9971q.m14633g(value, "value");
        this.f6638f = value;
        this.f6639g = str;
        this.f6640h = serialDescriptor;
    }
}
