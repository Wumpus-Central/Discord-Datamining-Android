package p349t8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7569x;
import p163j$.util.Spliterator;
import p317r8.C12453b;

/* renamed from: t8.b */
/* loaded from: classes7.dex */
final class C13003b {

    /* renamed from: h */
    private static final byte[] f29231h = {0, 7, 8, 15};

    /* renamed from: i */
    private static final byte[] f29232i = {0, 119, -120, -1};

    /* renamed from: j */
    private static final byte[] f29233j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    private final Paint f29234a;

    /* renamed from: b */
    private final Paint f29235b;

    /* renamed from: c */
    private final Canvas f29236c = new Canvas();

    /* renamed from: d */
    private final C0418b f29237d = new C0418b(719, 575, 0, 719, 0, 575);

    /* renamed from: e */
    private final C13004a f29238e = new C13004a(0, m4762c(), m4761d(), m4760e());

    /* renamed from: f */
    private final C13010h f29239f;

    /* renamed from: g */
    private Bitmap f29240g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t8.b$a */
    /* loaded from: classes7.dex */
    public static final class C13004a {

        /* renamed from: a */
        public final int f29241a;

        /* renamed from: b */
        public final int[] f29242b;

        /* renamed from: c */
        public final int[] f29243c;

        /* renamed from: d */
        public final int[] f29244d;

        public C13004a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f29241a = i;
            this.f29242b = iArr;
            this.f29243c = iArr2;
            this.f29244d = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t8.b$b */
    /* loaded from: classes7.dex */
    public static final class C0418b {

        /* renamed from: a */
        public final int f29245a;

        /* renamed from: b */
        public final int f29246b;

        /* renamed from: c */
        public final int f29247c;

        /* renamed from: d */
        public final int f29248d;

        /* renamed from: e */
        public final int f29249e;

        /* renamed from: f */
        public final int f29250f;

        public C0418b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f29245a = i;
            this.f29246b = i2;
            this.f29247c = i3;
            this.f29248d = i4;
            this.f29249e = i5;
            this.f29250f = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t8.b$c */
    /* loaded from: classes7.dex */
    public static final class C13005c {

        /* renamed from: a */
        public final int f29251a;

        /* renamed from: b */
        public final boolean f29252b;

        /* renamed from: c */
        public final byte[] f29253c;

        /* renamed from: d */
        public final byte[] f29254d;

        public C13005c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f29251a = i;
            this.f29252b = z;
            this.f29253c = bArr;
            this.f29254d = bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t8.b$d */
    /* loaded from: classes7.dex */
    public static final class C13006d {

        /* renamed from: a */
        public final int f29255a;

        /* renamed from: b */
        public final int f29256b;

        /* renamed from: c */
        public final int f29257c;

        /* renamed from: d */
        public final SparseArray<C13007e> f29258d;

