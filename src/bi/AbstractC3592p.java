package bi;

import kotlin.jvm.internal.C9971q;
import p070di.AbstractC6485h;
import p087ei.AbstractC6944n;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11327h0;
import p324rg.AbstractC12653z;
import p448yh.AbstractC14411h;

/* renamed from: bi.p */
/* loaded from: classes8.dex */
public abstract class AbstractC3592p extends AbstractC12653z {

    /* renamed from: q */
    private final AbstractC6944n f5853q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3592p(C11137c fqName, AbstractC6944n storageManager, AbstractC11327h0 module) {
        super(module, fqName);
        C9971q.m14633g(fqName, "fqName");
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(module, "module");
        this.f5853q = storageManager;
    }

    /* renamed from: G0 */
    public abstract AbstractC3578h mo34007G0();

    /* renamed from: K0 */
    public boolean m34008K0(C11142f name) {
        C9971q.m14633g(name, "name");
        AbstractC14411h o = mo6298o();
        if (!(o instanceof AbstractC6485h) || !((AbstractC6485h) o).m25478q().contains(name)) {
            return false;
        }
        return true;
    }

    /* renamed from: L0 */
    public abstract void mo34006L0(C3585k kVar);
}
