.class final Lcom/github/yamill/orientation/OrientationModule$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/github/yamill/orientation/OrientationModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "autoRotateEnabled",
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
.field final synthetic k:Lcom/github/yamill/orientation/OrientationModule;


# direct methods
.method constructor <init>(Lcom/github/yamill/orientation/OrientationModule;)V
    .locals 0

    iput-object p1, p0, Lcom/github/yamill/orientation/OrientationModule$a;->k:Lcom/github/yamill/orientation/OrientationModule;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/github/yamill/orientation/OrientationModule$a;->invoke(Z)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Z)V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/github/yamill/orientation/OrientationModule$a;->k:Lcom/github/yamill/orientation/OrientationModule;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x5

    const/4 v5, 0x0

    move v2, p1

    invoke-static/range {v0 .. v5}, Lcom/github/yamill/orientation/OrientationModule;->updateOrientation$default(Lcom/github/yamill/orientation/OrientationModule;Lcom/github/yamill/orientation/OrientationModule$d;ZZILjava/lang/Object;)V

    return-void
.end method
