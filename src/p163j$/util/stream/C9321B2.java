package p163j$.util.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import p163j$.util.Collection;
import p163j$.util.List;

/* renamed from: j$.util.stream.B2 */
/* loaded from: classes2.dex */
final class C9321B2 extends AbstractC0608t2 {

    /* renamed from: d */
    private ArrayList f20451d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9321B2(AbstractC0546e2 e2Var, Comparator comparator) {
        super(e2Var, comparator);
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f20451d.add(obj);
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        if (j < 2147483639) {
            this.f20451d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // p163j$.util.stream.AbstractC0526a2, p163j$.util.stream.AbstractC0546e2
    public final void end() {
        ArrayList arrayList = this.f20451d;
        boolean z = arrayList instanceof List;
        Comparator comparator = this.f20761b;
        if (z) {
            ((List) arrayList).sort(comparator);
        } else {
            List.CC.$default$sort(arrayList, comparator);
        }
        AbstractC0546e2 e2Var = this.f20615a;
        e2Var.mo16235c(this.f20451d.size());
        if (!this.f20762c) {
            Collection.EL.m16605a(this.f20451d, new C0523a(3, e2Var));
        } else {
            Iterator it = this.f20451d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (e2Var.mo16234e()) {
                    break;
                }
                e2Var.accept((AbstractC0546e2) next);
            }
        }
        e2Var.end();
        this.f20451d = null;
    }
}
