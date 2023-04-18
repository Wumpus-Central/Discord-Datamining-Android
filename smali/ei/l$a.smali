.class public final Lei/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lei/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lei/l$a;

.field private static final b:Lei/m;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lei/l$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lei/l$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lei/l$a;->a:Lei/l$a;

    .line 7
    .line 8
    new-instance v0, Lei/m;

    .line 9
    .line 10
    sget-object v1, Lei/g$a;->a:Lei/g$a;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x2

    .line 14
    invoke-direct {v0, v1, v2, v3, v2}, Lei/m;-><init>(Lei/g;Lei/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lei/l$a;->b:Lei/m;

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
.method public final a()Lei/m;
    .locals 1

    sget-object v0, Lei/l$a;->b:Lei/m;

    return-object v0
.end method
