package p100f9;

import android.net.Uri;

/* renamed from: f9.e */
/* loaded from: classes5.dex */
public final /* synthetic */ class C7093e {
    /* renamed from: a */
    public static long m23429a(AbstractC7094f fVar) {
        return fVar.mo23419a("exo_len", -1L);
    }

    /* renamed from: b */
    public static Uri m23428b(AbstractC7094f fVar) {
        String b = fVar.mo23418b("exo_redir", null);
        if (b == null) {
            return null;
        }
        return Uri.parse(b);
    }
}
