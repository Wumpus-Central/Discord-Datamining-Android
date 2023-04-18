.class final Lhj/l$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhj/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhj/l;->d(Z)Lhj/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhj/d<",
        "Lnet/time4j/f0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Z


# direct methods
.method constructor <init>(Z)V
    .locals 0

    iput-boolean p1, p0, Lhj/l$b;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;Lhj/s;Lfj/d;)Lnet/time4j/f0;
    .locals 7

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    invoke-virtual {p2}, Lhj/s;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sub-int v1, p3, v0

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x1

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    const/16 v4, 0x2d

    .line 15
    .line 16
    if-ge v2, p3, :cond_4

    .line 17
    .line 18
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eq v5, v4, :cond_3

    .line 23
    .line 24
    const/16 v6, 0x2f

    .line 25
    .line 26
    if-eq v5, v6, :cond_2

    .line 27
    .line 28
    const/16 v6, 0x54

    .line 29
    .line 30
    if-eq v5, v6, :cond_2

    .line 31
    .line 32
    const/16 v4, 0x57

    .line 33
    .line 34
    if-eq v5, v4, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    iget-boolean p3, p0, Lhj/l$b;->a:Z

    .line 38
    .line 39
    if-eqz p3, :cond_1

    .line 40
    .line 41
    sget-object p3, Lhj/l;->k:Lhj/c;

    .line 42
    .line 43
    invoke-virtual {p3, p1, p2}, Lhj/c;->G(Ljava/lang/CharSequence;Lhj/s;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Lnet/time4j/f0;

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_1
    sget-object p3, Lhj/l;->j:Lhj/c;

    .line 51
    .line 52
    invoke-virtual {p3, p1, p2}, Lhj/c;->G(Ljava/lang/CharSequence;Lhj/s;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Lnet/time4j/f0;

    .line 57
    .line 58
    return-object p1

    .line 59
    :cond_2
    sub-int v1, v2, v0

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    :goto_2
    iget-boolean p3, p0, Lhj/l$b;->a:Z

    .line 68
    .line 69
    if-eqz p3, :cond_6

    .line 70
    .line 71
    const/4 p3, 0x1

    .line 72
    if-ne v3, p3, :cond_5

    .line 73
    .line 74
    sget-object p3, Lhj/l;->i:Lhj/c;

    .line 75
    .line 76
    invoke-virtual {p3, p1, p2}, Lhj/c;->G(Ljava/lang/CharSequence;Lhj/s;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Lnet/time4j/f0;

    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_5
    sget-object p3, Lhj/l;->g:Lhj/c;

    .line 84
    .line 85
    invoke-virtual {p3, p1, p2}, Lhj/c;->G(Ljava/lang/CharSequence;Lhj/s;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Lnet/time4j/f0;

    .line 90
    .line 91
    return-object p1

    .line 92
    :cond_6
    add-int/lit8 v1, v1, -0x4

    .line 93
    .line 94
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 95
    .line 96
    .line 97
    move-result p3

    .line 98
    const/16 v0, 0x2b

    .line 99
    .line 100
    if-eq p3, v0, :cond_7

    .line 101
    .line 102
    if-ne p3, v4, :cond_8

    .line 103
    .line 104
    :cond_7
    add-int/lit8 v1, v1, -0x2

    .line 105
    .line 106
    :cond_8
    const/4 p3, 0x3

    .line 107
    if-ne v1, p3, :cond_9

    .line 108
    .line 109
    sget-object p3, Lhj/l;->h:Lhj/c;

    .line 110
    .line 111
    invoke-virtual {p3, p1, p2}, Lhj/c;->G(Ljava/lang/CharSequence;Lhj/s;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    check-cast p1, Lnet/time4j/f0;

    .line 116
    .line 117
    return-object p1

    .line 118
    :cond_9
    sget-object p3, Lhj/l;->f:Lhj/c;

    .line 119
    .line 120
    invoke-virtual {p3, p1, p2}, Lhj/c;->G(Ljava/lang/CharSequence;Lhj/s;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    check-cast p1, Lnet/time4j/f0;

    .line 125
    .line 126
    return-object p1
    .line 127
    .line 128
    .line 129
.end method

.method public bridge synthetic b(Ljava/lang/CharSequence;Lhj/s;Lfj/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lhj/l$b;->a(Ljava/lang/CharSequence;Lhj/s;Lfj/d;)Lnet/time4j/f0;

    move-result-object p1

    return-object p1
.end method
