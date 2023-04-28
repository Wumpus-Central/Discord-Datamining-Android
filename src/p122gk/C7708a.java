package p122gk;

import fk.C7354b;
import fk.C7369p;
import fk.C7377u;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a0\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\bH\u0000\"\u001a\u0010\u0016\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, m15073d2 = {"Lfk/u;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "b", "Lokio/Buffer;", "", "newline", "", "c", "Lfk/p;", "options", "selectTruncated", "d", "a", "[B", "()[B", "HEX_DIGIT_BYTES", "okio"}, m15072k = 2, m15071mv = {1, 4, 0})
/* renamed from: gk.a */
/* loaded from: classes8.dex */
public final class C7708a {

    /* renamed from: a */
    private static final byte[] f16735a = C7354b.m22843a("0123456789abcdef");

    /* renamed from: a */
    public static final byte[] m21591a() {
        return f16735a;
    }

    /* renamed from: b */
    public static final boolean m21590b(C7377u segment, int i, byte[] bytes, int i2, int i3) {
        C9971q.m14633g(segment, "segment");
        C9971q.m14633g(bytes, "bytes");
        int i4 = segment.f15888c;
        byte[] bArr = segment.f15886a;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.f15891f;
                C9971q.m14636d(segment);
                byte[] bArr2 = segment.f15886a;
                bArr = bArr2;
                i = segment.f15887b;
                i4 = segment.f15888c;
            }
            if (bArr[i] != bytes[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: c */
    public static final String m21589c(Buffer readUtf8Line, long j) {
        C9971q.m14633g(readUtf8Line, "$this$readUtf8Line");
        if (j > 0) {
            long j2 = j - 1;
            if (readUtf8Line.m9792C(j2) == ((byte) 13)) {
                String z0 = readUtf8Line.m9756z0(j2);
                readUtf8Line.skip(2L);
                return z0;
            }
        }
        String z02 = readUtf8Line.m9756z0(j);
        readUtf8Line.skip(1L);
        return z02;
    }

    /* renamed from: d */
    public static final int m21588d(Buffer selectPrefix, C7369p options, boolean z) {
        int i;
        int i2;
        boolean z2;
        int i3;
        C7377u uVar;
        int i4;
        C9971q.m14633g(selectPrefix, "$this$selectPrefix");
        C9971q.m14633g(options, "options");
        C7377u uVar2 = selectPrefix.f25530k;
        if (uVar2 != null) {
            byte[] bArr = uVar2.f15886a;
            int i5 = uVar2.f15887b;
            int i6 = uVar2.f15888c;
            int[] i7 = options.m22793i();
            C7377u uVar3 = uVar2;
            int i8 = -1;
            int i9 = 0;
            loop0: while (true) {
                int i10 = i9 + 1;
                int i11 = i7[i9];
                int i12 = i10 + 1;
                int i13 = i7[i10];
                if (i13 != -1) {
                    i8 = i13;
                }
                if (uVar3 == null) {
                    break;
                }
                if (i11 < 0) {
                    int i14 = i12 + (i11 * (-1));
                    while (true) {
                        int i15 = i5 + 1;
                        int i16 = i12 + 1;
                        if ((bArr[i5] & 255) != i7[i12]) {
                            return i8;
                        }
                        if (i16 == i14) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i15 == i6) {
                            C9971q.m14636d(uVar3);
                            C7377u uVar4 = uVar3.f15891f;
                            C9971q.m14636d(uVar4);
                            i4 = uVar4.f15887b;
                            byte[] bArr2 = uVar4.f15886a;
                            i3 = uVar4.f15888c;
                            if (uVar4 != uVar2) {
                                uVar = uVar4;
                                bArr = bArr2;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                uVar = null;
                            }
                        } else {
                            i3 = i6;
                            i4 = i15;
                            uVar = uVar3;
                        }
                        if (z2) {
                            i2 = i7[i16];
                            i = i4;
                            i6 = i3;
                            uVar3 = uVar;
                            break;
                        }
                        i5 = i4;
                        i6 = i3;
                        i12 = i16;
                        uVar3 = uVar;
                    }
                } else {
                    i = i5 + 1;
                    int i17 = bArr[i5] & 255;
                    int i18 = i12 + i11;
                    while (i12 != i18) {
                        if (i17 == i7[i12]) {
                            i2 = i7[i12 + i11];
                            if (i == i6) {
                                uVar3 = uVar3.f15891f;
                                C9971q.m14636d(uVar3);
                                i = uVar3.f15887b;
                                bArr = uVar3.f15886a;
                                i6 = uVar3.f15888c;
                                if (uVar3 == uVar2) {
                                    uVar3 = null;
                                }
                            }
                        } else {
                            i12++;
                        }
                    }
                    return i8;
                }
                if (i2 >= 0) {
                    return i2;
                }
                i9 = -i2;
                i5 = i;
            }
            if (z) {
                return -2;
            }
            return i8;
        } else if (z) {
            return -2;
        } else {
            return -1;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ int m21587e(Buffer buffer, C7369p pVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m21588d(buffer, pVar, z);
    }
}
