.class public final enum Lnet/time4j/z;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lfj/n;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/time4j/z;",
        ">;",
        "Lfj/n<",
        "Lnet/time4j/base/g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lnet/time4j/z;

.field public static final enum l:Lnet/time4j/z;

.field private static final synthetic m:[Lnet/time4j/z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lnet/time4j/z;

    .line 2
    .line 3
    const-string v1, "AM"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/time4j/z;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/time4j/z;->k:Lnet/time4j/z;

    .line 10
    .line 11
    new-instance v1, Lnet/time4j/z;

    .line 12
    .line 13
    const-string v3, "PM"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/time4j/z;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/time4j/z;->l:Lnet/time4j/z;

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    new-array v3, v3, [Lnet/time4j/z;

    .line 23
    .line 24
    aput-object v0, v3, v2

    .line 25
    .line 26
    aput-object v1, v3, v4

    .line 27
    .line 28
    sput-object v3, Lnet/time4j/z;->m:[Lnet/time4j/z;

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

.method public static c(I)Lnet/time4j/z;
    .locals 3

    .line 1
    if-ltz p0, :cond_2

    .line 2
    .line 3
    const/16 v0, 0x18

    .line 4
    .line 5
    if-gt p0, v0, :cond_2

    .line 6
    .line 7
    const/16 v1, 0xc

    .line 8
    .line 9
    if-lt p0, v1, :cond_1

    .line 10
    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object p0, Lnet/time4j/z;->l:Lnet/time4j/z;

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    :goto_0
    sget-object p0, Lnet/time4j/z;->k:Lnet/time4j/z;

    .line 18
    .line 19
    :goto_1
    return-object p0

    .line 20
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v2, "Hour of day out of range: "

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0
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

.method public static valueOf(Ljava/lang/String;)Lnet/time4j/z;
    .locals 1

    const-class v0, Lnet/time4j/z;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/time4j/z;

    return-object p0
.end method

.method public static values()[Lnet/time4j/z;
    .locals 1

    sget-object v0, Lnet/time4j/z;->m:[Lnet/time4j/z;

    invoke-virtual {v0}, [Lnet/time4j/z;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/time4j/z;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/Locale;)Ljava/lang/String;
    .locals 2

    sget-object v0, Lgj/v;->k:Lgj/v;

    sget-object v1, Lgj/m;->k:Lgj/m;

    invoke-virtual {p0, p1, v0, v1}, Lnet/time4j/z;->b(Ljava/util/Locale;Lgj/v;Lgj/m;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/util/Locale;Lgj/v;Lgj/m;)Ljava/lang/String;
    .locals 0

    invoke-static {p1}, Lgj/b;->d(Ljava/util/Locale;)Lgj/b;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lgj/b;->h(Lgj/v;Lgj/m;)Lgj/s;

    move-result-object p1

    invoke-virtual {p1, p0}, Lgj/s;->f(Ljava/lang/Enum;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public e(Lnet/time4j/base/g;)Z
    .locals 5

    .line 1
    invoke-interface {p1}, Lnet/time4j/base/g;->q()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget-object v0, Lnet/time4j/z;->k:Lnet/time4j/z;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    const/16 v2, 0x18

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/16 v4, 0xc

    .line 12
    .line 13
    if-ne p0, v0, :cond_0

    .line 14
    .line 15
    if-lt p1, v4, :cond_2

    .line 16
    .line 17
    if-ne p1, v2, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-lt p1, v4, :cond_1

    .line 21
    .line 22
    if-ge p1, v2, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v1, v3

    .line 26
    :cond_2
    :goto_0
    return v1
    .line 27
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lnet/time4j/base/g;

    invoke-virtual {p0, p1}, Lnet/time4j/z;->e(Lnet/time4j/base/g;)Z

    move-result p1

    return p1
.end method
