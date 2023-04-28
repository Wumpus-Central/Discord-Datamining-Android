package p119g9;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: g9.i0 */
/* loaded from: classes5.dex */
public class C7538i0 implements AbstractC7516c {
    @Override // p119g9.AbstractC7516c
    /* renamed from: a */
    public long mo22293a() {
        return SystemClock.uptimeMillis();
    }

    @Override // p119g9.AbstractC7516c
    /* renamed from: b */
    public long mo22292b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p119g9.AbstractC7516c
    /* renamed from: c */
    public AbstractC7545m mo22291c(Looper looper, Handler.Callback callback) {
        return new C7540j0(new Handler(looper, callback));
    }
}
