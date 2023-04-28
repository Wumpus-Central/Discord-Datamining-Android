package p236n0;

import android.util.Range;
import androidx.camera.core.C1915r1;
import androidx.core.util.AbstractC2519i;
import p145i0.AbstractC8105a;
import p186k0.C9699f;

/* renamed from: n0.f */
/* loaded from: classes.dex */
public final class C10680f implements AbstractC2519i<C9699f.AbstractC9705g> {

    /* renamed from: a */
    private final AbstractC8105a f23640a;

    public C10680f(AbstractC8105a aVar) {
        this.f23640a = aVar;
    }

    /* renamed from: a */
    public C9699f.AbstractC9705g get() {
        int i;
        int c = C10676b.m12656c(this.f23640a);
        int d = C10676b.m12655d(this.f23640a);
        int c2 = this.f23640a.mo20581c();
        if (c2 == -1) {
            C1915r1.m39527a("DefAudioSrcResolver", "Using fallback AUDIO channel count: 1");
            c2 = 1;
        } else {
            C1915r1.m39527a("DefAudioSrcResolver", "Using supplied AUDIO channel count: " + c2);
        }
        Range<Integer> d2 = this.f23640a.mo20580d();
        if (AbstractC8105a.f17533b.equals(d2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Using fallback AUDIO sample rate: ");
            i = 44100;
            sb2.append(44100);
            sb2.append("Hz");
            C1915r1.m39527a("DefAudioSrcResolver", sb2.toString());
        } else {
            i = C10676b.m12653f(d2, c2, d, d2.getUpper().intValue());
            C1915r1.m39527a("DefAudioSrcResolver", "Using AUDIO sample rate resolved from AudioSpec: " + i + "Hz");
        }
        return C9699f.AbstractC9705g.m15554a().mo15546d(c).mo15547c(d).mo15545e(c2).mo15544f(i).m15553b();
    }
}
