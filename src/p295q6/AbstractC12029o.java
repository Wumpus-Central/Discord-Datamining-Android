package p295q6;

import android.util.SparseArray;
import p295q6.C12017i;

/* renamed from: q6.o */
/* loaded from: classes7.dex */
public abstract class AbstractC12029o {

    /* renamed from: q6.o$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC12030a {
        /* renamed from: a */
        public abstract AbstractC12029o mo7957a();

        /* renamed from: b */
        public abstract AbstractC12030a mo7956b(EnumC12031b bVar);

        /* renamed from: c */
        public abstract AbstractC12030a mo7955c(EnumC12032c cVar);
    }

    /* renamed from: q6.o$b */
    /* loaded from: classes7.dex */
    public enum EnumC12031b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: G */
        private static final SparseArray<EnumC12031b> f39138G;

        /* renamed from: k */
        private final int f26973k;

        static {
            EnumC12031b bVar = UNKNOWN_MOBILE_SUBTYPE;
            EnumC12031b bVar2 = GPRS;
            EnumC12031b bVar3 = EDGE;
            EnumC12031b bVar4 = UMTS;
            EnumC12031b bVar5 = CDMA;
            EnumC12031b bVar6 = EVDO_0;
            EnumC12031b bVar7 = EVDO_A;
            EnumC12031b bVar8 = RTT;
            EnumC12031b bVar9 = HSDPA;
            EnumC12031b bVar10 = HSUPA;
            EnumC12031b bVar11 = HSPA;
            EnumC12031b bVar12 = IDEN;
            EnumC12031b bVar13 = EVDO_B;
            EnumC12031b bVar14 = LTE;
            EnumC12031b bVar15 = EHRPD;
            EnumC12031b bVar16 = HSPAP;
            EnumC12031b bVar17 = GSM;
            EnumC12031b bVar18 = TD_SCDMA;
            EnumC12031b bVar19 = IWLAN;
            EnumC12031b bVar20 = LTE_CA;
            SparseArray<EnumC12031b> sparseArray = new SparseArray<>();
            f39138G = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(1, bVar2);
            sparseArray.put(2, bVar3);
            sparseArray.put(3, bVar4);
            sparseArray.put(4, bVar5);
            sparseArray.put(5, bVar6);
            sparseArray.put(6, bVar7);
            sparseArray.put(7, bVar8);
            sparseArray.put(8, bVar9);
            sparseArray.put(9, bVar10);
            sparseArray.put(10, bVar11);
            sparseArray.put(11, bVar12);
            sparseArray.put(12, bVar13);
            sparseArray.put(13, bVar14);
            sparseArray.put(14, bVar15);
            sparseArray.put(15, bVar16);
            sparseArray.put(16, bVar17);
            sparseArray.put(17, bVar18);
            sparseArray.put(18, bVar19);
            sparseArray.put(19, bVar20);
        }

        EnumC12031b(int i) {
            this.f26973k = i;
        }

        /* renamed from: a */
        public static EnumC12031b m7954a(int i) {
            return f39138G.get(i);
        }

        /* renamed from: b */
        public int m7953b() {
            return this.f26973k;
        }
    }

    /* renamed from: q6.o$c */
    /* loaded from: classes7.dex */
    public enum EnumC12032c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        

        /* renamed from: E */
        private static final SparseArray<EnumC12032c> f39144E;

        /* renamed from: k */
        private final int f26989k;

        static {
            EnumC12032c cVar = MOBILE;
            EnumC12032c cVar2 = WIFI;
            EnumC12032c cVar3 = MOBILE_MMS;
            EnumC12032c cVar4 = MOBILE_SUPL;
            EnumC12032c cVar5 = MOBILE_DUN;
            EnumC12032c cVar6 = MOBILE_HIPRI;
            EnumC12032c cVar7 = WIMAX;
            EnumC12032c cVar8 = BLUETOOTH;
            EnumC12032c cVar9 = DUMMY;
            EnumC12032c cVar10 = ETHERNET;
            EnumC12032c cVar11 = MOBILE_FOTA;
            EnumC12032c cVar12 = MOBILE_IMS;
            EnumC12032c cVar13 = MOBILE_CBS;
            EnumC12032c cVar14 = WIFI_P2P;
            EnumC12032c cVar15 = MOBILE_IA;
            EnumC12032c cVar16 = MOBILE_EMERGENCY;
            EnumC12032c cVar17 = PROXY;
            EnumC12032c cVar18 = VPN;
            EnumC12032c cVar19 = NONE;
            SparseArray<EnumC12032c> sparseArray = new SparseArray<>();
            f39144E = sparseArray;
            sparseArray.put(0, cVar);
            sparseArray.put(1, cVar2);
            sparseArray.put(2, cVar3);
            sparseArray.put(3, cVar4);
            sparseArray.put(4, cVar5);
            sparseArray.put(5, cVar6);
            sparseArray.put(6, cVar7);
            sparseArray.put(7, cVar8);
            sparseArray.put(8, cVar9);
            sparseArray.put(9, cVar10);
            sparseArray.put(10, cVar11);
            sparseArray.put(11, cVar12);
            sparseArray.put(12, cVar13);
            sparseArray.put(13, cVar14);
            sparseArray.put(14, cVar15);
            sparseArray.put(15, cVar16);
            sparseArray.put(16, cVar17);
            sparseArray.put(17, cVar18);
            sparseArray.put(-1, cVar19);
        }

        EnumC12032c(int i) {
            this.f26989k = i;
        }

        /* renamed from: a */
        public static EnumC12032c m7952a(int i) {
            return f39144E.get(i);
        }

        /* renamed from: b */
        public int m7951b() {
            return this.f26989k;
        }
    }

    /* renamed from: a */
    public static AbstractC12030a m7960a() {
        return new C12017i.C12019b();
    }

    /* renamed from: b */
    public abstract EnumC12031b mo7959b();

    /* renamed from: c */
    public abstract EnumC12032c mo7958c();
}
