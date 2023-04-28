package p285pd;

import com.google.zxing.Result;
import java.util.EnumMap;
import java.util.Map;
import p066dd.C6441j;
import p066dd.C6446o;
import p066dd.EnumC6432a;
import p066dd.EnumC6445n;
import p137hd.C7996a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pd.m */
/* loaded from: classes3.dex */
public final class C11633m {

    /* renamed from: a */
    private final int[] f25935a = new int[4];

    /* renamed from: b */
    private final StringBuilder f25936b = new StringBuilder();

    /* renamed from: a */
    private int m9197a(C7996a aVar, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f25935a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int j = aVar.m20932j();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < j; i3++) {
            int i4 = AbstractC11636p.m9186i(aVar, iArr2, i, AbstractC11636p.f25947h);
            sb2.append((char) ((i4 % 10) + 48));
            for (int i5 : iArr2) {
                i += i5;
            }
            if (i4 >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = aVar.m20933h(aVar.m20934f(i));
            }
        }
        if (sb2.length() != 2) {
            throw C6441j.m25551a();
        } else if (Integer.parseInt(sb2.toString()) % 4 == i2) {
            return i;
        } else {
            throw C6441j.m25551a();
        }
    }

    /* renamed from: c */
    private static Map<EnumC6445n, Object> m9195c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC6445n.class);
        enumMap.put((EnumMap) EnumC6445n.ISSUE_NUMBER, (EnumC6445n) Integer.valueOf(str));
        return enumMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Result m9196b(int i, C7996a aVar, int[] iArr) {
        StringBuilder sb2 = this.f25936b;
        sb2.setLength(0);
        int a = m9197a(aVar, iArr, sb2);
        String sb3 = sb2.toString();
        Map<EnumC6445n, Object> c = m9195c(sb3);
        float f = i;
        Result result = new Result(sb3, null, new C6446o[]{new C6446o((iArr[0] + iArr[1]) / 2.0f, f), new C6446o(a, f)}, EnumC6432a.UPC_EAN_EXTENSION);
        if (c != null) {
            result.m27002g(c);
        }
        return result;
    }
}
