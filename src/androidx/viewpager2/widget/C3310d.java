package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.C3313f;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.d */
/* loaded from: classes.dex */
final class C3310d extends C3313f.AbstractC3321i {

    /* renamed from: a */
    private final LinearLayoutManager f5297a;

    /* renamed from: b */
    private C3313f.AbstractC3326k f5298b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3310d(LinearLayoutManager linearLayoutManager) {
        this.f5297a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.C3313f.AbstractC3321i
    /* renamed from: a */
    public void mo26100a(int i) {
    }

    @Override // androidx.viewpager2.widget.C3313f.AbstractC3321i
    /* renamed from: b */
    public void mo26099b(int i, float f, int i2) {
        if (this.f5298b != null) {
            float f2 = -f;
            for (int i3 = 0; i3 < this.f5297a.m35477U(); i3++) {
                View T = this.f5297a.m35480T(i3);
                if (T != null) {
                    this.f5298b.mo26095a(T, (this.f5297a.m35446o0(T) - i) + f2);
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.f5297a.m35477U())));
                }
            }
        }
    }

    @Override // androidx.viewpager2.widget.C3313f.AbstractC3321i
    /* renamed from: c */
    public void mo26098c(int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C3313f.AbstractC3326k m34696d() {
        return this.f5298b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m34695e(C3313f.AbstractC3326k kVar) {
        this.f5298b = kVar;
    }
}
