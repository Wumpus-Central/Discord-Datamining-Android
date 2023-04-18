.class Lnet/time4j/z0$f;
.super Lnet/time4j/a;
.source "SourceFile"

# interfaces
.implements Lnet/time4j/c0;
.implements Lgj/l;
.implements Lgj/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/time4j/a<",
        "Lnet/time4j/x0;",
        ">;",
        "Lnet/time4j/c0<",
        "Lnet/time4j/x0;",
        ">;",
        "Lgj/l<",
        "Lnet/time4j/x0;",
        ">;",
        "Lgj/t<",
        "Lnet/time4j/x0;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1b006946351b84d6L


# instance fields
.field final synthetic this$0:Lnet/time4j/z0;


# direct methods
.method constructor <init>(Lnet/time4j/z0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/time4j/z0$f;->this$0:Lnet/time4j/z0;

    .line 2
    .line 3
    const-string p1, "LOCAL_DAY_OF_WEEK"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lnet/time4j/a;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
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
.end method

.method private A(Lfj/d;Lgj/m;)Lgj/s;
    .locals 3

    .line 1
    sget-object v0, Lgj/a;->c:Lfj/c;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/Locale;

    .line 10
    .line 11
    invoke-static {v0}, Lgj/b;->d(Ljava/util/Locale;)Lgj/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lgj/a;->g:Lfj/c;

    .line 16
    .line 17
    sget-object v2, Lgj/v;->k:Lgj/v;

    .line 18
    .line 19
    invoke-interface {p1, v1, v2}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lgj/v;

    .line 24
    .line 25
    invoke-virtual {v0, p1, p2}, Lgj/b;->p(Lgj/v;Lgj/m;)Lgj/s;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
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
.end method

.method private D()Lnet/time4j/z0;
    .locals 1

    iget-object v0, p0, Lnet/time4j/z0$f;->this$0:Lnet/time4j/z0;

    return-object v0
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lnet/time4j/z0$f;->this$0:Lnet/time4j/z0;

    invoke-virtual {v0}, Lnet/time4j/z0;->i()Lnet/time4j/c0;

    move-result-object v0

    return-object v0
.end method

.method static synthetic y(Lnet/time4j/z0$f;)Lnet/time4j/z0;
    .locals 0

    invoke-direct {p0}, Lnet/time4j/z0$f;->D()Lnet/time4j/z0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public B()Lnet/time4j/x0;
    .locals 2

    iget-object v0, p0, Lnet/time4j/z0$f;->this$0:Lnet/time4j/z0;

    invoke-virtual {v0}, Lnet/time4j/z0;->f()Lnet/time4j/x0;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lnet/time4j/x0;->e(I)Lnet/time4j/x0;

    move-result-object v0

    return-object v0
.end method

.method public C()Lnet/time4j/x0;
    .locals 1

    iget-object v0, p0, Lnet/time4j/z0$f;->this$0:Lnet/time4j/z0;

    invoke-virtual {v0}, Lnet/time4j/z0;->f()Lnet/time4j/x0;

    move-result-object v0

    return-object v0
.end method

.method public E(Lnet/time4j/x0;)I
    .locals 1

    iget-object v0, p0, Lnet/time4j/z0$f;->this$0:Lnet/time4j/z0;

    invoke-virtual {p1, v0}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    move-result p1

    return p1
.end method

.method public F(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;)Lnet/time4j/x0;
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/text/ParsePosition;->getIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lgj/a;->h:Lfj/c;

    .line 6
    .line 7
    sget-object v2, Lgj/m;->k:Lgj/m;

    .line 8
    .line 9
    invoke-interface {p3, v1, v2}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lgj/m;

    .line 14
    .line 15
    invoke-direct {p0, p3, v1}, Lnet/time4j/z0$f;->A(Lfj/d;Lgj/m;)Lgj/s;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {p0}, Lnet/time4j/z0$f;->getType()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v3, p1, p2, v4, p3}, Lgj/s;->c(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Ljava/lang/Class;Lfj/d;)Ljava/lang/Enum;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lnet/time4j/x0;

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    sget-object v4, Lgj/a;->k:Lfj/c;

    .line 32
    .line 33
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-interface {p3, v4, v5}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    const/4 v3, -0x1

    .line 48
    invoke-virtual {p2, v3}, Ljava/text/ParsePosition;->setErrorIndex(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, v0}, Ljava/text/ParsePosition;->setIndex(I)V

    .line 52
    .line 53
    .line 54
    if-ne v1, v2, :cond_0

    .line 55
    .line 56
    sget-object v2, Lgj/m;->l:Lgj/m;

    .line 57
    .line 58
    :cond_0
    invoke-direct {p0, p3, v2}, Lnet/time4j/z0$f;->A(Lfj/d;Lgj/m;)Lgj/s;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p0}, Lnet/time4j/z0$f;->getType()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, p1, p2, v1, p3}, Lgj/s;->c(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Ljava/lang/Class;Lfj/d;)Ljava/lang/Enum;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    move-object v3, p1

    .line 71
    check-cast v3, Lnet/time4j/x0;

    .line 72
    .line 73
    :cond_1
    return-object v3
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

