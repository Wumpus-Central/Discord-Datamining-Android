package p390w;

import androidx.camera.core.AbstractC1874k;
import androidx.camera.core.C1915r1;
import androidx.core.util.C2517g;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p390w.AbstractC13597g0;
import p390w.C13610j0;

/* renamed from: w.j0 */
/* loaded from: classes.dex */
public final class C13610j0 {

    /* renamed from: c */
    private final int f30414c;

    /* renamed from: e */
    private int f30416e;

    /* renamed from: a */
    private final StringBuilder f30412a = new StringBuilder();

    /* renamed from: b */
    private final Object f30413b = new Object();

    /* renamed from: d */
    private final Map<AbstractC1874k, C13611a> f30415d = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w.j0$a */
    /* loaded from: classes.dex */
    public static class C13611a {

        /* renamed from: a */
        private AbstractC13597g0.EnumC13598a f30417a;

        /* renamed from: b */
        private final Executor f30418b;

        /* renamed from: c */
        private final AbstractC13612b f30419c;

        C13611a(AbstractC13597g0.EnumC13598a aVar, Executor executor, AbstractC13612b bVar) {
            this.f30417a = aVar;
            this.f30418b = executor;
            this.f30419c = bVar;
        }

        /* renamed from: a */
        AbstractC13597g0.EnumC13598a m3223a() {
            return this.f30417a;
        }

