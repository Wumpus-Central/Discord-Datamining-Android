package p236n0;

import androidx.camera.core.C1915r1;
import androidx.camera.video.internal.encoder.AbstractC1980a;
import androidx.core.util.AbstractC2519i;
import p145i0.AbstractC8105a;
import p186k0.C9699f;
import p390w.AbstractC13609j;

/* renamed from: n0.c */
/* loaded from: classes.dex */
public final class C10677c implements AbstractC2519i<AbstractC1980a> {

    /* renamed from: a */
    private final String f23629a;

    /* renamed from: b */
    private final int f23630b;

    /* renamed from: c */
    private final AbstractC8105a f23631c;

    /* renamed from: d */
    private final C9699f.AbstractC9705g f23632d;

    /* renamed from: e */
    private final AbstractC13609j f23633e;

    public C10677c(String str, int i, AbstractC8105a aVar, C9699f.AbstractC9705g gVar, AbstractC13609j jVar) {
        this.f23629a = str;
        this.f23630b = i;
        this.f23631c = aVar;
        this.f23632d = gVar;
        this.f23633e = jVar;
    }

    /* renamed from: a */
    public AbstractC1980a get() {
        C1915r1.m39527a("AudioEncCmcrdrPrflRslvr", "Using resolved AUDIO bitrate from CamcorderProfile");
        return AbstractC1980a.m39337b().mo39224e(this.f23629a).mo39223f(this.f23630b).mo39225d(this.f23632d.mo15550d()).mo39222g(this.f23632d.mo15549e()).mo39226c(C10676b.m12654e(this.f23633e.mo3246b(), this.f23632d.mo15550d(), this.f23633e.mo3245c(), this.f23632d.mo15549e(), this.f23633e.mo3242f(), this.f23631c.mo20582b())).m39336b();
    }
}
