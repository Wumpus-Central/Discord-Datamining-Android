package kotlinx.serialization.encoding;

import dj.AbstractC6514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m15074d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H\u0017J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J?\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\"\u0010#JG\u0010$\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001e*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00018\u0000H'¢\u0006\u0004\b$\u0010#R\u0014\u0010(\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, m15073d2 = {"Lkotlinx/serialization/encoding/c;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "c", "", "p", "", "o", "k", "index", "C", "", "B", "", "A", "", "E", "i", "", "f", "", "u", "", "F", "", "m", "Lkotlinx/serialization/encoding/Decoder;", "r", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "previousValue", "y", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "n", "Ldj/c;", "a", "()Ldj/c;", "serializersModule", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.encoding.c */
/* loaded from: classes8.dex */
public interface AbstractC10248c {

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: kotlinx.serialization.encoding.c$a */
    /* loaded from: classes8.dex */
    public static final class C10249a {
        /* renamed from: a */
        public static int m13846a(AbstractC10248c cVar, SerialDescriptor descriptor) {
            C9971q.m14633g(descriptor, "descriptor");
            return -1;
        }

        /* renamed from: b */
        public static boolean m13845b(AbstractC10248c cVar) {
            return false;
        }

        /* renamed from: c */
        public static /* synthetic */ Object m13844c(AbstractC10248c cVar, SerialDescriptor serialDescriptor, int i, DeserializationStrategy deserializationStrategy, Object obj, int i2, Object obj2) {
            if (obj2 == null) {
                if ((i2 & 8) != 0) {
                    obj = null;
                }
                return cVar.mo13847y(serialDescriptor, i, deserializationStrategy, obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
    }

    /* renamed from: A */
    char mo13863A(SerialDescriptor serialDescriptor, int i);

    /* renamed from: B */
    byte mo13862B(SerialDescriptor serialDescriptor, int i);

    /* renamed from: C */
    boolean mo13861C(SerialDescriptor serialDescriptor, int i);

    /* renamed from: E */
    short mo13860E(SerialDescriptor serialDescriptor, int i);

    /* renamed from: F */
    double mo13859F(SerialDescriptor serialDescriptor, int i);

    /* renamed from: a */
    AbstractC6514c mo13858a();

    /* renamed from: c */
    void mo13857c(SerialDescriptor serialDescriptor);

    /* renamed from: f */
    long mo13856f(SerialDescriptor serialDescriptor, int i);

    /* renamed from: i */
    int mo13855i(SerialDescriptor serialDescriptor, int i);

    /* renamed from: k */
    int mo13854k(SerialDescriptor serialDescriptor);

    /* renamed from: m */
    String mo13853m(SerialDescriptor serialDescriptor, int i);

    /* renamed from: n */
    <T> T mo13852n(SerialDescriptor serialDescriptor, int i, DeserializationStrategy<? extends T> deserializationStrategy, T t);

    /* renamed from: o */
    int mo13851o(SerialDescriptor serialDescriptor);

    /* renamed from: p */
    boolean mo13850p();

    /* renamed from: r */
    Decoder mo13849r(SerialDescriptor serialDescriptor, int i);

    /* renamed from: u */
    float mo13848u(SerialDescriptor serialDescriptor, int i);

    /* renamed from: y */
    <T> T mo13847y(SerialDescriptor serialDescriptor, int i, DeserializationStrategy<? extends T> deserializationStrategy, T t);
}
