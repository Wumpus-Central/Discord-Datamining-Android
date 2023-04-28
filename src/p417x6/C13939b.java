package p417x6;

/* renamed from: x6.b */
/* loaded from: classes7.dex */
public final class C13939b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m2232a(int i, TInput tinput, AbstractC13938a<TInput, TResult, TException> aVar, AbstractC13940c<TInput, TResult> cVar) {
        TResult apply;
        if (i < 1) {
            return aVar.apply(tinput);
        }
        do {
            apply = aVar.apply(tinput);
            tinput = cVar.mo2231a(tinput, apply);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return apply;
    }
}
