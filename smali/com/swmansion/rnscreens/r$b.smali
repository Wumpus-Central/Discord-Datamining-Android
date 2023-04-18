.class final Lcom/swmansion/rnscreens/r$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/rnscreens/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0013\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ)\u0010\t\u001a\u00060\u0000R\u00020\u00082\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002J\u0006\u0010\u000b\u001a\u00020\nR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/r$b;",
        "",
        "Landroid/graphics/Canvas;",
        "canvas",
        "Landroid/view/View;",
        "child",
        "",
        "drawingTime",
        "Lcom/swmansion/rnscreens/r;",
        "e",
        "",
        "a",
        "Landroid/graphics/Canvas;",
        "b",
        "()Landroid/graphics/Canvas;",
        "setCanvas",
        "(Landroid/graphics/Canvas;)V",
        "Landroid/view/View;",
        "c",
        "()Landroid/view/View;",
        "setChild",
        "(Landroid/view/View;)V",
        "J",
        "d",
        "()J",
        "setDrawingTime",
        "(J)V",
        "<init>",
        "(Lcom/swmansion/rnscreens/r;)V",
        "react-native-screens_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private a:Landroid/graphics/Canvas;

.field private b:Landroid/view/View;

.field private c:J

.field final synthetic d:Lcom/swmansion/rnscreens/r;


# direct methods
.method public constructor <init>(Lcom/swmansion/rnscreens/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/swmansion/rnscreens/r$b;->d:Lcom/swmansion/rnscreens/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/r$b;->d:Lcom/swmansion/rnscreens/r;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/swmansion/rnscreens/r;->z(Lcom/swmansion/rnscreens/r;Lcom/swmansion/rnscreens/r$b;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/swmansion/rnscreens/r$b;->a:Landroid/graphics/Canvas;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/swmansion/rnscreens/r$b;->b:Landroid/view/View;

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/swmansion/rnscreens/r$b;->c:J

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final b()Landroid/graphics/Canvas;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/r$b;->a:Landroid/graphics/Canvas;

    return-object v0
.end method

.method public final c()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/r$b;->b:Landroid/view/View;

    return-object v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Lcom/swmansion/rnscreens/r$b;->c:J

    return-wide v0
.end method

.method public final e(Landroid/graphics/Canvas;Landroid/view/View;J)Lcom/swmansion/rnscreens/r$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/r$b;->a:Landroid/graphics/Canvas;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/swmansion/rnscreens/r$b;->b:Landroid/view/View;

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/swmansion/rnscreens/r$b;->c:J

    .line 6
    .line 7
    return-object p0
    .line 8
    .line 9
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
    .line 24
    .line 25
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
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method
