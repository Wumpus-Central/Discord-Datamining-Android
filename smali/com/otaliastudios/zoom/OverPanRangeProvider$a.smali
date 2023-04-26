.class public final Lcom/otaliastudios/zoom/OverPanRangeProvider$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/otaliastudios/zoom/OverPanRangeProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/otaliastudios/zoom/OverPanRangeProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "com/otaliastudios/zoom/OverPanRangeProvider$a",
        "Lcom/otaliastudios/zoom/OverPanRangeProvider;",
        "Lcom/otaliastudios/zoom/ZoomEngine;",
        "engine",
        "",
        "horizontal",
        "",
        "a",
        "c",
        "F",
        "DEFAULT_OVERPAN_FACTOR",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field private final c:F


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x3dcccccd    # 0.1f

    .line 5
    .line 6
    .line 7
    iput v0, p0, Lcom/otaliastudios/zoom/OverPanRangeProvider$a;->c:F

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public a(Lcom/otaliastudios/zoom/ZoomEngine;Z)F
    .locals 1

    .line 1
    const-string v0, "engine"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-ne p2, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/otaliastudios/zoom/ZoomEngine;->v()F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iget p2, p0, Lcom/otaliastudios/zoom/OverPanRangeProvider$a;->c:F

    .line 14
    .line 15
    :goto_0
    mul-float/2addr p1, p2

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    if-nez p2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/otaliastudios/zoom/ZoomEngine;->u()F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget p2, p0, Lcom/otaliastudios/zoom/OverPanRangeProvider$a;->c:F

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :goto_1
    return p1

    .line 27
    :cond_1
    new-instance p1, Llf/q;

    .line 28
    .line 29
    invoke-direct {p1}, Llf/q;-><init>()V

    .line 30
    .line 31
    .line 32
    throw p1
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
.end method
