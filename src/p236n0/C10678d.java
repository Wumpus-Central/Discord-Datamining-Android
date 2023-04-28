package p236n0;

import android.util.Range;
import androidx.camera.core.C1915r1;
import androidx.camera.video.internal.encoder.AbstractC1980a;
import androidx.core.util.AbstractC2519i;
import p145i0.AbstractC8105a;
import p186k0.C9699f;

/* renamed from: n0.d */
/* loaded from: classes.dex */
public final class C10678d implements AbstractC2519i<AbstractC1980a> {

    /* renamed from: a */
    private final String f23634a;

    /* renamed from: b */
    private final int f23635b;

    /* renamed from: c */
    private final AbstractC8105a f23636c;

    /* renamed from: d */
    private final C9699f.AbstractC9705g f23637d;

    public C10678d(String str, int i, AbstractC8105a aVar, C9699f.AbstractC9705g gVar) {
        this.f23634a = str;
        this.f23635b = i;
        this.f23636c = aVar;
        this.f23637d = gVar;
    }

    /* renamed from: a */
    public AbstractC1980a get() {
        Range<Integer> b = this.f23636c.mo20582b();
        C1915r1.m39527a("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        return AbstractC1980a.m39337b().mo39224e(this.f23634a).mo39223f(this.f23635b).mo39225d(this.f23637d.mo15550d()).mo39222g(this.f23637d.mo15549e()).mo39226c(C10676b.m12654e(156000, this.f23637d.mo15550d(), 2, this.f23637d.mo15549e(), 48000, b)).m39336b();
    }
}
