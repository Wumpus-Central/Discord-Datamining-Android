package p420x9;

import android.app.Activity;
import android.content.Intent;

/* renamed from: x9.c0 */
/* loaded from: classes5.dex */
final class C13962c0 extends AbstractDialogInterface$OnClickListenerC13969e0 {

    /* renamed from: k */
    final /* synthetic */ Intent f31477k;

    /* renamed from: l */
    final /* synthetic */ Activity f31478l;

    /* renamed from: m */
    final /* synthetic */ int f31479m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13962c0(Intent intent, Activity activity, int i) {
        this.f31477k = intent;
        this.f31478l = activity;
        this.f31479m = i;
    }

    @Override // p420x9.AbstractDialogInterface$OnClickListenerC13969e0
    /* renamed from: a */
    public final void mo2120a() {
        Intent intent = this.f31477k;
        if (intent != null) {
            this.f31478l.startActivityForResult(intent, this.f31479m);
        }
    }
}
