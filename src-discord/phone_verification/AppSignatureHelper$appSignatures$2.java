package com.discord.phone_verification;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.discord.logging.Log;
import com.discord.phone_verification.AppSignatureHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class AppSignatureHelper$appSignatures$2 extends s implements Function0<List<String>> {
    final  AppSignatureHelper this$0;

    
    
    public AppSignatureHelper$appSignatures$2(AppSignatureHelper appSignatureHelper) {
        super(0);
        this.this$0 = appSignatureHelper;
    }

    @Override 
    public final List<String> invoke() {
        Signature[] packageInfos;
        String hash;
        SigningInfo signingInfo;
        SigningInfo signingInfo2;
        ArrayList arrayList = new ArrayList();
        try {
            String packageName = this.this$0.getPackageName();
            PackageManager packageManager = this.this$0.getPackageManager();
            if (Build.VERSION.SDK_INT >= 33) {
                signingInfo2 = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(134217728)).signingInfo;
                packageInfos = signingInfo2.getApkContentsSigners();
            } else {
                signingInfo = packageManager.getPackageInfo(packageName, 134217728).signingInfo;
                packageInfos = signingInfo.getApkContentsSigners();
            }
            q.g(packageInfos, "packageInfos");
            ArrayList arrayList2 = new ArrayList();
            for (Signature signature : packageInfos) {
                AppSignatureHelper.Companion companion = AppSignatureHelper.Companion;
                q.g(packageName, "packageName");
                String charsString = signature.toCharsString();
                q.g(charsString, "signature.toCharsString()");
                hash = companion.hash(packageName, charsString);
                Log.i$default(Log.INSTANCE, companion.getTAG(), "Hash " + hash, (Throwable) null, 4, (Object) null);
                if (hash != null) {
                    arrayList2.add(hash);
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", e10);
            j.i();
        }
        return arrayList;
    }
}
