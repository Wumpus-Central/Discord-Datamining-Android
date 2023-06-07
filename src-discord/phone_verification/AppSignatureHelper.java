package com.discord.phone_verification;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Base64;
import com.discord.logging.Log;
import dl.f;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import kg.n;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/discord/phone_verification/AppSignatureHelper;", "Landroid/content/ContextWrapper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appSignatures", "", "", "getAppSignatures", "()Ljava/util/List;", "appSignatures$delegate", "Lkotlin/Lazy;", "Companion", "phone_verification_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"PackageManagerGetSignatures"})
/* loaded from: classes3.dex */
public final class AppSignatureHelper extends ContextWrapper {
    public static final Companion Companion = new Companion(null);
    private static final String HASH_TYPE = "SHA-256";
    private static final int NUM_BASE64_CHAR = 11;
    private static final int NUM_HASHED_BYTES = 9;
    private static final String TAG;
    private final Lazy appSignatures$delegate;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/discord/phone_verification/AppSignatureHelper$Companion;", "", "()V", "HASH_TYPE", "", "NUM_BASE64_CHAR", "", "NUM_HASHED_BYTES", "TAG", "getTAG", "()Ljava/lang/String;", "hash", "packageName", "signature", "phone_verification_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String hash(String str, String str2) {
            byte[] i10;
            try {
                MessageDigest instance = MessageDigest.getInstance(AppSignatureHelper.HASH_TYPE);
                q.f(instance, "getInstance(HASH_TYPE)");
                instance.update(f.a(str + " " + str2));
                byte[] digest = instance.digest();
                q.f(digest, "messageDigest.digest()");
                i10 = e.i(digest, 0, 9);
                String encodeToString = Base64.encodeToString(i10, 3);
                q.f(encodeToString, "encodeToString(hashSigna…ADDING or Base64.NO_WRAP)");
                String substring = encodeToString.substring(0, 11);
                q.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Log.i$default(Log.INSTANCE, getTAG(), "pkg: " + str + " -- hash: " + substring, (Throwable) null, 4, (Object) null);
                return substring;
            } catch (NoSuchAlgorithmException e10) {
                Log.INSTANCE.e(getTAG(), "hash:NoSuchAlgorithm", e10);
                return null;
            }
        }

        public final String getTAG() {
            return AppSignatureHelper.TAG;
        }
    }

    static {
        String simpleName = AppSignatureHelper.class.getSimpleName();
        q.f(simpleName, "AppSignatureHelper::class.java.simpleName");
        TAG = simpleName;
    }

    public AppSignatureHelper(Context context) {
        super(context);
        Lazy b10;
        b10 = n.b(new AppSignatureHelper$appSignatures$2(this));
        this.appSignatures$delegate = b10;
    }

    public final List<String> getAppSignatures() {
        return (List) this.appSignatures$delegate.getValue();
    }
}
