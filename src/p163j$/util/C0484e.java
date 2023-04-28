package p163j$.util;

import p163j$.util.function.AbstractC0494i;

/* renamed from: j$.util.e */
/* loaded from: classes2.dex */
public final class C0484e implements AbstractC0494i {

    /* renamed from: a */
    private double f20375a;

    /* renamed from: b */
    private double f20376b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    /* renamed from: a */
    public final void m16553a(C0484e eVar) {
        this.count += eVar.count;
        this.f20376b += eVar.f20376b;
        double d = eVar.sum - this.f20375a;
        double d2 = this.sum;
        double d3 = d2 + d;
        double d4 = (d3 - d2) - d;
        this.f20375a = d4;
        double d5 = eVar.f20375a - d4;
        double d6 = d3 + d5;
        this.f20375a = (d6 - d3) - d5;
        this.sum = d6;
        this.min = Math.min(this.min, eVar.min);
        this.max = Math.max(this.max, eVar.max);
    }

    @Override // p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        this.count++;
        this.f20376b += d;
        double d2 = d - this.f20375a;
        double d3 = this.sum;
        double d4 = d3 + d2;
        this.f20375a = (d4 - d3) - d2;
        this.sum = d4;
        this.min = Math.min(this.min, d);
        this.max = Math.max(this.max, d);
    }

    public final String toString() {
        double d;
        Object[] objArr = new Object[6];
        objArr[0] = C0484e.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        double d2 = this.sum + this.f20375a;
        if (Double.isNaN(d2) && Double.isInfinite(this.f20376b)) {
            d2 = this.f20376b;
        }
        objArr[2] = Double.valueOf(d2);
        objArr[3] = Double.valueOf(this.min);
        if (this.count > 0) {
            double d3 = this.sum + this.f20375a;
            if (Double.isNaN(d3) && Double.isInfinite(this.f20376b)) {
                d3 = this.f20376b;
            }
            d = d3 / this.count;
        } else {
            d = 0.0d;
        }
        objArr[4] = Double.valueOf(d);
        objArr[5] = Double.valueOf(this.max);
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", objArr);
    }
}
