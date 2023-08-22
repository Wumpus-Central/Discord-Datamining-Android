package com.discord.shortcuts;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.core.content.g;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.b;
import androidx.core.graphics.drawable.IconCompat;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.v;
import kotlin.collections.w;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\u001a\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001aL\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016¨\u0006\u0017"}, d2 = {"getShareCategories", "", "", "addShortcut", "Landroidx/core/app/NotificationCompat$Builder;", "context", "Landroid/content/Context;", "shortcutInfo", "Landroidx/core/content/pm/ShortcutInfoCompat;", "createShortcut", "id", "label", "", "longLabel", "icon", "Landroid/graphics/Bitmap;", "persons", "", "Landroidx/core/app/Person;", "intent", "Landroid/content/Intent;", "rank", "", "shortcuts_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class ShortcutUtilsKt {
    public static final NotificationCompat.Builder addShortcut(NotificationCompat.Builder builder, Context context, ShortcutInfoCompat shortcutInfo) {
        q.h(builder, "<this>");
        q.h(context, "context");
        q.h(shortcutInfo, "shortcutInfo");
        builder.W(shortcutInfo.g());
        builder.O(new g(shortcutInfo.g()));
        b.g(context, shortcutInfo);
        return builder;
    }

    public static final ShortcutInfoCompat createShortcut(Context context, String id2, CharSequence label, CharSequence longLabel, Bitmap bitmap, List<? extends Person> persons, Intent intent, int i10) {
        q.h(context, "<this>");
        q.h(id2, "id");
        q.h(label, "label");
        q.h(longLabel, "longLabel");
        q.h(persons, "persons");
        q.h(intent, "intent");
        ShortcutInfoCompat a10 = new ShortcutInfoCompat.b(context, id2).h(new g(id2)).m(label).i(longLabel).e(bitmap != null ? IconCompat.i(bitmap) : null).f(intent).l(i10).j(true).c(getShareCategories()).k((Person[]) persons.toArray(new Person[0])).a();
        q.g(a10, "Builder(this, id)\n      …Array())\n        .build()");
        return a10;
    }

    public static  ShortcutInfoCompat createShortcut$default(Context context, String str, CharSequence charSequence, CharSequence charSequence2, Bitmap bitmap, List list, Intent intent, int i10, int i11, Object obj) {
        return createShortcut(context, str, charSequence, charSequence2, bitmap, list, intent, (i11 & 64) != 0 ? 0 : i10);
    }

    private static final Set<String> getShareCategories() {
        Set<String> i10;
        Set<String> c10;
        if (Build.VERSION.SDK_INT < 25) {
            c10 = v.c(BuildConfig.SHARE_CATEGORY);
            return c10;
        }
        i10 = w.i(BuildConfig.SHARE_CATEGORY, "android.shortcut.conversation");
        return i10;
    }
}
