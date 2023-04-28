package p328s;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.C2517g;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s.f */
/* loaded from: classes.dex */
public class C12741f extends C12739e {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s.f$a */
    /* loaded from: classes.dex */
    public static final class C12742a {

        /* renamed from: a */
        final OutputConfiguration f28600a;

        /* renamed from: b */
        String f28601b;

        C12742a(OutputConfiguration outputConfiguration) {
            this.f28600a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12742a)) {
                return false;
            }
            C12742a aVar = (C12742a) obj;
            if (!Objects.equals(this.f28600a, aVar.f28600a) || !Objects.equals(this.f28601b, aVar.f28601b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            int i;
            hashCode = this.f28600a.hashCode();
            int i2 = hashCode ^ 31;
            int i3 = (i2 << 5) - i2;
            String str = this.f28601b;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            return i ^ i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12741f(Surface surface) {
        this(new C12742a(new OutputConfiguration(surface)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C12741f m5579e(OutputConfiguration outputConfiguration) {
        return new C12741f(new C12742a(outputConfiguration));
    }

    @Override // p328s.C12739e, p328s.C12745i, p328s.C12735b.AbstractC12736a
    /* renamed from: a */
    public void mo5576a(String str) {
        ((C12742a) this.f28602a).f28601b = str;
    }

    @Override // p328s.C12739e, p328s.C12745i, p328s.C12735b.AbstractC12736a
    /* renamed from: b */
    public String mo5575b() {
        return ((C12742a) this.f28602a).f28601b;
    }

    @Override // p328s.C12739e, p328s.C12745i, p328s.C12735b.AbstractC12736a
    /* renamed from: c */
    public Object mo5574c() {
        C2517g.m37594a(this.f28602a instanceof C12742a);
        return ((C12742a) this.f28602a).f28600a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12741f(Object obj) {
        super(obj);
    }
}
