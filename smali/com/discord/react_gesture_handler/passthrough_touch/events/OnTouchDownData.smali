.class public final Lcom/discord/react_gesture_handler/passthrough_touch/events/OnTouchDownData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/reactevents/ReactEvent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/react_gesture_handler/passthrough_touch/events/OnTouchDownData$$serializer;,
        Lcom/discord/react_gesture_handler/passthrough_touch/events/OnTouchDownData$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \u00102\u00020\u0001:\u0002\u000f\u0010B\u0019\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J!\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u00c7\u0001\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/discord/react_gesture_handler/passthrough_touch/events/OnTouchDownData;",
        "Lcom/discord/reactevents/ReactEvent;",
        "seen1",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "()V",
        "write$Self",
        "",
        "self",
        "output",
        "Lkotlinx/serialization/encoding/CompositeEncoder;",
        "serialDesc",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "$serializer",
        "Companion",
        "react_gesture_handler_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lyi/f;
.end annotation


# static fields
.field public static final Companion:Lcom/discord/react_gesture_handler/passthrough_touch/events/OnTouchDownData$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/react_gesture_handler/passthrough_touch/events/OnTouchDownData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/react_gesture_handler/passthrough_touch/events/OnTouchDownData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/react_gesture_handler/passthrough_touch/events/OnTouchDownData;->Companion:Lcom/discord/react_gesture_handler/passthrough_touch/events/OnTouchDownData$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p2, p1, 0x0

    if-eqz p2, :cond_0

    .line 2
    sget-object p2, Lcom/discord/react_gesture_handler/passthrough_touch/events/OnTouchDownData$$serializer;->INSTANCE:Lcom/discord/react_gesture_handler/passthrough_touch/events/OnTouchDownData$$serializer;

    invoke-virtual {p2}, Lcom/discord/react_gesture_handler/passthrough_touch/events/OnTouchDownData$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p1, v0, p2}, Lbj/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final write$Self(Lcom/discord/react_gesture_handler/passthrough_touch/events/OnTouchDownData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 1

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "output"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "serialDesc"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public serialize()Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    invoke-static {p0}, Lcom/discord/reactevents/ReactEvent$DefaultImpls;->serialize(Lcom/discord/reactevents/ReactEvent;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    return-object v0
.end method
