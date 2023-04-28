package p284pc;

/* renamed from: pc.d */
/* loaded from: classes3.dex */
public @interface AbstractC11612d {

    /* renamed from: pc.d$a */
    /* loaded from: classes3.dex */
    public enum EnumC11613a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    EnumC11613a intEncoding() default EnumC11613a.DEFAULT;

    int tag();
}
