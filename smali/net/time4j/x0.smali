.class public final enum Lnet/time4j/x0;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lfj/n;
.implements Lfj/v;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/time4j/x0;",
        ">;",
        "Lfj/n<",
        "Lnet/time4j/base/a;",
        ">;",
        "Lfj/v<",
        "Lnet/time4j/f0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lnet/time4j/x0;

.field public static final enum l:Lnet/time4j/x0;

.field public static final enum m:Lnet/time4j/x0;

.field public static final enum n:Lnet/time4j/x0;

.field public static final enum o:Lnet/time4j/x0;

.field public static final enum p:Lnet/time4j/x0;

.field public static final enum q:Lnet/time4j/x0;

.field private static final r:[Lnet/time4j/x0;

.field private static final synthetic s:[Lnet/time4j/x0;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lnet/time4j/x0;

    .line 2
    .line 3
    const-string v1, "MONDAY"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/time4j/x0;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/time4j/x0;->k:Lnet/time4j/x0;

    .line 10
    .line 11
    new-instance v1, Lnet/time4j/x0;

    .line 12
    .line 13
    const-string v3, "TUESDAY"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/time4j/x0;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/time4j/x0;->l:Lnet/time4j/x0;

    .line 20
    .line 21
    new-instance v3, Lnet/time4j/x0;

    .line 22
    .line 23
    const-string v5, "WEDNESDAY"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lnet/time4j/x0;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lnet/time4j/x0;->m:Lnet/time4j/x0;

    .line 30
    .line 31
    new-instance v5, Lnet/time4j/x0;

    .line 32
    .line 33
    const-string v7, "THURSDAY"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lnet/time4j/x0;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lnet/time4j/x0;->n:Lnet/time4j/x0;

    .line 40
    .line 41
    new-instance v7, Lnet/time4j/x0;

    .line 42
    .line 43
    const-string v9, "FRIDAY"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10}, Lnet/time4j/x0;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lnet/time4j/x0;->o:Lnet/time4j/x0;

    .line 50
    .line 51
    new-instance v9, Lnet/time4j/x0;

    .line 52
    .line 53
    const-string v11, "SATURDAY"

    .line 54
    .line 55
    const/4 v12, 0x5

    .line 56
    invoke-direct {v9, v11, v12}, Lnet/time4j/x0;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v9, Lnet/time4j/x0;->p:Lnet/time4j/x0;

    .line 60
    .line 61
    new-instance v11, Lnet/time4j/x0;

    .line 62
    .line 63
    const-string v13, "SUNDAY"

    .line 64
    .line 65
    const/4 v14, 0x6

    .line 66
    invoke-direct {v11, v13, v14}, Lnet/time4j/x0;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v11, Lnet/time4j/x0;->q:Lnet/time4j/x0;

    .line 70
    .line 71
    const/4 v13, 0x7

    .line 72
    new-array v13, v13, [Lnet/time4j/x0;

    .line 73
    .line 74
    aput-object v0, v13, v2

    .line 75
    .line 76
    aput-object v1, v13, v4

    .line 77
    .line 78
    aput-object v3, v13, v6

    .line 79
    .line 80
    aput-object v5, v13, v8

    .line 81
    .line 82
    aput-object v7, v13, v10

    .line 83
    .line 84
    aput-object v9, v13, v12

    .line 85
    .line 86
    aput-object v11, v13, v14

    .line 87
    .line 88
    sput-object v13, Lnet/time4j/x0;->s:[Lnet/time4j/x0;

    .line 89
    .line 90
    invoke-static {}, Lnet/time4j/x0;->values()[Lnet/time4j/x0;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    sput-object v0, Lnet/time4j/x0;->r:[Lnet/time4j/x0;

    .line 95
    .line 96
    return-void
    .line 97
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static h(I)Lnet/time4j/x0;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p0, v0, :cond_0

    .line 3
    .line 4
    const/4 v1, 0x7

    .line 5
    if-gt p0, v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Lnet/time4j/x0;->r:[Lnet/time4j/x0;

    .line 8
    .line 9
    sub-int/2addr p0, v0

    .line 10
    aget-object p0, v1, p0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v2, "Out of range: "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
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

.method public static valueOf(Ljava/lang/String;)Lnet/time4j/x0;
    .locals 1

    const-class v0, Lnet/time4j/x0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/time4j/x0;

    return-object p0
.end method

.method public static values()[Lnet/time4j/x0;
    .locals 1

    sget-object v0, Lnet/time4j/x0;->s:[Lnet/time4j/x0;

    invoke-virtual {v0}, [Lnet/time4j/x0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/time4j/x0;

    return-object v0
.end method


# virtual methods
.method public a(Lnet/time4j/f0;)Lnet/time4j/f0;
    .locals 1

    sget-object v0, Lnet/time4j/f0;->F:Lnet/time4j/c0;

    invoke-virtual {p1, v0, p0}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    move-result-object p1

    check-cast p1, Lnet/time4j/f0;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/f0;

    invoke-virtual {p0, p1}, Lnet/time4j/x0;->a(Lnet/time4j/f0;)Lnet/time4j/f0;

    move-result-object p1

    return-object p1
.end method

.method public b()I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public c(Lnet/time4j/z0;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Lnet/time4j/z0;->f()Lnet/time4j/x0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-int/lit8 v0, v0, 0x7

    .line 14
    .line 15
    sub-int/2addr v0, p1

    .line 16
    rem-int/lit8 v0, v0, 0x7

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    return v0
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public e(I)Lnet/time4j/x0;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    rem-int/lit8 p1, p1, 0x7

    add-int/lit8 p1, p1, 0x7

    add-int/2addr v0, p1

    rem-int/lit8 v0, v0, 0x7

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lnet/time4j/x0;->h(I)Lnet/time4j/x0;

    move-result-object p1

    return-object p1
.end method

.method public f(Lnet/time4j/base/a;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Lnet/time4j/base/a;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1}, Lnet/time4j/base/a;->j()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {p1}, Lnet/time4j/base/a;->p()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {v0, v1, p1}, Lnet/time4j/base/b;->c(III)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p0}, Lnet/time4j/x0;->b()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    :goto_0
    return p1
    .line 27
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lnet/time4j/base/a;

    invoke-virtual {p0, p1}, Lnet/time4j/x0;->f(Lnet/time4j/base/a;)Z

    move-result p1

    return p1
.end method
