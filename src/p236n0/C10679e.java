package p236n0;

import android.util.Range;
import androidx.camera.core.C1915r1;
import androidx.core.util.AbstractC2519i;
import p145i0.AbstractC8105a;
import p186k0.C9699f;
import p390w.AbstractC13609j;

/* renamed from: n0.e */
/* loaded from: classes.dex */
public final class C10679e implements AbstractC2519i<C9699f.AbstractC9705g> {

    /* renamed from: a */
    private final AbstractC8105a f23638a;

    /* renamed from: b */
    private final AbstractC13609j f23639b;

    public C10679e(AbstractC8105a aVar, AbstractC13609j jVar) {
        this.f23638a = aVar;
        this.f23639b = jVar;
    }

    /* renamed from: a */
    public C9699f.AbstractC9705g get() {
        int c = C10676b.m12656c(this.f23638a);
        int d = C10676b.m12655d(this.f23638a);
        int c2 = this.f23638a.mo20581c();
        Range<Integer> d2 = this.f23638a.mo20580d();
        int c3 = this.f23639b.mo3245c();
        if (c2 == -1) {
            C1915r1.m39527a("AudioSrcCmcrdrPrflRslvr", "Resolved AUDIO channel count from CamcorderProfile: " + c3);
            c2 = c3;
        } else {
            C1915r1.m39527a("AudioSrcCmcrdrPrflRslvr", "Media spec AUDIO channel count overrides CamcorderProfile [CamcorderProfile channel count: " + c3 + ", Resolved Channel Count: " + c2 + "]");
        }
        int f = this.f23639b.mo3242f();
        int f2 = C10676b.m12653f(d2, c2, d, f);
        C1915r1.m39527a("AudioSrcCmcrdrPrflRslvr", "Using resolved AUDIO sample rate or nearest supported from CamcorderProfile: " + f2 + "Hz. [CamcorderProfile sample rate: " + f + "Hz]");
        return C9699f.AbstractC9705g.m15554a().mo15546d(c).mo15547c(d).mo15545e(c2).mo15544f(f2).m15553b();
    }
}
