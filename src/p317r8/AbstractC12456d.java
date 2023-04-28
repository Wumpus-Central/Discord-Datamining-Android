package p317r8;

import java.nio.ByteBuffer;
import p119g9.C7510a;
import p152i7.AbstractC8226j;
import p152i7.AbstractC8228k;
import p163j$.util.Spliterator;

/* renamed from: r8.d */
/* loaded from: classes7.dex */
public abstract class AbstractC12456d extends AbstractC8228k<C12463j, AbstractC12464k, C12460h> implements AbstractC12459g {

    /* renamed from: n */
    private final String f28112n;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12456d(String str) {
        super(new C12463j[2], new AbstractC12464k[2]);
        this.f28112n = str;
        m20267u(Spliterator.IMMUTABLE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public final C12460h mo6673j(C12463j jVar, AbstractC12464k kVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C7510a.m22367e(jVar.f17798m);
            kVar.m6666o(jVar.f17800o, mo154z(byteBuffer.array(), byteBuffer.limit(), z), jVar.f28115s);
            kVar.m20303g(Integer.MIN_VALUE);
            return null;
        } catch (C12460h e) {
            return e;
        }
    }

    @Override // p317r8.AbstractC12459g
    /* renamed from: a */
    public void mo5335a(long j) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final C12463j mo6676g() {
        return new C12463j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public final AbstractC12464k mo6675h() {
        return new C12457e(new AbstractC8226j.AbstractC8227a() { // from class: r8.c
            @Override // p152i7.AbstractC8226j.AbstractC8227a
            /* renamed from: a */
            public final void mo5336a(AbstractC8226j jVar) {
                AbstractC12456d.this.m20270r((AbstractC12464k) jVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final C12460h mo6674i(Throwable th2) {
        return new C12460h("Unexpected decode error", th2);
    }

    /* renamed from: z */
    protected abstract AbstractC12458f mo154z(byte[] bArr, int i, boolean z);
}
