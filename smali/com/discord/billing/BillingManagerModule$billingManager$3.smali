.class final Lcom/discord/billing/BillingManagerModule$billingManager$3;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/billing/BillingManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "downgradeCommand",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

.field final synthetic this$0:Lcom/discord/billing/BillingManagerModule;


# direct methods
.method constructor <init>(Lcom/discord/billing/BillingManagerModule;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/billing/BillingManagerModule$billingManager$3;->this$0:Lcom/discord/billing/BillingManagerModule;

    iput-object p2, p0, Lcom/discord/billing/BillingManagerModule$billingManager$3;->$reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/discord/billing/BillingManagerModule$billingManager$3;->invoke(I)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(I)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/discord/billing/BillingManagerModule$billingManager$3;->this$0:Lcom/discord/billing/BillingManagerModule;

    invoke-static {v0}, Lcom/discord/billing/BillingManagerModule;->access$getReactEvents$p(Lcom/discord/billing/BillingManagerModule;)Lcom/discord/reactevents/ReactEvents;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/discord/billing/BillingManagerModule$billingManager$3;->$reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 4
    new-instance v2, Lcom/discord/billing/react/events/BillingManagerDowngradeCommand;

    invoke-direct {v2, p1}, Lcom/discord/billing/react/events/BillingManagerDowngradeCommand;-><init>(I)V

    .line 5
    invoke-virtual {v0, v1, v2}, Lcom/discord/reactevents/ReactEvents;->emitModuleEvent(Landroid/content/Context;Lcom/discord/reactevents/ReactEvent;)V

    return-void
.end method