package p328s;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.C2517g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s.h */
/* loaded from: classes.dex */
public class C12744h extends C12741f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12744h(Surface surface) {
        super(new OutputConfiguration(surface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C12744h m5577f(OutputConfiguration outputConfiguration) {
        return new C12744h(outputConfiguration);
    }

    @Override // p328s.C12741f, p328s.C12739e, p328s.C12745i, p328s.C12735b.AbstractC12736a
    /* renamed from: a */
    public void mo5576a(String str) {
        ((OutputConfiguration) mo5574c()).setPhysicalCameraId(str);
    }

    @Override // p328s.C12741f, p328s.C12739e, p328s.C12745i, p328s.C12735b.AbstractC12736a
    /* renamed from: b */
    public String mo5575b() {
        return null;
    }

    @Override // p328s.C12741f, p328s.C12739e, p328s.C12745i, p328s.C12735b.AbstractC12736a
    /* renamed from: c */
    public Object mo5574c() {
        C2517g.m37594a(this.f28602a instanceof OutputConfiguration);
        return this.f28602a;
    }

    C12744h(Object obj) {
        super(obj);
    }
}