        public C13006d(int i, int i2, int i3, SparseArray<C13007e> sparseArray) {
            this.f29255a = i;
            this.f29256b = i2;
            this.f29257c = i3;
            this.f29258d = sparseArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t8.b$e */
    /* loaded from: classes7.dex */
    public static final class C13007e {

        /* renamed from: a */
        public final int f29259a;

        /* renamed from: b */
        public final int f29260b;

        public C13007e(int i, int i2) {
            this.f29259a = i;
            this.f29260b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t8.b$f */
    /* loaded from: classes7.dex */
    public static final class C13008f {

        /* renamed from: a */
        public final int f29261a;

        /* renamed from: b */
        public final boolean f29262b;

        /* renamed from: c */
        public final int f29263c;

        /* renamed from: d */
        public final int f29264d;

        /* renamed from: e */
        public final int f29265e;

        /* renamed from: f */
        public final int f29266f;

        /* renamed from: g */
        public final int f29267g;

        /* renamed from: h */
        public final int f29268h;

        /* renamed from: i */
        public final int f29269i;

        /* renamed from: j */
        public final int f29270j;

        /* renamed from: k */
        public final SparseArray<C13009g> f29271k;

        public C13008f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C13009g> sparseArray) {
            this.f29261a = i;
            this.f29262b = z;
            this.f29263c = i2;
            this.f29264d = i3;
            this.f29265e = i4;
            this.f29266f = i5;
            this.f29267g = i6;
            this.f29268h = i7;
            this.f29269i = i8;
            this.f29270j = i9;
            this.f29271k = sparseArray;
        }

        /* renamed from: a */
        public void m4746a(C13008f fVar) {
            SparseArray<C13009g> sparseArray = fVar.f29271k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.f29271k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t8.b$g */
    /* loaded from: classes7.dex */
    public static final class C13009g {

        /* renamed from: a */
        public final int f29272a;

        /* renamed from: b */
        public final int f29273b;

        /* renamed from: c */
        public final int f29274c;

        /* renamed from: d */
        public final int f29275d;

        /* renamed from: e */
        public final int f29276e;

        /* renamed from: f */
        public final int f29277f;

        public C13009g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f29272a = i;
            this.f29273b = i2;
            this.f29274c = i3;
            this.f29275d = i4;
            this.f29276e = i5;
            this.f29277f = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t8.b$h */
    /* loaded from: classes7.dex */
    public static final class C13010h {

        /* renamed from: a */
        public final int f29278a;

        /* renamed from: b */
        public final int f29279b;

        /* renamed from: c */
        public final SparseArray<C13008f> f29280c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<C13004a> f29281d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C13005c> f29282e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<C13004a> f29283f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<C13005c> f29284g = new SparseArray<>();

        /* renamed from: h */
        public C0418b f29285h;

        /* renamed from: i */
        public C13006d f29286i;

        public C13010h(int i, int i2) {
            this.f29278a = i;
            this.f29279b = i2;
        }

        /* renamed from: a */
        public void m4745a() {
            this.f29280c.clear();
            this.f29281d.clear();
            this.f29282e.clear();
            this.f29283f.clear();
            this.f29284g.clear();
            this.f29285h = null;
            this.f29286i = null;
        }
    }

    public C13003b(int i, int i2) {
        Paint paint = new Paint();
        this.f29234a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f29235b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f29239f = new C13010h(i, i2);
    }

    /* renamed from: a */
    private static byte[] m4764a(int i, int i2, C7569x xVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) xVar.m22044h(i2);
        }
        return bArr;
    }

    /* renamed from: c */
    private static int[] m4762c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* renamed from: d */
    private static int[] m4761d() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i6 = 1; i6 < 16; i6++) {
            if (i6 < 8) {
                if ((i6 & 1) != 0) {
                    i3 = 255;
                } else {
                    i3 = 0;
                }
                if ((i6 & 2) != 0) {
                    i4 = 255;
                } else {
                    i4 = 0;
                }
                if ((i6 & 4) != 0) {
                    i5 = 255;
                } else {
                    i5 = 0;
                }
                iArr[i6] = m4759f(255, i3, i4, i5);
            } else {
                int i7 = 127;
                if ((i6 & 1) != 0) {
                    i = 127;
                } else {
                    i = 0;
                }
                if ((i6 & 2) != 0) {
                    i2 = 127;
                } else {
                    i2 = 0;
                }
                if ((i6 & 4) == 0) {
                    i7 = 0;
                }
                iArr[i6] = m4759f(255, i, i2, i7);
            }
        }
        return iArr;
    }

    /* renamed from: e */
    private static int[] m4760e() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = new int[Spliterator.NONNULL];
        iArr[0] = 0;
        for (int i19 = 0; i19 < 256; i19++) {
            int i20 = 255;
            if (i19 < 8) {
                if ((i19 & 1) != 0) {
                    i17 = 255;
                } else {
                    i17 = 0;
                }
                if ((i19 & 2) != 0) {
                    i18 = 255;
                } else {
                    i18 = 0;
                }
                if ((i19 & 4) == 0) {
                    i20 = 0;
                }
                iArr[i19] = m4759f(63, i17, i18, i20);
            } else {
                int i21 = i19 & 136;
                int i22 = 170;
                int i23 = 85;
                if (i21 == 0) {
                    if ((i19 & 1) != 0) {
                        i = 85;
                    } else {
                        i = 0;
                    }
                    if ((i19 & 16) != 0) {
                        i2 = 170;
                    } else {
                        i2 = 0;
                    }
                    int i24 = i + i2;
                    if ((i19 & 2) != 0) {
                        i3 = 85;
                    } else {
                        i3 = 0;
                    }
                    if ((i19 & 32) != 0) {
                        i4 = 170;
                    } else {
                        i4 = 0;
                    }
                    int i25 = i3 + i4;
                    if ((i19 & 4) == 0) {
                        i23 = 0;
                    }
                    if ((i19 & 64) == 0) {
                        i22 = 0;
                    }
                    iArr[i19] = m4759f(255, i24, i25, i23 + i22);
                } else if (i21 != 8) {
                    int i26 = 43;
                    if (i21 == 128) {
                        if ((i19 & 1) != 0) {
                            i9 = 43;
                        } else {
                            i9 = 0;
                        }
                        int i27 = i9 + 127;
                        if ((i19 & 16) != 0) {
                            i10 = 85;
                        } else {
                            i10 = 0;
                        }
                        int i28 = i27 + i10;
                        if ((i19 & 2) != 0) {
                            i11 = 43;
                        } else {
                            i11 = 0;
                        }
                        int i29 = i11 + 127;
                        if ((i19 & 32) != 0) {
                            i12 = 85;
                        } else {
                            i12 = 0;
                        }
                        int i30 = i29 + i12;
                        if ((i19 & 4) == 0) {
                            i26 = 0;
                        }
                        int i31 = i26 + 127;
                        if ((i19 & 64) == 0) {
                            i23 = 0;
                        }
                        iArr[i19] = m4759f(255, i28, i30, i31 + i23);
                    } else if (i21 == 136) {
                        if ((i19 & 1) != 0) {
                            i13 = 43;
                        } else {
                            i13 = 0;
                        }
                        if ((i19 & 16) != 0) {
                            i14 = 85;
                        } else {
                            i14 = 0;
                        }
                        int i32 = i13 + i14;
                        if ((i19 & 2) != 0) {
                            i15 = 43;
                        } else {
                            i15 = 0;
                        }
                        if ((i19 & 32) != 0) {
                            i16 = 85;
                        } else {
                            i16 = 0;
                        }
                        int i33 = i15 + i16;
                        if ((i19 & 4) == 0) {
                            i26 = 0;
                        }
                        if ((i19 & 64) == 0) {
                            i23 = 0;
                        }
                        iArr[i19] = m4759f(255, i32, i33, i26 + i23);
                    }
                } else {
                    if ((i19 & 1) != 0) {
                        i5 = 85;
                    } else {
                        i5 = 0;
                    }
                    if ((i19 & 16) != 0) {
                        i6 = 170;
                    } else {
                        i6 = 0;
                    }
                    int i34 = i5 + i6;
                    if ((i19 & 2) != 0) {
                        i7 = 85;
                    } else {
                        i7 = 0;
                    }
                    if ((i19 & 32) != 0) {
                        i8 = 170;
                    } else {
                        i8 = 0;
                    }
                    int i35 = i7 + i8;
                    if ((i19 & 4) == 0) {
                        i23 = 0;
                    }
                    if ((i19 & 64) == 0) {
                        i22 = 0;
                    }
                    iArr[i19] = m4759f(127, i34, i35, i23 + i22);
                }
            }
        }
        return iArr;
    }

