package com.discord.shortcuts;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/discord/shortcuts/ShortcutData;", "", "tag", "", "data", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "getTag", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "shortcuts_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ShortcutData {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_DATA = "discord_shortcut_data";
    private static final String KEY_SHORTCUT = "discord_shortcut";
    private static final String KEY_TAG = "discord_shortcut_tag";
    private final Map<String, String> data;
    private final String tag;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0010J\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/shortcuts/ShortcutData$Companion;", "", "()V", "KEY_DATA", "", "KEY_SHORTCUT", "KEY_TAG", "createShortcutIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "action", "clazz", "Ljava/lang/Class;", "tag", "data", "", "getShortcutIntentData", "Lcom/discord/shortcuts/ShortcutData;", "shortcuts_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent createShortcutIntent(Context context, String action, Class<?> clazz, String tag, Map<String, String> data) {
            List c10;
            List a10;
            q.g(context, "context");
            q.g(action, "action");
            q.g(clazz, "clazz");
            q.g(tag, "tag");
            q.g(data, "data");
            Intent putExtra = new Intent(action, null, context, clazz).putExtra(ShortcutData.KEY_SHORTCUT, true).putExtra(ShortcutData.KEY_TAG, tag);
            c10 = i.c();
            for (Map.Entry<String, String> entry : data.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value != null) {
                    c10.add(key);
                    c10.add(value);
                }
            }
            Unit unit = Unit.f20679a;
            a10 = i.a(c10);
            Intent putExtra2 = putExtra.putExtra(ShortcutData.KEY_DATA, (String[]) a10.toArray(new String[0]));
            q.f(putExtra2, "Intent(action, null, con…rray(),\n                )");
            return putExtra2;
        }

        
        
        
        public final com.discord.shortcuts.ShortcutData getShortcutIntentData(android.content.Intent r6) {
            
            throw new UnsupportedOperationException("Method not decompiled: com.discord.shortcuts.ShortcutData.Companion.getShortcutIntentData(android.content.Intent):com.discord.shortcuts.ShortcutData");
        }
    }

    public ShortcutData(String tag, Map<String, String> data) {
        q.g(tag, "tag");
        q.g(data, "data");
        this.tag = tag;
        this.data = data;
    }

    
    public static  ShortcutData copy$default(ShortcutData shortcutData, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = shortcutData.tag;
        }
        if ((i10 & 2) != 0) {
            map = shortcutData.data;
        }
        return shortcutData.copy(str, map);
    }

    public final String component1() {
        return this.tag;
    }

    public final Map<String, String> component2() {
        return this.data;
    }

    public final ShortcutData copy(String tag, Map<String, String> data) {
        q.g(tag, "tag");
        q.g(data, "data");
        return new ShortcutData(tag, data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortcutData)) {
            return false;
        }
        ShortcutData shortcutData = (ShortcutData) obj;
        return q.b(this.tag, shortcutData.tag) && q.b(this.data, shortcutData.data);
    }

    public final Map<String, String> getData() {
        return this.data;
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (this.tag.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        String str = this.tag;
        Map<String, String> map = this.data;
        return "ShortcutData(tag=" + str + ", data=" + map + ")";
    }
}
