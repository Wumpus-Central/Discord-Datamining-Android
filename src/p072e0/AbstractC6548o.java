package p072e0;

import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: e0.o */
/* loaded from: classes.dex */
public abstract class AbstractC6548o implements Comparable<AbstractC6548o> {

    /* renamed from: k */
    public static final AbstractC6548o f13719k = m25333b(1, 0, 0, "");

    /* renamed from: l */
    public static final AbstractC6548o f13720l = m25333b(1, 1, 0, "");

    /* renamed from: m */
    public static final AbstractC6548o f13721m = m25333b(1, 2, 0, "");

    /* renamed from: n */
    private static final Pattern f13722n = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");

    /* renamed from: b */
    public static AbstractC6548o m25333b(int i, int i2, int i3, String str) {
        return new C6531f(i, i2, i3, str);
    }

    /* renamed from: c */
    private static BigInteger m25332c(AbstractC6548o oVar) {
        return BigInteger.valueOf(oVar.mo25330e()).shiftLeft(32).or(BigInteger.valueOf(oVar.mo25329f())).shiftLeft(32).or(BigInteger.valueOf(oVar.mo25328g()));
    }

    /* renamed from: h */
    public static AbstractC6548o m25327h(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f13722n.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        int parseInt2 = Integer.parseInt(matcher.group(2));
        int parseInt3 = Integer.parseInt(matcher.group(3));
        if (matcher.group(4) != null) {
            str2 = matcher.group(4);
        } else {
            str2 = "";
        }
        return m25333b(parseInt, parseInt2, parseInt3, str2);
    }

    /* renamed from: a */
    public int compareTo(AbstractC6548o oVar) {
        return m25332c(this).compareTo(m25332c(oVar));
    }

    /* renamed from: d */
    abstract String mo25331d();

    /* renamed from: e */
    public abstract int mo25330e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC6548o)) {
            return false;
        }
        AbstractC6548o oVar = (AbstractC6548o) obj;
        if (!Objects.equals(Integer.valueOf(mo25330e()), Integer.valueOf(oVar.mo25330e())) || !Objects.equals(Integer.valueOf(mo25329f()), Integer.valueOf(oVar.mo25329f())) || !Objects.equals(Integer.valueOf(mo25328g()), Integer.valueOf(oVar.mo25328g()))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    abstract int mo25329f();

    /* renamed from: g */
    abstract int mo25328g();

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(mo25330e()), Integer.valueOf(mo25329f()), Integer.valueOf(mo25328g()));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(mo25330e() + "." + mo25329f() + "." + mo25328g());
        if (!TextUtils.isEmpty(mo25331d())) {
            sb2.append("-" + mo25331d());
        }
        return sb2.toString();
    }
}
