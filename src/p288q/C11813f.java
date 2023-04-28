package p288q;

import android.media.CamcorderProfile;
import androidx.camera.core.C1915r1;
import p308r.C12267f0;
import p340t.C12917e;
import p340t.C12919g;
import p355u.C13163c;
import p390w.AbstractC13605i;
import p390w.AbstractC13609j;

/* renamed from: q.f */
/* loaded from: classes.dex */
public class C11813f implements AbstractC13605i {

    /* renamed from: a */
    private final boolean f26358a;

    /* renamed from: b */
    private final int f26359b;

    /* renamed from: c */
    private final C13163c f26360c;

    public C11813f(String str, C12267f0 f0Var) {
        boolean z;
        int i;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            C1915r1.m39517k("Camera2CamcorderProfileProvider", "Camera id is not an integer: " + str + ", unable to create CamcorderProfileProvider");
            z = false;
            i = -1;
        }
        this.f26358a = z;
        this.f26359b = i;
        this.f26360c = new C13163c((C12917e) C12919g.m5069a(str, f0Var).m3260b(C12917e.class));
    }

    /* renamed from: b */
    private AbstractC13609j m8594b(int i) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.f26359b, i);
        } catch (RuntimeException e) {
            C1915r1.m39516l("Camera2CamcorderProfileProvider", "Unable to get CamcorderProfile by quality: " + i, e);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return AbstractC13609j.m3247a(camcorderProfile);
        }
        return null;
    }

    @Override // p390w.AbstractC13605i
    /* renamed from: a */
    public boolean mo3248a(int i) {
        if (!this.f26358a || !CamcorderProfile.hasProfile(this.f26359b, i)) {
            return false;
        }
        if (!this.f26360c.m4435a()) {
            return true;
        }
        return this.f26360c.m4434b(m8594b(i));
    }

    @Override // p390w.AbstractC13605i
    public AbstractC13609j get(int i) {
        if (!this.f26358a || !CamcorderProfile.hasProfile(this.f26359b, i)) {
            return null;
        }
        AbstractC13609j b = m8594b(i);
        if (!this.f26360c.m4434b(b)) {
            return null;
        }
        return b;
    }
}
