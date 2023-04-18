.class public final Luh/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luh/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Luh/f$a;

.field private static final b:Luh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Luh/f$a;

    .line 2
    .line 3
    invoke-direct {v0}, Luh/f$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Luh/f$a;->a:Luh/f$a;

    .line 7
    .line 8
    new-instance v0, Luh/a;

    .line 9
    .line 10
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Luh/a;-><init>(Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Luh/f$a;->b:Luh/a;

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
.method public final a()Luh/a;
    .locals 1

    sget-object v0, Luh/f$a;->b:Luh/a;

    return-object v0
.end method
