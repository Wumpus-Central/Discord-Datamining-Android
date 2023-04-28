package p143hj;

import java.util.Map;
import p143hj.AbstractC8070l;

/* renamed from: hj.j */
/* loaded from: classes8.dex */
public final class C8066j<T extends AbstractC8070l<T>> extends C8087x<T> {

    /* renamed from: r */
    private final Map<String, ? extends AbstractC8068k<T>> f17463r;

    @Override // p143hj.C8087x
    /* renamed from: D */
    public boolean mo20656D(AbstractC8079p<?> pVar) {
        return super.mo20656D(pVar) || (pVar instanceof EnumC8042a0);
    }

    @Override // p143hj.C8087x
    /* renamed from: n */
    public AbstractC8068k<T> mo20650n() {
        throw new C8081r("Cannot determine calendar system without variant.");
    }

    @Override // p143hj.C8087x
    /* renamed from: o */
    public AbstractC8068k<T> mo20649o(String str) {
        if (str.isEmpty()) {
            return mo20650n();
        }
        AbstractC8068k<T> kVar = (AbstractC8068k) this.f17463r.get(str);
        if (kVar == null) {
            return super.mo20649o(str);
        }
        return kVar;
    }
}
