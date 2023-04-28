package cc;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p030bc.C3457i;
import p163j$.lang.Iterable$CC;
import p163j$.util.Collection;
import p163j$.util.function.Consumer;
import p163j$.util.function.Predicate;
import p163j$.util.stream.Stream;

/* renamed from: cc.b2 */
/* loaded from: classes3.dex */
public final class C3828b2 {

    /* renamed from: cc.b2$a */
    /* loaded from: classes3.dex */
    class C3829a extends AbstractC3831c<E> {

        /* renamed from: k */
        final /* synthetic */ Set f6353k;

        /* renamed from: l */
        final /* synthetic */ Set f6354l;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: cc.b2$a$a */
        /* loaded from: classes3.dex */
        public class C0099a extends AbstractC3824b<E> {

            /* renamed from: m */
            final Iterator<E> f6355m;

            C0099a() {
                this.f6355m = C3829a.this.f6353k.iterator();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4, types: [E, java.lang.Object] */
            /* JADX WARN: Unknown variable types count: 1 */
            @Override // cc.AbstractC3824b
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            protected E mo33504b() {
                /*
                    r2 = this;
                L_0x0000:
                    java.util.Iterator<E> r0 = r2.f6355m
                    boolean r0 = r0.hasNext()
                    if (r0 == 0) goto L_0x0019
                    java.util.Iterator<E> r0 = r2.f6355m
                    java.lang.Object r0 = r0.next()
                    cc.b2$a r1 = cc.C3828b2.C3829a.this
                    java.util.Set r1 = r1.f6354l
                    boolean r1 = r1.contains(r0)
                    if (r1 == 0) goto L_0x0000
                    return r0
                L_0x0019:
                    java.lang.Object r0 = r2.m33519c()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: cc.C3828b2.C3829a.C0099a.mo33504b():java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3829a(Set set, Set set2) {
            super(null);
            this.f6353k = set;
            this.f6354l = set2;
        }

        /* renamed from: a */
        public AbstractC3868g2<E> iterator() {
            return new C0099a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection, java.util.List, p163j$.util.List
        public boolean contains(Object obj) {
            return this.f6353k.contains(obj) && this.f6354l.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return this.f6353k.containsAll(collection) && this.f6354l.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection, java.util.List, p163j$.util.List
        public boolean isEmpty() {
            return Collections.disjoint(this.f6354l, this.f6353k);
        }

        @Override // java.util.Collection, p163j$.util.Collection
        public Stream<E> parallelStream() {
            Stream parallelStream = Collection.EL.parallelStream(this.f6353k);
            Set set = this.f6354l;
            Objects.requireNonNull(set);
            return parallelStream.filter(new C3823a2(set));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection, java.util.List, p163j$.util.List
        public int size() {
            int i = 0;
            for (Object obj : this.f6353k) {
                if (this.f6354l.contains(obj)) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.Collection, p163j$.util.Collection
        public Stream<E> stream() {
            Stream stream = Collection.EL.stream(this.f6353k);
            Set set = this.f6354l;
            Objects.requireNonNull(set);
            return stream.filter(new C3823a2(set));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.b2$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC3830b<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> collection) {
            return C3828b2.m33507g(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> collection) {
            return super.retainAll((java.util.Collection) C3457i.m34352i(collection));
        }
    }

    /* renamed from: cc.b2$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC3831c<E> extends AbstractSet<E> implements p163j$.util.Set {
        /* synthetic */ AbstractC3831c(C3977z1 z1Var) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
        @Deprecated
        public final boolean addAll(java.util.Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // p163j$.util.Collection, p163j$.lang.AbstractC9165a
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        @Override // java.lang.Iterable
        public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            forEach(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
        @Deprecated
        public final boolean removeAll(java.util.Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // p163j$.util.Collection
        @Deprecated
        public final boolean removeIf(Predicate<? super E> predicate) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
            return removeIf(Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
        @Deprecated
        public final boolean retainAll(java.util.Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private AbstractC3831c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m33513a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m33512b(Set<?> set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 = ~(~(i2 + i));
        }
        return i2;
    }

    /* renamed from: c */
    public static <E> AbstractC3831c<E> m33511c(Set<E> set, Set<?> set2) {
        C3457i.m34351j(set, "set1");
        C3457i.m34351j(set2, "set2");
        return new C3829a(set, set2);
    }

    /* renamed from: d */
    public static <E> HashSet<E> m33510d() {
        return new HashSet<>();
    }

    /* renamed from: e */
    public static <E> HashSet<E> m33509e(int i) {
        return new HashSet<>(C3871h1.m33438a(i));
    }

    /* renamed from: f */
    public static <E> Set<E> m33508f() {
        return Collections.newSetFromMap(C3871h1.m33433f());
    }

    /* renamed from: g */
    static boolean m33507g(Set<?> set, java.util.Collection<?> collection) {
        C3457i.m34352i(collection);
        if (collection instanceof AbstractC3920n1) {
            collection = ((AbstractC3920n1) collection).m33341n();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m33506h(set, collection.iterator());
        }
        return C3818a1.m33524n(set.iterator(), collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m33506h(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
