package p240n4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p414x3.C13925a;

/* renamed from: n4.a */
/* loaded from: classes7.dex */
public class C10708a implements AbstractC10709b {

    /* renamed from: a */
    private final List<AbstractC10709b> f23678a;

    public C10708a(AbstractC10709b... bVarArr) {
        ArrayList arrayList = new ArrayList(bVarArr.length);
        this.f23678a = arrayList;
        Collections.addAll(arrayList, bVarArr);
    }

    @Override // p240n4.AbstractC10709b
    /* renamed from: a */
    public synchronized void mo10505a(String str, int i, boolean z, String str2) {
        int size = this.f23678a.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC10709b bVar = this.f23678a.get(i2);
            if (bVar != null) {
                try {
                    bVar.mo10505a(str, i, z, str2);
                } catch (Exception e) {
                    C13925a.m2287k("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", e);
                }
            }
        }
    }

    /* renamed from: b */
    public synchronized void m12621b(AbstractC10709b bVar) {
        this.f23678a.add(bVar);
    }

    /* renamed from: c */
    public synchronized void m12620c(AbstractC10709b bVar) {
        this.f23678a.remove(bVar);
    }
}
