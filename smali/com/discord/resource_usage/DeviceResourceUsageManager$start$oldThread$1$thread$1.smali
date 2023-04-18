.class final Lcom/discord/resource_usage/DeviceResourceUsageManager$start$oldThread$1$thread$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/resource_usage/DeviceResourceUsageManager;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
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
.field final synthetic this$0:Lcom/discord/resource_usage/DeviceResourceUsageManager;


# direct methods
.method constructor <init>(Lcom/discord/resource_usage/DeviceResourceUsageManager;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager$start$oldThread$1$thread$1;->this$0:Lcom/discord/resource_usage/DeviceResourceUsageManager;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/resource_usage/DeviceResourceUsageManager$start$oldThread$1$thread$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/discord/resource_usage/DeviceResourceUsageManager$start$oldThread$1$thread$1;->this$0:Lcom/discord/resource_usage/DeviceResourceUsageManager;

    invoke-static {v0}, Lcom/discord/resource_usage/DeviceResourceUsageManager;->access$monitor(Lcom/discord/resource_usage/DeviceResourceUsageManager;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
