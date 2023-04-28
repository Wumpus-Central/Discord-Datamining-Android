package p090f;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p090f.C6974b;

@SuppressLint({"RestrictedAPI"})
/* renamed from: f.d */
/* loaded from: classes.dex */
class C6979d extends C6974b {

    /* renamed from: w */
    private C6980a f15258w;

    /* renamed from: x */
    private boolean f15259x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f.d$a */
    /* loaded from: classes.dex */
    public static class C6980a extends C6974b.AbstractC6977d {

        /* renamed from: J */
        int[][] f38330J;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C6980a(C6980a aVar, C6979d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f38330J = aVar.f38330J;
            } else {
                this.f38330J = new int[m23768f()];
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: A */
        public int m23744A(int[] iArr) {
            int[][] iArr2 = this.f38330J;
            int h = m23766h();
            for (int i = 0; i < h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C6979d(this, null);
        }

        @Override // p090f.C6974b.AbstractC6977d
        /* renamed from: o */
        public void mo23743o(int i, int i2) {
            super.mo23743o(i, i2);
            int[][] iArr = new int[i2];
            System.arraycopy(this.f38330J, 0, iArr, 0, i);
            this.f38330J = iArr;
        }

        @Override // p090f.C6974b.AbstractC6977d
        /* renamed from: r */
        void mo23742r() {
            int[] iArr;
            int[][] iArr2 = this.f38330J;
            int[][] iArr3 = new int[iArr2.length];
            for (int length = iArr2.length - 1; length >= 0; length--) {
                int[] iArr4 = this.f38330J[length];
                if (iArr4 != null) {
                    iArr = (int[]) iArr4.clone();
                } else {
                    iArr = null;
                }
                iArr3[length] = iArr;
            }
            this.f38330J = iArr3;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z */
        public int m23741z(int[] iArr, Drawable drawable) {
            int a = m23773a(drawable);
            this.f38330J[a] = iArr;
            return a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C6979d(this, resources);
        }
    }

    C6979d(C6980a aVar, Resources resources) {
        mo23747h(new C6980a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // p090f.C6974b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p090f.C6974b
    /* renamed from: h */
    public void mo23747h(C6974b.AbstractC6977d dVar) {
        super.mo23747h(dVar);
        if (dVar instanceof C6980a) {
            this.f15258w = (C6980a) dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C6980a mo23748b() {
        return new C6980a(this.f15258w, this, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] m23745k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @Override // p090f.C6974b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f15259x && super.mutate() == this) {
            this.f15258w.mo23742r();
            this.f15259x = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p090f.C6974b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.f15258w.m23744A(iArr);
        if (A < 0) {
            A = this.f15258w.m23744A(StateSet.WILD_CARD);
        }
        if (m23780g(A) || onStateChange) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6979d(C6980a aVar) {
        if (aVar != null) {
            mo23747h(aVar);
        }
    }
}
