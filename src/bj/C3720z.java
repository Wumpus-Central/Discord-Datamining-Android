package bj;

import kotlin.Metadata;
import kotlin.collections.C9899f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\nB)\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u001a"}, m15073d2 = {"Lbj/z;", "", "", "elementsCount", "", "e", "index", "", "b", "c", "a", "d", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/Function2;", "", "Lkotlin/jvm/functions/Function2;", "readIfAbsent", "", "J", "lowerMarks", "[J", "highMarksArray", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function2;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.z */
/* loaded from: classes8.dex */
public final class C3720z {

    /* renamed from: e */
    private static final C3721a f6053e = new C3721a(null);
    @Deprecated

    /* renamed from: f */
    private static final long[] f6054f = new long[0];

    /* renamed from: a */
    private final SerialDescriptor f6055a;

    /* renamed from: b */
    private final Function2<SerialDescriptor, Integer, Boolean> f6056b;

    /* renamed from: c */
    private long f6057c;

    /* renamed from: d */
    private final long[] f6058d;

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"Lbj/z$a;", "", "", "EMPTY_HIGH_MARKS", "[J", "<init>", "()V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: bj.z$a */
    /* loaded from: classes8.dex */
    private static final class C3721a {
        private C3721a() {
        }

        public /* synthetic */ C3721a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3720z(SerialDescriptor descriptor, Function2<? super SerialDescriptor, ? super Integer, Boolean> readIfAbsent) {
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(readIfAbsent, "readIfAbsent");
        this.f6055a = descriptor;
        this.f6056b = readIfAbsent;
        int d = descriptor.mo13681d();
        long j = 0;
        if (d <= 64) {
            this.f6057c = d != 64 ? (-1) << d : j;
            this.f6058d = f6054f;
            return;
        }
        this.f6057c = 0L;
        this.f6058d = m33740e(d);
    }

    /* renamed from: b */
    private final void m33743b(int i) {
        int i2 = (i >>> 6) - 1;
        long[] jArr = this.f6058d;
        jArr[i2] = jArr[i2] | (1 << (i & 63));
    }

    /* renamed from: c */
    private final int m33742c() {
        int length = this.f6058d.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = i2 * 64;
            long j = this.f6058d[i];
            while (j != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                j |= 1 << numberOfTrailingZeros;
                int i4 = numberOfTrailingZeros + i3;
                if (this.f6056b.invoke(this.f6055a, Integer.valueOf(i4)).booleanValue()) {
                    this.f6058d[i] = j;
                    return i4;
                }
            }
            this.f6058d[i] = j;
            i = i2;
        }
        return -1;
    }

    /* renamed from: e */
    private final long[] m33740e(int i) {
        int H;
        long[] jArr = new long[(i - 1) >>> 6];
        if ((i & 63) != 0) {
            H = C9899f.m14958H(jArr);
            jArr[H] = (-1) << i;
        }
        return jArr;
    }

    /* renamed from: a */
    public final void m33744a(int i) {
        if (i < 64) {
            this.f6057c |= 1 << i;
        } else {
            m33743b(i);
        }
    }

    /* renamed from: d */
    public final int m33741d() {
        int numberOfTrailingZeros;
        int d = this.f6055a.mo13681d();
        do {
            long j = this.f6057c;
            if (j != -1) {
                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                this.f6057c |= 1 << numberOfTrailingZeros;
            } else if (d > 64) {
                return m33742c();
            } else {
                return -1;
            }
        } while (!this.f6056b.invoke(this.f6055a, Integer.valueOf(numberOfTrailingZeros)).booleanValue());
        return numberOfTrailingZeros;
    }
}
