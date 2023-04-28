package p214ld;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import p066dd.C6437f;
import p137hd.C7998c;
import p137hd.C8000e;
import p163j$.util.Spliterator;

/* renamed from: ld.c */
/* loaded from: classes3.dex */
final class C10399c {

    /* renamed from: b */
    private static final char[] f22785b;

    /* renamed from: d */
    private static final char[] f22787d;

    /* renamed from: a */
    private static final char[] f22784a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: c */
    private static final char[] f22786c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: e */
    private static final char[] f22788e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    /* renamed from: ld.c$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C10400a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22789a;

        static {
            int[] iArr = new int[EnumC10401b.values().length];
            f22789a = iArr;
            try {
                iArr[EnumC10401b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22789a[EnumC10401b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22789a[EnumC10401b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22789a[EnumC10401b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22789a[EnumC10401b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ld.c$b */
    /* loaded from: classes3.dex */
    public enum EnumC10401b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f22785b = cArr;
        f22787d = cArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C8000e m13498a(byte[] bArr) {
        C7998c cVar = new C7998c(bArr);
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        EnumC10401b bVar = EnumC10401b.ASCII_ENCODE;
        do {
            EnumC10401b bVar2 = EnumC10401b.ASCII_ENCODE;
            if (bVar == bVar2) {
                bVar = m13496c(cVar, sb2, sb3);
            } else {
                int i = C10400a.f22789a[bVar.ordinal()];
                if (i == 1) {
                    m13494e(cVar, sb2);
                } else if (i == 2) {
                    m13492g(cVar, sb2);
                } else if (i == 3) {
                    m13497b(cVar, sb2);
                } else if (i == 4) {
                    m13493f(cVar, sb2);
                } else if (i == 5) {
                    m13495d(cVar, sb2, arrayList);
                } else {
                    throw C6437f.m25561a();
                }
                bVar = bVar2;
            }
            if (bVar == EnumC10401b.PAD_ENCODE) {
                break;
            }
        } while (cVar.m20911a() > 0);
        if (sb3.length() > 0) {
            sb2.append((CharSequence) sb3);
        }
        String sb4 = sb2.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new C8000e(bArr, sb4, arrayList, null);
    }

