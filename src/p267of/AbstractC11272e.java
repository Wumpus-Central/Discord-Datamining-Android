package p267of;

import ag.AbstractC1387c;
import java.util.AbstractList;
import java.util.List;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m15073d2 = {"Lof/e;", "E", "", "Ljava/util/AbstractList;", "", "index", "b", "(I)Ljava/lang/Object;", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: of.e */
/* loaded from: classes8.dex */
public abstract class AbstractC11272e<E> extends AbstractList<E> implements List<E>, AbstractC1387c {
    /* renamed from: a */
    public abstract int mo9139a();

    /* renamed from: b */
    public abstract E mo9138b(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return mo9138b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo9139a();
    }
}
