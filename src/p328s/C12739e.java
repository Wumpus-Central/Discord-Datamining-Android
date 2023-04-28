package p328s;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.C2517g;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s.e */
/* loaded from: classes.dex */
public class C12739e extends C12745i {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s.e$a */
    /* loaded from: classes.dex */
    public static final class C12740a {

        /* renamed from: a */
        final OutputConfiguration f28597a;

        /* renamed from: b */
        String f28598b;

        /* renamed from: c */
        boolean f28599c;

        C12740a(OutputConfiguration outputConfiguration) {
            this.f28597a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12740a)) {
                return false;
            }
            C12740a aVar = (C12740a) obj;
            if (!Objects.equals(this.f28597a, aVar.f28597a) || this.f28599c != aVar.f28599c || !Objects.equals(this.f28598b, aVar.f28598b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            int i;
            hashCode = this.f28597a.hashCode();
            int i2 = hashCode ^ 31;
            int i3 = (this.f28599c ? 1 : 0) ^ ((i2 << 5) - i2);
            int i4 = (i3 << 5) - i3;
            String str = this.f28598b;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            return i ^ i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12739e(Surface surface) {
        this(new C12740a(new OutputConfiguration(surface)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C12739e m5580d(OutputConfiguration outputConfiguration) {
        return new C12739e(new C12740a(outputConfiguration));
    }

    @Override // p328s.C12745i, p328s.C12735b.AbstractC12736a
    /* renamed from: a */
    public void mo5576a(String str) {
        ((C12740a) this.f28602a).f28598b = str;
    }

    @Override // p328s.C12745i, p328s.C12735b.AbstractC12736a
    /* renamed from: b */
    public String mo5575b() {
        return ((C12740a) this.f28602a).f28598b;
    }

    @Override // p328s.C12745i, p328s.C12735b.AbstractC12736a
    /* renamed from: c */
    public Object mo5574c() {
        C2517g.m37594a(this.f28602a instanceof C12740a);
        return ((C12740a) this.f28602a).f28597a;
    }

    @Override // p328s.C12745i, p328s.C12735b.AbstractC12736a
    public Surface getSurface() {
        Surface surface;
        surface = ((OutputConfiguration) mo5574c()).getSurface();
        return surface;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12739e(Object obj) {
        super(obj);
    }
}
