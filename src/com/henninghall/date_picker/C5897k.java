package com.henninghall.date_picker;

import ae.EnumC1366a;
import ae.EnumC1367b;
import ae.EnumC1368c;
import be.AbstractC3480k;
import be.C3470a;
import be.C3471b;
import be.C3472c;
import be.C3473d;
import be.C3474e;
import be.C3475f;
import be.C3476g;
import be.C3477h;
import be.C3478i;
import be.C3479j;
import be.C3481l;
import be.C3482m;
import be.C3483n;
import com.facebook.react.bridge.Dynamic;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import p163j$.util.DesugarTimeZone;

/* renamed from: com.henninghall.date_picker.k */
/* loaded from: classes6.dex */
public class C5897k {

    /* renamed from: a */
    private Calendar f11730a = null;

    /* renamed from: b */
    private final C3470a f11731b = new C3470a();

    /* renamed from: c */
    private final C3479j f11732c = new C3479j();

    /* renamed from: d */
    private final C3475f f11733d = new C3475f();

    /* renamed from: e */
    private final C3472c f11734e = new C3472c();

    /* renamed from: f */
    private final C3481l f11735f = new C3481l();

    /* renamed from: g */
    private final C3478i f11736g = new C3478i();

    /* renamed from: h */
    private final C3477h f11737h = new C3477h();

    /* renamed from: i */
    private final C3476g f11738i = new C3476g();

    /* renamed from: j */
    private final C3482m f11739j = new C3482m();

    /* renamed from: k */
    private final C3473d f11740k = new C3473d();

    /* renamed from: l */
    private final C3483n f11741l = new C3483n();

    /* renamed from: m */
    private final C3471b f11742m = new C3471b();

    /* renamed from: n */
    private final C3474e f11743n = new C3474e();

    /* renamed from: o */
    private final HashMap f11744o = new C5898a();

    /* renamed from: p */
    public C5883c f11745p = new C5883c(this);

    /* renamed from: com.henninghall.date_picker.k$a */
    /* loaded from: classes6.dex */
    class C5898a extends HashMap<String, AbstractC3480k> {
        C5898a() {
            put("date", C5897k.this.f11731b);
            put("mode", C5897k.this.f11732c);
            put("locale", C5897k.this.f11733d);
            put("fadeToColor", C5897k.this.f11734e);
            put("textColor", C5897k.this.f11735f);
            put("minuteInterval", C5897k.this.f11736g);
            put("minimumDate", C5897k.this.f11737h);
            put("maximumDate", C5897k.this.f11738i);
            put("utc", C5897k.this.f11739j);
            put("height", C5897k.this.f11740k);
            put("androidVariant", C5897k.this.f11741l);
            put("dividerHeight", C5897k.this.f11742m);
            put("is24hourSource", C5897k.this.f11743n);
        }
    }

    /* renamed from: A */
    private AbstractC3480k m26957A(String str) {
        return (AbstractC3480k) this.f11744o.get(str);
    }

    /* renamed from: B */
    public String m26956B() {
        return this.f11735f.m34313a();
    }

    /* renamed from: C */
    public TimeZone m26955C() {
        if (this.f11739j.m34313a().booleanValue()) {
            return DesugarTimeZone.getTimeZone("UTC");
        }
        return TimeZone.getDefault();
    }

    /* renamed from: D */
    public EnumC1368c m26954D() {
        return this.f11741l.m34313a();
    }

    /* renamed from: E */
    public void m26953E(Calendar calendar) {
        this.f11730a = calendar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m26952F(String str, Dynamic dynamic) {
        m26957A(str).m34312b(dynamic);
    }

    /* renamed from: n */
    public Calendar m26938n() {
        return C5899l.m26917i(m26933s(), m26955C());
    }

    /* renamed from: o */
    public int m26937o() {
        return this.f11742m.m34313a().intValue();
    }

    /* renamed from: p */
    public String m26936p() {
        return this.f11734e.m34313a();
    }

    /* renamed from: q */
    public Integer m26935q() {
        return this.f11740k.m34313a();
    }

    /* renamed from: r */
    public EnumC1366a m26934r() {
        return this.f11743n.m34313a();
    }

    /* renamed from: s */
    public String m26933s() {
        return this.f11731b.m34313a();
    }

    /* renamed from: t */
    public Calendar m26932t() {
        return this.f11730a;
    }

    /* renamed from: u */
    public Locale m26931u() {
        return this.f11733d.m34313a();
    }

    /* renamed from: v */
    public String m26930v() {
        return this.f11733d.m34319f();
    }

    /* renamed from: w */
    public Calendar m26929w() {
        return new C5881a(m26955C(), this.f11738i.m34313a()).m26988a();
    }

    /* renamed from: x */
    public Calendar m26928x() {
        return new C5881a(m26955C(), this.f11737h.m34313a()).m26988a();
    }

    /* renamed from: y */
    public int m26927y() {
        return this.f11736g.m34313a().intValue();
    }

    /* renamed from: z */
    public EnumC1367b m26926z() {
        return this.f11732c.m34313a();
    }
}
