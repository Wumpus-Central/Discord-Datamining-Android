package com.discord.phone_verification;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import com.discord.logging.Log;
import com.discord.phone_verification.AppSignatureHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes3.dex */
final class AppSignatureHelper$appSignatures$2 extends AbstractC9973s implements Function0<List<String>> {
    final /* synthetic */ AppSignatureHelper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSignatureHelper$appSignatures$2(AppSignatureHelper appSignatureHelper) {
        super(0);
        this.this$0 = appSignatureHelper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<String> invoke() {
        SigningInfo signingInfo;
        Signature[] apkContentsSigners;
        String hash;
        ArrayList arrayList = new ArrayList();
        try {
            String packageName = this.this$0.getPackageName();
            signingInfo = this.this$0.getPackageManager().getPackageInfo(packageName, 134217728).signingInfo;
            apkContentsSigners = signingInfo.getApkContentsSigners();
            C9971q.m14634f(apkContentsSigners, "packageManager.getPackag…ngInfo.apkContentsSigners");
            ArrayList arrayList2 = new ArrayList();
            for (Signature signature : apkContentsSigners) {
                AppSignatureHelper.Companion companion = AppSignatureHelper.Companion;
                C9971q.m14634f(packageName, "packageName");
                String charsString = signature.toCharsString();
                C9971q.m14634f(charsString, "signature.toCharsString()");
                hash = companion.hash(packageName, charsString);
                Log.i$default(Log.INSTANCE, companion.getTAG(), "Hash " + hash, (Throwable) null, 4, (Object) null);
                if (hash != null) {
                    arrayList2.add(hash);
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.INSTANCE.m32179e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", e);
            C9906j.m14820i();
        }
        return arrayList;
    }
}
