package p340t;

import android.hardware.camera2.CameraCharacteristics;
import p308r.C12267f0;
import p390w.AbstractC13595f2;

/* renamed from: t.c */
/* loaded from: classes.dex */
public class C12915c implements AbstractC13595f2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m5073b(C12267f0 f0Var) {
        Integer num = (Integer) f0Var.m7252a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num == null) {
            return false;
        }
        num.intValue();
        return false;
    }

    /* renamed from: a */
    public int m5074a() {
        return 2;
    }
}
