.class final Lcom/github/yamill/orientation/OrientationModule$c;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


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
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/app/Activity;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Landroid/app/Activity;",
        "a",
        "()Landroid/app/Activity;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic k:Lcom/github/yamill/orientation/OrientationModule;


# direct methods
.method constructor <init>(Lcom/github/yamill/orientation/OrientationModule;)V
    .locals 0

    iput-object p1, p0, Lcom/github/yamill/orientation/OrientationModule$c;->k:Lcom/github/yamill/orientation/OrientationModule;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/github/yamill/orientation/OrientationModule$c;->k:Lcom/github/yamill/orientation/OrientationModule;

    invoke-static {v0}, Lcom/github/yamill/orientation/OrientationModule;->access$getCurrentActivity(Lcom/github/yamill/orientation/OrientationModule;)Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/github/yamill/orientation/OrientationModule$c;->a()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method
