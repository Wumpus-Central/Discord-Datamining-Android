package ug;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6893e;
import p249nh.C11142f;
import ug.AbstractC13287f;

/* renamed from: ug.j */
/* loaded from: classes8.dex */
public final class C13292j extends AbstractC13287f implements AbstractC6893e {

    /* renamed from: c */
    private final Object[] f29833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13292j(C11142f fVar, Object[] values) {
        super(fVar, null);
        C9971q.m14633g(values, "values");
        this.f29833c = values;
    }

    @Override // p086eh.AbstractC6893e
    /* renamed from: c */
    public List<AbstractC13287f> mo4032c() {
        Object[] objArr = this.f29833c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            AbstractC13287f.C13288a aVar = AbstractC13287f.f29830b;
            C9971q.m14636d(obj);
            arrayList.add(aVar.m4036a(obj, null));
        }
        return arrayList;
    }
}
