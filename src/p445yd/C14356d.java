package p445yd;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p066dd.C6437f;
import p066dd.EnumC6436e;
import p137hd.C7998c;
import p137hd.C8000e;
import p137hd.C8007l;
import p137hd.EnumC7999d;

/* renamed from: yd.d */
/* loaded from: classes3.dex */
final class C14356d {

    /* renamed from: a */
    private static final char[] f32486a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* renamed from: yd.d$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C14357a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32487a;

        static {
            int[] iArr = new int[EnumC14361h.values().length];
            f32487a = iArr;
            try {
                iArr[EnumC14361h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32487a[EnumC14361h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32487a[EnumC14361h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32487a[EnumC14361h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32487a[EnumC14361h.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32487a[EnumC14361h.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32487a[EnumC14361h.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32487a[EnumC14361h.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32487a[EnumC14361h.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32487a[EnumC14361h.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static C8000e m798a(byte[] bArr, C14363j jVar, EnumC14359f fVar, Map<EnumC6436e, ?> map) {
        EnumC14361h a;
        EnumC14361h hVar;
        ArrayList arrayList;
        String str;
        C7998c cVar = new C7998c(bArr);
        StringBuilder sb2 = new StringBuilder(50);
        boolean z = true;
        ArrayList arrayList2 = new ArrayList(1);
        int i = -1;
        int i2 = -1;
        boolean z2 = false;
        EnumC7999d dVar = null;
        while (true) {
            try {
                if (cVar.m20911a() < 4) {
                    a = EnumC14361h.TERMINATOR;
                } else {
                    a = EnumC14361h.m781a(cVar.m20908d(4));
                }
                int[] iArr = C14357a.f32487a;
                switch (iArr[a.ordinal()]) {
                    case 5:
                        hVar = a;
                        break;
                    case 6:
                    case 7:
                        z2 = z;
                        hVar = a;
                        break;
                    case 8:
                        if (cVar.m20911a() >= 16) {
                            int d = cVar.m20908d(8);
                            i2 = cVar.m20908d(8);
                            i = d;
                            hVar = a;
                            break;
                        } else {
                            throw C6437f.m25561a();
                        }
                    case 9:
                        dVar = EnumC7999d.m20907a(m792g(cVar));
                        if (dVar != null) {
                            hVar = a;
                            break;
                        } else {
                            throw C6437f.m25561a();
                        }
                    case 10:
                        int d2 = cVar.m20908d(4);
                        int d3 = cVar.m20908d(a.m780b(jVar));
                        if (d2 == z) {
                            m795d(cVar, sb2, d3);
                        }
                        hVar = a;
                        break;
                    default:
                        int d4 = cVar.m20908d(a.m780b(jVar));
                        int i3 = iArr[a.ordinal()];
                        if (i3 != z) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    hVar = a;
                                    m796c(cVar, sb2, d4, dVar, arrayList2, map);
                                    break;
                                } else if (i3 == 4) {
                                    m794e(cVar, sb2, d4);
                                    hVar = a;
                                    break;
                                } else {
                                    throw C6437f.m25561a();
                                }
                            } else {
                                hVar = a;
                                m797b(cVar, sb2, d4, z2);
                                break;
                            }
                        } else {
                            hVar = a;
                            m793f(cVar, sb2, d4);
                            break;
                        }
                }
                if (hVar == EnumC14361h.TERMINATOR) {
                    String sb3 = sb2.toString();
                    if (arrayList2.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = arrayList2;
                    }
                    if (fVar == null) {
                        str = null;
                    } else {
                        str = fVar.toString();
                    }
                    return new C8000e(bArr, sb3, arrayList, str, i, i2);
                }
                z = true;
            } catch (IllegalArgumentException unused) {
                throw C6437f.m25561a();
            }
        }
    }

    /* renamed from: b */
    private static void m797b(C7998c cVar, StringBuilder sb2, int i, boolean z) {
        while (i > 1) {
            if (cVar.m20911a() >= 11) {
                int d = cVar.m20908d(11);
                sb2.append(m791h(d / 45));
                sb2.append(m791h(d % 45));
                i -= 2;
            } else {
                throw C6437f.m25561a();
            }
        }
        if (i == 1) {
            if (cVar.m20911a() >= 6) {
                sb2.append(m791h(cVar.m20908d(6)));
            } else {
                throw C6437f.m25561a();
            }
        }
        if (z) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i2 = length + 1;
                        if (sb2.charAt(i2) == '%') {
                            sb2.deleteCharAt(i2);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m796c(C7998c cVar, StringBuilder sb2, int i, EnumC7999d dVar, Collection<byte[]> collection, Map<EnumC6436e, ?> map) {
        String str;
        if ((i << 3) <= cVar.m20911a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) cVar.m20908d(8);
            }
            if (dVar == null) {
                str = C8007l.m20872a(bArr, map);
            } else {
                str = dVar.name();
            }
            try {
                sb2.append(new String(bArr, str));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw C6437f.m25561a();
            }
        } else {
            throw C6437f.m25561a();
        }
    }

    /* renamed from: d */
    private static void m795d(C7998c cVar, StringBuilder sb2, int i) {
        int i2;
        if (i * 13 <= cVar.m20911a()) {
            byte[] bArr = new byte[i * 2];
            int i3 = 0;
            while (i > 0) {
                int d = cVar.m20908d(13);
                int i4 = (d % 96) | ((d / 96) << 8);
                if (i4 < 959) {
                    i2 = 41377;
                } else {
                    i2 = 42657;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i--;
            }
            try {
                sb2.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw C6437f.m25561a();
            }
        } else {
            throw C6437f.m25561a();
        }
    }

    /* renamed from: e */
    private static void m794e(C7998c cVar, StringBuilder sb2, int i) {
        int i2;
        if (i * 13 <= cVar.m20911a()) {
            byte[] bArr = new byte[i * 2];
            int i3 = 0;
            while (i > 0) {
                int d = cVar.m20908d(13);
                int i4 = (d % 192) | ((d / 192) << 8);
                if (i4 < 7936) {
                    i2 = 33088;
                } else {
                    i2 = 49472;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i--;
            }
            try {
                sb2.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw C6437f.m25561a();
            }
        } else {
            throw C6437f.m25561a();
        }
    }

    /* renamed from: f */
    private static void m793f(C7998c cVar, StringBuilder sb2, int i) {
        while (i >= 3) {
            if (cVar.m20911a() >= 10) {
                int d = cVar.m20908d(10);
                if (d < 1000) {
                    sb2.append(m791h(d / 100));
                    sb2.append(m791h((d / 10) % 10));
                    sb2.append(m791h(d % 10));
                    i -= 3;
                } else {
                    throw C6437f.m25561a();
                }
            } else {
                throw C6437f.m25561a();
            }
        }
        if (i == 2) {
            if (cVar.m20911a() >= 7) {
                int d2 = cVar.m20908d(7);
                if (d2 < 100) {
                    sb2.append(m791h(d2 / 10));
                    sb2.append(m791h(d2 % 10));
                    return;
                }
                throw C6437f.m25561a();
            }
            throw C6437f.m25561a();
        } else if (i != 1) {
        } else {
            if (cVar.m20911a() >= 4) {
                int d3 = cVar.m20908d(4);
                if (d3 < 10) {
                    sb2.append(m791h(d3));
                    return;
                }
                throw C6437f.m25561a();
            }
            throw C6437f.m25561a();
        }
    }

    /* renamed from: g */
    private static int m792g(C7998c cVar) {
        int d = cVar.m20908d(8);
        if ((d & 128) == 0) {
            return d & 127;
        }
        if ((d & 192) == 128) {
            return cVar.m20908d(8) | ((d & 63) << 8);
        }
        if ((d & 224) == 192) {
            return cVar.m20908d(16) | ((d & 31) << 16);
        }
        throw C6437f.m25561a();
    }

    /* renamed from: h */
    private static char m791h(int i) {
        char[] cArr = f32486a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw C6437f.m25561a();
    }
}
