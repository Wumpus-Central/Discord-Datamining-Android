package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* renamed from: androidx.transition.f1 */
/* loaded from: classes.dex */
class C3216f1 implements AbstractC3225g1 {

    /* renamed from: a */
    private final WindowId f5055a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3216f1(View view) {
        this.f5055a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3216f1) && ((C3216f1) obj).f5055a.equals(this.f5055a);
    }

    public int hashCode() {
        return this.f5055a.hashCode();
    }
}
