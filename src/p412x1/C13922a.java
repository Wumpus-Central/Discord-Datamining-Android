package p412x1;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: x1.a */
/* loaded from: classes.dex */
public class C13922a {
    /* renamed from: a */
    public static <T extends View> T m2313a(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            T t = (T) viewGroup.getChildAt(i2).findViewById(i);
            if (t != null) {
                return t;
            }
        }
        return null;
    }
}
