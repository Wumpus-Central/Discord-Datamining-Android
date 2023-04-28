package bj;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9897e;
import kotlin.collections.C9906j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import nf.C11084n;
import nf.EnumC11087p;
import p014aj.AbstractC1432i;
import p014aj.C1407a;
import p014aj.C1427g;
import p449yi.C14436g;

@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fB'\b\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120 ¢\u0006\u0004\b\u001e\u0010\"J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006#"}, m15073d2 = {"Lbj/h1;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "objectInstance", "", "", "b", "Ljava/util/List;", "_annotations", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "serialName", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "classAnnotations", "(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.h1 */
/* loaded from: classes8.dex */
public final class C3654h1<T> implements KSerializer<T> {

    /* renamed from: a */
    private final T f5962a;

    /* renamed from: b */
    private List<? extends Annotation> f5963b;

    /* renamed from: c */
    private final Lazy f5964c;

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"", "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: bj.h1$a */
    /* loaded from: classes8.dex */
    static final class C3655a extends AbstractC9973s implements Function0<SerialDescriptor> {

        /* renamed from: k */
        final /* synthetic */ String f5965k;

        /* renamed from: l */
        final /* synthetic */ C3654h1<T> f5966l;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"", "T", "Laj/a;", "", "a", "(Laj/a;)V"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: bj.h1$a$a */
        /* loaded from: classes8.dex */
        public static final class C0093a extends AbstractC9973s implements Function1<C1407a, Unit> {

            /* renamed from: k */
            final /* synthetic */ C3654h1<T> f5967k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0093a(C3654h1<T> h1Var) {
                super(1);
                this.f5967k = h1Var;
            }

            /* renamed from: a */
            public final void m33877a(C1407a buildSerialDescriptor) {
                C9971q.m14633g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.m41139h(((C3654h1) this.f5967k).f5963b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C1407a aVar) {
                m33877a(aVar);
                return Unit.f22042a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3655a(String str, C3654h1<T> h1Var) {
            super(0);
            this.f5965k = str;
            this.f5966l = h1Var;
        }

        /* renamed from: a */
        public final SerialDescriptor invoke() {
            return C1427g.m41129c(this.f5965k, AbstractC1432i.C1436d.f484a, new SerialDescriptor[0], new C0093a(this.f5966l));
        }
    }

    public C3654h1(String serialName, T objectInstance) {
        List<? extends Annotation> i;
        Lazy b;
        C9971q.m14633g(serialName, "serialName");
        C9971q.m14633g(objectInstance, "objectInstance");
        this.f5962a = objectInstance;
        i = C9906j.m14820i();
        this.f5963b = i;
        b = C11084n.m10944b(EnumC11087p.PUBLICATION, new C3655a(serialName, this));
        this.f5964c = b;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public T deserialize(Decoder decoder) {
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor);
        int o = b.mo13851o(getDescriptor());
        if (o == -1) {
            Unit unit = Unit.f22042a;
            b.mo13857c(descriptor);
            return this.f5962a;
        }
        throw new C14436g("Unexpected index " + o);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f5964c.getValue();
    }

    @Override // p449yi.AbstractC14437h
    public void serialize(Encoder encoder, T value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        encoder.mo13885b(getDescriptor()).mo13884c(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3654h1(String serialName, T objectInstance, Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        List<? extends Annotation> d;
        C9971q.m14633g(serialName, "serialName");
        C9971q.m14633g(objectInstance, "objectInstance");
        C9971q.m14633g(classAnnotations, "classAnnotations");
        d = C9897e.m14991d(classAnnotations);
        this.f5963b = d;
    }
}
