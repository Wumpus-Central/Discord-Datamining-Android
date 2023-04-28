package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: androidx.transition.i0 */
/* loaded from: classes.dex */
class C3232i0 implements AbstractC3238j0 {

    /* renamed from: a */
    private final ViewGroupOverlay f5104a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3232i0(ViewGroup viewGroup) {
        this.f5104a = viewGroup.getOverlay();
    }

    @Override // androidx.transition.AbstractC3249o0
    /* renamed from: a */
    public void mo34859a(Drawable drawable) {
        this.f5104a.add(drawable);
    }

    @Override // androidx.transition.AbstractC3249o0
    /* renamed from: b */
    public void mo34858b(Drawable drawable) {
        this.f5104a.remove(drawable);
    }

    @Override // androidx.transition.AbstractC3238j0
    /* renamed from: c */
    public void mo34889c(View view) {
        this.f5104a.add(view);
    }

    @Override // androidx.transition.AbstractC3238j0
    /* renamed from: d */
    public void mo34888d(View view) {
        this.f5104a.remove(view);
    }
}
