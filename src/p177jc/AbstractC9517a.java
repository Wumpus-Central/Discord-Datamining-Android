package p177jc;

import java.util.Set;
import tc.AbstractC13053b;

/* renamed from: jc.a */
/* loaded from: classes3.dex */
abstract class AbstractC9517a implements AbstractC9528e {
    @Override // p177jc.AbstractC9528e
    /* renamed from: a */
    public <T> T mo16062a(Class<T> cls) {
        AbstractC13053b<T> d = mo16059d(cls);
        if (d == null) {
            return null;
        }
        return d.get();
    }

    @Override // p177jc.AbstractC9528e
    /* renamed from: c */
    public <T> Set<T> mo16060c(Class<T> cls) {
        return mo16061b(cls).get();
    }
}
