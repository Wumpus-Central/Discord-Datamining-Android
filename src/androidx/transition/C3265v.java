package androidx.transition;

import android.view.ViewGroup;

/* renamed from: androidx.transition.v */
/* loaded from: classes.dex */
public class C3265v {

    /* renamed from: a */
    private ViewGroup f5152a;

    /* renamed from: b */
    private Runnable f5153b;

    /* renamed from: b */
    public static C3265v m34828b(ViewGroup viewGroup) {
        return (C3265v) viewGroup.getTag(C3261t.f5148e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m34827c(ViewGroup viewGroup, C3265v vVar) {
        viewGroup.setTag(C3261t.f5148e, vVar);
    }

    /* renamed from: a */
    public void m34829a() {
        Runnable runnable;
        if (m34828b(this.f5152a) == this && (runnable = this.f5153b) != null) {
            runnable.run();
        }
    }
}
