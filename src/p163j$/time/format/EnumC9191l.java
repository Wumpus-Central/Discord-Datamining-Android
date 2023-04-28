package p163j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.l */
/* loaded from: classes2.dex */
public enum EnumC9191l implements AbstractC9186g {
    SENSITIVE,
    INSENSITIVE,
    STRICT,
    LENIENT;

    @Override // p163j$.time.format.AbstractC9186g
    /* renamed from: a */
    public final boolean mo16712a(C9197r rVar, StringBuilder sb2) {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (ordinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (ordinal == 2) {
            return "ParseStrict(true)";
        }
        if (ordinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
