.class public final Lcom/discord/misc/utilities/time/IntervalFlowKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\u001a-\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0000H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001e\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000b"
    }
    d2 = {
        "Lqi/a;",
        "period",
        "initialDelay",
        "Lkotlinx/coroutines/flow/Flow;",
        "",
        "intervalFlow-QTBD994",
        "(JJ)Lkotlinx/coroutines/flow/Flow;",
        "intervalFlow",
        "",
        "periodMs",
        "initialDelayMs",
        "misc_utilities_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final intervalFlow(JJ)Lkotlinx/coroutines/flow/Flow;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v6, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;

    const/4 v5, 0x0

    move-object v0, v6

    move-wide v1, p2

    move-wide v3, p0

    invoke-direct/range {v0 .. v5}, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;-><init>(JJLkotlin/coroutines/Continuation;)V

    invoke-static {v6}, Lkotlinx/coroutines/flow/d;->e(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic intervalFlow$default(JJILjava/lang/Object;)Lkotlinx/coroutines/flow/Flow;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    move-wide p2, p0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/discord/misc/utilities/time/IntervalFlowKt;->intervalFlow(JJ)Lkotlinx/coroutines/flow/Flow;

    move-result-object p0

    return-object p0
.end method

.method public static final intervalFlow-QTBD994(JJ)Lkotlinx/coroutines/flow/Flow;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v6, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$1;

    const/4 v5, 0x0

    move-object v0, v6

    move-wide v1, p2

    move-wide v3, p0

    invoke-direct/range {v0 .. v5}, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$1;-><init>(JJLkotlin/coroutines/Continuation;)V

    invoke-static {v6}, Lkotlinx/coroutines/flow/d;->e(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic intervalFlow-QTBD994$default(JJILjava/lang/Object;)Lkotlinx/coroutines/flow/Flow;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    move-wide p2, p0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/discord/misc/utilities/time/IntervalFlowKt;->intervalFlow-QTBD994(JJ)Lkotlinx/coroutines/flow/Flow;

    move-result-object p0

    return-object p0
.end method
