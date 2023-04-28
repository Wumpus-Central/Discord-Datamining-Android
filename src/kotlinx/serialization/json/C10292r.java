package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9962k0;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p014aj.AbstractC1429h;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m15073d2 = {"Lkotlinx/serialization/json/r;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "b", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.r */
/* loaded from: classes8.dex */
public final class C10292r implements KSerializer<JsonObject> {

    /* renamed from: a */
    public static final C10292r f22600a = new C10292r();

    /* renamed from: b */
    private static final SerialDescriptor f22601b = C10293a.f22602b;

    @Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010\u0012J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0097\u0001J\u0011\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001R \u0010\u0013\u001a\u00020\b8\u0016X\u0097D¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\f8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\f8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010!\u001a\u00020\u001e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m15073d2 = {"Lkotlinx/serialization/json/r$a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "", "", "f", "h", "", "name", "c", "e", "", "j", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "getSerialName$annotations", "()V", "serialName", "getAnnotations", "()Ljava/util/List;", "annotations", "d", "()I", "elementsCount", "isInline", "()Z", "b", "isNullable", "Laj/h;", "g", "()Laj/h;", "kind", "<init>", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.json.r$a */
    /* loaded from: classes8.dex */
    private static final class C10293a implements SerialDescriptor {

        /* renamed from: b */
        public static final C10293a f22602b = new C10293a();

        /* renamed from: c */
        private static final String f22603c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a */
        private final /* synthetic */ SerialDescriptor f22604a = C14667a.m23k(C14667a.m39E(C9962k0.f22091a), C10275g.f22584a).getDescriptor();

        private C10293a() {
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: b */
        public boolean mo13683b() {
            return this.f22604a.mo13683b();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: c */
        public int mo13682c(String name) {
            C9971q.m14633g(name, "name");
            return this.f22604a.mo13682c(name);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: d */
        public int mo13681d() {
            return this.f22604a.mo13681d();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: e */
        public String mo13680e(int i) {
            return this.f22604a.mo13680e(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: f */
        public List<Annotation> mo13679f(int i) {
            return this.f22604a.mo13679f(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: g */
        public AbstractC1429h mo13678g() {
            return this.f22604a.mo13678g();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List<Annotation> getAnnotations() {
            return this.f22604a.getAnnotations();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: h */
        public SerialDescriptor mo13677h(int i) {
            return this.f22604a.mo13677h(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: i */
        public String mo13676i() {
            return f22603c;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean isInline() {
            return this.f22604a.isInline();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: j */
        public boolean mo13675j(int i) {
            return this.f22604a.mo13675j(i);
        }
    }

    private C10292r() {
    }

    /* renamed from: a */
    public JsonObject deserialize(Decoder decoder) {
        C9971q.m14633g(decoder, "decoder");
        C10281h.m13700g(decoder);
        return new JsonObject((Map) C14667a.m23k(C14667a.m39E(C9962k0.f22091a), C10275g.f22584a).deserialize(decoder));
    }

    /* renamed from: b */
    public void serialize(Encoder encoder, JsonObject value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        C10281h.m13699h(encoder);
        C14667a.m23k(C14667a.m39E(C9962k0.f22091a), C10275g.f22584a).serialize(encoder, value);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f22601b;
    }
}
