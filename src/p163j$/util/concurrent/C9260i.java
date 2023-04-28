package p163j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.i */
/* loaded from: classes2.dex */
public final class C9260i extends AbstractC0482b implements Iterator, Enumeration, p163j$.util.Iterator {

    /* renamed from: k */
    public final /* synthetic */ int f20330k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9260i(C9264m[] mVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap, int i3) {
        super(mVarArr, i, i2, concurrentHashMap);
        this.f20330k = i3;
    }

    @Override // p163j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.f20330k) {
            case 0:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
            default:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        switch (this.f20330k) {
            case 0:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
            default:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
        }
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final Object next() {
        switch (this.f20330k) {
            case 0:
                C9264m mVar = this.f20345b;
                if (mVar != null) {
                    this.f20325j = mVar;
                    m16570c();
                    return mVar.f20337b;
                }
                throw new NoSuchElementException();
            default:
                C9264m mVar2 = this.f20345b;
                if (mVar2 != null) {
                    Object obj = mVar2.f20338c;
                    this.f20325j = mVar2;
                    m16570c();
                    return obj;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f20330k) {
            case 0:
                return next();
            default:
                return next();
        }
    }
}
