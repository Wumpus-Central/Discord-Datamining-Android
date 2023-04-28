package gh;

import bh.C3521h;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11299a1;
import p268og.AbstractC11304b1;

/* renamed from: gh.s */
/* loaded from: classes8.dex */
public final class C7643s implements AbstractC11299a1 {

    /* renamed from: b */
    private final C3521h f16647b;

    public C7643s(C3521h packageFragment) {
        C9971q.m14633g(packageFragment, "packageFragment");
        this.f16647b = packageFragment;
    }

    @Override // p268og.AbstractC11299a1
    /* renamed from: b */
    public AbstractC11304b1 mo4612b() {
        AbstractC11304b1 NO_SOURCE_FILE = AbstractC11304b1.f25237a;
        C9971q.m14634f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public String toString() {
        return this.f16647b + ": " + this.f16647b.m34192M0().keySet();
    }
}
