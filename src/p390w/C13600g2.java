package p390w;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: w.g2 */
/* loaded from: classes.dex */
public class C13600g2 {

    /* renamed from: a */
    private final List<AbstractC13595f2> f30402a;

    public C13600g2(List<AbstractC13595f2> list) {
        this.f30402a = new ArrayList(list);
    }

    /* renamed from: a */
    public boolean m3261a(Class<? extends AbstractC13595f2> cls) {
        for (AbstractC13595f2 f2Var : this.f30402a) {
            if (cls.isAssignableFrom(f2Var.getClass())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public <T extends AbstractC13595f2> T m3260b(Class<T> cls) {
        Iterator<AbstractC13595f2> it = this.f30402a.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }
}
