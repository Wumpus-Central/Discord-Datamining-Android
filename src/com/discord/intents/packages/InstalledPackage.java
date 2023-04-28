package com.discord.intents.packages;

import com.discord.intents.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m15073d2 = {"Lcom/discord/intents/packages/InstalledPackage;", "", "appName", "", "appPackage", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAppPackage", "()Ljava/lang/String;", "TWITTER", "WHATSAPP", "GMAIL", "LINE", "MESSENGER", "TELEGRAM", "Companion", "intents_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public enum InstalledPackage {
    TWITTER("twitter", BuildConfig.PACKAGE_TWITTER),
    WHATSAPP("whatsapp", BuildConfig.PACKAGE_WHATSAPP),
    GMAIL("googlegmail", null),
    LINE("line", BuildConfig.PACKAGE_LINE),
    MESSENGER("fb-messenger", BuildConfig.PACKAGE_FACEBOOK),
    TELEGRAM("tg", BuildConfig.PACKAGE_TELEGRAM);
    
    public static final Companion Companion = new Companion(null);
    private final String appName;
    private final String appPackage;

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m15073d2 = {"Lcom/discord/intents/packages/InstalledPackage$Companion;", "", "()V", "parse", "Lcom/discord/intents/packages/InstalledPackage;", "appName", "", "intents_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InstalledPackage parse(String appName) {
            InstalledPackage installedPackage;
            C9971q.m14633g(appName, "appName");
            InstalledPackage[] values = InstalledPackage.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    installedPackage = null;
                    break;
                }
                installedPackage = values[i];
                if (C9971q.m14638b(installedPackage.appName, appName)) {
                    break;
                }
                i++;
            }
            if (installedPackage != null) {
                return installedPackage;
            }
            throw new IllegalArgumentException("Unknown app name " + appName);
        }
    }

    InstalledPackage(String str, String str2) {
        this.appName = str;
        this.appPackage = str2;
    }

    public final String getAppPackage() {
        return this.appPackage;
    }
}
