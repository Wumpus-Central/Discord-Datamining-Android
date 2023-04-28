package p355u;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import p272p.C11502b;
import p340t.C12913a;
import p390w.C13600g2;

/* renamed from: u.a */
/* loaded from: classes.dex */
public class C13161a {

    /* renamed from: a */
    private final Range<Integer> f29517a;

    public C13161a(C13600g2 g2Var) {
        C12913a aVar = (C12913a) g2Var.m3260b(C12913a.class);
        if (aVar == null) {
            this.f29517a = null;
        } else {
            this.f29517a = aVar.m5078b();
        }
    }

    /* renamed from: a */
    public void m4437a(C11502b.C11503a aVar) {
        Range<Integer> range = this.f29517a;
        if (range != null) {
            aVar.m9553e(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
    }
}
