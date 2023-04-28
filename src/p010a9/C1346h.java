package p010a9;

import android.text.TextUtils;
import java.util.ArrayList;
import p079e7.C6728o;
import p119g9.C7570y;
import p317r8.AbstractC12456d;
import p317r8.AbstractC12458f;
import p317r8.C12460h;

/* renamed from: a9.h */
/* loaded from: classes7.dex */
public final class C1346h extends AbstractC12456d {

    /* renamed from: o */
    private final C7570y f274o = new C7570y();

    /* renamed from: p */
    private final C1334a f275p = new C1334a();

    public C1346h() {
        super("WebvttDecoder");
    }

    /* renamed from: B */
    private static int m41267B(C7570y yVar) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = yVar.m22011e();
            String p = yVar.m22000p();
            if (p == null) {
                i = 0;
            } else if ("STYLE".equals(p)) {
                i = 2;
            } else if (p.startsWith("NOTE")) {
                i = 1;
            } else {
                i = 3;
            }
        }
        yVar.m22017P(i2);
        return i;
    }

    /* renamed from: C */
    private static void m41266C(C7570y yVar) {
        do {
        } while (!TextUtils.isEmpty(yVar.m22000p()));
    }

    @Override // p317r8.AbstractC12456d
    /* renamed from: z */
    protected AbstractC12458f mo154z(byte[] bArr, int i, boolean z) {
        C1338e m;
        this.f274o.m22019N(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            C1347i.m41261e(this.f274o);
            do {
            } while (!TextUtils.isEmpty(this.f274o.m22000p()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int B = m41267B(this.f274o);
                if (B == 0) {
                    return new C1349k(arrayList2);
                }
                if (B == 1) {
                    m41266C(this.f274o);
                } else if (B == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f274o.m22000p();
                        arrayList.addAll(this.f275p.m41342d(this.f274o));
                    } else {
                        throw new C12460h("A style block was found after the first cue.");
                    }
                } else if (B == 3 && (m = C1339f.m41293m(this.f274o, arrayList)) != null) {
                    arrayList2.add(m);
                }
            }
        } catch (C6728o e) {
            throw new C12460h(e);
        }
    }
}
