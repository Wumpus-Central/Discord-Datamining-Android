package p308r;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Collections;
import java.util.Set;
import p308r.C12267f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.e0 */
/* loaded from: classes.dex */
public class C12265e0 implements C12267f0.AbstractC12268a {

    /* renamed from: a */
    protected final CameraCharacteristics f27580a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12265e0(CameraCharacteristics cameraCharacteristics) {
        this.f27580a = cameraCharacteristics;
    }

    @Override // p308r.C12267f0.AbstractC12268a
    /* renamed from: a */
    public CameraCharacteristics mo7247a() {
        return this.f27580a;
    }

    @Override // p308r.C12267f0.AbstractC12268a
    /* renamed from: b */
    public <T> T mo7246b(CameraCharacteristics.Key<T> key) {
        return (T) this.f27580a.get(key);
    }

    @Override // p308r.C12267f0.AbstractC12268a
    /* renamed from: c */
    public Set<String> mo7245c() {
        return Collections.emptySet();
    }
}
