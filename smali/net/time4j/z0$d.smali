.class Lnet/time4j/z0$d;
.super Lnet/time4j/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/time4j/a<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x5261d00674a7c3d2L


# instance fields
.field private final category:I

.field final synthetic this$0:Lnet/time4j/z0;


# direct methods
.method constructor <init>(Lnet/time4j/z0;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/time4j/z0$d;->this$0:Lnet/time4j/z0;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lnet/time4j/a;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput p3, p0, Lnet/time4j/z0$d;->category:I

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

.method static synthetic A(Lnet/time4j/z0$d;)Z
    .locals 0

    invoke-direct {p0}, Lnet/time4j/z0$d;->F()Z

    move-result p0

    return p0
.end method

.method private D()Lnet/time4j/z0;
    .locals 1

    iget-object v0, p0, Lnet/time4j/z0$d;->this$0:Lnet/time4j/z0;

    return-object v0
.end method

.method private E()Z
    .locals 2

    iget v0, p0, Lnet/time4j/z0$d;->category:I

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private F()Z
    .locals 1

    iget v0, p0, Lnet/time4j/z0$d;->category:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-direct {p0}, Lnet/time4j/z0$d;->D()Lnet/time4j/z0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lnet/time4j/z0$d;->category:I

    .line 6
    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eq v1, v2, :cond_2

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lnet/time4j/z0;->a()Lnet/time4j/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_0
    new-instance v0, Ljava/io/InvalidObjectException;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v2, "Unknown category: "

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget v2, p0, Lnet/time4j/z0$d;->category:I

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0

    .line 48
    :cond_1
    invoke-virtual {v0}, Lnet/time4j/z0;->b()Lnet/time4j/c;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :cond_2
    invoke-virtual {v0}, Lnet/time4j/z0;->m()Lnet/time4j/c;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0

    .line 58
    :cond_3
    invoke-virtual {v0}, Lnet/time4j/z0;->n()Lnet/time4j/c;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0
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
.end method

.method static synthetic y(Lnet/time4j/z0$d;)Lnet/time4j/z0;
    .locals 0

    invoke-direct {p0}, Lnet/time4j/z0$d;->D()Lnet/time4j/z0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public B()Ljava/lang/Integer;
    .locals 1

    invoke-direct {p0}, Lnet/time4j/z0$d;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x34

    goto :goto_0

    :cond_0
    const/4 v0, 0x5

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public C()Ljava/lang/Integer;
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public G()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/z0$d;->C()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public T()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b()C
    .locals 2

    .line 1
    iget v0, p0, Lnet/time4j/z0$d;->category:I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    invoke-super {p0}, Lfj/e;->b()C

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0

    .line 13
    :cond_0
    const/16 v0, 0x57

    .line 14
    .line 15
    return v0

    .line 16
    :cond_1
    const/16 v0, 0x77

    .line 17
    .line 18
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/z0$d;->B()Ljava/lang/Integer;

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
            "Ljava/lang/Integer;",
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
    if-eqz p1, :cond_1

    .line 9
    .line 10
    invoke-direct {p0}, Lnet/time4j/z0$d;->E()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    new-instance p1, Lnet/time4j/z0$b;

    .line 17
    .line 18
    invoke-direct {p1, p0, v0}, Lnet/time4j/z0$b;-><init>(Lnet/time4j/z0$d;Lnet/time4j/z0$a;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance p1, Lnet/time4j/z0$c;

    .line 23
    .line 24
    invoke-direct {p1, p0, v0}, Lnet/time4j/z0$c;-><init>(Lnet/time4j/z0$d;Lnet/time4j/z0$a;)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    return-object v0
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
.end method

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-class v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public n()Z
    .locals 1

    const/4 v0, 0x1

    return v0
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

    invoke-direct {p0}, Lnet/time4j/z0$d;->D()Lnet/time4j/z0;

    move-result-object v0

    check-cast p1, Lnet/time4j/z0$d;

    invoke-direct {p1}, Lnet/time4j/z0$d;->D()Lnet/time4j/z0;

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

    sget-object v0, Lnet/time4j/f0;->I:Lnet/time4j/d0;

    return-object v0
.end method
