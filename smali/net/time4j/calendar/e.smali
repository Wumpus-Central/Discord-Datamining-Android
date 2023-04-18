.class Lnet/time4j/calendar/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgj/t;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgj/t<",
        "Lnet/time4j/calendar/c;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field static final k:Lnet/time4j/calendar/e;

.field private static final serialVersionUID:J = -0x3a71e28ca541d382L


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnet/time4j/calendar/e;

    invoke-direct {v0}, Lnet/time4j/calendar/e;-><init>()V

    sput-object v0, Lnet/time4j/calendar/e;->k:Lnet/time4j/calendar/e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public G()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic R(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/calendar/e;->g(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;)Lnet/time4j/calendar/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/e;->d()Lnet/time4j/calendar/c;

    move-result-object v0

    return-object v0
.end method

.method public T()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public a(Lfj/o;Lfj/o;)I
    .locals 0

    invoke-interface {p1, p0}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/time4j/calendar/c;

    invoke-interface {p2, p0}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lnet/time4j/calendar/o;

    invoke-virtual {p1, p2}, Lnet/time4j/calendar/o;->f(Lnet/time4j/calendar/o;)I

    move-result p1

    return p1
.end method

.method public b()C
    .locals 1

    const/16 v0, 0x55

    return v0
.end method

.method public c()Lnet/time4j/calendar/c;
    .locals 1

    const/16 v0, 0x3c

    invoke-static {v0}, Lnet/time4j/calendar/c;->p(I)Lnet/time4j/calendar/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lfj/o;

    check-cast p2, Lfj/o;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/e;->a(Lfj/o;Lfj/o;)I

    move-result p1

    return p1
.end method

.method public d()Lnet/time4j/calendar/c;
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Lnet/time4j/calendar/c;->p(I)Lnet/time4j/calendar/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/e;->c()Lnet/time4j/calendar/c;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;)Lnet/time4j/calendar/c;
    .locals 3

    .line 1
    sget-object v0, Lgj/a;->c:Lfj/c;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-interface {p3, v0, v1}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/Locale;

    .line 10
    .line 11
    sget-object v1, Lgj/a;->f:Lfj/c;

    .line 12
    .line 13
    sget-object v2, Lgj/g;->l:Lgj/g;

    .line 14
    .line 15
    invoke-interface {p3, v1, v2}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    check-cast p3, Lgj/g;

    .line 20
    .line 21
    invoke-virtual {p3}, Lgj/g;->c()Z

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    xor-int/lit8 p3, p3, 0x1

    .line 26
    .line 27
    invoke-static {p1, p2, v0, p3}, Lnet/time4j/calendar/c;->q(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Ljava/util/Locale;Z)Lnet/time4j/calendar/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
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

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lnet/time4j/calendar/c;",
            ">;"
        }
    .end annotation

    const-class v0, Lnet/time4j/calendar/c;

    return-object v0
.end method

.method public i(Lfj/o;Ljava/lang/Appendable;Lfj/d;)V
    .locals 2

    .line 1
    sget-object v0, Lgj/a;->c:Lfj/c;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-interface {p3, v0, v1}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    check-cast p3, Ljava/util/Locale;

    .line 10
    .line 11
    invoke-interface {p1, p0}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lnet/time4j/calendar/c;

    .line 16
    .line 17
    invoke-virtual {p1, p3}, Lnet/time4j/calendar/o;->i(Ljava/util/Locale;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 22
    .line 23
    .line 24
    return-void
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

.method public n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public name()Ljava/lang/String;
    .locals 1

    const-string v0, "CYCLIC_YEAR"

    return-object v0
.end method

.method protected readResolve()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lnet/time4j/calendar/e;->k:Lnet/time4j/calendar/e;

    return-object v0
.end method
