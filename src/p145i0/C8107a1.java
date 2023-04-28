package p145i0;

import android.util.Size;
import androidx.camera.core.AbstractC1911r;
import androidx.camera.core.C1915r1;
import androidx.camera.core.impl.utils.C1846g;
import androidx.core.util.C2517g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p145i0.C8194v;
import p221m0.C10457a;
import p221m0.C10460d;
import p221m0.C10465i;
import p390w.AbstractC13589e0;
import p390w.AbstractC13605i;
import p390w.AbstractC13609j;

/* renamed from: i0.a1 */
/* loaded from: classes.dex */
public final class C8107a1 {

    /* renamed from: a */
    private final Map<C8194v, AbstractC13609j> f17536a = new LinkedHashMap();

    /* renamed from: b */
    private final TreeMap<Size, C8194v> f17537b = new TreeMap<>(new C1846g());

    /* renamed from: c */
    private final AbstractC13609j f17538c;

    /* renamed from: d */
    private final AbstractC13609j f17539d;

    C8107a1(AbstractC13589e0 e0Var) {
        AbstractC13605i d = e0Var.mo3295d();
        for (C8194v vVar : C8194v.m20333b()) {
            C2517g.m37585j(vVar instanceof C8194v.AbstractC8196b, "Currently only support ConstantQuality");
            int d2 = ((C8194v.AbstractC8196b) vVar).mo20331d();
            if (d.mo3248a(d2) && m20584f(vVar)) {
                AbstractC13609j jVar = (AbstractC13609j) C2517g.m37588g(d.get(d2));
                Size size = new Size(jVar.mo3232p(), jVar.mo3234n());
                C1915r1.m39527a("VideoCapabilities", "profile = " + jVar);
                this.f17536a.put(vVar, jVar);
                this.f17537b.put(size, vVar);
            }
        }
        if (this.f17536a.isEmpty()) {
            C1915r1.m39525c("VideoCapabilities", "No supported CamcorderProfile");
            this.f17539d = null;
            this.f17538c = null;
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque(this.f17536a.values());
        this.f17538c = (AbstractC13609j) arrayDeque.peekFirst();
        this.f17539d = (AbstractC13609j) arrayDeque.peekLast();
    }

    /* renamed from: a */
    private static void m20589a(C8194v vVar) {
        boolean a = C8194v.m20334a(vVar);
        C2517g.m37593b(a, "Unknown quality: " + vVar);
    }

    /* renamed from: c */
    public static C8107a1 m20587c(AbstractC1911r rVar) {
        return new C8107a1((AbstractC13589e0) rVar);
    }

    /* renamed from: f */
    private boolean m20584f(C8194v vVar) {
        boolean z;
        boolean z2;
        C10465i iVar = (C10465i) C10460d.m13127a(C10465i.class);
        if (iVar == null || !iVar.m13112c(vVar)) {
            z = true;
        } else {
            z = false;
        }
        C10457a aVar = (C10457a) C10460d.m13127a(C10457a.class);
        if (aVar == null || !aVar.m13132b(vVar)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public C8194v m20588b(Size size) {
        Map.Entry<Size, C8194v> ceilingEntry = this.f17537b.ceilingEntry(size);
        if (ceilingEntry != null) {
            return ceilingEntry.getValue();
        }
        Map.Entry<Size, C8194v> floorEntry = this.f17537b.floorEntry(size);
        if (floorEntry != null) {
            return floorEntry.getValue();
        }
        return C8194v.f17727g;
    }

    /* renamed from: d */
    public AbstractC13609j m20586d(C8194v vVar) {
        m20589a(vVar);
        if (vVar == C8194v.f17726f) {
            return this.f17538c;
        }
        if (vVar == C8194v.f17725e) {
            return this.f17539d;
        }
        return this.f17536a.get(vVar);
    }

    /* renamed from: e */
    public List<C8194v> m20585e() {
        return new ArrayList(this.f17536a.keySet());
    }
}
