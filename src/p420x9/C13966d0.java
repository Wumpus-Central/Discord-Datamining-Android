package p420x9;

import android.content.Intent;
import p400w9.AbstractC13821f;

/* renamed from: x9.d0 */
/* loaded from: classes5.dex */
final class C13966d0 extends AbstractDialogInterface$OnClickListenerC13969e0 {

    /* renamed from: k */
    final /* synthetic */ Intent f31497k;

    /* renamed from: l */
    final /* synthetic */ AbstractC13821f f31498l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13966d0(Intent intent, AbstractC13821f fVar, int i) {
        this.f31497k = intent;
        this.f31498l = fVar;
    }

    @Override // p420x9.AbstractDialogInterface$OnClickListenerC13969e0
    /* renamed from: a */
    public final void mo2120a() {
        Intent intent = this.f31497k;
        if (intent != null) {
            this.f31498l.startActivityForResult(intent, 2);
        }
    }
}
