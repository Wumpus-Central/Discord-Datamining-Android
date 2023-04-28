package p236n0;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.C1915r1;
import androidx.camera.video.internal.encoder.AbstractC1999c1;
import androidx.core.util.AbstractC2519i;
import p145i0.AbstractC8151j1;
import p390w.AbstractC13609j;

/* renamed from: n0.j */
/* loaded from: classes.dex */
public class C10687j implements AbstractC2519i<AbstractC1999c1> {

    /* renamed from: a */
    private final String f23647a;

    /* renamed from: b */
    private final AbstractC8151j1 f23648b;

    /* renamed from: c */
    private final Size f23649c;

    /* renamed from: d */
    private final AbstractC13609j f23650d;

    public C10687j(String str, AbstractC8151j1 j1Var, Size size, AbstractC13609j jVar) {
        this.f23647a = str;
        this.f23648b = j1Var;
        this.f23649c = size;
        this.f23650d = jVar;
    }

    /* renamed from: a */
    public AbstractC1999c1 get() {
        int a = C10686i.m12640a(this.f23648b);
        Range<Integer> c = this.f23648b.mo20508c();
        C1915r1.m39527a("VidEncCmcrdrPrflRslvr", "Using resolved VIDEO bitrate from CamcorderProfile");
        return AbstractC1999c1.m39220b().mo39207f(this.f23647a).mo39206g(this.f23649c).mo39211b(C10686i.m12639b(this.f23650d.mo3237k(), a, this.f23650d.mo3233o(), this.f23649c.getWidth(), this.f23650d.mo3232p(), this.f23649c.getHeight(), this.f23650d.mo3234n(), c)).mo39209d(a).mo39212a();
    }
}
