package p236n0;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.C1915r1;
import androidx.camera.video.internal.encoder.AbstractC1999c1;
import androidx.core.util.AbstractC2519i;
import p145i0.AbstractC8151j1;

/* renamed from: n0.k */
/* loaded from: classes.dex */
public class C10688k implements AbstractC2519i<AbstractC1999c1> {

    /* renamed from: d */
    private static final Size f23651d = new Size(1280, 720);

    /* renamed from: a */
    private final String f23652a;

    /* renamed from: b */
    private final AbstractC8151j1 f23653b;

    /* renamed from: c */
    private final Size f23654c;

    public C10688k(String str, AbstractC8151j1 j1Var, Size size) {
        this.f23652a = str;
        this.f23653b = j1Var;
        this.f23654c = size;
    }

    /* renamed from: a */
    public AbstractC1999c1 get() {
        int a = C10686i.m12640a(this.f23653b);
        Range<Integer> c = this.f23653b.mo20508c();
        C1915r1.m39527a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        int width = this.f23654c.getWidth();
        Size size = f23651d;
        return AbstractC1999c1.m39220b().mo39207f(this.f23652a).mo39206g(this.f23654c).mo39211b(C10686i.m12639b(14000000, a, 30, width, size.getWidth(), this.f23654c.getHeight(), size.getHeight(), c)).mo39209d(a).mo39212a();
    }
}
