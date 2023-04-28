package com.discord.chat.bridge.botuikit;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9951f0;
import kotlinx.serialization.KSerializer;
import p449yi.C14431c;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class SelectComponent$Companion$$cachedSerializer$delegate$1 extends AbstractC9973s implements Function0<KSerializer<Object>> {
    public static final SelectComponent$Companion$$cachedSerializer$delegate$1 INSTANCE = new SelectComponent$Companion$$cachedSerializer$delegate$1();

    SelectComponent$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return new C14431c(C9951f0.m14684b(SelectComponent.class), new Annotation[0]);
    }
}
