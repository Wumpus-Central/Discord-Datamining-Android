package com.discord.chat.reactevents;

import bj.C2532h1;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;
import kotlinx.serialization.KSerializer;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class TapSuppressNotificationsIconData$$cachedSerializer$delegate$1 extends AbstractC9679s implements Function0<KSerializer<Object>> {
    public static final TapSuppressNotificationsIconData$$cachedSerializer$delegate$1 INSTANCE = new TapSuppressNotificationsIconData$$cachedSerializer$delegate$1();

    TapSuppressNotificationsIconData$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return new C2532h1("com.discord.chat.reactevents.TapSuppressNotificationsIconData", TapSuppressNotificationsIconData.INSTANCE, new Annotation[0]);
    }
}
