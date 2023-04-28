package p288q;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.C1915r1;
import androidx.concurrent.futures.C2114c;
import androidx.core.util.C2517g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import p120gc.AbstractFutureC7576b;
import p272p.C11502b;
import p272p.C11505d;
import p288q.AbstractC11912r2;
import p288q.C11806d3;
import p288q.C11826h1;
import p328s.C12735b;
import p328s.C12754q;
import p355u.C13173m;
import p390w.AbstractC13615k;
import p390w.AbstractC13662r0;
import p390w.AbstractC13689w0;
import p390w.C13582c2;
import p390w.C13619k2;
import p390w.C13639n0;
import p390w.C13696x1;
import p431y.AbstractC14179a;
import p431y.AbstractC14182c;
import p431y.C14183d;
import p431y.C14186f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q.t1 */
/* loaded from: classes.dex */
public final class C11920t1 implements AbstractC11929u1 {

    /* renamed from: e */
    C11798c3 f26647e;

    /* renamed from: f */
    AbstractC11912r2 f26648f;

    /* renamed from: g */
    C13619k2 f26649g;

    /* renamed from: l */
    EnumC11924d f26654l;

    /* renamed from: m */
    AbstractFutureC7576b<Void> f26655m;

    /* renamed from: n */
    C2114c.C2115a<Void> f26656n;

    /* renamed from: a */
    final Object f26643a = new Object();

    /* renamed from: b */
    private final List<C13639n0> f26644b = new ArrayList();

    /* renamed from: c */
    private final CameraCaptureSession.CaptureCallback f26645c = new C11921a();

    /* renamed from: h */
    AbstractC13662r0 f26650h = C13582c2.m3311G();

    /* renamed from: i */
    C11505d f26651i = C11505d.m9546e();

    /* renamed from: j */
    private final Map<AbstractC13689w0, Surface> f26652j = new HashMap();

    /* renamed from: k */
    List<AbstractC13689w0> f26653k = Collections.emptyList();

    /* renamed from: o */
    final C13173m f26657o = new C13173m();

    /* renamed from: d */
    private final C11925e f26646d = new C11925e();

    /* renamed from: q.t1$a */
    /* loaded from: classes.dex */
    class C11921a extends CameraCaptureSession.CaptureCallback {
        C11921a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }

    /* renamed from: q.t1$b */
    /* loaded from: classes.dex */
    class C11922b implements AbstractC14182c<Void> {
        C11922b() {
        }

