package p374v;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.AbstractC1911r;
import androidx.core.util.C2517g;
import java.util.Map;
import p288q.C11872m0;

/* renamed from: v.h */
/* loaded from: classes.dex */
public final class C13382h {

    /* renamed from: a */
    private final C11872m0 f29962a;

    public C13382h(C11872m0 m0Var) {
        this.f29962a = m0Var;
    }

    /* renamed from: a */
    public static CameraCharacteristics m3787a(AbstractC1911r rVar) {
        C2517g.m37585j(rVar instanceof C11872m0, "CameraInfo does not contain any Camera2 information.");
        return ((C11872m0) rVar).m8416k().m7249d();
    }

    /* renamed from: b */
    public static C13382h m3786b(AbstractC1911r rVar) {
        C2517g.m37593b(rVar instanceof C11872m0, "CameraInfo doesn't contain Camera2 implementation.");
        return ((C11872m0) rVar).m8417j();
    }

    /* renamed from: c */
    public <T> T m3785c(CameraCharacteristics.Key<T> key) {
        return (T) this.f29962a.m8416k().m7252a(key);
    }

    /* renamed from: d */
    public Map<String, CameraCharacteristics> m3784d() {
        return this.f29962a.m8415l();
    }

    /* renamed from: e */
    public String m3783e() {
        return this.f29962a.mo3297b();
    }
}
