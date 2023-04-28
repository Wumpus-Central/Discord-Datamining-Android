package p340t;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p308r.C12267f0;
import p390w.AbstractC13595f2;

/* renamed from: t.a */
/* loaded from: classes.dex */
public class C12913a implements AbstractC13595f2 {

    /* renamed from: a */
    private final Range<Integer> f28999a;

    public C12913a(C12267f0 f0Var) {
        this.f28999a = m5076d((Range[]) f0Var.m7252a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    /* renamed from: a */
    private Range<Integer> m5079a(Range<Integer> range) {
        int intValue = range.getUpper().intValue();
        int intValue2 = range.getLower().intValue();
        if (range.getUpper().intValue() >= 1000) {
            intValue = range.getUpper().intValue() / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
        }
        if (range.getLower().intValue() >= 1000) {
            intValue2 = range.getLower().intValue() / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
        }
        return new Range<>(Integer.valueOf(intValue2), Integer.valueOf(intValue));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m5077c(C12267f0 f0Var) {
        Integer num = (Integer) f0Var.m7252a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private Range<Integer> m5076d(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (!(rangeArr == null || rangeArr.length == 0)) {
            for (Range<Integer> range2 : rangeArr) {
                Range<Integer> a = m5079a(range2);
                if (a.getUpper().intValue() == 30 && (range == null || a.getLower().intValue() < range.getLower().intValue())) {
                    range = a;
                }
            }
        }
        return range;
    }

    /* renamed from: b */
    public Range<Integer> m5078b() {
        return this.f28999a;
    }
}
