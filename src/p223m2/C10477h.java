package p223m2;

/* renamed from: m2.h */
/* loaded from: classes.dex */
public class C10477h {

    /* renamed from: a */
    private final String f23137a;

    /* renamed from: b */
    public final float f23138b;

    /* renamed from: c */
    public final float f23139c;

    public C10477h(String str, float f, float f2) {
        this.f23137a = str;
        this.f23139c = f2;
        this.f23138b = f;
    }

    /* renamed from: a */
    public boolean m13084a(String str) {
        if (this.f23137a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f23137a.endsWith("\r")) {
            String str2 = this.f23137a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
