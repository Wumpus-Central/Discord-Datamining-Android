package androidx.camera.core.impl.utils;

import androidx.camera.core.impl.utils.C1858m;
import androidx.core.util.C2517g;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.utils.n */
/* loaded from: classes.dex */
public final class C1864n extends FilterOutputStream {

    /* renamed from: q */
    private static final byte[] f1836q = "Exif\u0000\u0000".getBytes(C1857l.f1802e);

    /* renamed from: k */
    private final C1858m f1837k;

    /* renamed from: l */
    private final byte[] f1838l = new byte[1];

    /* renamed from: m */
    private final ByteBuffer f1839m = ByteBuffer.allocate(4);

    /* renamed from: n */
    private int f1840n = 0;

    /* renamed from: o */
    private int f1841o;

    /* renamed from: p */
    private int f1842p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.impl.utils.n$a */
    /* loaded from: classes.dex */
    public static final class C1865a {
        /* renamed from: a */
        public static boolean m39618a(short s) {
            return (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) ? false : true;
        }
    }

    public C1864n(OutputStream outputStream, C1858m mVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f1837k = mVar;
    }

    /* renamed from: b */
    private int m39620b(int i, byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, i - this.f1839m.position());
        this.f1839m.put(bArr, i2, min);
        return min;
    }

    /* renamed from: g */
    private void m39619g(C1837a aVar) {
        C1866o[] oVarArr;
        short s;
        C1866o[][] oVarArr2 = C1858m.f1816i;
        int[] iArr = new int[oVarArr2.length];
        int[] iArr2 = new int[oVarArr2.length];
        for (C1866o oVar : C1858m.f1814g) {
            for (int i = 0; i < C1858m.f1816i.length; i++) {
                this.f1837k.m39639b(i).remove(oVar.f1844b);
            }
        }
        if (!this.f1837k.m39639b(1).isEmpty()) {
            this.f1837k.m39639b(0).put(C1858m.f1814g[1].f1844b, C1857l.m39645f(0L, this.f1837k.m39638c()));
        }
        if (!this.f1837k.m39639b(2).isEmpty()) {
            this.f1837k.m39639b(0).put(C1858m.f1814g[2].f1844b, C1857l.m39645f(0L, this.f1837k.m39638c()));
        }
        if (!this.f1837k.m39639b(3).isEmpty()) {
            this.f1837k.m39639b(1).put(C1858m.f1814g[3].f1844b, C1857l.m39645f(0L, this.f1837k.m39638c()));
        }
        for (int i2 = 0; i2 < C1858m.f1816i.length; i2++) {
            int i3 = 0;
            for (Map.Entry<String, C1857l> entry : this.f1837k.m39639b(i2).entrySet()) {
                int j = entry.getValue().m39641j();
                if (j > 4) {
                    i3 += j;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < C1858m.f1816i.length; i5++) {
            if (!this.f1837k.m39639b(i5).isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.f1837k.m39639b(i5).size() * 12) + 2 + 4 + iArr2[i5];
            }
        }
        int i6 = i4 + 8;
        if (!this.f1837k.m39639b(1).isEmpty()) {
            this.f1837k.m39639b(0).put(C1858m.f1814g[1].f1844b, C1857l.m39645f(iArr[1], this.f1837k.m39638c()));
        }
        if (!this.f1837k.m39639b(2).isEmpty()) {
            this.f1837k.m39639b(0).put(C1858m.f1814g[2].f1844b, C1857l.m39645f(iArr[2], this.f1837k.m39638c()));
        }
        if (!this.f1837k.m39639b(3).isEmpty()) {
            this.f1837k.m39639b(1).put(C1858m.f1814g[3].f1844b, C1857l.m39645f(iArr[3], this.f1837k.m39638c()));
        }
        aVar.m39693n(i6);
        aVar.write(f1836q);
        if (this.f1837k.m39638c() == ByteOrder.BIG_ENDIAN) {
            s = 19789;
        } else {
            s = 18761;
        }
        aVar.m39695i(s);
        aVar.m39698b(this.f1837k.m39638c());
        aVar.m39693n(42);
        aVar.m39694l(8L);
        for (int i7 = 0; i7 < C1858m.f1816i.length; i7++) {
            if (!this.f1837k.m39639b(i7).isEmpty()) {
                aVar.m39693n(this.f1837k.m39639b(i7).size());
                int size = iArr[i7] + 2 + (this.f1837k.m39639b(i7).size() * 12) + 4;
                for (Map.Entry<String, C1857l> entry2 : this.f1837k.m39639b(i7).entrySet()) {
                    int i8 = ((C1866o) C2517g.m37587h(C1858m.C1860b.f1825f.get(i7).get(entry2.getKey()), "Tag not supported: " + entry2.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).f1843a;
                    C1857l value = entry2.getValue();
                    int j2 = value.m39641j();
                    aVar.m39693n(i8);
                    aVar.m39693n(value.f1806a);
                    aVar.m39696h(value.f1807b);
                    if (j2 > 4) {
                        aVar.m39694l(size);
                        size += j2;
                    } else {
                        aVar.write(value.f1809d);
                        if (j2 < 4) {
                            while (j2 < 4) {
                                aVar.m39697g(0);
                                j2++;
                            }
                        }
                    }
                }
                aVar.m39694l(0L);
                for (Map.Entry<String, C1857l> entry3 : this.f1837k.m39639b(i7).entrySet()) {
                    byte[] bArr = entry3.getValue().f1809d;
                    if (bArr.length > 4) {
                        aVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        aVar.m39698b(ByteOrder.BIG_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0106, code lost:
        if (r9 <= 0) goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
        ((java.io.FilterOutputStream) r6).out.write(r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void write(byte[] r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.C1864n.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        byte[] bArr = this.f1838l;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
