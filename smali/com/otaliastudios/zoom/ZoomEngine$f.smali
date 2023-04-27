.class final Lcom/otaliastudios/zoom/ZoomEngine$f;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/otaliastudios/zoom/ZoomEngine;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lwe/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"
    }
    d2 = {
        "Lwe/b;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field final synthetic k:Lcom/otaliastudios/zoom/ZoomEngine;


# direct methods
.method constructor <init>(Lcom/otaliastudios/zoom/ZoomEngine;)V
    .locals 0

    iput-object p1, p0, Lcom/otaliastudios/zoom/ZoomEngine$f;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lwe/b;
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine$f;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-static {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->g(Lcom/otaliastudios/zoom/ZoomEngine;)Lwe/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine$f;->a()Lwe/b;

    move-result-object v0

    return-object v0
.end method
