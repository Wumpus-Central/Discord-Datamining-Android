.class abstract enum Lei/w$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lei/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lei/w$a$c;,
        Lei/w$a$a;,
        Lei/w$a$d;,
        Lei/w$a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lei/w$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lei/w$a;

.field public static final enum l:Lei/w$a;

.field public static final enum m:Lei/w$a;

.field public static final enum n:Lei/w$a;

.field private static final synthetic o:[Lei/w$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lei/w$a$c;

    .line 2
    .line 3
    const-string v1, "START"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lei/w$a$c;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lei/w$a;->k:Lei/w$a;

    .line 10
    .line 11
    new-instance v0, Lei/w$a$a;

    .line 12
    .line 13
    const-string v1, "ACCEPT_NULL"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lei/w$a$a;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lei/w$a;->l:Lei/w$a;

    .line 20
    .line 21
    new-instance v0, Lei/w$a$d;

    .line 22
    .line 23
    const-string v1, "UNKNOWN"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lei/w$a$d;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lei/w$a;->m:Lei/w$a;

    .line 30
    .line 31
    new-instance v0, Lei/w$a$b;

    .line 32
    .line 33
    const-string v1, "NOT_NULL"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lei/w$a$b;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lei/w$a;->n:Lei/w$a;

    .line 40
    .line 41
    invoke-static {}, Lei/w$a;->a()[Lei/w$a;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lei/w$a;->o:[Lei/w$a;

    .line 46
    .line 47
    return-void
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

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lei/w$a;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic a()[Lei/w$a;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lei/w$a;

    const/4 v1, 0x0

    sget-object v2, Lei/w$a;->k:Lei/w$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lei/w$a;->l:Lei/w$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lei/w$a;->m:Lei/w$a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lei/w$a;->n:Lei/w$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lei/w$a;
    .locals 1

    const-class v0, Lei/w$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lei/w$a;

    return-object p0
.end method

.method public static values()[Lei/w$a;
    .locals 1

    sget-object v0, Lei/w$a;->o:[Lei/w$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lei/w$a;

    return-object v0
.end method


# virtual methods
.method public abstract b(Ldi/v1;)Lei/w$a;
.end method

.method protected final c(Ldi/v1;)Lei/w$a;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ldi/g0;->O0()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object p1, Lei/w$a;->l:Lei/w$a;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v0, p1, Ldi/p;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    move-object v0, p1

    .line 20
    check-cast v0, Ldi/p;

    .line 21
    .line 22
    invoke-virtual {v0}, Ldi/p;->Z0()Ldi/o0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    instance-of v0, v0, Ldi/w0;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    sget-object p1, Lei/w$a;->n:Lei/w$a;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    instance-of v0, p1, Ldi/w0;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    sget-object p1, Lei/w$a;->m:Lei/w$a;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    sget-object v0, Lei/o;->a:Lei/o;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lei/o;->a(Ldi/v1;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    sget-object p1, Lei/w$a;->n:Lei/w$a;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    sget-object p1, Lei/w$a;->m:Lei/w$a;

    .line 52
    .line 53
    :goto_0
    return-object p1
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
