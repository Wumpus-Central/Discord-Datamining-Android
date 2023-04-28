package p213l9;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p213l9.AbstractC10366g;

/* renamed from: l9.g */
/* loaded from: classes5.dex */
public abstract class AbstractC10366g<T extends AbstractC10366g> {
    public static String zza(Object obj) {
        return zzd(obj, 0);
    }

    private static String zzd(Object obj, int i) {
        if (i > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            if (TextUtils.isEmpty((String) obj)) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Long) {
            if (((Long) obj).longValue() == 0) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == 0.0d) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Boolean) {
            if (!((Boolean) obj).booleanValue()) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof List) {
            StringBuilder sb2 = new StringBuilder();
            if (i > 0) {
                sb2.append("[");
            }
            int length = sb2.length();
            for (Object obj2 : (List) obj) {
                if (sb2.length() > length) {
                    sb2.append(", ");
                }
                sb2.append(zzd(obj2, i + 1));
            }
            if (i > 0) {
                sb2.append("]");
            }
            return sb2.toString();
        } else if (!(obj instanceof Map)) {
            return obj.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            boolean z = false;
            int i2 = 0;
            for (Map.Entry entry : new TreeMap((Map) obj).entrySet()) {
                String zzd = zzd(entry.getValue(), i + 1);
                if (!TextUtils.isEmpty(zzd)) {
                    if (i > 0 && !z) {
                        sb3.append("{");
                        i2 = sb3.length();
                        z = true;
                    }
                    if (sb3.length() > i2) {
                        sb3.append(", ");
                    }
                    sb3.append((String) entry.getKey());
                    sb3.append('=');
                    sb3.append(zzd);
                }
            }
            if (z) {
                sb3.append("}");
            }
            return sb3.toString();
        }
    }
}
