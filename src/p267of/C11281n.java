package p267of;

import ag.AbstractC1385a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0004H\u0096\u0002R \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m15073d2 = {"Lof/n;", "T", "", "Lof/m;", "", "iterator", "Lkotlin/Function0;", "k", "Lkotlin/jvm/functions/Function0;", "iteratorFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: of.n */
/* loaded from: classes8.dex */
public final class C11281n<T> implements Iterable<C11280m<? extends T>>, AbstractC1385a {

    /* renamed from: k */
    private final Function0<Iterator<T>> f25205k;

    /* JADX WARN: Multi-variable type inference failed */
    public C11281n(Function0<? extends Iterator<? extends T>> iteratorFactory) {
        C9971q.m14633g(iteratorFactory, "iteratorFactory");
        this.f25205k = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator<C11280m<T>> iterator() {
        return new C11282o(this.f25205k.invoke());
    }
}