    /* renamed from: f */
    private static int m4759f(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* renamed from: g */
    private static int m4758g(C7569x xVar, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3;
        boolean z;
        byte b;
        boolean z2;
        boolean z3;
        int h;
        int h2;
        int i4 = i;
        boolean z4 = false;
        while (true) {
            int h3 = xVar.m22044h(2);
            if (h3 != 0) {
                z = z4;
                i3 = 1;
                b = h3;
            } else {
                if (xVar.m22045g()) {
                    h = xVar.m22044h(3) + 3;
                    h2 = xVar.m22044h(2);
                } else {
                    if (xVar.m22045g()) {
                        z3 = z4;
                        i3 = 1;
                    } else {
                        int h4 = xVar.m22044h(2);
                        if (h4 == 0) {
                            z2 = true;
                        } else if (h4 == 1) {
                            z3 = z4;
                            i3 = 2;
                        } else if (h4 == 2) {
                            h = xVar.m22044h(4) + 12;
                            h2 = xVar.m22044h(2);
                        } else if (h4 != 3) {
                            z2 = z4;
                        } else {
                            h = xVar.m22044h(8) + 29;
                            h2 = xVar.m22044h(2);
                        }
                        b = 0;
                        i3 = 0;
                        z = z2;
                    }
                    b = 0;
                    z = z3;
                }
                z = z4;
                i3 = h;
                b = h2;
            }
            if (!(i3 == 0 || paint == null)) {
                if (bArr != 0) {
                    b = bArr[b];
                }
                paint.setColor(iArr[b == true ? 1 : 0]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (z) {
                return i4;
            }
            z4 = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* renamed from: h */
    private static int m4757h(C7569x xVar, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3;
        boolean z;
        byte b;
        boolean z2;
        boolean z3;
        int h;
        int h2;
        int i4 = i;
        boolean z4 = false;
        while (true) {
            int h3 = xVar.m22044h(4);
            if (h3 != 0) {
                z = z4;
                i3 = 1;
                b = h3;
            } else if (!xVar.m22045g()) {
                int h4 = xVar.m22044h(3);
                if (h4 != 0) {
                    z3 = z4;
                    i3 = h4 + 2;
                    b = 0;
                    z = z3;
                } else {
                    z2 = true;
                    b = 0;
                    i3 = 0;
                    z = z2;
                }
            } else {
                if (!xVar.m22045g()) {
                    h = xVar.m22044h(2) + 4;
                    h2 = xVar.m22044h(4);
                } else {
                    int h5 = xVar.m22044h(2);
                    if (h5 == 0) {
                        z3 = z4;
                        i3 = 1;
                    } else if (h5 == 1) {
                        z3 = z4;
                        i3 = 2;
                    } else if (h5 == 2) {
                        h = xVar.m22044h(4) + 9;
                        h2 = xVar.m22044h(4);
                    } else if (h5 != 3) {
                        z2 = z4;
                        b = 0;
                        i3 = 0;
                        z = z2;
                    } else {
                        h = xVar.m22044h(8) + 25;
                        h2 = xVar.m22044h(4);
                    }
                    b = 0;
                    z = z3;
                }
                z = z4;
                i3 = h;
                b = h2;
            }
            if (!(i3 == 0 || paint == null)) {
                if (bArr != 0) {
                    b = bArr[b];
                }
                paint.setColor(iArr[b == true ? 1 : 0]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (z) {
                return i4;
            }
            z4 = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* renamed from: i */
    private static int m4756i(C7569x xVar, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3;
        boolean z;
        byte b;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            int h = xVar.m22044h(8);
            if (h != 0) {
                z = z2;
                i3 = 1;
                b = h;
            } else if (!xVar.m22045g()) {
                int h2 = xVar.m22044h(7);
                if (h2 != 0) {
                    z = z2;
                    i3 = h2;
                    b = 0;
                } else {
                    z = true;
                    b = 0;
                    i3 = 0;
                }
            } else {
                z = z2;
                i3 = xVar.m22044h(7);
                b = xVar.m22044h(8);
            }
            if (!(i3 == 0 || paint == null)) {
                if (bArr != 0) {
                    b = bArr[b];
                }
                paint.setColor(iArr[b == true ? 1 : 0]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    /* renamed from: j */
    private static void m4755j(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        C7569x xVar = new C7569x(bArr);
        int i4 = i2;
        int i5 = i3;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        while (xVar.m22050b() != 0) {
            int h = xVar.m22044h(8);
            if (h != 240) {
                switch (h) {
                    case 16:
                        if (i == 3) {
                            if (bArr6 == null) {
                                bArr3 = f29232i;
                            } else {
                                bArr3 = bArr6;
                            }
                        } else if (i != 2) {
                            bArr2 = null;
                            i4 = m4758g(xVar, iArr, bArr2, i4, i5, paint, canvas);
                            xVar.m22049c();
                            continue;
                        } else if (bArr8 == null) {
                            bArr3 = f29231h;
                        } else {
                            bArr3 = bArr8;
                        }
                        bArr2 = bArr3;
                        i4 = m4758g(xVar, iArr, bArr2, i4, i5, paint, canvas);
                        xVar.m22049c();
                        continue;
                    case 17:
                        if (i == 3) {
                            if (bArr7 == null) {
                                bArr5 = f29233j;
                            } else {
                                bArr5 = bArr7;
                            }
                            bArr4 = bArr5;
                        } else {
                            bArr4 = null;
                        }
                        i4 = m4757h(xVar, iArr, bArr4, i4, i5, paint, canvas);
                        xVar.m22049c();
                        continue;
                    case 18:
                        i4 = m4756i(xVar, iArr, null, i4, i5, paint, canvas);
                        continue;
                    default:
                        switch (h) {
                            case 32:
                                bArr8 = m4764a(4, 4, xVar);
                                continue;
                            case 33:
                                bArr6 = m4764a(4, 8, xVar);
                                continue;
                            case 34:
                                bArr7 = m4764a(16, 8, xVar);
                                continue;
                            default:
                                continue;
                        }
                }
            } else {
                i5 += 2;
                i4 = i2;
            }
        }
    }

    /* renamed from: k */
    private static void m4754k(C13005c cVar, C13004a aVar, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = aVar.f29244d;
        } else if (i == 2) {
            iArr = aVar.f29243c;
        } else {
            iArr = aVar.f29242b;
        }
        m4755j(cVar.f29253c, iArr, i, i2, i3, paint, canvas);
        m4755j(cVar.f29254d, iArr, i, i2, i3 + 1, paint, canvas);
    }

    /* renamed from: l */
    private static C13004a m4753l(C7569x xVar, int i) {
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 8;
        int h = xVar.m22044h(8);
        xVar.m22034r(8);
        int i8 = 2;
        int i9 = i - 2;
        int[] c = m4762c();
        int[] d = m4761d();
        int[] e = m4760e();
        while (i9 > 0) {
            int h2 = xVar.m22044h(i7);
            int h3 = xVar.m22044h(i7);
            int i10 = i9 - 2;
            if ((h3 & 128) != 0) {
                iArr = c;
            } else if ((h3 & 64) != 0) {
                iArr = d;
            } else {
                iArr = e;
            }
            if ((h3 & 1) != 0) {
                i5 = xVar.m22044h(i7);
                i4 = xVar.m22044h(i7);
                i3 = xVar.m22044h(i7);
                i2 = xVar.m22044h(i7);
                i6 = i10 - 4;
            } else {
                int h4 = xVar.m22044h(4) << 4;
                i3 = xVar.m22044h(4) << 4;
                i6 = i10 - 2;
                i2 = xVar.m22044h(i8) << 6;
                i5 = xVar.m22044h(6) << i8;
                i4 = h4;
            }
            if (i5 == 0) {
                i2 = 255;
                i4 = 0;
                i3 = 0;
            }
            double d2 = i5;
            double d3 = i4 - 128;
            double d4 = i3 - 128;
            iArr[h2] = m4759f((byte) (255 - (i2 & 255)), C7557q0.m22129r((int) (d2 + (1.402d * d3)), 0, 255), C7557q0.m22129r((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), C7557q0.m22129r((int) (d2 + (d4 * 1.772d)), 0, 255));
            i9 = i6;
            h = h;
            i7 = 8;
            i8 = 2;
        }
        return new C13004a(h, c, d, e);
    }

    /* renamed from: m */
    private static C0418b m4752m(C7569x xVar) {
        int i;
        int i2;
        int i3;
        int i4;
        xVar.m22034r(4);
        boolean g = xVar.m22045g();
        xVar.m22034r(3);
        int h = xVar.m22044h(16);
        int h2 = xVar.m22044h(16);
        if (g) {
            int h3 = xVar.m22044h(16);
            int h4 = xVar.m22044h(16);
            int h5 = xVar.m22044h(16);
            i = xVar.m22044h(16);
            i3 = h4;
            i2 = h5;
            i4 = h3;
        } else {
            i4 = 0;
            i2 = 0;
            i3 = h;
            i = h2;
        }
        return new C0418b(h, h2, i4, i3, i2, i);
    }

    /* renamed from: n */
    private static C13005c m4751n(C7569x xVar) {
        byte[] bArr;
        int h = xVar.m22044h(16);
        xVar.m22034r(4);
        int h2 = xVar.m22044h(2);
        boolean g = xVar.m22045g();
        xVar.m22034r(1);
        byte[] bArr2 = C7557q0.f16373f;
        if (h2 == 1) {
            xVar.m22034r(xVar.m22044h(8) * 16);
        } else if (h2 == 0) {
            int h3 = xVar.m22044h(16);
            int h4 = xVar.m22044h(16);
            if (h3 > 0) {
                bArr2 = new byte[h3];
                xVar.m22041k(bArr2, 0, h3);
            }
            if (h4 > 0) {
                bArr = new byte[h4];
                xVar.m22041k(bArr, 0, h4);
                return new C13005c(h, g, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C13005c(h, g, bArr2, bArr);
    }

    /* renamed from: o */
    private static C13006d m4750o(C7569x xVar, int i) {
        int h = xVar.m22044h(8);
        int h2 = xVar.m22044h(4);
        int h3 = xVar.m22044h(2);
        xVar.m22034r(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int h4 = xVar.m22044h(8);
            xVar.m22034r(8);
            i2 -= 6;
            sparseArray.put(h4, new C13007e(xVar.m22044h(16), xVar.m22044h(16)));
        }
        return new C13006d(h, h2, h3, sparseArray);
    }

    /* renamed from: p */
    private static C13008f m4749p(C7569x xVar, int i) {
        int i2;
        int i3;
        int h = xVar.m22044h(8);
        xVar.m22034r(4);
        boolean g = xVar.m22045g();
        xVar.m22034r(3);
        int i4 = 16;
        int h2 = xVar.m22044h(16);
        int h3 = xVar.m22044h(16);
        int h4 = xVar.m22044h(3);
        int h5 = xVar.m22044h(3);
        int i5 = 2;
        xVar.m22034r(2);
        int h6 = xVar.m22044h(8);
        int h7 = xVar.m22044h(8);
        int h8 = xVar.m22044h(4);
        int h9 = xVar.m22044h(2);
        xVar.m22034r(2);
        int i6 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i6 > 0) {
            int h10 = xVar.m22044h(i4);
            int h11 = xVar.m22044h(i5);
            int h12 = xVar.m22044h(i5);
            int h13 = xVar.m22044h(12);
            xVar.m22034r(4);
            int h14 = xVar.m22044h(12);
            i6 -= 6;
            if (h11 == 1 || h11 == 2) {
                i6 -= 2;
                i3 = xVar.m22044h(8);
                i2 = xVar.m22044h(8);
            } else {
                i3 = 0;
                i2 = 0;
            }
            sparseArray.put(h10, new C13009g(h11, h12, h13, h14, i3, i2));
            h9 = h9;
            i5 = 2;
            i4 = 16;
        }
        return new C13008f(h, g, h2, h3, h4, h5, h6, h7, h8, h9, sparseArray);
    }

    /* renamed from: q */
    private static void m4748q(C7569x xVar, C13010h hVar) {
        C13008f fVar;
        int h = xVar.m22044h(8);
        int h2 = xVar.m22044h(16);
        int h3 = xVar.m22044h(16);
        int d = xVar.m22048d() + h3;
        if (h3 * 8 > xVar.m22050b()) {
            C7558r.m22104h("DvbParser", "Data field length exceeds limit");
            xVar.m22034r(xVar.m22050b());
            return;
        }
        switch (h) {
            case 16:
                if (h2 == hVar.f29278a) {
                    C13006d dVar = hVar.f29286i;
                    C13006d o = m4750o(xVar, h3);
                    if (o.f29257c == 0) {
                        if (!(dVar == null || dVar.f29256b == o.f29256b)) {
                            hVar.f29286i = o;
                            break;
                        }
                    } else {
                        hVar.f29286i = o;
                        hVar.f29280c.clear();
                        hVar.f29281d.clear();
                        hVar.f29282e.clear();
                        break;
                    }
                }
                break;
            case 17:
                C13006d dVar2 = hVar.f29286i;
                if (h2 == hVar.f29278a && dVar2 != null) {
                    C13008f p = m4749p(xVar, h3);
                    if (dVar2.f29257c == 0 && (fVar = hVar.f29280c.get(p.f29261a)) != null) {
                        p.m4746a(fVar);
                    }
                    hVar.f29280c.put(p.f29261a, p);
                    break;
                }
                break;
            case 18:
                if (h2 != hVar.f29278a) {
                    if (h2 == hVar.f29279b) {
                        C13004a l = m4753l(xVar, h3);
                        hVar.f29283f.put(l.f29241a, l);
                        break;
                    }
                } else {
                    C13004a l2 = m4753l(xVar, h3);
                    hVar.f29281d.put(l2.f29241a, l2);
                    break;
                }
                break;
            case 19:
                if (h2 != hVar.f29278a) {
                    if (h2 == hVar.f29279b) {
                        C13005c n = m4751n(xVar);
                        hVar.f29284g.put(n.f29251a, n);
                        break;
                    }
                } else {
                    C13005c n2 = m4751n(xVar);
                    hVar.f29282e.put(n2.f29251a, n2);
                    break;
                }
                break;
            case 20:
                if (h2 == hVar.f29278a) {
                    hVar.f29285h = m4752m(xVar);
                    break;
                }
                break;
        }
        xVar.m22033s(d - xVar.m22048d());
    }

    /* renamed from: b */
    public List<C12453b> m4763b(byte[] bArr, int i) {
        int i2;
        C13005c cVar;
        int i3;
        SparseArray<C13009g> sparseArray;
        Paint paint;
        C7569x xVar = new C7569x(bArr, i);
        while (xVar.m22050b() >= 48 && xVar.m22044h(8) == 15) {
            m4748q(xVar, this.f29239f);
        }
        C13010h hVar = this.f29239f;
        C13006d dVar = hVar.f29286i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0418b bVar = hVar.f29285h;
        if (bVar == null) {
            bVar = this.f29237d;
        }
        Bitmap bitmap = this.f29240g;
        if (!(bitmap != null && bVar.f29245a + 1 == bitmap.getWidth() && bVar.f29246b + 1 == this.f29240g.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f29245a + 1, bVar.f29246b + 1, Bitmap.Config.ARGB_8888);
            this.f29240g = createBitmap;
            this.f29236c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C13007e> sparseArray2 = dVar.f29258d;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            this.f29236c.save();
            C13007e valueAt = sparseArray2.valueAt(i4);
            C13008f fVar = this.f29239f.f29280c.get(sparseArray2.keyAt(i4));
            int i5 = valueAt.f29259a + bVar.f29247c;
            int i6 = valueAt.f29260b + bVar.f29249e;
            this.f29236c.clipRect(i5, i6, Math.min(fVar.f29263c + i5, bVar.f29248d), Math.min(fVar.f29264d + i6, bVar.f29250f));
            C13004a aVar = this.f29239f.f29281d.get(fVar.f29267g);
            if (aVar == null && (aVar = this.f29239f.f29283f.get(fVar.f29267g)) == null) {
                aVar = this.f29238e;
            }
            SparseArray<C13009g> sparseArray3 = fVar.f29271k;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i7);
                C13009g valueAt2 = sparseArray3.valueAt(i7);
                C13005c cVar2 = this.f29239f.f29282e.get(keyAt);
                if (cVar2 == null) {
                    cVar = this.f29239f.f29284g.get(keyAt);
                } else {
                    cVar = cVar2;
                }
                if (cVar != null) {
                    if (cVar.f29252b) {
                        paint = null;
                    } else {
                        paint = this.f29234a;
                    }
                    i3 = i7;
                    sparseArray = sparseArray3;
                    m4754k(cVar, aVar, fVar.f29266f, valueAt2.f29274c + i5, i6 + valueAt2.f29275d, paint, this.f29236c);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f29262b) {
                int i8 = fVar.f29266f;
                if (i8 == 3) {
                    i2 = aVar.f29244d[fVar.f29268h];
                } else if (i8 == 2) {
                    i2 = aVar.f29243c[fVar.f29269i];
                } else {
                    i2 = aVar.f29242b[fVar.f29270j];
                }
                this.f29235b.setColor(i2);
                this.f29236c.drawRect(i5, i6, fVar.f29263c + i5, fVar.f29264d + i6, this.f29235b);
            }
            arrayList.add(new C12453b.C0400b().m6690f(Bitmap.createBitmap(this.f29240g, i5, i6, fVar.f29263c, fVar.f29264d)).m6686j(i5 / bVar.f29245a).m6685k(0).m6688h(i6 / bVar.f29246b, 0).m6687i(0).m6683m(fVar.f29263c / bVar.f29245a).m6689g(fVar.f29264d / bVar.f29246b).m6695a());
            this.f29236c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f29236c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: r */
    public void m4747r() {
        this.f29239f.m4745a();
    }
}
