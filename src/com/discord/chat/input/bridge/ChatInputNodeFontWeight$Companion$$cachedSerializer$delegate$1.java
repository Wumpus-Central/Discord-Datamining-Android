package com.discord.chat.input.bridge;

import bj.C3631c0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlinx.serialization.KSerializer;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class ChatInputNodeFontWeight$Companion$$cachedSerializer$delegate$1 extends AbstractC9973s implements Function0<KSerializer<Object>> {
    public static final ChatInputNodeFontWeight$Companion$$cachedSerializer$delegate$1 INSTANCE = new ChatInputNodeFontWeight$Companion$$cachedSerializer$delegate$1();

    ChatInputNodeFontWeight$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return C3631c0.m33941a("com.discord.chat.input.bridge.ChatInputNodeFontWeight", ChatInputNodeFontWeight.values(), new String[]{"bold"}, new Annotation[][]{null});
    }
}
