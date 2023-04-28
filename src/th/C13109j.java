package th;

import fi.AbstractC7267g0;
import fi.AbstractC7304o0;
import kotlin.Pair;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;
import p142hi.C8039k;
import p142hi.EnumC8038j;
import p249nh.C11136b;
import p249nh.C11142f;
import p268og.AbstractC11313e;
import p268og.AbstractC11327h0;
import p268og.C11393x;
import p325rh.C12661e;

/* renamed from: th.j */
/* loaded from: classes8.dex */
public final class C13109j extends AbstractC13104g<Pair<? extends C11136b, ? extends C11142f>> {

    /* renamed from: b */
    private final C11136b f29413b;

    /* renamed from: c */
    private final C11142f f29414c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13109j(C11136b enumClassId, C11142f enumEntryName) {
        super(C11098x.m10921a(enumClassId, enumEntryName));
        C9971q.m14633g(enumClassId, "enumClassId");
        C9971q.m14633g(enumEntryName, "enumEntryName");
        this.f29413b = enumClassId;
        this.f29414c = enumEntryName;
    }

    @Override // th.AbstractC13104g
    /* renamed from: a */
    public AbstractC7267g0 mo4552a(AbstractC11327h0 module) {
        C9971q.m14633g(module, "module");
        AbstractC11313e a = C11393x.m10149a(module, this.f29413b);
        AbstractC7304o0 o0Var = null;
        if (a != null) {
            if (!C12661e.m6066A(a)) {
                a = null;
            }
            if (a != null) {
                o0Var = a.mo6166p();
            }
        }
        if (o0Var != null) {
            return o0Var;
        }
        EnumC8038j jVar = EnumC8038j.ERROR_ENUM_TYPE;
        String bVar = this.f29413b.toString();
        C9971q.m14634f(bVar, "enumClassId.toString()");
        String fVar = this.f29414c.toString();
        C9971q.m14634f(fVar, "enumEntryName.toString()");
        return C8039k.m20774d(jVar, bVar, fVar);
    }

    /* renamed from: c */
    public final C11142f m4591c() {
        return this.f29414c;
    }

    @Override // th.AbstractC13104g
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f29413b.m10808j());
        sb2.append('.');
        sb2.append(this.f29414c);
        return sb2.toString();
    }
}
