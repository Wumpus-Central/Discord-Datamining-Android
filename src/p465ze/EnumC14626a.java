package p465ze;

import android.net.NetworkInfo;

/* renamed from: ze.a */
/* loaded from: classes6.dex */
public enum EnumC14626a {
    CG_2G("2g"),
    CG_3G("3g"),
    CG_4G("4g"),
    CG_5G("5g");
    

    /* renamed from: k */
    public final String f33115k;

    EnumC14626a(String str) {
        this.f33115k = str;
    }

    /* renamed from: a */
    public static EnumC14626a m81a(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return null;
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == 20) {
            return CG_5G;
        }
        switch (subtype) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return CG_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
                return CG_3G;
            case 13:
            case 15:
                return CG_4G;
            default:
                return null;
        }
    }
}
