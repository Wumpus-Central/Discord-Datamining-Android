package androidx.camera.lifecycle;

import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.lifecycle.LifecycleOwner;
import p451z.C14499e;

/* renamed from: androidx.camera.lifecycle.a */
/* loaded from: classes.dex */
final class C1974a extends LifecycleCameraRepository.AbstractC1973a {

    /* renamed from: a */
    private final LifecycleOwner f2110a;

    /* renamed from: b */
    private final C14499e.C14501b f2111b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1974a(LifecycleOwner lifecycleOwner, C14499e.C14501b bVar) {
        if (lifecycleOwner != null) {
            this.f2110a = lifecycleOwner;
            if (bVar != null) {
                this.f2111b = bVar;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.AbstractC1973a
    /* renamed from: b */
    public C14499e.C14501b mo39354b() {
        return this.f2111b;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.AbstractC1973a
    /* renamed from: c */
    public LifecycleOwner mo39353c() {
        return this.f2110a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleCameraRepository.AbstractC1973a)) {
            return false;
        }
        LifecycleCameraRepository.AbstractC1973a aVar = (LifecycleCameraRepository.AbstractC1973a) obj;
        if (!this.f2110a.equals(aVar.mo39353c()) || !this.f2111b.equals(aVar.mo39354b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f2110a.hashCode() ^ 1000003) * 1000003) ^ this.f2111b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f2110a + ", cameraId=" + this.f2111b + "}";
    }
}
