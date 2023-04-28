package p288q;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p120gc.AbstractFutureC7576b;
import p288q.AbstractC11912r2;
import p328s.C12735b;
import p328s.C12754q;
import p390w.AbstractC13689w0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q.c3 */
/* loaded from: classes.dex */
public final class C11798c3 {

    /* renamed from: a */
    private final AbstractC11800b f26329a;

    /* renamed from: q.c3$a */
    /* loaded from: classes.dex */
    static class C11799a {

        /* renamed from: a */
        private final Executor f26330a;

        /* renamed from: b */
        private final ScheduledExecutorService f26331b;

        /* renamed from: c */
        private final Handler f26332c;

        /* renamed from: d */
        private final C11940w1 f26333d;

        /* renamed from: e */
        private final int f26334e;

        /* renamed from: f */
        private final Set<String> f26335f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C11799a(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C11940w1 w1Var, int i) {
            HashSet hashSet = new HashSet();
            this.f26335f = hashSet;
            this.f26330a = executor;
            this.f26331b = scheduledExecutorService;
            this.f26332c = handler;
            this.f26333d = w1Var;
            this.f26334e = i;
            int i2 = Build.VERSION.SDK_INT;
            if (i == 2 || i2 <= 23) {
                hashSet.add("deferrableSurface_close");
            }
            if (i == 2) {
                hashSet.add("wait_for_request");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public C11798c3 m8600a() {
            if (this.f26335f.isEmpty()) {
                return new C11798c3(new C11946x2(this.f26333d, this.f26330a, this.f26331b, this.f26332c));
            }
            return new C11798c3(new C11792b3(this.f26335f, this.f26333d, this.f26330a, this.f26331b, this.f26332c));
        }
    }

    /* renamed from: q.c3$b */
    /* loaded from: classes.dex */
    interface AbstractC11800b {
        /* renamed from: b */
        Executor mo8180b();

        /* renamed from: h */
        AbstractFutureC7576b<List<Surface>> mo8174h(List<AbstractC13689w0> list, long j);

        /* renamed from: i */
        AbstractFutureC7576b<Void> mo8173i(CameraDevice cameraDevice, C12754q qVar, List<AbstractC13689w0> list);

        /* renamed from: m */
        C12754q mo8169m(int i, List<C12735b> list, AbstractC11912r2.AbstractC11913a aVar);

        boolean stop();
    }

    C11798c3(AbstractC11800b bVar) {
        this.f26329a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C12754q m8605a(int i, List<C12735b> list, AbstractC11912r2.AbstractC11913a aVar) {
        return this.f26329a.mo8169m(i, list, aVar);
    }

    /* renamed from: b */
    public Executor m8604b() {
        return this.f26329a.mo8180b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public AbstractFutureC7576b<Void> m8603c(CameraDevice cameraDevice, C12754q qVar, List<AbstractC13689w0> list) {
        return this.f26329a.mo8173i(cameraDevice, qVar, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public AbstractFutureC7576b<List<Surface>> m8602d(List<AbstractC13689w0> list, long j) {
        return this.f26329a.mo8174h(list, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m8601e() {
        return this.f26329a.stop();
    }
}
