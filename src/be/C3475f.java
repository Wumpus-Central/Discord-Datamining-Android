package be;

import com.facebook.react.bridge.Dynamic;
import com.henninghall.date_picker.C5892g;
import java.util.Locale;

/* renamed from: be.f */
/* loaded from: classes6.dex */
public class C3475f extends AbstractC3480k<Locale> {

    /* renamed from: b */
    private String f5615b = m34321d();

    public C3475f() {
        super(m34320e());
    }

    /* renamed from: d */
    private static String m34321d() {
        return Locale.getDefault().toLanguageTag().replace('-', '_');
    }

    /* renamed from: e */
    private static Locale m34320e() {
        return C5892g.m26965f(m34321d());
    }

    /* renamed from: f */
    public String m34319f() {
        return this.f5615b;
    }

    /* renamed from: g */
    public Locale mo34309c(Dynamic dynamic) {
        String replace = dynamic.asString().replace('-', '_');
        this.f5615b = replace;
        return C5892g.m26965f(replace);
    }
}
