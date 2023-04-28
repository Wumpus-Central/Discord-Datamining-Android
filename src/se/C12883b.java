package se;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m15073d2 = {"", "lensFacing", "", "a", "(Ljava/lang/Integer;)Ljava/lang/String;", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: se.b */
/* loaded from: classes6.dex */
public final class C12883b {
    /* renamed from: a */
    public static final String m5193a(Integer num) {
        if (num != null && num.intValue() == 1) {
            return "back";
        }
        if (num != null && num.intValue() == 0) {
            return "front";
        }
        if (num != null && num.intValue() == 2) {
            return "external";
        }
        return null;
    }
}
