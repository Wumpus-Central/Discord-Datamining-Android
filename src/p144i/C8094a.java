package p144i;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import p052d.C6379a;
import p052d.C6380b;
import p052d.C6382d;
import p052d.C6388j;

/* renamed from: i.a */
/* loaded from: classes.dex */
public class C8094a {

    /* renamed from: a */
    private Context f17481a;

    private C8094a(Context context) {
        this.f17481a = context;
    }

    /* renamed from: b */
    public static C8094a m20628b(Context context) {
        return new C8094a(context);
    }

    /* renamed from: a */
    public boolean m20629a() {
        return this.f17481a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int m20627c() {
        return this.f17481a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int m20626d() {
        Configuration configuration = this.f17481a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i > 480 && i2 > 640) {
            return 4;
        }
        if (i >= 360) {
            return 3;
        }
        return 2;
    }

    /* renamed from: e */
    public int m20625e() {
        return this.f17481a.getResources().getDimensionPixelSize(C6382d.f13131b);
    }

    /* renamed from: f */
    public int m20624f() {
        TypedArray obtainStyledAttributes = this.f17481a.obtainStyledAttributes(null, C6388j.f13235a, C6379a.f13097c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C6388j.f13280j, 0);
        Resources resources = this.f17481a.getResources();
        if (!m20623g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C6382d.f13130a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean m20623g() {
        return this.f17481a.getResources().getBoolean(C6380b.f13121a);
    }

    /* renamed from: h */
    public boolean m20622h() {
        return true;
    }
}
