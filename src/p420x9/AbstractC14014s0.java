package p420x9;

import android.app.PendingIntent;
import android.os.Bundle;
import p365u9.C13215a;

/* renamed from: x9.s0 */
/* loaded from: classes5.dex */
abstract class AbstractC14014s0 extends AbstractC14030z0<Boolean> {

    /* renamed from: d */
    public final int f31598d;

    /* renamed from: e */
    public final Bundle f31599e;

    /* renamed from: f */
    final /* synthetic */ AbstractC13957c f31600f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC14014s0(AbstractC13957c cVar, int i, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f31600f = cVar;
        this.f31598d = i;
        this.f31599e = bundle;
    }

    @Override // p420x9.AbstractC14030z0
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ void mo2013a(Boolean bool) {
        PendingIntent pendingIntent = null;
        if (this.f31598d != 0) {
            this.f31600f.m2155g0(1, null);
            Bundle bundle = this.f31599e;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
            }
            mo2031f(new C13215a(this.f31598d, pendingIntent));
        } else if (!mo2030g()) {
            this.f31600f.m2155g0(1, null);
            mo2031f(new C13215a(8, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC14030z0
    /* renamed from: b */
    public final void mo2012b() {
    }

    /* renamed from: f */
    protected abstract void mo2031f(C13215a aVar);

    /* renamed from: g */
    protected abstract boolean mo2030g();
}
