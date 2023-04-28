package p350t9;

import android.os.Bundle;

/* renamed from: t9.s */
/* loaded from: classes5.dex */
final class C13034s extends AbstractC13035t<Void> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C13034s(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p350t9.AbstractC13035t
    /* renamed from: a */
    public final void mo4713a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m4714d(null);
        } else {
            m4715c(new C13036u(4, "Invalid response to one way request", null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p350t9.AbstractC13035t
    /* renamed from: b */
    public final boolean mo4712b() {
        return true;
    }
}
