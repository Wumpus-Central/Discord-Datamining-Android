package p375v0;

import android.view.View;

/* renamed from: v0.a */
/* loaded from: classes.dex */
public class C13387a {
    /* renamed from: a */
    public static String m3776a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
