package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import na.HandlerC10772f;
import p384v9.AbstractC13470f;
import p384v9.AbstractC13473g;
import p384v9.AbstractC13476i;
import p384v9.AbstractC13478k;
import p384v9.AbstractC13479l;
import p420x9.C14004p;

@KeepName
/* loaded from: classes5.dex */
public abstract class BasePendingResult<R extends AbstractC13478k> extends AbstractC13473g<R> {
    static final ThreadLocal<Boolean> zaa = new C5405o0();
    @KeepName
    private C5407p0 mResultGuardian;
    protected final HandlerC5371a<R> zab;
    protected final WeakReference<AbstractC13470f> zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList<AbstractC13473g.AbstractC13474a> zag;
    private AbstractC13479l<? super R> zah;
    private final AtomicReference<C5383e0> zai;
    private R zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private boolean zaq;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    /* loaded from: classes5.dex */
    public static class HandlerC5371a<R extends AbstractC13478k> extends HandlerC10772f {
        public HandlerC5371a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void m29107a(AbstractC13479l<? super R> lVar, R r) {
            ThreadLocal<Boolean> threadLocal = BasePendingResult.zaa;
            sendMessage(obtainMessage(1, new Pair((AbstractC13479l) C14004p.m2051j(lVar), r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                AbstractC13479l lVar = (AbstractC13479l) pair.first;
                AbstractC13478k kVar = (AbstractC13478k) pair.second;
                try {
                    lVar.m3606a(kVar);
                } catch (RuntimeException e) {
                    BasePendingResult.zal(kVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i);
                Log.wtf("BasePendingResult", sb2.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f10104s);
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList<>();
        this.zai = new AtomicReference<>();
        this.zaq = false;
        this.zab = new HandlerC5371a<>(Looper.getMainLooper());
        this.zac = new WeakReference<>(null);
    }

    private final R zaa() {
        R r;
        synchronized (this.zae) {
            C14004p.m2048m(!this.zal, "Result has already been consumed.");
            C14004p.m2048m(isReady(), "Result is not ready.");
            r = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (this.zai.getAndSet(null) == null) {
            return (R) ((AbstractC13478k) C14004p.m2051j(r));
        }
        throw null;
    }

    private final void zab(R r) {
        this.zaj = r;
        this.zak = r.mo3607b();
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            AbstractC13479l<? super R> lVar = this.zah;
            if (lVar != null) {
                this.zab.removeMessages(2);
                this.zab.m29107a(lVar, zaa());
            } else if (this.zaj instanceof AbstractC13476i) {
                this.mResultGuardian = new C5407p0(this, null);
            }
        }
        ArrayList<AbstractC13473g.AbstractC13474a> arrayList = this.zag;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo2080a(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(AbstractC13478k kVar) {
        if (kVar instanceof AbstractC13476i) {
            try {
                ((AbstractC13476i) kVar).release();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(kVar)), e);
            }
        }
    }

    @Override // p384v9.AbstractC13473g
    public final void addStatusListener(AbstractC13473g.AbstractC13474a aVar) {
        boolean z;
        if (aVar != null) {
            z = true;
        } else {
            z = false;
        }
        C14004p.m2059b(z, "Callback cannot be null.");
        synchronized (this.zae) {
            if (isReady()) {
                aVar.mo2080a(this.zak);
            } else {
                this.zag.add(aVar);
            }
        }
    }

    @Override // p384v9.AbstractC13473g
    public final R await(long j, TimeUnit timeUnit) {
        if (j > 0) {
            C14004p.m2052i("await must not be called on the UI thread when time is greater than zero.");
        }
        C14004p.m2048m(!this.zal, "Result has already been consumed.");
        C14004p.m2048m(true, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j, timeUnit)) {
                forceFailureUnlessReady(Status.f10104s);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f10102q);
        }
        C14004p.m2048m(isReady(), "Result is not ready.");
        return zaa();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zan = true;
            }
        }
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setResult(R r) {
        synchronized (this.zae) {
            if (this.zan || this.zam) {
                zal(r);
                return;
            }
            isReady();
            C14004p.m2048m(!isReady(), "Results have already been set");
            C14004p.m2048m(!this.zal, "Result has already been consumed");
            zab(r);
        }
    }

    public final void zak() {
        boolean z = true;
        if (!this.zaq && !zaa.get().booleanValue()) {
            z = false;
        }
        this.zaq = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePendingResult(AbstractC13470f fVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList<>();
        this.zai = new AtomicReference<>();
        this.zaq = false;
        this.zab = new HandlerC5371a<>(fVar != null ? fVar.mo2545d() : Looper.getMainLooper());
        this.zac = new WeakReference<>(fVar);
    }
}
