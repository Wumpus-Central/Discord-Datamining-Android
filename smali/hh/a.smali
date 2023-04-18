.class public final Lhh/a;
.super Lih/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhh/a$a;
    }
.end annotation


# static fields
.field public static final g:Lhh/a$a;

.field public static final h:Lhh/a;

.field public static final i:Lhh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lhh/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lhh/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lhh/a;->g:Lhh/a$a;

    .line 8
    .line 9
    new-instance v0, Lhh/a;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    new-array v1, v1, [I

    .line 13
    .line 14
    fill-array-data v1, :array_0

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Lhh/a;-><init>([I)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lhh/a;->h:Lhh/a;

    .line 21
    .line 22
    new-instance v0, Lhh/a;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    new-array v1, v1, [I

    .line 26
    .line 27
    invoke-direct {v0, v1}, Lhh/a;-><init>([I)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lhh/a;->i:Lhh/a;

    .line 31
    .line 32
    return-void

    .line 33
    :array_0
    .array-data 4
        0x1
        0x0
        0x7
    .end array-data
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

.method public varargs constructor <init>([I)V
    .locals 1

    .line 1
    const-string v0, "numbers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Lih/a;-><init>([I)V

    .line 12
    .line 13
    .line 14
    return-void
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


# virtual methods
.method public h()Z
    .locals 1

    sget-object v0, Lhh/a;->h:Lhh/a;

    invoke-virtual {p0, v0}, Lih/a;->f(Lih/a;)Z

    move-result v0

    return v0
.end method
