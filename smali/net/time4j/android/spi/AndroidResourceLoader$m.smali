.class final Lnet/time4j/android/spi/AndroidResourceLoader$m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/android/spi/AndroidResourceLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "m"
.end annotation


# static fields
.field private static final a:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Lnet/time4j/tz/r;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Lnet/time4j/tz/s;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Lmj/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnj/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lnj/a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lnet/time4j/android/spi/AndroidResourceLoader$m;->a:Ljava/lang/Iterable;

    .line 11
    .line 12
    new-instance v1, Lnj/b;

    .line 13
    .line 14
    invoke-direct {v1}, Lnj/b;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sput-object v1, Lnet/time4j/android/spi/AndroidResourceLoader$m;->b:Ljava/lang/Iterable;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lnet/time4j/tz/r;

    .line 38
    .line 39
    instance-of v2, v1, Lmj/c;

    .line 40
    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    const-class v0, Lmj/c;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lmj/c;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 v0, 0x0

    .line 53
    :goto_0
    if-nez v0, :cond_2

    .line 54
    .line 55
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lnet/time4j/android/spi/AndroidResourceLoader$m;->c:Ljava/lang/Iterable;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Lnet/time4j/android/spi/AndroidResourceLoader$m;->c:Ljava/lang/Iterable;

    .line 67
    .line 68
    :goto_1
    return-void
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

.method static synthetic a()Ljava/lang/Iterable;
    .locals 1

    sget-object v0, Lnet/time4j/android/spi/AndroidResourceLoader$m;->a:Ljava/lang/Iterable;

    return-object v0
.end method

.method static synthetic b()Ljava/lang/Iterable;
    .locals 1

    sget-object v0, Lnet/time4j/android/spi/AndroidResourceLoader$m;->b:Ljava/lang/Iterable;

    return-object v0
.end method

.method static synthetic c()Ljava/lang/Iterable;
    .locals 1

    sget-object v0, Lnet/time4j/android/spi/AndroidResourceLoader$m;->c:Ljava/lang/Iterable;

    return-object v0
.end method
