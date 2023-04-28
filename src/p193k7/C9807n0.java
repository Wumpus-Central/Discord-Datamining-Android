package p193k7;

import android.util.Pair;
import java.util.Map;

/* renamed from: k7.n0 */
/* loaded from: classes7.dex */
public final class C9807n0 {
    /* renamed from: a */
    private static long m15309a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: b */
    public static Pair<Long, Long> m15308b(AbstractC9805n nVar) {
        Map<String, String> g = nVar.mo15310g();
        if (g == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(m15309a(g, "LicenseDurationRemaining")), Long.valueOf(m15309a(g, "PlaybackDurationRemaining")));
    }
}
