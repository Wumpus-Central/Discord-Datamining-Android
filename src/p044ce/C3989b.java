package p044ce;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.henninghall.date_picker.C5895i;
import com.henninghall.date_picker.C5897k;

/* renamed from: ce.b */
/* loaded from: classes6.dex */
public class C3989b {

    /* renamed from: a */
    private final GradientDrawable f6547a;

    /* renamed from: b */
    private final GradientDrawable f6548b;

    /* renamed from: c */
    private final C5897k f6549c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3989b(C5897k kVar, View view) {
        this.f6549c = kVar;
        this.f6547a = (GradientDrawable) ((ImageView) view.findViewById(C5895i.f11725j)).getDrawable();
        this.f6548b = (GradientDrawable) ((ImageView) view.findViewById(C5895i.f11724i)).getDrawable();
    }

    /* renamed from: b */
    private boolean m33182b(String str) {
        return str != null && str.length() == 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m33183a() {
        int i;
        String p = this.f6549c.m26936p();
        if (m33182b(p)) {
            i = 255;
        } else {
            i = 0;
        }
        this.f6547a.setAlpha(i);
        this.f6548b.setAlpha(i);
        if (m33182b(p)) {
            int parseColor = Color.parseColor("#FF" + p.substring(1));
            int parseColor2 = Color.parseColor("#00" + p.substring(1));
            this.f6547a.setColors(new int[]{parseColor, parseColor2});
            this.f6548b.setColors(new int[]{parseColor, parseColor2});
        }
    }
}
