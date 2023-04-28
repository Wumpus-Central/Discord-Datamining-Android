package p256o4;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.image.ImageInfo;
import java.io.Closeable;
import p057d4.AbstractC6395b;
import p115g5.AbstractC7415b;
import p115g5.C7414a;
import p240n4.AbstractC10715h;
import p240n4.C10716i;
import p394w3.C13740j;

/* renamed from: o4.a */
/* loaded from: classes7.dex */
public class C11195a extends C7414a<ImageInfo> implements Closeable {

    /* renamed from: l */
    private final AbstractC6395b f24970l;

    /* renamed from: m */
    private final C10716i f24971m;

    /* renamed from: n */
    private final AbstractC10715h f24972n;

    /* renamed from: o */
    private final Supplier<Boolean> f24973o;

    /* renamed from: p */
    private final Supplier<Boolean> f24974p;

    /* renamed from: q */
    private Handler f24975q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o4.a$a */
    /* loaded from: classes7.dex */
    public static class HandlerC0357a extends Handler {

        /* renamed from: a */
        private final AbstractC10715h f24976a;

        public HandlerC0357a(Looper looper, AbstractC10715h hVar) {
            super(looper);
            this.f24976a = hVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C10716i iVar = (C10716i) C13740j.m2834g(message.obj);
            int i = message.what;
            if (i == 1) {
                this.f24976a.mo12606b(iVar, message.arg1);
            } else if (i == 2) {
                this.f24976a.mo12607a(iVar, message.arg1);
            }
        }
    }

    public C11195a(AbstractC6395b bVar, C10716i iVar, AbstractC10715h hVar, Supplier<Boolean> supplier, Supplier<Boolean> supplier2) {
        this.f24970l = bVar;
        this.f24971m = iVar;
        this.f24972n = hVar;
        this.f24973o = supplier;
        this.f24974p = supplier2;
    }

    /* renamed from: H */
    private boolean m10518H() {
        boolean booleanValue = this.f24973o.get().booleanValue();
        if (booleanValue && this.f24975q == null) {
            m10511n();
        }
        return booleanValue;
    }

    /* renamed from: Q */
    private void m10517Q(C10716i iVar, int i) {
        if (m10518H()) {
            Message obtainMessage = ((Handler) C13740j.m2834g(this.f24975q)).obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.arg1 = i;
            obtainMessage.obj = iVar;
            this.f24975q.sendMessage(obtainMessage);
            return;
        }
        this.f24972n.mo12606b(iVar, i);
    }

    /* renamed from: R */
    private void m10516R(C10716i iVar, int i) {
        if (m10518H()) {
            Message obtainMessage = ((Handler) C13740j.m2834g(this.f24975q)).obtainMessage();
            obtainMessage.what = 2;
            obtainMessage.arg1 = i;
            obtainMessage.obj = iVar;
            this.f24975q.sendMessage(obtainMessage);
            return;
        }
        this.f24972n.mo12607a(iVar, i);
    }

    /* renamed from: n */
    private synchronized void m10511n() {
        if (this.f24975q == null) {
            HandlerThread handlerThread = new HandlerThread("ImagePerfControllerListener2Thread");
            handlerThread.start();
            this.f24975q = new HandlerC0357a((Looper) C13740j.m2834g(handlerThread.getLooper()), this.f24972n);
        }
    }

    /* renamed from: p */
    private C10716i m10510p() {
        return this.f24974p.get().booleanValue() ? new C10716i() : this.f24971m;
    }

    /* renamed from: t */
    private void m10507t(C10716i iVar, long j) {
        iVar.m12605A(false);
        iVar.m12584t(j);
        m10516R(iVar, 2);
    }

    /* renamed from: C */
    public void m10519C() {
        m10510p().m12602b();
    }

    @Override // p115g5.C7414a, p115g5.AbstractC7415b
    /* renamed from: b */
    public void mo10515b(String str, Object obj, AbstractC7415b.C7416a aVar) {
        long now = this.f24970l.now();
        C10716i p = m10510p();
        p.m12601c();
        p.m12593k(now);
        p.m12596h(str);
        p.m12600d(obj);
        p.m12591m(aVar);
        m10517Q(p, 0);
        m10506z(p, now);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m10519C();
    }

    @Override // p115g5.C7414a, p115g5.AbstractC7415b
    /* renamed from: g */
    public void mo10514g(String str, AbstractC7415b.C7416a aVar) {
        long now = this.f24970l.now();
        C10716i p = m10510p();
        p.m12591m(aVar);
        p.m12596h(str);
        int a = p.m12603a();
        if (!(a == 3 || a == 5 || a == 6)) {
            p.m12599e(now);
            m10517Q(p, 4);
        }
        m10507t(p, now);
    }

    @Override // p115g5.C7414a, p115g5.AbstractC7415b
    /* renamed from: l */
    public void mo10512l(String str, Throwable th2, AbstractC7415b.C7416a aVar) {
        long now = this.f24970l.now();
        C10716i p = m10510p();
        p.m12591m(aVar);
        p.m12598f(now);
        p.m12596h(str);
        p.m12592l(th2);
        m10517Q(p, 5);
        m10507t(p, now);
    }

    /* renamed from: r */
    public void mo10513i(String str, ImageInfo imageInfo, AbstractC7415b.C7416a aVar) {
        long now = this.f24970l.now();
        C10716i p = m10510p();
        p.m12591m(aVar);
        p.m12597g(now);
        p.m12586r(now);
        p.m12596h(str);
        p.m12590n(imageInfo);
        m10517Q(p, 3);
    }

    /* renamed from: s */
    public void onIntermediateImageSet(String str, ImageInfo imageInfo) {
        long now = this.f24970l.now();
        C10716i p = m10510p();
        p.m12594j(now);
        p.m12596h(str);
        p.m12590n(imageInfo);
        m10517Q(p, 2);
    }

    /* renamed from: z */
    public void m10506z(C10716i iVar, long j) {
        iVar.m12605A(true);
        iVar.m12578z(j);
        m10516R(iVar, 1);
    }
}
