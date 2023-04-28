package p420x9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import p365u9.C13215a;
import p420x9.AbstractC13957c;

/* renamed from: x9.c1 */
/* loaded from: classes5.dex */
public final class C13963c1 extends AbstractC14014s0 {

    /* renamed from: g */
    public final IBinder f31480g;

    /* renamed from: h */
    final /* synthetic */ AbstractC13957c f31481h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13963c1(AbstractC13957c cVar, int i, IBinder iBinder, Bundle bundle) {
        super(cVar, i, bundle);
        this.f31481h = cVar;
        this.f31480g = iBinder;
    }

    @Override // p420x9.AbstractC14014s0
    /* renamed from: f */
    protected final void mo2031f(C13215a aVar) {
        if (this.f31481h.f39431F != null) {
            this.f31481h.f39431F.mo2107b(aVar);
        }
        this.f31481h.m2184K(aVar);
    }

    @Override // p420x9.AbstractC14014s0
    /* renamed from: g */
    protected final boolean mo2030g() {
        AbstractC13957c.AbstractC13958a aVar;
        AbstractC13957c.AbstractC13958a aVar2;
        try {
            IBinder iBinder = this.f31480g;
            C14004p.m2051j(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f31481h.mo146D().equals(interfaceDescriptor)) {
                String D = this.f31481h.mo146D();
                StringBuilder sb2 = new StringBuilder(String.valueOf(D).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(D);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface r = this.f31481h.mo142r(this.f31480g);
            if (r == null || (!AbstractC13957c.m2159e0(this.f31481h, 2, 4, r) && !AbstractC13957c.m2159e0(this.f31481h, 3, 4, r))) {
                return false;
            }
            this.f31481h.f39435J = null;
            Bundle w = this.f31481h.m2147w();
            AbstractC13957c cVar = this.f31481h;
            aVar = cVar.f39430E;
            if (aVar == null) {
                return true;
            }
            aVar2 = cVar.f39430E;
            aVar2.mo2116c(w);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
