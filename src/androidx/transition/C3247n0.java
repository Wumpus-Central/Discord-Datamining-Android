package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: androidx.transition.n0 */
/* loaded from: classes.dex */
class C3247n0 implements AbstractC3249o0 {

    /* renamed from: a */
    private final ViewOverlay f5138a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3247n0(View view) {
        this.f5138a = view.getOverlay();
    }

    @Override // androidx.transition.AbstractC3249o0
    /* renamed from: a */
    public void mo34859a(Drawable drawable) {
        this.f5138a.add(drawable);
    }

    @Override // androidx.transition.AbstractC3249o0
    /* renamed from: b */
    public void mo34858b(Drawable drawable) {
        this.f5138a.remove(drawable);
    }
}
