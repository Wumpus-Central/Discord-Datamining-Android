.class public final Lrg/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrg/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lrg/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/ClassLoader;)Lrg/k;
    .locals 8

    .line 1
    const-string v0, "classLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lrg/g;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lrg/g;-><init>(Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Leh/f;->b:Leh/f$a;

    .line 12
    .line 13
    new-instance v3, Lrg/g;

    .line 14
    .line 15
    const-class v2, Lkotlin/Unit;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v4, "Unit::class.java.classLoader"

    .line 22
    .line 23
    invoke-static {v2, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v3, v2}, Lrg/g;-><init>(Ljava/lang/ClassLoader;)V

    .line 27
    .line 28
    .line 29
    new-instance v4, Lrg/d;

    .line 30
    .line 31
    invoke-direct {v4, p1}, Lrg/d;-><init>(Ljava/lang/ClassLoader;)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v5, "runtime module for "

    .line 40
    .line 41
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    sget-object v6, Lrg/j;->b:Lrg/j;

    .line 52
    .line 53
    sget-object v7, Lrg/l;->a:Lrg/l;

    .line 54
    .line 55
    move-object v2, v0

    .line 56
    invoke-virtual/range {v1 .. v7}, Leh/f$a;->a(Leh/p;Leh/p;Lvg/p;Ljava/lang/String;Lzh/r;Lbh/b;)Leh/f$a$a;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v1, Lrg/k;

    .line 61
    .line 62
    invoke-virtual {p1}, Leh/f$a$a;->a()Leh/f;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, Leh/f;->a()Lzh/k;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    new-instance v3, Lrg/a;

    .line 71
    .line 72
    invoke-virtual {p1}, Leh/f$a$a;->b()Leh/h;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-direct {v3, p1, v0}, Lrg/a;-><init>(Leh/h;Lrg/g;)V

    .line 77
    .line 78
    .line 79
    const/4 p1, 0x0

    .line 80
    invoke-direct {v1, v2, v3, p1}, Lrg/k;-><init>(Lzh/k;Lrg/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 81
    .line 82
    .line 83
    return-object v1
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method
