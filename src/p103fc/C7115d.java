package p103fc;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.RandomAccess;
import p030bc.C3457i;
import p163j$.lang.Iterable$CC;
import p163j$.util.Collection;
import p163j$.util.List;
import p163j$.util.Spliterator;
import p163j$.util.Spliterators;
import p163j$.util.function.Consumer;
import p163j$.util.function.Predicate;
import p163j$.util.function.UnaryOperator;

/* renamed from: fc.d */
/* loaded from: classes3.dex */
public final class C7115d extends AbstractC7117e {

    /* renamed from: fc.d$a */
    /* loaded from: classes3.dex */
    private static class C7116a extends AbstractList<Integer> implements RandomAccess, Serializable, List {

        /* renamed from: k */
        final int[] f15509k;

        /* renamed from: l */
        final int f15510l;

        /* renamed from: m */
        final int f15511m;

        C7116a(int[] iArr, int i, int i2) {
            this.f15509k = iArr;
            this.f15510l = i;
            this.f15511m = i2;
        }

        /* renamed from: a */
        public Integer get(int i) {
            C3457i.m34354g(i, size());
            return Integer.valueOf(this.f15509k[this.f15510l + i]);
        }

        /* renamed from: b */
        public Integer set(int i, Integer num) {
            C3457i.m34354g(i, size());
            int[] iArr = this.f15509k;
            int i2 = this.f15510l;
            int i3 = iArr[i2 + i];
            iArr[i2 + i] = ((Integer) C3457i.m34352i(num)).intValue();
            return Integer.valueOf(i3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, p163j$.util.List, p163j$.util.Collection
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && C7115d.m23361g(this.f15509k, ((Integer) obj).intValue(), this.f15510l, this.f15511m) != -1;
        }

        /* renamed from: e */
        public Spliterator.OfInt spliterator() {
            return Spliterators.spliterator(this.f15509k, this.f15510l, this.f15511m, 0);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List, p163j$.util.List, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7116a)) {
                return super.equals(obj);
            }
            C7116a aVar = (C7116a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f15509k[this.f15510l + i] != aVar.f15509k[aVar.f15510l + i]) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        int[] m23354f() {
            return Arrays.copyOfRange(this.f15509k, this.f15510l, this.f15511m);
        }

        @Override // p163j$.util.Collection, p163j$.lang.AbstractC9165a
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        @Override // java.lang.Iterable
        public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            forEach(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List, p163j$.util.List, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public int hashCode() {
            int i = 1;
            for (int i2 = this.f15510l; i2 < this.f15511m; i2++) {
                i = (i * 31) + C7115d.m23363e(this.f15509k[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List, p163j$.util.List
        public int indexOf(Object obj) {
            int g;
            if (!(obj instanceof Integer) || (g = C7115d.m23361g(this.f15509k, ((Integer) obj).intValue(), this.f15510l, this.f15511m)) < 0) {
                return -1;
            }
            return g - this.f15510l;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, p163j$.util.List, p163j$.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List, p163j$.util.List
        public int lastIndexOf(Object obj) {
            int h;
            if (!(obj instanceof Integer) || (h = C7115d.m23360h(this.f15509k, ((Integer) obj).intValue(), this.f15510l, this.f15511m)) < 0) {
                return -1;
            }
            return h - this.f15510l;
        }

        @Override // p163j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection
        public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
            return removeIf(Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // p163j$.util.List
        public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
            List.CC.$default$replaceAll(this, unaryOperator);
        }

        @Override // java.util.List
        public /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
            replaceAll(UnaryOperator.VivifiedWrapper.convert(unaryOperator));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, p163j$.util.List, p163j$.util.Collection
        public int size() {
            return this.f15511m - this.f15510l;
        }

        @Override // java.util.List, p163j$.util.List
        public /* synthetic */ void sort(Comparator comparator) {
            List.CC.$default$sort(this, comparator);
        }

        @Override // java.util.AbstractList, java.util.List, p163j$.util.List
        public java.util.List<Integer> subList(int i, int i2) {
            C3457i.m34348m(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.f15509k;
            int i3 = this.f15510l;
            return new C7116a(iArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f15509k[this.f15510l]);
            int i = this.f15510l;
            while (true) {
                i++;
                if (i < this.f15511m) {
                    sb2.append(", ");
                    sb2.append(this.f15509k[i]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }
    }

    /* renamed from: c */
    public static int m23365c(long j) {
        boolean z;
        int i = (int) j;
        if (i == j) {
            z = true;
        } else {
            z = false;
        }
        C3457i.m34355f(z, "Out of range: %s", j);
        return i;
    }

    /* renamed from: d */
    public static int m23364d(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: e */
    public static int m23363e(int i) {
        return i;
    }

    /* renamed from: f */
    public static int m23362f(int[] iArr, int i) {
        return m23361g(iArr, i, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static int m23361g(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static int m23360h(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: i */
    public static int m23359i(long j) {
        if (j > 2147483647L) {
            return ViewDefaults.NUMBER_OF_LINES;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: j */
    public static int[] m23358j(java.util.Collection<? extends Number> collection) {
        if (collection instanceof C7116a) {
            return ((C7116a) collection).m23354f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) C3457i.m34352i(array[i])).intValue();
        }
        return iArr;
    }
}
