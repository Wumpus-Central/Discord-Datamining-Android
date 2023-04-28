package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p014aj.AbstractC1410d;
import p014aj.C1407a;
import p014aj.C1427g;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m15073d2 = {"Lkotlinx/serialization/json/g;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "b", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.g */
/* loaded from: classes8.dex */
public final class C10275g implements KSerializer<JsonElement> {

    /* renamed from: a */
    public static final C10275g f22584a = new C10275g();

    /* renamed from: b */
    private static final SerialDescriptor f22585b = C1427g.m41129c("kotlinx.serialization.json.JsonElement", AbstractC1410d.C1412b.f462a, new SerialDescriptor[0], C10276a.f22586k);

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"Laj/a;", "", "a", "(Laj/a;)V"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.json.g$a */
    /* loaded from: classes8.dex */
    static final class C10276a extends AbstractC9973s implements Function1<C1407a, Unit> {

        /* renamed from: k */
        public static final C10276a f22586k = new C10276a();

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m15073d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: kotlinx.serialization.json.g$a$a */
        /* loaded from: classes8.dex */
        public static final class C0319a extends AbstractC9973s implements Function0<SerialDescriptor> {

            /* renamed from: k */
            public static final C0319a f22587k = new C0319a();

            C0319a() {
                super(0);
            }

            /* renamed from: a */
            public final SerialDescriptor invoke() {
                return C10294s.f22605a.getDescriptor();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m15073d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: kotlinx.serialization.json.g$a$b */
        /* loaded from: classes8.dex */
        public static final class C10277b extends AbstractC9973s implements Function0<SerialDescriptor> {

            /* renamed from: k */
            public static final C10277b f22588k = new C10277b();

            C10277b() {
                super(0);
            }

            /* renamed from: a */
            public final SerialDescriptor invoke() {
                return C10291q.f22598a.getDescriptor();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m15073d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: kotlinx.serialization.json.g$a$c */
        /* loaded from: classes8.dex */
        public static final class C10278c extends AbstractC9973s implements Function0<SerialDescriptor> {

            /* renamed from: k */
            public static final C10278c f22589k = new C10278c();

            C10278c() {
                super(0);
            }

            /* renamed from: a */
            public final SerialDescriptor invoke() {
                return C10288n.f22596a.getDescriptor();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m15073d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: kotlinx.serialization.json.g$a$d */
        /* loaded from: classes8.dex */
        public static final class C10279d extends AbstractC9973s implements Function0<SerialDescriptor> {

            /* renamed from: k */
            public static final C10279d f22590k = new C10279d();

            C10279d() {
                super(0);
            }

            /* renamed from: a */
            public final SerialDescriptor invoke() {
                return C10292r.f22600a.getDescriptor();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m15073d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: kotlinx.serialization.json.g$a$e */
        /* loaded from: classes8.dex */
        public static final class C10280e extends AbstractC9973s implements Function0<SerialDescriptor> {

            /* renamed from: k */
            public static final C10280e f22591k = new C10280e();

            C10280e() {
                super(0);
            }

            /* renamed from: a */
            public final SerialDescriptor invoke() {
                return C10269a.f22566a.getDescriptor();
            }
        }

        C10276a() {
            super(1);
        }

        /* renamed from: a */
        public final void m13712a(C1407a buildSerialDescriptor) {
            SerialDescriptor f;
            SerialDescriptor f2;
            SerialDescriptor f3;
            SerialDescriptor f4;
            SerialDescriptor f5;
            C9971q.m14633g(buildSerialDescriptor, "$this$buildSerialDescriptor");
            f = C10281h.m13701f(C0319a.f22587k);
            C1407a.m41145b(buildSerialDescriptor, "JsonPrimitive", f, null, false, 12, null);
            f2 = C10281h.m13701f(C10277b.f22588k);
            C1407a.m41145b(buildSerialDescriptor, "JsonNull", f2, null, false, 12, null);
            f3 = C10281h.m13701f(C10278c.f22589k);
            C1407a.m41145b(buildSerialDescriptor, "JsonLiteral", f3, null, false, 12, null);
            f4 = C10281h.m13701f(C10279d.f22590k);
            C1407a.m41145b(buildSerialDescriptor, "JsonObject", f4, null, false, 12, null);
            f5 = C10281h.m13701f(C10280e.f22591k);
            C1407a.m41145b(buildSerialDescriptor, "JsonArray", f5, null, false, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C1407a aVar) {
            m13712a(aVar);
            return Unit.f22042a;
        }
    }

    private C10275g() {
    }

    /* renamed from: a */
    public JsonElement deserialize(Decoder decoder) {
        C9971q.m14633g(decoder, "decoder");
        return C10281h.m13703d(decoder).mo13729g();
    }

    /* renamed from: b */
    public void serialize(Encoder encoder, JsonElement value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        C10281h.m13699h(encoder);
        if (value instanceof JsonPrimitive) {
            encoder.mo13872r(C10294s.f22605a, value);
        } else if (value instanceof JsonObject) {
            encoder.mo13872r(C10292r.f22600a, value);
        } else if (value instanceof JsonArray) {
            encoder.mo13872r(C10269a.f22566a, value);
        }
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f22585b;
    }
}
