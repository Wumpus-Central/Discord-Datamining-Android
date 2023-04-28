package p163j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.b */
/* loaded from: classes2.dex */
public abstract class AbstractC0482b extends C9268q {

    /* renamed from: i */
    final ConcurrentHashMap f20324i;

    /* renamed from: j */
    C9264m f20325j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0482b(C9264m[] mVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i, 0, i2);
        this.f20324i = concurrentHashMap;
        m16570c();
    }

    public final boolean hasMoreElements() {
        return this.f20345b != null;
    }

    public final boolean hasNext() {
        return this.f20345b != null;
    }

    public final void remove() {
        C9264m mVar = this.f20325j;
        if (mVar != null) {
            this.f20325j = null;
            this.f20324i.replaceNode(mVar.f20337b, null, null);
            return;
        }
        throw new IllegalStateException();
    }
}
