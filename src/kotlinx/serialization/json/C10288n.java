package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import nf.C11062d0;
import p014aj.AbstractC1413e;
import p014aj.C1427g;
import p045cj.C4025a0;
import p326ri.C12693c0;
import p469zi.C14667a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m15073d2 = {"Lkotlinx/serialization/json/n;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/m;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "b", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.n */
/* loaded from: classes8.dex */
public final class C10288n implements KSerializer<C10287m> {

    /* renamed from: a */
    public static final C10288n f22596a = new C10288n();

    /* renamed from: b */
    private static final SerialDescriptor f22597b = C1427g.m41131a("kotlinx.serialization.json.JsonLiteral", AbstractC1413e.C1421i.f471a);

    private C10288n() {
    }

    /* renamed from: a */
    public C10287m deserialize(Decoder decoder) {
        C9971q.m14633g(decoder, "decoder");
        JsonElement g = C10281h.m13703d(decoder).mo13729g();
        if (g instanceof C10287m) {
            return (C10287m) g;
        }
        throw C4025a0.m33033e(-1, "Unexpected JSON element, expected JsonLiteral, had " + C9951f0.m14684b(g.getClass()), g.toString());
    }

    /* renamed from: b */
    public void serialize(Encoder encoder, C10287m value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        C10281h.m13699h(encoder);
        if (value.mo13691b()) {
            encoder.mo13888F(value.mo13692a());
        } else if (value.m13690f() != null) {
            encoder.mo13879j(value.m13690f()).mo13888F(value.mo13692a());
        } else {
            Long n = C10274f.m13715n(value);
            if (n != null) {
                encoder.mo13878k(n.longValue());
                return;
            }
            C11062d0 h = C12693c0.m5857h(value.mo13692a());
            if (h != null) {
                encoder.mo13879j(C14667a.m36H(C11062d0.f24580l).getDescriptor()).mo13878k(h.m11001f());
                return;
            }
            Double g = C10274f.m13722g(value);
            if (g != null) {
                encoder.mo13882f(g.doubleValue());
                return;
            }
            Boolean d = C10274f.m13725d(value);
            if (d != null) {
                encoder.mo13873q(d.booleanValue());
            } else {
                encoder.mo13888F(value.mo13692a());
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f22597b;
    }
}
