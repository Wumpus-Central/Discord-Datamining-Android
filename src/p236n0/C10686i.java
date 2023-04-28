package p236n0;

import android.util.Range;
import android.util.Rational;
import androidx.camera.core.C1915r1;
import p145i0.AbstractC8151j1;

/* renamed from: n0.i */
/* loaded from: classes.dex */
public final class C10686i {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m12640a(AbstractC8151j1 j1Var) {
        Range<Integer> d = j1Var.mo20507d();
        if (AbstractC8151j1.f17622a.equals(d) || d.contains((Range<Integer>) 30)) {
            C1915r1.m39527a("VideoConfigUtil", "Using single supported VIDEO frame rate: 30");
        } else {
            C1915r1.m39517k("VideoConfigUtil", "Requested frame rate range does not include single supported frame rate. Ignoring range. [range: " + d + " supported frame rate: 30]");
        }
        return 30;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m12639b(int i, int i2, int i3, int i4, int i5, int i6, int i7, Range<Integer> range) {
        String str;
        int doubleValue = (int) (i * new Rational(i2, i3).doubleValue() * new Rational(i4, i5).doubleValue() * new Rational(i6, i7).doubleValue());
        if (C1915r1.m39522f("VideoConfigUtil")) {
            str = String.format("Base Bitrate(%dbps) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(doubleValue));
        } else {
            str = "";
        }
        if (!AbstractC8151j1.f17623b.equals(range)) {
            doubleValue = range.clamp(Integer.valueOf(doubleValue)).intValue();
            if (C1915r1.m39522f("VideoConfigUtil")) {
                str = str + String.format("\nClamped to range %s -> %dbps", range, Integer.valueOf(doubleValue));
            }
        }
        C1915r1.m39527a("VideoConfigUtil", str);
        return doubleValue;
    }
}
