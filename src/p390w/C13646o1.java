package p390w;

import androidx.camera.core.AbstractC1906q;
import androidx.camera.core.AbstractC1911r;
import androidx.camera.core.C1902p;
import androidx.core.util.C2517g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: w.o1 */
/* loaded from: classes.dex */
public class C13646o1 implements AbstractC1906q {

    /* renamed from: b */
    private int f30480b;

    public C13646o1(int i) {
        this.f30480b = i;
    }

    @Override // androidx.camera.core.AbstractC1906q
    /* renamed from: a */
    public /* synthetic */ AbstractC13586d1 mo3124a() {
        return C1902p.m39563a(this);
    }

    @Override // androidx.camera.core.AbstractC1906q
    /* renamed from: b */
    public List<AbstractC1911r> mo3123b(List<AbstractC1911r> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC1911r rVar : list) {
            C2517g.m37593b(rVar instanceof AbstractC13589e0, "The camera info doesn't contain internal implementation.");
            Integer c = ((AbstractC13589e0) rVar).mo3296c();
            if (c != null && c.intValue() == this.f30480b) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public int m3122c() {
        return this.f30480b;
    }
}
