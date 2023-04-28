package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m15074d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H'J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\u0013H&J\b\u0010\u0016\u001a\u00020\u0015H&J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0017H&J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0017H&J#\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b!\u0010\"¨\u0006#"}, m15073d2 = {"Lkotlinx/serialization/encoding/Decoder;", "", "", "D", "", "j", "w", "", "H", "", "s", "", "x", "", "h", "", "l", "", "t", "", "v", "", "z", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "e", "descriptor", "q", "Lkotlinx/serialization/encoding/c;", "b", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "G", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public interface Decoder {

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: kotlinx.serialization.encoding.Decoder$a */
    /* loaded from: classes8.dex */
    public static final class C10244a {
        /* renamed from: a */
        public static <T> T m13918a(Decoder decoder, DeserializationStrategy<? extends T> deserializer) {
            C9971q.m14633g(deserializer, "deserializer");
            return (T) deserializer.deserialize(decoder);
        }
    }

    /* renamed from: D */
    boolean mo13910D();

    /* renamed from: G */
    <T> T mo13909G(DeserializationStrategy<? extends T> deserializationStrategy);

    /* renamed from: H */
    byte mo13908H();

    /* renamed from: b */
    AbstractC10248c mo13905b(SerialDescriptor serialDescriptor);

    /* renamed from: e */
    int mo13904e(SerialDescriptor serialDescriptor);

    /* renamed from: h */
    int mo13903h();

    /* renamed from: j */
    Void mo13902j();

    /* renamed from: l */
    long mo13901l();

    /* renamed from: q */
    Decoder mo13900q(SerialDescriptor serialDescriptor);

    /* renamed from: s */
    short mo13899s();

    /* renamed from: t */
    float mo13898t();

    /* renamed from: v */
    double mo13897v();

    /* renamed from: w */
    boolean mo13896w();

    /* renamed from: x */
    char mo13895x();

    /* renamed from: z */
    String mo13894z();
}
