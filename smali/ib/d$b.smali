.class public Lib/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/TypeEvaluator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lib/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/animation/TypeEvaluator<",
        "Lib/d$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Landroid/animation/TypeEvaluator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/animation/TypeEvaluator<",
            "Lib/d$e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lib/d$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lib/d$b;

    invoke-direct {v0}, Lib/d$b;-><init>()V

    sput-object v0, Lib/d$b;->b:Landroid/animation/TypeEvaluator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lib/d$e;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lib/d$e;-><init>(Lib/d$a;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lib/d$b;->a:Lib/d$e;

    .line 11
    .line 12
    return-void
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
.end method


# virtual methods
.method public a(FLib/d$e;Lib/d$e;)Lib/d$e;
    .locals 4

    .line 1
    iget-object v0, p0, Lib/d$b;->a:Lib/d$e;

    .line 2
    .line 3
    iget v1, p2, Lib/d$e;->a:F

    .line 4
    .line 5
    iget v2, p3, Lib/d$e;->a:F

    .line 6
    .line 7
    invoke-static {v1, v2, p1}, Lpb/a;->c(FFF)F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget v2, p2, Lib/d$e;->b:F

    .line 12
    .line 13
    iget v3, p3, Lib/d$e;->b:F

    .line 14
    .line 15
    invoke-static {v2, v3, p1}, Lpb/a;->c(FFF)F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget p2, p2, Lib/d$e;->c:F

    .line 20
    .line 21
    iget p3, p3, Lib/d$e;->c:F

    .line 22
    .line 23
    invoke-static {p2, p3, p1}, Lpb/a;->c(FFF)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {v0, v1, v2, p1}, Lib/d$e;->a(FFF)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lib/d$b;->a:Lib/d$e;

    .line 31
    .line 32
    return-object p1
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

.method public bridge synthetic evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lib/d$e;

    check-cast p3, Lib/d$e;

    invoke-virtual {p0, p1, p2, p3}, Lib/d$b;->a(FLib/d$e;Lib/d$e;)Lib/d$e;

    move-result-object p1

    return-object p1
.end method