    /* renamed from: b */
    private static void m13497b(C7998c cVar, StringBuilder sb2) {
        int d;
        int[] iArr = new int[3];
        while (cVar.m20911a() != 8 && (d = cVar.m20908d(8)) != 254) {
            m13491h(d, cVar.m20908d(8), iArr);
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    sb2.append('\r');
                } else if (i2 == 1) {
                    sb2.append('*');
                } else if (i2 == 2) {
                    sb2.append('>');
                } else if (i2 == 3) {
                    sb2.append(' ');
                } else if (i2 < 14) {
                    sb2.append((char) (i2 + 44));
                } else if (i2 < 40) {
                    sb2.append((char) (i2 + 51));
                } else {
                    throw C6437f.m25561a();
                }
            }
            if (cVar.m20911a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: c */
    private static EnumC10401b m13496c(C7998c cVar, StringBuilder sb2, StringBuilder sb3) {
        boolean z = false;
        do {
            int d = cVar.m20908d(8);
            if (d != 0) {
                if (d > 128) {
                    if (d != 129) {
                        if (d > 229) {
                            switch (d) {
                                case 230:
                                    return EnumC10401b.C40_ENCODE;
                                case 231:
                                    return EnumC10401b.BASE256_ENCODE;
                                case 232:
                                    sb2.append((char) 29);
                                    break;
                                case 233:
                                case 234:
                                case 241:
                                    break;
                                case 235:
                                    z = true;
                                    break;
                                case 236:
                                    sb2.append("[)>\u001e05\u001d");
                                    sb3.insert(0, "\u001e\u0004");
                                    break;
                                case 237:
                                    sb2.append("[)>\u001e06\u001d");
                                    sb3.insert(0, "\u001e\u0004");
                                    break;
                                case 238:
                                    return EnumC10401b.ANSIX12_ENCODE;
                                case 239:
                                    return EnumC10401b.TEXT_ENCODE;
                                case 240:
                                    return EnumC10401b.EDIFACT_ENCODE;
                                default:
                                    if (!(d == 254 && cVar.m20911a() == 0)) {
                                        throw C6437f.m25561a();
                                    }
                                    break;
                            }
                        } else {
                            int i = d - 130;
                            if (i < 10) {
                                sb2.append('0');
                            }
                            sb2.append(i);
                        }
                    } else {
                        return EnumC10401b.PAD_ENCODE;
                    }
                } else {
                    if (z) {
                        d += 128;
                    }
                    sb2.append((char) (d - 1));
                    return EnumC10401b.ASCII_ENCODE;
                }
            } else {
                throw C6437f.m25561a();
            }
        } while (cVar.m20911a() > 0);
        return EnumC10401b.ASCII_ENCODE;
    }

    /* renamed from: d */
    private static void m13495d(C7998c cVar, StringBuilder sb2, Collection<byte[]> collection) {
        int c = cVar.m20909c() + 1;
        int i = c + 1;
        int i2 = m13490i(cVar.m20908d(8), c);
        if (i2 == 0) {
            i2 = cVar.m20911a() / 8;
        } else if (i2 >= 250) {
            i2 = ((i2 - 249) * ItemTouchHelper.AbstractC3083c.DEFAULT_SWIPE_ANIMATION_DURATION) + m13490i(cVar.m20908d(8), i);
            i++;
        }
        if (i2 >= 0) {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                if (cVar.m20911a() >= 8) {
                    bArr[i3] = (byte) m13490i(cVar.m20908d(8), i);
                    i3++;
                    i++;
                } else {
                    throw C6437f.m25561a();
                }
            }
            collection.add(bArr);
            try {
                sb2.append(new String(bArr, "ISO8859_1"));
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e)));
            }
        } else {
            throw C6437f.m25561a();
        }
    }

    /* renamed from: e */
    private static void m13494e(C7998c cVar, StringBuilder sb2) {
        int d;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (cVar.m20911a() != 8 && (d = cVar.m20908d(8)) != 254) {
            m13491h(d, cVar.m20908d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = f22785b;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    sb2.append((char) (c + 128));
                                    z = false;
                                } else {
                                    sb2.append(c);
                                }
                            } else if (i3 == 27) {
                                sb2.append((char) 29);
                            } else if (i3 == 30) {
                                z = true;
                            } else {
                                throw C6437f.m25561a();
                            }
                            i = 0;
                        } else if (i != 3) {
                            throw C6437f.m25561a();
                        } else if (z) {
                            sb2.append((char) (i3 + 224));
                            z = false;
                            i = 0;
                        } else {
                            sb2.append((char) (i3 + 96));
                            i = 0;
                        }
                    } else if (z) {
                        sb2.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        sb2.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr2 = f22784a;
                    if (i3 < cArr2.length) {
                        char c2 = cArr2[i3];
                        if (z) {
                            sb2.append((char) (c2 + 128));
                            z = false;
                        } else {
                            sb2.append(c2);
                        }
                    } else {
                        throw C6437f.m25561a();
                    }
                }
            }
            if (cVar.m20911a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: f */
    private static void m13493f(C7998c cVar, StringBuilder sb2) {
        while (cVar.m20911a() > 16) {
            for (int i = 0; i < 4; i++) {
                int d = cVar.m20908d(6);
                if (d == 31) {
                    int b = 8 - cVar.m20910b();
                    if (b != 8) {
                        cVar.m20908d(b);
                        return;
                    }
                    return;
                }
                if ((d & 32) == 0) {
                    d |= 64;
                }
                sb2.append((char) d);
            }
            if (cVar.m20911a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: g */
    private static void m13492g(C7998c cVar, StringBuilder sb2) {
        int d;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (cVar.m20911a() != 8 && (d = cVar.m20908d(8)) != 254) {
            m13491h(d, cVar.m20908d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = f22787d;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    sb2.append((char) (c + 128));
                                    z = false;
                                } else {
                                    sb2.append(c);
                                }
                            } else if (i3 == 27) {
                                sb2.append((char) 29);
                            } else if (i3 == 30) {
                                z = true;
                            } else {
                                throw C6437f.m25561a();
                            }
                            i = 0;
                        } else if (i == 3) {
                            char[] cArr2 = f22788e;
                            if (i3 < cArr2.length) {
                                char c2 = cArr2[i3];
                                if (z) {
                                    sb2.append((char) (c2 + 128));
                                    z = false;
                                    i = 0;
                                } else {
                                    sb2.append(c2);
                                    i = 0;
                                }
                            } else {
                                throw C6437f.m25561a();
                            }
                        } else {
                            throw C6437f.m25561a();
                        }
                    } else if (z) {
                        sb2.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        sb2.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr3 = f22786c;
                    if (i3 < cArr3.length) {
                        char c3 = cArr3[i3];
                        if (z) {
                            sb2.append((char) (c3 + 128));
                            z = false;
                        } else {
                            sb2.append(c3);
                        }
                    } else {
                        throw C6437f.m25561a();
                    }
                }
            }
            if (cVar.m20911a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: h */
    private static void m13491h(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    /* renamed from: i */
    private static int m13490i(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + Spliterator.NONNULL;
    }
}
