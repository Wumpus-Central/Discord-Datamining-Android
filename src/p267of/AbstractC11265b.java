package p267of;

import ag.AbstractC1385a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH$J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\bH\u0004R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m15073d2 = {"Lof/b;", "T", "", "", "g", "hasNext", "next", "()Ljava/lang/Object;", "", "b", "value", "f", "(Ljava/lang/Object;)V", "d", "Lof/a0;", "k", "Lof/a0;", "state", "l", "Ljava/lang/Object;", "nextValue", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: of.b */
/* loaded from: classes8.dex */
public abstract class AbstractC11265b<T> implements Iterator<T>, AbstractC1385a, p163j$.util.Iterator {

    /* renamed from: k */
    private EnumC11264a0 f25189k = EnumC11264a0.NotReady;

    /* renamed from: l */
    private T f25190l;

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: of.b$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C11266a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25191a;

        static {
            int[] iArr = new int[EnumC11264a0.values().length];
            try {
                iArr[EnumC11264a0.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11264a0.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25191a = iArr;
        }
    }

    /* renamed from: g */
    private final boolean m10306g() {
        this.f25189k = EnumC11264a0.Failed;
        mo1701b();
        if (this.f25189k == EnumC11264a0.Ready) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    protected abstract void mo1701b();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final void m10308d() {
        this.f25189k = EnumC11264a0.Done;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final void m10307f(T t) {
        this.f25190l = t;
        this.f25189k = EnumC11264a0.Ready;
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
    public boolean hasNext() {
        boolean z;
        EnumC11264a0 a0Var = this.f25189k;
        if (a0Var != EnumC11264a0.Failed) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = C11266a.f25191a[a0Var.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return m10306g();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public T next() {
        if (hasNext()) {
            this.f25189k = EnumC11264a0.NotReady;
            return this.f25190l;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
