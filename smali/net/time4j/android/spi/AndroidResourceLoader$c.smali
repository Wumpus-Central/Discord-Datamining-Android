.class final Lnet/time4j/android/spi/AndroidResourceLoader$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/android/spi/AndroidResourceLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# static fields
.field private static final a:Llj/c;

.field private static final b:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Lgj/i;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Lgj/y;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Lgj/u;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Llj/c;

    .line 2
    .line 3
    invoke-direct {v0}, Llj/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lnet/time4j/android/spi/AndroidResourceLoader$c;->a:Llj/c;

    .line 7
    .line 8
    sget-object v1, Llj/f;->d:Llj/f;

    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sput-object v1, Lnet/time4j/android/spi/AndroidResourceLoader$c;->b:Ljava/lang/Iterable;

    .line 15
    .line 16
    new-instance v1, Llj/i;

    .line 17
    .line 18
    invoke-direct {v1}, Llj/i;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sput-object v1, Lnet/time4j/android/spi/AndroidResourceLoader$c;->c:Ljava/lang/Iterable;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    new-array v1, v1, [Lgj/u;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    aput-object v0, v1, v2

    .line 32
    .line 33
    new-instance v0, Lnet/time4j/calendar/service/b;

    .line 34
    .line 35
    invoke-direct {v0}, Lnet/time4j/calendar/service/b;-><init>()V

    .line 36
    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    aput-object v0, v1, v2

    .line 40
    .line 41
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lnet/time4j/android/spi/AndroidResourceLoader$c;->d:Ljava/lang/Iterable;

    .line 50
    .line 51
    return-void
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

.method static synthetic a()Llj/c;
    .locals 1

    sget-object v0, Lnet/time4j/android/spi/AndroidResourceLoader$c;->a:Llj/c;

    return-object v0
.end method

.method static synthetic b()Ljava/lang/Iterable;
    .locals 1

    sget-object v0, Lnet/time4j/android/spi/AndroidResourceLoader$c;->b:Ljava/lang/Iterable;

    return-object v0
.end method

.method static synthetic c()Ljava/lang/Iterable;
    .locals 1

    sget-object v0, Lnet/time4j/android/spi/AndroidResourceLoader$c;->c:Ljava/lang/Iterable;

    return-object v0
.end method

.method static synthetic d()Ljava/lang/Iterable;
    .locals 1

    sget-object v0, Lnet/time4j/android/spi/AndroidResourceLoader$c;->d:Ljava/lang/Iterable;

    return-object v0
.end method
