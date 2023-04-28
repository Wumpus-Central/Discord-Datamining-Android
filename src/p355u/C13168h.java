package p355u;

import android.util.Size;
import p340t.C12921i;
import p340t.C12931s;
import p390w.AbstractC13658q2;

/* renamed from: u.h */
/* loaded from: classes.dex */
public class C13168h {

    /* renamed from: a */
    private final C12931s f29522a;

    public C13168h() {
        this((C12931s) C12921i.m5067a(C12931s.class));
    }

    /* renamed from: a */
    public Size m4429a(Size size) {
        boolean z;
        C12931s sVar = this.f29522a;
        if (sVar == null) {
            return size;
        }
        Size c = sVar.m5040c(AbstractC13658q2.EnumC13660b.PRIV);
        if (c == null) {
            return size;
        }
        if (c.getWidth() * c.getHeight() > size.getWidth() * size.getHeight()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return c;
        }
        return size;
    }

    C13168h(C12931s sVar) {
        this.f29522a = sVar;
    }
}
