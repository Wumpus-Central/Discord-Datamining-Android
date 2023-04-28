package p391w0;

/* renamed from: w0.f */
/* loaded from: classes.dex */
class C13718f<T> implements AbstractC13717e<T> {

    /* renamed from: a */
    private final Object[] f30655a;

    /* renamed from: b */
    private int f30656b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13718f(int i) {
        if (i > 0) {
            this.f30655a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // p391w0.AbstractC13717e
    /* renamed from: a */
    public void mo2899a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f30656b;
            Object[] objArr = this.f30655a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f30656b = i3 + 1;
            }
        }
    }

    @Override // p391w0.AbstractC13717e
    public T acquire() {
        int i = this.f30656b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f30655a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f30656b = i - 1;
        return t;
    }

    @Override // p391w0.AbstractC13717e
    public boolean release(T t) {
        int i = this.f30656b;
        Object[] objArr = this.f30655a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f30656b = i + 1;
        return true;
    }
}
