package p353te;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a$\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0005"}, m15073d2 = {"T", "", "elements", "", "a", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: te.n */
/* loaded from: classes6.dex */
public final class C13070n {
    /* renamed from: a */
    public static final <T> boolean m4658a(List<? extends T> list, List<? extends T> elements) {
        C9971q.m14633g(list, "<this>");
        C9971q.m14633g(elements, "elements");
        if ((elements instanceof Collection) && elements.isEmpty()) {
            return false;
        }
        for (T t : elements) {
            if (list.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
