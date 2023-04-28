package p183jj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.time4j.p248tz.AbstractC11001k;

/* renamed from: jj.g0 */
/* loaded from: classes8.dex */
class C9654g0 {

    /* renamed from: a */
    private final C9656b f21412a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jj.g0$b */
    /* loaded from: classes8.dex */
    public static class C9656b {

        /* renamed from: a */
        private final char f21413a;

        /* renamed from: b */
        private final C9656b f21414b;

        /* renamed from: c */
        private final C9656b f21415c;

        /* renamed from: d */
        private final C9656b f21416d;

        /* renamed from: e */
        private final List<AbstractC11001k> f21417e;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public C9656b m15754j(AbstractC11001k kVar) {
            ArrayList arrayList = new ArrayList();
            List<AbstractC11001k> list = this.f21417e;
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(kVar);
            return new C9656b(this.f21413a, this.f21414b, this.f21415c, this.f21416d, arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public C9656b m15753k(C9656b bVar) {
            return new C9656b(this.f21413a, bVar, this.f21415c, this.f21416d, this.f21417e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public C9656b m15752l(C9656b bVar) {
            return new C9656b(this.f21413a, this.f21414b, bVar, this.f21416d, this.f21417e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public C9656b m15751m(C9656b bVar) {
            return new C9656b(this.f21413a, this.f21414b, this.f21415c, bVar, this.f21417e);
        }

        private C9656b(char c) {
            this(c, null, null, null, null);
        }

        private C9656b(char c, C9656b bVar, C9656b bVar2, C9656b bVar3, List<AbstractC11001k> list) {
            this.f21413a = c;
            this.f21414b = bVar;
            this.f21415c = bVar2;
            this.f21416d = bVar3;
            this.f21417e = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9654g0(C9656b bVar) {
        this.f21412a = bVar;
    }

    /* renamed from: a */
    private void m15769a(C9656b bVar, StringBuilder sb2, List<String> list) {
        if (bVar != null) {
            m15769a(bVar.f21414b, sb2, list);
            if (bVar.f21417e != null) {
                list.add(sb2.toString() + bVar.f21413a);
            }
            C9656b bVar2 = bVar.f21415c;
            sb2.append(bVar.f21413a);
            m15769a(bVar2, sb2, list);
            sb2.deleteCharAt(sb2.length() - 1);
            m15769a(bVar.f21416d, sb2, list);
        }
    }

    /* renamed from: c */
    private static C9656b m15767c(C9656b bVar, String str, int i) {
        if (bVar == null) {
            return null;
        }
        char charAt = str.charAt(i);
        if (charAt < bVar.f21413a) {
            return m15767c(bVar.f21414b, str, i);
        }
        if (charAt > bVar.f21413a) {
            return m15767c(bVar.f21416d, str, i);
        }
        if (i < str.length() - 1) {
            return m15767c(bVar.f21415c, str, i + 1);
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C9656b m15766d(C9656b bVar, String str, AbstractC11001k kVar) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Empty key cannot be inserted.");
        } else if (kVar != null) {
            return m15765e(bVar, str, kVar, 0);
        } else {
            throw new NullPointerException("Missing timezone id.");
        }
    }

    /* renamed from: e */
    private static C9656b m15765e(C9656b bVar, String str, AbstractC11001k kVar, int i) {
        char charAt = str.charAt(i);
        if (bVar == null) {
            bVar = new C9656b(charAt);
        }
        if (charAt < bVar.f21413a) {
            return bVar.m15753k(m15765e(bVar.f21414b, str, kVar, i));
        }
        if (charAt > bVar.f21413a) {
            return bVar.m15751m(m15765e(bVar.f21416d, str, kVar, i));
        }
        if (i < str.length() - 1) {
            return bVar.m15752l(m15765e(bVar.f21415c, str, kVar, i + 1));
        }
        return bVar.m15754j(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public List<AbstractC11001k> m15768b(String str) {
        if (str.isEmpty()) {
            return Collections.emptyList();
        }
        C9656b c = m15767c(this.f21412a, str, 0);
        if (c == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(c.f21417e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public String m15764f(CharSequence charSequence, int i) {
        C9656b bVar = this.f21412a;
        int length = charSequence.length();
        int i2 = i;
        int i3 = i2;
        while (bVar != null && i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < bVar.f21413a) {
                bVar = bVar.f21414b;
            } else if (charAt > bVar.f21413a) {
                bVar = bVar.f21416d;
            } else {
                i2++;
                if (bVar.f21417e != null) {
                    i3 = i2;
                }
                bVar = bVar.f21415c;
            }
        }
        if (i >= i3) {
            return "";
        }
        return charSequence.subSequence(i, i3).toString();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        m15769a(this.f21412a, new StringBuilder(), arrayList);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("count=");
        sb2.append(arrayList.size());
        sb2.append(",labels={");
        for (String str : arrayList) {
            sb2.append(str);
            sb2.append("=>");
            sb2.append(m15768b(str));
            sb2.append(',');
        }
        sb2.deleteCharAt(sb2.length() - 1).append('}');
        return sb2.toString();
    }
}
