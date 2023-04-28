package cc;

import java.util.NoSuchElementException;
import p030bc.C3457i;

/* renamed from: cc.b */
/* loaded from: classes3.dex */
public abstract class AbstractC3824b<T> extends AbstractC3868g2<T> {

    /* renamed from: k */
    private EnumC0098b f6344k = EnumC0098b.NOT_READY;

    /* renamed from: l */
    private T f6345l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.b$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C3825a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6346a;

        static {
            int[] iArr = new int[EnumC0098b.values().length];
            f6346a = iArr;
            try {
                iArr[EnumC0098b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6346a[EnumC0098b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cc.b$b */
    /* loaded from: classes3.dex */
    public enum EnumC0098b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: d */
    private boolean m33518d() {
        this.f6344k = EnumC0098b.FAILED;
        this.f6345l = mo33504b();
        if (this.f6344k == EnumC0098b.DONE) {
            return false;
        }
        this.f6344k = EnumC0098b.READY;
        return true;
    }

    /* renamed from: b */
    protected abstract T mo33504b();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final T m33519c() {
        this.f6344k = EnumC0098b.DONE;
        return null;
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final boolean hasNext() {
        boolean z;
        if (this.f6344k != EnumC0098b.FAILED) {
            z = true;
        } else {
            z = false;
        }
        C3457i.m34347n(z);
        int i = C3825a.f6346a[this.f6344k.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m33518d();
        }
        return true;
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f6344k = EnumC0098b.NOT_READY;
            T t = (T) C3931p1.m33321a(this.f6345l);
            this.f6345l = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
