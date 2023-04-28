package p291q2;

/* renamed from: q2.c */
/* loaded from: classes.dex */
public enum EnumC11974c {
    JSON(".json"),
    ZIP(".zip");
    

    /* renamed from: k */
    public final String f26811k;

    EnumC11974c(String str) {
        this.f26811k = str;
    }

    /* renamed from: a */
    public String m8093a() {
        return ".temp" + this.f26811k;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f26811k;
    }
}
