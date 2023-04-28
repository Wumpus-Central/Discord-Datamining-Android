package p407wh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9911o;
import kotlin.jvm.internal.C9971q;
import p013ah.C1399g;
import p249nh.C11142f;
import p268og.AbstractC11309d;
import p268og.AbstractC11313e;
import p268og.AbstractC11404z0;

/* renamed from: wh.a */
/* loaded from: classes8.dex */
public final class C13882a implements AbstractC13887f {

    /* renamed from: b */
    private final List<AbstractC13887f> f31294b;

    /* JADX WARN: Multi-variable type inference failed */
    public C13882a(List<? extends AbstractC13887f> inner) {
        C9971q.m14633g(inner, "inner");
        this.f31294b = inner;
    }

    @Override // p407wh.AbstractC13887f
    /* renamed from: a */
    public List<C11142f> mo2388a(C1399g gVar, AbstractC11313e thisDescriptor) {
        C9971q.m14633g(gVar, "<this>");
        C9971q.m14633g(thisDescriptor, "thisDescriptor");
        List<AbstractC13887f> list = this.f31294b;
        ArrayList arrayList = new ArrayList();
        for (AbstractC13887f fVar : list) {
            C9911o.m14801y(arrayList, fVar.mo2388a(gVar, thisDescriptor));
        }
        return arrayList;
    }

    @Override // p407wh.AbstractC13887f
    /* renamed from: b */
    public List<C11142f> mo2387b(C1399g gVar, AbstractC11313e thisDescriptor) {
        C9971q.m14633g(gVar, "<this>");
        C9971q.m14633g(thisDescriptor, "thisDescriptor");
        List<AbstractC13887f> list = this.f31294b;
        ArrayList arrayList = new ArrayList();
        for (AbstractC13887f fVar : list) {
            C9911o.m14801y(arrayList, fVar.mo2387b(gVar, thisDescriptor));
        }
        return arrayList;
    }

    @Override // p407wh.AbstractC13887f
    /* renamed from: c */
    public void mo2386c(C1399g gVar, AbstractC11313e thisDescriptor, C11142f name, List<AbstractC11313e> result) {
        C9971q.m14633g(gVar, "<this>");
        C9971q.m14633g(thisDescriptor, "thisDescriptor");
        C9971q.m14633g(name, "name");
        C9971q.m14633g(result, "result");
        for (AbstractC13887f fVar : this.f31294b) {
            fVar.mo2386c(gVar, thisDescriptor, name, result);
        }
    }

    @Override // p407wh.AbstractC13887f
    /* renamed from: d */
    public void mo2385d(C1399g gVar, AbstractC11313e thisDescriptor, C11142f name, Collection<AbstractC11404z0> result) {
        C9971q.m14633g(gVar, "<this>");
        C9971q.m14633g(thisDescriptor, "thisDescriptor");
        C9971q.m14633g(name, "name");
        C9971q.m14633g(result, "result");
        for (AbstractC13887f fVar : this.f31294b) {
            fVar.mo2385d(gVar, thisDescriptor, name, result);
        }
    }

    @Override // p407wh.AbstractC13887f
    /* renamed from: e */
    public List<C11142f> mo2384e(C1399g gVar, AbstractC11313e thisDescriptor) {
        C9971q.m14633g(gVar, "<this>");
        C9971q.m14633g(thisDescriptor, "thisDescriptor");
        List<AbstractC13887f> list = this.f31294b;
        ArrayList arrayList = new ArrayList();
        for (AbstractC13887f fVar : list) {
            C9911o.m14801y(arrayList, fVar.mo2384e(gVar, thisDescriptor));
        }
        return arrayList;
    }

    @Override // p407wh.AbstractC13887f
    /* renamed from: f */
    public void mo2383f(C1399g gVar, AbstractC11313e thisDescriptor, C11142f name, Collection<AbstractC11404z0> result) {
        C9971q.m14633g(gVar, "<this>");
        C9971q.m14633g(thisDescriptor, "thisDescriptor");
        C9971q.m14633g(name, "name");
        C9971q.m14633g(result, "result");
        for (AbstractC13887f fVar : this.f31294b) {
            fVar.mo2383f(gVar, thisDescriptor, name, result);
        }
    }

    @Override // p407wh.AbstractC13887f
    /* renamed from: g */
    public void mo2382g(C1399g gVar, AbstractC11313e thisDescriptor, List<AbstractC11309d> result) {
        C9971q.m14633g(gVar, "<this>");
        C9971q.m14633g(thisDescriptor, "thisDescriptor");
        C9971q.m14633g(result, "result");
        for (AbstractC13887f fVar : this.f31294b) {
            fVar.mo2382g(gVar, thisDescriptor, result);
        }
    }
}
