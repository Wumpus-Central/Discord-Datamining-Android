.class public final Lvg/d0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvg/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lvg/d0$a;

.field private static final b:Lvg/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lvg/d0$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lvg/d0$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lvg/d0$a;->a:Lvg/d0$a;

    .line 7
    .line 8
    new-instance v0, Lvg/e0;

    .line 9
    .line 10
    invoke-static {}, Lmf/s;->h()Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Lvg/e0;-><init>(Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lvg/d0$a;->b:Lvg/d0;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lvg/d0;
    .locals 1

    sget-object v0, Lvg/d0$a;->b:Lvg/d0;

    return-object v0
.end method
