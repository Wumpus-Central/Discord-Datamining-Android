package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p449yi.AbstractC14437h;

@Metadata(m15074d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH&J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\fH&J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000eH&J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H&J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0013H&J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0015H&J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0017H&J \u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0019H&J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J;\u0010 \u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0004\b \u0010!JA\u0010\"\u001a\u00020\u0004\"\b\b\u0000\u0010\u001d*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H'¢\u0006\u0004\b\"\u0010!¨\u0006#"}, m15073d2 = {"Lkotlinx/serialization/encoding/CompositeEncoder;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "c", "", "index", "", "A", "value", "y", "", "n", "", "C", "", "l", "x", "", "E", "", "s", "", "D", "", "z", "Lkotlinx/serialization/encoding/Encoder;", "e", "T", "Lyi/h;", "serializer", "t", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V", "p", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public interface CompositeEncoder {

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: kotlinx.serialization.encoding.CompositeEncoder$a */
    /* loaded from: classes8.dex */
    public static final class C10243a {
        /* renamed from: a */
        public static boolean m13919a(CompositeEncoder compositeEncoder, SerialDescriptor descriptor, int i) {
            C9971q.m14633g(descriptor, "descriptor");
            return true;
        }
    }

    /* renamed from: A */
    boolean mo13893A(SerialDescriptor serialDescriptor, int i);

    /* renamed from: C */
    void mo13891C(SerialDescriptor serialDescriptor, int i, short s);

    /* renamed from: D */
    void mo13890D(SerialDescriptor serialDescriptor, int i, double d);

    /* renamed from: E */
    void mo13889E(SerialDescriptor serialDescriptor, int i, long j);

    /* renamed from: c */
    void mo13884c(SerialDescriptor serialDescriptor);

    /* renamed from: e */
    Encoder mo13883e(SerialDescriptor serialDescriptor, int i);

    /* renamed from: l */
    void mo13877l(SerialDescriptor serialDescriptor, int i, char c);

    /* renamed from: n */
    void mo13876n(SerialDescriptor serialDescriptor, int i, byte b);

    /* renamed from: p */
    <T> void mo13874p(SerialDescriptor serialDescriptor, int i, AbstractC14437h<? super T> hVar, T t);

    /* renamed from: s */
    void mo13871s(SerialDescriptor serialDescriptor, int i, float f);

    /* renamed from: t */
    <T> void mo13870t(SerialDescriptor serialDescriptor, int i, AbstractC14437h<? super T> hVar, T t);

    /* renamed from: x */
    void mo13866x(SerialDescriptor serialDescriptor, int i, int i2);

    /* renamed from: y */
    void mo13865y(SerialDescriptor serialDescriptor, int i, boolean z);

    /* renamed from: z */
    void mo13864z(SerialDescriptor serialDescriptor, int i, String str);
}
