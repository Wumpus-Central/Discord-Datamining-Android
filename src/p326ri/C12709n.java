package p326ri;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9904h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u001e\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\f\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0000\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000b2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m15073d2 = {"", "marginPrefix", "g", "newIndent", "e", "f", "d", "", "c", "(Ljava/lang/String;)I", "indent", "Lkotlin/Function1;", "b", "(Ljava/lang/String;)Lkotlin/jvm/functions/Function1;", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/text/StringsKt")
/* renamed from: ri.n */
/* loaded from: classes8.dex */
public class C12709n extends C12708m {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"", "line", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ri.n$a */
    /* loaded from: classes8.dex */
    public static final class C12710a extends AbstractC9973s implements Function1<String, String> {

        /* renamed from: k */
        public static final C12710a f28575k = new C12710a();

        C12710a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(String line) {
            C9971q.m14633g(line, "line");
            return line;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"", "line", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ri.n$b */
    /* loaded from: classes8.dex */
    public static final class C12711b extends AbstractC9973s implements Function1<String, String> {

        /* renamed from: k */
        final /* synthetic */ String f28576k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12711b(String str) {
            super(1);
            this.f28576k = str;
        }

        /* renamed from: a */
        public final String invoke(String line) {
            C9971q.m14633g(line, "line");
            return this.f28576k + line;
        }
    }

    /* renamed from: b */
    private static final Function1<String, String> m5760b(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C12710a.f28575k;
        }
        return new C12711b(str);
    }

    /* renamed from: c */
    private static final int m5759c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!C12688a.m5873c(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return str.length();
        }
        return i;
    }

    /* renamed from: d */
    public static final String m5758d(String str, String newIndent) {
        int i;
        String invoke;
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(newIndent, "newIndent");
        List<String> h0 = C12719v.m5678h0(str);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : h0) {
            if (!C12707l.m5767w((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C9904h.m14841t(arrayList, 10));
        for (String str2 : arrayList) {
            arrayList2.add(Integer.valueOf(m5759c(str2)));
        }
        Integer num = (Integer) C9904h.m14857k0(arrayList2);
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int length = str.length() + (newIndent.length() * h0.size());
        Function1<String, String> b = m5760b(newIndent);
        int k = C9904h.m14858k(h0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : h0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C9904h.m14843s();
            }
            String str3 = (String) obj2;
            if ((i2 == 0 || i2 == k) && C12707l.m5767w(str3)) {
                str3 = null;
            } else {
                String W0 = C12707l.m5796W0(str3, i);
                if (!(W0 == null || (invoke = b.invoke(W0)) == null)) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i2 = i3;
        }
        String sb2 = ((StringBuilder) C9904h.m14870c0(arrayList3, new StringBuilder(length), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, null, 124, null)).toString();
        C9971q.m14634f(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    /* renamed from: e */
    public static final String m5757e(String str, String newIndent, String marginPrefix) {
        int i;
        String invoke;
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(newIndent, "newIndent");
        C9971q.m14633g(marginPrefix, "marginPrefix");
        if (!C12707l.m5767w(marginPrefix)) {
            List<String> h0 = C12719v.m5678h0(str);
            int length = str.length() + (newIndent.length() * h0.size());
            Function1<String, String> b = m5760b(newIndent);
            int k = C9904h.m14858k(h0);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : h0) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C9904h.m14843s();
                }
                String str2 = (String) obj;
                String str3 = null;
                if ((i2 == 0 || i2 == k) && C12707l.m5767w(str2)) {
                    str2 = null;
                } else {
                    int length2 = str2.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i = -1;
                            break;
                        } else if (!C12688a.m5873c(str2.charAt(i4))) {
                            i = i4;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i != -1 && C12707l.m5814G(str2, marginPrefix, i, false, 4, null)) {
                        C9971q.m14635e(str2, "null cannot be cast to non-null type java.lang.String");
                        str3 = str2.substring(i + marginPrefix.length());
                        C9971q.m14634f(str3, "this as java.lang.String).substring(startIndex)");
                    }
                    if (!(str3 == null || (invoke = b.invoke(str3)) == null)) {
                        str2 = invoke;
                    }
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                i2 = i3;
            }
            String sb2 = ((StringBuilder) C9904h.m14870c0(arrayList, new StringBuilder(length), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, null, 124, null)).toString();
            C9971q.m14634f(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    /* renamed from: f */
    public static String m5756f(String str) {
        C9971q.m14633g(str, "<this>");
        return m5758d(str, "");
    }

    /* renamed from: g */
    public static final String m5755g(String str, String marginPrefix) {
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(marginPrefix, "marginPrefix");
        return m5757e(str, "", marginPrefix);
    }

    /* renamed from: h */
    public static /* synthetic */ String m5754h(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return m5755g(str, str2);
    }
}
