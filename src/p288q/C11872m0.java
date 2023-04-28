package p288q;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import androidx.camera.core.AbstractC1801d3;
import androidx.camera.core.AbstractC1926u;
import androidx.camera.core.C1915r1;
import androidx.core.util.C2517g;
import androidx.lifecycle.C3044p;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p288q.C11872m0;
import p308r.C12267f0;
import p308r.C12275i;
import p308r.C12306v0;
import p340t.C12919g;
import p374v.C13382h;
import p390w.AbstractC13589e0;
import p390w.AbstractC13605i;
import p390w.AbstractC13615k;
import p390w.C13600g2;

/* renamed from: q.m0 */
/* loaded from: classes.dex */
public final class C11872m0 implements AbstractC13589e0 {

    /* renamed from: a */
    private final String f26508a;

    /* renamed from: b */
    private final C12267f0 f26509b;

    /* renamed from: e */
    private C11935w f26512e;

    /* renamed from: j */
    private final C13600g2 f26517j;

    /* renamed from: k */
    private final AbstractC13605i f26518k;

    /* renamed from: l */
    private final C12306v0 f26519l;

    /* renamed from: d */
    private final Object f26511d = new Object();

    /* renamed from: f */
    private C11873a<Integer> f26513f = null;

    /* renamed from: g */
    private C11873a<AbstractC1801d3> f26514g = null;

    /* renamed from: i */
    private List<Pair<AbstractC13615k, Executor>> f26516i = null;

    /* renamed from: c */
    private final C13382h f26510c = new C13382h(this);

    /* renamed from: h */
    private final C11873a<AbstractC1926u> f26515h = new C11873a<>(AbstractC1926u.m39506a(AbstractC1926u.EnumC1928b.CLOSED));

    /* renamed from: q.m0$a */
    /* loaded from: classes.dex */
    static class C11873a<T> extends C3044p<T> {

        /* renamed from: m */
        private LiveData<T> f26520m;

        /* renamed from: n */
        private T f26521n;

