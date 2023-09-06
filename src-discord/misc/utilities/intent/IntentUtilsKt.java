package com.discord.misc.utilities.intent;

import android.content.Intent;
import android.os.Parcelable;
import androidx.core.content.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.reflect.KClass;
import vf.a;

@Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a(\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006\u001a1\u0010\u0007\u001a\u0012\u0012\f\u0012\n \t*\u0004\u0018\u0001H\u0001H\u0001\u0018\u00010\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b\u001a\u0016\u0010\n\u001a\u00020\u000b*\u00020\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r\u001a\u0018\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\u00050\u0005*\u0006\u0012\u0002\b\u00030\rH\u0002\u001a\u0016\u0010\u000f\u001a\u00020\u0003*\u00020\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r\u001a\u001a\u0010\u0010\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0002¨\u0006\u0012"}, d2 = {"getIntentParcelable", "T", "Landroid/os/Parcelable;", "Landroid/content/Intent;", "parcelableKey", "", "(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/Parcelable;", "getIntentParcelableArrayList", "Ljava/util/ArrayList;", "kotlin.jvm.PlatformType", "hasExtra", "", "className", "Lkotlin/reflect/KClass;", "key", "putExtra", "putIntentParcelable", "actionIntent", "misc_utilities_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class IntentUtilsKt {
    public static final  <T extends Parcelable> T getIntentParcelable(Intent intent, String parcelableKey) {
        q.h(intent, "<this>");
        q.h(parcelableKey, "parcelableKey");
        q.n(4, "T");
        return (T) ((Parcelable) e.b(intent, parcelableKey, Parcelable.class));
    }

    public static final  <T extends Parcelable> ArrayList<T> getIntentParcelableArrayList(Intent intent, String parcelableKey) {
        q.h(intent, "<this>");
        q.h(parcelableKey, "parcelableKey");
        q.n(4, "T");
        return e.a(intent, parcelableKey, Parcelable.class);
    }

    public static final boolean hasExtra(Intent intent, KClass<?> className) {
        q.h(intent, "<this>");
        q.h(className, "className");
        return intent.hasExtra(key(className));
    }

    private static final String key(KClass<?> kClass) {
        return a.b(kClass).getName();
    }

    public static final Intent putExtra(Intent intent, KClass<?> className) {
        q.h(intent, "<this>");
        q.h(className, "className");
        Intent putExtra = intent.putExtra(key(className), true);
        q.g(putExtra, "putExtra(className.key(), true)");
        return putExtra;
    }

    public static final Intent putIntentParcelable(Intent intent, String parcelableKey, Parcelable actionIntent) {
        q.h(intent, "<this>");
        q.h(parcelableKey, "parcelableKey");
        q.h(actionIntent, "actionIntent");
        Intent putExtra = intent.putExtra(parcelableKey, actionIntent);
        q.g(putExtra, "putExtra(parcelableKey, actionIntent)");
        return putExtra;
    }
}
