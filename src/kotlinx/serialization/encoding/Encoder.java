package kotlinx.serialization.encoding;

import dj.AbstractC6514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p449yi.AbstractC14437h;

@Metadata(m15074d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0004\u001a\u00020\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH&J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000eH&J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0010H&J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0012H&J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0014H&J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0016H&J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000eH&J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0018H&J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u0018H&J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u000eH\u0016J+\u0010%\u001a\u00020\u0002\"\u0004\b\u0000\u0010\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, m15073d2 = {"Lkotlinx/serialization/encoding/Encoder;", "", "", "w", "m", "", "value", "q", "", "g", "", "o", "", "v", "", "B", "", "k", "", "u", "", "f", "", "F", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "index", "i", "descriptor", "j", "Lkotlinx/serialization/encoding/CompositeEncoder;", "b", "collectionSize", "h", "T", "Lyi/h;", "serializer", "r", "(Lyi/h;Ljava/lang/Object;)V", "Ldj/c;", "a", "()Ldj/c;", "serializersModule", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public interface Encoder {

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: kotlinx.serialization.encoding.Encoder$a */
    /* loaded from: classes8.dex */
    public static final class C10245a {
        /* renamed from: a */
        public static CompositeEncoder m13914a(Encoder encoder, SerialDescriptor descriptor, int i) {
            C9971q.m14633g(descriptor, "descriptor");
            return encoder.mo13885b(descriptor);
        }

        /* renamed from: b */
        public static void m13913b(Encoder encoder) {
        }

        /* renamed from: c */
        public static <T> void m13912c(Encoder encoder, AbstractC14437h<? super T> serializer, T t) {
            C9971q.m14633g(serializer, "serializer");
            if (serializer.getDescriptor().mo13683b()) {
                encoder.mo13872r(serializer, t);
            } else if (t == null) {
                encoder.mo13915m();
            } else {
                encoder.mo13867w();
                encoder.mo13872r(serializer, t);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public static <T> void m13911d(Encoder encoder, AbstractC14437h<? super T> serializer, T t) {
            C9971q.m14633g(serializer, "serializer");
            serializer.serialize(encoder, t);
        }
    }

    /* renamed from: B */
    void mo13892B(int i);

    /* renamed from: F */
    void mo13888F(String str);

    /* renamed from: a */
    AbstractC6514c mo13917a();

    /* renamed from: b */
    CompositeEncoder mo13885b(SerialDescriptor serialDescriptor);

    /* renamed from: f */
    void mo13882f(double d);

    /* renamed from: g */
    void mo13881g(byte b);

    /* renamed from: h */
    CompositeEncoder mo13880h(SerialDescriptor serialDescriptor, int i);

    /* renamed from: i */
    void mo13916i(SerialDescriptor serialDescriptor, int i);

    /* renamed from: j */
    Encoder mo13879j(SerialDescriptor serialDescriptor);

    /* renamed from: k */
    void mo13878k(long j);

    /* renamed from: m */
    void mo13915m();

    /* renamed from: o */
    void mo13875o(short s);

    /* renamed from: q */
    void mo13873q(boolean z);

    /* renamed from: r */
    <T> void mo13872r(AbstractC14437h<? super T> hVar, T t);

    /* renamed from: u */
    void mo13869u(float f);

    /* renamed from: v */
    void mo13868v(char c);

    /* renamed from: w */
    void mo13867w();
}
