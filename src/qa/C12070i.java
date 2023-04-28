package qa;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: qa.i */
/* loaded from: classes3.dex */
public final class C12070i {

    /* renamed from: a */
    private final String f27105a;

    /* renamed from: b */
    private final C12076l f27106b;

    /* renamed from: c */
    private C12076l f27107c;

    /* renamed from: d */
    private boolean f27108d;

    private C12070i(String str) {
        C12076l lVar = new C12076l();
        this.f27106b = lVar;
        this.f27107c = lVar;
        this.f27108d = false;
        this.f27105a = (String) C12080n.m7871b(str);
    }

    /* renamed from: c */
    private final C12070i m7880c(String str, @NullableDecl Object obj) {
        C12076l lVar = new C12076l();
        this.f27107c.f27117c = lVar;
        this.f27107c = lVar;
        lVar.f27116b = obj;
        lVar.f27115a = (String) C12080n.m7871b(str);
        return this;
    }

    /* renamed from: a */
    public final C12070i m7882a(String str, int i) {
        return m7880c(str, String.valueOf(i));
    }

    /* renamed from: b */
    public final C12070i m7881b(String str, @NullableDecl Object obj) {
        return m7880c(str, obj);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f27105a);
        sb2.append('{');
        C12076l lVar = this.f27106b.f27117c;
        String str = "";
        while (lVar != null) {
            Object obj = lVar.f27116b;
            sb2.append(str);
            String str2 = lVar.f27115a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            lVar = lVar.f27117c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
