package p311r2;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p254o2.C11171d;
import p331s2.AbstractC12777c;
import p343t2.C12948i;

/* renamed from: r2.o */
/* loaded from: classes.dex */
public class C12350o implements AbstractC12349n0<C11171d> {

    /* renamed from: a */
    private int f27733a;

    public C12350o(int i) {
        this.f27733a = i;
    }

    /* renamed from: b */
    private C11171d m7103b(C11171d dVar, List<Float> list) {
        int i = this.f27733a * 4;
        if (list.size() <= i) {
            return dVar;
        }
        float[] b = dVar.m10613b();
        int[] a = dVar.m10614a();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i2] = list.get(i).floatValue();
            } else {
                fArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        int i3 = this.f27733a + size;
        float[] fArr3 = new float[i3];
        int[] iArr = new int[i3];
        System.arraycopy(dVar.m10613b(), 0, fArr3, 0, this.f27733a);
        System.arraycopy(fArr, 0, fArr3, this.f27733a, size);
        Arrays.sort(fArr3);
        for (int i4 = 0; i4 < i3; i4++) {
            float f = fArr3[i4];
            int binarySearch = Arrays.binarySearch(b, f);
            int binarySearch2 = Arrays.binarySearch(fArr, f);
            if (binarySearch < 0 || binarySearch2 > 0) {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i4] = m7102c(f, fArr2[binarySearch2], b, a);
            } else {
                iArr[i4] = m7101d(f, a[binarySearch], fArr, fArr2);
            }
        }
        return new C11171d(fArr3, iArr);
    }

    /* renamed from: c */
    private int m7102c(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f == fArr[0]) {
            return iArr[0];
        }
        for (int i = 1; i < fArr.length; i++) {
            float f3 = fArr[i];
            if (f3 >= f || i == fArr.length - 1) {
                int i2 = i - 1;
                float f4 = fArr[i2];
                float f5 = (f - f4) / (f3 - f4);
                int i3 = iArr[i];
                int i4 = iArr[i2];
                return Color.argb((int) (f2 * 255.0f), C12948i.m4973j(Color.red(i4), Color.red(i3), f5), C12948i.m4973j(Color.green(i4), Color.green(i3), f5), C12948i.m4973j(Color.blue(i4), Color.blue(i3), f5));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    /* renamed from: d */
    private int m7101d(float f, int i, float[] fArr, float[] fArr2) {
        float f2;
        if (fArr2.length < 2 || f <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            float f3 = fArr[i2];
            int i3 = (f3 > f ? 1 : (f3 == f ? 0 : -1));
            if (i3 >= 0 || i2 == fArr.length - 1) {
                if (i3 <= 0) {
                    f2 = fArr2[i2];
                } else {
                    int i4 = i2 - 1;
                    float f4 = fArr[i4];
                    f2 = C12948i.m4974i(fArr2[i4], fArr2[i2], (f - f4) / (f3 - f4));
                }
                return Color.argb((int) (f2 * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    /* renamed from: e */
    public C11171d mo7097a(AbstractC12777c cVar, float f) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (cVar.mo5497Q() == AbstractC12777c.EnumC12779b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cVar.mo5493g();
        }
        while (cVar.mo5488p()) {
            arrayList.add(Float.valueOf((float) cVar.mo5486s()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.f27733a = 2;
        }
        if (z) {
            cVar.mo5491i();
        }
        if (this.f27733a == -1) {
            this.f27733a = arrayList.size() / 4;
        }
        int i = this.f27733a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f27733a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        return m7103b(new C11171d(fArr, iArr), arrayList);
    }
}
