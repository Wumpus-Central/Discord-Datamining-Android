package com.discord.chat.input;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import kotlinx.serialization.json.JsonBuilder;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/serialization/json/JsonBuilder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class ChatInputViewManager$json$1 extends s implements Function1<JsonBuilder, Unit> {
    public static final ChatInputViewManager$json$1 INSTANCE = new ChatInputViewManager$json$1();

    ChatInputViewManager$json$1() {
        super(1);
    }

    @Override 
    public   Unit invoke(JsonBuilder jsonBuilder) {
        invoke2(jsonBuilder);
        return Unit.f21601a;
    }

    
    public final void invoke2(JsonBuilder Json) {
        q.h(Json, "$this$Json");
        Json.c(true);
    }
}