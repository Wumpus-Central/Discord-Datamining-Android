package com.airbnb.android.react.lottie;

import android.widget.ImageView;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewProps;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;
import p126h2.AbstractC7765j0;
import p126h2.C7756h;
import p126h2.C7785r0;
import p126h2.C7787s0;
import p126h2.EnumC7782q0;
import p223m2.C10474e;
import p358u2.C13180c;

/* renamed from: com.airbnb.android.react.lottie.a */
/* loaded from: classes.dex */
public class C4096a {

    /* renamed from: a */
    private final WeakReference<C7756h> f6745a;

    /* renamed from: b */
    private String f6746b;

    /* renamed from: c */
    private Float f6747c;

    /* renamed from: d */
    private Boolean f6748d;

    /* renamed from: e */
    private Float f6749e;

    /* renamed from: f */
    private boolean f6750f;

    /* renamed from: g */
    private String f6751g;

    /* renamed from: h */
    private ImageView.ScaleType f6752h;

    /* renamed from: i */
    private String f6753i;

    /* renamed from: j */
    private Boolean f6754j;

    /* renamed from: k */
    private ReadableArray f6755k;

    /* renamed from: l */
    private ReadableArray f6756l;

    /* renamed from: m */
    private EnumC7782q0 f6757m;

    public C4096a(C7756h hVar) {
        this.f6745a = new WeakReference<>(hVar);
    }

    /* renamed from: a */
    public void m32859a() {
        int i;
        int i2;
        C7756h hVar = this.f6745a.get();
        if (hVar != null) {
            ReadableArray readableArray = this.f6756l;
            if (readableArray != null && readableArray.size() > 0) {
                C7787s0 s0Var = new C7787s0(hVar);
                for (int i3 = 0; i3 < this.f6756l.size(); i3++) {
                    ReadableMap map = this.f6756l.getMap(i3);
                    s0Var.m21322e(map.getString("find"), map.getString("replace"));
                }
                hVar.setTextDelegate(s0Var);
            }
            String str = this.f6746b;
            if (str != null) {
                hVar.m21408y(str, Integer.toString(str.hashCode()));
                this.f6746b = null;
            }
            if (this.f6750f) {
                hVar.setAnimation(this.f6751g);
                this.f6750f = false;
            }
            Float f = this.f6747c;
            if (f != null) {
                hVar.setProgress(f.floatValue());
                this.f6747c = null;
            }
            Boolean bool = this.f6748d;
            if (bool != null) {
                if (bool.booleanValue()) {
                    i2 = -1;
                } else {
                    i2 = 0;
                }
                hVar.setRepeatCount(i2);
                this.f6748d = null;
            }
            Float f2 = this.f6749e;
            if (f2 != null) {
                hVar.setSpeed(f2.floatValue());
                this.f6749e = null;
            }
            ImageView.ScaleType scaleType = this.f6752h;
            if (scaleType != null) {
                hVar.setScaleType(scaleType);
                this.f6752h = null;
            }
            EnumC7782q0 q0Var = this.f6757m;
            if (q0Var != null) {
                hVar.setRenderMode(q0Var);
                this.f6757m = null;
            }
            String str2 = this.f6753i;
            if (str2 != null) {
                hVar.setImageAssetsFolder(str2);
                this.f6753i = null;
            }
            Boolean bool2 = this.f6754j;
            if (bool2 != null) {
                hVar.m21419n(bool2.booleanValue());
                this.f6754j = null;
            }
            ReadableArray readableArray2 = this.f6755k;
            if (readableArray2 != null && readableArray2.size() > 0) {
                for (int i4 = 0; i4 < this.f6755k.size(); i4++) {
                    ReadableMap map2 = this.f6755k.getMap(i4);
                    if (map2.getType(ViewProps.COLOR) == ReadableType.Map) {
                        i = ColorPropConverter.getColor(map2.getMap(ViewProps.COLOR), hVar.getContext()).intValue();
                    } else {
                        i = map2.getInt(ViewProps.COLOR);
                    }
                    hVar.m21423j(new C10474e((map2.getString("keypath") + ".**").split(Pattern.quote("."))), AbstractC7765j0.f38430K, new C13180c(new C7785r0(i)));
                }
            }
        }
    }

    /* renamed from: b */
    public void m32858b(String str) {
        this.f6746b = str;
    }

    /* renamed from: c */
    public void m32857c(String str) {
        this.f6751g = str;
        this.f6750f = true;
    }

    /* renamed from: d */
    public void m32856d(ReadableArray readableArray) {
        this.f6755k = readableArray;
    }

    /* renamed from: e */
    public void m32855e(boolean z) {
        this.f6754j = Boolean.valueOf(z);
    }

    /* renamed from: f */
    public void m32854f(String str) {
        this.f6753i = str;
    }

    /* renamed from: g */
    public void m32853g(boolean z) {
        this.f6748d = Boolean.valueOf(z);
    }

    /* renamed from: h */
    public void m32852h(Float f) {
        this.f6747c = f;
    }

    /* renamed from: i */
    public void m32851i(EnumC7782q0 q0Var) {
        this.f6757m = q0Var;
    }

    /* renamed from: j */
    public void m32850j(ImageView.ScaleType scaleType) {
        this.f6752h = scaleType;
    }

    /* renamed from: k */
    public void m32849k(float f) {
        this.f6749e = Float.valueOf(f);
    }

    /* renamed from: l */
    public void m32848l(ReadableArray readableArray) {
        this.f6756l = readableArray;
    }
}
