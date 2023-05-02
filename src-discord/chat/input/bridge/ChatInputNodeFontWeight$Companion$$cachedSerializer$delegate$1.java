package com.discord.chat.input.bridge;

import bj.c0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ChatInputNodeFontWeight$Companion$$cachedSerializer$delegate$1 extends s implements Function0<KSerializer<Object>> {
    public static final ChatInputNodeFontWeight$Companion$$cachedSerializer$delegate$1 INSTANCE = new ChatInputNodeFontWeight$Companion$$cachedSerializer$delegate$1();

    ChatInputNodeFontWeight$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return c0.a("com.discord.chat.input.bridge.ChatInputNodeFontWeight", ChatInputNodeFontWeight.values(), new String[]{"bold"}, new Annotation[][]{null});
    }
}
