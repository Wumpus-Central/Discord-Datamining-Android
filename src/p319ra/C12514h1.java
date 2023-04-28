package p319ra;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ra.h1 */
/* loaded from: classes3.dex */
public final class C12514h1 extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12514h1(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = C12517i1.f28172e;
        atomicBoolean.set(true);
    }
}
