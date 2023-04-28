package bj;

import java.lang.Enum;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C9899f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import nf.C11084n;
import p449yi.C14436g;

@Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000e\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u001e\u0010\u001fB'\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010 J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0004H\u0016R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, m15073d2 = {"Lbj/b0;", "", "T", "Lkotlinx/serialization/KSerializer;", "", "serialName", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "e", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "d", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", "toString", "", "a", "[Ljava/lang/Enum;", "values", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "overriddenDescriptor", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "(Ljava/lang/String;[Ljava/lang/Enum;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.b0 */
/* loaded from: classes8.dex */
public final class C3624b0<T extends Enum<T>> implements KSerializer<T> {

    /* renamed from: a */
    private final T[] f5919a;

    /* renamed from: b */
    private SerialDescriptor f5920b;

    /* renamed from: c */
    private final Lazy f5921c;

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"", "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: bj.b0$a */
    /* loaded from: classes8.dex */
    static final class C3625a extends AbstractC9973s implements Function0<SerialDescriptor> {

        /* renamed from: k */
        final /* synthetic */ C3624b0<T> f5922k;

        /* renamed from: l */
        final /* synthetic */ String f5923l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3625a(C3624b0<T> b0Var, String str) {
            super(0);
            this.f5922k = b0Var;
            this.f5923l = str;
        }

        /* renamed from: a */
        public final SerialDescriptor invoke() {
            SerialDescriptor serialDescriptor = ((C3624b0) this.f5922k).f5920b;
            return serialDescriptor == null ? this.f5922k.m33956c(this.f5923l) : serialDescriptor;
        }
    }

    public C3624b0(String serialName, T[] values) {
        Lazy a;
        C9971q.m14633g(serialName, "serialName");
        C9971q.m14633g(values, "values");
        this.f5919a = values;
        a = C11084n.m10945a(new C3625a(this, serialName));
        this.f5921c = a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final SerialDescriptor m33956c(String str) {
        C3619a0 a0Var = new C3619a0(str, this.f5919a.length);
        for (T t : this.f5919a) {
            PluginGeneratedSerialDescriptor.m13840m(a0Var, t.name(), false, 2, null);
        }
        return a0Var;
    }

    /* renamed from: d */
    public T deserialize(Decoder decoder) {
        C9971q.m14633g(decoder, "decoder");
        int e = decoder.mo13904e(getDescriptor());
        boolean z = false;
        if (e >= 0 && e < this.f5919a.length) {
            z = true;
        }
        if (z) {
            return this.f5919a[e];
        }
        throw new C14436g(e + " is not among valid " + getDescriptor().mo13676i() + " enum values, values size is " + this.f5919a.length);
    }

    /* renamed from: e */
    public void serialize(Encoder encoder, T value) {
        int O;
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        O = C9899f.m14948O(this.f5919a, value);
        if (O != -1) {
            encoder.mo13916i(getDescriptor(), O);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().mo13676i());
        sb2.append(", must be one of ");
        String arrays = Arrays.toString(this.f5919a);
        C9971q.m14634f(arrays, "toString(this)");
        sb2.append(arrays);
        throw new C14436g(sb2.toString());
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f5921c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().mo13676i() + '>';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3624b0(String serialName, T[] values, SerialDescriptor descriptor) {
        this(serialName, values);
        C9971q.m14633g(serialName, "serialName");
        C9971q.m14633g(values, "values");
        C9971q.m14633g(descriptor, "descriptor");
        this.f5920b = descriptor;
    }
}
