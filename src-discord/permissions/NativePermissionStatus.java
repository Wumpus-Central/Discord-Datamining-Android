package com.discord.permissions;

import com.facebook.react.bridge.ReadableNativeMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.text.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/discord/permissions/NativePermissionStatus;", "", "(Ljava/lang/String;I)V", "AUTHORIZED", "DENIED", "RESTRICTED", "UNDETERMINED", "Companion", "permissions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public enum NativePermissionStatus {
    AUTHORIZED,
    DENIED,
    RESTRICTED,
    UNDETERMINED;
    
    private static final String ANDROID_PERMISSION_DENIED = "denied";
    private static final String ANDROID_PERMISSION_GRANTED = "granted";
    private static final String ANDROID_PERMISSION_NEVER_ASK_AGAIN = "never_ask_again";
    public static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/permissions/NativePermissionStatus$Companion;", "", "()V", "ANDROID_PERMISSION_DENIED", "", "ANDROID_PERMISSION_GRANTED", "ANDROID_PERMISSION_NEVER_ASK_AGAIN", "fromAndroidAuthorizationStatus", "value", "fromAndroidPermissionStatus", "permissions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String fromAndroidAuthorizationStatus(Object obj) {
            if (q.c(obj, Boolean.TRUE)) {
                String lowerCase = "AUTHORIZED".toLowerCase(Locale.ROOT);
                q.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return lowerCase;
            } else if (q.c(obj, Boolean.FALSE)) {
                String lowerCase2 = "DENIED".toLowerCase(Locale.ROOT);
                q.g(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return lowerCase2;
            } else {
                throw new IllegalStateException(("Unknown authorization result: " + obj).toString());
            }
        }

        public final String fromAndroidPermissionStatus(Object obj) {
            String str;
            boolean M;
            boolean M2;
            boolean M3;
            if (obj instanceof String) {
                str = (String) obj;
            } else if (obj instanceof ReadableNativeMap) {
                str = ((ReadableNativeMap) obj).toString();
            } else {
                throw new IllegalStateException(("Unknown authorization result: " + obj).toString());
            }
            M = p.M(str, NativePermissionStatus.ANDROID_PERMISSION_GRANTED, false, 2, null);
            if (M) {
                String lowerCase = "AUTHORIZED".toLowerCase(Locale.ROOT);
                q.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return lowerCase;
            }
            M2 = p.M(str, NativePermissionStatus.ANDROID_PERMISSION_DENIED, false, 2, null);
            if (M2) {
                String lowerCase2 = "DENIED".toLowerCase(Locale.ROOT);
                q.g(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return lowerCase2;
            }
            M3 = p.M(str, NativePermissionStatus.ANDROID_PERMISSION_NEVER_ASK_AGAIN, false, 2, null);
            if (M3) {
                String lowerCase3 = "DENIED".toLowerCase(Locale.ROOT);
                q.g(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return lowerCase3;
            }
            throw new IllegalStateException(("Unknown authorization result: " + obj).toString());
        }
    }
}
