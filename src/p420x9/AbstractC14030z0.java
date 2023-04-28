package p420x9;

import android.util.Log;
import java.util.ArrayList;

/* renamed from: x9.z0 */
/* loaded from: classes5.dex */
public abstract class AbstractC14030z0<TListener> {

    /* renamed from: a */
    private TListener f31612a;

    /* renamed from: b */
    private boolean f31613b = false;

    /* renamed from: c */
    final /* synthetic */ AbstractC13957c f31614c;

    public AbstractC14030z0(AbstractC13957c cVar, TListener tlistener) {
        this.f31614c = cVar;
        this.f31612a = tlistener;
    }

    /* renamed from: a */
    protected abstract void mo2013a(TListener tlistener);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo2012b();

    /* renamed from: c */
    public final void m2011c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.f31612a;
            if (this.f31613b) {
                String obj = toString();
                StringBuilder sb2 = new StringBuilder(obj.length() + 47);
                sb2.append("Callback proxy ");
                sb2.append(obj);
                sb2.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb2.toString());
            }
        }
        if (tlistener != null) {
            try {
                mo2013a(tlistener);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f31613b = true;
        }
        m2009e();
    }

    /* renamed from: d */
    public final void m2010d() {
        synchronized (this) {
            this.f31612a = null;
        }
    }

    /* renamed from: e */
    public final void m2009e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        m2010d();
        arrayList = this.f31614c.f39427B;
        synchronized (arrayList) {
            arrayList2 = this.f31614c.f39427B;
            arrayList2.remove(this);
        }
    }
}
