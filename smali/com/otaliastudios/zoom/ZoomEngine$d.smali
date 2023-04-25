.class final Lcom/otaliastudios/zoom/ZoomEngine$d;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/otaliastudios/zoom/ZoomEngine;->M(FFFZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lve/c$a;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"
    }
    d2 = {
        "Lve/c$a;",
        "",
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
.field final synthetic k:F

.field final synthetic l:F

.field final synthetic m:F


# direct methods
.method constructor <init>(FFF)V
    .locals 0

    iput p1, p0, Lcom/otaliastudios/zoom/ZoomEngine$d;->k:F

    iput p2, p0, Lcom/otaliastudios/zoom/ZoomEngine$d;->l:F

    iput p3, p0, Lcom/otaliastudios/zoom/ZoomEngine$d;->m:F

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lve/c$a;)V
    .locals 4

    .line 1
    const-string v0, "$this$obtain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/otaliastudios/zoom/ZoomEngine$d;->k:F

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v0, v1}, Lve/c$a;->i(FZ)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lcom/otaliastudios/zoom/AbsolutePoint;

    .line 13
    .line 14
    iget v2, p0, Lcom/otaliastudios/zoom/ZoomEngine$d;->l:F

    .line 15
    .line 16
    iget v3, p0, Lcom/otaliastudios/zoom/ZoomEngine$d;->m:F

    .line 17
    .line 18
    invoke-direct {v0, v2, v3}, Lcom/otaliastudios/zoom/AbsolutePoint;-><init>(FF)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0, v1}, Lve/c$a;->d(Lcom/otaliastudios/zoom/AbsolutePoint;Z)V

    .line 22
    .line 23
    .line 24
    return-void
    .line 25
    .line 26
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lve/c$a;

    invoke-virtual {p0, p1}, Lcom/otaliastudios/zoom/ZoomEngine$d;->a(Lve/c$a;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
