package p029b9;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.TrackGroupArray;
import p079e7.AbstractC6733t;
import p081e9.AbstractC6769e;
import p119g9.C7510a;
import p153i8.AbstractC8299u;

/* renamed from: b9.m */
/* loaded from: classes5.dex */
public abstract class AbstractC3425m {

    /* renamed from: a */
    private AbstractC3426a f5561a;

    /* renamed from: b */
    private AbstractC6769e f5562b;

    /* renamed from: b9.m$a */
    /* loaded from: classes5.dex */
    public interface AbstractC3426a {
        /* renamed from: b */
        void mo30210b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final AbstractC6769e m34404a() {
        return (AbstractC6769e) C7510a.m22367e(this.f5562b);
    }

    /* renamed from: b */
    public final void m34403b(AbstractC3426a aVar, AbstractC6769e eVar) {
        this.f5561a = aVar;
        this.f5562b = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m34402c() {
        AbstractC3426a aVar = this.f5561a;
        if (aVar != null) {
            aVar.mo30210b();
        }
    }

    /* renamed from: d */
    public abstract void mo34401d(Object obj);

    /* renamed from: e */
    public abstract C3427n mo34400e(AbstractC6733t[] tVarArr, TrackGroupArray trackGroupArray, AbstractC8299u.C8300a aVar, Timeline timeline);
}
