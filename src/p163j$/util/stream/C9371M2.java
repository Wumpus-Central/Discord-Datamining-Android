package p163j$.util.stream;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.Arrays;
import java.util.Iterator;
import p163j$.util.AbstractC9234B;
import p163j$.util.Spliterators;
import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.M2 */
/* loaded from: classes2.dex */
public class C9371M2 extends AbstractC9379O2 implements AbstractC9290M {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9371M2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9371M2(int i) {
        super(i);
    }

    @Override // p163j$.util.function.AbstractC9290M
    public void accept(long j) {
        m16449t();
        int i = this.f20641b;
        this.f20641b = i + 1;
        ((long[]) this.f20538e)[i] = j;
    }

    @Override // p163j$.lang.AbstractC9165a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof AbstractC9290M) {
            mo16341g((AbstractC9290M) consumer);
        } else if (!AbstractC9347G3.f20498a) {
            mo42183spliterator().forEachRemaining(consumer);
        } else {
            AbstractC9347G3.m16469a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            throw null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.m16588h(mo42183spliterator());
    }

    @Override // p163j$.util.stream.AbstractC9379O2
    public final Object newArray(int i) {
        return new long[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p163j$.util.stream.AbstractC9379O2
    /* renamed from: o */
    public final void mo16454o(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        AbstractC9290M m = (AbstractC9290M) obj2;
        while (i < i2) {
            m.accept(jArr[i]);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p163j$.util.stream.AbstractC9379O2
    /* renamed from: p */
    public final int mo16453p(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // p163j$.util.stream.AbstractC9379O2
    /* renamed from: s */
    protected final Object[] mo16450s() {
        return new long[8];
    }

    public final String toString() {
        long[] jArr = (long[]) mo16343b();
        return jArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f20642c), Arrays.toString(jArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f20642c), Arrays.toString(Arrays.copyOf(jArr, (int) ItemTouchHelper.AbstractC3083c.DEFAULT_DRAG_ANIMATION_DURATION)));
    }

    /* renamed from: u */
    public AbstractC9234B mo42183spliterator() {
        return new C9367L2(this, 0, this.f20642c, 0, this.f20641b);
    }
}