.method public G()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic H(Ljava/lang/Object;Lfj/o;Lfj/d;)I
    .locals 0

    check-cast p1, Lnet/time4j/x0;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/z0$f;->J(Lnet/time4j/x0;Lfj/o;Lfj/d;)I

    move-result p1

    return p1
.end method

.method public J(Lnet/time4j/x0;Lfj/o;Lfj/d;)I
    .locals 0

    invoke-virtual {p0, p1}, Lnet/time4j/z0$f;->E(Lnet/time4j/x0;)I

    move-result p1

    return p1
.end method

.method public K(Lfj/q;I)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;I)Z"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/time4j/x0;->values()[Lnet/time4j/x0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v3, v1, :cond_1

    .line 9
    .line 10
    aget-object v4, v0, v3

    .line 11
    .line 12
    iget-object v5, p0, Lnet/time4j/z0$f;->this$0:Lnet/time4j/z0;

    .line 13
    .line 14
    invoke-virtual {v4, v5}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-ne v5, p2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1, p0, v4}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return v2
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
.end method

.method public bridge synthetic R(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/z0$f;->F(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;)Lnet/time4j/x0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/z0$f;->C()Lnet/time4j/x0;

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

    const/16 v0, 0x65

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lfj/o;

    check-cast p2, Lfj/o;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/z0$f;->d(Lfj/o;Lfj/o;)I

    move-result p1

    return p1
.end method

.method public d(Lfj/o;Lfj/o;)I
    .locals 1

    .line 1
    invoke-interface {p1, p0}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lnet/time4j/x0;

    .line 6
    .line 7
    iget-object v0, p0, Lnet/time4j/z0$f;->this$0:Lnet/time4j/z0;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-interface {p2, p0}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Lnet/time4j/x0;

    .line 18
    .line 19
    iget-object v0, p0, Lnet/time4j/z0$f;->this$0:Lnet/time4j/z0;

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-ge p1, p2, :cond_0

    .line 26
    .line 27
    const/4 p1, -0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    if-ne p1, p2, :cond_1

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p1, 0x1

    .line 34
    :goto_0
    return p1
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
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/z0$f;->B()Lnet/time4j/x0;

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
            "Lnet/time4j/x0;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/time4j/f0;->x:Lfj/p;

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
    new-instance p1, Lnet/time4j/z0$e;

    .line 11
    .line 12
    invoke-direct {p1, p0, v0}, Lnet/time4j/z0$e;-><init>(Lnet/time4j/z0$f;Lnet/time4j/z0$a;)V

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
            "Lnet/time4j/x0;",
            ">;"
        }
    .end annotation

    const-class v0, Lnet/time4j/x0;

    return-object v0
.end method

.method public i(Lfj/o;Ljava/lang/Appendable;Lfj/d;)V
    .locals 2

    .line 1
    sget-object v0, Lgj/a;->h:Lfj/c;

    .line 2
    .line 3
    sget-object v1, Lgj/m;->k:Lgj/m;

    .line 4
    .line 5
    invoke-interface {p3, v0, v1}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lgj/m;

    .line 10
    .line 11
    invoke-direct {p0, p3, v0}, Lnet/time4j/z0$f;->A(Lfj/d;Lgj/m;)Lgj/s;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-interface {p1, p0}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Ljava/lang/Enum;

    .line 20
    .line 21
    invoke-virtual {p3, p1}, Lgj/s;->f(Ljava/lang/Enum;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 26
    .line 27
    .line 28
    return-void
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

.method protected r(Lfj/e;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/e<",
            "*>;)Z"
        }
    .end annotation

    invoke-direct {p0}, Lnet/time4j/z0$f;->D()Lnet/time4j/z0;

    move-result-object v0

    check-cast p1, Lnet/time4j/z0$f;

    invoke-direct {p1}, Lnet/time4j/z0$f;->D()Lnet/time4j/z0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lnet/time4j/z0;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method protected s()Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lnet/time4j/f0;->F:Lnet/time4j/c0;

    return-object v0
.end method
