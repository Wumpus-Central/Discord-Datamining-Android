.class public abstract enum Lnet/time4j/g;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lnet/time4j/v;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/time4j/g;",
        ">;",
        "Lnet/time4j/v;"
    }
.end annotation


# static fields
.field public static final enum k:Lnet/time4j/g;

.field public static final enum l:Lnet/time4j/g;

.field public static final enum m:Lnet/time4j/g;

.field public static final enum n:Lnet/time4j/g;

.field public static final enum o:Lnet/time4j/g;

.field public static final enum p:Lnet/time4j/g;

.field private static final q:[J

.field private static final synthetic r:[Lnet/time4j/g;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Lnet/time4j/g$a;

    .line 2
    .line 3
    const-string v1, "HOURS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/time4j/g$a;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/time4j/g;->k:Lnet/time4j/g;

    .line 10
    .line 11
    new-instance v1, Lnet/time4j/g$b;

    .line 12
    .line 13
    const-string v3, "MINUTES"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/time4j/g$b;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/time4j/g;->l:Lnet/time4j/g;

    .line 20
    .line 21
    new-instance v3, Lnet/time4j/g$c;

    .line 22
    .line 23
    const-string v5, "SECONDS"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lnet/time4j/g$c;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lnet/time4j/g;->m:Lnet/time4j/g;

    .line 30
    .line 31
    new-instance v5, Lnet/time4j/g$d;

    .line 32
    .line 33
    const-string v7, "MILLIS"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lnet/time4j/g$d;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lnet/time4j/g;->n:Lnet/time4j/g;

    .line 40
    .line 41
    new-instance v7, Lnet/time4j/g$e;

    .line 42
    .line 43
    const-string v9, "MICROS"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10}, Lnet/time4j/g$e;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lnet/time4j/g;->o:Lnet/time4j/g;

    .line 50
    .line 51
    new-instance v9, Lnet/time4j/g$f;

    .line 52
    .line 53
    const-string v11, "NANOS"

    .line 54
    .line 55
    const/4 v12, 0x5

    .line 56
    invoke-direct {v9, v11, v12}, Lnet/time4j/g$f;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v9, Lnet/time4j/g;->p:Lnet/time4j/g;

    .line 60
    .line 61
    const/4 v11, 0x6

    .line 62
    new-array v13, v11, [Lnet/time4j/g;

    .line 63
    .line 64
    aput-object v0, v13, v2

    .line 65
    .line 66
    aput-object v1, v13, v4

    .line 67
    .line 68
    aput-object v3, v13, v6

    .line 69
    .line 70
    aput-object v5, v13, v8

    .line 71
    .line 72
    aput-object v7, v13, v10

    .line 73
    .line 74
    aput-object v9, v13, v12

    .line 75
    .line 76
    sput-object v13, Lnet/time4j/g;->r:[Lnet/time4j/g;

    .line 77
    .line 78
    new-array v0, v11, [J

    .line 79
    .line 80
    fill-array-data v0, :array_0

    .line 81
    .line 82
    .line 83
    sput-object v0, Lnet/time4j/g;->q:[J

    .line 84
    .line 85
    return-void

    .line 86
    nop

    .line 87
    :array_0
    .array-data 8
        0x1
        0x3c
        0xe10
        0x36ee80
        0xd693a400L
        0x34630b8a000L
    .end array-data
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

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILnet/time4j/g$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lnet/time4j/g;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/time4j/g;
    .locals 1

    const-class v0, Lnet/time4j/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/time4j/g;

    return-object p0
.end method

.method public static values()[Lnet/time4j/g;
    .locals 1

    sget-object v0, Lnet/time4j/g;->r:[Lnet/time4j/g;

    invoke-virtual {v0}, [Lnet/time4j/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/time4j/g;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c(Lfj/k0;Lfj/k0;)J
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/k0<",
            "-",
            "Lnet/time4j/g;",
            "TT;>;>(TT;TT;)J"
        }
    .end annotation

    invoke-virtual {p1, p2, p0}, Lfj/k0;->N(Lfj/k0;Ljava/lang/Object;)J

    move-result-wide p1

    return-wide p1
.end method
