package p121gj;

/* renamed from: gj.a */
/* loaded from: classes8.dex */
class C7697a {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m21639a(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static double m21638b(double d) {
        while (Double.compare(0.0d, d) > 0) {
            d += 360.0d;
        }
        while (Double.compare(d, 360.0d) >= 0) {
            d -= 360.0d;
        }
        return d;
    }
}
