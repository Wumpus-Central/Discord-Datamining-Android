.class public final enum Lnet/time4j/calendar/k;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lfj/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/time4j/calendar/k$d;,
        Lnet/time4j/calendar/k$e;,
        Lnet/time4j/calendar/k$c;,
        Lnet/time4j/calendar/k$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/time4j/calendar/k;",
        ">;",
        "Lfj/i;"
    }
.end annotation


# static fields
.field public static final enum m:Lnet/time4j/calendar/k;

.field private static final synthetic n:[Lnet/time4j/calendar/k;


# instance fields
.field private final transient k:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Lnet/time4j/calendar/k;",
            ">;"
        }
    .end annotation
.end field

.field private final transient l:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/time4j/calendar/k;

    .line 2
    .line 3
    const-string v1, "DANGI"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/time4j/calendar/k;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/time4j/calendar/k;->m:Lnet/time4j/calendar/k;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    new-array v1, v1, [Lnet/time4j/calendar/k;

    .line 13
    .line 14
    aput-object v0, v1, v2

    .line 15
    .line 16
    sput-object v1, Lnet/time4j/calendar/k;->n:[Lnet/time4j/calendar/k;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
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

    .line 2
    .line 3
    .line 4
    new-instance p1, Lnet/time4j/calendar/k$b;

    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-direct {p1, p2}, Lnet/time4j/calendar/k$b;-><init>(Lnet/time4j/calendar/k$a;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lnet/time4j/calendar/k;->k:Lfj/p;

    .line 11
    .line 12
    new-instance p1, Lnet/time4j/calendar/k$e;

    .line 13
    .line 14
    invoke-direct {p1, p2}, Lnet/time4j/calendar/k$e;-><init>(Lnet/time4j/calendar/k$a;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lnet/time4j/calendar/k;->l:Lfj/p;

    .line 18
    .line 19
    return-void
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
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/time4j/calendar/k;
    .locals 1

    const-class v0, Lnet/time4j/calendar/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/time4j/calendar/k;

    return-object p0
.end method

.method public static values()[Lnet/time4j/calendar/k;
    .locals 1

    sget-object v0, Lnet/time4j/calendar/k;->n:[Lnet/time4j/calendar/k;

    invoke-virtual {v0}, [Lnet/time4j/calendar/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/time4j/calendar/k;

    return-object v0
.end method


# virtual methods
.method a()Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/p<",
            "Lnet/time4j/calendar/k;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/calendar/k;->k:Lfj/p;

    return-object v0
.end method

.method public b(Ljava/util/Locale;Lgj/v;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "dangi"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lgj/b;->c(Ljava/lang/String;Ljava/util/Locale;)Lgj/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1, p2}, Lgj/b;->b(Lgj/v;)Lgj/s;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1, p0}, Lgj/s;->f(Ljava/lang/Enum;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method c()Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/calendar/k;->l:Lfj/p;

    return-object v0
.end method
