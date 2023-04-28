package p145i0;

import androidx.core.util.C2517g;

/* renamed from: i0.y0 */
/* loaded from: classes.dex */
public abstract class AbstractC8203y0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static AbstractC8203y0 m20310d(long j, long j2, AbstractC8108b bVar) {
        boolean z;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C2517g.m37593b(z, "duration must be positive value.");
        if (j2 < 0) {
            z2 = false;
        }
        C2517g.m37593b(z2, "bytes must be positive value.");
        return new C8153k(j, j2, bVar);
    }

    /* renamed from: a */
    public abstract AbstractC8108b mo20313a();

    /* renamed from: b */
    public abstract long mo20312b();

    /* renamed from: c */
    public abstract long mo20311c();
}
