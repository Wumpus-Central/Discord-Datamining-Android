package p208l4;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.C4818h;
import p007a6.C1271b;
import p361u5.AbstractC13192a;
import p380v5.AbstractC13432c;
import p380v5.C13433d;

/* renamed from: l4.a */
/* loaded from: classes7.dex */
public class C10336a implements AbstractC13192a {

    /* renamed from: a */
    private final Resources f22659a;

    /* renamed from: b */
    private final AbstractC13192a f22660b;

    public C10336a(Resources resources, AbstractC13192a aVar) {
        this.f22659a = resources;
        this.f22660b = aVar;
    }

    /* renamed from: c */
    private static boolean m13591c(C13433d dVar) {
        if (dVar.m3727z() == 1 || dVar.m3727z() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m13590d(C13433d dVar) {
        if (dVar.m3735C() == 0 || dVar.m3735C() == -1) {
            return false;
        }
        return true;
    }

    @Override // p361u5.AbstractC13192a
    /* renamed from: a */
    public Drawable mo4368a(AbstractC13432c cVar) {
        try {
            if (C1271b.m41491d()) {
                C1271b.m41494a("DefaultDrawableFactory#createDrawable");
            }
            if (cVar instanceof C13433d) {
                C13433d dVar = (C13433d) cVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f22659a, dVar.mo3732n());
                if (!m13590d(dVar) && !m13591c(dVar)) {
                    return bitmapDrawable;
                }
                C4818h hVar = new C4818h(bitmapDrawable, dVar.m3735C(), dVar.m3727z());
                if (C1271b.m41491d()) {
                    C1271b.m41493b();
                }
                return hVar;
            }
            AbstractC13192a aVar = this.f22660b;
            if (aVar != null && aVar.mo4367b(cVar)) {
                Drawable a = this.f22660b.mo4368a(cVar);
                if (C1271b.m41491d()) {
                    C1271b.m41493b();
                }
                return a;
            } else if (!C1271b.m41491d()) {
                return null;
            } else {
                C1271b.m41493b();
                return null;
            }
        } finally {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
    }

    @Override // p361u5.AbstractC13192a
    /* renamed from: b */
    public boolean mo4367b(AbstractC13432c cVar) {
        return true;
    }
}
