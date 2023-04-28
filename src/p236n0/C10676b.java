package p236n0;

import android.util.Range;
import android.util.Rational;
import androidx.camera.core.C1915r1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import p145i0.AbstractC8105a;
import p186k0.C9699f;

/* renamed from: n0.b */
/* loaded from: classes.dex */
public final class C10676b {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ int m12657b(int i, Integer num, Integer num2) {
        float signum;
        int abs = Math.abs(num.intValue() - i) - Math.abs(num2.intValue() - i);
        if (abs == 0) {
            signum = Math.signum(num.intValue() - num2.intValue());
        } else {
            signum = Math.signum(abs);
        }
        return (int) signum;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m12656c(AbstractC8105a aVar) {
        int e = aVar.mo20579e();
        if (e == -1) {
            C1915r1.m39527a("AudioConfigUtil", "Using default AUDIO source: 5");
            return 5;
        }
        C1915r1.m39527a("AudioConfigUtil", "Using provided AUDIO source: " + e);
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m12655d(AbstractC8105a aVar) {
        int f = aVar.mo20578f();
        if (f == -1) {
            C1915r1.m39527a("AudioConfigUtil", "Using default AUDIO source format: 2");
            return 2;
        }
        C1915r1.m39527a("AudioConfigUtil", "Using provided AUDIO source format: " + f);
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m12654e(int i, int i2, int i3, int i4, int i5, Range<Integer> range) {
        String str;
        int doubleValue = (int) (i * new Rational(i2, i3).doubleValue() * new Rational(i4, i5).doubleValue());
        if (C1915r1.m39522f("AudioConfigUtil")) {
            str = String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(doubleValue));
        } else {
            str = "";
        }
        if (!AbstractC8105a.f17532a.equals(range)) {
            doubleValue = range.clamp(Integer.valueOf(doubleValue)).intValue();
            if (C1915r1.m39522f("AudioConfigUtil")) {
                str = str + String.format("\nClamped to range %s -> %dbps", range, Integer.valueOf(doubleValue));
            }
        }
        C1915r1.m39527a("AudioConfigUtil", str);
        return doubleValue;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m12653f(Range<Integer> range, int i, int i2, final int i3) {
        ArrayList arrayList = null;
        int i4 = 0;
        int i5 = i3;
        while (true) {
            if (!range.contains((Range<Integer>) Integer.valueOf(i5))) {
                C1915r1.m39527a("AudioConfigUtil", "Sample rate " + i5 + "Hz is not in target range " + range);
            } else if (C9699f.m15576i(i5, i, i2)) {
                return i5;
            } else {
                C1915r1.m39527a("AudioConfigUtil", "Sample rate " + i5 + "Hz is not supported by audio source with channel count " + i + " and source format " + i2);
            }
            if (arrayList == null) {
                C1915r1.m39527a("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i3 + "Hz");
                arrayList = new ArrayList(C9699f.f21563n);
                Collections.sort(arrayList, new Comparator() { // from class: n0.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int b;
                        b = C10676b.m12657b(i3, (Integer) obj, (Integer) obj2);
                        return b;
                    }
                });
            }
            if (i4 < arrayList.size()) {
                i5 = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                C1915r1.m39527a("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
        }
    }
}
