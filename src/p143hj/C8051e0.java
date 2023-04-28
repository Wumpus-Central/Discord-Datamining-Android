package p143hj;

/* renamed from: hj.e0 */
/* loaded from: classes8.dex */
public class C8051e0 extends C8081r {
    private static final long serialVersionUID = -5638437652574160520L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8051e0(C8087x<?> xVar, AbstractC8079p<?> pVar) {
        super(m20741a(xVar, pVar));
    }

    /* renamed from: a */
    private static String m20741a(C8087x<?> xVar, AbstractC8079p<?> pVar) {
        return "Cannot find any rule for chronological element \"" + pVar.name() + "\" in: " + xVar.m20648q().getName();
    }

    /* renamed from: b */
    private static String m20740b(C8087x<?> xVar, Object obj) {
        return "Cannot find any rule for chronological unit \"" + m20739c(obj) + "\" in: " + xVar.m20648q().getName();
    }

    /* renamed from: c */
    private static String m20739c(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) Enum.class.cast(obj)).name();
        }
        return obj.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8051e0(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8051e0(C8087x<?> xVar, Object obj) {
        super(m20740b(xVar, obj));
    }
}
