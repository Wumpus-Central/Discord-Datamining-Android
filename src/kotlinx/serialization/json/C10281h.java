package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import nf.C11084n;
import p014aj.AbstractC1429h;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0004H\u0000\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000\u001a\u0016\u0010\u000e\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¨\u0006\u000f"}, m15073d2 = {"Lkotlinx/serialization/encoding/Encoder;", "encoder", "", "h", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "g", "Lkotlinx/serialization/json/e;", "d", "Lkotlinx/serialization/json/i;", "e", "Lkotlin/Function0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "deferred", "f", "kotlinx-serialization-json"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.h */
/* loaded from: classes8.dex */
public final class C10281h {

    @Metadata(m15074d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\u0011\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m15073d2 = {"kotlinx/serialization/json/h$a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "", "e", "name", "c", "", "", "f", "h", "", "j", "a", "Lkotlin/Lazy;", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "original", "i", "()Ljava/lang/String;", "serialName", "Laj/h;", "g", "()Laj/h;", "kind", "d", "()I", "elementsCount", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.json.h$a */
    /* loaded from: classes8.dex */
    public static final class C10282a implements SerialDescriptor {

        /* renamed from: a */
        private final Lazy f22592a;

        C10282a(Function0<? extends SerialDescriptor> function0) {
            Lazy a;
            a = C11084n.m10945a(function0);
            this.f22592a = a;
        }

        /* renamed from: a */
        private final SerialDescriptor m13698a() {
            return (SerialDescriptor) this.f22592a.getValue();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: b */
        public boolean mo13683b() {
            return SerialDescriptor.C10240a.m13923c(this);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: c */
        public int mo13682c(String name) {
            C9971q.m14633g(name, "name");
            return m13698a().mo13682c(name);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: d */
        public int mo13681d() {
            return m13698a().mo13681d();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: e */
        public String mo13680e(int i) {
            return m13698a().mo13680e(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: f */
        public List<Annotation> mo13679f(int i) {
            return m13698a().mo13679f(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: g */
        public AbstractC1429h mo13678g() {
            return m13698a().mo13678g();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List<Annotation> getAnnotations() {
            return SerialDescriptor.C10240a.m13925a(this);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: h */
        public SerialDescriptor mo13677h(int i) {
            return m13698a().mo13677h(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: i */
        public String mo13676i() {
            return m13698a().mo13676i();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean isInline() {
            return SerialDescriptor.C10240a.m13924b(this);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: j */
        public boolean mo13675j(int i) {
            return m13698a().mo13675j(i);
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m13705b(Decoder decoder) {
        m13700g(decoder);
    }

    /* renamed from: c */
    public static final /* synthetic */ void m13704c(Encoder encoder) {
        m13699h(encoder);
    }

    /* renamed from: d */
    public static final AbstractC10273e m13703d(Decoder decoder) {
        AbstractC10273e eVar;
        C9971q.m14633g(decoder, "<this>");
        if (decoder instanceof AbstractC10273e) {
            eVar = (AbstractC10273e) decoder;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + C9951f0.m14684b(decoder.getClass()));
    }

    /* renamed from: e */
    public static final AbstractC10283i m13702e(Encoder encoder) {
        AbstractC10283i iVar;
        C9971q.m14633g(encoder, "<this>");
        if (encoder instanceof AbstractC10283i) {
            iVar = (AbstractC10283i) encoder;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + C9951f0.m14684b(encoder.getClass()));
    }

    /* renamed from: f */
    public static final SerialDescriptor m13701f(Function0<? extends SerialDescriptor> function0) {
        return new C10282a(function0);
    }

    /* renamed from: g */
    public static final void m13700g(Decoder decoder) {
        m13703d(decoder);
    }

    /* renamed from: h */
    public static final void m13699h(Encoder encoder) {
        m13702e(encoder);
    }
}
