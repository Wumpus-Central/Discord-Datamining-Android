package net.time4j.p248tz.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: net.time4j.tz.model.i */
/* loaded from: classes8.dex */
public class EnumC11017i extends Enum<EnumC11017i> {

    /* renamed from: k */
    public static final EnumC11017i f24490k;

    /* renamed from: l */
    public static final EnumC11017i f24491l;

    /* renamed from: m */
    public static final EnumC11017i f24492m;

    /* renamed from: n */
    static final EnumC11017i[] f24493n = values();

    /* renamed from: o */
    private static final /* synthetic */ EnumC11017i[] f24494o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: net.time4j.tz.model.i$a */
    /* loaded from: classes8.dex */
    static class C11018a extends EnumC11017i {
        C11018a(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        C11018a aVar = new C11018a("UTC_TIME", 0);
        f24490k = aVar;
        EnumC11017i bVar = new EnumC11017i("STANDARD_TIME", 1) { // from class: net.time4j.tz.model.i.b
        };
        f24491l = bVar;
        EnumC11017i cVar = new EnumC11017i("WALL_TIME", 2) { // from class: net.time4j.tz.model.i.c
        };
        f24492m = cVar;
        f24494o = new EnumC11017i[]{aVar, bVar, cVar};
    }

    private EnumC11017i(String str, int i) {
    }

    public static EnumC11017i valueOf(String str) {
        return (EnumC11017i) Enum.valueOf(EnumC11017i.class, str);
    }

    public static EnumC11017i[] values() {
        return (EnumC11017i[]) f24494o.clone();
    }

    /* synthetic */ EnumC11017i(String str, int i, C11018a aVar) {
        this(str, i);
    }
}
