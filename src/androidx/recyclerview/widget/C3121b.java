package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes.dex */
public class C3121b implements AbstractC3137h {

    /* renamed from: a */
    final AbstractC3137h f4796a;

    /* renamed from: b */
    int f4797b = 0;

    /* renamed from: c */
    int f4798c = -1;

    /* renamed from: d */
    int f4799d = -1;

    /* renamed from: e */
    Object f4800e = null;

    public C3121b(AbstractC3137h hVar) {
        this.f4796a = hVar;
    }

    @Override // androidx.recyclerview.widget.AbstractC3137h
    /* renamed from: a */
    public void mo35122a(int i, int i2) {
        int i3;
        if (this.f4797b == 1 && i >= (i3 = this.f4798c)) {
            int i4 = this.f4799d;
            if (i <= i3 + i4) {
                this.f4799d = i4 + i2;
                this.f4798c = Math.min(i, i3);
                return;
            }
        }
        m35170e();
        this.f4798c = i;
        this.f4799d = i2;
        this.f4797b = 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC3137h
    /* renamed from: b */
    public void mo35121b(int i, int i2) {
        int i3;
        if (this.f4797b != 2 || (i3 = this.f4798c) < i || i3 > i + i2) {
            m35170e();
            this.f4798c = i;
            this.f4799d = i2;
            this.f4797b = 2;
            return;
        }
        this.f4799d += i2;
        this.f4798c = i;
    }

    @Override // androidx.recyclerview.widget.AbstractC3137h
    /* renamed from: c */
    public void mo35120c(int i, int i2, Object obj) {
        int i3;
        if (this.f4797b == 3) {
            int i4 = this.f4798c;
            int i5 = this.f4799d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f4800e == obj) {
                this.f4798c = Math.min(i, i4);
                this.f4799d = Math.max(i5 + i4, i3) - this.f4798c;
                return;
            }
        }
        m35170e();
        this.f4798c = i;
        this.f4799d = i2;
        this.f4800e = obj;
        this.f4797b = 3;
    }

    @Override // androidx.recyclerview.widget.AbstractC3137h
    /* renamed from: d */
    public void mo35119d(int i, int i2) {
        m35170e();
        this.f4796a.mo35119d(i, i2);
    }

    /* renamed from: e */
    public void m35170e() {
        int i = this.f4797b;
        if (i != 0) {
            if (i == 1) {
                this.f4796a.mo35122a(this.f4798c, this.f4799d);
            } else if (i == 2) {
                this.f4796a.mo35121b(this.f4798c, this.f4799d);
            } else if (i == 3) {
                this.f4796a.mo35120c(this.f4798c, this.f4799d, this.f4800e);
            }
            this.f4800e = null;
            this.f4797b = 0;
        }
    }
}
