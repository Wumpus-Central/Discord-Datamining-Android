.class final Lcom/discord/react/utilities/PromiseWrapper$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/react/utilities/PromiseWrapper;-><init>(Lcom/facebook/react/bridge/Promise;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/react/utilities/PromiseWrapper$Rejection;",
        "Lcom/discord/react/utilities/PromiseWrapper$Rejection;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "Lcom/discord/react/utilities/PromiseWrapper$Rejection;",
        "it",
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
.field public static final INSTANCE:Lcom/discord/react/utilities/PromiseWrapper$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/react/utilities/PromiseWrapper$2;

    invoke-direct {v0}, Lcom/discord/react/utilities/PromiseWrapper$2;-><init>()V

    sput-object v0, Lcom/discord/react/utilities/PromiseWrapper$2;->INSTANCE:Lcom/discord/react/utilities/PromiseWrapper$2;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/discord/react/utilities/PromiseWrapper$Rejection;)Lcom/discord/react/utilities/PromiseWrapper$Rejection;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    invoke-virtual {p0, p1}, Lcom/discord/react/utilities/PromiseWrapper$2;->invoke(Lcom/discord/react/utilities/PromiseWrapper$Rejection;)Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    move-result-object p1

    return-object p1
.end method
