package p459z7;

import p009a8.C1333b;
import p028b8.C3397b;
import p061d8.C6401a;
import p079e7.C6722k;
import p080e8.C6750h;
import p118g8.C7498c;

/* renamed from: z7.d */
/* loaded from: classes7.dex */
public interface AbstractC14580d {

    /* renamed from: a */
    public static final AbstractC14580d f33048a = new C14581a();

    /* renamed from: z7.d$a */
    /* loaded from: classes7.dex */
    class C14581a implements AbstractC14580d {
        C14581a() {
        }

        @Override // p459z7.AbstractC14580d
        /* renamed from: a */
        public boolean mo176a(C6722k kVar) {
            String str = kVar.f14329v;
            if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
                return true;
            }
            return false;
        }

        @Override // p459z7.AbstractC14580d
        /* renamed from: b */
        public AbstractC14579c mo175b(C6722k kVar) {
            String str = kVar.f14329v;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new C1333b();
                    case 1:
                        return new C6401a();
                    case 2:
                        return new C6750h();
                    case 3:
                        return new C3397b();
                    case 4:
                        return new C7498c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    /* renamed from: a */
    boolean mo176a(C6722k kVar);

    /* renamed from: b */
    AbstractC14579c mo175b(C6722k kVar);
}
