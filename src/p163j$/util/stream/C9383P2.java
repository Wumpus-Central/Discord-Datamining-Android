package p163j$.util.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p163j$.lang.AbstractC9165a;
import p163j$.util.Spliterator;
import p163j$.util.Spliterators;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.P2 */
/* loaded from: classes2.dex */
public class C9383P2 extends AbstractC0543e implements Consumer, Iterable, AbstractC9165a {

    /* renamed from: e */
    protected Object[] f20544e = new Object[1 << 4];

    /* renamed from: f */
    protected Object[][] f20545f;

    @Override // p163j$.util.function.Consumer
    public void accept(Object obj) {
        long j;
        int i = this.f20641b;
        Object[] objArr = this.f20544e;
        if (i == objArr.length) {
            if (this.f20545f == null) {
                Object[][] objArr2 = new Object[8];
                this.f20545f = objArr2;
                this.f20643d = new long[8];
                objArr2[0] = objArr;
            }
            int i2 = this.f20642c;
            int i3 = i2 + 1;
            Object[][] objArr3 = this.f20545f;
            if (i3 >= objArr3.length || objArr3[i3] == null) {
                if (i2 == 0) {
                    j = objArr.length;
                } else {
                    j = objArr3[i2].length + this.f20643d[i2];
                }
                m16447o(j + 1);
            }
            this.f20641b = 0;
            int i4 = this.f20642c + 1;
            this.f20642c = i4;
            this.f20544e = this.f20545f[i4];
        }
        Object[] objArr4 = this.f20544e;
        int i5 = this.f20641b;
        this.f20641b = i5 + 1;
        objArr4[i5] = obj;
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }

    @Override // p163j$.util.stream.AbstractC0543e
    public final void clear() {
        Object[][] objArr = this.f20545f;
        if (objArr != null) {
            this.f20544e = objArr[0];
            int i = 0;
            while (true) {
                Object[] objArr2 = this.f20544e;
                if (i >= objArr2.length) {
                    break;
                }
                objArr2[i] = null;
                i++;
            }
            this.f20545f = null;
            this.f20643d = null;
        } else {
            for (int i2 = 0; i2 < this.f20641b; i2++) {
                this.f20544e[i2] = null;
            }
        }
        this.f20641b = 0;
        this.f20642c = 0;
    }

    @Override // p163j$.lang.AbstractC9165a
    public void forEach(Consumer consumer) {
        for (int i = 0; i < this.f20642c; i++) {
            for (Object obj : this.f20545f[i]) {
                consumer.accept(obj);
            }
        }
        for (int i2 = 0; i2 < this.f20641b; i2++) {
            consumer.accept(this.f20544e[i2]);
        }
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.m16587i(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final void m16447o(long j) {
        long j2;
        Object[][] objArr;
        int i;
        int i2 = this.f20642c;
        if (i2 == 0) {
            j2 = this.f20544e.length;
        } else {
            j2 = this.f20545f[i2].length + this.f20643d[i2];
        }
        if (j > j2) {
            if (this.f20545f == null) {
                Object[][] objArr2 = new Object[8];
                this.f20545f = objArr2;
                this.f20643d = new long[8];
                objArr2[0] = this.f20544e;
            }
            while (true) {
                i2++;
                if (j > j2) {
                    Object[][] objArr3 = this.f20545f;
                    if (i2 >= objArr3.length) {
                        int length = objArr3.length * 2;
                        this.f20545f = (Object[][]) Arrays.copyOf(objArr3, length);
                        this.f20643d = Arrays.copyOf(this.f20643d, length);
                    }
                    int i3 = this.f20640a;
                    if (!(i2 == 0 || i2 == 1)) {
                        i3 = Math.min((i3 + i2) - 1, 30);
                    }
                    int i4 = 1 << i3;
                    this.f20545f[i2] = new Object[i4];
                    long[] jArr = this.f20643d;
                    jArr[i2] = jArr[i2 - 1] + objArr[i].length;
                    j2 += i4;
                } else {
                    return;
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public Spliterator spliterator() {
        return new C9346G2(this, 0, this.f20642c, 0, this.f20641b);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        forEach(new C0523a(8, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }
}
