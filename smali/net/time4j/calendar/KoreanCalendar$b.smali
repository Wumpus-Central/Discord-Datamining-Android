.class Lnet/time4j/calendar/KoreanCalendar$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/calendar/KoreanCalendar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/z<",
        "Lnet/time4j/calendar/KoreanCalendar;",
        "Lnet/time4j/calendar/k;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/calendar/KoreanCalendar$a;)V
    .locals 0

    invoke-direct {p0}, Lnet/time4j/calendar/KoreanCalendar$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/KoreanCalendar;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/KoreanCalendar$b;->b(Lnet/time4j/calendar/KoreanCalendar;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public b(Lnet/time4j/calendar/KoreanCalendar;)Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/calendar/KoreanCalendar;",
            ")",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    new-instance p1, Ljava/lang/AbstractMethodError;

    const-string v0, "Never called."

    invoke-direct {p1, v0}, Ljava/lang/AbstractMethodError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/KoreanCalendar;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/KoreanCalendar$b;->d(Lnet/time4j/calendar/KoreanCalendar;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public d(Lnet/time4j/calendar/KoreanCalendar;)Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/calendar/KoreanCalendar;",
            ")",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    new-instance p1, Ljava/lang/AbstractMethodError;

    const-string v0, "Never called."

    invoke-direct {p1, v0}, Ljava/lang/AbstractMethodError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Lnet/time4j/calendar/KoreanCalendar;)Lnet/time4j/calendar/k;
    .locals 0

    sget-object p1, Lnet/time4j/calendar/k;->m:Lnet/time4j/calendar/k;

    return-object p1
.end method

.method public f(Lnet/time4j/calendar/KoreanCalendar;)Lnet/time4j/calendar/k;
    .locals 0

    sget-object p1, Lnet/time4j/calendar/k;->m:Lnet/time4j/calendar/k;

    return-object p1
.end method

.method public g(Lnet/time4j/calendar/KoreanCalendar;)Lnet/time4j/calendar/k;
    .locals 0

    sget-object p1, Lnet/time4j/calendar/k;->m:Lnet/time4j/calendar/k;

    return-object p1
.end method

.method public h(Lnet/time4j/calendar/KoreanCalendar;Lnet/time4j/calendar/k;)Z
    .locals 0

    sget-object p1, Lnet/time4j/calendar/k;->m:Lnet/time4j/calendar/k;

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public i(Lnet/time4j/calendar/KoreanCalendar;Lnet/time4j/calendar/k;Z)Lnet/time4j/calendar/KoreanCalendar;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/KoreanCalendar$b;->h(Lnet/time4j/calendar/KoreanCalendar;Lnet/time4j/calendar/k;)Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    new-instance p3, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v0, "Invalid Korean era: "

    .line 16
    .line 17
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1
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

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/KoreanCalendar;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/KoreanCalendar$b;->e(Lnet/time4j/calendar/KoreanCalendar;)Lnet/time4j/calendar/k;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lnet/time4j/calendar/KoreanCalendar;

    check-cast p2, Lnet/time4j/calendar/k;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/KoreanCalendar$b;->h(Lnet/time4j/calendar/KoreanCalendar;Lnet/time4j/calendar/k;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/KoreanCalendar;

    check-cast p2, Lnet/time4j/calendar/k;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/calendar/KoreanCalendar$b;->i(Lnet/time4j/calendar/KoreanCalendar;Lnet/time4j/calendar/k;Z)Lnet/time4j/calendar/KoreanCalendar;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/KoreanCalendar;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/KoreanCalendar$b;->f(Lnet/time4j/calendar/KoreanCalendar;)Lnet/time4j/calendar/k;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/KoreanCalendar;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/KoreanCalendar$b;->g(Lnet/time4j/calendar/KoreanCalendar;)Lnet/time4j/calendar/k;

    move-result-object p1

    return-object p1
.end method
