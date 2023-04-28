package androidx.core.view;

import ag.AbstractC1385a;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.sequences.Sequence;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

@Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0086\u0002\"\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m15073d2 = {"Landroid/view/ViewGroup;", "", "Landroid/view/View;", "b", "Lkotlin/sequences/Sequence;", "a", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "children", "core-ktx_release"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: androidx.core.view.k2 */
/* loaded from: classes.dex */
public final class C2655k2 {

    @Metadata(m15074d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¨\u0006\u0005"}, m15073d2 = {"androidx/core/view/k2$a", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "", "iterator", "core-ktx_release"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: androidx.core.view.k2$a */
    /* loaded from: classes.dex */
    public static final class C2656a implements Sequence<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3597a;

        C2656a(ViewGroup viewGroup) {
            this.f3597a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<View> iterator() {
            return C2655k2.m37221b(this.f3597a);
        }
    }

    @Metadata(m15074d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, m15073d2 = {"androidx/core/view/k2$b", "", "Landroid/view/View;", "", "hasNext", "b", "", "remove", "", "k", "I", "index", "core-ktx_release"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: androidx.core.view.k2$b */
    /* loaded from: classes.dex */
    public static final class C2657b implements Iterator<View>, AbstractC1385a, p163j$.util.Iterator {

        /* renamed from: k */
        private int f3598k;

        /* renamed from: l */
        final /* synthetic */ ViewGroup f3599l;

        C2657b(ViewGroup viewGroup) {
            this.f3599l = viewGroup;
        }

        /* renamed from: b */
        public View next() {
            ViewGroup viewGroup = this.f3599l;
            int i = this.f3598k;
            this.f3598k = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super View> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f3598k < this.f3599l.getChildCount();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f3599l;
            int i = this.f3598k - 1;
            this.f3598k = i;
            viewGroup.removeViewAt(i);
        }
    }

    /* renamed from: a */
    public static final Sequence<View> m37222a(ViewGroup viewGroup) {
        C9971q.m14633g(viewGroup, "<this>");
        return new C2656a(viewGroup);
    }

    /* renamed from: b */
    public static final java.util.Iterator<View> m37221b(ViewGroup viewGroup) {
        C9971q.m14633g(viewGroup, "<this>");
        return new C2657b(viewGroup);
    }
}
