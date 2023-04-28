package p328s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: s.q */
/* loaded from: classes.dex */
public final class C12754q {

    /* renamed from: a */
    private final AbstractC12757c f28609a;

    /* renamed from: s.q$b */
    /* loaded from: classes.dex */
    private static final class C12756b implements AbstractC12757c {

        /* renamed from: a */
        private final List<C12735b> f28612a;

        /* renamed from: b */
        private final CameraCaptureSession.StateCallback f28613b;

        /* renamed from: c */
        private final Executor f28614c;

        /* renamed from: d */
        private int f28615d;

        /* renamed from: e */
        private C12732a f28616e = null;

        /* renamed from: f */
        private CaptureRequest f28617f = null;

        C12756b(int i, List<C12735b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f28615d = i;
            this.f28612a = Collections.unmodifiableList(new ArrayList(list));
            this.f28613b = stateCallback;
            this.f28614c = executor;
        }

        @Override // p328s.C12754q.AbstractC12757c
        /* renamed from: a */
        public C12732a mo5554a() {
            return this.f28616e;
        }

        @Override // p328s.C12754q.AbstractC12757c
        /* renamed from: b */
        public Executor mo5553b() {
            return this.f28614c;
        }

        @Override // p328s.C12754q.AbstractC12757c
        /* renamed from: c */
        public CameraCaptureSession.StateCallback mo5552c() {
            return this.f28613b;
        }

        @Override // p328s.C12754q.AbstractC12757c
        /* renamed from: d */
        public List<C12735b> mo5551d() {
            return this.f28612a;
        }

        @Override // p328s.C12754q.AbstractC12757c
        /* renamed from: e */
        public Object mo5550e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C12756b) {
                C12756b bVar = (C12756b) obj;
                if (Objects.equals(this.f28616e, bVar.f28616e) && this.f28615d == bVar.f28615d && this.f28612a.size() == bVar.f28612a.size()) {
                    for (int i = 0; i < this.f28612a.size(); i++) {
                        if (!this.f28612a.get(i).equals(bVar.f28612a.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // p328s.C12754q.AbstractC12757c
        /* renamed from: f */
        public int mo5549f() {
            return this.f28615d;
        }

        @Override // p328s.C12754q.AbstractC12757c
        /* renamed from: g */
        public void mo5548g(CaptureRequest captureRequest) {
            this.f28617f = captureRequest;
        }

        public int hashCode() {
            int i;
            int hashCode = this.f28612a.hashCode() ^ 31;
            int i2 = (hashCode << 5) - hashCode;
            C12732a aVar = this.f28616e;
            if (aVar == null) {
                i = 0;
            } else {
                i = aVar.hashCode();
            }
            int i3 = i ^ i2;
            return this.f28615d ^ ((i3 << 5) - i3);
        }
    }

    /* renamed from: s.q$c */
    /* loaded from: classes.dex */
    private interface AbstractC12757c {
        /* renamed from: a */
        C12732a mo5554a();

        /* renamed from: b */
        Executor mo5553b();

        /* renamed from: c */
        CameraCaptureSession.StateCallback mo5552c();

        /* renamed from: d */
        List<C12735b> mo5551d();

        /* renamed from: e */
        Object mo5550e();

        /* renamed from: f */
        int mo5549f();

        /* renamed from: g */
        void mo5548g(CaptureRequest captureRequest);
    }

    public C12754q(int i, List<C12735b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f28609a = new C12756b(i, list, executor, stateCallback);
        } else {
            this.f28609a = new C12755a(i, list, executor, stateCallback);
        }
    }

    /* renamed from: g */
    public static List<OutputConfiguration> m5557g(List<C12735b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C12735b bVar : list) {
            arrayList.add((OutputConfiguration) bVar.m5584d());
        }
        return arrayList;
    }

    /* renamed from: h */
    static List<C12735b> m5556h(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (OutputConfiguration outputConfiguration : list) {
            arrayList.add(C12735b.m5583e(outputConfiguration));
        }
        return arrayList;
    }

    /* renamed from: a */
    public Executor m5563a() {
        return this.f28609a.mo5553b();
    }

    /* renamed from: b */
    public C12732a m5562b() {
        return this.f28609a.mo5554a();
    }

    /* renamed from: c */
    public List<C12735b> m5561c() {
        return this.f28609a.mo5551d();
    }

    /* renamed from: d */
    public int m5560d() {
        return this.f28609a.mo5549f();
    }

    /* renamed from: e */
    public CameraCaptureSession.StateCallback m5559e() {
        return this.f28609a.mo5552c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12754q)) {
            return false;
        }
        return this.f28609a.equals(((C12754q) obj).f28609a);
    }

    /* renamed from: f */
    public void m5558f(CaptureRequest captureRequest) {
        this.f28609a.mo5548g(captureRequest);
    }

    public int hashCode() {
        return this.f28609a.hashCode();
    }

    /* renamed from: i */
    public Object m5555i() {
        return this.f28609a.mo5550e();
    }

    /* renamed from: s.q$a */
    /* loaded from: classes.dex */
    private static final class C12755a implements AbstractC12757c {

        /* renamed from: a */
        private final SessionConfiguration f28610a;

        /* renamed from: b */
        private final List<C12735b> f28611b;

        C12755a(Object obj) {
            List outputConfigurations;
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f28610a = sessionConfiguration;
            outputConfigurations = sessionConfiguration.getOutputConfigurations();
            this.f28611b = Collections.unmodifiableList(C12754q.m5556h(outputConfigurations));
        }

        @Override // p328s.C12754q.AbstractC12757c
        /* renamed from: a */
        public C12732a mo5554a() {
            InputConfiguration inputConfiguration;
            inputConfiguration = this.f28610a.getInputConfiguration();
            return C12732a.m5589b(inputConfiguration);
        }

        @Override // p328s.C12754q.AbstractC12757c
        /* renamed from: b */
        public Executor mo5553b() {
            Executor executor;
            executor = this.f28610a.getExecutor();
            return executor;
        }

        @Override // p328s.C12754q.AbstractC12757c
        /* renamed from: c */
        public CameraCaptureSession.StateCallback mo5552c() {
            CameraCaptureSession.StateCallback stateCallback;
            stateCallback = this.f28610a.getStateCallback();
            return stateCallback;
        }

        @Override // p328s.C12754q.AbstractC12757c
        /* renamed from: d */
        public List<C12735b> mo5551d() {
            return this.f28611b;
        }

        @Override // p328s.C12754q.AbstractC12757c
        /* renamed from: e */
        public Object mo5550e() {
            return this.f28610a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12755a)) {
                return false;
            }
            return Objects.equals(this.f28610a, ((C12755a) obj).f28610a);
        }

        @Override // p328s.C12754q.AbstractC12757c
        /* renamed from: f */
        public int mo5549f() {
            int sessionType;
            sessionType = this.f28610a.getSessionType();
            return sessionType;
        }

        @Override // p328s.C12754q.AbstractC12757c
        /* renamed from: g */
        public void mo5548g(CaptureRequest captureRequest) {
            this.f28610a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            int hashCode;
            hashCode = this.f28610a.hashCode();
            return hashCode;
        }

        C12755a(int i, List<C12735b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i, C12754q.m5557g(list), executor, stateCallback));
        }
    }
}
