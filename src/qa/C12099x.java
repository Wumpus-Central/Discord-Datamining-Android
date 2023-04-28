package qa;

/* renamed from: qa.x */
/* loaded from: classes3.dex */
public final class C12099x {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m7847a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append("at index ");
        sb2.append(i);
        throw new NullPointerException(sb2.toString());
    }
}
