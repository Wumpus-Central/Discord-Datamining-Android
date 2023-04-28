package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.f1 */
/* loaded from: classes.dex */
class C1665f1 {

    /* renamed from: a */
    private int f1320a = 0;

    /* renamed from: b */
    private int f1321b = 0;

    /* renamed from: c */
    private int f1322c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1323d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1324e = 0;

    /* renamed from: f */
    private int f1325f = 0;

    /* renamed from: g */
    private boolean f1326g = false;

    /* renamed from: h */
    private boolean f1327h = false;

    /* renamed from: a */
    public int m40249a() {
        return this.f1326g ? this.f1320a : this.f1321b;
    }

    /* renamed from: b */
    public int m40248b() {
        return this.f1320a;
    }

    /* renamed from: c */
    public int m40247c() {
        return this.f1321b;
    }

    /* renamed from: d */
    public int m40246d() {
        return this.f1326g ? this.f1321b : this.f1320a;
    }

    /* renamed from: e */
    public void m40245e(int i, int i2) {
        this.f1327h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1324e = i;
            this.f1320a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1325f = i2;
            this.f1321b = i2;
        }
    }

    /* renamed from: f */
    public void m40244f(boolean z) {
        if (z != this.f1326g) {
            this.f1326g = z;
            if (!this.f1327h) {
                this.f1320a = this.f1324e;
                this.f1321b = this.f1325f;
            } else if (z) {
                int i = this.f1323d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f1324e;
                }
                this.f1320a = i;
                int i2 = this.f1322c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f1325f;
                }
                this.f1321b = i2;
            } else {
                int i3 = this.f1322c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f1324e;
                }
                this.f1320a = i3;
                int i4 = this.f1323d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f1325f;
                }
                this.f1321b = i4;
            }
        }
    }

    /* renamed from: g */
    public void m40243g(int i, int i2) {
        this.f1322c = i;
        this.f1323d = i2;
        this.f1327h = true;
        if (this.f1326g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1320a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1321b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1320a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1321b = i2;
        }
    }
}
