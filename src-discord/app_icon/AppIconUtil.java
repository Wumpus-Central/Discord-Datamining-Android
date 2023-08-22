package com.discord.app_icon;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0011\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¨\u0006\u0016"}, d2 = {"Lcom/discord/app_icon/AppIconUtil;", "", "()V", "getAppIconFromId", "Lcom/discord/app_icon/AppIcon;", "id", "", "getAvailableIcons", "", "()[Lcom/discord/app_icon/AppIcon;", "getCurrentAppIcon", "context", "Landroid/content/Context;", "setAppIcon", "", "setComponentState", "packageManager", "Landroid/content/pm/PackageManager;", "componentName", "Landroid/content/ComponentName;", ViewProps.ENABLED, "", "app_icon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class AppIconUtil {
    public static final AppIconUtil INSTANCE = new AppIconUtil();

    private AppIconUtil() {
    }

    private final AppIcon getAppIconFromId(String str) {
        AppIcon[] values;
        for (AppIcon appIcon : AppIcon.values()) {
            if (q.c(appIcon.getId(), str)) {
                return appIcon;
            }
        }
        return null;
    }

    private final void setComponentState(PackageManager packageManager, ComponentName componentName, boolean z10) {
        packageManager.setComponentEnabledSetting(componentName, z10 ? 1 : 2, 1);
    }

    public final AppIcon[] getAvailableIcons() {
        return AppIcon.values();
    }

    public final AppIcon getCurrentAppIcon(Context context) {
        AppIcon appIcon;
        q.h(context, "context");
        PackageManager packageManager = context.getPackageManager();
        AppIcon[] values = AppIcon.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                appIcon = null;
                break;
            }
            appIcon = values[i10];
            boolean z10 = true;
            if (packageManager.getComponentEnabledSetting(new ComponentName(context, appIcon.getAlias())) != 1) {
                z10 = false;
            }
            if (z10) {
                break;
            }
            i10++;
        }
        if (appIcon == null) {
            return AppIcon.DEFAULT;
        }
        return appIcon;
    }

    public final void setAppIcon(Context context, String id2) {
        AppIcon[] values;
        boolean z10;
        q.h(context, "context");
        q.h(id2, "id");
        AppIcon appIconFromId = getAppIconFromId(id2);
        if (appIconFromId != null) {
            PackageManager packageManger = context.getPackageManager();
            for (AppIcon appIcon : AppIcon.values()) {
                ComponentName componentName = new ComponentName(context, appIcon.getAlias());
                if (appIcon == appIconFromId) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q.g(packageManger, "packageManger");
                setComponentState(packageManger, componentName, z10);
            }
            return;
        }
        throw new IllegalArgumentException("App Icon " + id2 + " does not exist.");
    }
}
