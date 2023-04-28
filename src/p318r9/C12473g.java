package p318r9;

import android.content.Context;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p290q1.AbstractC11961a;
import p384v9.AbstractC13470f;
import p400w9.AbstractC13829j;

/* renamed from: r9.g */
/* loaded from: classes5.dex */
public final class C12473g extends AbstractC11961a implements AbstractC13829j {

    /* renamed from: o */
    private final Semaphore f28134o = new Semaphore(0);

    /* renamed from: p */
    private final Set f28135p;

    public C12473g(Context context, Set set) {
        super(context);
        this.f28135p = set;
    }

    @Override // p290q1.AbstractC11961a
    /* renamed from: A */
    public final /* bridge */ /* synthetic */ Object mo6640A() {
        int i = 0;
        for (AbstractC13470f fVar : this.f28135p) {
            if (fVar.m3613e(this)) {
                i++;
            }
        }
        try {
            this.f28134o.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // p290q1.C11962b
    /* renamed from: o */
    protected final void mo6639o() {
        this.f28134o.drainPermits();
        m8122h();
    }
}
