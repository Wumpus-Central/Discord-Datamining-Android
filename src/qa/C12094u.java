package qa;

import java.util.NoSuchElementException;

/* renamed from: qa.u */
/* loaded from: classes3.dex */
final class C12094u extends AbstractC12057b0 {

    /* renamed from: k */
    private boolean f27141k;

    /* renamed from: l */
    private final /* synthetic */ Object f27142l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12094u(Object obj) {
        this.f27142l = obj;
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final boolean hasNext() {
        return !this.f27141k;
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final Object next() {
        if (!this.f27141k) {
            this.f27141k = true;
            return this.f27142l;
        }
        throw new NoSuchElementException();
    }
}
