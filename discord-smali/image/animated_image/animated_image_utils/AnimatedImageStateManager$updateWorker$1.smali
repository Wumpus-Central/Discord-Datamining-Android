.class final Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager$updateWorker$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;->updateWorker(Z)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager<",
        "*>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u0004H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "stateManager",
        "Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;",
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


# static fields
.field public static final INSTANCE:Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager$updateWorker$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager$updateWorker$1;

    invoke-direct {v0}, Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager$updateWorker$1;-><init>()V

    sput-object v0, Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager$updateWorker$1;->INSTANCE:Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager$updateWorker$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;

    invoke-virtual {p0, p1}, Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager$updateWorker$1;->invoke(Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "stateManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;->access$reload(Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;)V

    return-void
.end method
