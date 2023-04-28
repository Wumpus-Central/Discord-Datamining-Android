package p072e0;

import android.hardware.camera2.CaptureRequest;
import android.util.Pair;
import androidx.camera.extensions.impl.CaptureStageImpl;
import p272p.C11502b;
import p390w.AbstractC13651p0;
import p390w.C13639n0;

/* renamed from: e0.b */
/* loaded from: classes.dex */
public final class C6527b implements AbstractC13651p0 {

    /* renamed from: a */
    private final C13639n0 f13669a;

    /* renamed from: b */
    private final int f13670b;

    public C6527b(CaptureStageImpl captureStageImpl) {
        this.f13670b = captureStageImpl.getId();
        C11502b.C11503a aVar = new C11502b.C11503a();
        for (Pair pair : captureStageImpl.getParameters()) {
            aVar.m9553e((CaptureRequest.Key) pair.first, pair.second);
        }
        C13639n0.C13640a aVar2 = new C13639n0.C13640a();
        aVar2.m3140e(aVar.m9555b());
        this.f13669a = aVar2.m3137h();
    }

    @Override // p390w.AbstractC13651p0
    /* renamed from: a */
    public C13639n0 mo3114a() {
        return this.f13669a;
    }

    @Override // p390w.AbstractC13651p0
    public int getId() {
        return this.f13670b;
    }
}
