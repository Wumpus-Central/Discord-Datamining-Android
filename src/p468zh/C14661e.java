package p468zh;

import fi.AbstractC7304o0;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11313e;

/* renamed from: zh.e */
/* loaded from: classes8.dex */
public class C14661e implements AbstractC14663g, AbstractC14665i {

    /* renamed from: a */
    private final AbstractC11313e f33140a;

    /* renamed from: b */
    private final C14661e f33141b;

    /* renamed from: c */
    private final AbstractC11313e f33142c;

    public C14661e(AbstractC11313e classDescriptor, C14661e eVar) {
        C9971q.m14633g(classDescriptor, "classDescriptor");
        this.f33140a = classDescriptor;
        this.f33141b = eVar == null ? this : eVar;
        this.f33142c = classDescriptor;
    }

    /* renamed from: c */
    public AbstractC7304o0 getType() {
        AbstractC7304o0 p = this.f33140a.mo6166p();
        C9971q.m14634f(p, "classDescriptor.defaultType");
        return p;
    }

    public boolean equals(Object obj) {
        AbstractC11313e eVar = this.f33140a;
        AbstractC11313e eVar2 = null;
        C14661e eVar3 = obj instanceof C14661e ? (C14661e) obj : null;
        if (eVar3 != null) {
            eVar2 = eVar3.f33140a;
        }
        return C9971q.m14638b(eVar, eVar2);
    }

    public int hashCode() {
        return this.f33140a.hashCode();
    }

    @Override // p468zh.AbstractC14665i
    /* renamed from: t */
    public final AbstractC11313e mo45t() {
        return this.f33140a;
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }
}
