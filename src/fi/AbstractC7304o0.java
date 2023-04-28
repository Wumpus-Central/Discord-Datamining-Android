package fi;

import java.util.Iterator;
import kotlin.collections.C9904h;
import kotlin.jvm.internal.C9971q;
import p182ji.AbstractC9620k;
import p182ji.AbstractC9621l;
import p305qh.AbstractC12137c;
import p326ri.C12715r;
import pg.AbstractC11666c;

/* renamed from: fi.o0 */
/* loaded from: classes8.dex */
public abstract class AbstractC7304o0 extends AbstractC7335v1 implements AbstractC9620k, AbstractC9621l {
    public AbstractC7304o0() {
        super(null);
    }

    /* renamed from: U0 */
    public abstract AbstractC7304o0 mo5166U0(boolean z);

    /* renamed from: V0 */
    public abstract AbstractC7304o0 mo5165V0(C7232c1 c1Var);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<AbstractC11666c> it = getAnnotations().iterator();
        while (it.hasNext()) {
            C12715r.m5750j(sb2, "[", AbstractC12137c.m7757s(AbstractC12137c.f27233j, it.next(), null, 2, null), "] ");
        }
        sb2.append(mo5172N0());
        if (!mo5174L0().isEmpty()) {
            C9904h.m14870c0(mo5174L0(), sb2, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (mo5171O0()) {
            sb2.append("?");
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
