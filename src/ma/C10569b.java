package ma;

import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC5389h;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p261o9.AbstractC11239b;
import p400w9.AbstractC13827i;

/* renamed from: ma.b */
/* loaded from: classes3.dex */
public final class C10569b extends AbstractC11239b {
    public C10569b(Context context) {
        super(context);
    }

    @Override // p261o9.AbstractC11239b
    /* renamed from: C */
    public final Task<Void> mo10370C() {
        return m3627q(AbstractC5389h.m29036a().m29030b(new AbstractC13827i() { // from class: ma.j
            @Override // p400w9.AbstractC13827i
            public final void accept(Object obj, Object obj2) {
                ((C10573f) ((C10576i) obj).m2189C()).m12803e(new BinderC10578k(C10569b.this, (TaskCompletionSource) obj2));
            }
        }).m29028d(C10570c.f23418c).m29027e(1567).m29031a());
    }
}
