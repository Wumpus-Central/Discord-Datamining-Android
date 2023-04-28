package com.discord.notifications.api;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;
import kotlinx.serialization.json.JsonBuilder;

@Metadata(m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "", "Lkotlinx/serialization/json/JsonBuilder;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
final class NotificationMessageSerializer$json$1 extends AbstractC9679s implements Function1<JsonBuilder, Unit> {
    public static final NotificationMessageSerializer$json$1 INSTANCE = new NotificationMessageSerializer$json$1();

    NotificationMessageSerializer$json$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
        invoke2(jsonBuilder);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JsonBuilder Json) {
        C9677q.m14633g(Json, "$this$Json");
        Json.m13756c(true);
    }
}
