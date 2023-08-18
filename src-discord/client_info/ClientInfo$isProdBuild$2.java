package com.discord.client_info;

import com.discord.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import kotlin.text.p;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class ClientInfo$isProdBuild$2 extends s implements Function0<Boolean> {
    public static final ClientInfo$isProdBuild$2 INSTANCE = new ClientInfo$isProdBuild$2();

    ClientInfo$isProdBuild$2() {
        super(0);
    }

    
    @Override 
    public final Boolean invoke() {
        String str;
        boolean M;
        String str2;
        boolean M2;
        boolean z10 = false;
        if (!ClientInfo.INSTANCE.isDebugBuild()) {
            str = ClientInfo.flavor;
            if (str == null) {
                q.z("flavor");
                str = null;
            }
            M = p.M(str, "beta", false, 2, null);
            if (!M) {
                str2 = ClientInfo.flavor;
                if (str2 == null) {
                    q.z("flavor");
                    str2 = null;
                }
                M2 = p.M(str2, BuildConfig.FLAVOR, false, 2, null);
                if (!M2) {
                    z10 = true;
                }
            }
        }
        return Boolean.valueOf(z10);
    }
}
