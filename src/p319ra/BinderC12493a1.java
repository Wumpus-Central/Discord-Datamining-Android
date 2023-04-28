package p319ra;

import com.google.android.gms.common.api.internal.C5378d;
import com.google.android.gms.nearby.messages.internal.Update;
import java.util.Iterator;
import java.util.List;
import p442ya.AbstractC14327b;
import za.AbstractBinderC14607o;

/* renamed from: ra.a1 */
/* loaded from: classes3.dex */
public final class BinderC12493a1 extends AbstractBinderC14607o {

    /* renamed from: a */
    private final C5378d f28146a;

    public BinderC12493a1(C5378d dVar) {
        this.f28146a = dVar;
    }

    /* renamed from: c */
    public static void m6616c(Iterable iterable, AbstractC14327b bVar) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Update update = (Update) it.next();
            if (update.m28927p(1)) {
                bVar.onFound(update.f10295m);
            }
            if (update.m28927p(2)) {
                bVar.onLost(update.f10295m);
            }
            if (update.m28927p(4)) {
                bVar.onDistanceChanged(update.f10295m, update.f10296n);
            }
            if (update.m28927p(8)) {
                bVar.onBleSignalChanged(update.f10295m, update.f10297o);
            }
            update.m28927p(16);
        }
    }

    @Override // za.AbstractC14608p
    /* renamed from: D */
    public final void mo133D(List list) {
        this.f28146a.m29054c(new C12551z0(this, list));
    }
}
