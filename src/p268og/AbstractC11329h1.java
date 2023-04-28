package p268og;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11088q;
import nf.C11098x;
import p182ji.AbstractC9620k;
import p249nh.C11142f;

/* renamed from: og.h1 */
/* loaded from: classes8.dex */
public abstract class AbstractC11329h1<Type extends AbstractC9620k> {
    private AbstractC11329h1() {
    }

    public /* synthetic */ AbstractC11329h1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract List<Pair<C11142f, Type>> mo10136a();

    /* renamed from: b */
    public final <Other extends AbstractC9620k> AbstractC11329h1<Other> m10203b(Function1<? super Type, ? extends Other> transform) {
        int t;
        C9971q.m14633g(transform, "transform");
        if (this instanceof C11403z) {
            C11403z zVar = (C11403z) this;
            return new C11403z(zVar.m10135c(), (AbstractC9620k) transform.invoke(zVar.m10134d()));
        } else if (this instanceof C11331i0) {
            List<Pair<C11142f, Type>> a = mo10136a();
            t = C9907k.m14809t(a, 10);
            ArrayList arrayList = new ArrayList(t);
            Iterator<T> it = a.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList.add(C11098x.m10921a((C11142f) pair.m15067a(), transform.invoke((AbstractC9620k) pair.m15066b())));
            }
            return new C11331i0(arrayList);
        } else {
            throw new C11088q();
        }
    }
}
