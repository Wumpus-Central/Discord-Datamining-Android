package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes.dex */
class C3145l {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m35084a(RecyclerView.State state, AbstractC3140j jVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.m35477U() == 0 || state.m35352b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(layoutManager.m35446o0(view) - layoutManager.m35446o0(view2)) + 1;
        }
        return Math.min(jVar.mo35095n(), jVar.mo35105d(view2) - jVar.mo35102g(view));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m35083b(RecyclerView.State state, AbstractC3140j jVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z, boolean z2) {
        int i;
        if (layoutManager.m35477U() == 0 || state.m35352b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(layoutManager.m35446o0(view), layoutManager.m35446o0(view2));
        int max = Math.max(layoutManager.m35446o0(view), layoutManager.m35446o0(view2));
        if (z2) {
            i = Math.max(0, (state.m35352b() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((i * (Math.abs(jVar.mo35105d(view2) - jVar.mo35102g(view)) / (Math.abs(layoutManager.m35446o0(view) - layoutManager.m35446o0(view2)) + 1))) + (jVar.mo35096m() - jVar.mo35102g(view)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m35082c(RecyclerView.State state, AbstractC3140j jVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.m35477U() == 0 || state.m35352b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return state.m35352b();
        }
        return (int) (((jVar.mo35105d(view2) - jVar.mo35102g(view)) / (Math.abs(layoutManager.m35446o0(view) - layoutManager.m35446o0(view2)) + 1)) * state.m35352b());
    }
}
