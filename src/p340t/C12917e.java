package p340t;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.core.C1915r1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p308r.C12267f0;
import p390w.AbstractC13595f2;

/* renamed from: t.e */
/* loaded from: classes.dex */
public class C12917e implements AbstractC13595f2 {

    /* renamed from: a */
    private final List<Size> f29000a;

    public C12917e(C12267f0 f0Var) {
        Size[] sizeArr;
        List<Size> list;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) f0Var.m7252a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            C1915r1.m39525c("CamcorderProfileResolutionQuirk", "StreamConfigurationMap is null");
        }
        if (streamConfigurationMap != null) {
            sizeArr = streamConfigurationMap.getOutputSizes(34);
        } else {
            sizeArr = null;
        }
        if (sizeArr != null) {
            list = Arrays.asList((Size[]) sizeArr.clone());
        } else {
            list = Collections.emptyList();
        }
        this.f29000a = list;
        C1915r1.m39527a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m5071b(C12267f0 f0Var) {
        Integer num = (Integer) f0Var.m7252a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public List<Size> m5072a() {
        return new ArrayList(this.f29000a);
    }
}
