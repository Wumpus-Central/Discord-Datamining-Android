package com.discord.chat.reactevents;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import wi.h1;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

final class TapSuppressNotificationsIconData$$cachedSerializer$delegate$1 extends s implements Function0<KSerializer<Object>> {
    public static final TapSuppressNotificationsIconData$$cachedSerializer$delegate$1 INSTANCE = new TapSuppressNotificationsIconData$$cachedSerializer$delegate$1();

    TapSuppressNotificationsIconData$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override 
    public final KSerializer<Object> invoke() {
        return new h1("com.discord.chat.reactevents.TapSuppressNotificationsIconData", TapSuppressNotificationsIconData.INSTANCE, new Annotation[0]);
    }
}
