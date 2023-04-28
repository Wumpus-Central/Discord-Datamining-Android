package p163j$.util.stream;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.Arrays;
import java.util.Iterator;
import p163j$.util.Spliterator;
import p163j$.util.Spliterators;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.K2 */
/* loaded from: classes2.dex */
public class C9363K2 extends AbstractC9379O2 implements IntConsumer {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9363K2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9363K2(int i) {
        super(i);
    }

    @Override // p163j$.util.function.IntConsumer
    public void accept(int i) {
        m16449t();
        int i2 = this.f20641b;
        this.f20641b = i2 + 1;
        ((int[]) this.f20538e)[i2] = i;
    }

    @Override // p163j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return intConsumer.getClass();
    }

    @Override // p163j$.lang.AbstractC9165a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            mo16341g((IntConsumer) consumer);
        } else if (!AbstractC9347G3.f20498a) {
            mo42183spliterator().forEachRemaining(consumer);
        } else {
            AbstractC9347G3.m16469a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
            throw null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.m16589g(mo42183spliterator());
    }

    @Override // p163j$.util.stream.AbstractC9379O2
    public final Object newArray(int i) {
        return new int[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p163j$.util.stream.AbstractC9379O2
    /* renamed from: o */
    public final void mo16454o(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i < i2) {
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p163j$.util.stream.AbstractC9379O2
    /* renamed from: p */
    public final int mo16453p(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // p163j$.util.stream.AbstractC9379O2
    /* renamed from: s */
    protected final Object[] mo16450s() {
        return new int[8];
    }

    public final String toString() {
        int[] iArr = (int[]) mo16343b();
        return iArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f20642c), Arrays.toString(iArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f20642c), Arrays.toString(Arrays.copyOf(iArr, (int) ItemTouchHelper.AbstractC3083c.DEFAULT_DRAG_ANIMATION_DURATION)));
    }

    /* renamed from: u */
    public Spliterator.OfInt mo42183spliterator() {
        return new C9359J2(this, 0, this.f20642c, 0, this.f20641b);
    }
}
