package androidx.viewpager2.widget;

import androidx.viewpager2.widget.C3313f;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* renamed from: androidx.viewpager2.widget.b */
/* loaded from: classes.dex */
final class C3308b extends C3313f.AbstractC3321i {

    /* renamed from: a */
    private final List<C3313f.AbstractC3321i> f5293a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3308b(int i) {
        this.f5293a = new ArrayList(i);
    }

    /* renamed from: e */
    private void m34698e(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.C3313f.AbstractC3321i
    /* renamed from: a */
    public void mo26100a(int i) {
        try {
            for (C3313f.AbstractC3321i iVar : this.f5293a) {
                iVar.mo26100a(i);
            }
        } catch (ConcurrentModificationException e) {
            m34698e(e);
        }
    }

    @Override // androidx.viewpager2.widget.C3313f.AbstractC3321i
    /* renamed from: b */
    public void mo26099b(int i, float f, int i2) {
        try {
            for (C3313f.AbstractC3321i iVar : this.f5293a) {
                iVar.mo26099b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m34698e(e);
        }
    }

    @Override // androidx.viewpager2.widget.C3313f.AbstractC3321i
    /* renamed from: c */
    public void mo26098c(int i) {
        try {
            for (C3313f.AbstractC3321i iVar : this.f5293a) {
                iVar.mo26098c(i);
            }
        } catch (ConcurrentModificationException e) {
            m34698e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m34699d(C3313f.AbstractC3321i iVar) {
        this.f5293a.add(iVar);
    }
}
