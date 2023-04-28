package p285pd;

import com.google.zxing.Result;
import java.util.Map;
import p066dd.C6434c;
import p066dd.C6437f;
import p066dd.EnumC6432a;
import p066dd.EnumC6436e;
import p137hd.C7996a;

/* renamed from: pd.l */
/* loaded from: classes3.dex */
public final class C11632l extends AbstractC11636p {

    /* renamed from: i */
    private final AbstractC11636p f25934i = new C11625e();

    /* renamed from: r */
    private static Result m9198r(Result result) {
        String f = result.m27003f();
        if (f.charAt(0) == '0') {
            Result result2 = new Result(f.substring(1), null, result.m27004e(), EnumC6432a.UPC_A);
            if (result.m27005d() != null) {
                result2.m27002g(result.m27005d());
            }
            return result2;
        }
        throw C6437f.m25561a();
    }

    @Override // p285pd.AbstractC11631k, p066dd.AbstractC6443l
    /* renamed from: a */
    public Result mo1767a(C6434c cVar, Map<EnumC6436e, ?> map) {
        return m9198r(this.f25934i.mo1767a(cVar, map));
    }

    @Override // p285pd.AbstractC11636p, p285pd.AbstractC11631k
    /* renamed from: b */
    public Result mo6515b(int i, C7996a aVar, Map<EnumC6436e, ?> map) {
        return m9198r(this.f25934i.mo6515b(i, aVar, map));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p285pd.AbstractC11636p
    /* renamed from: k */
    public int mo9178k(C7996a aVar, int[] iArr, StringBuilder sb2) {
        return this.f25934i.mo9178k(aVar, iArr, sb2);
    }

    @Override // p285pd.AbstractC11636p
    /* renamed from: l */
    public Result mo9185l(int i, C7996a aVar, int[] iArr, Map<EnumC6436e, ?> map) {
        return m9198r(this.f25934i.mo9185l(i, aVar, iArr, map));
    }

    @Override // p285pd.AbstractC11636p
    /* renamed from: p */
    EnumC6432a mo9177p() {
        return EnumC6432a.UPC_A;
    }
}
