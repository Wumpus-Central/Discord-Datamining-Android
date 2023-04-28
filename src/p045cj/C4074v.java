package p045cj;

import dj.AbstractC6514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10246a;
import kotlinx.serialization.json.Json;
import nf.C11075i;
import p326ri.C12693c0;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u001a"}, m15073d2 = {"Lcj/v;", "Lkotlinx/serialization/encoding/a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "o", "h", "", "l", "", "H", "", "s", "Lcj/a;", "a", "Lcj/a;", "lexer", "Ldj/c;", "b", "Ldj/c;", "()Ldj/c;", "serializersModule", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lcj/a;Lkotlinx/serialization/json/Json;)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.v */
/* loaded from: classes8.dex */
public final class C4074v extends AbstractC10246a {

    /* renamed from: a */
    private final AbstractC4024a f6702a;

    /* renamed from: b */
    private final AbstractC6514c f6703b;

    public C4074v(AbstractC4024a lexer, Json json) {
        C9971q.m14633g(lexer, "lexer");
        C9971q.m14633g(json, "json");
        this.f6702a = lexer;
        this.f6703b = json.mo611a();
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: H */
    public byte mo13908H() {
        AbstractC4024a aVar = this.f6702a;
        String s = aVar.m33045s();
        try {
            return C12693c0.m5864a(s);
        } catch (IllegalArgumentException unused) {
            AbstractC4024a.m33039y(aVar, "Failed to parse type 'UByte' for input '" + s + '\'', 0, null, 6, null);
            throw new C11075i();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: a */
    public AbstractC6514c mo13858a() {
        return this.f6703b;
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: h */
    public int mo13903h() {
        AbstractC4024a aVar = this.f6702a;
        String s = aVar.m33045s();
        try {
            return C12693c0.m5861d(s);
        } catch (IllegalArgumentException unused) {
            AbstractC4024a.m33039y(aVar, "Failed to parse type 'UInt' for input '" + s + '\'', 0, null, 6, null);
            throw new C11075i();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: l */
    public long mo13901l() {
        AbstractC4024a aVar = this.f6702a;
        String s = aVar.m33045s();
        try {
            return C12693c0.m5858g(s);
        } catch (IllegalArgumentException unused) {
            AbstractC4024a.m33039y(aVar, "Failed to parse type 'ULong' for input '" + s + '\'', 0, null, 6, null);
            throw new C11075i();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: o */
    public int mo13851o(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: s */
    public short mo13899s() {
        AbstractC4024a aVar = this.f6702a;
        String s = aVar.m33045s();
        try {
            return C12693c0.m5855j(s);
        } catch (IllegalArgumentException unused) {
            AbstractC4024a.m33039y(aVar, "Failed to parse type 'UShort' for input '" + s + '\'', 0, null, 6, null);
            throw new C11075i();
        }
    }
}
