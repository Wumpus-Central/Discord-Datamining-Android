package p288q;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q.w1 */
/* loaded from: classes.dex */
public class C11940w1 {

    /* renamed from: a */
    final Executor f26714a;

    /* renamed from: b */
    final Object f26715b = new Object();

    /* renamed from: c */
    final Set<AbstractC11912r2> f26716c = new LinkedHashSet();

    /* renamed from: d */
    final Set<AbstractC11912r2> f26717d = new LinkedHashSet();

    /* renamed from: e */
    final Set<AbstractC11912r2> f26718e = new LinkedHashSet();

    /* renamed from: f */
    private final CameraDevice.StateCallback f26719f = new C11941a();

    /* renamed from: q.w1$a */
    /* loaded from: classes.dex */
    class C11941a extends CameraDevice.StateCallback {
        C11941a() {
        }

        /* renamed from: b */
        private void m8203b() {
            List<AbstractC11912r2> g;
            synchronized (C11940w1.this.f26715b) {
                g = C11940w1.this.m8210g();
                C11940w1.this.f26718e.clear();
                C11940w1.this.f26716c.clear();
                C11940w1.this.f26717d.clear();
            }
            for (AbstractC11912r2 r2Var : g) {
                r2Var.mo8178d();
            }
        }

        /* renamed from: c */
        private void m8202c() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C11940w1.this.f26715b) {
                linkedHashSet.addAll(C11940w1.this.f26718e);
                linkedHashSet.addAll(C11940w1.this.f26716c);
            }
            C11940w1.this.f26714a.execute(new Runnable() { // from class: q.v1
                @Override // java.lang.Runnable
                public final void run() {
                    C11940w1.m8215b(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            m8203b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            m8202c();
            m8203b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            m8202c();
            m8203b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11940w1(Executor executor) {
        this.f26714a = executor;
    }

    /* renamed from: a */
    private void m8216a(AbstractC11912r2 r2Var) {
        AbstractC11912r2 next;
        Iterator<AbstractC11912r2> it = m8210g().iterator();
        while (it.hasNext() && (next = it.next()) != r2Var) {
            next.mo8178d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m8215b(Set<AbstractC11912r2> set) {
        for (AbstractC11912r2 r2Var : set) {
            r2Var.mo8179c().mo8166p(r2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public CameraDevice.StateCallback m8214c() {
        return this.f26719f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public List<AbstractC11912r2> m8213d() {
        ArrayList arrayList;
        synchronized (this.f26715b) {
            arrayList = new ArrayList(this.f26716c);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public List<AbstractC11912r2> m8212e() {
        ArrayList arrayList;
        synchronized (this.f26715b) {
            arrayList = new ArrayList(this.f26717d);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public List<AbstractC11912r2> m8211f() {
        ArrayList arrayList;
        synchronized (this.f26715b) {
            arrayList = new ArrayList(this.f26718e);
        }
        return arrayList;
    }

    /* renamed from: g */
    List<AbstractC11912r2> m8210g() {
        ArrayList arrayList;
        synchronized (this.f26715b) {
            arrayList = new ArrayList();
            arrayList.addAll(m8213d());
            arrayList.addAll(m8211f());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m8209h(AbstractC11912r2 r2Var) {
        synchronized (this.f26715b) {
            this.f26716c.remove(r2Var);
            this.f26717d.remove(r2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m8208i(AbstractC11912r2 r2Var) {
        synchronized (this.f26715b) {
            this.f26717d.add(r2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m8207j(AbstractC11912r2 r2Var) {
        m8216a(r2Var);
        synchronized (this.f26715b) {
            this.f26718e.remove(r2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m8206k(AbstractC11912r2 r2Var) {
        synchronized (this.f26715b) {
            this.f26716c.add(r2Var);
            this.f26718e.remove(r2Var);
        }
        m8216a(r2Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m8205l(AbstractC11912r2 r2Var) {
        synchronized (this.f26715b) {
            this.f26718e.add(r2Var);
        }
    }
}
