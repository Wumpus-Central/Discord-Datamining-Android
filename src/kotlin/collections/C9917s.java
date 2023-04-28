package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p267of.AbstractC11272e;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0006J \u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m15073d2 = {"Lkotlin/collections/s;", "T", "Lof/e;", "", "index", "get", "(I)Ljava/lang/Object;", "", "clear", "b", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "add", "(ILjava/lang/Object;)V", "", "k", "Ljava/util/List;", "delegate", "a", "()I", "size", "<init>", "(Ljava/util/List;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlin.collections.s */
/* loaded from: classes8.dex */
public final class C9917s<T> extends AbstractC11272e<T> {

    /* renamed from: k */
    private final List<T> f22056k;

    public C9917s(List<T> delegate) {
        C9971q.m14633g(delegate, "delegate");
        this.f22056k = delegate;
    }

    @Override // p267of.AbstractC11272e
    /* renamed from: a */
    public int mo9139a() {
        return this.f22056k.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        int I;
        List<T> list = this.f22056k;
        I = C9912p.m14794I(this, i);
        list.add(I, t);
    }

    @Override // p267of.AbstractC11272e
    /* renamed from: b */
    public T mo9138b(int i) {
        int H;
        List<T> list = this.f22056k;
        H = C9912p.m14795H(this, i);
        return list.remove(H);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f22056k.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        int H;
        List<T> list = this.f22056k;
        H = C9912p.m14795H(this, i);
        return list.get(H);
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        int H;
        List<T> list = this.f22056k;
        H = C9912p.m14795H(this, i);
        return list.set(H, t);
    }
}
