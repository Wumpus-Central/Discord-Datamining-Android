package p450yj;

import androidx.recyclerview.widget.ItemTouchHelper;
import kotlin.Metadata;
import kotlin.collections.C9897e;
import kotlin.jvm.internal.C9971q;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import p163j$.util.Spliterator;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\bJ\u001e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001a¨\u0006\u001e"}, m15073d2 = {"Lyj/k;", "", "", "symbol", "code", "codeBitCount", "", "a", "Lokio/ByteString;", "source", "Lokio/BufferedSink;", "sink", "c", "bytes", "d", "Lokio/BufferedSource;", "", "byteCount", "b", "", "[I", "CODES", "", "[B", "CODE_BIT_COUNTS", "Lyj/k$a;", "Lyj/k$a;", "root", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: yj.k */
/* loaded from: classes8.dex */
public final class C14488k {

    /* renamed from: b */
    private static final byte[] f32864b;

    /* renamed from: d */
    public static final C14488k f32866d;

    /* renamed from: a */
    private static final int[] f32863a = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, ItemTouchHelper.AbstractC3083c.DEFAULT_SWIPE_ANIMATION_DURATION, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* renamed from: c */
    private static final C14489a f32865c = new C14489a();

    static {
        C14488k kVar = new C14488k();
        f32866d = kVar;
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        f32864b = bArr;
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            kVar.m365a(i, f32863a[i], f32864b[i]);
        }
    }

    private C14488k() {
    }

    /* renamed from: a */
    private final void m365a(int i, int i2, int i3) {
        C14489a aVar = new C14489a(i, i3);
        C14489a aVar2 = f32865c;
        while (i3 > 8) {
            i3 -= 8;
            int i4 = (i2 >>> i3) & 255;
            C14489a[] a = aVar2.m361a();
            C9971q.m14636d(a);
            C14489a aVar3 = a[i4];
            if (aVar3 == null) {
                aVar3 = new C14489a();
                a[i4] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i5 = 8 - i3;
        int i6 = (i2 << i5) & 255;
        C14489a[] a2 = aVar2.m361a();
        C9971q.m14636d(a2);
        C9897e.m14983l(a2, aVar, i6, (1 << i5) + i6);
    }

    /* renamed from: b */
    public final void m364b(BufferedSource source, long j, BufferedSink sink) {
        C9971q.m14633g(source, "source");
        C9971q.m14633g(sink, "sink");
        C14489a aVar = f32865c;
        int i = 0;
        int i2 = 0;
        for (long j2 = 0; j2 < j; j2++) {
            i = (i << 8) | C12729c.m5616b(source.readByte(), 255);
            i2 += 8;
            while (i2 >= 8) {
                int i3 = i2 - 8;
                C14489a[] a = aVar.m361a();
                C9971q.m14636d(a);
                aVar = a[(i >>> i3) & 255];
                C9971q.m14636d(aVar);
                if (aVar.m361a() == null) {
                    sink.writeByte(aVar.m360b());
                    i2 -= aVar.m359c();
                    aVar = f32865c;
                } else {
                    i2 = i3;
                }
            }
        }
        while (i2 > 0) {
            C14489a[] a2 = aVar.m361a();
            C9971q.m14636d(a2);
            C14489a aVar2 = a2[(i << (8 - i2)) & 255];
            C9971q.m14636d(aVar2);
            if (aVar2.m361a() == null && aVar2.m359c() <= i2) {
                sink.writeByte(aVar2.m360b());
                i2 -= aVar2.m359c();
                aVar = f32865c;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m363c(ByteString source, BufferedSink sink) {
        C9971q.m14633g(source, "source");
        C9971q.m14633g(sink, "sink");
        int v = source.m9697v();
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < v; i2++) {
            int b = C12729c.m5616b(source.m9713f(i2), 255);
            int i3 = f32863a[b];
            byte b2 = f32864b[b];
            j = (j << b2) | i3;
            i += b2;
            while (i >= 8) {
                i = (i == true ? 1 : 0) - 8;
                sink.writeByte((int) (j >> i));
            }
        }
        if (i > 0) {
            sink.writeByte((int) ((j << (8 - i)) | (255 >>> (i == 1 ? 1L : 0L))));
        }
    }

    /* renamed from: d */
    public final int m362d(ByteString bytes) {
        C9971q.m14633g(bytes, "bytes");
        int v = bytes.m9697v();
        long j = 0;
        for (int i = 0; i < v; i++) {
            j += f32864b[C12729c.m5616b(bytes.m9713f(i), 255)];
        }
        return (int) ((j + 7) >> 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u0011R!\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\n¨\u0006\u0012"}, m15073d2 = {"Lyj/k$a;", "", "", "a", "[Lyj/k$a;", "()[Lyj/k$a;", "children", "", "b", "I", "()I", "symbol", "c", "terminalBitCount", "<init>", "()V", "bits", "(II)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.k$a */
    /* loaded from: classes8.dex */
    public static final class C14489a {

        /* renamed from: a */
        private final C14489a[] f32867a;

        /* renamed from: b */
        private final int f32868b;

        /* renamed from: c */
        private final int f32869c;

        public C14489a() {
            this.f32867a = new C14489a[Spliterator.NONNULL];
            this.f32868b = 0;
            this.f32869c = 0;
        }

        /* renamed from: a */
        public final C14489a[] m361a() {
            return this.f32867a;
        }

        /* renamed from: b */
        public final int m360b() {
            return this.f32868b;
        }

        /* renamed from: c */
        public final int m359c() {
            return this.f32869c;
        }

        public C14489a(int i, int i2) {
            this.f32867a = null;
            this.f32868b = i;
            int i3 = i2 & 7;
            this.f32869c = i3 == 0 ? 8 : i3;
        }
    }
}
