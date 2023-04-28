package com.discord.shortcuts;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.core.content.C1162g;
import androidx.core.content.p017pm.C1168b;
import androidx.core.content.p017pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9624v;
import kotlin.collections.C9625w;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000D\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\u001a\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001aL\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016¨\u0006\u0017"}, m15073d2 = {"getShareCategories", "", "", "addShortcut", "Landroidx/core/app/NotificationCompat$Builder;", "context", "Landroid/content/Context;", "shortcutInfo", "Landroidx/core/content/pm/ShortcutInfoCompat;", "createShortcut", "id", "label", "", "longLabel", "icon", "Landroid/graphics/Bitmap;", "persons", "", "Landroidx/core/app/Person;", "intent", "Landroid/content/Intent;", "rank", "", "shortcuts_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class ShortcutUtilsKt {
    public static final NotificationCompat.Builder addShortcut(NotificationCompat.Builder builder, Context context, ShortcutInfoCompat shortcutInfo) {
        C9677q.m14633g(builder, "<this>");
        C9677q.m14633g(context, "context");
        C9677q.m14633g(shortcutInfo, "shortcutInfo");
        builder.m38554W(shortcutInfo.m38092f());
        builder.m38562O(new C1162g(shortcutInfo.m38092f()));
        C1168b.m38064f(context, shortcutInfo);
        return builder;
    }

    public static final ShortcutInfoCompat createShortcut(Context context, String id2, CharSequence label, CharSequence longLabel, Bitmap bitmap, List<? extends Person> persons, Intent intent, int i) {
        IconCompat iconCompat;
        C9677q.m14633g(context, "<this>");
        C9677q.m14633g(id2, "id");
        C9677q.m14633g(label, "label");
        C9677q.m14633g(longLabel, "longLabel");
        C9677q.m14633g(persons, "persons");
        C9677q.m14633g(intent, "intent");
        ShortcutInfoCompat.C1165a i2 = new ShortcutInfoCompat.C1165a(context, id2).m38078h(new C1162g(id2)).m38073m(label).m38077i(longLabel);
        if (bitmap != null) {
            iconCompat = IconCompat.m37875h(bitmap);
        } else {
            iconCompat = null;
        }
        ShortcutInfoCompat a = i2.m38081e(iconCompat).m38080f(intent).m38074l(i).m38076j(true).m38083c(getShareCategories()).m38075k((Person[]) persons.toArray(new Person[0])).m38085a();
        C9677q.m14634f(a, "Builder(this, id)\n      …Array())\n        .build()");
        return a;
    }

    private static final Set<String> getShareCategories() {
        Set<String> i;
        Set<String> c;
        if (Build.VERSION.SDK_INT < 25) {
            c = C9624v.m14723c(BuildConfig.SHARE_CATEGORY);
            return c;
        }
        i = C9625w.m14717i(BuildConfig.SHARE_CATEGORY, "android.shortcut.conversation");
        return i;
    }
}