        C11873a(T t) {
            this.f26521n = t;
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: f */
        public T mo8408f() {
            LiveData<T> liveData = this.f26520m;
            return liveData == null ? this.f26521n : liveData.mo8408f();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: r */
        void m8407r(LiveData<T> liveData) {
            LiveData liveData2 = (LiveData<T>) this.f26520m;
            if (liveData2 != null) {
                super.m35762q(liveData2);
            }
            this.f26520m = liveData;
            super.m35763p(liveData, new Observer() { // from class: q.l0
                @Override // androidx.lifecycle.Observer
                /* renamed from: a */
                public final void mo3067a(Object obj) {
                    C11872m0.C11873a.this.mo35726o(obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11872m0(String str, C12306v0 v0Var) {
        String str2 = (String) C2517g.m37588g(str);
        this.f26508a = str2;
        this.f26519l = v0Var;
        C12267f0 c = v0Var.m7180c(str2);
        this.f26509b = c;
        this.f26517j = C12919g.m5069a(str, c);
        this.f26518k = new C11813f(str, c);
    }

    /* renamed from: p */
    private void m8411p() {
        m8410q();
    }

    /* renamed from: q */
    private void m8410q() {
        String str;
        int n = m8413n();
        if (n == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (n == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (n == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (n == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (n != 4) {
            str = "Unknown value: " + n;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        C1915r1.m39523e("Camera2CameraInfo", "Device Level: " + str);
    }

    @Override // p390w.AbstractC13589e0
    /* renamed from: a */
    public void mo3298a(AbstractC13615k kVar) {
        synchronized (this.f26511d) {
            C11935w wVar = this.f26512e;
            if (wVar == null) {
                List<Pair<AbstractC13615k, Executor>> list = this.f26516i;
                if (list != null) {
                    Iterator<Pair<AbstractC13615k, Executor>> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().first == kVar) {
                            it.remove();
                        }
                    }
                    return;
                }
                return;
            }
            wVar.m8255b0(kVar);
        }
    }

    @Override // p390w.AbstractC13589e0
    /* renamed from: b */
    public String mo3297b() {
        return this.f26508a;
    }

    @Override // p390w.AbstractC13589e0
    /* renamed from: c */
    public Integer mo3296c() {
        Integer num = (Integer) this.f26509b.m7252a(CameraCharacteristics.LENS_FACING);
        C2517g.m37588g(num);
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue != 1) {
            return null;
        }
        return 1;
    }

    @Override // p390w.AbstractC13589e0
    /* renamed from: d */
    public AbstractC13605i mo3295d() {
        return this.f26518k;
    }

    @Override // p390w.AbstractC13589e0
    /* renamed from: e */
    public C13600g2 mo3294e() {
        return this.f26517j;
    }

    @Override // androidx.camera.core.AbstractC1911r
    /* renamed from: f */
    public String mo8420f() {
        return m8413n() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (1 == r1.intValue()) goto L_0x001b;
     */
    @Override // androidx.camera.core.AbstractC1911r
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo8419g(int r4) {
        /*
            r3 = this;
            int r0 = r3.m8414m()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = androidx.camera.core.impl.utils.C1838b.m39691b(r4)
            java.lang.Integer r1 = r3.mo3296c()
            if (r1 == 0) goto L_0x001a
            int r1 = r1.intValue()
            r2 = 1
            if (r2 != r1) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            int r0 = r0.intValue()
            int r4 = androidx.camera.core.impl.utils.C1838b.m39692a(r4, r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p288q.C11872m0.mo8419g(int):int");
    }

    @Override // p390w.AbstractC13589e0
    /* renamed from: h */
    public void mo3293h(Executor executor, AbstractC13615k kVar) {
        synchronized (this.f26511d) {
            C11935w wVar = this.f26512e;
            if (wVar == null) {
                if (this.f26516i == null) {
                    this.f26516i = new ArrayList();
                }
                this.f26516i.add(new Pair<>(kVar, executor));
                return;
            }
            wVar.m8234u(executor, kVar);
        }
    }

    @Override // androidx.camera.core.AbstractC1911r
    /* renamed from: i */
    public LiveData<AbstractC1801d3> mo8418i() {
        synchronized (this.f26511d) {
            C11935w wVar = this.f26512e;
            if (wVar == null) {
                if (this.f26514g == null) {
                    this.f26514g = new C11873a<>(C11862k3.m8434f(this.f26509b));
                }
                return this.f26514g;
            }
            C11873a<AbstractC1801d3> aVar = this.f26514g;
            if (aVar != null) {
                return aVar;
            }
            return wVar.m8272K().m8433g();
        }
    }

    /* renamed from: j */
    public C13382h m8417j() {
        return this.f26510c;
    }

    /* renamed from: k */
    public C12267f0 m8416k() {
        return this.f26509b;
    }

    /* renamed from: l */
    public Map<String, CameraCharacteristics> m8415l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(this.f26508a, this.f26509b.m7249d());
        for (String str : this.f26509b.m7251b()) {
            if (!Objects.equals(str, this.f26508a)) {
                try {
                    linkedHashMap.put(str, this.f26519l.m7180c(str).m7249d());
                } catch (C12275i e) {
                    C1915r1.m39524d("Camera2CameraInfo", "Failed to get CameraCharacteristics for cameraId " + str, e);
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: m */
    int m8414m() {
        Integer num = (Integer) this.f26509b.m7252a(CameraCharacteristics.SENSOR_ORIENTATION);
        C2517g.m37588g(num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int m8413n() {
        Integer num = (Integer) this.f26509b.m7252a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        C2517g.m37588g(num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m8412o(C11935w wVar) {
        synchronized (this.f26511d) {
            this.f26512e = wVar;
            C11873a<AbstractC1801d3> aVar = this.f26514g;
            if (aVar != null) {
                aVar.m8407r(wVar.m8272K().m8433g());
            }
            C11873a<Integer> aVar2 = this.f26513f;
            if (aVar2 != null) {
                aVar2.m8407r(this.f26512e.m8274I().m8541f());
            }
            List<Pair<AbstractC13615k, Executor>> list = this.f26516i;
            if (list != null) {
                for (Pair<AbstractC13615k, Executor> pair : list) {
                    this.f26512e.m8234u((Executor) pair.second, (AbstractC13615k) pair.first);
                }
                this.f26516i = null;
            }
        }
        m8411p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m8409r(LiveData<AbstractC1926u> liveData) {
        this.f26515h.m8407r(liveData);
    }
}
