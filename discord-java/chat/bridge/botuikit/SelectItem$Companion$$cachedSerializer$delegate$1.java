package com.discord.chat.bridge.botuikit;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.s;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SelectItem$Companion$$cachedSerializer$delegate$1 extends s implements Function0<KSerializer<Object>> {
    public static final SelectItem$Companion$$cachedSerializer$delegate$1 INSTANCE = new SelectItem$Companion$$cachedSerializer$delegate$1();

    SelectItem$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return new SealedClassSerializer("com.discord.chat.bridge.botuikit.SelectItem", f0.b(SelectItem.class), new KClass[]{f0.b(SearchableSelectItem.class), f0.b(StringSelectItem.class)}, new KSerializer[]{SearchableSelectItem$$serializer.INSTANCE, StringSelectItem$$serializer.INSTANCE}, new Annotation[0]);
    }
}
