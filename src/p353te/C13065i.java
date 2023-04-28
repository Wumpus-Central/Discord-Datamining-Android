package p353te;

import android.util.Range;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000¨\u0006\u0006"}, m15073d2 = {"", "minFrameRate", "maxFrameRate", "Landroid/util/Range;", "", "a", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: te.i */
/* loaded from: classes6.dex */
public final class C13065i {
    /* renamed from: a */
    public static final Range<Integer> m4665a(Object obj, Object obj2) {
        String str;
        if (obj instanceof Integer) {
            C9971q.m14635e(obj2, "null cannot be cast to non-null type kotlin.Int");
            return new Range<>((Comparable) obj, (Integer) obj2);
        } else if (obj instanceof Double) {
            Integer valueOf = Integer.valueOf((int) ((Number) obj).doubleValue());
            C9971q.m14635e(obj2, "null cannot be cast to non-null type kotlin.Double");
            return new Range<>(valueOf, Integer.valueOf((int) ((Double) obj2).doubleValue()));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DeviceFormat: frameRateRanges contained a Range that didn't have minFrameRate/maxFrameRate of types Int/Double! Actual Type: ");
            String str2 = null;
            if (obj != null) {
                str = obj.getClass().getName();
            } else {
                str = null;
            }
            sb2.append(str);
            sb2.append(" & ");
            if (obj2 != null) {
                str2 = obj2.getClass().getName();
            }
            sb2.append(str2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
