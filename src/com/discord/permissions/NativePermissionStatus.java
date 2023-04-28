package com.discord.permissions;

import java.io.Serializable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m15073d2 = {"Lcom/discord/permissions/NativePermissionStatus;", "", "(Ljava/lang/String;I)V", "AUTHORIZED", "DENIED", "RESTRICTED", "UNDETERMINED", "Companion", "permissions_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes3.dex */
public enum NativePermissionStatus {
    AUTHORIZED,
    DENIED,
    RESTRICTED,
    UNDETERMINED;
    
    private static final String ANDROID_PERMISSION_DENIED = "denied";
    private static final String ANDROID_PERMISSION_GRANTED = "granted";
    private static final String ANDROID_PERMISSION_NEVER_ASK_AGAIN = "never_ask_again";
    public static final Companion Companion = new Companion(null);

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\n\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m15073d2 = {"Lcom/discord/permissions/NativePermissionStatus$Companion;", "", "()V", "ANDROID_PERMISSION_DENIED", "", "ANDROID_PERMISSION_GRANTED", "ANDROID_PERMISSION_NEVER_ASK_AGAIN", "fromAndroidAuthorizationStatus", "Ljava/io/Serializable;", "value", "fromAndroidPermissionStatus", "permissions_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Serializable fromAndroidAuthorizationStatus(Object obj) {
            if (C9971q.m14638b(obj, Boolean.TRUE)) {
                String lowerCase = "AUTHORIZED".toLowerCase(Locale.ROOT);
                C9971q.m14634f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return lowerCase;
            } else if (C9971q.m14638b(obj, Boolean.FALSE)) {
                String lowerCase2 = "DENIED".toLowerCase(Locale.ROOT);
                C9971q.m14634f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return lowerCase2;
            } else {
                return new IllegalStateException("Unknown authorization result: " + obj);
            }
        }

        public final Serializable fromAndroidPermissionStatus(Object obj) {
            if (C9971q.m14638b(obj, NativePermissionStatus.ANDROID_PERMISSION_GRANTED)) {
                String lowerCase = "AUTHORIZED".toLowerCase(Locale.ROOT);
                C9971q.m14634f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return lowerCase;
            } else if (C9971q.m14638b(obj, NativePermissionStatus.ANDROID_PERMISSION_DENIED)) {
                String lowerCase2 = "DENIED".toLowerCase(Locale.ROOT);
                C9971q.m14634f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return lowerCase2;
            } else if (C9971q.m14638b(obj, NativePermissionStatus.ANDROID_PERMISSION_NEVER_ASK_AGAIN)) {
                String lowerCase3 = "DENIED".toLowerCase(Locale.ROOT);
                C9971q.m14634f(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return lowerCase3;
            } else {
                return new IllegalStateException("Unknown permission result: " + obj);
            }
        }
    }
}
