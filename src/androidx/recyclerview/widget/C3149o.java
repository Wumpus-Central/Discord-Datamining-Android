package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: classes.dex */
class C3149o {

    /* renamed from: a */
    final AbstractC3151b f4879a;

    /* renamed from: b */
    C3150a f4880b = new C3150a();

    /* renamed from: androidx.recyclerview.widget.o$a */
    /* loaded from: classes.dex */
    static class C3150a {

        /* renamed from: a */
        int f4881a = 0;

        /* renamed from: b */
        int f4882b;

        /* renamed from: c */
        int f4883c;

        /* renamed from: d */
        int f4884d;

        /* renamed from: e */
        int f4885e;

        C3150a() {
        }

        /* renamed from: a */
        void m35070a(int i) {
            this.f4881a = i | this.f4881a;
        }

        /* renamed from: b */
        boolean m35069b() {
            int i = this.f4881a;
            if ((i & 7) != 0 && (i & (m35068c(this.f4884d, this.f4882b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f4881a;
            if ((i2 & 112) != 0 && (i2 & (m35068c(this.f4884d, this.f4883c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f4881a;
            if ((i3 & 1792) != 0 && (i3 & (m35068c(this.f4885e, this.f4882b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f4881a;
            if ((i4 & 28672) == 0 || (i4 & (m35068c(this.f4885e, this.f4883c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        int m35068c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* renamed from: d */
        void m35067d() {
            this.f4881a = 0;
        }

        /* renamed from: e */
        void m35066e(int i, int i2, int i3, int i4) {
            this.f4882b = i;
            this.f4883c = i2;
            this.f4884d = i3;
            this.f4885e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$b */
    /* loaded from: classes.dex */
    interface AbstractC3151b {
        /* renamed from: a */
        int mo35065a(View view);

        /* renamed from: b */
        int mo35064b();

        /* renamed from: c */
        int mo35063c();

        /* renamed from: d */
        int mo35062d(View view);

        View getChildAt(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3149o(AbstractC3151b bVar) {
        this.f4879a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public View m35072a(int i, int i2, int i3, int i4) {
        int i5;
        int b = this.f4879a.mo35064b();
        int c = this.f4879a.mo35063c();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View childAt = this.f4879a.getChildAt(i);
            this.f4880b.m35066e(b, c, this.f4879a.mo35065a(childAt), this.f4879a.mo35062d(childAt));
            if (i3 != 0) {
                this.f4880b.m35067d();
                this.f4880b.m35070a(i3);
                if (this.f4880b.m35069b()) {
                    return childAt;
                }
            }
            if (i4 != 0) {
                this.f4880b.m35067d();
                this.f4880b.m35070a(i4);
                if (this.f4880b.m35069b()) {
                    view = childAt;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m35071b(View view, int i) {
        this.f4880b.m35066e(this.f4879a.mo35064b(), this.f4879a.mo35063c(), this.f4879a.mo35065a(view), this.f4879a.mo35062d(view));
        if (i == 0) {
            return false;
        }
        this.f4880b.m35067d();
        this.f4880b.m35070a(i);
        return this.f4880b.m35069b();
    }
}
