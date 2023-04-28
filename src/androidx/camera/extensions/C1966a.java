package androidx.camera.extensions;

import androidx.camera.core.AbstractC1906q;
import androidx.camera.core.AbstractC1911r;
import androidx.core.util.C2517g;
import java.util.ArrayList;
import java.util.List;
import p072e0.AbstractC6547n;
import p374v.C13382h;
import p390w.AbstractC13586d1;
import p390w.AbstractC13589e0;

/* renamed from: androidx.camera.extensions.a */
/* loaded from: classes.dex */
final class C1966a implements AbstractC1906q {

    /* renamed from: b */
    private final AbstractC13586d1 f2086b;

    /* renamed from: c */
    private final AbstractC6547n f2087c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1966a(String str, AbstractC6547n nVar) {
        this.f2086b = AbstractC13586d1.m3304a(str);
        this.f2087c = nVar;
    }

    @Override // androidx.camera.core.AbstractC1906q
    /* renamed from: a */
    public AbstractC13586d1 mo3124a() {
        return this.f2086b;
    }

    @Override // androidx.camera.core.AbstractC1906q
    /* renamed from: b */
    public List<AbstractC1911r> mo3123b(List<AbstractC1911r> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC1911r rVar : list) {
            C2517g.m37593b(rVar instanceof AbstractC13589e0, "The camera info doesn't contain internal implementation.");
            if (this.f2087c.mo25336d(C13382h.m3786b(rVar).m3783e(), C13382h.m3786b(rVar).m3784d())) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }
}
