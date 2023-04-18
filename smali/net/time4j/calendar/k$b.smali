.class Lnet/time4j/calendar/k$b;
.super Lgj/d;
.source "SourceFile"

# interfaces
.implements Lgj/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/calendar/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgj/d<",
        "Lnet/time4j/calendar/k;",
        ">;",
        "Lgj/t<",
        "Lnet/time4j/calendar/k;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x47e02c2b995af97bL


# direct methods
.method private constructor <init>()V
    .locals 1

    const-string v0, "ERA"

    .line 2
    invoke-direct {p0, v0}, Lgj/d;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/calendar/k$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/time4j/calendar/k$b;-><init>()V

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lnet/time4j/calendar/k;->m:Lnet/time4j/calendar/k;

    invoke-virtual {v0}, Lnet/time4j/calendar/k;->a()Lfj/p;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public A(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;)Lnet/time4j/calendar/k;
    .locals 7

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
    sget-object v1, Lgj/a;->i:Lfj/c;

    .line 12
    .line 13
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-interface {p3, v1, v2}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    sget-object v2, Lgj/a;->j:Lfj/c;

    .line 26
    .line 27
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-interface {p3, v2, v3}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    sget-object v3, Lgj/a;->g:Lfj/c;

    .line 40
    .line 41
    sget-object v4, Lgj/v;->k:Lgj/v;

    .line 42
    .line 43
    invoke-interface {p3, v3, v4}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    check-cast p3, Lgj/v;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/text/ParsePosition;->getIndex()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    sget-object v4, Lnet/time4j/calendar/k;->m:Lnet/time4j/calendar/k;

    .line 54
    .line 55
    invoke-virtual {v4, v0, p3}, Lnet/time4j/calendar/k;->b(Ljava/util/Locale;Lgj/v;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    add-int/2addr v5, v3

    .line 64
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-le v5, v3, :cond_2

    .line 77
    .line 78
    invoke-interface {p1, v3, v5}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-eqz v1, :cond_0

    .line 87
    .line 88
    invoke-virtual {p3, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    :cond_0
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_1

    .line 101
    .line 102
    if-eqz v2, :cond_2

    .line 103
    .line 104
    invoke-virtual {p3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_2

    .line 109
    .line 110
    :cond_1
    invoke-virtual {p2, v5}, Ljava/text/ParsePosition;->setIndex(I)V

    .line 111
    .line 112
    .line 113
    return-object v4

    .line 114
    :cond_2
    invoke-virtual {p2, v3}, Ljava/text/ParsePosition;->setErrorIndex(I)V

    .line 115
    .line 116
    .line 117
    const/4 p1, 0x0

    .line 118
    return-object p1
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

.method public G()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic R(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/calendar/k$b;->A(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;)Lnet/time4j/calendar/k;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/k$b;->y()Lnet/time4j/calendar/k;

    move-result-object v0

    return-object v0
.end method

.method public T()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b()C
    .locals 1

    const/16 v0, 0x47

    return v0
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/k$b;->x()Lnet/time4j/calendar/k;

    move-result-object v0

    return-object v0
.end method

.method protected g(Lfj/x;)Lfj/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/q<",
            "TT;>;>(",
            "Lfj/x<",
            "TT;>;)",
            "Lfj/z<",
            "TT;",
            "Lnet/time4j/calendar/k;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/time4j/f0;->y:Lnet/time4j/e;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lfj/x;->x(Lfj/p;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance p1, Lnet/time4j/calendar/k$c;

    .line 11
    .line 12
    invoke-direct {p1, v0}, Lnet/time4j/calendar/k$c;-><init>(Lnet/time4j/calendar/k$a;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    return-object v0
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
.end method

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lnet/time4j/calendar/k;",
            ">;"
        }
    .end annotation

    const-class v0, Lnet/time4j/calendar/k;

    return-object v0
.end method

.method public i(Lfj/o;Ljava/lang/Appendable;Lfj/d;)V
    .locals 2

    .line 1
    sget-object p1, Lgj/a;->c:Lfj/c;

    .line 2
    .line 3
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-interface {p3, p1, v0}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/util/Locale;

    .line 10
    .line 11
    sget-object v0, Lgj/a;->g:Lfj/c;

    .line 12
    .line 13
    sget-object v1, Lgj/v;->k:Lgj/v;

    .line 14
    .line 15
    invoke-interface {p3, v0, v1}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    check-cast p3, Lgj/v;

    .line 20
    .line 21
    sget-object v0, Lnet/time4j/calendar/k;->m:Lnet/time4j/calendar/k;

    .line 22
    .line 23
    invoke-virtual {v0, p1, p3}, Lnet/time4j/calendar/k;->b(Ljava/util/Locale;Lgj/v;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 28
    .line 29
    .line 30
    return-void
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

.method protected w()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public x()Lnet/time4j/calendar/k;
    .locals 1

    sget-object v0, Lnet/time4j/calendar/k;->m:Lnet/time4j/calendar/k;

    return-object v0
.end method

.method public y()Lnet/time4j/calendar/k;
    .locals 1

    sget-object v0, Lnet/time4j/calendar/k;->m:Lnet/time4j/calendar/k;

    return-object v0
.end method
