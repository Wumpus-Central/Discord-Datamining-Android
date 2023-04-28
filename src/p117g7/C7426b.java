package p117g7;

import com.discord.media.utils.DiscordVideoMediaSource;
import java.nio.ByteBuffer;
import p079e7.C6722k;
import p119g9.C7557q0;
import p119g9.C7569x;
import p119g9.C7570y;
import p163j$.util.Spliterator;
import p193k7.C9798l;

/* renamed from: g7.b */
/* loaded from: classes7.dex */
public final class C7426b {

    /* renamed from: a */
    private static final int[] f15996a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f15997b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f15998c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f15999d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f16000e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, Spliterator.NONNULL, 320, 384, 448, 512, 576, DiscordVideoMediaSource.DEFAULT_WIDTH};

    /* renamed from: f */
    private static final int[] f16001f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: g7.b$b */
    /* loaded from: classes7.dex */
    public static final class C0232b {

        /* renamed from: a */
        public final String f16002a;

        /* renamed from: b */
        public final int f16003b;

        /* renamed from: c */
        public final int f16004c;

        /* renamed from: d */
        public final int f16005d;

        /* renamed from: e */
        public final int f16006e;

        /* renamed from: f */
        public final int f16007f;

        private C0232b(String str, int i, int i2, int i3, int i4, int i5) {
            this.f16002a = str;
            this.f16003b = i;
            this.f16005d = i2;
            this.f16004c = i3;
            this.f16006e = i4;
            this.f16007f = i5;
        }
    }

    /* renamed from: a */
    public static int m22697a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((C7557q0.m22201H(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - position;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private static int m22696b(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f15997b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f16001f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f16000e[i3];
        if (i4 == 32000) {
            return i5 * 6;
        }
        return i5 * 4;
    }

    /* renamed from: c */
    public static C6722k m22695c(C7570y yVar, String str, String str2, C9798l lVar) {
        int i = f15997b[(yVar.m22029D() & 192) >> 6];
        int D = yVar.m22029D();
        int i2 = f15999d[(D & 56) >> 3];
        if ((D & 4) != 0) {
            i2++;
        }
        return new C6722k.C6724b().m24505S(str).m24488e0("audio/ac3").m24516H(i2).m24486f0(i).m24512L(lVar).m24502V(str2).m24519E();
    }

    /* renamed from: d */
    public static int m22694d(ByteBuffer byteBuffer) {
        boolean z;
        int i = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f15996a[i] * Spliterator.NONNULL;
    }

    /* renamed from: e */
    public static C0232b m22693e(C7569x xVar) {
        boolean z;
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        String str2;
        int i6;
        int i7;
        int i8;
        String str3;
        int i9;
        int i10;
        int e = xVar.m22047e();
        xVar.m22034r(40);
        if (xVar.m22044h(5) > 10) {
            z = true;
        } else {
            z = false;
        }
        xVar.m22036p(e);
        int i11 = -1;
        if (z) {
            xVar.m22034r(16);
            int h = xVar.m22044h(2);
            if (h == 0) {
                i11 = 0;
            } else if (h == 1) {
                i11 = 1;
            } else if (h == 2) {
                i11 = 2;
            }
            xVar.m22034r(3);
            i4 = (xVar.m22044h(11) + 1) * 2;
            int h2 = xVar.m22044h(2);
            if (h2 == 3) {
                i3 = f15998c[xVar.m22044h(2)];
                i6 = 6;
                i7 = 3;
            } else {
                i7 = xVar.m22044h(2);
                i6 = f15996a[i7];
                i3 = f15997b[h2];
            }
            i5 = i6 * Spliterator.NONNULL;
            int h3 = xVar.m22044h(3);
            boolean g = xVar.m22045g();
            i2 = f15999d[h3] + (g ? 1 : 0);
            xVar.m22034r(10);
            if (xVar.m22045g()) {
                xVar.m22034r(8);
            }
            if (h3 == 0) {
                xVar.m22034r(5);
                if (xVar.m22045g()) {
                    xVar.m22034r(8);
                }
            }
            if (i11 == 1 && xVar.m22045g()) {
                xVar.m22034r(16);
            }
            if (xVar.m22045g()) {
                if (h3 > 2) {
                    xVar.m22034r(2);
                }
                if ((h3 & 1) == 0 || h3 <= 2) {
                    i9 = 6;
                } else {
                    i9 = 6;
                    xVar.m22034r(6);
                }
                if ((h3 & 4) != 0) {
                    xVar.m22034r(i9);
                }
                if (g && xVar.m22045g()) {
                    xVar.m22034r(5);
                }
                if (i11 == 0) {
                    if (xVar.m22045g()) {
                        i10 = 6;
                        xVar.m22034r(6);
                    } else {
                        i10 = 6;
                    }
                    if (h3 == 0 && xVar.m22045g()) {
                        xVar.m22034r(i10);
                    }
                    if (xVar.m22045g()) {
                        xVar.m22034r(i10);
                    }
                    int h4 = xVar.m22044h(2);
                    if (h4 == 1) {
                        xVar.m22034r(5);
                    } else if (h4 == 2) {
                        xVar.m22034r(12);
                    } else if (h4 == 3) {
                        int h5 = xVar.m22044h(5);
                        if (xVar.m22045g()) {
                            xVar.m22034r(5);
                            if (xVar.m22045g()) {
                                xVar.m22034r(4);
                            }
                            if (xVar.m22045g()) {
                                xVar.m22034r(4);
                            }
                            if (xVar.m22045g()) {
                                xVar.m22034r(4);
                            }
                            if (xVar.m22045g()) {
                                xVar.m22034r(4);
                            }
                            if (xVar.m22045g()) {
                                xVar.m22034r(4);
                            }
                            if (xVar.m22045g()) {
                                xVar.m22034r(4);
                            }
                            if (xVar.m22045g()) {
                                xVar.m22034r(4);
                            }
                            if (xVar.m22045g()) {
                                if (xVar.m22045g()) {
                                    xVar.m22034r(4);
                                }
                                if (xVar.m22045g()) {
                                    xVar.m22034r(4);
                                }
                            }
                        }
                        if (xVar.m22045g()) {
                            xVar.m22034r(5);
                            if (xVar.m22045g()) {
                                xVar.m22034r(7);
                                if (xVar.m22045g()) {
                                    xVar.m22034r(8);
                                }
                            }
                        }
                        xVar.m22034r((h5 + 2) * 8);
                        xVar.m22049c();
                    }
                    if (h3 < 2) {
                        if (xVar.m22045g()) {
                            xVar.m22034r(14);
                        }
                        if (h3 == 0 && xVar.m22045g()) {
                            xVar.m22034r(14);
                        }
                    }
                    if (xVar.m22045g()) {
                        if (i7 == 0) {
                            xVar.m22034r(5);
                        } else {
                            for (int i12 = 0; i12 < i6; i12++) {
                                if (xVar.m22045g()) {
                                    xVar.m22034r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (xVar.m22045g()) {
                xVar.m22034r(5);
                if (h3 == 2) {
                    xVar.m22034r(4);
                }
                if (h3 >= 6) {
                    xVar.m22034r(2);
                }
                if (xVar.m22045g()) {
                    xVar.m22034r(8);
                }
                if (h3 == 0 && xVar.m22045g()) {
                    xVar.m22034r(8);
                }
                if (h2 < 3) {
                    xVar.m22035q();
                }
            }
            if (i11 == 0 && i7 != 3) {
                xVar.m22035q();
            }
            if (i11 != 2 || (i7 != 3 && !xVar.m22045g())) {
                i8 = 6;
            } else {
                i8 = 6;
                xVar.m22034r(6);
            }
            if (xVar.m22045g() && xVar.m22044h(i8) == 1 && xVar.m22044h(8) == 1) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
            str = str3;
            i = i11;
        } else {
            xVar.m22034r(32);
            int h6 = xVar.m22044h(2);
            if (h6 == 3) {
                str2 = null;
            } else {
                str2 = "audio/ac3";
            }
            i4 = m22696b(h6, xVar.m22044h(6));
            xVar.m22034r(8);
            int h7 = xVar.m22044h(3);
            if (!((h7 & 1) == 0 || h7 == 1)) {
                xVar.m22034r(2);
            }
            if ((h7 & 4) != 0) {
                xVar.m22034r(2);
            }
            if (h7 == 2) {
                xVar.m22034r(2);
            }
            int[] iArr = f15997b;
            if (h6 < iArr.length) {
                i3 = iArr[h6];
            } else {
                i3 = -1;
            }
            i2 = f15999d[h7] + (xVar.m22045g() ? 1 : 0);
            i5 = 1536;
            i = -1;
            str = str2;
        }
        return new C0232b(str, i, i2, i3, i4, i5);
    }

    /* renamed from: f */
    public static int m22692f(byte[] bArr) {
        boolean z;
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b = bArr[4];
        return m22696b((b & 192) >> 6, b & 63);
    }

    /* renamed from: g */
    public static C6722k m22691g(C7570y yVar, String str, String str2, C9798l lVar) {
        String str3;
        yVar.m22016Q(2);
        int i = f15997b[(yVar.m22029D() & 192) >> 6];
        int D = yVar.m22029D();
        int i2 = f15999d[(D & 14) >> 1];
        if ((D & 1) != 0) {
            i2++;
        }
        if (((yVar.m22029D() & 30) >> 1) > 0 && (2 & yVar.m22029D()) != 0) {
            i2 += 2;
        }
        if (yVar.m22015a() <= 0 || (yVar.m22029D() & 1) == 0) {
            str3 = "audio/eac3";
        } else {
            str3 = "audio/eac3-joc";
        }
        return new C6722k.C6724b().m24505S(str).m24488e0(str3).m24516H(i2).m24486f0(i).m24512L(lVar).m24502V(str2).m24519E();
    }

    /* renamed from: h */
    public static int m22690h(ByteBuffer byteBuffer, int i) {
        boolean z;
        int i2;
        if ((byteBuffer.get(byteBuffer.position() + i + 7) & 255) == 187) {
            z = true;
        } else {
            z = false;
        }
        int position = byteBuffer.position() + i;
        if (z) {
            i2 = 9;
        } else {
            i2 = 8;
        }
        return 40 << ((byteBuffer.get(position + i2) >> 4) & 7);
    }

    /* renamed from: i */
    public static int m22689i(byte[] bArr) {
        char c;
        boolean z = false;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                if ((b & 255) == 187) {
                    z = true;
                }
                if (z) {
                    c = '\t';
                } else {
                    c = '\b';
                }
                return 40 << ((bArr[c] >> 4) & 7);
            }
        }
        return 0;
    }
}
