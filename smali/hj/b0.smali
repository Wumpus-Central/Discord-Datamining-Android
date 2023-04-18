.class final enum Lhj/b0;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lfj/p;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhj/b0;",
        ">;",
        "Lfj/p<",
        "Lnet/time4j/tz/k;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lhj/b0;

.field public static final enum l:Lhj/b0;

.field private static final synthetic m:[Lhj/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lhj/b0;

    .line 2
    .line 3
    const-string v1, "TIMEZONE_ID"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lhj/b0;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lhj/b0;->k:Lhj/b0;

    .line 10
    .line 11
    new-instance v1, Lhj/b0;

    .line 12
    .line 13
    const-string v3, "TIMEZONE_OFFSET"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lhj/b0;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lhj/b0;->l:Lhj/b0;

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    new-array v3, v3, [Lhj/b0;

    .line 23
    .line 24
    aput-object v0, v3, v2

    .line 25
    .line 26
    aput-object v1, v3, v4

    .line 27
    .line 28
    sput-object v3, Lhj/b0;->m:[Lhj/b0;

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

.method public static valueOf(Ljava/lang/String;)Lhj/b0;
    .locals 1

    const-class v0, Lhj/b0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhj/b0;

    return-object p0
.end method

.method public static values()[Lhj/b0;
    .locals 1

    sget-object v0, Lhj/b0;->m:[Lhj/b0;

    invoke-virtual {v0}, [Lhj/b0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhj/b0;

    return-object v0
.end method


# virtual methods
.method public G()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lhj/b0;->j()Lnet/time4j/tz/k;

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

    .line 1
    invoke-interface {p1}, Lfj/o;->r()Lnet/time4j/tz/k;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p2}, Lfj/o;->r()Lnet/time4j/tz/k;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-interface {p1}, Lnet/time4j/tz/k;->a()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p2}, Lnet/time4j/tz/k;->a()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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
.end method

.method public b()C
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c()Lnet/time4j/tz/k;
    .locals 2

    sget-object v0, Lnet/time4j/tz/f;->l:Lnet/time4j/tz/f;

    const/16 v1, 0xe

    invoke-static {v0, v1}, Lnet/time4j/tz/p;->p(Lnet/time4j/tz/f;I)Lnet/time4j/tz/p;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lfj/o;

    check-cast p2, Lfj/o;

    invoke-virtual {p0, p1, p2}, Lhj/b0;->a(Lfj/o;Lfj/o;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lhj/b0;->c()Lnet/time4j/tz/k;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lnet/time4j/tz/k;",
            ">;"
        }
    .end annotation

    const-class v0, Lnet/time4j/tz/k;

    return-object v0
.end method

.method public j()Lnet/time4j/tz/k;
    .locals 2

    sget-object v0, Lnet/time4j/tz/f;->k:Lnet/time4j/tz/f;

    const/16 v1, 0xe

    invoke-static {v0, v1}, Lnet/time4j/tz/p;->p(Lnet/time4j/tz/f;I)Lnet/time4j/tz/p;

    move-result-object v0

    return-object v0
.end method

.method public n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
