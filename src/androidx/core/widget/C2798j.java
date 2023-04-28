package androidx.core.widget;

import android.widget.ListView;

/* renamed from: androidx.core.widget.j */
/* loaded from: classes.dex */
public final class C2798j {

    /* renamed from: androidx.core.widget.j$a */
    /* loaded from: classes.dex */
    static class C2799a {
        /* renamed from: a */
        static boolean m36697a(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        /* renamed from: b */
        static void m36696b(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    /* renamed from: a */
    public static boolean m36699a(ListView listView, int i) {
        return C2799a.m36697a(listView, i);
    }

    /* renamed from: b */
    public static void m36698b(ListView listView, int i) {
        C2799a.m36696b(listView, i);
    }
}
