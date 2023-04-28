package p108fh;

import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: fh.k */
/* loaded from: classes8.dex */
public final class C7206k {

    /* renamed from: a */
    private final C7218q f15633a;

    /* renamed from: b */
    private final List<C7218q> f15634b;

    public C7206k() {
        this(null, null, 3, null);
    }

    public C7206k(C7218q qVar, List<C7218q> parametersInfo) {
        C9971q.m14633g(parametersInfo, "parametersInfo");
        this.f15633a = qVar;
        this.f15634b = parametersInfo;
    }

    /* renamed from: a */
    public final List<C7218q> m23239a() {
        return this.f15634b;
    }

    /* renamed from: b */
    public final C7218q m23238b() {
        return this.f15633a;
    }

    public /* synthetic */ C7206k(C7218q qVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : qVar, (i & 2) != 0 ? C9906j.m14820i() : list);
    }
}
