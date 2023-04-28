package p250nj;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p161ij.AbstractC8660o;
import p161ij.AbstractC8661p;
import p161ij.EnumC8656k;

/* renamed from: nj.a */
/* loaded from: classes8.dex */
public final class C11149a implements AbstractC8660o {

    /* renamed from: a */
    private static final Map<String, AbstractC8661p> f24809a;

    /* renamed from: c */
    private static final Map<String, AbstractC8661p> f24811c;

    /* renamed from: b */
    private static final AbstractC8661p f24810b = new C11150b(0, null);

    /* renamed from: d */
    private static final AbstractC8661p f24812d = new C11151c(0, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nj.a$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C0356a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24813a;

        static {
            int[] iArr = new int[EnumC8656k.values().length];
            f24813a = iArr;
            try {
                iArr[EnumC8656k.CARDINALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24813a[EnumC8656k.ORDINALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nj.a$b */
    /* loaded from: classes8.dex */
    public static class C11150b extends AbstractC8661p {

        /* renamed from: g */
        private final int f24814g;

        /* synthetic */ C11150b(int i, C0356a aVar) {
            this(i);
        }

        private C11150b(int i) {
            this.f24814g = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nj.a$c */
    /* loaded from: classes8.dex */
    public static class C11151c extends AbstractC8661p {

        /* renamed from: g */
        private final int f24815g;

        /* synthetic */ C11151c(int i, C0356a aVar) {
            this(i);
        }

        private C11151c(int i) {
            this.f24815g = i;
        }
    }

    static {
        HashMap hashMap = new HashMap(140);
        f24809a = hashMap;
        HashMap hashMap2 = new HashMap();
        m10718b(hashMap2, "bm bo dz id ig ii in ja jbo jv jw kde kea km ko lkt", -1);
        m10718b(hashMap2, "lo ms my nqo root sah ses sg th to vi wo yo zh", -1);
        m10718b(hashMap2, "pt_PT", 0);
        m10718b(hashMap2, "am as bn fa gu hi kn zu", 1);
        m10718b(hashMap2, "ff fr hy kab pt", 1);
        m10718b(hashMap2, "si", 1);
        m10718b(hashMap2, "ak bh guw ln mg nso pa ti wa", 1);
        m10718b(hashMap2, "tzm", 2);
        m10718b(hashMap2, "is", 3);
        m10718b(hashMap2, "mk", 4);
        m10718b(hashMap2, "ceb fil tl", 5);
        m10718b(hashMap2, "lv prg", 6);
        m10718b(hashMap2, "lag ksh", 7);
        m10718b(hashMap2, "iu naq se sma smi smj smn sms", 8);
        m10718b(hashMap2, "shi", 9);
        m10718b(hashMap2, "mo ro", 10);
        m10718b(hashMap2, "bs hr sh sr", 11);
        m10718b(hashMap2, "gd", 12);
        m10718b(hashMap2, "sl", 13);
        m10718b(hashMap2, "he iw", 14);
        m10718b(hashMap2, "cs sk", 15);
        m10718b(hashMap2, "pl", 16);
        m10718b(hashMap2, "be", 17);
        m10718b(hashMap2, "lt", 18);
        m10718b(hashMap2, "mt", 19);
        m10718b(hashMap2, "ru uk", 17);
        m10718b(hashMap2, "br", 20);
        m10718b(hashMap2, "ga", 21);
        m10718b(hashMap2, "gv", 22);
        m10718b(hashMap2, "ar", 23);
        m10718b(hashMap2, "cy", 24);
        m10718b(hashMap2, "dsb hsb", 25);
        m10718b(hashMap2, "kw", 26);
        hashMap.putAll(hashMap2);
        HashMap hashMap3 = new HashMap(140);
        f24811c = hashMap3;
        HashMap hashMap4 = new HashMap();
        m10717c(hashMap4, "sv", 1);
        m10717c(hashMap4, "fil fr ga hy lo mo ms ro tl vi", 2);
        m10717c(hashMap4, "hu", 3);
        m10717c(hashMap4, "ne", 4);
        m10717c(hashMap4, "kk", 5);
        m10717c(hashMap4, "it sc scn", 6);
        m10717c(hashMap4, "ka", 7);
        m10717c(hashMap4, "sq", 8);
        m10717c(hashMap4, "en", 9);
        m10717c(hashMap4, "mr", 10);
        m10717c(hashMap4, "ca", 11);
        m10717c(hashMap4, "mk", 12);
        m10717c(hashMap4, "az", 13);
        m10717c(hashMap4, "gu hi", 14);
        m10717c(hashMap4, "as bn", 15);
        m10717c(hashMap4, "cy", 16);
        m10717c(hashMap4, "be", 17);
        m10717c(hashMap4, "uk", 18);
        m10717c(hashMap4, "tk", 19);
        m10717c(hashMap4, "or", 20);
        m10717c(hashMap4, "gd", 21);
        m10717c(hashMap4, "kw", 22);
        hashMap3.putAll(hashMap4);
    }

    /* renamed from: b */
    private static void m10718b(Map<String, AbstractC8661p> map, String str, int i) {
        for (String str2 : str.split(" ")) {
            map.put(str2, new C11150b(i, null));
        }
    }

    /* renamed from: c */
    private static void m10717c(Map<String, AbstractC8661p> map, String str, int i) {
        for (String str2 : str.split(" ")) {
            map.put(str2, new C11151c(i, null));
        }
    }

    @Override // p161ij.AbstractC8660o
    /* renamed from: a */
    public AbstractC8661p mo10719a(Locale locale, EnumC8656k kVar) {
        Map<String, AbstractC8661p> map;
        AbstractC8661p pVar;
        AbstractC8661p pVar2;
        int i = C0356a.f24813a[kVar.ordinal()];
        if (i == 1) {
            map = f24809a;
            pVar = f24810b;
        } else if (i == 2) {
            map = f24811c;
            pVar = f24812d;
        } else {
            throw new UnsupportedOperationException(kVar.name());
        }
        String country = locale.getCountry();
        if (!country.isEmpty()) {
            pVar2 = map.get(locale.getLanguage() + '_' + country);
        } else {
            pVar2 = null;
        }
        if (pVar2 == null) {
            pVar2 = map.get(locale.getLanguage());
        }
        if (pVar2 == null) {
            return pVar;
        }
        return pVar2;
    }
}
