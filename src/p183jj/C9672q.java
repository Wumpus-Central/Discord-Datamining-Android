package p183jj;

import java.util.HashMap;
import java.util.Map;
import p143hj.AbstractC8079p;

/* renamed from: jj.q */
/* loaded from: classes8.dex */
class C9672q extends HashMap<AbstractC8079p<?>, Object> {
    private static final long serialVersionUID = 1245025551222311435L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9672q(Map<? extends AbstractC8079p<?>, ?> map) {
        super(map);
    }

    /* renamed from: a */
    public Object put(AbstractC8079p<?> pVar, Object obj) {
        Object put = super.put(pVar, obj);
        if (pVar == null || put == null || put.equals(obj)) {
            return put;
        }
        throw new C9632a(pVar);
    }
}
