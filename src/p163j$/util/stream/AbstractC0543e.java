package p163j$.util.stream;

/* renamed from: j$.util.stream.e */
/* loaded from: classes2.dex */
abstract class AbstractC0543e {

    /* renamed from: a */
    protected final int f20640a;

    /* renamed from: b */
    protected int f20641b;

    /* renamed from: c */
    protected int f20642c;

    /* renamed from: d */
    protected long[] f20643d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0543e() {
        this.f20640a = 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0543e(int i) {
        if (i >= 0) {
            this.f20640a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
            return;
        }
        throw new IllegalArgumentException("Illegal Capacity: " + i);
    }

    public abstract void clear();

    public final long count() {
        int i = this.f20642c;
        return i == 0 ? this.f20641b : this.f20643d[i] + this.f20641b;
    }
}
