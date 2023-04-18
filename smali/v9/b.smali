.class public final Lv9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lu9/a$d;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Lu9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu9/a<",
            "TO;>;"
        }
    .end annotation
.end field

.field private final c:Lu9/a$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TO;"
        }
    .end annotation
.end field

.field private final d:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lu9/a;Lu9/a$d;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu9/a<",
            "TO;>;TO;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv9/b;->b:Lu9/a;

    iput-object p2, p0, Lv9/b;->c:Lu9/a$d;

    iput-object p3, p0, Lv9/b;->d:Ljava/lang/String;

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    const/4 p1, 0x2

    aput-object p3, v0, p1

    invoke-static {v0}, Lw9/n;->c([Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lv9/b;->a:I

    return-void
.end method

.method public static a(Lu9/a;Lu9/a$d;Ljava/lang/String;)Lv9/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<O::",
            "Lu9/a$d;",
            ">(",
            "Lu9/a<",
            "TO;>;TO;",
            "Ljava/lang/String;",
            ")",
            "Lv9/b<",
            "TO;>;"
        }
    .end annotation

    new-instance v0, Lv9/b;

    invoke-direct {v0, p0, p1, p2}, Lv9/b;-><init>(Lu9/a;Lu9/a$d;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv9/b;->b:Lu9/a;

    invoke-virtual {v0}, Lu9/a;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    if-ne p1, p0, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    instance-of v2, p1, Lv9/b;

    .line 10
    .line 11
    if-nez v2, :cond_2

    .line 12
    .line 13
    return v0

    .line 14
    :cond_2
    check-cast p1, Lv9/b;

    .line 15
    .line 16
    iget-object v2, p0, Lv9/b;->b:Lu9/a;

    .line 17
    .line 18
    iget-object v3, p1, Lv9/b;->b:Lu9/a;

    .line 19
    .line 20
    invoke-static {v2, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_3

    .line 25
    .line 26
    iget-object v2, p0, Lv9/b;->c:Lu9/a$d;

    .line 27
    .line 28
    iget-object v3, p1, Lv9/b;->c:Lu9/a$d;

    .line 29
    .line 30
    invoke-static {v2, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    iget-object v2, p0, Lv9/b;->d:Ljava/lang/String;

    .line 37
    .line 38
    iget-object p1, p1, Lv9/b;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v2, p1}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    return v1

    .line 47
    :cond_3
    return v0
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
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lv9/b;->a:I

    return v0
.end method
