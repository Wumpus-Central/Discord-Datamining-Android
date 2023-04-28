package p010a9;

import java.util.ArrayList;
import java.util.Collections;
import p119g9.C7557q0;
import p119g9.C7570y;
import p317r8.AbstractC12456d;
import p317r8.AbstractC12458f;
import p317r8.C12453b;
import p317r8.C12460h;

/* renamed from: a9.b */
/* loaded from: classes7.dex */
public final class C1335b extends AbstractC12456d {

    /* renamed from: o */
    private final C7570y f228o = new C7570y();

    public C1335b() {
        super("Mp4WebvttDecoder");
    }

    /* renamed from: B */
    private static C12453b m41332B(C7570y yVar, int i) {
        CharSequence charSequence = null;
        C12453b.C0400b bVar = null;
        while (i > 0) {
            if (i >= 8) {
                int n = yVar.m22002n();
                int n2 = yVar.m22002n();
                int i2 = n - 8;
                String F = C7557q0.m22205F(yVar.m22012d(), yVar.m22011e(), i2);
                yVar.m22016Q(i2);
                i = (i - 8) - i2;
                if (n2 == 1937011815) {
                    bVar = C1339f.m41291o(F);
                } else if (n2 == 1885436268) {
                    charSequence = C1339f.m41289q(null, F.trim(), Collections.emptyList());
                }
            } else {
                throw new C12460h("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (bVar != null) {
            return bVar.m6682n(charSequence).m6695a();
        }
        return C1339f.m41294l(charSequence);
    }

    @Override // p317r8.AbstractC12456d
    /* renamed from: z */
    protected AbstractC12458f mo154z(byte[] bArr, int i, boolean z) {
        this.f228o.m22019N(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f228o.m22015a() > 0) {
            if (this.f228o.m22015a() >= 8) {
                int n = this.f228o.m22002n();
                if (this.f228o.m22002n() == 1987343459) {
                    arrayList.add(m41332B(this.f228o, n - 8));
                } else {
                    this.f228o.m22016Q(n - 8);
                }
            } else {
                throw new C12460h("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new C1336c(arrayList);
    }
}
