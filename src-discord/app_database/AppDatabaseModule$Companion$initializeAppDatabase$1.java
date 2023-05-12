package com.discord.app_database;

import android.content.SharedPreferences;
import com.discord.app_database.AppDatabaseModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppDatabaseModule$Companion$initializeAppDatabase$1 extends s implements Function0<Unit> {
    final /* synthetic */ SharedPreferences $preferences;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDatabaseModule$Companion$initializeAppDatabase$1(SharedPreferences sharedPreferences) {
        super(0);
        this.$preferences = sharedPreferences;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AppDatabaseModule.Companion companion = AppDatabaseModule.Companion;
        SharedPreferences preferences = this.$preferences;
        q.f(preferences, "preferences");
        companion.initializeAppDatabaseAsync(preferences);
    }
}
