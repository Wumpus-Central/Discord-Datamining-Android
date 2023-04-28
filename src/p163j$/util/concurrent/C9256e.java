package p163j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.e */
/* loaded from: classes2.dex */
final class C9256e extends AbstractC0482b implements Iterator, p163j$.util.Iterator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9256e(C9264m[] mVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i, i2, concurrentHashMap);
    }

    @Override // p163j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final Object next() {
        C9264m mVar = this.f20345b;
        if (mVar != null) {
            Object obj = mVar.f20337b;
            Object obj2 = mVar.f20338c;
            this.f20325j = mVar;
            m16570c();
            return new C9263l(obj, obj2, this.f20324i);
        }
        throw new NoSuchElementException();
    }
}
