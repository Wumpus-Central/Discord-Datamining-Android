package p044ce;

import android.view.View;
import android.widget.LinearLayout;
import com.henninghall.date_picker.C5895i;

/* renamed from: ce.c */
/* loaded from: classes6.dex */
class C3990c {

    /* renamed from: a */
    private final LinearLayout f6550a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3990c(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C5895i.f11726k);
        this.f6550a = linearLayout;
        linearLayout.setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m33181a(View view) {
        this.f6550a.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m33180b() {
        this.f6550a.removeAllViews();
    }
}
