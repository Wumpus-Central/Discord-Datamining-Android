package p228m7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p080e8.C6745e;
import p080e8.C6754j;
import p119g9.C7557q0;
import p459z7.C14576a;

/* renamed from: m7.u */
/* loaded from: classes7.dex */
public final class C10530u {

    /* renamed from: c */
    private static final Pattern f23282c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f23283a = -1;

    /* renamed from: b */
    public int f23284b = -1;

    /* renamed from: b */
    private boolean m12928b(String str) {
        Matcher matcher = f23282c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) C7557q0.m22145j(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) C7557q0.m22145j(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f23283a = parseInt;
            this.f23284b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean m12929a() {
        return (this.f23283a == -1 || this.f23284b == -1) ? false : true;
    }

    /* renamed from: c */
    public boolean m12927c(C14576a aVar) {
        for (int i = 0; i < aVar.m183f(); i++) {
            C14576a.AbstractC14577b e = aVar.m184e(i);
            if (e instanceof C6745e) {
                C6745e eVar = (C6745e) e;
                if ("iTunSMPB".equals(eVar.f14391m) && m12928b(eVar.f14392n)) {
                    return true;
                }
            } else if (e instanceof C6754j) {
                C6754j jVar = (C6754j) e;
                if ("com.apple.iTunes".equals(jVar.f14403l) && "iTunSMPB".equals(jVar.f14404m) && m12928b(jVar.f14405n)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m12926d(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f23283a = i2;
        this.f23284b = i3;
        return true;
    }
}
