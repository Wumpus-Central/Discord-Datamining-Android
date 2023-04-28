package pa;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: pa.s */
/* loaded from: classes3.dex */
public final class C11607s {
    /* renamed from: a */
    public static String m9272a(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        String sb2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb3 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb3.append(name);
                    sb3.append('@');
                    sb3.append(hexString);
                    String sb4 = sb3.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    if (sb4.length() != 0) {
                        str2 = "Exception during lenientFormat for ".concat(sb4);
                    } else {
                        str2 = new String("Exception during lenientFormat for ");
                    }
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", str2, (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb5 = new StringBuilder(sb4.length() + 9 + name2.length());
                    sb5.append("<");
                    sb5.append(sb4);
                    sb5.append(" threw ");
                    sb5.append(name2);
                    sb5.append(">");
                    sb2 = sb5.toString();
                }
            }
            objArr[i2] = sb2;
            i2++;
        }
        StringBuilder sb6 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb6.append((CharSequence) str, i3, indexOf);
            sb6.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb6.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb6.append(" [");
            sb6.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb6.append(", ");
                sb6.append(objArr[i4]);
            }
            sb6.append(']');
        }
        return sb6.toString();
    }
}
