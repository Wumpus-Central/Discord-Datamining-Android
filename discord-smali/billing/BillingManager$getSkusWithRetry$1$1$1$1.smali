.class final Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv2/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032,\u0010\u0004\u001a(\u0012\u000c\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u0001 \u0007*\u0012\u0012\u000c\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00080\u0005H\n\u00a2\u0006\u0002\u0008\t"
    }
    d2 = {
        "<anonymous>",
        "",
        "billingResult",
        "Lcom/android/billingclient/api/BillingResult;",
        "skuDetails",
        "",
        "Lcom/android/billingclient/api/SkuDetails;",
        "kotlin.jvm.PlatformType",
        "",
        "onSkuDetailsResponse"
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
.field final synthetic $cancellableContinuation:Lkotlinx/coroutines/CancellableContinuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/CancellableContinuation<",
            "Lcom/discord/billing/BillingManager$SkuDetailsResponse;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onError:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Exception;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/discord/billing/BillingManager;


# direct methods
.method constructor <init>(Lkotlinx/coroutines/CancellableContinuation;Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CancellableContinuation<",
            "-",
            "Lcom/discord/billing/BillingManager$SkuDetailsResponse;",
            ">;",
            "Lcom/discord/billing/BillingManager;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Exception;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1$1$1;->$cancellableContinuation:Lkotlinx/coroutines/CancellableContinuation;

    iput-object p2, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1$1$1;->this$0:Lcom/discord/billing/BillingManager;

    iput-object p3, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1$1$1;->$onError:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onSkuDetailsResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/BillingResult;",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/SkuDetails;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "billingResult"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1$1$1;->$cancellableContinuation:Lkotlinx/coroutines/CancellableContinuation;

    .line 7
    .line 8
    new-instance v1, Lcom/discord/billing/BillingManager$SkuDetailsResponse;

    .line 9
    .line 10
    invoke-direct {v1, p1, p2}, Lcom/discord/billing/BillingManager$SkuDetailsResponse;-><init>(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    new-instance p2, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1$1$1$1;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1$1$1;->this$0:Lcom/discord/billing/BillingManager;

    .line 16
    .line 17
    iget-object v3, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1$1$1;->$onError:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    invoke-direct {p2, v2, v3, p1}, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1$1$1$1;-><init>(Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v1, p2}, Lkotlinx/coroutines/CancellableContinuation;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
.end method
