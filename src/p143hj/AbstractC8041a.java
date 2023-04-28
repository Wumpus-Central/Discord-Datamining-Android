package p143hj;

import java.util.List;
import p143hj.AbstractC8071l0;
import p143hj.AbstractC8086w;

/* renamed from: hj.a */
/* loaded from: classes8.dex */
public abstract class AbstractC8041a<U extends AbstractC8086w> implements AbstractC8071l0<U> {
    /* renamed from: b */
    public boolean m20759b() {
        List<AbstractC8071l0.C8072a<U>> a = mo11418a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            if (((AbstractC8071l0.C8072a) a.get(i)).m20675a() > 0) {
                return false;
            }
        }
        return true;
    }
}
