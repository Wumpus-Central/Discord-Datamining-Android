package p350t9;

import android.os.Bundle;

/* renamed from: t9.v */
/* loaded from: classes5.dex */
final class C13037v extends AbstractC13035t<Bundle> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C13037v(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p350t9.AbstractC13035t
    /* renamed from: a */
    public final void mo4713a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        m4714d(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p350t9.AbstractC13035t
    /* renamed from: b */
    public final boolean mo4712b() {
        return false;
    }
}
