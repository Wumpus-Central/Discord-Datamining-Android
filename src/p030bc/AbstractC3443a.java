package p030bc;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

/* renamed from: bc.a */
/* loaded from: classes3.dex */
abstract class AbstractC3443a<T> implements Iterator<T>, p163j$.util.Iterator {

    /* renamed from: k */
    private EnumC3444b f5580k = EnumC3444b.NOT_READY;

    /* renamed from: l */
    private T f5581l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bc.a$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C0081a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5582a;

        static {
            int[] iArr = new int[EnumC3444b.values().length];
            f5582a = iArr;
            try {
                iArr[EnumC3444b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5582a[EnumC3444b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bc.a$b */
    /* loaded from: classes3.dex */
    public enum EnumC3444b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: d */
    private boolean m34380d() {
        this.f5580k = EnumC3444b.FAILED;
        this.f5581l = mo34336b();
        if (this.f5580k == EnumC3444b.DONE) {
            return false;
        }
        this.f5580k = EnumC3444b.READY;
        return true;
    }

    /* renamed from: b */
    protected abstract T mo34336b();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final T m34381c() {
        this.f5580k = EnumC3444b.DONE;
        return null;
    }

    @Override // p163j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final boolean hasNext() {
        boolean z;
        if (this.f5580k != EnumC3444b.FAILED) {
            z = true;
        } else {
            z = false;
        }
        C3457i.m34347n(z);
        int i = C0081a.f5582a[this.f5580k.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m34380d();
        }
        return true;
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f5580k = EnumC3444b.NOT_READY;
            T t = (T) C3455g.m34363a(this.f5581l);
            this.f5581l = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
