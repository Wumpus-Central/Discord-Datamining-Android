package p390w;

import androidx.camera.core.AbstractC1874k;
import androidx.camera.core.AbstractC1911r;
import androidx.camera.core.AbstractC1948w2;
import java.util.Collection;

/* renamed from: w.g0 */
/* loaded from: classes.dex */
public interface AbstractC13597g0 extends AbstractC1874k, AbstractC1948w2.AbstractC1952d {

    /* renamed from: w.g0$a */
    /* loaded from: classes.dex */
    public enum EnumC13598a {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);
        

        /* renamed from: k */
        private final boolean f30401k;

        EnumC13598a(boolean z) {
            this.f30401k = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m3263a() {
            return this.f30401k;
        }
    }

    @Override // androidx.camera.core.AbstractC1874k
    /* renamed from: a */
    AbstractC1911r mo330a();

    /* renamed from: d */
    void mo3270d(AbstractC13688w wVar);

    /* renamed from: f */
    AbstractC13571b0 mo3269f();

    /* renamed from: g */
    void mo3268g(boolean z);

    /* renamed from: h */
    void mo3267h(Collection<AbstractC1948w2> collection);

    /* renamed from: i */
    void mo3266i(Collection<AbstractC1948w2> collection);

    /* renamed from: j */
    AbstractC13589e0 mo3265j();

    /* renamed from: l */
    AbstractC13568a2<EnumC13598a> mo3264l();
}
