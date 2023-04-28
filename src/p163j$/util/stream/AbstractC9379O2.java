package p163j$.util.stream;

import java.util.Arrays;
import p163j$.lang.AbstractC9165a;
import p163j$.util.Spliterator;

/* renamed from: j$.util.stream.O2 */
/* loaded from: classes2.dex */
abstract class AbstractC9379O2 extends AbstractC0543e implements Iterable, AbstractC9165a {

    /* renamed from: e */
    Object f20538e = newArray(16);

    /* renamed from: f */
    Object[] f20539f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9379O2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9379O2(int i) {
        super(i);
    }

    /* renamed from: b */
    public Object mo16343b() {
        long count = count();
        if (count < 2147483639) {
            Object newArray = newArray((int) count);
            mo16342f(0, newArray);
            return newArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // p163j$.util.stream.AbstractC0543e
    public final void clear() {
        Object[] objArr = this.f20539f;
        if (objArr != null) {
            this.f20538e = objArr[0];
            this.f20539f = null;
            this.f20643d = null;
        }
        this.f20641b = 0;
        this.f20642c = 0;
    }

    /* renamed from: f */
    public void mo16342f(int i, Object obj) {
        long j = i;
        long count = count() + j;
        if (count > mo16453p(obj) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        } else if (this.f20642c == 0) {
            System.arraycopy(this.f20538e, 0, obj, i, this.f20641b);
        } else {
            for (int i2 = 0; i2 < this.f20642c; i2++) {
                Object obj2 = this.f20539f[i2];
                System.arraycopy(obj2, 0, obj, i, mo16453p(obj2));
                i += mo16453p(this.f20539f[i2]);
            }
            int i3 = this.f20641b;
            if (i3 > 0) {
                System.arraycopy(this.f20538e, 0, obj, i, i3);
            }
        }
    }

    /* renamed from: g */
    public void mo16341g(Object obj) {
        for (int i = 0; i < this.f20642c; i++) {
            Object obj2 = this.f20539f[i];
            mo16454o(obj2, 0, mo16453p(obj2), obj);
        }
        mo16454o(this.f20538e, 0, this.f20641b, obj);
    }

    public abstract Object newArray(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public abstract void mo16454o(Object obj, int i, int i2, Object obj2);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public abstract int mo16453p(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public final int m16452q(long j) {
        if (this.f20642c == 0) {
            if (j < this.f20641b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else if (j < count()) {
            for (int i = 0; i <= this.f20642c; i++) {
                if (j < this.f20643d[i] + mo16453p(this.f20539f[i])) {
                    return i;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final void m16451r(long j) {
        long j2;
        int i;
        int i2 = this.f20642c;
        if (i2 == 0) {
            j2 = mo16453p(this.f20538e);
        } else {
            j2 = mo16453p(this.f20539f[i2]) + this.f20643d[i2];
        }
        if (j > j2) {
            if (this.f20539f == null) {
                Object[] s = mo16450s();
                this.f20539f = s;
                this.f20643d = new long[8];
                s[0] = this.f20538e;
            }
            int i3 = this.f20642c;
            while (true) {
                i3++;
                if (j > j2) {
                    Object[] objArr = this.f20539f;
                    if (i3 >= objArr.length) {
                        int length = objArr.length * 2;
                        this.f20539f = Arrays.copyOf(objArr, length);
                        this.f20643d = Arrays.copyOf(this.f20643d, length);
                    }
                    int i4 = this.f20640a;
                    if (!(i3 == 0 || i3 == 1)) {
                        i4 = Math.min((i4 + i3) - 1, 30);
                    }
                    int i5 = 1 << i4;
                    this.f20539f[i3] = newArray(i5);
                    long[] jArr = this.f20643d;
                    jArr[i3] = jArr[i3 - 1] + mo16453p(this.f20539f[i]);
                    j2 += i5;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: s */
    protected abstract Object[] mo16450s();

    /* renamed from: spliterator */
    public abstract Spliterator mo42183spliterator();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final void m16449t() {
        long j;
        if (this.f20641b == mo16453p(this.f20538e)) {
            if (this.f20539f == null) {
                Object[] s = mo16450s();
                this.f20539f = s;
                this.f20643d = new long[8];
                s[0] = this.f20538e;
            }
            int i = this.f20642c;
            int i2 = i + 1;
            Object[] objArr = this.f20539f;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    j = mo16453p(this.f20538e);
                } else {
                    j = mo16453p(objArr[i]) + this.f20643d[i];
                }
                m16451r(j + 1);
            }
            this.f20641b = 0;
            int i3 = this.f20642c + 1;
            this.f20642c = i3;
            this.f20538e = this.f20539f[i3];
        }
    }
}
