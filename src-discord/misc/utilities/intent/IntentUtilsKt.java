package com.discord.misc.utilities.intent;

import android.content.Intent;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.reflect.KClass;
import qf.a;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a\u0016\u0010\u0007\u001a\u00020\b*\u00020\u00052\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n\u001a\u0018\u0010\u000b\u001a\n \f*\u0004\u0018\u00010\u00010\u0001*\u0006\u0012\u0002\b\u00030\nH\u0002\u001a\u0016\u0010\r\u001a\u00020\u0005*\u00020\u00052\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n\u001a\u0012\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"ARG_KEY", "", "getIntentParcelable", "T", "Landroid/os/Parcelable;", "Landroid/content/Intent;", "(Landroid/content/Intent;)Landroid/os/Parcelable;", "hasExtra", "", "className", "Lkotlin/reflect/KClass;", "key", "kotlin.jvm.PlatformType", "putExtra", "putIntentParcelable", "actionIntent", "misc_utilities_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntentUtilsKt {
    private static final String ARG_KEY = "action_intent_arg_key";

    public static final <T extends Parcelable> T getIntentParcelable(Intent intent) {
        q.g(intent, "<this>");
        return (T) intent.getParcelableExtra(ARG_KEY);
    }

    public static final boolean hasExtra(Intent intent, KClass<?> className) {
        q.g(intent, "<this>");
        q.g(className, "className");
        return intent.hasExtra(key(className));
    }

    private static final String key(KClass<?> kClass) {
        return a.b(kClass).getName();
    }

    public static final Intent putExtra(Intent intent, KClass<?> className) {
        q.g(intent, "<this>");
        q.g(className, "className");
        Intent putExtra = intent.putExtra(key(className), true);
        q.f(putExtra, "putExtra(className.key(), true)");
        return putExtra;
    }

    public static final Intent putIntentParcelable(Intent intent, Parcelable actionIntent) {
        q.g(intent, "<this>");
        q.g(actionIntent, "actionIntent");
        Intent putExtra = intent.putExtra(ARG_KEY, actionIntent);
        q.f(putExtra, "putExtra(ARG_KEY, actionIntent)");
        return putExtra;
    }
}