        /* renamed from: b */
        public void mo1412a(Void r1) {
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            synchronized (C11920t1.this.f26643a) {
                C11920t1.this.f26647e.m8601e();
                int i = C11923c.f26660a[C11920t1.this.f26654l.ordinal()];
                if ((i == 4 || i == 6 || i == 7) && !(th2 instanceof CancellationException)) {
                    C1915r1.m39516l("CaptureSession", "Opening session with fail " + C11920t1.this.f26654l, th2);
                    C11920t1.this.m8300l();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.t1$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11923c {

        /* renamed from: a */
        static final /* synthetic */ int[] f26660a;

        static {
            int[] iArr = new int[EnumC11924d.values().length];
            f26660a = iArr;
            try {
                iArr[EnumC11924d.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26660a[EnumC11924d.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26660a[EnumC11924d.GET_SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26660a[EnumC11924d.OPENING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26660a[EnumC11924d.OPENED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26660a[EnumC11924d.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26660a[EnumC11924d.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26660a[EnumC11924d.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.t1$d */
    /* loaded from: classes.dex */
    public enum EnumC11924d {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.t1$e */
    /* loaded from: classes.dex */
    public final class C11925e extends AbstractC11912r2.AbstractC11913a {
        C11925e() {
        }

        @Override // p288q.AbstractC11912r2.AbstractC11913a
        /* renamed from: q */
        public void mo8165q(AbstractC11912r2 r2Var) {
            synchronized (C11920t1.this.f26643a) {
                switch (C11923c.f26660a[C11920t1.this.f26654l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C11920t1.this.f26654l);
                    case 4:
                    case 6:
                    case 7:
                        C11920t1.this.m8300l();
                        break;
                    case 8:
                        C1915r1.m39527a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                        break;
                }
                C1915r1.m39525c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C11920t1.this.f26654l);
            }
        }

        @Override // p288q.AbstractC11912r2.AbstractC11913a
        /* renamed from: r */
        public void mo8164r(AbstractC11912r2 r2Var) {
            synchronized (C11920t1.this.f26643a) {
                switch (C11923c.f26660a[C11920t1.this.f26654l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 8:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + C11920t1.this.f26654l);
                    case 4:
                        C11920t1 t1Var = C11920t1.this;
                        t1Var.f26654l = EnumC11924d.OPENED;
                        t1Var.f26648f = r2Var;
                        if (t1Var.f26649g != null) {
                            List<C13639n0> b = t1Var.f26651i.m9547d().m9544b();
                            if (!b.isEmpty()) {
                                C11920t1 t1Var2 = C11920t1.this;
                                t1Var2.m8299m(t1Var2.m8291u(b));
                            }
                        }
                        C1915r1.m39527a("CaptureSession", "Attempting to send capture request onConfigured");
                        C11920t1 t1Var3 = C11920t1.this;
                        t1Var3.m8297o(t1Var3.f26649g);
                        C11920t1.this.m8298n();
                        break;
                    case 6:
                        C11920t1.this.f26648f = r2Var;
                        break;
                    case 7:
                        r2Var.close();
                        break;
                }
                C1915r1.m39527a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C11920t1.this.f26654l);
            }
        }

        @Override // p288q.AbstractC11912r2.AbstractC11913a
        /* renamed from: s */
        public void mo8163s(AbstractC11912r2 r2Var) {
            synchronized (C11920t1.this.f26643a) {
                if (C11923c.f26660a[C11920t1.this.f26654l.ordinal()] != 1) {
                    C1915r1.m39527a("CaptureSession", "CameraCaptureSession.onReady() " + C11920t1.this.f26654l);
                } else {
                    throw new IllegalStateException("onReady() should not be possible in state: " + C11920t1.this.f26654l);
                }
            }
        }

        @Override // p288q.AbstractC11912r2.AbstractC11913a
        /* renamed from: t */
        public void mo8162t(AbstractC11912r2 r2Var) {
            synchronized (C11920t1.this.f26643a) {
                if (C11920t1.this.f26654l != EnumC11924d.UNINITIALIZED) {
                    C1915r1.m39527a("CaptureSession", "onSessionFinished()");
                    C11920t1.this.m8300l();
                } else {
                    throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C11920t1.this.f26654l);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11920t1() {
        this.f26654l = EnumC11924d.UNINITIALIZED;
        this.f26654l = EnumC11924d.INITIALIZED;
    }

    /* renamed from: k */
    private CameraCaptureSession.CaptureCallback m8301k(List<AbstractC13615k> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        for (AbstractC13615k kVar : list) {
            arrayList.add(C11888p1.m8400a(kVar));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return C11877n0.m8405a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m8296p(CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        synchronized (this.f26643a) {
            if (this.f26654l == EnumC11924d.OPENED) {
                m8297o(this.f26649g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m8294r(C2114c.C2115a aVar) {
        boolean z;
        String str;
        synchronized (this.f26643a) {
            if (this.f26656n == null) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37585j(z, "Release completer expected to be null");
            this.f26656n = aVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    /* renamed from: s */
    private static AbstractC13662r0 m8293s(List<C13639n0> list) {
        C13696x1 J = C13696x1.m3002J();
        for (C13639n0 n0Var : list) {
            AbstractC13662r0 c = n0Var.m3149c();
            for (AbstractC13662r0.AbstractC13663a<?> aVar : c.mo2975c()) {
                Object a = c.mo2977a(aVar, null);
                if (J.mo2973e(aVar)) {
                    Object a2 = J.mo2977a(aVar, null);
                    if (!Objects.equals(a2, a)) {
                        C1915r1.m39527a("CaptureSession", "Detect conflicting option " + aVar.mo3100c() + " : " + a + " != " + a2);
                    }
                } else {
                    J.mo2999u(aVar, a);
                }
            }
        }
        return J;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public AbstractFutureC7576b<Void> m8295q(List<Surface> list, C13619k2 k2Var, CameraDevice cameraDevice) {
        synchronized (this.f26643a) {
            int i = C11923c.f26660a[this.f26654l.ordinal()];
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    this.f26652j.clear();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        this.f26652j.put(this.f26653k.get(i2), list.get(i2));
                    }
                    ArrayList<Surface> arrayList = new ArrayList(new LinkedHashSet(list));
                    this.f26654l = EnumC11924d.OPENING;
                    C1915r1.m39527a("CaptureSession", "Opening capture session.");
                    AbstractC11912r2.AbstractC11913a v = C11806d3.m8598v(this.f26646d, new C11806d3.C11807a(k2Var.m3201g()));
                    C11502b bVar = new C11502b(k2Var.m3204d());
                    C11505d G = bVar.m9563G(C11505d.m9546e());
                    this.f26651i = G;
                    List<C13639n0> c = G.m9547d().m9543c();
                    C13639n0.C13640a k = C13639n0.C13640a.m3134k(k2Var.m3202f());
                    for (C13639n0 n0Var : c) {
                        k.m3140e(n0Var.m3149c());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Surface surface : arrayList) {
                        C12735b bVar2 = new C12735b(surface);
                        bVar2.m5585c(bVar.m9558L(null));
                        arrayList2.add(bVar2);
                    }
                    C12754q a = this.f26647e.m8605a(0, arrayList2, v);
                    try {
                        CaptureRequest c2 = C11796c1.m8607c(k.m3137h(), cameraDevice);
                        if (c2 != null) {
                            a.m5558f(c2);
                        }
                        return this.f26647e.m8603c(cameraDevice, a, this.f26653k);
                    } catch (CameraAccessException e) {
                        return C14186f.m1423f(e);
                    }
                } else if (i != 5) {
                    return C14186f.m1423f(new CancellationException("openCaptureSession() not execute in state: " + this.f26654l));
                }
            }
            return C14186f.m1423f(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f26654l));
        }
    }

    @Override // p288q.AbstractC11929u1
    /* renamed from: a */
    public void mo8289a(List<C13639n0> list) {
        synchronized (this.f26643a) {
            switch (C11923c.f26660a[this.f26654l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f26654l);
                case 2:
                case 3:
                case 4:
                    this.f26644b.addAll(list);
                    break;
                case 5:
                    this.f26644b.addAll(list);
                    m8298n();
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    @Override // p288q.AbstractC11929u1
    /* renamed from: b */
    public AbstractFutureC7576b<Void> mo8288b(final C13619k2 k2Var, final CameraDevice cameraDevice, C11798c3 c3Var) {
        synchronized (this.f26643a) {
            if (C11923c.f26660a[this.f26654l.ordinal()] != 2) {
                C1915r1.m39525c("CaptureSession", "Open not allowed in state: " + this.f26654l);
                return C14186f.m1423f(new IllegalStateException("open() should not allow the state: " + this.f26654l));
            }
            this.f26654l = EnumC11924d.GET_SURFACE;
            ArrayList arrayList = new ArrayList(k2Var.m3199i());
            this.f26653k = arrayList;
            this.f26647e = c3Var;
            C14183d f = C14183d.m1433b(c3Var.m8602d(arrayList, 5000L)).m1429f(new AbstractC14179a() { // from class: q.r1
                @Override // p431y.AbstractC14179a
                public final AbstractFutureC7576b apply(Object obj) {
                    AbstractFutureC7576b q;
                    q = C11920t1.this.m8295q(k2Var, cameraDevice, (List) obj);
                    return q;
                }
            }, this.f26647e.m8604b());
            C14186f.m1427b(f, new C11922b(), this.f26647e.m8604b());
            return C14186f.m1419j(f);
        }
    }

    @Override // p288q.AbstractC11929u1
    /* renamed from: c */
    public void mo8287c() {
        ArrayList<C13639n0> arrayList;
        synchronized (this.f26643a) {
            if (!this.f26644b.isEmpty()) {
                arrayList = new ArrayList(this.f26644b);
                this.f26644b.clear();
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            for (C13639n0 n0Var : arrayList) {
                for (AbstractC13615k kVar : n0Var.m3150b()) {
                    kVar.mo3172a();
                }
            }
        }
    }

    @Override // p288q.AbstractC11929u1
    public void close() {
        synchronized (this.f26643a) {
            int i = C11923c.f26660a[this.f26654l.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (this.f26649g != null) {
                                    List<C13639n0> a = this.f26651i.m9547d().m9545a();
                                    if (!a.isEmpty()) {
                                        try {
                                            mo8289a(m8291u(a));
                                        } catch (IllegalStateException e) {
                                            C1915r1.m39524d("CaptureSession", "Unable to issue the request before close the capture session", e);
                                        }
                                    }
                                }
                            }
                        }
                        C11798c3 c3Var = this.f26647e;
                        C2517g.m37587h(c3Var, "The Opener shouldn't null in state:" + this.f26654l);
                        this.f26647e.m8601e();
                        this.f26654l = EnumC11924d.CLOSED;
                        this.f26649g = null;
                    } else {
                        C11798c3 c3Var2 = this.f26647e;
                        C2517g.m37587h(c3Var2, "The Opener shouldn't null in state:" + this.f26654l);
                        this.f26647e.m8601e();
                    }
                }
                this.f26654l = EnumC11924d.RELEASED;
            } else {
                throw new IllegalStateException("close() should not be possible in state: " + this.f26654l);
            }
        }
    }

    @Override // p288q.AbstractC11929u1
    /* renamed from: d */
    public void mo8286d(C13619k2 k2Var) {
        synchronized (this.f26643a) {
            switch (C11923c.f26660a[this.f26654l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f26654l);
                case 2:
                case 3:
                case 4:
                    this.f26649g = k2Var;
                    break;
                case 5:
                    this.f26649g = k2Var;
                    if (k2Var != null) {
                        if (this.f26652j.keySet().containsAll(k2Var.m3199i())) {
                            C1915r1.m39527a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            m8297o(this.f26649g);
                            break;
                        } else {
                            C1915r1.m39525c("CaptureSession", "Does not have the proper configured lists");
                            return;
                        }
                    } else {
                        return;
                    }
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[Catch: all -> 0x00a6, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x000d, B:7:0x0012, B:10:0x0018, B:12:0x001d, B:13:0x0024, B:14:0x0029, B:16:0x004d, B:17:0x0051, B:19:0x0055, B:20:0x0060, B:21:0x0062, B:23:0x0064, B:24:0x0081, B:25:0x0086, B:26:0x009e, B:27:0x009f), top: B:35:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[Catch: all -> 0x00a6, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x000d, B:7:0x0012, B:10:0x0018, B:12:0x001d, B:13:0x0024, B:14:0x0029, B:16:0x004d, B:17:0x0051, B:19:0x0055, B:20:0x0060, B:21:0x0062, B:23:0x0064, B:24:0x0081, B:25:0x0086, B:26:0x009e, B:27:0x009f), top: B:35:0x0003, inners: #0 }] */
    @Override // p288q.AbstractC11929u1
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p120gc.AbstractFutureC7576b<java.lang.Void> mo8285e(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f26643a
            monitor-enter(r0)
            int[] r1 = p288q.C11920t1.C11923c.f26660a     // Catch: all -> 0x00a6
            q.t1$d r2 = r3.f26654l     // Catch: all -> 0x00a6
            int r2 = r2.ordinal()     // Catch: all -> 0x00a6
            r1 = r1[r2]     // Catch: all -> 0x00a6
            switch(r1) {
                case 1: goto L_0x0086;
                case 2: goto L_0x0081;
                case 3: goto L_0x0064;
                case 4: goto L_0x0029;
                case 5: goto L_0x0012;
                case 6: goto L_0x0012;
                case 7: goto L_0x0051;
                default: goto L_0x0010;
            }     // Catch: all -> 0x00a6
        L_0x0010:
            goto L_0x009f
        L_0x0012:
            q.r2 r1 = r3.f26648f     // Catch: all -> 0x00a6
            if (r1 == 0) goto L_0x0029
            if (r4 == 0) goto L_0x0024
            r1.mo8177e()     // Catch: CameraAccessException -> 0x001c, all -> 0x00a6
            goto L_0x0024
        L_0x001c:
            r4 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r2 = "Unable to abort captures."
            androidx.camera.core.C1915r1.m39524d(r1, r2, r4)     // Catch: all -> 0x00a6
        L_0x0024:
            q.r2 r4 = r3.f26648f     // Catch: all -> 0x00a6
            r4.close()     // Catch: all -> 0x00a6
        L_0x0029:
            q.t1$d r4 = p288q.C11920t1.EnumC11924d.RELEASING     // Catch: all -> 0x00a6
            r3.f26654l = r4     // Catch: all -> 0x00a6
            q.c3 r4 = r3.f26647e     // Catch: all -> 0x00a6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x00a6
            r1.<init>()     // Catch: all -> 0x00a6
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: all -> 0x00a6
            q.t1$d r2 = r3.f26654l     // Catch: all -> 0x00a6
            r1.append(r2)     // Catch: all -> 0x00a6
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x00a6
            androidx.core.util.C2517g.m37587h(r4, r1)     // Catch: all -> 0x00a6
            q.c3 r4 = r3.f26647e     // Catch: all -> 0x00a6
            boolean r4 = r4.m8601e()     // Catch: all -> 0x00a6
            if (r4 == 0) goto L_0x0051
            r3.m8300l()     // Catch: all -> 0x00a6
            goto L_0x009f
        L_0x0051:
            gc.b<java.lang.Void> r4 = r3.f26655m     // Catch: all -> 0x00a6
            if (r4 != 0) goto L_0x0060
            q.s1 r4 = new q.s1     // Catch: all -> 0x00a6
            r4.<init>()     // Catch: all -> 0x00a6
            gc.b r4 = androidx.concurrent.futures.C2114c.m38964a(r4)     // Catch: all -> 0x00a6
            r3.f26655m = r4     // Catch: all -> 0x00a6
        L_0x0060:
            gc.b<java.lang.Void> r4 = r3.f26655m     // Catch: all -> 0x00a6
            monitor-exit(r0)     // Catch: all -> 0x00a6
            return r4
        L_0x0064:
            q.c3 r4 = r3.f26647e     // Catch: all -> 0x00a6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x00a6
            r1.<init>()     // Catch: all -> 0x00a6
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: all -> 0x00a6
            q.t1$d r2 = r3.f26654l     // Catch: all -> 0x00a6
            r1.append(r2)     // Catch: all -> 0x00a6
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x00a6
            androidx.core.util.C2517g.m37587h(r4, r1)     // Catch: all -> 0x00a6
            q.c3 r4 = r3.f26647e     // Catch: all -> 0x00a6
            r4.m8601e()     // Catch: all -> 0x00a6
        L_0x0081:
            q.t1$d r4 = p288q.C11920t1.EnumC11924d.RELEASED     // Catch: all -> 0x00a6
            r3.f26654l = r4     // Catch: all -> 0x00a6
            goto L_0x009f
        L_0x0086:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: all -> 0x00a6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x00a6
            r1.<init>()     // Catch: all -> 0x00a6
            java.lang.String r2 = "release() should not be possible in state: "
            r1.append(r2)     // Catch: all -> 0x00a6
            q.t1$d r2 = r3.f26654l     // Catch: all -> 0x00a6
            r1.append(r2)     // Catch: all -> 0x00a6
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x00a6
            r4.<init>(r1)     // Catch: all -> 0x00a6
            throw r4     // Catch: all -> 0x00a6
        L_0x009f:
            monitor-exit(r0)     // Catch: all -> 0x00a6
            r4 = 0
            gc.b r4 = p431y.C14186f.m1421h(r4)
            return r4
        L_0x00a6:
            r4 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x00a6
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p288q.C11920t1.mo8285e(boolean):gc.b");
    }

    @Override // p288q.AbstractC11929u1
    /* renamed from: f */
    public List<C13639n0> mo8284f() {
        List<C13639n0> unmodifiableList;
        synchronized (this.f26643a) {
            unmodifiableList = Collections.unmodifiableList(this.f26644b);
        }
        return unmodifiableList;
    }

    @Override // p288q.AbstractC11929u1
    /* renamed from: g */
    public C13619k2 mo8283g() {
        C13619k2 k2Var;
        synchronized (this.f26643a) {
            k2Var = this.f26649g;
        }
        return k2Var;
    }

    /* renamed from: l */
    void m8300l() {
        EnumC11924d dVar = this.f26654l;
        EnumC11924d dVar2 = EnumC11924d.RELEASED;
        if (dVar == dVar2) {
            C1915r1.m39527a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f26654l = dVar2;
        this.f26648f = null;
        C2114c.C2115a<Void> aVar = this.f26656n;
        if (aVar != null) {
            aVar.m38961c(null);
            this.f26656n = null;
        }
    }

    /* renamed from: m */
    int m8299m(List<C13639n0> list) {
        C11826h1 h1Var;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        synchronized (this.f26643a) {
            if (list.isEmpty()) {
                return -1;
            }
            try {
                h1Var = new C11826h1();
                arrayList = new ArrayList();
                C1915r1.m39527a("CaptureSession", "Issuing capture request.");
                z = false;
                for (C13639n0 n0Var : list) {
                    if (n0Var.m3148d().isEmpty()) {
                        C1915r1.m39527a("CaptureSession", "Skipping issuing empty capture request.");
                    } else {
                        Iterator<AbstractC13689w0> it = n0Var.m3148d().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = true;
                                break;
                            }
                            AbstractC13689w0 next = it.next();
                            if (!this.f26652j.containsKey(next)) {
                                C1915r1.m39527a("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                z2 = false;
                                break;
                            }
                        }
                        if (z2) {
                            if (n0Var.m3146f() == 2) {
                                z = true;
                            }
                            C13639n0.C13640a k = C13639n0.C13640a.m3134k(n0Var);
                            C13619k2 k2Var = this.f26649g;
                            if (k2Var != null) {
                                k.m3140e(k2Var.m3202f().m3149c());
                            }
                            k.m3140e(this.f26650h);
                            k.m3140e(n0Var.m3149c());
                            CaptureRequest b = C11796c1.m8608b(k.m3137h(), this.f26648f.mo8176f(), this.f26652j);
                            if (b == null) {
                                C1915r1.m39527a("CaptureSession", "Skipping issuing request without surface.");
                                return -1;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (AbstractC13615k kVar : n0Var.m3150b()) {
                                C11888p1.m8399b(kVar, arrayList2);
                            }
                            h1Var.m8587a(b, arrayList2);
                            arrayList.add(b);
                        }
                    }
                }
            } catch (CameraAccessException e) {
                C1915r1.m39525c("CaptureSession", "Unable to access camera: " + e.getMessage());
                Thread.dumpStack();
            }
            if (!arrayList.isEmpty()) {
                if (this.f26657o.m4422a(arrayList, z)) {
                    this.f26648f.mo8168n();
                    h1Var.m8585c(new C11826h1.AbstractC11827a() { // from class: q.q1
                        @Override // p288q.C11826h1.AbstractC11827a
                        /* renamed from: a */
                        public final void mo8383a(CameraCaptureSession cameraCaptureSession, int i, boolean z3) {
                            C11920t1.this.m8296p(cameraCaptureSession, i, z3);
                        }
                    });
                }
                return this.f26648f.mo8171k(arrayList, h1Var);
            }
            C1915r1.m39527a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
            return -1;
        }
    }

    /* renamed from: n */
    void m8298n() {
        if (!this.f26644b.isEmpty()) {
            try {
                m8299m(this.f26644b);
            } finally {
                this.f26644b.clear();
            }
        }
    }

    /* renamed from: o */
    int m8297o(C13619k2 k2Var) {
        synchronized (this.f26643a) {
            if (k2Var == null) {
                C1915r1.m39527a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            C13639n0 f = k2Var.m3202f();
            if (f.m3148d().isEmpty()) {
                C1915r1.m39527a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f26648f.mo8168n();
                } catch (CameraAccessException e) {
                    C1915r1.m39525c("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                C1915r1.m39527a("CaptureSession", "Issuing request for session.");
                C13639n0.C13640a k = C13639n0.C13640a.m3134k(f);
                AbstractC13662r0 s = m8293s(this.f26651i.m9547d().m9542d());
                this.f26650h = s;
                k.m3140e(s);
                CaptureRequest b = C11796c1.m8608b(k.m3137h(), this.f26648f.mo8176f(), this.f26652j);
                if (b == null) {
                    C1915r1.m39527a("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.f26648f.mo8175g(b, m8301k(f.m3150b(), this.f26645c));
            } catch (CameraAccessException e2) {
                C1915r1.m39525c("CaptureSession", "Unable to access camera: " + e2.getMessage());
                Thread.dumpStack();
                return -1;
            }
        }
    }

    /* renamed from: u */
    List<C13639n0> m8291u(List<C13639n0> list) {
        ArrayList arrayList = new ArrayList();
        for (C13639n0 n0Var : list) {
            C13639n0.C13640a k = C13639n0.C13640a.m3134k(n0Var);
            k.m3130o(1);
            for (AbstractC13689w0 w0Var : this.f26649g.m3202f().m3148d()) {
                k.m3139f(w0Var);
            }
            arrayList.add(k.m3137h());
        }
        return arrayList;
    }
}
