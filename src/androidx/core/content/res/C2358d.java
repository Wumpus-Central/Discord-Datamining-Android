package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.res.d */
/* loaded from: classes.dex */
public final class C2358d {

    /* renamed from: a */
    private final Shader f3283a;

    /* renamed from: b */
    private final ColorStateList f3284b;

    /* renamed from: c */
    private int f3285c;

    private C2358d(Shader shader, ColorStateList colorStateList, int i) {
        this.f3283a = shader;
        this.f3284b = colorStateList;
        this.f3285c = i;
    }

    /* renamed from: a */
    private static C2358d m38028a(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (name.equals("gradient")) {
                return m38025d(C2364f.m37995b(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return m38026c(C2357c.m38035b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C2358d m38027b(int i) {
        return new C2358d(null, null, i);
    }

    /* renamed from: c */
    static C2358d m38026c(ColorStateList colorStateList) {
        return new C2358d(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static C2358d m38025d(Shader shader) {
        return new C2358d(shader, null, 0);
    }

    /* renamed from: g */
    public static C2358d m38022g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m38028a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: e */
    public int m38024e() {
        return this.f3285c;
    }

    /* renamed from: f */
    public Shader m38023f() {
        return this.f3283a;
    }

    /* renamed from: h */
    public boolean m38021h() {
        return this.f3283a != null;
    }

    /* renamed from: i */
    public boolean m38020i() {
        ColorStateList colorStateList;
        return this.f3283a == null && (colorStateList = this.f3284b) != null && colorStateList.isStateful();
    }

    /* renamed from: j */
    public boolean m38019j(int[] iArr) {
        if (m38020i()) {
            ColorStateList colorStateList = this.f3284b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f3285c) {
                this.f3285c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m38018k(int i) {
        this.f3285c = i;
    }

    /* renamed from: l */
    public boolean m38017l() {
        return m38021h() || this.f3285c != 0;
    }
}
