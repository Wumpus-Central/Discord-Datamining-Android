package p053d0;

import android.util.Size;
import androidx.camera.core.impl.utils.C1838b;
import p390w.AbstractC13617k1;
import p390w.AbstractC13697x2;

/* renamed from: d0.b */
/* loaded from: classes.dex */
public final class C6390b {
    /* renamed from: a */
    public static void m25634a(AbstractC13697x2.AbstractC13698a<?, ?, ?> aVar, int i) {
        Size y;
        AbstractC13617k1 k1Var = (AbstractC13617k1) aVar.mo2998d();
        int t = k1Var.mo2961t(-1);
        if (t == -1 || t != i) {
            ((AbstractC13617k1.AbstractC13618a) aVar).mo3209b(i);
        }
        if (t != -1 && i != -1 && t != i) {
            if (Math.abs(C1838b.m39691b(i) - C1838b.m39691b(t)) % 180 == 90 && (y = k1Var.mo2958y(null)) != null) {
                ((AbstractC13617k1.AbstractC13618a) aVar).mo3208c(new Size(y.getHeight(), y.getWidth()));
            }
        }
    }
}
