package p267of;

import ag.AbstractC1385a;
import java.util.Iterator;
import kotlin.Metadata;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\f\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m15073d2 = {"Lof/g;", "", "", "b", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: of.g */
/* loaded from: classes8.dex */
public abstract class AbstractC11274g implements Iterator<Character>, AbstractC1385a, p163j$.util.Iterator {
    /* renamed from: b */
    public abstract char mo10298b();

    @Override // p163j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Character> consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(mo10298b());
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
