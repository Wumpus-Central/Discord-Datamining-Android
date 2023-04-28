package p117g7;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.media.utils.DiscordVideoMediaSource;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p079e7.C6722k;
import p119g9.C7569x;
import p163j$.util.Spliterator;
import p193k7.C9798l;

/* renamed from: g7.i0 */
/* loaded from: classes7.dex */
public final class C7458i0 {

    /* renamed from: a */
    private static final int[] f16091a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f16092b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    private static final int[] f16093c = {64, 112, 128, 192, 224, Spliterator.NONNULL, 384, 448, 512, DiscordVideoMediaSource.DEFAULT_WIDTH, 768, 896, Spliterator.IMMUTABLE, 1152, 1280, 1536, 1920, RecyclerView.ItemAnimator.FLAG_MOVED, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m22594a(byte[] r7) {
        /*
            r0 = 0
            byte r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L_0x004a
            r2 = -1
            if (r1 == r2) goto L_0x0032
            r2 = 31
            if (r1 == r2) goto L_0x0021
            r1 = 5
            byte r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r4]
            goto L_0x0058
        L_0x0021:
            byte r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            byte r7 = r7[r1]
            goto L_0x0042
        L_0x0032:
            byte r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            byte r7 = r7[r1]
        L_0x0042:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L_0x005d
        L_0x004a:
            byte r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r3]
        L_0x0058:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L_0x005d:
            if (r0 == 0) goto L_0x0063
            int r7 = r7 * 16
            int r7 = r7 / 14
        L_0x0063:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p117g7.C7458i0.m22594a(byte[]):int");
    }

    /* renamed from: b */
    private static C7569x m22593b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new C7569x(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (m22592c(copyOf)) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b;
            }
        }
        C7569x xVar = new C7569x(copyOf);
        if (copyOf[0] == 31) {
            C7569x xVar2 = new C7569x(copyOf);
            while (xVar2.m22050b() >= 16) {
                xVar2.m22034r(2);
                xVar.m22046f(xVar2.m22044h(14), 14);
            }
        }
        xVar.m22038n(copyOf);
        return xVar;
    }

    /* renamed from: c */
    private static boolean m22592c(byte[] bArr) {
        byte b = bArr[0];
        return b == -2 || b == -1;
    }

    /* renamed from: d */
    public static boolean m22591d(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    /* renamed from: e */
    public static int m22590e(ByteBuffer byteBuffer) {
        int i;
        int i2;
        byte b;
        byte b2;
        int position = byteBuffer.position();
        byte b3 = byteBuffer.get(position);
        if (b3 != -2) {
            if (b3 == -1) {
                i2 = (byteBuffer.get(position + 4) & 7) << 4;
                b2 = byteBuffer.get(position + 7);
            } else if (b3 != 31) {
                i2 = (byteBuffer.get(position + 4) & 1) << 6;
                b = byteBuffer.get(position + 5);
            } else {
                i2 = (byteBuffer.get(position + 5) & 7) << 4;
                b2 = byteBuffer.get(position + 6);
            }
            i = b2 & 60;
            return (((i >> 2) | i2) + 1) * 32;
        }
        i2 = (byteBuffer.get(position + 5) & 1) << 6;
        b = byteBuffer.get(position + 4);
        i = b & 252;
        return (((i >> 2) | i2) + 1) * 32;
    }

    /* renamed from: f */
    public static int m22589f(byte[] bArr) {
        int i;
        int i2;
        byte b;
        byte b2;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i2 = (bArr[4] & 7) << 4;
                b2 = bArr[7];
            } else if (b3 != 31) {
                i2 = (bArr[4] & 1) << 6;
                b = bArr[5];
            } else {
                i2 = (bArr[5] & 7) << 4;
                b2 = bArr[6];
            }
            i = b2 & 60;
            return (((i >> 2) | i2) + 1) * 32;
        }
        i2 = (bArr[5] & 1) << 6;
        b = bArr[4];
        i = b & 252;
        return (((i >> 2) | i2) + 1) * 32;
    }

    /* renamed from: g */
    public static C6722k m22588g(byte[] bArr, String str, String str2, C9798l lVar) {
        int i;
        int i2;
        C7569x b = m22593b(bArr);
        b.m22034r(60);
        int i3 = f16091a[b.m22044h(6)];
        int i4 = f16092b[b.m22044h(4)];
        int h = b.m22044h(5);
        int[] iArr = f16093c;
        if (h >= iArr.length) {
            i = -1;
        } else {
            i = (iArr[h] * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) / 2;
        }
        b.m22034r(10);
        if (b.m22044h(2) > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        return new C6722k.C6724b().m24505S(str).m24488e0("audio/vnd.dts").m24517G(i).m24516H(i3 + i2).m24486f0(i4).m24512L(lVar).m24502V(str2).m24519E();
    }
}
