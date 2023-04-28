package p365u9;

import java.lang.ref.WeakReference;

/* renamed from: u9.v */
/* loaded from: classes5.dex */
abstract class AbstractBinderC13236v extends AbstractBinderC13234t {

    /* renamed from: c */
    private static final WeakReference<byte[]> f29707c = new WeakReference<>(null);

    /* renamed from: b */
    private WeakReference<byte[]> f29708b = f29707c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractBinderC13236v(byte[] bArr) {
        super(bArr);
    }

    @Override // p365u9.AbstractBinderC13234t
    /* renamed from: e */
    final byte[] mo4252e() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f29708b.get();
            if (bArr == null) {
                bArr = mo4251e0();
                this.f29708b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: e0 */
    protected abstract byte[] mo4251e0();
}
