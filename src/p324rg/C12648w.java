package p324rg;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C9971q;

/* renamed from: rg.w */
/* loaded from: classes8.dex */
public final class C12648w implements AbstractC12647v {

    /* renamed from: a */
    private final List<C12649x> f28458a;

    /* renamed from: b */
    private final Set<C12649x> f28459b;

    /* renamed from: c */
    private final List<C12649x> f28460c;

    /* renamed from: d */
    private final Set<C12649x> f28461d;

    public C12648w(List<C12649x> allDependencies, Set<C12649x> modulesWhoseInternalsAreVisible, List<C12649x> directExpectedByDependencies, Set<C12649x> allExpectedByDependencies) {
        C9971q.m14633g(allDependencies, "allDependencies");
        C9971q.m14633g(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        C9971q.m14633g(directExpectedByDependencies, "directExpectedByDependencies");
        C9971q.m14633g(allExpectedByDependencies, "allExpectedByDependencies");
        this.f28458a = allDependencies;
        this.f28459b = modulesWhoseInternalsAreVisible;
        this.f28460c = directExpectedByDependencies;
        this.f28461d = allExpectedByDependencies;
    }

    @Override // p324rg.AbstractC12647v
    /* renamed from: a */
    public List<C12649x> mo6157a() {
        return this.f28458a;
    }

    @Override // p324rg.AbstractC12647v
    /* renamed from: b */
    public List<C12649x> mo6156b() {
        return this.f28460c;
    }

    @Override // p324rg.AbstractC12647v
    /* renamed from: c */
    public Set<C12649x> mo6155c() {
        return this.f28459b;
    }
}
