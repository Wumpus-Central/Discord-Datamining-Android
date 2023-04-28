package ug;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6885a;
import p086eh.AbstractC6895g;
import p086eh.AbstractC6909u;
import p249nh.C11137c;
import p249nh.C11142f;

/* renamed from: ug.w */
/* loaded from: classes8.dex */
public final class C13313w extends AbstractC13306p implements AbstractC6909u {

    /* renamed from: a */
    private final C11137c f29855a;

    public C13313w(C11137c fqName) {
        C9971q.m14633g(fqName, "fqName");
        this.f29855a = fqName;
    }

    @Override // p086eh.AbstractC6891d
    /* renamed from: D */
    public boolean mo3971D() {
        return false;
    }

    @Override // p086eh.AbstractC6909u
    /* renamed from: F */
    public Collection<AbstractC6895g> mo3974F(Function1<? super C11142f, Boolean> nameFilter) {
        List i;
        C9971q.m14633g(nameFilter, "nameFilter");
        i = C9906j.m14820i();
        return i;
    }

    @Override // p086eh.AbstractC6891d
    /* renamed from: c */
    public AbstractC6885a mo3966c(C11137c fqName) {
        C9971q.m14633g(fqName, "fqName");
        return null;
    }

    @Override // p086eh.AbstractC6909u
    /* renamed from: e */
    public C11137c mo3973e() {
        return this.f29855a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13313w) && C9971q.m14638b(mo3973e(), ((C13313w) obj).mo3973e());
    }

    public int hashCode() {
        return mo3973e().hashCode();
    }

    public String toString() {
        return C13313w.class.getName() + ": " + mo3973e();
    }

    @Override // p086eh.AbstractC6909u
    /* renamed from: u */
    public Collection<AbstractC6909u> mo3972u() {
        List i;
        i = C9906j.m14820i();
        return i;
    }

    @Override // p086eh.AbstractC6891d
    public List<AbstractC6885a> getAnnotations() {
        List<AbstractC6885a> i;
        i = C9906j.m14820i();
        return i;
    }
}
