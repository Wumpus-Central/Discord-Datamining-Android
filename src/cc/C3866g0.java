package cc;

import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;
import p163j$.lang.Iterable$EL;
import p163j$.util.Set;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.g0 */
/* loaded from: classes3.dex */
public final class C3866g0<E extends Enum<E>> extends AbstractC3960w0<E> {

    /* renamed from: l */
    private final transient EnumSet<E> f6405l;

    /* renamed from: m */
    private transient int f6406m;

    private C3866g0(EnumSet<E> enumSet) {
        this.f6405l = enumSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static AbstractC3960w0 m33439B(EnumSet enumSet) {
        int size = enumSet.size();
        if (size == 0) {
            return AbstractC3960w0.m33256x();
        }
        if (size != 1) {
            return new C3866g0(enumSet);
        }
        return AbstractC3960w0.m33255y(C3976z0.m33213e(enumSet));
    }

    @Override // cc.AbstractC3837d0, java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public boolean contains(Object obj) {
        return this.f6405l.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof C3866g0) {
            collection = ((C3866g0) collection).f6405l;
        }
        return this.f6405l.containsAll(collection);
    }

    @Override // cc.AbstractC3960w0, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3866g0) {
            obj = ((C3866g0) obj).f6405l;
        }
        return this.f6405l.equals(obj);
    }

    @Override // cc.AbstractC3837d0, p163j$.util.Collection, p163j$.lang.AbstractC9165a
    public void forEach(Consumer<? super E> consumer) {
        Iterable$EL.forEach(this.f6405l, consumer);
    }

    @Override // cc.AbstractC3837d0, java.lang.Iterable
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // cc.AbstractC3960w0, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public int hashCode() {
        int i = this.f6406m;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f6405l.hashCode();
        this.f6406m = hashCode;
        return hashCode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: i */
    public boolean mo33222i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public boolean isEmpty() {
        return this.f6405l.isEmpty();
    }

    @Override // cc.AbstractC3960w0, cc.AbstractC3837d0
    /* renamed from: j */
    public AbstractC3868g2<E> iterator() {
        return C3818a1.m33521q(this.f6405l.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public int size() {
        return this.f6405l.size();
    }

    @Override // cc.AbstractC3837d0, java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public Spliterator<E> spliterator() {
        return Set.EL.spliterator(this.f6405l);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.f6405l.toString();
    }

    @Override // cc.AbstractC3960w0
    /* renamed from: w */
    boolean mo33239w() {
        return true;
    }
}
