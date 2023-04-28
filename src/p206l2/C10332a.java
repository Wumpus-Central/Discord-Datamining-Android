package p206l2;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import p126h2.C7738a;
import p223m2.C10478i;
import p343t2.C12945f;

/* renamed from: l2.a */
/* loaded from: classes.dex */
public class C10332a {

    /* renamed from: d */
    private final AssetManager f22653d;

    /* renamed from: a */
    private final C10478i<String> f22650a = new C10478i<>();

    /* renamed from: b */
    private final Map<C10478i<String>, Typeface> f22651b = new HashMap();

    /* renamed from: c */
    private final Map<String, Typeface> f22652c = new HashMap();

    /* renamed from: e */
    private String f22654e = ".ttf";

    public C10332a(Drawable.Callback callback, C7738a aVar) {
        if (!(callback instanceof View)) {
            C12945f.m5009c("LottieDrawable must be inside of a view for images to work.");
            this.f22653d = null;
            return;
        }
        this.f22653d = ((View) callback).getContext().getAssets();
    }

    /* renamed from: a */
    private Typeface m13599a(String str) {
        Typeface typeface = this.f22652c.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.f22653d, "fonts/" + str + this.f22654e);
        this.f22652c.put(str, createFromAsset);
        return createFromAsset;
    }

    /* renamed from: d */
    private Typeface m13596d(Typeface typeface, String str) {
        int i;
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        if (contains && contains2) {
            i = 3;
        } else if (contains) {
            i = 2;
        } else if (contains2) {
            i = 1;
        } else {
            i = 0;
        }
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }

    /* renamed from: b */
    public Typeface m13598b(String str, String str2) {
        this.f22650a.m13082b(str, str2);
        Typeface typeface = this.f22651b.get(this.f22650a);
        if (typeface != null) {
            return typeface;
        }
        Typeface d = m13596d(m13599a(str), str2);
        this.f22651b.put(this.f22650a, d);
        return d;
    }

    /* renamed from: c */
    public void m13597c(C7738a aVar) {
    }
}
