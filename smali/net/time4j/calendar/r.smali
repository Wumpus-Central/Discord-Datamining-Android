.class final Lnet/time4j/calendar/r;
.super Lnet/time4j/calendar/service/f;
.source "SourceFile"

# interfaces
.implements Lnet/time4j/calendar/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/time4j/calendar/r$c;,
        Lnet/time4j/calendar/r$b;,
        Lnet/time4j/calendar/r$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lfj/q<",
        "TT;>;:",
        "Lfj/g;",
        ">",
        "Lnet/time4j/calendar/service/f<",
        "TT;>;",
        "Lnet/time4j/calendar/l<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x3b5474289398ce20L


# instance fields
.field private final transient r:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final transient s:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Lnet/time4j/x0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Class;Lfj/p;Lfj/p;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;",
            "Lfj/p<",
            "Lnet/time4j/x0;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v1, "WEEKDAY_IN_MONTH"

    .line 2
    .line 3
    const/4 v3, 0x1

    .line 4
    invoke-interface {p2}, Lfj/p;->f()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    div-int/lit8 v4, v0, 0x7

    .line 15
    .line 16
    const/16 v5, 0x46

    .line 17
    .line 18
    new-instance v6, Lnet/time4j/calendar/r$c;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-direct {v6, v0}, Lnet/time4j/calendar/r$c;-><init>(Z)V

    .line 22
    .line 23
    .line 24
    new-instance v7, Lnet/time4j/calendar/r$c;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-direct {v7, v0}, Lnet/time4j/calendar/r$c;-><init>(Z)V

    .line 28
    .line 29
    .line 30
    move-object v0, p0

    .line 31
    move-object v2, p1

    .line 32
    invoke-direct/range {v0 .. v7}, Lnet/time4j/calendar/service/f;-><init>(Ljava/lang/String;Ljava/lang/Class;IICLfj/v;Lfj/v;)V

    .line 33
    .line 34
    .line 35
    iput-object p2, p0, Lnet/time4j/calendar/r;->r:Lfj/p;

    .line 36
    .line 37
    iput-object p3, p0, Lnet/time4j/calendar/r;->s:Lfj/p;

    .line 38
    .line 39
    return-void
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

.method static synthetic B(Lnet/time4j/calendar/r;)Lfj/p;
    .locals 0

    iget-object p0, p0, Lnet/time4j/calendar/r;->s:Lfj/p;

    return-object p0
.end method

.method static synthetic C(Lnet/time4j/calendar/r;)Lfj/p;
    .locals 0

    iget-object p0, p0, Lnet/time4j/calendar/r;->r:Lfj/p;

    return-object p0
.end method

.method static D(Lnet/time4j/calendar/r;)Lfj/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/q<",
            "TT;>;:",
            "Lfj/g;",
            ">(",
            "Lnet/time4j/calendar/r<",
            "TT;>;)",
            "Lfj/z<",
            "TT;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Lnet/time4j/calendar/r$a;

    invoke-direct {v0, p0}, Lnet/time4j/calendar/r$a;-><init>(Lnet/time4j/calendar/r;)V

    return-object v0
.end method


# virtual methods
.method public E(ILnet/time4j/x0;)Lfj/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lnet/time4j/x0;",
            ")",
            "Lfj/v<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lnet/time4j/calendar/r$b;

    invoke-direct {v0, p0, p1, p2}, Lnet/time4j/calendar/r$b;-><init>(Lnet/time4j/calendar/r;ILnet/time4j/x0;)V

    return-object v0
.end method
