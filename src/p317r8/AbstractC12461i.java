package p317r8;

import p010a9.C1335b;
import p010a9.C1346h;
import p079e7.C6722k;
import p337s8.C12814a;
import p337s8.C12816c;
import p349t8.C13002a;
import p364u8.C13213a;
import p399w8.C13805a;
import p419x8.C13949a;
import p440y8.C14312c;
import p460z8.C14586a;

/* renamed from: r8.i */
/* loaded from: classes7.dex */
public interface AbstractC12461i {

    /* renamed from: a */
    public static final AbstractC12461i f28114a = new C12462a();

    /* renamed from: r8.i$a */
    /* loaded from: classes7.dex */
    class C12462a implements AbstractC12461i {
        C12462a() {
        }

        @Override // p317r8.AbstractC12461i
        /* renamed from: a */
        public boolean mo6668a(C6722k kVar) {
            String str = kVar.f14329v;
            if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str)) {
                return true;
            }
            return false;
        }

        @Override // p317r8.AbstractC12461i
        /* renamed from: b */
        public AbstractC12459g mo6667b(C6722k kVar) {
            String str = kVar.f14329v;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c = '\n';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new C13002a(kVar.f14331x);
                    case 1:
                        return new C13213a();
                    case 2:
                        return new C1335b();
                    case 3:
                        return new C1346h();
                    case 4:
                        return new C14586a(kVar.f14331x);
                    case 5:
                        return new C13805a(kVar.f14331x);
                    case 6:
                    case 7:
                        return new C12814a(str, kVar.f37974N, 16000L);
                    case '\b':
                        return new C12816c(kVar.f37974N, kVar.f14331x);
                    case '\t':
                        return new C13949a();
                    case '\n':
                        return new C14312c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    /* renamed from: a */
    boolean mo6668a(C6722k kVar);

    /* renamed from: b */
    AbstractC12459g mo6667b(C6722k kVar);
}
