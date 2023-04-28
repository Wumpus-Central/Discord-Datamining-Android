package gi;

import fi.AbstractC7267g0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import p268og.C11321g0;

/* renamed from: gi.h */
/* loaded from: classes8.dex */
public final class C7666h {

    /* renamed from: a */
    private static final C11321g0<C7679p<AbstractC7694x>> f16662a = new C11321g0<>("KotlinTypeRefiner");

    /* renamed from: a */
    public static final C11321g0<C7679p<AbstractC7694x>> m21692a() {
        return f16662a;
    }

    /* renamed from: b */
    public static final List<AbstractC7267g0> m21691b(AbstractC7664g gVar, Iterable<? extends AbstractC7267g0> types) {
        int t;
        C9971q.m14633g(gVar, "<this>");
        C9971q.m14633g(types, "types");
        t = C9907k.m14809t(types, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC7267g0 g0Var : types) {
            arrayList.add(gVar.mo21694h(g0Var));
        }
        return arrayList;
    }
}