        /* renamed from: b */
        void m3222b() {
            try {
                Executor executor = this.f30418b;
                final AbstractC13612b bVar = this.f30419c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: w.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C13610j0.AbstractC13612b.this.mo3220a();
                    }
                });
            } catch (RejectedExecutionException e) {
                C1915r1.m39524d("CameraStateRegistry", "Unable to notify camera.", e);
            }
        }

        /* renamed from: c */
        AbstractC13597g0.EnumC13598a m3221c(AbstractC13597g0.EnumC13598a aVar) {
            AbstractC13597g0.EnumC13598a aVar2 = this.f30417a;
            this.f30417a = aVar;
            return aVar2;
        }
    }

    /* renamed from: w.j0$b */
    /* loaded from: classes.dex */
    public interface AbstractC13612b {
        /* renamed from: a */
        void mo3220a();
    }

    public C13610j0(int i) {
        this.f30414c = i;
        synchronized ("mLock") {
            this.f30416e = i;
        }
    }

    /* renamed from: b */
    private static boolean m3230b(AbstractC13597g0.EnumC13598a aVar) {
        return aVar != null && aVar.m3263a();
    }

    /* renamed from: d */
    private void m3228d() {
        String str;
        if (C1915r1.m39522f("CameraStateRegistry")) {
            this.f30412a.setLength(0);
            this.f30412a.append("Recalculating open cameras:\n");
            this.f30412a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f30412a.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry<AbstractC1874k, C13611a> entry : this.f30415d.entrySet()) {
            if (C1915r1.m39522f("CameraStateRegistry")) {
                if (entry.getValue().m3223a() != null) {
                    str = entry.getValue().m3223a().toString();
                } else {
                    str = "UNKNOWN";
                }
                this.f30412a.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), str));
            }
            if (m3230b(entry.getValue().m3223a())) {
                i++;
            }
        }
        if (C1915r1.m39522f("CameraStateRegistry")) {
            this.f30412a.append("-------------------------------------------------------------------\n");
            this.f30412a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i), Integer.valueOf(this.f30414c)));
            C1915r1.m39527a("CameraStateRegistry", this.f30412a.toString());
        }
        this.f30416e = Math.max(this.f30414c - i, 0);
    }

    /* renamed from: g */
    private AbstractC13597g0.EnumC13598a m3225g(AbstractC1874k kVar) {
        C13611a remove = this.f30415d.remove(kVar);
        if (remove == null) {
            return null;
        }
        m3228d();
        return remove.m3223a();
    }

    /* renamed from: h */
    private AbstractC13597g0.EnumC13598a m3224h(AbstractC1874k kVar, AbstractC13597g0.EnumC13598a aVar) {
        boolean z;
        AbstractC13597g0.EnumC13598a c = ((C13611a) C2517g.m37587h(this.f30415d.get(kVar), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).m3221c(aVar);
        AbstractC13597g0.EnumC13598a aVar2 = AbstractC13597g0.EnumC13598a.OPENING;
        if (aVar == aVar2) {
            if (m3230b(aVar) || c == aVar2) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37585j(z, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (c != aVar) {
            m3228d();
        }
        return c;
    }

    /* renamed from: a */
    public boolean m3231a() {
        synchronized (this.f30413b) {
            for (Map.Entry<AbstractC1874k, C13611a> entry : this.f30415d.entrySet()) {
                if (entry.getValue().m3223a() == AbstractC13597g0.EnumC13598a.CLOSING) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public void m3229c(AbstractC1874k kVar, AbstractC13597g0.EnumC13598a aVar, boolean z) {
        AbstractC13597g0.EnumC13598a aVar2;
        HashMap hashMap;
        synchronized (this.f30413b) {
            int i = this.f30416e;
            if (aVar == AbstractC13597g0.EnumC13598a.RELEASED) {
                aVar2 = m3225g(kVar);
            } else {
                aVar2 = m3224h(kVar, aVar);
            }
            if (aVar2 != aVar) {
                if (i < 1 && this.f30416e > 0) {
                    hashMap = new HashMap();
                    for (Map.Entry<AbstractC1874k, C13611a> entry : this.f30415d.entrySet()) {
                        if (entry.getValue().m3223a() == AbstractC13597g0.EnumC13598a.PENDING_OPEN) {
                            hashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else if (aVar != AbstractC13597g0.EnumC13598a.PENDING_OPEN || this.f30416e <= 0) {
                    hashMap = null;
                } else {
                    hashMap = new HashMap();
                    hashMap.put(kVar, this.f30415d.get(kVar));
                }
                if (hashMap != null && !z) {
                    hashMap.remove(kVar);
                }
                if (hashMap != null) {
                    for (C13611a aVar3 : hashMap.values()) {
                        aVar3.m3222b();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void m3227e(AbstractC1874k kVar, Executor executor, AbstractC13612b bVar) {
        boolean z;
        synchronized (this.f30413b) {
            if (!this.f30415d.containsKey(kVar)) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37585j(z, "Camera is already registered: " + kVar);
            this.f30415d.put(kVar, new C13611a(null, executor, bVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0052, B:9:0x0056, B:13:0x0063, B:14:0x0069, B:16:0x0071, B:20:0x0080, B:22:0x0096, B:23:0x0099), top: B:28:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0052, B:9:0x0056, B:13:0x0063, B:14:0x0069, B:16:0x0071, B:20:0x0080, B:22:0x0096, B:23:0x0099), top: B:28:0x0003 }] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m3226f(androidx.camera.core.AbstractC1874k r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f30413b
            monitor-enter(r0)
            java.util.Map<androidx.camera.core.k, w.j0$a> r1 = r9.f30415d     // Catch: all -> 0x009b
            java.lang.Object r1 = r1.get(r10)     // Catch: all -> 0x009b
            w.j0$a r1 = (p390w.C13610j0.C13611a) r1     // Catch: all -> 0x009b
            java.lang.String r2 = "Camera must first be registered with registerCamera()"
            java.lang.Object r1 = androidx.core.util.C2517g.m37587h(r1, r2)     // Catch: all -> 0x009b
            w.j0$a r1 = (p390w.C13610j0.C13611a) r1     // Catch: all -> 0x009b
            java.lang.String r2 = "CameraStateRegistry"
            boolean r2 = androidx.camera.core.C1915r1.m39522f(r2)     // Catch: all -> 0x009b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0052
            java.lang.StringBuilder r2 = r9.f30412a     // Catch: all -> 0x009b
            r2.setLength(r4)     // Catch: all -> 0x009b
            java.lang.StringBuilder r2 = r9.f30412a     // Catch: all -> 0x009b
            java.util.Locale r5 = java.util.Locale.US     // Catch: all -> 0x009b
            java.lang.String r6 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: all -> 0x009b
            r7[r4] = r10     // Catch: all -> 0x009b
            int r10 = r9.f30416e     // Catch: all -> 0x009b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: all -> 0x009b
            r7[r3] = r10     // Catch: all -> 0x009b
            w.g0$a r10 = r1.m3223a()     // Catch: all -> 0x009b
            boolean r10 = m3230b(r10)     // Catch: all -> 0x009b
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch: all -> 0x009b
            r8 = 2
            r7[r8] = r10     // Catch: all -> 0x009b
            w.g0$a r10 = r1.m3223a()     // Catch: all -> 0x009b
            r8 = 3
            r7[r8] = r10     // Catch: all -> 0x009b
            java.lang.String r10 = java.lang.String.format(r5, r6, r7)     // Catch: all -> 0x009b
            r2.append(r10)     // Catch: all -> 0x009b
        L_0x0052:
            int r10 = r9.f30416e     // Catch: all -> 0x009b
            if (r10 > 0) goto L_0x0063
            w.g0$a r10 = r1.m3223a()     // Catch: all -> 0x009b
            boolean r10 = m3230b(r10)     // Catch: all -> 0x009b
            if (r10 == 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r10 = r4
            goto L_0x0069
        L_0x0063:
            w.g0$a r10 = p390w.AbstractC13597g0.EnumC13598a.OPENING     // Catch: all -> 0x009b
            r1.m3221c(r10)     // Catch: all -> 0x009b
            r10 = r3
        L_0x0069:
            java.lang.String r1 = "CameraStateRegistry"
            boolean r1 = androidx.camera.core.C1915r1.m39522f(r1)     // Catch: all -> 0x009b
            if (r1 == 0) goto L_0x0094
            java.lang.StringBuilder r1 = r9.f30412a     // Catch: all -> 0x009b
            java.util.Locale r2 = java.util.Locale.US     // Catch: all -> 0x009b
            java.lang.String r5 = " --> %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: all -> 0x009b
            if (r10 == 0) goto L_0x007e
            java.lang.String r6 = "SUCCESS"
            goto L_0x0080
        L_0x007e:
            java.lang.String r6 = "FAIL"
        L_0x0080:
            r3[r4] = r6     // Catch: all -> 0x009b
            java.lang.String r2 = java.lang.String.format(r2, r5, r3)     // Catch: all -> 0x009b
            r1.append(r2)     // Catch: all -> 0x009b
            java.lang.String r1 = "CameraStateRegistry"
            java.lang.StringBuilder r2 = r9.f30412a     // Catch: all -> 0x009b
            java.lang.String r2 = r2.toString()     // Catch: all -> 0x009b
            androidx.camera.core.C1915r1.m39527a(r1, r2)     // Catch: all -> 0x009b
        L_0x0094:
            if (r10 == 0) goto L_0x0099
            r9.m3228d()     // Catch: all -> 0x009b
        L_0x0099:
            monitor-exit(r0)     // Catch: all -> 0x009b
            return r10
        L_0x009b:
            r10 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x009b
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p390w.C13610j0.m3226f(androidx.camera.core.k):boolean");
    }
}
