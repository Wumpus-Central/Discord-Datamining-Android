package com.facebook.soloader;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;

/* renamed from: com.facebook.soloader.m */
/* loaded from: classes7.dex */
public final class C5105m {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.soloader.m$a */
    /* loaded from: classes7.dex */
    public static class C5106a extends RuntimeException {
        C5106a(String str) {
            super(str);
        }
    }

    /* renamed from: com.facebook.soloader.m$b */
    /* loaded from: classes7.dex */
    public enum EnumC5107b {
        NOT_SO("not_so"),
        X86("x86"),
        ARM("armeabi-v7a"),
        X86_64("x86_64"),
        AARCH64("arm64-v8a"),
        OTHERS("others");
        

        /* renamed from: k */
        private final String f8787k;

        EnumC5107b(String str) {
            this.f8787k = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f8787k;
        }
    }

    /* renamed from: a */
    public static String[] m30730a(AbstractC5090f fVar) {
        if (fVar instanceof C5091g) {
            return m30728c((C5091g) fVar);
        }
        return m30729b(fVar);
    }

    /* renamed from: b */
    private static String[] m30729b(AbstractC5090f fVar) {
        long g;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        String str;
        long j8;
        long j9;
        String str2;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (m30724g(fVar, allocate, 0L) == 1179403647) {
            boolean z = true;
            if (m30723h(fVar, allocate, 4L) != 1) {
                z = false;
            }
            if (m30723h(fVar, allocate, 5L) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z) {
                j = m30724g(fVar, allocate, 28L);
            } else {
                j = m30727d(fVar, allocate, 32L);
            }
            if (z) {
                j2 = m30725f(fVar, allocate, 44L);
            } else {
                j2 = m30725f(fVar, allocate, 56L);
            }
            if (z) {
                j3 = 42;
            } else {
                j3 = 54;
            }
            int f = m30725f(fVar, allocate, j3);
            if (j2 == 65535) {
                if (z) {
                    j18 = m30724g(fVar, allocate, 32L);
                } else {
                    j18 = m30727d(fVar, allocate, 40L);
                }
                if (z) {
                    j19 = m30724g(fVar, allocate, j18 + 28);
                } else {
                    j19 = m30724g(fVar, allocate, j18 + 44);
                }
                j2 = j19;
            }
            long j20 = j;
            long j21 = 0;
            while (true) {
                if (j21 >= j2) {
                    j4 = 0;
                    break;
                }
                if (z) {
                    j17 = m30724g(fVar, allocate, j20 + 0);
                } else {
                    j17 = m30724g(fVar, allocate, j20 + 0);
                }
                if (j17 != 2) {
                    j20 += f;
                    j21++;
                } else if (z) {
                    j4 = m30724g(fVar, allocate, j20 + 4);
                } else {
                    j4 = m30727d(fVar, allocate, j20 + 8);
                }
            }
            long j22 = 0;
            if (j4 != 0) {
                long j23 = j4;
                long j24 = 0;
                int i = 0;
                while (true) {
                    if (z) {
                        j5 = m30724g(fVar, allocate, j23 + j22);
                    } else {
                        j5 = m30727d(fVar, allocate, j23 + j22);
                    }
                    String str3 = "malformed DT_NEEDED section";
                    if (j5 != 1) {
                        j6 = j5;
                        if (j5 == 5) {
                            if (z) {
                                j16 = m30724g(fVar, allocate, j23 + 4);
                            } else {
                                j16 = m30727d(fVar, allocate, j23 + 8);
                            }
                            j24 = j16;
                        }
                    } else if (i != Integer.MAX_VALUE) {
                        i++;
                        j6 = j5;
                    } else {
                        throw new C5106a(str3);
                    }
                    long j25 = 16;
                    if (z) {
                        j7 = 8;
                    } else {
                        j7 = 16;
                    }
                    j23 += j7;
                    j22 = 0;
                    if (j6 != 0) {
                        z = z;
                        j4 = j4;
                    } else if (j24 != 0) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= j2) {
                                str = str3;
                                j8 = 0;
                                break;
                            }
                            if (z) {
                                j12 = m30724g(fVar, allocate, j + j22);
                            } else {
                                j12 = m30724g(fVar, allocate, j + j22);
                            }
                            if (j12 == 1) {
                                if (z) {
                                    j13 = m30724g(fVar, allocate, j + 8);
                                } else {
                                    j13 = m30727d(fVar, allocate, j + j25);
                                }
                                if (z) {
                                    str = str3;
                                    j14 = m30724g(fVar, allocate, j + 20);
                                } else {
                                    str = str3;
                                    j14 = m30727d(fVar, allocate, j + 40);
                                }
                                if (j13 <= j24 && j24 < j14 + j13) {
                                    if (z) {
                                        j15 = m30724g(fVar, allocate, j + 4);
                                    } else {
                                        j15 = m30727d(fVar, allocate, j + 8);
                                    }
                                    j8 = j15 + (j24 - j13);
                                }
                            } else {
                                str = str3;
                            }
                            j += f;
                            i2++;
                            str3 = str;
                            j25 = 16;
                            j22 = 0;
                        }
                        long j26 = 0;
                        if (j8 != 0) {
                            String[] strArr = new String[i];
                            long j27 = j4;
                            int i3 = 0;
                            while (true) {
                                long j28 = j27 + j26;
                                if (z) {
                                    j9 = m30724g(fVar, allocate, j28);
                                } else {
                                    j9 = m30727d(fVar, allocate, j28);
                                }
                                if (j9 == 1) {
                                    if (z) {
                                        j11 = m30724g(fVar, allocate, j27 + 4);
                                    } else {
                                        j11 = m30727d(fVar, allocate, j27 + 8);
                                    }
                                    strArr[i3] = m30726e(fVar, allocate, j11 + j8);
                                    if (i3 != Integer.MAX_VALUE) {
                                        i3++;
                                        str2 = str;
                                    } else {
                                        throw new C5106a(str);
                                    }
                                } else {
                                    str2 = str;
                                }
                                if (z) {
                                    j10 = 8;
                                } else {
                                    j10 = 16;
                                }
                                j27 += j10;
                                if (j9 != 0) {
                                    str = str2;
                                    j26 = 0;
                                } else if (i3 == i) {
                                    return strArr;
                                } else {
                                    throw new C5106a(str2);
                                }
                            }
                        } else {
                            throw new C5106a("did not find file offset of DT_STRTAB table");
                        }
                    } else {
                        throw new C5106a("Dynamic section string-table not found");
                    }
                }
            } else {
                throw new C5106a("ELF file does not contain dynamic linking information");
            }
        } else {
            throw new C5106a("file is not ELF: 0x" + Long.toHexString(g));
        }
    }

    /* renamed from: c */
    private static String[] m30728c(C5091g gVar) {
        int i = 0;
        while (true) {
            try {
                return m30729b(gVar);
            } catch (ClosedByInterruptException e) {
                i++;
                if (i <= 4) {
                    Thread.interrupted();
                    Log.e("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e);
                    gVar.m30744b();
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: d */
    private static long m30727d(AbstractC5090f fVar, ByteBuffer byteBuffer, long j) {
        m30722i(fVar, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    /* renamed from: e */
    private static String m30726e(AbstractC5090f fVar, ByteBuffer byteBuffer, long j) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short h = m30723h(fVar, byteBuffer, j);
            if (h == 0) {
                return sb2.toString();
            }
            sb2.append((char) h);
            j = j2;
        }
    }

    /* renamed from: f */
    private static int m30725f(AbstractC5090f fVar, ByteBuffer byteBuffer, long j) {
        m30722i(fVar, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    /* renamed from: g */
    private static long m30724g(AbstractC5090f fVar, ByteBuffer byteBuffer, long j) {
        m30722i(fVar, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    /* renamed from: h */
    private static short m30723h(AbstractC5090f fVar, ByteBuffer byteBuffer, long j) {
        m30722i(fVar, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }

    /* renamed from: i */
    private static void m30722i(AbstractC5090f fVar, ByteBuffer byteBuffer, int i, long j) {
        int F;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (F = fVar.mo30743F(byteBuffer, j)) != -1) {
            j += F;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new C5106a("ELF file truncated");
    }
}
