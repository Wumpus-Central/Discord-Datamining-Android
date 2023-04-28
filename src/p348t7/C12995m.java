package p348t7;

import java.util.ArrayList;
import java.util.List;
import p030bc.C3460l;
import p079e7.C6728o;
import p099f8.C7082c;
import p119g9.C7570y;
import p228m7.AbstractC10515j;
import p228m7.C10533x;
import p459z7.C14576a;

/* renamed from: t7.m */
/* loaded from: classes7.dex */
final class C12995m {

    /* renamed from: d */
    private static final C3460l f29178d = C3460l.m34341d(':');

    /* renamed from: e */
    private static final C3460l f29179e = C3460l.m34341d('*');

    /* renamed from: a */
    private final List<C12996a> f29180a = new ArrayList();

    /* renamed from: b */
    private int f29181b = 0;

    /* renamed from: c */
    private int f29182c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t7.m$a */
    /* loaded from: classes7.dex */
    public static final class C12996a {

        /* renamed from: a */
        public final int f29183a;

        /* renamed from: b */
        public final long f29184b;

        /* renamed from: c */
        public final int f29185c;

        public C12996a(int i, long j, int i2) {
            this.f29183a = i;
            this.f29184b = j;
            this.f29185c = i2;
        }
    }

    /* renamed from: a */
    private void m4786a(AbstractC10515j jVar, C10533x xVar) {
        C7570y yVar = new C7570y(8);
        jVar.readFully(yVar.m22012d(), 0, 8);
        this.f29182c = yVar.m21999q() + 8;
        if (yVar.m22002n() != 1397048916) {
            xVar.f23290a = 0L;
            return;
        }
        xVar.f23290a = jVar.getPosition() - (this.f29182c - 12);
        this.f29181b = 2;
    }

    /* renamed from: b */
    private static int m4785b(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw new C6728o("Invalid SEF name");
        }
    }

    /* renamed from: d */
    private void m4783d(AbstractC10515j jVar, C10533x xVar) {
        long length = jVar.getLength();
        int i = (this.f29182c - 12) - 8;
        C7570y yVar = new C7570y(i);
        jVar.readFully(yVar.m22012d(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            yVar.m22016Q(2);
            short s = yVar.m21997s();
            if (s == 2192 || s == 2816 || s == 2817 || s == 2819 || s == 2820) {
                this.f29180a.add(new C12996a(s, (length - this.f29182c) - yVar.m21999q(), yVar.m21999q()));
            } else {
                yVar.m22016Q(8);
            }
        }
        if (this.f29180a.isEmpty()) {
            xVar.f23290a = 0L;
            return;
        }
        this.f29181b = 3;
        xVar.f23290a = this.f29180a.get(0).f29184b;
    }

    /* renamed from: e */
    private void m4782e(AbstractC10515j jVar, List<C14576a.AbstractC14577b> list) {
        long position = jVar.getPosition();
        int length = (int) ((jVar.getLength() - jVar.getPosition()) - this.f29182c);
        C7570y yVar = new C7570y(length);
        jVar.readFully(yVar.m22012d(), 0, length);
        for (int i = 0; i < this.f29180a.size(); i++) {
            C12996a aVar = this.f29180a.get(i);
            yVar.m22017P((int) (aVar.f29184b - position));
            yVar.m22016Q(4);
            int q = yVar.m21999q();
            int b = m4785b(yVar.m22032A(q));
            int i2 = aVar.f29185c - (q + 8);
            if (b == 2192) {
                list.add(m4781f(yVar, i2));
            } else if (!(b == 2816 || b == 2817 || b == 2819 || b == 2820)) {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: f */
    private static C7082c m4781f(C7570y yVar, int i) {
        ArrayList arrayList = new ArrayList();
        List<String> f = f29179e.m34339f(yVar.m22032A(i));
        for (int i2 = 0; i2 < f.size(); i2++) {
            List<String> f2 = f29178d.m34339f(f.get(i2));
            if (f2.size() == 3) {
                try {
                    arrayList.add(new C7082c.C7084b(Long.parseLong(f2.get(0)), Long.parseLong(f2.get(1)), 1 << (Integer.parseInt(f2.get(2)) - 1)));
                } catch (NumberFormatException e) {
                    throw new C6728o(e);
                }
            } else {
                throw new C6728o();
            }
        }
        return new C7082c(arrayList);
    }

    /* renamed from: c */
    public int m4784c(AbstractC10515j jVar, C10533x xVar, List<C14576a.AbstractC14577b> list) {
        int i = this.f29181b;
        long j = 0;
        if (i == 0) {
            long length = jVar.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            xVar.f23290a = j;
            this.f29181b = 1;
        } else if (i == 1) {
            m4786a(jVar, xVar);
        } else if (i == 2) {
            m4783d(jVar, xVar);
        } else if (i == 3) {
            m4782e(jVar, list);
            xVar.f23290a = 0L;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    /* renamed from: g */
    public void m4780g() {
        this.f29180a.clear();
        this.f29181b = 0;
    }
}
