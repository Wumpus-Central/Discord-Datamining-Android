package p033c0;

import android.media.MediaCodec;
import androidx.camera.core.C1770a2;
import androidx.camera.core.C1781b3;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p020b0.C3336a;
import p020b0.C3341f;
import p390w.AbstractC13689w0;

/* renamed from: c0.c */
/* loaded from: classes.dex */
public class C3751c {

    /* renamed from: a */
    private final boolean f6093a;

    public C3751c() {
        boolean z;
        if (C3336a.m34622a(C3341f.class) != null) {
            z = true;
        } else {
            z = false;
        }
        this.f6093a = z;
    }

    /* renamed from: b */
    private int m33693b(AbstractC13689w0 w0Var) {
        if (w0Var.m3021e() == MediaCodec.class || w0Var.m3021e() == C1781b3.class) {
            return 2;
        }
        if (w0Var.m3021e() == C1770a2.class) {
            return 0;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ int m33692c(AbstractC13689w0 w0Var, AbstractC13689w0 w0Var2) {
        return m33693b(w0Var) - m33693b(w0Var2);
    }

    /* renamed from: d */
    public void m33691d(List<AbstractC13689w0> list) {
        if (this.f6093a) {
            Collections.sort(list, new Comparator() { // from class: c0.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int c;
                    c = C3751c.this.m33692c((AbstractC13689w0) obj, (AbstractC13689w0) obj2);
                    return c;
                }
            });
        }
    }
}
