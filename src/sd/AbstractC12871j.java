package sd;

import p137hd.C7996a;

/* renamed from: sd.j */
/* loaded from: classes3.dex */
public abstract class AbstractC12871j {

    /* renamed from: a */
    private final C7996a f28933a;

    /* renamed from: b */
    private final C12881s f28934b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC12871j(C7996a aVar) {
        this.f28933a = aVar;
        this.f28934b = new C12881s(aVar);
    }

    /* renamed from: a */
    public static AbstractC12871j m5238a(C7996a aVar) {
        if (aVar.m20936d(1)) {
            return new C12868g(aVar);
        }
        if (!aVar.m20936d(2)) {
            return new C12872k(aVar);
        }
        int g = C12881s.m5205g(aVar, 1, 4);
        if (g == 4) {
            return new C12862a(aVar);
        }
        if (g == 5) {
            return new C12863b(aVar);
        }
        int g2 = C12881s.m5205g(aVar, 1, 5);
        if (g2 == 12) {
            return new C12864c(aVar);
        }
        if (g2 == 13) {
            return new C12865d(aVar);
        }
        switch (C12881s.m5205g(aVar, 1, 7)) {
            case 56:
                return new C12866e(aVar, "310", "11");
            case 57:
                return new C12866e(aVar, "320", "11");
            case 58:
                return new C12866e(aVar, "310", "13");
            case 59:
                return new C12866e(aVar, "320", "13");
            case 60:
                return new C12866e(aVar, "310", "15");
            case 61:
                return new C12866e(aVar, "320", "15");
            case 62:
                return new C12866e(aVar, "310", "17");
            case 63:
                return new C12866e(aVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(aVar)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final C12881s m5237b() {
        return this.f28934b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final C7996a m5236c() {
        return this.f28933a;
    }

    /* renamed from: d */
    public abstract String mo5235d();
}
