package p117g7;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.media.utils.DiscordVideoMediaSource;
import com.facebook.react.views.text.TypefaceStyle;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.nio.ByteBuffer;
import p079e7.C6722k;
import p119g9.C7569x;
import p119g9.C7570y;
import p193k7.C9798l;

/* renamed from: g7.c */
/* loaded from: classes7.dex */
public final class C7429c {

    /* renamed from: a */
    private static final int[] f16008a = {2002, 2000, 1920, 1601, 1600, RNCWebViewManager.COMMAND_CLEAR_CACHE, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, 960, 800, 800, DiscordVideoMediaSource.DEFAULT_HEIGHT, TypefaceStyle.NORMAL, TypefaceStyle.NORMAL, RecyclerView.ItemAnimator.FLAG_MOVED};

    /* renamed from: g7.c$b */
    /* loaded from: classes7.dex */
    public static final class C7431b {

        /* renamed from: a */
        public final int f16009a;

        /* renamed from: b */
        public final int f16010b;

        /* renamed from: c */
        public final int f16011c;

        /* renamed from: d */
        public final int f16012d;

        /* renamed from: e */
        public final int f16013e;

        private C7431b(int i, int i2, int i3, int i4, int i5) {
            this.f16009a = i;
            this.f16011c = i2;
            this.f16010b = i3;
            this.f16012d = i4;
            this.f16013e = i5;
        }
    }

    /* renamed from: a */
    public static void m22687a(int i, C7570y yVar) {
        yVar.m22021L(7);
        byte[] d = yVar.m22012d();
        d[0] = -84;
        d[1] = 64;
        d[2] = -1;
        d[3] = -1;
        d[4] = (byte) ((i >> 16) & 255);
        d[5] = (byte) ((i >> 8) & 255);
        d[6] = (byte) (i & 255);
    }

    /* renamed from: b */
    public static C6722k m22686b(C7570y yVar, String str, String str2, C9798l lVar) {
        int i;
        yVar.m22016Q(1);
        if (((yVar.m22029D() & 32) >> 5) == 1) {
            i = 48000;
        } else {
            i = 44100;
        }
        return new C6722k.C6724b().m24505S(str).m24488e0("audio/ac4").m24516H(2).m24486f0(i).m24512L(lVar).m24502V(str2).m24519E();
    }

    /* renamed from: c */
    public static int m22685c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return m22684d(new C7569x(bArr)).f16013e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (r11 != 11) goto L_0x008d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
        if (r11 != 11) goto L_0x008d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
        if (r11 != 8) goto L_0x008d;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p117g7.C7429c.C7431b m22684d(p119g9.C7569x r11) {
        /*
            r0 = 16
            int r1 = r11.m22044h(r0)
            int r0 = r11.m22044h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L_0x0018
            r0 = 24
            int r0 = r11.m22044h(r0)
            r2 = 7
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r8 = r0
            r0 = 2
            int r1 = r11.m22044h(r0)
            r2 = 3
            if (r1 != r2) goto L_0x002f
            int r4 = m22682f(r11, r0)
            int r1 = r1 + r4
        L_0x002f:
            r5 = r1
            r1 = 10
            int r1 = r11.m22044h(r1)
            boolean r4 = r11.m22045g()
            if (r4 == 0) goto L_0x0045
            int r4 = r11.m22044h(r2)
            if (r4 <= 0) goto L_0x0045
            r11.m22034r(r0)
        L_0x0045:
            boolean r4 = r11.m22045g()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            if (r4 == 0) goto L_0x0053
            r9 = r6
            goto L_0x0054
        L_0x0053:
            r9 = r7
        L_0x0054:
            int r11 = r11.m22044h(r3)
            if (r9 != r7) goto L_0x0063
            r4 = 13
            if (r11 != r4) goto L_0x0063
            int[] r0 = p117g7.C7429c.f16008a
            r11 = r0[r11]
            goto L_0x0093
        L_0x0063:
            if (r9 != r6) goto L_0x0092
            int[] r4 = p117g7.C7429c.f16008a
            int r6 = r4.length
            if (r11 >= r6) goto L_0x0092
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r7 = 1
            if (r1 == r7) goto L_0x0088
            r7 = 11
            if (r1 == r0) goto L_0x0083
            if (r1 == r2) goto L_0x0088
            if (r1 == r3) goto L_0x007c
            goto L_0x008d
        L_0x007c:
            if (r11 == r2) goto L_0x008f
            if (r11 == r6) goto L_0x008f
            if (r11 != r7) goto L_0x008d
            goto L_0x008f
        L_0x0083:
            if (r11 == r6) goto L_0x008f
            if (r11 != r7) goto L_0x008d
            goto L_0x008f
        L_0x0088:
            if (r11 == r2) goto L_0x008f
            if (r11 != r6) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r11 = r4
            goto L_0x0093
        L_0x008f:
            int r4 = r4 + 1
            goto L_0x008d
        L_0x0092:
            r11 = 0
        L_0x0093:
            g7.c$b r0 = new g7.c$b
            r6 = 2
            r10 = 0
            r4 = r0
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p117g7.C7429c.m22684d(g9.x):g7.c$b");
    }

    /* renamed from: e */
    public static int m22683e(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i3 == 65535) {
            i3 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    /* renamed from: f */
    private static int m22682f(C7569x xVar, int i) {
        int i2 = 0;
        while (true) {
            int h = i2 + xVar.m22044h(i);
            if (!xVar.m22045g()) {
                return h;
            }
            i2 = (h + 1) << i;
        }
    }
}
