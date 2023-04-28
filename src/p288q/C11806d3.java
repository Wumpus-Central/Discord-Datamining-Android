package p288q;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p288q.AbstractC11912r2;
import p308r.C12255b;
import p308r.C12266f;

/* renamed from: q.d3 */
/* loaded from: classes.dex */
final class C11806d3 extends AbstractC11912r2.AbstractC11913a {

    /* renamed from: a */
    private final List<AbstractC11912r2.AbstractC11913a> f26347a;

    C11806d3(List<AbstractC11912r2.AbstractC11913a> list) {
        ArrayList arrayList = new ArrayList();
        this.f26347a = arrayList;
        arrayList.addAll(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static AbstractC11912r2.AbstractC11913a m8598v(AbstractC11912r2.AbstractC11913a... aVarArr) {
        return new C11806d3(Arrays.asList(aVarArr));
    }

    @Override // p288q.AbstractC11912r2.AbstractC11913a
    /* renamed from: a */
    public void mo8181a(AbstractC11912r2 r2Var) {
        for (AbstractC11912r2.AbstractC11913a aVar : this.f26347a) {
            aVar.mo8181a(r2Var);
        }
    }

    @Override // p288q.AbstractC11912r2.AbstractC11913a
    /* renamed from: o */
    public void mo8167o(AbstractC11912r2 r2Var) {
        for (AbstractC11912r2.AbstractC11913a aVar : this.f26347a) {
            aVar.mo8167o(r2Var);
        }
    }

    @Override // p288q.AbstractC11912r2.AbstractC11913a
    /* renamed from: p */
    public void mo8166p(AbstractC11912r2 r2Var) {
        for (AbstractC11912r2.AbstractC11913a aVar : this.f26347a) {
            aVar.mo8166p(r2Var);
        }
    }

    @Override // p288q.AbstractC11912r2.AbstractC11913a
    /* renamed from: q */
    public void mo8165q(AbstractC11912r2 r2Var) {
        for (AbstractC11912r2.AbstractC11913a aVar : this.f26347a) {
            aVar.mo8165q(r2Var);
        }
    }

    @Override // p288q.AbstractC11912r2.AbstractC11913a
    /* renamed from: r */
    public void mo8164r(AbstractC11912r2 r2Var) {
        for (AbstractC11912r2.AbstractC11913a aVar : this.f26347a) {
            aVar.mo8164r(r2Var);
        }
    }

    @Override // p288q.AbstractC11912r2.AbstractC11913a
    /* renamed from: s */
    public void mo8163s(AbstractC11912r2 r2Var) {
        for (AbstractC11912r2.AbstractC11913a aVar : this.f26347a) {
            aVar.mo8163s(r2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p288q.AbstractC11912r2.AbstractC11913a
    /* renamed from: t */
    public void mo8162t(AbstractC11912r2 r2Var) {
        for (AbstractC11912r2.AbstractC11913a aVar : this.f26347a) {
            aVar.mo8162t(r2Var);
        }
    }

    @Override // p288q.AbstractC11912r2.AbstractC11913a
    /* renamed from: u */
    public void mo8161u(AbstractC11912r2 r2Var, Surface surface) {
        for (AbstractC11912r2.AbstractC11913a aVar : this.f26347a) {
            aVar.mo8161u(r2Var, surface);
        }
    }

    /* renamed from: q.d3$a */
    /* loaded from: classes.dex */
    static class C11807a extends AbstractC11912r2.AbstractC11913a {

        /* renamed from: a */
        private final CameraCaptureSession.StateCallback f26348a;

        C11807a(CameraCaptureSession.StateCallback stateCallback) {
            this.f26348a = stateCallback;
        }

        @Override // p288q.AbstractC11912r2.AbstractC11913a
        /* renamed from: a */
        public void mo8181a(AbstractC11912r2 r2Var) {
            this.f26348a.onActive(r2Var.mo8170l().m7225c());
        }

        @Override // p288q.AbstractC11912r2.AbstractC11913a
        /* renamed from: o */
        public void mo8167o(AbstractC11912r2 r2Var) {
            C12266f.m7253b(this.f26348a, r2Var.mo8170l().m7225c());
        }

        @Override // p288q.AbstractC11912r2.AbstractC11913a
        /* renamed from: p */
        public void mo8166p(AbstractC11912r2 r2Var) {
            this.f26348a.onClosed(r2Var.mo8170l().m7225c());
        }

        @Override // p288q.AbstractC11912r2.AbstractC11913a
        /* renamed from: q */
        public void mo8165q(AbstractC11912r2 r2Var) {
            this.f26348a.onConfigureFailed(r2Var.mo8170l().m7225c());
        }

        @Override // p288q.AbstractC11912r2.AbstractC11913a
        /* renamed from: r */
        public void mo8164r(AbstractC11912r2 r2Var) {
            this.f26348a.onConfigured(r2Var.mo8170l().m7225c());
        }

        @Override // p288q.AbstractC11912r2.AbstractC11913a
        /* renamed from: s */
        public void mo8163s(AbstractC11912r2 r2Var) {
            this.f26348a.onReady(r2Var.mo8170l().m7225c());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p288q.AbstractC11912r2.AbstractC11913a
        /* renamed from: t */
        public void mo8162t(AbstractC11912r2 r2Var) {
        }

        @Override // p288q.AbstractC11912r2.AbstractC11913a
        /* renamed from: u */
        public void mo8161u(AbstractC11912r2 r2Var, Surface surface) {
            C12255b.m7261a(this.f26348a, r2Var.mo8170l().m7225c(), surface);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C11807a(List<CameraCaptureSession.StateCallback> list) {
            this(C11834i1.m8535a(list));
        }
    }
}
