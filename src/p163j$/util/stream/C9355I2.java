package p163j$.util.stream;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.Arrays;
import java.util.Iterator;
import p163j$.util.AbstractC9447y;
import p163j$.util.Spliterators;
import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.I2 */
/* loaded from: classes2.dex */
public class C9355I2 extends AbstractC9379O2 implements AbstractC0494i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9355I2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9355I2(int i) {
        super(i);
    }

    @Override // p163j$.util.function.AbstractC0494i
    public void accept(double d) {
        m16449t();
        int i = this.f20641b;
        this.f20641b = i + 1;
        ((double[]) this.f20538e)[i] = d;
    }

    @Override // p163j$.lang.AbstractC9165a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof AbstractC0494i) {
            mo16341g((AbstractC0494i) consumer);
        } else if (!AbstractC9347G3.f20498a) {
            mo42183spliterator().forEachRemaining(consumer);
        } else {
            AbstractC9347G3.m16469a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.m16590f(mo42183spliterator());
    }

    @Override // p163j$.util.stream.AbstractC9379O2
    public final Object newArray(int i) {
        return new double[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p163j$.util.stream.AbstractC9379O2
    /* renamed from: o */
    public final void mo16454o(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        AbstractC0494i iVar = (AbstractC0494i) obj2;
        while (i < i2) {
            iVar.accept(dArr[i]);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p163j$.util.stream.AbstractC9379O2
    /* renamed from: p */
    public final int mo16453p(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // p163j$.util.stream.AbstractC9379O2
    /* renamed from: s */
    protected final Object[] mo16450s() {
        return new double[8];
    }

    public final String toString() {
        double[] dArr = (double[]) mo16343b();
        return dArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f20642c), Arrays.toString(dArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f20642c), Arrays.toString(Arrays.copyOf(dArr, (int) ItemTouchHelper.AbstractC3083c.DEFAULT_DRAG_ANIMATION_DURATION)));
    }

    /* renamed from: u */
    public AbstractC9447y mo42183spliterator() {
        return new C9351H2(this, 0, this.f20642c, 0, this.f20641b);
    }
}
